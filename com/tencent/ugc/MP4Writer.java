package com.tencent.ugc;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import java.nio.ByteBuffer;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MP4Writer {
    private static final String TAG = "MP4Writer";
    private boolean mHasAudio;
    private boolean mHasVideo;
    private MP4WriterListener mListener;
    private volatile long mNativePtr;
    private String mPath;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface MP4WriterListener {
        void onComplete(long j2);

        void onError(String str);
    }

    private static native long nativeCreate(MP4Writer mP4Writer);

    private static native void nativeDestroy(long j2);

    private static native void nativeSetHasAudio(long j2, boolean z);

    private static native void nativeSetHasVideo(long j2, boolean z);

    private static native void nativeStart(long j2, String str);

    private static native void nativeStop(long j2);

    private static native void nativeWriteAudioFrame(long j2, int i2, int i3, long j3, int i4, ByteBuffer byteBuffer);

    private static native void nativeWriteVideoFrame(long j2, int i2, int i3, int i4, int i5, long j3, long j4, ByteBuffer byteBuffer);

    public void finalize() {
    }

    @CalledByNative
    public void onComplete(long j2) {
    }

    @CalledByNative
    public void onError(String str) {
    }

    public void setHasAudio(boolean z) {
    }

    public void setHasVideo(boolean z) {
    }

    public void setListener(MP4WriterListener mP4WriterListener) {
    }

    public void setPath(String str) {
    }

    public void start() {
    }

    public void stop() {
    }

    public void writeAudioFrame(AudioFrame audioFrame) {
    }

    public void writeVideoFrame(EncodedVideoFrame encodedVideoFrame) {
    }
}
