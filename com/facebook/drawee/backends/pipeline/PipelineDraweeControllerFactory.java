package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PipelineDraweeControllerFactory {
    private DrawableFactory mAnimatedDrawableFactory;
    @Nullable
    private Supplier<Boolean> mDebugOverlayEnabledSupplier;
    private DeferredReleaser mDeferredReleaser;
    @Nullable
    private ImmutableList<DrawableFactory> mDrawableFactories;
    @Nullable
    private MemoryCache<CacheKey, CloseableImage> mMemoryCache;
    private Resources mResources;
    private Executor mUiThreadExecutor;

    public void init(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory animatedDrawableFactory, Executor uiThreadExecutor, MemoryCache<CacheKey, CloseableImage> memoryCache, @Nullable ImmutableList<DrawableFactory> drawableFactories, @Nullable Supplier<Boolean> debugOverlayEnabledSupplier) {
        this.mResources = resources;
        this.mDeferredReleaser = deferredReleaser;
        this.mAnimatedDrawableFactory = animatedDrawableFactory;
        this.mUiThreadExecutor = uiThreadExecutor;
        this.mMemoryCache = memoryCache;
        this.mDrawableFactories = drawableFactories;
        this.mDebugOverlayEnabledSupplier = debugOverlayEnabledSupplier;
    }

    public PipelineDraweeController internalCreateController(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory animatedDrawableFactory, Executor uiThreadExecutor, @Nullable MemoryCache<CacheKey, CloseableImage> memoryCache, @Nullable ImmutableList<DrawableFactory> drawableFactories) {
        return new PipelineDraweeController(resources, deferredReleaser, animatedDrawableFactory, uiThreadExecutor, memoryCache, drawableFactories);
    }

    public PipelineDraweeController newController() {
        PipelineDraweeController internalCreateController = internalCreateController(this.mResources, this.mDeferredReleaser, this.mAnimatedDrawableFactory, this.mUiThreadExecutor, this.mMemoryCache, this.mDrawableFactories);
        Supplier<Boolean> supplier = this.mDebugOverlayEnabledSupplier;
        if (supplier != null) {
            internalCreateController.setDrawDebugOverlay(supplier.get().booleanValue());
        }
        return internalCreateController;
    }
}
