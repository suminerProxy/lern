package com.tencent.ugc;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.TXVideoEditConstants;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCTransitionProcessor {
    private final String TAG;
    private final UGCCombineFrameFilter mCombineFrameFilter;
    private final int mOutputPixelHeight;
    private final int mOutputPixelWidth;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TXCCombineFrame {
        public PixelFrame drawInputFrame;
        public TXVideoEditConstants.TXAbsoluteRect drawRect;
        public TransformParams transformParams;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TransformParams {
        public float alpha;
        public boolean isBackgroundTransparent;
        public int rotate;
        public float scale;
    }

    public UGCTransitionProcessor(int i2, int i3, com.tencent.liteav.videobase.frame.e eVar) {
    }

    private void Retain(List<PixelFrame> list) {
    }

    private com.tencent.liteav.videobase.frame.d combineFramesWithTransitionType(List<TXCCombineFrame> list, long j2, int i2) {
    }

    private static float getAlpha(int i2, long j2) {
    }

    private static float getCropOffset(int i2, long j2) {
    }

    private TXVideoEditConstants.TXAbsoluteRect getFirstDrawRect(int i2, int i3) {
    }

    private static int getRotation(int i2, long j2) {
    }

    private static float getScale(int i2, long j2) {
    }

    private TXVideoEditConstants.TXAbsoluteRect getSecondDrawRect(int i2, int i3, int i4) {
    }

    private com.tencent.liteav.videobase.frame.d processTwoPicFaceInOut(List<TXCCombineFrame> list, long j2) {
    }

    private com.tencent.liteav.videobase.frame.d processTwoPicLeftRightCombine(List<TXCCombineFrame> list, long j2) {
    }

    private com.tencent.liteav.videobase.frame.d processTwoPicRotation(List<TXCCombineFrame> list, long j2) {
    }

    private com.tencent.liteav.videobase.frame.d processTwoPicUpDownCombine(List<TXCCombineFrame> list, long j2) {
    }

    private com.tencent.liteav.videobase.frame.d processTwoPicZoom(List<TXCCombineFrame> list, long j2, int i2) {
    }

    private void releaseFrameList(List<TXCCombineFrame> list) {
    }

    public PixelFrame processFrame(List<PixelFrame> list, int i2) {
    }

    public void release() {
    }
}
