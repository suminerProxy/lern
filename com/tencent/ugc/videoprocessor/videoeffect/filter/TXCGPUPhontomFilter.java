package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUSpiritOutFilter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUPhontomFilter extends TXCGPUSpiritOutFilter {
    private static final int DURATION_PHANTOM_LV1 = 240;
    private static final int DURATION_PHANTOM_LV10 = 1320;
    private static final int DURATION_PHANTOM_LV11 = 1440;
    private static final int DURATION_PHANTOM_LV12 = 1560;
    private static final int DURATION_PHANTOM_LV13 = 1680;
    private static final int DURATION_PHANTOM_LV14 = 1800;
    private static final int DURATION_PHANTOM_LV2 = 360;
    private static final int DURATION_PHANTOM_LV3 = 480;
    private static final int DURATION_PHANTOM_LV4 = 600;
    private static final int DURATION_PHANTOM_LV5 = 720;
    private static final int DURATION_PHANTOM_LV6 = 840;
    private static final int DURATION_PHANTOM_LV7 = 960;
    private static final int DURATION_PHANTOM_LV8 = 1080;
    private static final int DURATION_PHANTOM_LV9 = 1200;
    private static final int DURATION_PHANTOM_LVMIN = 120;
    private PhantomParam mPhantomParam;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class PhantomParam extends TXCGPUSpiritOutFilter.SpiritOutEffectParam {
        public float[] offetRed;
        public float[] offsetBlue;
        public float[] offsetGreen;
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUSpiritOutFilter, com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j2) {
    }
}
