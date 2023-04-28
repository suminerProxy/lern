package com.uc.crashsdk;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
    }

    private static int addDumpFile(String str, String str2, boolean z, boolean z2, int i2, boolean z3) {
    }

    private static void addHeaderInfo(String str, String str2) {
    }

    public static long cmd(int i2) {
    }

    private static int createCachedInfo(String str, int i2, int i3) {
    }

    private static boolean generateCustomLog(String str, String str2, long j2, String str3, String str4, String str5, String str6) {
    }

    public static String getCallbackInfo(String str, boolean z) {
    }

    private static String getDatasForClientJavaLog(int i2, String str) {
    }

    private static String getJavaStackTrace(Thread thread, int i2) {
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i2, long j2, int i3);

    public static native int nativeAddDumpFile(String str, String str2, boolean z, boolean z2, int i2, boolean z3);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z);

    public static native void nativeClientCloseConnection(long j2);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i2);

    public static native int nativeClientWriteData(long j2, String str);

    public static native void nativeCloseFile(int i2);

    public static native long nativeCmd(int i2, long j2, String str, Object[] objArr);

    public static native void nativeCrash(int i2, int i3);

    public static native int nativeCreateCachedInfo(String str, int i2, int i3);

    public static native String nativeDumpThreads(String str, long j2);

    public static native int nativeGenerateUnexpLog(long j2, int i2);

    public static native String nativeGet(int i2, long j2, String str);

    public static native String nativeGetCallbackInfo(String str, long j2, int i2, boolean z);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i2, boolean z);

    public static native int nativeLog(int i2, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i2, long j2, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z);

    private static void onCrashLogGenerated(String str, String str2, String str3, boolean z) {
    }

    private static void onCrashRestarting() {
    }

    private static void onKillProcess(String str, int i2, int i3) {
    }

    private static String onNativeEvent(int i2, long j2, Object[] objArr) {
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z) {
    }

    private static int registerCurrentThread(String str, int i2) {
    }

    private static int registerInfoCallback(String str, int i2, long j2, int i3) {
    }

    public static long set(int i2, boolean z) {
    }

    public static long cmd(int i2, String str) {
    }

    public static long set(int i2, long j2) {
    }

    public static long set(int i2, String str) {
    }
}
