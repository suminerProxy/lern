package com.tencent.bugly.idasc;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Bugly {
    public static final String SDK_IS_DEV = "false";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9256a = false;
    public static Context applicationContext = null;
    private static String[] b = null;
    private static String[] c = null;
    public static boolean enable = true;
    public static Boolean isDev;

    public static synchronized String getAppChannel() {
    }

    public static void init(Context context, String str, boolean z) {
    }

    public static synchronized void init(Context context, String str, boolean z, BuglyStrategy buglyStrategy) {
    }

    public static boolean isDev() {
    }
}
