package com.tencent.imsdk.common;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class IMLog {
    public static final int LOG_LEVEL_DEBUG = 3;
    public static final int LOG_LEVEL_ERROR = 6;
    public static final int LOG_LEVEL_INFO = 4;
    public static final int LOG_LEVEL_OFF = 0;
    public static final int LOG_LEVEL_VERBOSE = 2;
    public static final int LOG_LEVEL_WARN = 5;
    private static final String TAG = "IMLog";

    public static void d(String str, String str2) {
        log(3, str, str2);
    }

    public static void e(String str, String str2) {
        log(6, str, str2);
    }

    public static void i(String str, String str2) {
        log(4, str, str2);
    }

    private static void log(int i2, String str, String str2) {
        if (SystemUtil.loadIMLibrary()) {
            if (i2 >= 0 && i2 <= 6) {
                if (TextUtils.isEmpty(str)) {
                    e(TAG, "empty logTag");
                    return;
                } else if (TextUtils.isEmpty(str2)) {
                    e(TAG, "empty logContent");
                    return;
                } else {
                    nativeWriteLog(i2, str, "", 0, str2);
                    return;
                }
            }
            String str3 = TAG;
            e(str3, "invalid logLevel： " + i2);
        }
    }

    public static native void nativeWriteLog(int i2, String str, String str2, int i3, String str3);

    public static void v(String str, String str2) {
        log(2, str, str2);
    }

    public static void w(String str, String str2) {
        log(5, str, str2);
    }

    public static void writeException(String str, String str2, Throwable th) {
        if (SystemUtil.loadIMLibrary()) {
            String str3 = str2 + " exception : " + Log.getStackTraceString(th);
        }
    }
}
