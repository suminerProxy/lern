package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.a.b;
import com.tencent.liteav.videobase.frame.e;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCZoomInOutFilter extends b {
    public static final String SPIRITOUT_FRAG = "precision highp float;\nvarying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\nuniform lowp float alphaLevel;\nuniform vec2 offsetR; \nuniform vec2 offsetG;\nuniform vec2 offsetB;\n\nvoid main()\n{\n   mediump vec4 fout;\n   fout.r = texture2D(inputImageTexture, textureCoordinate + offsetR).r; \n   fout.g = texture2D(inputImageTexture, textureCoordinate + offsetG).g; \n   fout.b = texture2D(inputImageTexture, textureCoordinate + offsetB).b; \n   fout.a = alphaLevel;\n\n    gl_FragColor = fout;\n}\n";
    public static final String SPIRITOUT_VERT = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}";
    private static String TAG = "ZoomInOut";
    private float mAlphaLevel;
    private int mAlphaUniforLocation;
    private int mOffsetBLocation;
    private int mOffsetGLocation;
    private int mOffsetRLocation;
    private float[] mTextureTransformMatrix;
    private int mTextureTransformMatrixLocation;

    @Override // com.tencent.liteav.videobase.a.b
    public void beforeDrawArrays(int i2) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    public void setAlphaLevel(float f2) {
    }

    public void setColorOffset(float[] fArr, float[] fArr2, float[] fArr3) {
    }

    public void setZoomLevel(float f2, int i2) {
    }
}
