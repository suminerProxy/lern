package com.tencent.ugc.videoprocessor.transitions;

import com.tencent.liteav.videobase.a.b;
import com.tencent.liteav.videobase.frame.e;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUTransitionFilterBase extends b {
    public static final String FRAG_GET_FROM_COLOR = "vec4 getFromColor(in vec2 uv){\n    vec2 fromTexture = vec2(uv.x,1.0 - uv.y);\n    vec4 fromColor = texture2D(inputImageTexture,fromTexture);\n    return fromColor;\n}";
    public static final String FRAG_GET_TO_COLOR = "vec4 getToColor(in vec2 uv){\n    vec2 toTexture = vec2(uv.x,1.0-uv.y);\n    vec4 toColor = texture2D(inputImageTexture,toTexture);\n    return toColor;\n}";
    public static final String FRAG_MAIN = "void main() {\n    gl_FragColor = transition(_uv);\n}";
    public static final String FRAG_PUBLIC_DECLARE = "precision mediump float;\nvarying mediump vec2 _uv;\nuniform sampler2D inputImageTexture;\nuniform float progress;\nuniform float ratio;";
    public static final String TRANSITION_BASE_VERTEX = "attribute vec2 position; \nvarying mediump vec2 _uv;\n  \nvoid main() \n{ \n    gl_Position = vec4(position,0,1); \n    vec2 uv = position * 0.5 + 0.5;\n    _uv = vec2(uv.x,1.0 - uv.y);\n}";
    private int mProgressPosition;
    private int mRatioPosition;
    public final int mType;

    public TXCGPUTransitionFilterBase(String str, String str2, int i2) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onOutputSizeChanged(int i2, int i3) {
    }

    public void setProgressForTransition(float f2) {
    }
}
