package com.tencent.cloud.huiyansdkface.normal.tools;

import java.io.File;
import java.text.DateFormat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WLogger {
    private static DateFormat dateFormat;
    private static boolean isEnable;
    private static File mLocalFile;
    private static String mLocalLogName;
    private static LogInterface mLog;
    private static String mName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface LogInterface {
        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void v(String str, String str2);

        void w(String str, String str2);
    }

    private static String buildMessage(String str, String str2, Throwable th) {
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static File getLogFile(String str) {
    }

    public static void i(String str) {
    }

    public static void i(String str, Object obj) {
    }

    public static void i(String str, String str2) {
    }

    public static void localLogFileName(String str) {
    }

    private static void save2File(String str) {
    }

    public static void setEnable(boolean z, String str) {
    }

    public static void setILog(LogInterface logInterface) {
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }

    public static void writeFile(File file, String str) {
    }
}
