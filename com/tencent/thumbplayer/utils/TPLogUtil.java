package com.tencent.thumbplayer.utils;

import com.tencent.thumbplayer.api.TPPlayerMgr;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPLogUtil {
    public static final int DEBUG = 50;
    public static final int ERROR = 10;
    public static final int INFO = 40;
    public static final int VERBOSE = 60;
    public static final int WARNING = 20;
    private static boolean isDebug = true;
    private static int logPrintLevel = 50;
    private static TPPlayerMgr.OnLogListener onLogListener;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void e(String str, Throwable th) {
    }

    public static void e(String str, Throwable th, String str2) {
    }

    public static void i(String str, String str2) {
    }

    private static void logToLogListener(int i2, String str, String str2) {
    }

    private static void printTag(int i2, String str, String str2, Object... objArr) {
    }

    public static void setDebugEnable(boolean z) {
    }

    public static void setLogPrintLevel(int i2) {
    }

    public static void setOnLogListener(TPPlayerMgr.OnLogListener onLogListener2) {
    }

    private static int toSysLevel(int i2) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }
}
