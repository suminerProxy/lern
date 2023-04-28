package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.frame.d;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCGPUSplitScreenFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_SPLIT_SCREEN = 1000;
    private SplitSceenParam mSplitScreenParam;
    private int mSpliteNumber;
    private a[] mSubWindowPosition;
    private final int[] mSupportSplitNumber;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class SplitSceenParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public int splitScreenNumber;
    }

    private void updateParams(SplitSceenParam splitSceenParam) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onDraw(int i2, d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14502a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f14503d;

        private a() {
        }

        public /* synthetic */ a(byte b) {
        }
    }
}
