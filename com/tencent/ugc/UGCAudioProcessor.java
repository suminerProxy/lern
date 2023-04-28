package com.tencent.ugc;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.ugc.TXVideoEditConstants;
import java.util.List;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCAudioProcessor {
    private static final String TAG = "UGCAudioProcessor";
    private UGCAVSyncer mAVSyncer;
    private UGCMediaListSource mBGMSource;
    private AudioEncodedFrameListener mEncodeListener;
    private long mNativeProcessor;
    private AudioProgressListener mProgressListener;
    private UGCMediaListSource mVideoSource;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface AudioEncodedFrameListener {
        void onAudioEncodingCompleted();

        void onAudioFrameEncoded(AudioFrame audioFrame);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface AudioProgressListener {
        void onComplete(TXVideoEditConstants.TXGenerateResult tXGenerateResult);

        void onProgress(long j2);
    }

    public UGCAudioProcessor(UGCAVSyncer uGCAVSyncer, UGCMediaListSource uGCMediaListSource) {
    }

    private static native long nativeCreateProcessor(UGCAudioProcessor uGCAudioProcessor);

    private static native void nativeDestroyProcessor(long j2);

    private static native void nativeEnableBGM(long j2, boolean z);

    private static native void nativeInitialize(long j2);

    private static native void nativeSetBGMAtVideoTime(long j2, long j3);

    private static native void nativeSetBGMLoop(long j2, boolean z);

    private static native void nativeSetBGMStartTime(long j2, long j3, long j4);

    private static native void nativeSetBGMVolume(long j2, float f2);

    private static native void nativeSetEncodeParams(long j2, int i2, int i3, int i4, int i5);

    private static native void nativeSetFadeInOutDuration(long j2, long j3, long j4);

    private static native void nativeSetSpeedList(long j2, int[] iArr, long[] jArr, long[] jArr2);

    private static native void nativeSetVideoVolume(long j2, float f2);

    private static native void nativeSetVideoVolumes(long j2, float[] fArr);

    private static native void nativeStart(long j2, boolean z);

    private static native void nativeStop(long j2);

    private static native void nativeUnInitialize(long j2);

    private AudioFrame[] readNextAudioFrame(boolean z) {
    }

    @CalledByNative
    public AudioFrame createAudioFrameFromNative(int i2, int i3, long j2, int i4, int i5) {
    }

    public void destroy() {
    }

    public void initialize() {
    }

    @CalledByNative
    public void notifyEncodedDataFromNative(AudioFrame audioFrame) {
    }

    @CalledByNative
    public void notifyEncodingCompletedFromNative() {
    }

    @CalledByNative
    public void notifyPlayoutCompletedFromNative(int i2, String str) {
    }

    @CalledByNative
    public void notifyProgressFromNative(long j2) {
    }

    @CalledByNative
    public AudioFrame[] requestAudioDataFromNative() {
    }

    @CalledByNative
    public AudioFrame[] requestBGMDataFromNative() {
    }

    @CalledByNative
    public boolean requestBGMSeekFromNative(long j2) {
    }

    public void setAudioEncodedFrameListener(AudioEncodedFrameListener audioEncodedFrameListener) {
    }

    public void setBGM(String str) {
    }

    public void setBGMAtVideoTime(long j2) {
    }

    public void setBGMLoop(boolean z) {
    }

    public void setBGMStartTime(long j2, long j3) {
    }

    public void setBGMVolume(float f2) {
    }

    public void setEncodeParams(AudioEncodeParams audioEncodeParams) {
    }

    public void setFadeInOutDuration(long j2, long j3) {
    }

    public void setMediaListSource(UGCMediaListSource uGCMediaListSource) {
    }

    public void setProgressListener(AudioProgressListener audioProgressListener) {
    }

    public void setSpeedList(List<TXVideoEditConstants.TXSpeed> list) {
    }

    public void setVideoVolume(float f2) {
    }

    public void setVideoVolumes(float[] fArr) {
    }

    public void start(boolean z) {
    }

    public void stop() {
    }

    @CalledByNative
    public int syncAudioFromNative(long j2) {
    }

    public void unInitialize() {
    }
}
