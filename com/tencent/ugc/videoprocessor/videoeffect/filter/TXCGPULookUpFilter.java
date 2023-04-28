package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.graphics.Bitmap;
import com.tencent.liteav.videobase.a.b;
import com.tencent.liteav.videobase.frame.e;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPULookUpFilter extends b {
    private static final String LookupFilterFragmentShader = "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2; // lookup texture\n \n \n uniform lowp float intensity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float blueColor = textureColor.b * 63.0;\n     \n     mediump vec2 quad1;\n     quad1.y = floor(floor(blueColor) / 8.0);\n     quad1.x = floor(blueColor) - (quad1.y * 8.0);\n     \n     mediump vec2 quad2;\n     quad2.y = floor(ceil(blueColor) / 8.0);\n     quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n     \n     highp vec2 texPos1;\n     texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     highp vec2 texPos2;\n     texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     lowp vec4 newColor1 = texture2D(inputImageTexture2, texPos1);\n     lowp vec4 newColor2 = texture2D(inputImageTexture2, texPos2);\n     \n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n }";
    public float mIntensity;
    public int mIntensityLocation;
    public int mLookupSourceTexture;
    public int mLookupTextureUniform;
    public Bitmap m_bmp;

    /* renamed from: com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPULookUpFilter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f14501a;
        public final /* synthetic */ TXCGPULookUpFilter b;

        public AnonymousClass1(TXCGPULookUpFilter tXCGPULookUpFilter, Bitmap bitmap) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public TXCGPULookUpFilter(Bitmap bitmap) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void afterDrawArrays() {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void beforeDrawArrays(int i2) {
    }

    public void onDestroy() {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    public void setBitmap(Bitmap bitmap) {
    }

    public void setIntensity(float f2) {
    }

    public TXCGPULookUpFilter(String str, String str2) {
    }
}
