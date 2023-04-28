package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.frame.e;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUMirrorFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_MIRROR_LV1 = 1000;
    private static final int DURATION_MIRROR_LV2 = 2000;
    private static final String FRAGMENT_SHADER = "varying highp vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform lowp float mode; \n \nvoid main() \n{ \n    highp vec2 position = textureCoordinate; \n     \n    if (mode <= 0.5) \n    { \n        if (position.x > 0.5) \n        { \n            position.x = 1.0 - position.x; \n        } \n    } \n    else \n    { \n        if (position.x > 0.5) \n        { \n            position.x = position.x - 0.5; \n        } \n        else \n        { \n            position.x = 0.5 - position.x; \n        } \n    } \n     \n    gl_FragColor = texture2D(inputImageTexture, position); \n} \n";
    private MirrorParam mMirrorParam;
    private int mModePos;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class MirrorParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float mode;
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j2) {
    }
}
