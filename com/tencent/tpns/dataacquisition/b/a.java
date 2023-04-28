package com.tencent.tpns.dataacquisition.b;

import android.content.Context;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f13730a = true;

    public static void a(Object obj) {
        if (f13730a) {
            String str = "" + obj;
        }
    }

    public static void a(String str, Throwable th) {
        String str2 = "" + str;
    }

    public static boolean a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            a("checkPermission error", th);
            return false;
        }
    }

    public static void b(Object obj) {
        String str = "" + obj;
    }
}
