package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.frame.e;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPURockFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_LIVEWAVE = 70;
    private static final int DURATION_LIVEWAVE_LVMIN = 120;
    private static final String FRAGMENT_SHADER = "precision highp float; \nvarying vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform float t; \nuniform float st; \nconst float stride = 7.0; \nconst float interval = 1.0; \nuniform float zMin; \nuniform float zMax; \nuniform vec2 center; \nuniform vec2 offsetR; \nuniform vec2 offsetG; \nuniform vec2 offsetB;\n\nfloat GetFactor(float elapse, float astride, float ainterval, float amp) \n{ \n   float ff = mod(elapse, astride + ainterval) / astride; \n   if (ff > 1.0) \n   { \n       ff = 0.0; \n   } \n   return pow(ff, 3.0) * 1.125 * amp; \n} \nvec2 _uv(vec2 uv, vec2 center, float zz, float min) \n{ \n   return uv + (zz + min) * (center - uv); \n} \nvoid main() \n{ \n   vec4 fout; \n   float zz = GetFactor(t - st, stride, interval, zMax - zMin); \n   float coeff = pow(zz, 0.75); \n   fout.r = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetR * coeff).r;\n   fout.g = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetG * coeff).g;\n   fout.b = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetB * coeff).b;\n   gl_FragColor = vec4(fout.rgb, 1.0); \n}\n";
    private int mCenterLocation;
    private int mCurrentLocation;
    private DongGanLightParam mDongGanParam;
    private int mDurationLocation;
    private int mOffsetBLocation;
    private int mOffsetGLocation;
    private int mOffsetRLocation;
    private int mZMaxLocation;
    private int mZMinLocation;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class DongGanLightParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float[] center;
        public float current;
        public float duration;
        public float[] offetRed;
        public float[] offsetBlue;
        public float[] offsetGreen;
        public float zoomMax;
        public float zoomMin;
    }

    private void setCurrent(float f2) {
    }

    private void setDuration(float f2) {
    }

    private void setOffset(float[] fArr, float[] fArr2, float[] fArr3) {
    }

    private void setZoom(float f2, float f3) {
    }

    private void updateParamsToOpenGL() {
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
