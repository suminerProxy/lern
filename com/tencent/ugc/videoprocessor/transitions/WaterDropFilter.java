package com.tencent.ugc.videoprocessor.transitions;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WaterDropFilter extends TXCGPUTransitionFilterBase {
    private static final String FRAGMENT = "precision mediump float;\nvarying mediump vec2 _uv;\nuniform sampler2D inputImageTexture;\nuniform float progress;\nuniform float ratio;\nconst float amplitude = 30.0;\nconst float speed = 30.0;\nvec4 getFromColor(in vec2 uv){\n    vec2 fromTexture = vec2(uv.x,1.0 - uv.y);\n    vec4 fromColor = texture2D(inputImageTexture,fromTexture);\n    return fromColor;\n}\nvec4 getToColor(in vec2 uv){\n    vec2 toTexture = vec2(uv.x,1.0-uv.y);\n    vec4 toColor = texture2D(inputImageTexture,toTexture);\n    return toColor;\n}\nvec4 transition(vec2 p) {\n  vec2 dir = p - vec2(.5);\n  float dist = length(dir);\n\n  if (dist > progress) {\n    return mix(getFromColor( p), getToColor( p), progress);\n  } else {\n    vec2 offset = dir * sin(dist * amplitude - progress * speed);\n    return mix(getFromColor( p + offset), getToColor( p), progress);\n  }\n}\nvoid main() {\n    gl_FragColor = transition(_uv);\n}";

    public WaterDropFilter(int i2) {
    }
}
