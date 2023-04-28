package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.frame.e;
import com.tencent.ugc.UGCWatermarkAlphaTextureFilter;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUSpiritOutFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_SPIRITOUT_LV1 = 230;
    private static final int DURATION_SPIRITOUT_LV10 = 560;
    private static final int DURATION_SPIRITOUT_LV2 = 274;
    private static final int DURATION_SPIRITOUT_LV3 = 318;
    private static final int DURATION_SPIRITOUT_LV4 = 362;
    private static final int DURATION_SPIRITOUT_LV5 = 406;
    private static final int DURATION_SPIRITOUT_LV6 = 450;
    private static final int DURATION_SPIRITOUT_LV7 = 494;
    private static final int DURATION_SPIRITOUT_LV8 = 538;
    private static final int DURATION_SPIRITOUT_LV9 = 582;
    private static final int DURATION_SPIRITOUT_LVMAX = 1120;
    private static final int DURATION_SPIRITOUT_LVMIN = 120;
    private static final String TAG = "TXCGPUSpiritOutFilter";
    private SpiritOutEffectParam mSpritParams;
    private int mTextureHeight;
    private e mTexturePool;
    private UGCWatermarkAlphaTextureFilter mTextureWaterMarkFilter;
    private int mTextureWidth;
    public TXCZoomInOutFilter mZoomInOutFilter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SpiritOutEffectParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float alpahLevel;
        public int fringeNumber;
        public float zoomCenterX;
        public float zoomCenterY;
        public int zoomOutLevel;
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
