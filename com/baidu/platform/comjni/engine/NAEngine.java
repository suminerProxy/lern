package com.baidu.platform.comjni.engine;

import android.content.Context;
import android.os.Bundle;
import com.baidu.platform.comapi.longlink.LongLinkClient;
import com.baidu.platform.comjni.NativeComponent;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NAEngine extends NativeComponent {

    /* renamed from: a  reason: collision with root package name */
    private static LongLinkClient f2854a;
    private static boolean b;

    public static void a() {
    }

    public static boolean b() {
    }

    public static boolean c() {
    }

    public static String getIP(String str) {
    }

    public static boolean initLongLinkClient() {
    }

    private native long nativeCreate();

    private static native void nativeEnableMonitor(boolean z);

    private static native boolean nativeGetFlaxLength(Bundle bundle);

    private static native String nativeGetIP(String str);

    private static native void nativeInitCVLogFilePath(String str);

    private static native int nativeInitClass(Object obj, int i2);

    private static native boolean nativeInitEngine(Object obj, String str);

    private static native void nativeInitMonitor(String str);

    private static native void nativeMonitorAddLog(int i2, String str, String str2);

    private static native void nativeMonitorSetLogPriority(int i2);

    private static native void nativeMonitorSetOutPutType(int i2);

    private native int nativeRelease(long j2);

    private static native void nativeSetHttpsEnable(boolean z);

    private static native void nativeSetMonitorLogFilter(String[] strArr);

    private static native void nativeSetNewDomainEnable(boolean z);

    private static native void nativeSetProxyInfo(String str, int i2);

    private static native void nativeStartRunningRequest();

    private static native boolean nativeStartSocketProc();

    private static native boolean nativeStartSocketProcByCache(String str);

    private static native void nativeSyncAppRuntime(String str);

    private static native void nativeUninitCVLogFilePath();

    private static native boolean nativeUninitEngine();

    public static void restartLongLink() {
    }

    public static void startRunningRequest() {
    }

    public static void stopLongLink() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
    }

    public static boolean a(Context context, String str) {
    }

    public static void b(int i2) {
    }

    public static void a(String str) {
    }

    public static void a(int i2) {
    }

    public static void a(boolean z) {
    }

    public static void a(String[] strArr) {
    }

    public static void a(int i2, String str, String str2) {
    }
}
