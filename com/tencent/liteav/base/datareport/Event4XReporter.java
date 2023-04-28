package com.tencent.liteav.base.datareport;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Event4XReporter {
    private static final int INVALID_INSTANCE = 0;
    public static final int REPORT_EVENT = 1;
    public static final int REPORT_STATUS = 2;
    private static final String TAG = "Event4XReporter";
    private long mNativeEvent4XReporterAndroid;

    public Event4XReporter(int i2, int i3, String str, boolean z, int i4) {
    }

    private static native long nativeCreate(int i2, int i3, String str, boolean z, int i4);

    private static native void nativeDestroy(long j2);

    private static native int nativeGetColdDownTime(long j2);

    private static native void nativeSendReport(long j2);

    private static native void nativeSetCommonIntValue(long j2, String str, long j3);

    private static native void nativeSetCommonStringValue(long j2, String str, String str2);

    private static native void nativeSetEventIntValue(long j2, String str, long j3);

    private static native void nativeSetEventStringValue(long j2, String str, String str2);

    public int GetColdDownTime() {
    }

    public void ReportDau(int i2, int i3, String str) {
    }

    public void SendReport() {
    }

    public void SetCommonIntValue(String str, long j2) {
    }

    public void SetCommonStringValue(String str, String str2) {
    }

    public void SetEventIntValue(String str, long j2) {
    }

    public void SetEventStringValue(String str, String str2) {
    }

    public synchronized void destroy() {
    }

    public void finalize() throws Throwable {
    }
}
