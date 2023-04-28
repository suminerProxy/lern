package com.tencent.android.tpns.mqtt.logging;

import java.util.ResourceBundle;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface Logger {
    public static final int CONFIG = 4;
    public static final int FINE = 5;
    public static final int FINER = 6;
    public static final int FINEST = 7;
    public static final int INFO = 3;
    public static final int SEVERE = 1;
    public static final int WARNING = 2;

    void config(String str, String str2, String str3);

    void config(String str, String str2, String str3, Object[] objArr);

    void config(String str, String str2, String str3, Object[] objArr, Throwable th);

    void dumpTrace();

    void fine(String str, String str2, String str3);

    void fine(String str, String str2, String str3, Object[] objArr);

    void fine(String str, String str2, String str3, Object[] objArr, Throwable th);

    void finer(String str, String str2, String str3);

    void finer(String str, String str2, String str3, Object[] objArr);

    void finer(String str, String str2, String str3, Object[] objArr, Throwable th);

    void finest(String str, String str2, String str3);

    void finest(String str, String str2, String str3, Object[] objArr);

    void finest(String str, String str2, String str3, Object[] objArr, Throwable th);

    String formatMessage(String str, Object[] objArr);

    void info(String str, String str2, String str3);

    void info(String str, String str2, String str3, Object[] objArr);

    void info(String str, String str2, String str3, Object[] objArr, Throwable th);

    void initialise(ResourceBundle resourceBundle, String str, String str2);

    boolean isLoggable(int i2);

    void log(int i2, String str, String str2, String str3, Object[] objArr, Throwable th);

    void setResourceName(String str);

    void severe(String str, String str2, String str3);

    void severe(String str, String str2, String str3, Object[] objArr);

    void severe(String str, String str2, String str3, Object[] objArr, Throwable th);

    void trace(int i2, String str, String str2, String str3, Object[] objArr, Throwable th);

    void warning(String str, String str2, String str3);

    void warning(String str, String str2, String str3, Object[] objArr);

    void warning(String str, String str2, String str3, Object[] objArr, Throwable th);
}
