package com.facebook.drawee.controller;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.RetryManager;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.gestures.GestureDetector;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.fresco.middleware.MiddlewareUtils;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import com.facebook.fresco.ui.common.LoggingListener;
import com.facebook.fresco.ui.common.OnFadeListener;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.ReturnsOwnership;
import com.umeng.analytics.pro.d;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbstractDraweeController<T, INFO> implements DraweeController, DeferredReleaser.Releasable, GestureDetector.ClickListener {
    private static final Map<String, Object> COMPONENT_EXTRAS = ImmutableMap.of("component_tag", "drawee");
    private static final Map<String, Object> SHORTCUT_EXTRAS = ImmutableMap.of("origin", "memory_bitmap", ProducerContext.ExtraKeys.ORIGIN_SUBCATEGORY, "shortcut");
    private static final Class<?> TAG = AbstractDraweeController.class;
    private Object mCallerContext;
    @Nullable
    private String mContentDescription;
    @Nullable
    public ControllerListener<INFO> mControllerListener;
    @Nullable
    private Drawable mControllerOverlay;
    @Nullable
    private ControllerViewportVisibilityListener mControllerViewportVisibilityListener;
    @Nullable
    private DataSource<T> mDataSource;
    private final DeferredReleaser mDeferredReleaser;
    @Nullable
    public Drawable mDrawable;
    @Nullable
    private T mFetchedImage;
    @Nullable
    private GestureDetector mGestureDetector;
    private boolean mHasFetchFailed;
    private String mId;
    private boolean mIsAttached;
    private boolean mIsRequestSubmitted;
    private boolean mIsVisibleInViewportHint;
    @Nullable
    public LoggingListener mLoggingListener;
    private boolean mRetainImageOnFailure;
    @Nullable
    private RetryManager mRetryManager;
    @Nullable
    private SettableDraweeHierarchy mSettableDraweeHierarchy;
    private final Executor mUiThreadImmediateExecutor;
    private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();
    public ForwardingControllerListener2<INFO> mControllerListener2 = new ForwardingControllerListener2<>();
    private boolean mJustConstructed = true;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InternalForwardingListener<INFO> extends ForwardingControllerListener<INFO> {
        private InternalForwardingListener() {
        }

        public static <INFO> InternalForwardingListener<INFO> createInternal(ControllerListener<? super INFO> listener1, ControllerListener<? super INFO> listener2) {
        }
    }

    public AbstractDraweeController(DeferredReleaser deferredReleaser, Executor uiThreadImmediateExecutor, String id, Object callerContext) {
        this.mDeferredReleaser = deferredReleaser;
        this.mUiThreadImmediateExecutor = uiThreadImmediateExecutor;
        init(id, callerContext);
    }

    @Nullable
    private Rect getDimensions() {
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy == null) {
            return null;
        }
        return settableDraweeHierarchy.getBounds();
    }

    private synchronized void init(String id, Object callerContext) {
        DeferredReleaser deferredReleaser;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractDraweeController#init");
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
        if (!this.mJustConstructed && (deferredReleaser = this.mDeferredReleaser) != null) {
            deferredReleaser.cancelDeferredRelease(this);
        }
        this.mIsAttached = false;
        this.mIsVisibleInViewportHint = false;
        releaseFetch();
        this.mRetainImageOnFailure = false;
        RetryManager retryManager = this.mRetryManager;
        if (retryManager != null) {
            retryManager.init();
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.init();
            this.mGestureDetector.setClickListener(this);
        }
        ControllerListener<INFO> controllerListener = this.mControllerListener;
        if (controllerListener instanceof InternalForwardingListener) {
            ((InternalForwardingListener) controllerListener).clearListeners();
        } else {
            this.mControllerListener = null;
        }
        this.mControllerViewportVisibilityListener = null;
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.reset();
            this.mSettableDraweeHierarchy.setControllerOverlay(null);
            this.mSettableDraweeHierarchy = null;
        }
        this.mControllerOverlay = null;
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.mId, id);
        }
        this.mId = id;
        this.mCallerContext = callerContext;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        if (this.mLoggingListener != null) {
            setUpLoggingListener();
        }
    }

    private boolean isExpectedDataSource(String id, DataSource<T> dataSource) {
        if (dataSource == null && this.mDataSource == null) {
            return true;
        }
        return id.equals(this.mId) && dataSource == this.mDataSource && this.mIsRequestSubmitted;
    }

    private void logMessageAndFailure(String messageAndMethod, Throwable throwable) {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.mId, messageAndMethod, throwable);
        }
    }

    private void logMessageAndImage(String messageAndMethod, T image) {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.mId, messageAndMethod, getImageClass(image), Integer.valueOf(getImageHash(image)));
        }
    }

    private ControllerListener2.Extras obtainExtras(@Nullable Map<String, Object> datasourceExtras, @Nullable Map<String, Object> imageExtras, @Nullable Uri mainUri) {
        String str;
        PointF pointF;
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy instanceof GenericDraweeHierarchy) {
            GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) settableDraweeHierarchy;
            String valueOf = String.valueOf(genericDraweeHierarchy.getActualImageScaleType());
            pointF = genericDraweeHierarchy.getActualImageFocusPoint();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return MiddlewareUtils.obtainExtras(COMPONENT_EXTRAS, SHORTCUT_EXTRAS, datasourceExtras, getDimensions(), str, pointF, imageExtras, getCallerContext(), mainUri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFailureInternal(String id, DataSource<T> dataSource, Throwable throwable, boolean isFinished) {
        Drawable drawable;
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractDraweeController#onFailureInternal");
        }
        if (!isExpectedDataSource(id, dataSource)) {
            logMessageAndFailure("ignore_old_datasource @ onFailure", throwable);
            dataSource.close();
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
                return;
            }
            return;
        }
        this.mEventTracker.recordEvent(isFinished ? DraweeEventTracker.Event.ON_DATASOURCE_FAILURE : DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT);
        if (isFinished) {
            logMessageAndFailure("final_failed @ onFailure", throwable);
            this.mDataSource = null;
            this.mHasFetchFailed = true;
            SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
            if (settableDraweeHierarchy != null) {
                if (this.mRetainImageOnFailure && (drawable = this.mDrawable) != null) {
                    settableDraweeHierarchy.setImage(drawable, 1.0f, true);
                } else if (shouldRetryOnTap()) {
                    settableDraweeHierarchy.setRetry(throwable);
                } else {
                    settableDraweeHierarchy.setFailure(throwable);
                }
            }
            reportFailure(throwable, dataSource);
        } else {
            logMessageAndFailure("intermediate_failed @ onFailure", throwable);
            reportIntermediateFailure(throwable);
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewResultInternal(String id, DataSource<T> dataSource, @Nullable T image, float progress, boolean isFinished, boolean wasImmediate, boolean deliverTempResult) {
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("AbstractDraweeController#onNewResultInternal");
            }
            if (!isExpectedDataSource(id, dataSource)) {
                logMessageAndImage("ignore_old_datasource @ onNewResult", image);
                releaseImage(image);
                dataSource.close();
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                    return;
                }
                return;
            }
            this.mEventTracker.recordEvent(isFinished ? DraweeEventTracker.Event.ON_DATASOURCE_RESULT : DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable createDrawable = createDrawable(image);
                T t = this.mFetchedImage;
                Drawable drawable = this.mDrawable;
                this.mFetchedImage = image;
                this.mDrawable = createDrawable;
                if (isFinished) {
                    logMessageAndImage("set_final_result @ onNewResult", image);
                    this.mDataSource = null;
                    this.mSettableDraweeHierarchy.setImage(createDrawable, 1.0f, wasImmediate);
                    reportSuccess(id, image, dataSource);
                } else if (deliverTempResult) {
                    logMessageAndImage("set_temporary_result @ onNewResult", image);
                    this.mSettableDraweeHierarchy.setImage(createDrawable, 1.0f, wasImmediate);
                    reportSuccess(id, image, dataSource);
                } else {
                    logMessageAndImage("set_intermediate_result @ onNewResult", image);
                    this.mSettableDraweeHierarchy.setImage(createDrawable, progress, wasImmediate);
                    reportIntermediateSet(id, image);
                }
                if (drawable != null && drawable != createDrawable) {
                    releaseDrawable(drawable);
                }
                if (t != null && t != image) {
                    logMessageAndImage("release_previous_result @ onNewResult", t);
                    releaseImage(t);
                }
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            } catch (Exception e2) {
                logMessageAndImage("drawable_failed @ onNewResult", image);
                releaseImage(image);
                onFailureInternal(id, dataSource, e2, isFinished);
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            }
        } catch (Throwable th) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgressUpdateInternal(String id, DataSource<T> dataSource, float progress, boolean isFinished) {
        if (!isExpectedDataSource(id, dataSource)) {
            logMessageAndFailure("ignore_old_datasource @ onProgress", null);
            dataSource.close();
        } else if (isFinished) {
        } else {
            this.mSettableDraweeHierarchy.setProgress(progress, false);
        }
    }

    private void releaseFetch() {
        Map<String, Object> map;
        boolean z = this.mIsRequestSubmitted;
        this.mIsRequestSubmitted = false;
        this.mHasFetchFailed = false;
        DataSource<T> dataSource = this.mDataSource;
        Map<String, Object> map2 = null;
        if (dataSource != null) {
            map = dataSource.getExtras();
            this.mDataSource.close();
            this.mDataSource = null;
        } else {
            map = null;
        }
        Drawable drawable = this.mDrawable;
        if (drawable != null) {
            releaseDrawable(drawable);
        }
        if (this.mContentDescription != null) {
            this.mContentDescription = null;
        }
        this.mDrawable = null;
        T t = this.mFetchedImage;
        if (t != null) {
            Map<String, Object> obtainExtrasFromImage = obtainExtrasFromImage(getImageInfo(t));
            logMessageAndImage("release", this.mFetchedImage);
            releaseImage(this.mFetchedImage);
            this.mFetchedImage = null;
            map2 = obtainExtrasFromImage;
        }
        if (z) {
            reportRelease(map, map2);
        }
    }

    private void reportFailure(Throwable throwable, @Nullable DataSource<T> dataSource) {
        ControllerListener2.Extras obtainExtras = obtainExtras(dataSource, (DataSource<T>) null, (Uri) null);
        getControllerListener().onFailure(this.mId, throwable);
        getControllerListener2().onFailure(this.mId, throwable, obtainExtras);
    }

    private void reportIntermediateFailure(Throwable throwable) {
        getControllerListener().onIntermediateImageFailed(this.mId, throwable);
        getControllerListener2().onIntermediateImageFailed(this.mId);
    }

    private void reportIntermediateSet(String id, @Nullable T image) {
        INFO imageInfo = getImageInfo(image);
        getControllerListener().onIntermediateImageSet(id, imageInfo);
        getControllerListener2().onIntermediateImageSet(id, imageInfo);
    }

    private void reportRelease(@Nullable Map<String, Object> datasourceExtras, @Nullable Map<String, Object> imageExtras) {
        getControllerListener().onRelease(this.mId);
        getControllerListener2().onRelease(this.mId, obtainExtras(datasourceExtras, imageExtras, (Uri) null));
    }

    private void reportSuccess(String id, @Nullable T image, @Nullable DataSource<T> dataSource) {
        INFO imageInfo = getImageInfo(image);
        getControllerListener().onFinalImageSet(id, imageInfo, getAnimatable());
        getControllerListener2().onFinalImageSet(id, imageInfo, obtainExtras(dataSource, (DataSource<T>) imageInfo, (Uri) null));
    }

    private void setUpLoggingListener() {
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy instanceof GenericDraweeHierarchy) {
            ((GenericDraweeHierarchy) settableDraweeHierarchy).setOnFadeListener(new OnFadeListener(this) { // from class: com.facebook.drawee.controller.AbstractDraweeController.1
                public final /* synthetic */ AbstractDraweeController this$0;

                @Override // com.facebook.fresco.ui.common.OnFadeListener
                public void onFadeFinished() {
                }

                @Override // com.facebook.fresco.ui.common.OnFadeListener
                public void onFadeStarted() {
                }

                @Override // com.facebook.fresco.ui.common.OnFadeListener
                public void onShownImmediately() {
                }
            });
        }
    }

    private boolean shouldRetryOnTap() {
        RetryManager retryManager;
        return this.mHasFetchFailed && (retryManager = this.mRetryManager) != null && retryManager.shouldRetryOnTap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addControllerListener(ControllerListener<? super INFO> controllerListener) {
        Preconditions.checkNotNull(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.mControllerListener;
        if (controllerListener2 instanceof InternalForwardingListener) {
            ((InternalForwardingListener) controllerListener2).addListener(controllerListener);
        } else if (controllerListener2 != null) {
            this.mControllerListener = InternalForwardingListener.createInternal(controllerListener2, controllerListener);
        } else {
            this.mControllerListener = controllerListener;
        }
    }

    public void addControllerListener2(ControllerListener2<INFO> controllerListener2) {
        this.mControllerListener2.addListener(controllerListener2);
    }

    public abstract Drawable createDrawable(T image);

    @Override // com.facebook.drawee.interfaces.DraweeController
    @Nullable
    public Animatable getAnimatable() {
        Drawable drawable = this.mDrawable;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    @Nullable
    public T getCachedImage() {
        return null;
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    @Nullable
    public String getContentDescription() {
        return this.mContentDescription;
    }

    public ControllerListener<INFO> getControllerListener() {
        ControllerListener<INFO> controllerListener = this.mControllerListener;
        return controllerListener == null ? BaseControllerListener.getNoOpListener() : controllerListener;
    }

    public ControllerListener2<INFO> getControllerListener2() {
        return this.mControllerListener2;
    }

    @Nullable
    public Drawable getControllerOverlay() {
        return this.mControllerOverlay;
    }

    public abstract DataSource<T> getDataSource();

    @Nullable
    public GestureDetector getGestureDetector() {
        return this.mGestureDetector;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    @Nullable
    public DraweeHierarchy getHierarchy() {
        return this.mSettableDraweeHierarchy;
    }

    public String getId() {
        return this.mId;
    }

    public String getImageClass(@Nullable T image) {
        return image != null ? image.getClass().getSimpleName() : "<null>";
    }

    public int getImageHash(@Nullable T image) {
        return System.identityHashCode(image);
    }

    @Nullable
    public abstract INFO getImageInfo(T image);

    @Nullable
    public LoggingListener getLoggingListener() {
        return this.mLoggingListener;
    }

    @Nullable
    public Uri getMainUri() {
        return null;
    }

    @ReturnsOwnership
    public RetryManager getRetryManager() {
        if (this.mRetryManager == null) {
            this.mRetryManager = new RetryManager();
        }
        return this.mRetryManager;
    }

    public void initialize(String id, Object callerContext) {
        init(id, callerContext);
        this.mJustConstructed = false;
    }

    @Nullable
    public abstract Map<String, Object> obtainExtrasFromImage(INFO info);

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void onAttach() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractDraweeController#onAttach");
        }
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.mId, this.mIsRequestSubmitted ? "request already submitted" : "request needs submit");
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        Preconditions.checkNotNull(this.mSettableDraweeHierarchy);
        this.mDeferredReleaser.cancelDeferredRelease(this);
        this.mIsAttached = true;
        if (!this.mIsRequestSubmitted) {
            submitRequest();
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    @Override // com.facebook.drawee.gestures.GestureDetector.ClickListener
    public boolean onClick() {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.mId);
        }
        if (shouldRetryOnTap()) {
            this.mRetryManager.notifyTapToRetry();
            this.mSettableDraweeHierarchy.reset();
            submitRequest();
            return true;
        }
        return false;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void onDetach() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractDraweeController#onDetach");
        }
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.mId);
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.mIsAttached = false;
        this.mDeferredReleaser.scheduleDeferredRelease(this);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    public void onImageLoadedFromCacheImmediately(String id, T cachedImage) {
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public boolean onTouchEvent(MotionEvent event) {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.mId, event);
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector == null) {
            return false;
        }
        if (gestureDetector.isCapturingGesture() || shouldHandleGesture()) {
            this.mGestureDetector.onTouchEvent(event);
            return true;
        }
        return false;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void onViewportVisibilityHint(boolean isVisibleInViewportHint) {
        ControllerViewportVisibilityListener controllerViewportVisibilityListener = this.mControllerViewportVisibilityListener;
        if (controllerViewportVisibilityListener != null) {
            if (isVisibleInViewportHint && !this.mIsVisibleInViewportHint) {
                controllerViewportVisibilityListener.onDraweeViewportEntry(this.mId);
            } else if (!isVisibleInViewportHint && this.mIsVisibleInViewportHint) {
                controllerViewportVisibilityListener.onDraweeViewportExit(this.mId);
            }
        }
        this.mIsVisibleInViewportHint = isVisibleInViewportHint;
    }

    @Override // com.facebook.drawee.components.DeferredReleaser.Releasable
    public void release() {
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        RetryManager retryManager = this.mRetryManager;
        if (retryManager != null) {
            retryManager.reset();
        }
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.reset();
        }
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.reset();
        }
        releaseFetch();
    }

    public abstract void releaseDrawable(@Nullable Drawable drawable);

    public abstract void releaseImage(@Nullable T image);

    public void removeControllerListener(ControllerListener<? super INFO> controllerListener) {
        Preconditions.checkNotNull(controllerListener);
        ControllerListener<INFO> controllerListener2 = this.mControllerListener;
        if (controllerListener2 instanceof InternalForwardingListener) {
            ((InternalForwardingListener) controllerListener2).removeListener(controllerListener);
        } else if (controllerListener2 == controllerListener) {
            this.mControllerListener = null;
        }
    }

    public void removeControllerListener2(ControllerListener2<INFO> controllerListener2) {
        this.mControllerListener2.removeListener(controllerListener2);
    }

    public void reportSubmit(DataSource<T> dataSource, @Nullable INFO info) {
        getControllerListener().onSubmit(this.mId, this.mCallerContext);
        getControllerListener2().onSubmit(this.mId, this.mCallerContext, obtainExtras(dataSource, (DataSource<T>) info, getMainUri()));
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void setContentDescription(@Nullable String contentDescription) {
        this.mContentDescription = contentDescription;
    }

    public void setControllerOverlay(@Nullable Drawable controllerOverlay) {
        this.mControllerOverlay = controllerOverlay;
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.setControllerOverlay(controllerOverlay);
        }
    }

    public void setControllerViewportVisibilityListener(@Nullable ControllerViewportVisibilityListener controllerViewportVisibilityListener) {
        this.mControllerViewportVisibilityListener = controllerViewportVisibilityListener;
    }

    public void setGestureDetector(@Nullable GestureDetector gestureDetector) {
        this.mGestureDetector = gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.setClickListener(this);
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void setHierarchy(@Nullable DraweeHierarchy hierarchy) {
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.mId, hierarchy);
        }
        this.mEventTracker.recordEvent(hierarchy != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.mIsRequestSubmitted) {
            this.mDeferredReleaser.cancelDeferredRelease(this);
            release();
        }
        SettableDraweeHierarchy settableDraweeHierarchy = this.mSettableDraweeHierarchy;
        if (settableDraweeHierarchy != null) {
            settableDraweeHierarchy.setControllerOverlay(null);
            this.mSettableDraweeHierarchy = null;
        }
        if (hierarchy != null) {
            Preconditions.checkArgument(Boolean.valueOf(hierarchy instanceof SettableDraweeHierarchy));
            SettableDraweeHierarchy settableDraweeHierarchy2 = (SettableDraweeHierarchy) hierarchy;
            this.mSettableDraweeHierarchy = settableDraweeHierarchy2;
            settableDraweeHierarchy2.setControllerOverlay(this.mControllerOverlay);
        }
        if (this.mLoggingListener != null) {
            setUpLoggingListener();
        }
    }

    public void setLoggingListener(final LoggingListener loggingListener) {
        this.mLoggingListener = loggingListener;
    }

    public void setRetainImageOnFailure(boolean enabled) {
        this.mRetainImageOnFailure = enabled;
    }

    public boolean shouldHandleGesture() {
        return shouldRetryOnTap();
    }

    public void submitRequest() {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractDraweeController#submitRequest");
        }
        T cachedImage = getCachedImage();
        if (cachedImage != null) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("AbstractDraweeController#submitRequest->cache");
            }
            this.mDataSource = null;
            this.mIsRequestSubmitted = true;
            this.mHasFetchFailed = false;
            this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
            reportSubmit(this.mDataSource, getImageInfo(cachedImage));
            onImageLoadedFromCacheImmediately(this.mId, cachedImage);
            onNewResultInternal(this.mId, this.mDataSource, cachedImage, 1.0f, true, true, true);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
                return;
            }
            return;
        }
        this.mEventTracker.recordEvent(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
        this.mSettableDraweeHierarchy.setProgress(0.0f, true);
        this.mIsRequestSubmitted = true;
        this.mHasFetchFailed = false;
        DataSource<T> dataSource = getDataSource();
        this.mDataSource = dataSource;
        reportSubmit(dataSource, null);
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.mId, Integer.valueOf(System.identityHashCode(this.mDataSource)));
        }
        this.mDataSource.subscribe(new BaseDataSubscriber<T>(this, this.mId, this.mDataSource.hasResult()) { // from class: com.facebook.drawee.controller.AbstractDraweeController.2
            public final /* synthetic */ AbstractDraweeController this$0;
            public final /* synthetic */ String val$id;
            public final /* synthetic */ boolean val$wasImmediate;

            @Override // com.facebook.datasource.BaseDataSubscriber
            public void onFailureImpl(DataSource<T> dataSource2) {
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            public void onNewResultImpl(DataSource<T> dataSource2) {
            }

            @Override // com.facebook.datasource.BaseDataSubscriber, com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource2) {
            }
        }, this.mUiThreadImmediateExecutor);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("isAttached", this.mIsAttached).add("isRequestSubmitted", this.mIsRequestSubmitted).add("hasFetchFailed", this.mHasFetchFailed).add("fetchedImage", getImageHash(this.mFetchedImage)).add(d.ar, this.mEventTracker.toString()).toString();
    }

    private ControllerListener2.Extras obtainExtras(@Nullable DataSource<T> datasource, @Nullable INFO info, @Nullable Uri mainUri) {
        return obtainExtras(datasource == null ? null : datasource.getExtras(), obtainExtrasFromImage(info), mainUri);
    }
}
