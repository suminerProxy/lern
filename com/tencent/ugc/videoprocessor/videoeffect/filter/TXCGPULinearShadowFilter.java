package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.frame.e;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPULinearShadowFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_WIN_SHADDOW_LV1 = 300;
    private static final int DURATION_WIN_SHADDOW_LV10 = 1000;
    private static final int DURATION_WIN_SHADDOW_LV11 = 1050;
    private static final int DURATION_WIN_SHADDOW_LV12 = 1100;
    private static final int DURATION_WIN_SHADDOW_LV13 = 1200;
    private static final int DURATION_WIN_SHADDOW_LV14 = 1500;
    private static final int DURATION_WIN_SHADDOW_LV15 = 2500;
    private static final int DURATION_WIN_SHADDOW_LV2 = 350;
    private static final int DURATION_WIN_SHADDOW_LV3 = 400;
    private static final int DURATION_WIN_SHADDOW_LV4 = 500;
    private static final int DURATION_WIN_SHADDOW_LV5 = 600;
    private static final int DURATION_WIN_SHADDOW_LV6 = 650;
    private static final int DURATION_WIN_SHADDOW_LV7 = 700;
    private static final int DURATION_WIN_SHADDOW_LV8 = 800;
    private static final int DURATION_WIN_SHADDOW_LV9 = 900;
    private static final String FRAGMENT_SHADER = "precision mediump float; \nvarying highp vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \n \nuniform float a; \nuniform float b; \nuniform float c; \nuniform float d; \nuniform float mode; \nuniform float width; \nuniform float stride; \nuniform float alpha; \n \nvoid main() \n{ \n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate); \n   if(b == 0.0){ \n\t\tfloat mx = mod(textureCoordinate.x + c, stride); \n\t\tif((mode < 0.5 && mx <= width) || (mode > 0.5 && (mx > width))){ \n\t\t\tgl_FragColor.rgb = gl_FragColor.rgb*alpha; \n\t\t} \n\t} \n} \n";
    private int mAlphaPos;
    private int mCPos;
    private LinearShadowParam mLinearShadowParm;
    private int mModePos;
    private int mStridePos;
    private int mWithPos;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class LinearShadowParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float alpha;
        public float mode;
        public float offset;
        public float stride;
        public float width;
    }

    private void setParamsInternal(float f2, float f3, float f4, float f5, float f6) {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onOutputSizeChanged(int i2, int i3) {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j2) {
    }
}
