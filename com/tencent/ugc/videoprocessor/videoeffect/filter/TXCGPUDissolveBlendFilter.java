package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.c.d;
import com.tencent.liteav.videobase.frame.e;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUDissolveBlendFilter extends d {
    private static final String DISSOLVE_BLEND_FRAG = "precision mediump float;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform float mixturePercent;\n\nvoid main()\n{\n   vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n   \n   gl_FragColor = mix(textureColor, textureColor2, mixturePercent);\n}\n";
    private int mMixturePercentUniform;

    @Override // com.tencent.liteav.videobase.c.d, com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    public void setMixLevel(float f2) {
    }
}
