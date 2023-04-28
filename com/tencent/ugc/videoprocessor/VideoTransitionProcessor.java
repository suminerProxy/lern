package com.tencent.ugc.videoprocessor;

import android.content.Context;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.videoprocessor.transitions.TXCGPUTransitionFilterBase;
import com.tencent.ugc.videoprocessor.transitions.data.TransitionConfig;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoTransitionProcessor {
    private static final String TAG = "TransitionProcessor";
    private final Context mContext;
    private long mFirstFrameTime;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private final TransitionConfig mTransitionConfig;
    private TXCGPUTransitionFilterBase mTransitionFilter;

    public VideoTransitionProcessor(Context context) {
    }

    private void createTransitionFilter(int i2) {
    }

    private TransitionConfig.TransitionBean getCurrentTransition(long j2) {
    }

    private float getTransitionProgress(TransitionConfig.TransitionBean transitionBean, long j2) {
    }

    private boolean isInTransitionRange(long j2, TransitionConfig.TransitionBean transitionBean) {
    }

    public PixelFrame applyTransitionFilter(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    public void deleteLastTransitionEffect() {
    }

    public void destroy() {
    }

    public void init(com.tencent.liteav.videobase.frame.e eVar) {
    }

    public boolean setTransitionEffect(int i2, long j2, long j3, long j4) {
    }
}
