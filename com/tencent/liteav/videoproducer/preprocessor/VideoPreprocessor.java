package com.tencent.liteav.videoproducer.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoPreprocessor implements BeautyProcessor.a {
    private static final String TAG = "VideoPreprocessor";
    private final com.tencent.liteav.videobase.utils.b mAverageCostCalculator;
    private final SparseArray<com.tencent.liteav.videobase.videobase.a> mConvertParamsList;
    private com.tencent.liteav.videobase.b.c mEGLContextChecker;
    private long mLastProcessTimestamp;
    private final CyclicBarrier mLoadFrameCyclicBarrier;
    private float mLookupMixLevel;
    private final h mPreprocessor;
    private long mTotalFrameCount;
    private final IVideoReporter mVideoReporter;
    private com.tencent.liteav.base.util.b mWorkHandler;

    public VideoPreprocessor(@NonNull Context context, @NonNull BeautyProcessor beautyProcessor, @NonNull IVideoReporter iVideoReporter) {
    }

    public static /* synthetic */ void lambda$new$0(VideoPreprocessor videoPreprocessor, double d2) {
    }

    public static /* synthetic */ void lambda$processFrame$3(VideoPreprocessor videoPreprocessor, boolean z, PixelFrame pixelFrame, long j2) {
    }

    public static /* synthetic */ void lambda$registerVideoProcessedListener$4(VideoPreprocessor videoPreprocessor, int i2, com.tencent.liteav.videobase.videobase.a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, boolean z, ah ahVar) {
    }

    public static /* synthetic */ void lambda$setFilterGroupImages$10(VideoPreprocessor videoPreprocessor, float f2, Bitmap bitmap, float f3, Bitmap bitmap2, float f4) {
    }

    public static /* synthetic */ void lambda$setFilterMixLevel$8(VideoPreprocessor videoPreprocessor, float f2) {
    }

    public static /* synthetic */ void lambda$setGaussianBlurLevel$13(VideoPreprocessor videoPreprocessor, float f2) {
    }

    public static /* synthetic */ void lambda$setGreenScreenFile$6(VideoPreprocessor videoPreprocessor, String str, boolean z) {
    }

    public static /* synthetic */ void lambda$setGreenScreenParam$7(VideoPreprocessor videoPreprocessor, GLConstants.GLScaleType gLScaleType, boolean z) {
    }

    public static /* synthetic */ void lambda$setInterceptorBeforeWatermark$15(VideoPreprocessor videoPreprocessor, com.tencent.liteav.videobase.a.a aVar) {
    }

    public static /* synthetic */ void lambda$setLookupImage$9(VideoPreprocessor videoPreprocessor, Bitmap bitmap) {
    }

    public static /* synthetic */ void lambda$setSharedGLContext$1(VideoPreprocessor videoPreprocessor, Object obj) {
    }

    public static /* synthetic */ void lambda$setSourceType$2(VideoPreprocessor videoPreprocessor, CaptureSourceInterface.SourceType sourceType) {
    }

    public static /* synthetic */ void lambda$setWatermark$11(VideoPreprocessor videoPreprocessor, Bitmap bitmap, float f2, float f3, float f4) {
    }

    public static /* synthetic */ void lambda$setWatermarkList$12(VideoPreprocessor videoPreprocessor, List list) {
    }

    public static /* synthetic */ void lambda$unregisterVideoProcessedListener$5(VideoPreprocessor videoPreprocessor, int i2, ah ahVar) {
    }

    public static /* synthetic */ void lambda$updateHomeOrientation$14(VideoPreprocessor videoPreprocessor, int i2) {
    }

    private void recalculateProcessSizeInternal() {
    }

    private void reportProcessFrameRate() {
    }

    public BeautyProcessor getBeautyProcessor() {
    }

    public void initialize() {
    }

    @Override // com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor.a
    public void onBeautyStatsChanged(String str) {
    }

    public void postTaskToGlThread(Runnable runnable) {
    }

    public synchronized boolean processFrame(PixelFrame pixelFrame) {
    }

    public void registerVideoProcessedListener(int i2, com.tencent.liteav.videobase.videobase.a aVar, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType, boolean z, ah ahVar) {
    }

    public void runTaskInGlThreadAndWaitDone(Runnable runnable) {
    }

    @CalledByNative
    public void setFilterGroupImages(float f2, Bitmap bitmap, float f3, Bitmap bitmap2, float f4) {
    }

    @CalledByNative
    public void setFilterMixLevel(float f2) {
    }

    public void setGaussianBlurLevel(float f2) {
    }

    @CalledByNative
    public boolean setGreenScreenFile(String str, boolean z) {
    }

    public void setGreenScreenParam(GLConstants.GLScaleType gLScaleType, boolean z) {
    }

    public void setInterceptorBeforeWatermark(com.tencent.liteav.videobase.a.a aVar) {
    }

    @CalledByNative
    public void setLookupImage(Bitmap bitmap) {
    }

    public void setSharedGLContext(Object obj) {
    }

    public void setSourceType(CaptureSourceInterface.SourceType sourceType) {
    }

    public void setWatermark(Bitmap bitmap, float f2, float f3, float f4) {
    }

    public void setWatermarkList(List<com.tencent.liteav.beauty.b.o> list) {
    }

    public void uninitialize() {
    }

    public void unregisterVideoProcessedListener(int i2, ah ahVar) {
    }

    public void updateHomeOrientation(int i2) {
    }
}
