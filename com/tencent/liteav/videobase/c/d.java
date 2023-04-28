package com.tencent.liteav.videobase.c;

import com.tencent.liteav.videobase.a.j;
import com.tencent.liteav.videobase.frame.e;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d extends j {
    public static final String TWOINPUT_VERTEX_SHADER = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}";
    private int mGLAttribTextureCoord2;
    private final FloatBuffer mSecondTextureCoordsBuffer;

    public d(String str) {
    }

    @Override // com.tencent.liteav.videobase.a.j, com.tencent.liteav.videobase.a.b
    public void afterDrawArrays() {
    }

    @Override // com.tencent.liteav.videobase.a.j, com.tencent.liteav.videobase.a.b
    public void beforeDrawArrays(int i2) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    public void setSecondInputTexture(int i2) {
    }

    public d(String str, String str2) {
    }
}
