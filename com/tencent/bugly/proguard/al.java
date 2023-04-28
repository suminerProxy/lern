package com.tencent.bugly.proguard;

import java.util.Locale;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static String f9712a = "CrashReportInfo";
    public static String b = "CrashReport";
    public static boolean c;

    private static boolean a(int i2, String str, Object... objArr) {
        if (c) {
            if (str != null && objArr != null && objArr.length != 0) {
                String.format(Locale.US, str, objArr);
            }
            return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5;
        }
        return false;
    }

    public static boolean b(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public static boolean c(String str, Object... objArr) {
        return a(1, str, objArr);
    }

    public static boolean d(String str, Object... objArr) {
        return a(2, str, objArr);
    }

    public static boolean e(String str, Object... objArr) {
        return a(3, str, objArr);
    }

    public static boolean b(Throwable th) {
        return a(3, th);
    }

    private static boolean a(int i2, Throwable th) {
        if (c) {
            return a(i2, ap.a(th), new Object[0]);
        }
        return false;
    }

    public static boolean a(String str, Object... objArr) {
        return a(0, str, objArr);
    }

    public static boolean a(Class cls, String str, Object... objArr) {
        return a(0, String.format(Locale.US, "[%s] %s", cls.getSimpleName(), str), objArr);
    }

    public static boolean a(Throwable th) {
        return a(2, th);
    }
}
