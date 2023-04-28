package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.content.Context;
import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.frame.e;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPULightingFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_LIGHTNING_LV1 = 50;
    private static final int DURATION_LIGHTNING_LV2 = 150;
    private static final int DURATION_LIGHTNING_LV3 = 250;
    private static final int DURATION_LIGHTNING_LV4 = 300;
    private static final int DURATION_LIGHTNING_LV5 = 400;
    private static final int DURATION_LIGHTNING_LV6 = 580;
    private static final String TAG = "TXCGPULightingFilter";
    private final Context mContext;
    private e mGLTexturePool;
    private LightningParam mLightningParam;
    private TXCGPULookUpFilter mLookUpFilter;
    private TXCGPULookUpInvertFilter mLookUpInvertFilter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class LightningParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public float lightningLevel;
    }

    public TXCGPULightingFilter(Context context) {
    }

    private void updateParams() {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onDraw(int i2, d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase, com.tencent.liteav.videobase.a.b
    public void onInit(e eVar) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onOutputSizeChanged(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onUninit() {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j2) {
    }
}
