package com.sobot.chat.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LogUtils {
    public static final String LOGTYPE_ERROE = "1";
    public static final String LOGTYPE_EXCEPTION = "2";
    public static final String LOGTYPE_INFO = "3";
    public static final String LOGTYPE_INIT = "5";
    public static final String LOGTYPE_START = "4";
    private static final int MAX_LENGTH = 3072;
    public static boolean allowD = false;
    public static boolean allowE = false;
    public static boolean allowI = false;
    public static boolean allowV = false;
    public static boolean allowW = false;
    public static boolean allowWtf = false;
    private static File file = null;
    public static boolean isCache = true;
    public static boolean isDebug = false;
    private static String mAppName = "sobot_chat";
    public static int maxTime = 3;
    public static String path;

    private LogUtils() {
    }

    public static synchronized void clearAllLog() {
    }

    private static void clearLog() {
    }

    public static void d(String str) {
    }

    public static void e(String str) {
    }

    private static String generateTag() {
    }

    @SuppressLint({"SimpleDateFormat"})
    private static String getCurrentTime(String str) {
    }

    public static synchronized String getFileContent() {
    }

    public static synchronized String getLogContent() {
    }

    public static File getLogFile() {
    }

    public static String getLogFileByDate(String str) {
    }

    public static String getLogFilePath() {
    }

    public static void i(String str) {
    }

    public static synchronized void i2Local(Context context, Map<String, String> map) {
    }

    public static void init(Context context) {
    }

    public static void printLogPath() {
    }

    @SuppressLint({"SimpleDateFormat"})
    public static void save2Local(String str, String str2, String str3, Throwable th) {
    }

    public static void setCacheTime(int i2) {
    }

    public static void setIsCache(boolean z) {
    }

    public static void setIsDebug(boolean z) {
    }

    public static void setSaveDir(String str) {
    }

    public static void v(String str) {
    }

    public static void w(String str) {
    }

    public static void wtf(String str) {
    }

    public static void d(String str, Throwable th) {
    }

    public static void e(String str, Throwable th) {
    }

    public static void v(String str, Throwable th) {
    }

    public static void w(String str, Throwable th) {
    }

    public static void wtf(String str, Throwable th) {
    }

    public static void w(Throwable th) {
    }

    public static void wtf(Throwable th) {
    }

    public static void i(String str, Throwable th) {
    }

    public static synchronized void i2Local(Context context, Map<String, String> map, String str) {
    }

    public static synchronized void i2Local(Map<String, String> map, String str) {
    }

    public static synchronized void i2Local(String str, String str2) {
    }
}
