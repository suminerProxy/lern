package com.tencent.tpns.baseapi.base.util;

import com.tencent.tpns.baseapi.base.logger.TBaseLogger;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Logger {
    public static void d(String str, String str2) {
        TBaseLogger.d("Base-TPush - " + str, str2);
    }

    public static void e(String str, String str2) {
        TBaseLogger.e("Base-TPush - " + str, str2);
    }

    public static void i(String str, String str2) {
        TBaseLogger.i("Base-TPush - " + str, str2);
    }

    public static void ii(String str, String str2) {
        TBaseLogger.ii("Base-TPush - " + str, str2);
    }

    public static void w(String str, String str2) {
        TBaseLogger.w("Base-TPush - " + str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        TBaseLogger.e("Base-TPush - " + str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
        TBaseLogger.i("Base-TPush - " + str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        TBaseLogger.w("Base-TPush - " + str, str2, th);
    }
}
