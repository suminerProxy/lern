package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    private Log() {
    }

    @Pure
    private static String appendThrowableString(String message, @Nullable Throwable throwable) {
    }

    @Pure
    public static void d(String tag, String message) {
    }

    @Pure
    public static void e(String tag, String message) {
    }

    @Pure
    public static int getLogLevel() {
    }

    @Nullable
    @Pure
    public static String getThrowableString(@Nullable Throwable throwable) {
    }

    @Pure
    public static void i(String tag, String message) {
    }

    @Pure
    private static boolean isCausedByUnknownHostException(@Nullable Throwable throwable) {
    }

    public static void setLogLevel(int logLevel2) {
    }

    public static void setLogStackTraces(boolean logStackTraces2) {
    }

    @Pure
    public static void w(String tag, String message) {
    }

    @Pure
    public static void d(String tag, String message, @Nullable Throwable throwable) {
    }

    @Pure
    public static void e(String tag, String message, @Nullable Throwable throwable) {
    }

    @Pure
    public static void i(String tag, String message, @Nullable Throwable throwable) {
    }

    @Pure
    public static void w(String tag, String message, @Nullable Throwable throwable) {
    }
}
