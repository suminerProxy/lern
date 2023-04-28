package com.tencent.ugc;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCWatermarkAlphaTextureFilter extends com.tencent.liteav.beauty.b.n {
    private static final String WATERMARK_ALPHA_FRAG = "varying lowp vec2 textureCoordinate;\n   \n  uniform sampler2D inputImageTexture;\n  uniform mediump float alphaBlend;\n  \n  void main()\n  {\n      mediump vec4 color = texture2D(inputImageTexture, textureCoordinate);\n       if (0.0 == color.a){\n            gl_FragColor = color;\n       }else{\n            gl_FragColor = vec4(color.rgb, alphaBlend);\n       } \n  }\n";
    private int mAlphaUniform;
    private boolean mIsShowBackImageMoment;

    public static /* synthetic */ void lambda$setShowBackImageMoment$0(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, boolean z) {
    }

    public static /* synthetic */ void lambda$setTextureWatermark$1(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, int i2, int i3, int i4, float f2, float f3, float f4) {
    }

    @Override // com.tencent.liteav.beauty.b.n, com.tencent.liteav.videobase.a.b
    public void afterDrawArrays() {
    }

    @Override // com.tencent.liteav.beauty.b.n, com.tencent.liteav.videobase.a.b
    public void onInit(com.tencent.liteav.videobase.frame.e eVar) {
    }

    @Override // com.tencent.liteav.beauty.b.n, com.tencent.liteav.videobase.a.b
    public void onUninit() {
    }

    public void setAlpha(float f2) {
    }

    public void setShowBackImageMoment(boolean z) {
    }

    public void setTextureWatermark(int i2, int i3, int i4, float f2, float f3, float f4) {
    }
}
