package com.tencent.ugc;

import android.graphics.Bitmap;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.UGCFrameQueue;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCImageProvider implements UGCFrameQueue.UGCFrameQueueListener, UGCPixelFrameProvider {
    private static final int MAX_FRAME_SIZE = 5;
    private static final String TAG = "UGCImageProvider";
    private final List<Bitmap> mBitmapList;
    private int mCurrentFrameCount;
    private FutureTask<Long> mDurationFuture;
    private long mDurationMs;
    private com.tencent.liteav.videobase.b.e mEGLCore;
    private final int mFps;
    private final int mFrameIntervalMs;
    private final UGCFrameQueue<List<PixelFrame>> mFrameQueue;
    private final Map<Bitmap, com.tencent.liteav.videobase.frame.d> mGLTextureMap;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private long mMotionDurationMs;
    private long mStayDurationMs;
    private int mTotalFrameCount;
    private int mTransitionType;
    private com.tencent.liteav.base.util.b mWorkHandler;

    public UGCImageProvider(List<Bitmap> list, int i2) {
    }

    public static /* synthetic */ void access$lambda$0(UGCImageProvider uGCImageProvider) {
    }

    public static /* synthetic */ void access$lambda$1(UGCImageProvider uGCImageProvider) {
    }

    public static /* synthetic */ void access$lambda$2(UGCImageProvider uGCImageProvider) {
    }

    public static /* synthetic */ void access$lambda$3(UGCImageProvider uGCImageProvider) {
    }

    public static /* synthetic */ void access$lambda$4(UGCImageProvider uGCImageProvider) {
    }

    private void clearGLTextureCache() {
    }

    private void clearPixelFrameQueue() {
    }

    private void decodeBitmapFrame() {
    }

    private void initializeGLComponents() {
    }

    public static /* synthetic */ void lambda$initialize$0(UGCImageProvider uGCImageProvider) {
    }

    public static /* synthetic */ void lambda$seekTo$4(UGCImageProvider uGCImageProvider, long j2) {
    }

    public static /* synthetic */ Long lambda$setPictureTransition$5(UGCImageProvider uGCImageProvider, int i2) throws Exception {
    }

    public static /* synthetic */ void lambda$start$2(UGCImageProvider uGCImageProvider) {
    }

    public static /* synthetic */ void lambda$stop$3(UGCImageProvider uGCImageProvider) {
    }

    public static /* synthetic */ void lambda$uninitialize$1(UGCImageProvider uGCImageProvider) {
    }

    private PixelFrame loadBitmapToPixelFrame(Bitmap bitmap, long j2) {
    }

    private boolean runOnWorkThread(Runnable runnable) {
    }

    private void setPictureTransitionInternal(int i2) {
    }

    private void uninitGLComponents() {
    }

    public long getDuration() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j2, boolean z) {
    }

    public void setPictureTransition(int i2) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void setReverse(boolean z) {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void start() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void stop() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void uninitialize() {
    }
}
