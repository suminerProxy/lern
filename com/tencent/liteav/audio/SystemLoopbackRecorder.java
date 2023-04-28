package com.tencent.liteav.audio;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.nio.ByteBuffer;
import java.util.List;

@JNINamespace("liteav::audio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SystemLoopbackRecorder {
    private static final String TAG = "SystemLoopbackRecorder";
    private static final Object mLock = null;
    private static final List<SystemLoopbackRecorder> sListeners = null;
    private volatile long mNativeSystemLoopbackRecorder;

    @CalledByNative
    public SystemLoopbackRecorder(long j2) {
    }

    private static native void nativeSetMediaProjectionSession(long j2, MediaProjection mediaProjection);

    public static void notifyMediaProjectionState(MediaProjection mediaProjection) {
    }

    @CalledByNative
    public void registerMediaProjectionListener() {
    }

    public void setMediaProjectionSession(MediaProjection mediaProjection) {
    }

    @CalledByNative
    public void unregisterMediaProjectionListener() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Recorder {

        /* renamed from: a  reason: collision with root package name */
        private AudioRecord f11339a;
        private AudioManager b;

        private static AudioRecord a(MediaProjection mediaProjection, int i2, int i3, int i4) {
        }

        @CalledByNative("Recorder")
        public int read(ByteBuffer byteBuffer, int i2) {
        }

        @CalledByNative("Recorder")
        public int startRecording(MediaProjection mediaProjection, int i2, int i3, int i4) {
        }

        @CalledByNative("Recorder")
        public void stopRecording() {
        }

        private static void a(AudioRecord audioRecord) {
        }

        private void a(int i2) {
        }
    }
}
