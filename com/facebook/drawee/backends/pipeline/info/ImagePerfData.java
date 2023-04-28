package com.facebook.drawee.backends.pipeline.info;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImagePerfData {
    public static final int UNSET = -1;
    @Nullable
    private final Object mCallerContext;
    @Nullable
    private final String mComponentTag;
    private final long mControllerCancelTimeMs;
    private final long mControllerFailureTimeMs;
    private final long mControllerFinalImageSetTimeMs;
    @Nullable
    private final ImageRequest[] mControllerFirstAvailableImageRequests;
    @Nullable
    private final String mControllerId;
    @Nullable
    private final ImageRequest mControllerImageRequest;
    private final long mControllerIntermediateImageSetTimeMs;
    @Nullable
    private final ImageRequest mControllerLowResImageRequest;
    private final long mControllerSubmitTimeMs;
    @Nullable
    private final DimensionsInfo mDimensionsInfo;
    @Nullable
    private final Throwable mErrorThrowable;
    @Nullable
    private ControllerListener2.Extras mExtraData;
    private final long mImageDrawTimeMs;
    @Nullable
    private final ImageInfo mImageInfo;
    private final int mImageOrigin;
    @Nullable
    private final ImageRequest mImageRequest;
    private final long mImageRequestEndTimeMs;
    private final long mImageRequestStartTimeMs;
    private final long mInvisibilityEventTimeMs;
    private final boolean mIsPrefetch;
    private final int mOnScreenHeightPx;
    private final int mOnScreenWidthPx;
    @Nullable
    private final String mRequestId;
    @Nullable
    private final String mUltimateProducerName;
    private final long mVisibilityEventTimeMs;
    private final int mVisibilityState;

    public ImagePerfData(@Nullable String controllerId, @Nullable String requestId, @Nullable ImageRequest imageRequest, @Nullable Object callerContext, @Nullable ImageInfo imageInfo, @Nullable ImageRequest controllerImageRequest, @Nullable ImageRequest controllerLowResImageRequest, @Nullable ImageRequest[] controllerFirstAvailableImageRequests, long controllerSubmitTimeMs, long controllerIntermediateImageSetTimeMs, long controllerFinalImageSetTimeMs, long controllerFailureTimeMs, long controllerCancelTimeMs, long imageRequestStartTimeMs, long imageRequestEndTimeMs, int imageOrigin, @Nullable String ultimateProducerName, boolean isPrefetch, int onScreenWidthPx, int onScreenHeightPx, @Nullable Throwable errorThrowable, int visibilityState, long visibilityEventTimeMs, long invisibilityEventTime, @Nullable String componentTag, long imageDrawTimeMs, @Nullable DimensionsInfo dimensionsInfo, @Nullable ControllerListener2.Extras extraData) {
    }

    public String createDebugString() {
    }

    @Nullable
    public Object getCallerContext() {
    }

    @Nullable
    public String getComponentTag() {
    }

    public long getControllerFailureTimeMs() {
    }

    public long getControllerFinalImageSetTimeMs() {
    }

    @Nullable
    public ImageRequest[] getControllerFirstAvailableImageRequests() {
    }

    @Nullable
    public String getControllerId() {
    }

    @Nullable
    public ImageRequest getControllerImageRequest() {
    }

    public long getControllerIntermediateImageSetTimeMs() {
    }

    @Nullable
    public ImageRequest getControllerLowResImageRequest() {
    }

    public long getControllerSubmitTimeMs() {
    }

    @Nullable
    public DimensionsInfo getDimensionsInfo() {
    }

    @Nullable
    public Throwable getErrorThrowable() {
    }

    @Nullable
    public ControllerListener2.Extras getExtraData() {
    }

    public long getFinalImageLoadTimeMs() {
    }

    public long getImageDrawTimeMs() {
    }

    @Nullable
    public ImageInfo getImageInfo() {
    }

    public int getImageOrigin() {
    }

    @Nullable
    public ImageRequest getImageRequest() {
    }

    public long getImageRequestEndTimeMs() {
    }

    public long getImageRequestStartTimeMs() {
    }

    public long getIntermediateImageLoadTimeMs() {
    }

    public long getInvisibilityEventTimeMs() {
    }

    public int getOnScreenHeightPx() {
    }

    public int getOnScreenWidthPx() {
    }

    @Nullable
    public String getRequestId() {
    }

    @Nullable
    public String getUltimateProducerName() {
    }

    public long getVisibilityEventTimeMs() {
    }

    public int getVisibilityState() {
    }

    public boolean isPrefetch() {
    }

    public void setExtraData(ControllerListener2.Extras extraData) {
    }
}
