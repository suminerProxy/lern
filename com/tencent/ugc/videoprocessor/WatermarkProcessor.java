package com.tencent.ugc.videoprocessor;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.tencent.liteav.base.util.p;
import com.tencent.liteav.beauty.b.o;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.UGCWatermarkFilter;
import com.tencent.ugc.videoprocessor.watermark.AnimatedPasterFilterChain;
import com.tencent.ugc.videoprocessor.watermark.PasterFilterChain;
import com.tencent.ugc.videoprocessor.watermark.SubtitleFilterChain;
import com.tencent.ugc.videoprocessor.watermark.TailWaterMarkChain;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WatermarkProcessor {
    private static final String TAG = "WatermarkProcessor";
    private AnimatedPasterFilterChain mAnimatedPasterFilterChain;
    private com.tencent.liteav.videobase.utils.e mDelayQueue;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private ArrayList<o> mLastWaterMarkList;
    private PasterFilterChain mPasterFilterChain;
    private int mRenderMode;
    private p mRenderTargetSize;
    private SubtitleFilterChain mSubtitleFilterChain;
    private TailWaterMarkChain mTailWaterMarkChain;
    private UGCWatermarkFilter mWatermarkFilter;

    private void collectWaterMarkFromAnimatedPaster(ArrayList<o> arrayList, PixelFrame pixelFrame) {
    }

    private void collectWaterMarkFromStaticPaster(ArrayList<o> arrayList, PixelFrame pixelFrame) {
    }

    private void collectWaterMarkFromSubtitle(ArrayList<o> arrayList, PixelFrame pixelFrame) {
    }

    private void collectWaterMarkFromTail(ArrayList<o> arrayList, PixelFrame pixelFrame) {
    }

    private boolean compareWaterMarkList(@Nullable List<o> list, @Nullable List<o> list2) {
    }

    public static /* synthetic */ void lambda$setAnimatedPasterList$3(WatermarkProcessor watermarkProcessor, List list, p pVar) {
    }

    public static /* synthetic */ void lambda$setPasterList$4(WatermarkProcessor watermarkProcessor, List list, p pVar) {
    }

    public static /* synthetic */ void lambda$setSubtitleList$2(WatermarkProcessor watermarkProcessor, List list, p pVar) {
    }

    public static /* synthetic */ void lambda$setTailWaterMark$1(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j2, int i2) {
    }

    public static /* synthetic */ void lambda$setWaterMark$0(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
    }

    private o newWaterMarkTag(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
    }

    private void setAnimatedPasterListInternal(List<TXVideoEditConstants.TXAnimatedPaster> list, p pVar) {
    }

    private void setPasterListInternal(List<TXVideoEditConstants.TXPaster> list, p pVar) {
    }

    private void setSubtitleListInternal(List<TXVideoEditConstants.TXSubtitle> list, p pVar) {
    }

    private void setTailWaterMarkInternal(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j2, int i2) {
    }

    private boolean updateWaterMarkList(PixelFrame pixelFrame) {
    }

    public float getBlurLevel() {
    }

    public void initialize(com.tencent.liteav.videobase.frame.e eVar, int i2, int i3) {
    }

    public PixelFrame process(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list) {
    }

    public void setPasterList(List<TXVideoEditConstants.TXPaster> list) {
    }

    public void setRenderMode(int i2) {
    }

    public void setRenderTargetSize(int i2, int i3) {
    }

    public void setSubtitleList(List<TXVideoEditConstants.TXSubtitle> list) {
    }

    public void setTailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j2, int i2) {
    }

    public void setWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
    }

    public void uninitialize() {
    }
}
