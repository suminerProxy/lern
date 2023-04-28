package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.UGCFrameQueue;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoDemuxerFFmpeg implements UGCFrameQueue.UGCFrameQueueListener, VideoDemuxer {
    private static final int MAX_FRAME_SIZE = 20;
    private static final String TAG = "VideoDemuxerFFmpeg";
    private final UGCFrameQueue<EncodedVideoFrame> mFrameQueue;
    private long mNativeHandler;
    private com.tencent.liteav.base.util.b mWorkHandler;

    public static /* synthetic */ void access$lambda$0(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
    }

    public static /* synthetic */ void access$lambda$1(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
    }

    public static /* synthetic */ void access$lambda$2(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
    }

    public static /* synthetic */ void access$lambda$3(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
    }

    private void clearFrameQueue() {
    }

    private void destroyNativeHandler() {
    }

    private void getNextEncodeVideoFrameInternal() {
    }

    public static /* synthetic */ void lambda$close$1(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
    }

    public static /* synthetic */ void lambda$open$0(VideoDemuxerFFmpeg videoDemuxerFFmpeg, String str) {
    }

    public static /* synthetic */ Boolean lambda$seek$2(VideoDemuxerFFmpeg videoDemuxerFFmpeg, long j2) throws Exception {
    }

    private static native void nativeClose(long j2);

    private static native long nativeCreate(VideoDemuxerFFmpeg videoDemuxerFFmpeg);

    private static native void nativeDestroy(long j2);

    private static native EncodedVideoFrame nativeGetNextEncodeVideoFrame(long j2);

    private static native int nativeOpen(long j2, String str);

    private static native boolean nativeSeek(long j2, long j3);

    private void runOnWorkThread(Runnable runnable) {
    }

    @Override // com.tencent.ugc.VideoDemuxer
    public void close() {
    }

    @Override // com.tencent.ugc.VideoDemuxer
    public EncodedVideoFrame getNextEncodeVideoFrame() {
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
    }

    @Override // com.tencent.ugc.VideoDemuxer
    public boolean open(String str) {
    }

    @Override // com.tencent.ugc.VideoDemuxer
    public boolean seek(long j2) {
    }
}
