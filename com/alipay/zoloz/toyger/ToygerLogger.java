package com.alipay.zoloz.toyger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ToygerLogger {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private int LOG_LEVEL;

    public int d(String str, String str2) {
    }

    public abstract int debug(String str, String str2);

    public int e(String str, String str2) {
    }

    public abstract int error(String str, String str2);

    public abstract String getStackTraceString(Throwable th);

    public int i(String str, String str2) {
    }

    public abstract int info(String str, String str2);

    public void setLogLevel(int i2) {
    }

    public int v(String str, String str2) {
    }

    public abstract int verbose(String str, String str2);

    public int w(String str, String str2) {
    }

    public abstract int warn(String str, String str2);

    public int d(String str, String str2, Throwable th) {
    }

    public int e(String str, String str2, Throwable th) {
    }

    public int i(String str, String str2, Throwable th) {
    }

    public int v(String str, String str2, Throwable th) {
    }

    public int w(String str, String str2, Throwable th) {
    }

    public int d(String str, Throwable th) {
    }

    public int e(String str, Throwable th) {
    }

    public int i(String str, Throwable th) {
    }

    public int v(String str, Throwable th) {
    }

    public int w(String str, Throwable th) {
    }
}
