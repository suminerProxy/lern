package com.tencent.liteav.audio.earmonitor;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::audio")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class SystemAudioKit {
    private final long mNativeSystemAudioKit;

    public SystemAudioKit(long j2) {
    }

    @CalledByNative
    public static SystemAudioKit create(long j2) {
    }

    private static native void nativeNotifyEarMonitoringInitialized(long j2, SystemAudioKit systemAudioKit, boolean z);

    private static native void nativeNotifySystemError(long j2, SystemAudioKit systemAudioKit);

    @CalledByNative
    public abstract void initialize();

    public void notifyEarMonitoringInitialized(SystemAudioKit systemAudioKit, boolean z) {
    }

    public void notifySystemError(SystemAudioKit systemAudioKit) {
    }

    @CalledByNative
    public abstract void setEarMonitoringVolume(int i2);

    @CalledByNative
    public abstract void startEarMonitoring();

    @CalledByNative
    public abstract void stopEarMonitoring();

    @CalledByNative
    public abstract void terminate();
}
