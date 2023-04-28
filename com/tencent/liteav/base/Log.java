package com.tencent.liteav.base;

import com.tencent.liteav.base.annotations.RemovableInRelease;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final String sDeprecatedTagPrefix = "cr.";
    private static final String sTagPrefix = "cr_";
    private static final boolean useChromiumLog = true;

    private Log() {
    }

    @RemovableInRelease
    public static void d(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Object... objArr) {
    }

    private static String formatLog(String str, Throwable th, Object... objArr) {
    }

    private static String formatLogWithStack(String str, Throwable th, Object... objArr) {
    }

    @RemovableInRelease
    private static String getCallOrigin() {
    }

    public static String getStackTraceString(Throwable th) {
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
    }

    public static void i(String str, String str2, Object... objArr) {
    }

    @RemovableInRelease
    private static boolean isDebug() {
    }

    public static boolean isLoggable(String str, int i2) {
    }

    private static native void nativeWriteLogToNative(int i2, String str, String str2);

    public static String normalizeTag(String str) {
    }

    @RemovableInRelease
    public static void v(String str, String str2, Object... objArr) {
    }

    public static void w(String str, String str2, Object... objArr) {
    }

    public static void wtf(String str, String str2, Object... objArr) {
    }
}
