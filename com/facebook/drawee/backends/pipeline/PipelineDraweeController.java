package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.datasource.DataSource;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.backends.pipeline.debug.DebugOverlayImageOriginColor;
import com.facebook.drawee.backends.pipeline.debug.DebugOverlayImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ForwardingImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ImageOriginRequestListener;
import com.facebook.drawee.backends.pipeline.info.ImageOriginUtils;
import com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener;
import com.facebook.drawee.backends.pipeline.info.ImagePerfMonitor;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.debug.DebugControllerOverlayDrawable;
import com.facebook.drawee.debug.listener.ImageLoadingTimeControllerListener;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.fresco.ui.common.MultiUriHelper;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.ForwardingRequestListener;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PipelineDraweeController extends AbstractDraweeController<CloseableReference<CloseableImage>, ImageInfo> {
    private static final Class<?> TAG = PipelineDraweeController.class;
    private CacheKey mCacheKey;
    @Nullable
    private ImmutableList<DrawableFactory> mCustomDrawableFactories;
    private Supplier<DataSource<CloseableReference<CloseableImage>>> mDataSourceSupplier;
    private DebugOverlayImageOriginListener mDebugOverlayImageOriginListener;
    private final DrawableFactory mDefaultDrawableFactory;
    private boolean mDrawDebugOverlay;
    @Nullable
    private ImageRequest[] mFirstAvailableImageRequests;
    @Nullable
    private final ImmutableList<DrawableFactory> mGlobalDrawableFactories;
    @GuardedBy("this")
    @Nullable
    private ImageOriginListener mImageOriginListener;
    @Nullable
    private ImagePerfMonitor mImagePerfMonitor;
    @Nullable
    private ImageRequest mImageRequest;
    @Nullable
    private ImageRequest mLowResImageRequest;
    @Nullable
    private final MemoryCache<CacheKey, CloseableImage> mMemoryCache;
    @GuardedBy("this")
    @Nullable
    private Set<RequestListener> mRequestListeners;
    private final Resources mResources;

    public PipelineDraweeController(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory animatedDrawableFactory, Executor uiThreadExecutor, @Nullable MemoryCache<CacheKey, CloseableImage> memoryCache, @Nullable ImmutableList<DrawableFactory> globalDrawableFactories) {
        super(deferredReleaser, uiThreadExecutor, null, null);
        this.mResources = resources;
        this.mDefaultDrawableFactory = new DefaultDrawableFactory(resources, animatedDrawableFactory);
        this.mGlobalDrawableFactories = globalDrawableFactories;
        this.mMemoryCache = memoryCache;
    }

    private void init(Supplier<DataSource<CloseableReference<CloseableImage>>> dataSourceSupplier) {
        this.mDataSourceSupplier = dataSourceSupplier;
        maybeUpdateDebugOverlay(null);
    }

    @Nullable
    private Drawable maybeCreateDrawableFromFactories(@Nullable ImmutableList<DrawableFactory> drawableFactories, CloseableImage closeableImage) {
        Drawable createDrawable;
        if (drawableFactories == null) {
            return null;
        }
        Iterator<DrawableFactory> it = drawableFactories.iterator();
        while (it.hasNext()) {
            DrawableFactory next = it.next();
            if (next.supportsImageType(closeableImage) && (createDrawable = next.createDrawable(closeableImage)) != null) {
                return createDrawable;
            }
        }
        return null;
    }

    private void maybeUpdateDebugOverlay(@Nullable CloseableImage image) {
        if (this.mDrawDebugOverlay) {
            if (getControllerOverlay() == null) {
                DebugControllerOverlayDrawable debugControllerOverlayDrawable = new DebugControllerOverlayDrawable();
                ImageLoadingTimeControllerListener imageLoadingTimeControllerListener = new ImageLoadingTimeControllerListener(debugControllerOverlayDrawable);
                this.mDebugOverlayImageOriginListener = new DebugOverlayImageOriginListener();
                addControllerListener(imageLoadingTimeControllerListener);
                setControllerOverlay(debugControllerOverlayDrawable);
            }
            if (this.mImageOriginListener == null) {
                addImageOriginListener(this.mDebugOverlayImageOriginListener);
            }
            if (getControllerOverlay() instanceof DebugControllerOverlayDrawable) {
                updateDebugOverlay(image, (DebugControllerOverlayDrawable) getControllerOverlay());
            }
        }
    }

    public synchronized void addImageOriginListener(ImageOriginListener imageOriginListener) {
        ImageOriginListener imageOriginListener2 = this.mImageOriginListener;
        if (imageOriginListener2 instanceof ForwardingImageOriginListener) {
            ((ForwardingImageOriginListener) imageOriginListener2).addImageOriginListener(imageOriginListener);
        } else if (imageOriginListener2 != null) {
            this.mImageOriginListener = new ForwardingImageOriginListener(imageOriginListener2, imageOriginListener);
        } else {
            this.mImageOriginListener = imageOriginListener;
        }
    }

    public synchronized void addRequestListener(RequestListener requestListener) {
        if (this.mRequestListeners == null) {
            this.mRequestListeners = new HashSet();
        }
        this.mRequestListeners.add(requestListener);
    }

    public void clearImageOriginListeners() {
        synchronized (this) {
            this.mImageOriginListener = null;
        }
    }

    public CacheKey getCacheKey() {
        return this.mCacheKey;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public DataSource<CloseableReference<CloseableImage>> getDataSource() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("PipelineDraweeController#getDataSource");
        }
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        DataSource<CloseableReference<CloseableImage>> dataSource = this.mDataSourceSupplier.get();
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        return dataSource;
    }

    public Supplier<DataSource<CloseableReference<CloseableImage>>> getDataSourceSupplier() {
        return this.mDataSourceSupplier;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    @Nullable
    public Uri getMainUri() {
        return MultiUriHelper.getMainUri(this.mImageRequest, this.mLowResImageRequest, this.mFirstAvailableImageRequests, ImageRequest.REQUEST_TO_URI_FN);
    }

    @Nullable
    public synchronized RequestListener getRequestListener() {
        ImageOriginRequestListener imageOriginRequestListener = this.mImageOriginListener != null ? new ImageOriginRequestListener(getId(), this.mImageOriginListener) : null;
        Set<RequestListener> set = this.mRequestListeners;
        if (set != null) {
            ForwardingRequestListener forwardingRequestListener = new ForwardingRequestListener(set);
            if (imageOriginRequestListener != null) {
                forwardingRequestListener.addRequestListener(imageOriginRequestListener);
            }
            return forwardingRequestListener;
        }
        return imageOriginRequestListener;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public void initialize(Supplier<DataSource<CloseableReference<CloseableImage>>> dataSourceSupplier, String id, CacheKey cacheKey, Object callerContext, @Nullable ImmutableList<DrawableFactory> customDrawableFactories, @Nullable ImageOriginListener imageOriginListener) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("PipelineDraweeController#initialize");
        }
        super.initialize(id, callerContext);
        init(dataSourceSupplier);
        this.mCacheKey = cacheKey;
        setCustomDrawableFactories(customDrawableFactories);
        clearImageOriginListeners();
        maybeUpdateDebugOverlay(null);
        addImageOriginListener(imageOriginListener);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    public synchronized void initializePerformanceMonitoring(@Nullable ImagePerfDataListener imagePerfDataListener, AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<CloseableImage>, ImageInfo> builder, Supplier<Boolean> asyncLogging) {
        ImagePerfMonitor imagePerfMonitor = this.mImagePerfMonitor;
        if (imagePerfMonitor != null) {
            imagePerfMonitor.reset();
        }
        if (imagePerfDataListener != null) {
            if (this.mImagePerfMonitor == null) {
                this.mImagePerfMonitor = new ImagePerfMonitor(AwakeTimeSinceBootClock.get(), this, asyncLogging);
            }
            this.mImagePerfMonitor.addImagePerfDataListener(imagePerfDataListener);
            this.mImagePerfMonitor.setEnabled(true);
            this.mImagePerfMonitor.updateImageRequestData(builder);
        }
        this.mImageRequest = builder.getImageRequest();
        this.mFirstAvailableImageRequests = builder.getFirstAvailableImageRequests();
        this.mLowResImageRequest = builder.getLowResImageRequest();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public boolean isSameImageRequest(@Nullable DraweeController other) {
        CacheKey cacheKey = this.mCacheKey;
        if (cacheKey == null || !(other instanceof PipelineDraweeController)) {
            return false;
        }
        return Objects.equal(cacheKey, ((PipelineDraweeController) other).getCacheKey());
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public void releaseDrawable(@Nullable Drawable drawable) {
        if (drawable instanceof DrawableWithCaches) {
            ((DrawableWithCaches) drawable).dropCaches();
        }
    }

    public synchronized void removeImageOriginListener(ImageOriginListener imageOriginListener) {
        ImageOriginListener imageOriginListener2 = this.mImageOriginListener;
        if (imageOriginListener2 instanceof ForwardingImageOriginListener) {
            ((ForwardingImageOriginListener) imageOriginListener2).removeImageOriginListener(imageOriginListener);
            return;
        }
        if (imageOriginListener2 == imageOriginListener) {
            this.mImageOriginListener = null;
        }
    }

    public synchronized void removeRequestListener(RequestListener requestListener) {
        Set<RequestListener> set = this.mRequestListeners;
        if (set == null) {
            return;
        }
        set.remove(requestListener);
    }

    public void setCustomDrawableFactories(@Nullable ImmutableList<DrawableFactory> customDrawableFactories) {
        this.mCustomDrawableFactories = customDrawableFactories;
    }

    public void setDrawDebugOverlay(boolean drawDebugOverlay) {
        this.mDrawDebugOverlay = drawDebugOverlay;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController, com.facebook.drawee.interfaces.DraweeController
    public void setHierarchy(@Nullable DraweeHierarchy hierarchy) {
        super.setHierarchy(hierarchy);
        maybeUpdateDebugOverlay(null);
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public String toString() {
        return Objects.toStringHelper(this).add("super", super.toString()).add("dataSourceSupplier", this.mDataSourceSupplier).toString();
    }

    public void updateDebugOverlay(@Nullable CloseableImage image, DebugControllerOverlayDrawable debugOverlay) {
        ScaleTypeDrawable activeScaleTypeDrawable;
        debugOverlay.setControllerId(getId());
        DraweeHierarchy hierarchy = getHierarchy();
        ScalingUtils.ScaleType scaleType = null;
        if (hierarchy != null && (activeScaleTypeDrawable = ScalingUtils.getActiveScaleTypeDrawable(hierarchy.getTopLevelDrawable())) != null) {
            scaleType = activeScaleTypeDrawable.getScaleType();
        }
        debugOverlay.setScaleType(scaleType);
        int imageOrigin = this.mDebugOverlayImageOriginListener.getImageOrigin();
        debugOverlay.setOrigin(ImageOriginUtils.toString(imageOrigin), DebugOverlayImageOriginColor.getImageOriginColor(imageOrigin));
        if (image != null) {
            debugOverlay.setDimensions(image.getWidth(), image.getHeight());
            debugOverlay.setImageSize(image.getSizeInBytes());
            return;
        }
        debugOverlay.reset();
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public Drawable createDrawable(CloseableReference<CloseableImage> image) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("PipelineDraweeController#createDrawable");
            }
            Preconditions.checkState(CloseableReference.isValid(image));
            CloseableImage closeableImage = image.get();
            maybeUpdateDebugOverlay(closeableImage);
            Drawable maybeCreateDrawableFromFactories = maybeCreateDrawableFromFactories(this.mCustomDrawableFactories, closeableImage);
            if (maybeCreateDrawableFromFactories != null) {
                return maybeCreateDrawableFromFactories;
            }
            Drawable maybeCreateDrawableFromFactories2 = maybeCreateDrawableFromFactories(this.mGlobalDrawableFactories, closeableImage);
            if (maybeCreateDrawableFromFactories2 != null) {
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return maybeCreateDrawableFromFactories2;
            }
            Drawable createDrawable = this.mDefaultDrawableFactory.createDrawable(closeableImage);
            if (createDrawable != null) {
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return createDrawable;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + closeableImage);
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.drawee.controller.AbstractDraweeController
    @Nullable
    public CloseableReference<CloseableImage> getCachedImage() {
        CacheKey cacheKey;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("PipelineDraweeController#getCachedImage");
        }
        try {
            MemoryCache<CacheKey, CloseableImage> memoryCache = this.mMemoryCache;
            if (memoryCache != null && (cacheKey = this.mCacheKey) != null) {
                CloseableReference<CloseableImage> closeableReference = memoryCache.get(cacheKey);
                if (closeableReference != null && !closeableReference.get().getQualityInfo().isOfFullQuality()) {
                    closeableReference.close();
                    return null;
                }
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                return closeableReference;
            }
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            return null;
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public int getImageHash(@Nullable CloseableReference<CloseableImage> image) {
        if (image != null) {
            return image.getValueHash();
        }
        return 0;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public ImageInfo getImageInfo(CloseableReference<CloseableImage> image) {
        Preconditions.checkState(CloseableReference.isValid(image));
        return image.get();
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    @Nullable
    public Map<String, Object> obtainExtrasFromImage(ImageInfo info) {
        if (info == null) {
            return null;
        }
        return info.getExtras();
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public void onImageLoadedFromCacheImmediately(String id, CloseableReference<CloseableImage> cachedImage) {
        super.onImageLoadedFromCacheImmediately(id, (String) cachedImage);
        synchronized (this) {
            ImageOriginListener imageOriginListener = this.mImageOriginListener;
            if (imageOriginListener != null) {
                imageOriginListener.onImageLoaded(id, 6, true, "PipelineDraweeController");
            }
        }
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeController
    public void releaseImage(@Nullable CloseableReference<CloseableImage> image) {
        CloseableReference.closeSafely(image);
    }
}
