package com.tencent.ugc;

import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.UGCTransitionProcessor;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCCombineProcessor {
    private final String TAG;
    private final com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private final int mOutputPixelHeight;
    private final int mOutputPixelWidth;
    private final List<TXVideoEditConstants.TXAbsoluteRect> mScaleRectList;
    private final List<com.tencent.liteav.videobase.frame.j> mScaleRendererList;
    private final UGCCombineFrameFilter mUGCCombineProcessor;

    public UGCCombineProcessor(int i2, int i3, com.tencent.liteav.videobase.frame.e eVar) {
    }

    private void Retain(List<PixelFrame> list) {
    }

    private PixelFrame preScale(PixelFrame pixelFrame, TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect, int i2) {
    }

    private void releaseFrameList(List<UGCTransitionProcessor.TXCCombineFrame> list) {
    }

    public PixelFrame processFrame(List<PixelFrame> list, List<TXVideoEditConstants.TXAbsoluteRect> list2) {
    }

    public void release() {
    }
}
