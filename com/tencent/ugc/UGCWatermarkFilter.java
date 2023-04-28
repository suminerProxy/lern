package com.tencent.ugc;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCWatermarkFilter extends com.tencent.liteav.beauty.b.n {
    private static final String WATERMARK_ALPHA_FRAG = "varying lowp vec2 textureCoordinate;\n   \n  uniform sampler2D inputImageTexture;\n  uniform mediump float alphaBlend;\n  \n  void main()\n  {\n      mediump vec4 color = texture2D(inputImageTexture, textureCoordinate);\n      float alpha = color.a * alphaBlend;\n      gl_FragColor = vec4(color.rgb*alphaBlend,alpha);\n  }\n";
    private int mAlphaUniform;
    private float mWaterMarkAlpha;

    @Override // com.tencent.liteav.beauty.b.n, com.tencent.liteav.videobase.a.b
    public void afterDrawArrays() {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void beforeDrawArrays(int i2) {
    }

    @Override // com.tencent.liteav.beauty.b.n, com.tencent.liteav.videobase.a.b
    public void onInit(com.tencent.liteav.videobase.frame.e eVar) {
    }

    public void setAlpha(float f2) {
    }
}
