package com.tencent.ugc;

import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.ugc.UGCFrameQueue;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCSingleFilePixelFrameProvider implements VideoDecodeController.a, UGCFrameQueue.UGCFrameQueueListener, UGCPixelFrameProvider {
    private static final int MAX_FRAME_SIZE = 3;
    private static final int REVERSE_STEP_TIME = 500;
    private static final String TAG = "UGCVideoFileProvider";
    private final Clip mClip;
    private VideoDemuxer mDemuxer;
    private com.tencent.liteav.videobase.b.e mEGLCore;
    private int mFrameCacheCapacityForReverse;
    private com.tencent.liteav.videobase.frame.e mGLTexturePool;
    private boolean mHasReadEOF;
    private boolean mIsAbandoningDecodingFrame;
    private boolean mIsDecodeCompleted;
    private boolean mIsFrameSendingDecoder;
    private boolean mIsInPreciseSeeking;
    private boolean mIsReverse;
    private final AtomicBoolean mIsSeeking;
    private final Deque<PixelFrame> mPixFrameCacheForReverse;
    private final UGCFrameQueue<List<PixelFrame>> mPixFrameQueue;
    private com.tencent.liteav.videobase.frame.j mPixelFrameRenderer;
    private long mReversePlayCurrentPts;
    private long mSeekingTimeMs;
    private VideoDecodeController mVideoDecodeController;
    private int mVideoHeight;
    private Rotation mVideoRotation;
    private int mVideoWidth;
    private final com.tencent.liteav.base.util.b mWorkHandler;

    public UGCSingleFilePixelFrameProvider(@NonNull Clip clip, @NonNull com.tencent.liteav.base.util.b bVar) {
    }

    public static /* synthetic */ void access$lambda$0(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$1(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$2(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$3(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$4(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$5(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$6(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$7(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    private void addFrameToQueue(PixelFrame pixelFrame) {
    }

    private void addFrameToQueueForReverse(PixelFrame pixelFrame) {
    }

    private void clearPixelFrameQueue() {
    }

    private boolean createDemuxerAndOpenFile() {
    }

    private void decodeInternal() {
    }

    private long fileTimeToTimeline(long j2) {
    }

    private long fileTimeToTimelineForReverse(long j2) {
    }

    private float getTimeMultipleInSpeed(int i2) {
    }

    private void initializeGLComponents() {
    }

    private void initializeInternal() {
    }

    private boolean isNeedDecode() {
    }

    public static /* synthetic */ void lambda$onAbandonDecodingFramesCompleted$4(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void lambda$onDecodeFailed$5(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void lambda$onDecodeFrame$2(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, PixelFrame pixelFrame) {
    }

    public static /* synthetic */ void lambda$onFrameDequeued$3(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
    }

    public static /* synthetic */ void lambda$seekTo$0(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, long j2, boolean z) {
    }

    public static /* synthetic */ void lambda$setReverse$1(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, boolean z) {
    }

    private void onDecodeCompletedInternal() {
    }

    private void onDecodeFrameInternal(PixelFrame pixelFrame) {
    }

    private PixelFrame processFrame(PixelFrame pixelFrame) {
    }

    private void seekToInFileTime(long j2, boolean z) {
    }

    private void setReverseInternal(boolean z) {
    }

    private void startInternal() {
    }

    private void stopInternal() {
    }

    private long timelineToFileTime(long j2) {
    }

    private void unInitializeGLComponents() {
    }

    private void uninitializeInternal() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public UGCFrameQueue<List<PixelFrame>> getFrameQueue() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void initialize() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public void onAbandonDecodingFramesCompleted() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public void onDecodeCompleted() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public void onDecodeFailed() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public void onDecodeFrame(PixelFrame pixelFrame, long j2) {
    }

    public void onDecodeSEI(ByteBuffer byteBuffer) {
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public void onFrameEnqueuedToDecoder() {
    }

    @Override // com.tencent.liteav.videoconsumer.decoder.aw
    public void onRequestKeyFrame() {
    }

    @Override // com.tencent.ugc.UGCPixelFrameProvider
    public void seekTo(long j2, boolean z) {
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
