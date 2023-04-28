package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.frame.e;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUGhostShadowFilter extends TXCGPUEffectFilterBase {
    private static final String TAG = "TXCGPUGhostShadowFilter";
    private TXCGPUDissolveBlendFilter mDissolveBlendFilter;
    private e mGLTexturePool;
    private GhostShadowParam mGhostShadowParam;
    private TXCSavePreFrameFilter mSavePreFrameFilter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class GhostShadowParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public int delayNumber;
        public float mixLevel;
        public int shadowLevel;
    }

    private boolean initParams(GhostShadowParam ghostShadowParam, int i2, int i3) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onDraw(int i2, d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onOutputSizeChanged(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onUninit() {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j2) {
    }
}
