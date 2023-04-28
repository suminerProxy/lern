package com.tencent.ugc;

import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.ugc.UGCFrameQueue;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCSingleFileAudioFrameProvider implements UGCAudioFrameProvider, UGCFrameQueue.UGCFrameQueueListener {
    private static final int DEFAULT_CHANNEL_COUNT = 2;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final int MAX_FRAME_SIZE = 5;
    private static final int MUTE_AUDIO_FRAME_DURATION = 20;
    public static final String MUTE_VIRTUAL_FILE_PATH = "mute_virtual_file_path";
    private static final String TAG = "UGCAudioFileProvider";
    private final UGCFrameQueue<List<AudioFrame>> mAudioFrameQueue;
    private final Clip mClip;
    private long mCurrentTimestamp;
    private final AtomicBoolean mIsSeeking;
    private long mNativeHandle;
    private final com.tencent.liteav.base.util.b mWorkHandler;

    public UGCSingleFileAudioFrameProvider(@NonNull Clip clip, @NonNull com.tencent.liteav.base.util.b bVar) {
    }

    private void DecodeOrAppendMuteFrame() {
    }

    public static /* synthetic */ void access$lambda$0(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$1(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$2(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$3(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$4(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$5(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    public static /* synthetic */ void access$lambda$6(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    private void appendMuteFrame() {
    }

    private long fileTimeToTimelineNoSpeed(long j2) {
    }

    @CalledByNative
    private ByteBuffer getByteBufferFromAudioFrame(AudioFrame audioFrame) {
    }

    private float getTimeMultipleInSpeed(int i2) {
    }

    public static /* synthetic */ void lambda$initialize$0(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    public static /* synthetic */ void lambda$seekTo$2(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider, long j2) {
    }

    public static /* synthetic */ void lambda$uninitialize$1(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
    }

    private static native void nativeClose(long j2);

    private static native long nativeCreate(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider);

    private static native void nativeDecode(long j2);

    private static native void nativeDestroy(long j2);

    private static native long nativeGetDuration(long j2);

    private static native int nativeOpen(long j2, String str);

    private static native int nativeSeekTo(long j2, long j3);

    @CalledByNative
    private AudioFrame obtainAudioFrame(int i2, int i3, long j2, int i4) {
    }

    @CalledByNative
    private void onDecodeEndOfFile() {
    }

    @CalledByNative
    private void onDecodeError(String str) {
    }

    @CalledByNative
    private void onDecodeFrame(AudioFrame audioFrame) {
    }

    private void seekToInFileTime(long j2) {
    }

    private void startInternal() {
    }

    private void stopInternal() {
    }

    private long timelineToFileTime(long j2) {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public UGCFrameQueue<List<AudioFrame>> getFrameQueue() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void initialize() {
    }

    @Override // com.tencent.ugc.UGCFrameQueue.UGCFrameQueueListener
    public void onFrameDequeued() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void seekTo(long j2) {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void start() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void stop() {
    }

    @Override // com.tencent.ugc.UGCAudioFrameProvider
    public void uninitialize() {
    }
}
