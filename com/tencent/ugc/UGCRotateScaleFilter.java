package com.tencent.ugc;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCRotateScaleFilter extends com.tencent.liteav.videobase.a.b {
    private static final String TRANSFORM_FRAG_SHADER = "precision mediump float;\nvarying mediump vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float scale;\n uniform mediump float alpha;\n\nvoid main(void) {\n    gl_FragColor = vec4(texture2D(inputImageTexture, textureCoordinate).rgb, alpha); \n}\n";
    private static final String TRANSFORM_VERTEX_SHADER = "attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform mat4 transformMatrix;\n uniform mat4 orthographicMatrix;\n \n varying vec2 textureCoordinate;\n void main()\n {\n     gl_Position = transformMatrix * vec4(position.xyz, 1.0) * orthographicMatrix;\n     textureCoordinate = inputTextureCoordinate.xy;\n }";
    private int mAlphaUniform;
    private float[] mTransform3D;
    private int mTransformMatrixUniform;

    public static /* synthetic */ void lambda$setRotate$0(UGCRotateScaleFilter uGCRotateScaleFilter, float f2) {
    }

    public static /* synthetic */ void lambda$setRotateAndScale$1(UGCRotateScaleFilter uGCRotateScaleFilter, float f2, float f3) {
    }

    public static /* synthetic */ void lambda$setUniformMatrix4f$2(int i2, float[] fArr) {
    }

    private float[] setRotateInternal(float[] fArr, float f2) {
    }

    private void setScaleInternal(float[] fArr, float f2) {
    }

    private void setUniformMatrix4f(int i2, float[] fArr) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onInit(com.tencent.liteav.videobase.frame.e eVar) {
    }

    public void setAlpha(float f2) {
    }

    public void setRotate(float f2) {
    }

    public void setRotateAndScale(float f2, float f3) {
    }
}
