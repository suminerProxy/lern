package com.tencent.android.tpush.stat.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f9117a;

    public static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (d.class) {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 11) {
                        f9117a = context.getSharedPreferences(".tpush_mta", 4);
                    } else {
                        f9117a = context.getSharedPreferences(".tpush_mta", 0);
                    }
                    if (f9117a == null) {
                        f9117a = PreferenceManager.getDefaultSharedPreferences(context);
                    }
                    sharedPreferences = f9117a;
                } catch (Throwable unused) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    f9117a = defaultSharedPreferences;
                    return defaultSharedPreferences;
                }
            } catch (Throwable unused2) {
                return null;
            }
        }
        return sharedPreferences;
    }

    public static void b(Context context, String str, long j2) {
        String a2 = b.a(context, "tpush_" + str);
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(a2, j2);
        edit.commit();
    }

    public static void b(Context context, String str, int i2) {
        String a2 = b.a(context, "tpush_" + str);
        SharedPreferences.Editor edit = a(context).edit();
        edit.putInt(a2, i2);
        edit.commit();
    }

    public static long a(Context context, String str, long j2) {
        return a(context).getLong(b.a(context, "tpush_" + str), j2);
    }

    public static void b(Context context, String str, String str2) {
        String a2 = b.a(context, "tpush_" + str);
        SharedPreferences.Editor edit = a(context).edit();
        edit.putString(a2, str2);
        edit.commit();
    }

    public static int a(Context context, String str, int i2) {
        return a(context).getInt(b.a(context, "tpush_" + str), i2);
    }

    public static String a(Context context, String str, String str2) {
        return a(context).getString(b.a(context, "tpush_" + str), str2);
    }
}
