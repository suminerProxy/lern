package com.tencent.ugc.videoprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.preprocessor.BeautyProcessor;
import com.tencent.liteav.videoproducer.preprocessor.VideoPreprocessor;
import com.tencent.liteav.videoproducer.preprocessor.ah;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoProcessManager {
    private static final int IDENTITY = 100;
    private static final String TAG = "VideoProcessManager";
    private BeautyProcessor mBeautyProcessor;
    private Context mContext;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private boolean mIsPreprocessorRegister;
    private IVideoProcessorListener mListener;
    private boolean mNeedProcess;
    private FloatBuffer mNormalCubeVerticesBuffer;
    private FloatBuffer mNormalTextureCoordsBuffer;
    private IVideoReporter mReporter;
    private final VideoTransitionProcessor mTransitionProcessor;
    private final VideoEffectProcessor mVideoEffectProcessor;
    private VideoPreprocessor mVideoPreprocessor;
    private final WatermarkProcessor mWatermarkProcessor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface IVideoProcessorListener {
        int customProcessFrame(PixelFrame pixelFrame);

        void didProcessFrame(PixelFrame pixelFrame);
    }

    public VideoProcessManager(Context context, boolean z, @NonNull IVideoReporter iVideoReporter) {
    }

    private PixelFrame applyMotionFilterChain(PixelFrame pixelFrame) {
    }

    private PixelFrame applyTransitionFilterChain(PixelFrame pixelFrame) {
    }

    private PixelFrame processByVideoEffectInner(PixelFrame pixelFrame) {
    }

    public void destroyFilter(ah ahVar) {
    }

    public VideoEffectProcessor getEffectProcessor() {
    }

    public VideoTransitionProcessor getTransitionProcessor() {
    }

    public WatermarkProcessor getWatermarkProcessor() {
    }

    public void initialize(com.tencent.liteav.videobase.frame.e eVar, Object obj, int i2, int i3, ah ahVar) {
    }

    public void processByVideoEffect(PixelFrame pixelFrame) {
    }

    public void processFrame(PixelFrame pixelFrame) {
    }

    public void reInitFilter(com.tencent.liteav.videobase.frame.e eVar, Object obj, int i2, int i3, ah ahVar) {
    }

    public void setBeautyFilter(int i2, int i3) {
    }

    public void setFilter(Bitmap bitmap, float f2, Bitmap bitmap2, float f3, float f4) {
    }

    public void setListener(IVideoProcessorListener iVideoProcessorListener) {
    }

    public void setOutputSize(int i2, int i3) {
    }

    public void setScaleType(GLConstants.GLScaleType gLScaleType) {
    }

    public void setSpecialRatio(float f2) {
    }

    public void unInitialize(ah ahVar) {
    }
}
