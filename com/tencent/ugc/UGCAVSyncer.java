package com.tencent.ugc;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCAVSyncer {
    public long mNativeUGCAVSyncer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class SkipMode {
        private static final /* synthetic */ SkipMode[] $VALUES = null;
        public static final SkipMode NOOP = null;
        public static final SkipMode SKIP_CURRENT_FRAME = null;
        private final int mNativeValue;

        private SkipMode(String str, int i2, int i3) {
        }

        public static SkipMode valueOf(String str) {
        }

        public static SkipMode[] values() {
        }

        public final int getNativeValue() {
        }

        public static SkipMode valueOf(int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class SyncMode {
        private static final /* synthetic */ SyncMode[] $VALUES = null;
        public static final SyncMode AUDIO_MASTER = null;
        public static final SyncMode CLOCK_MASTER = null;
        public static final SyncMode INTERLEAVE_OUTPUT_WITHOUT_SKIP = null;
        public static final SyncMode OFF = null;
        public static final SyncMode VIDEO_MASTER = null;
        private final int mNativeValue;

        private SyncMode(String str, int i2, int i3) {
        }

        public static SyncMode valueOf(String str) {
        }

        public static SyncMode[] values() {
        }

        public final int getNativeValue() {
        }
    }

    private static native long nativeCreate();

    private static native void nativeDestroy(long j2);

    private static native void nativeResetClock(long j2);

    private static native void nativeSetAudioEos(long j2);

    private static native void nativeSetAudioExist(long j2, boolean z);

    private static native void nativeSetSyncMode(long j2, int i2);

    private static native void nativeSetVideoEos(long j2);

    private static native void nativeSetVideoExist(long j2, boolean z);

    private static native void nativeStart(long j2);

    private static native void nativeStop(long j2);

    private static native int nativeSyncAudio(long j2, long j3);

    private static native int nativeSyncVideo(long j2, long j3);

    public void finalize() throws Throwable {
    }

    public void resetClock() {
    }

    public void setAudioEos() {
    }

    public void setAudioExist(boolean z) {
    }

    public void setSyncMode(SyncMode syncMode) {
    }

    public void setVideoEos() {
    }

    public void setVideoExist(boolean z) {
    }

    public void start() {
    }

    public void stop() {
    }

    public SkipMode syncAudio(long j2) {
    }

    public SkipMode syncVideo(long j2) {
    }
}
