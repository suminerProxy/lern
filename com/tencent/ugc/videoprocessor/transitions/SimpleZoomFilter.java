package com.tencent.ugc.videoprocessor.transitions;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SimpleZoomFilter extends TXCGPUTransitionFilterBase {
    private static final String FRAGMENT = "precision mediump float;\nvarying mediump vec2 _uv;\nuniform sampler2D inputImageTexture;\nuniform float progress;\nuniform float ratio;\nconst float zoom_quickness = 0.8;\nvec4 getFromColor(in vec2 uv){\n    vec2 fromTexture = vec2(uv.x,1.0 - uv.y);\n    vec4 fromColor = texture2D(inputImageTexture,fromTexture);\n    return fromColor;\n}\nvec4 getToColor(in vec2 uv){\n    vec2 toTexture = vec2(uv.x,1.0-uv.y);\n    vec4 toColor = texture2D(inputImageTexture,toTexture);\n    return toColor;\n}\nvec2 zoom(vec2 uv, float amount) {\n    return 0.5 + ((uv - 0.5) * (1.0-amount));\n}\n\nvec4 transition (vec2 uv) {\nfloat nQuick = clamp(zoom_quickness,0.2,1.0);\n    return mix(\n    getFromColor(zoom(uv, smoothstep(0.0, nQuick, progress))),\n    getToColor(uv),\n    smoothstep(nQuick-0.2, 1.0, progress)\n    );\n}\nvoid main() {\n    gl_FragColor = transition(_uv);\n}";

    public SimpleZoomFilter(int i2) {
    }
}
