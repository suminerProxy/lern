package com.tencent.tpns.baseapi;

import android.content.Context;
import com.tencent.tpns.baseapi.base.PushPreferences;
import com.tencent.tpns.baseapi.base.util.Util;
import com.tencent.tpns.baseapi.core.a;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class XGApiConfig {

    /* renamed from: a  reason: collision with root package name */
    private static String f13618a = "";

    public static void clearRegistered(Context context) {
        a.o(context);
    }

    public static long getAccessId(Context context) {
        return a.a(context);
    }

    public static String getAccessKey(Context context) {
        return a.b(context);
    }

    public static String getBatchOpertorServerAddr(Context context) {
        return a.j(context);
    }

    public static String getCustomEvenServerAddr(Context context) {
        return a.g(context);
    }

    public static String getDebugMQTTServer(Context context) {
        if (Util.isNullOrEmptyString(f13618a)) {
            f13618a = PushPreferences.getString(context, "debug_server", "");
        }
        return f13618a;
    }

    public static String getErrCodeServerAddr(Context context) {
        return a.f(context);
    }

    public static long getFreeVersionAccessId(Context context) {
        return a.l(context);
    }

    public static String getOfflineMsgServerAddr(Context context) {
        return a.i(context);
    }

    public static String getServerSuffix(Context context) {
        return a.c(context);
    }

    public static String getStatServerAddr(Context context) {
        return a.e(context);
    }

    public static boolean isEnableService(Context context) {
        return a.m(context);
    }

    public static boolean isPowerSaveMode(Context context) {
        return a.k(context);
    }

    public static boolean isRegistered(Context context) {
        return a.p(context);
    }

    public static void setAccessId(Context context, long j2) {
        a.a(context, j2);
    }

    public static void setAccessKey(Context context, String str) {
        a.a(context, str);
    }

    public static void setCustomEvenServerAddr(Context context, String str) {
        a.f(context, str);
    }

    public static void setDebugMQTTServer(Context context, String str) {
        if (Util.isNullOrEmptyString(str) || f13618a.equals(str)) {
            return;
        }
        f13618a = str;
        PushPreferences.putString(context, "debug_server", str);
    }

    public static void setErrCodeServerAddr(Context context, String str) {
        a.e(context, str);
    }

    public static void setGuidServerAddr(Context context, String str) {
        a.c(context, str);
    }

    public static void setGuidServerAddrWithoutRefreshingTime(Context context, String str) {
        a.g(context, str);
    }

    public static void setPowerSaveMode(Context context, boolean z) {
        a.a(context, z);
    }

    public static void setRegisterSuccess(Context context) {
        a.n(context);
    }

    public static void setServerSuffix(Context context, String str) {
        a.b(context, str);
    }

    public static void setStatServerAddr(Context context, String str) {
        a.d(context, str);
    }
}
