package com.facebook.drawee.backends.pipeline.info;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImagePerfState {
    @Nullable
    private Object mCallerContext;
    @Nullable
    private String mComponentTag;
    private long mControllerCancelTimeMs;
    private long mControllerFailureTimeMs;
    private long mControllerFinalImageSetTimeMs;
    @Nullable
    private ImageRequest[] mControllerFirstAvailableImageRequests;
    @Nullable
    private String mControllerId;
    @Nullable
    private ImageRequest mControllerImageRequest;
    private long mControllerIntermediateImageSetTimeMs;
    @Nullable
    private ImageRequest mControllerLowResImageRequest;
    private long mControllerSubmitTimeMs;
    @Nullable
    private DimensionsInfo mDimensionsInfo;
    @Nullable
    private Throwable mErrorThrowable;
    @Nullable
    private ControllerListener2.Extras mExtraData;
    private long mImageDrawTimeMs;
    @Nullable
    private ImageInfo mImageInfo;
    private int mImageLoadStatus;
    private int mImageOrigin;
    @Nullable
    private ImageRequest mImageRequest;
    private long mImageRequestEndTimeMs;
    private long mImageRequestStartTimeMs;
    private long mInvisibilityEventTimeMs;
    private boolean mIsPrefetch;
    private int mOnScreenHeightPx;
    private int mOnScreenWidthPx;
    @Nullable
    private String mRequestId;
    @Nullable
    private String mUltimateProducerName;
    private long mVisibilityEventTimeMs;
    private int mVisibilityState;

    @Nullable
    public DimensionsInfo getDimensionsInfo() {
    }

    @Nullable
    public Object getExtraData() {
    }

    public long getImageDrawTimeMs() {
    }

    public int getImageLoadStatus() {
    }

    public void reset() {
    }

    public void resetPointsTimestamps() {
    }

    public void setCallerContext(@Nullable Object callerContext) {
    }

    public void setComponentTag(@Nullable String componentTag) {
    }

    public void setControllerCancelTimeMs(long controllerCancelTimeMs) {
    }

    public void setControllerFailureTimeMs(long controllerFailureTimeMs) {
    }

    public void setControllerFinalImageSetTimeMs(long controllerFinalImageSetTimeMs) {
    }

    public void setControllerId(@Nullable String controllerId) {
    }

    public void setControllerImageRequests(@Nullable ImageRequest imageRequest, @Nullable ImageRequest lowResImageRequest, @Nullable ImageRequest[] firstAvailableImageRequests) {
    }

    public void setControllerIntermediateImageSetTimeMs(long controllerIntermediateImageSetTimeMs) {
    }

    public void setControllerSubmitTimeMs(long controllerSubmitTimeMs) {
    }

    public void setDimensionsInfo(DimensionsInfo dimensionsInfo) {
    }

    public void setErrorThrowable(@Nullable Throwable errorThrowable) {
    }

    public void setExtraData(@Nullable ControllerListener2.Extras extraData) {
    }

    public void setImageDrawTimeMs(long imageDrawTimeMs) {
    }

    public void setImageInfo(@Nullable ImageInfo imageInfo) {
    }

    public void setImageLoadStatus(int imageLoadStatus) {
    }

    public void setImageOrigin(int imageOrigin) {
    }

    public void setImageRequest(@Nullable ImageRequest imageRequest) {
    }

    public void setImageRequestEndTimeMs(long imageRequestEndTimeMs) {
    }

    public void setImageRequestStartTimeMs(long imageRequestStartTimeMs) {
    }

    public void setInvisibilityEventTimeMs(long invisibilityEventTimeMs) {
    }

    public void setOnScreenHeight(int onScreenHeightPx) {
    }

    public void setOnScreenWidth(int onScreenWidthPx) {
    }

    public void setPrefetch(boolean prefetch) {
    }

    public void setRequestId(@Nullable String requestId) {
    }

    public void setUltimateProducerName(@Nullable String ultimateProducerName) {
    }

    public void setVisibilityEventTimeMs(long visibilityEventTimeMs) {
    }

    public void setVisible(boolean visible) {
    }

    public ImagePerfData snapshot() {
    }
}
