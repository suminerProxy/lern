package com.tencent.ugc;

import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.UGCTransitionProcessor;
import java.nio.FloatBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCCombineFrameFilter {
    private static final String TAG = "UGCCombineFrameFilter";
    private UGCWatermarkAlphaTextureFilter mAlphaBlendFilter;
    private com.tencent.liteav.videobase.frame.d mBackgroundTexture;
    private com.tencent.liteav.base.util.p mCanvasSize;
    private com.tencent.liteav.videobase.a.b mCropFilter;
    private TXVideoEditConstants.TXAbsoluteRect mCropRect;
    private FloatBuffer mCropRectTextureCoordsBuffer;
    private com.tencent.liteav.videobase.frame.c mFrameBufferForClear;
    private final FloatBuffer mNormalCubeVerticesBuffer;
    private final FloatBuffer mNormalTextureCoordsBuffer;
    private UGCRotateScaleFilter mRotateScaleFilter;
    private final com.tencent.liteav.videobase.frame.e mTexturePool;

    public UGCCombineFrameFilter(com.tencent.liteav.videobase.frame.e eVar) {
    }

    private void clearTexture(com.tencent.liteav.videobase.frame.d dVar) {
    }

    private com.tencent.liteav.videobase.frame.d combineFrameWithAlphaBlendFilter(List<UGCTransitionProcessor.TXCCombineFrame> list) {
    }

    private com.tencent.liteav.videobase.frame.d cropTexture(com.tencent.liteav.videobase.frame.d dVar) {
    }

    private int getBackgroundTextureId() {
    }

    private static FloatBuffer getCropRectTextureCoords(int i2, int i3, TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect) {
    }

    private void initFilter() {
    }

    private void processRotateScale(List<UGCTransitionProcessor.TXCCombineFrame> list) {
    }

    private void setAlphaBlendFilterParameter(UGCTransitionProcessor.TXCCombineFrame tXCCombineFrame) {
    }

    private void unInitFilter() {
    }

    public com.tencent.liteav.videobase.frame.d combineFrame(List<UGCTransitionProcessor.TXCCombineFrame> list) {
    }

    public void release() {
    }

    public void setCanvasSize(int i2, int i3) {
    }

    public void setCropRect(TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect) {
    }
}
