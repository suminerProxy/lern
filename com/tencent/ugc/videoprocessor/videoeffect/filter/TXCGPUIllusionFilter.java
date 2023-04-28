package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.c.d;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUIllusionFilter extends d {
    private static final String FRAGMENT_SHADER = "precision mediump float;  \nvarying vec2 textureCoordinate;  \nuniform sampler2D inputImageTexture;  \nuniform sampler2D inputImageTexture2;  \nvoid main() {   \n\tgl_FragColor = vec4(mix(texture2D(inputImageTexture2, textureCoordinate).rgb,    texture2D(inputImageTexture, textureCoordinate).rgb, vec3(0.06,0.21,0.6)),1.0);   \n}  \n";
    private com.tencent.liteav.videobase.frame.d mPreTextureBuf;

    @Override // com.tencent.liteav.videobase.a.b
    public void onDraw(int i2, com.tencent.liteav.videobase.frame.d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }
}
