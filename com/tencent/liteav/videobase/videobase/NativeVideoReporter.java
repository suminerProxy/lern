package com.tencent.liteav.videobase.videobase;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.videobase.h;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NativeVideoReporter implements IVideoReporter {
    private static final String TAG = "NativeVideoReporter";
    private boolean mIsConsumer;
    private long mNativeVideoReporter;

    public NativeVideoReporter(long j2, boolean z) {
    }

    private native void nativeNotifyError(long j2, int i2, String str);

    private native void nativeNotifyEvent(long j2, int i2, String str);

    private native void nativeNotifyWarning(long j2, int i2, String str);

    private native void nativeUpdateKeyStatus(long j2, int i2, int i3, double d2);

    private native void nativeUpdateKeyStatusObject(long j2, int i2, int i3, Object obj);

    private native void nativeUpdateStatus(long j2, int i2, double d2);

    private native void nativeUpdateStatusObject(long j2, int i2, Object obj);

    private native void nativeUpdateStatusString(long j2, int i2, String str);

    @Override // com.tencent.liteav.videobase.videobase.IVideoReporter
    public synchronized void notifyError(h.a aVar, String str, Object... objArr) {
    }

    @Override // com.tencent.liteav.videobase.videobase.IVideoReporter
    public synchronized void notifyEvent(h.b bVar, String str, Object... objArr) {
    }

    @Override // com.tencent.liteav.videobase.videobase.IVideoReporter
    public synchronized void notifyWarning(h.c cVar, String str, Object... objArr) {
    }

    public synchronized void reset() {
    }

    @Override // com.tencent.liteav.videobase.videobase.IVideoReporter
    public synchronized void updateStatus(i iVar, Object obj) {
    }

    @Override // com.tencent.liteav.videobase.videobase.IVideoReporter
    public synchronized void updateStatus(i iVar, int i2, Object obj) {
    }
}
