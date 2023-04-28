package com.umeng.commonsdk.utils;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UMUtils {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_APP_KEY = "appkey";
    private static final String KEY_CHANNEL = "channel";
    private static final String KEY_LAST_APP_KEY = "last_appkey";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_SESSION_ID = "session_id";
    private static final String KEY_SHARED_PREFERENCES_NAME = "umeng_common_config";
    public static final String MOBILE_NETWORK = "2G/3G";
    private static final String SD_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final String SP_FILE_NAME = "um_session_id";
    private static final String TAG = "UMUtils";
    public static final String UNKNOW = "";
    public static String VALUE_ABTEST_VERSION = null;
    public static String VALUE_ANALYTICS_VERSION = null;
    public static String VALUE_APM_VERSION = null;
    public static String VALUE_ASMS_VERSION = null;
    public static String VALUE_GAME_VERSION = null;
    public static String VALUE_LINK_VERSION = null;
    public static String VALUE_PUSH_VERSION = null;
    public static String VALUE_REC_VERSION_NAME = null;
    public static String VALUE_SHARE_VERSION = null;
    public static String VALUE_SMS_VERSION = null;
    public static String VALUE_VERIFY_VERSION = null;
    public static String VALUE_VISUAL_VERSION = null;
    public static final String WIFI = "Wi-Fi";
    private static final Pattern pattern = null;
    private static volatile String sAppVersionCode;
    private static volatile String sAppVersionName;
    private static Object spLock;

    public static String MD5(String str) {
    }

    private static String byte2HexFormatted(byte[] bArr) {
    }

    private static String bytes2Hex(byte[] bArr) {
    }

    public static boolean checkAndroidManifest(Context context, String str) {
    }

    public static boolean checkIntentFilterData(Context context, String str) {
    }

    public static boolean checkMetaData(Context context, String str) {
    }

    public static boolean checkPath(String str) {
    }

    public static boolean checkPermission(Context context, String str) {
    }

    public static boolean checkResource(Context context, String str, String str2) {
    }

    public static String encryptBySHA1(String str) {
    }

    public static String genId() {
    }

    public static byte[] genIv() {
    }

    public static String[] getActiveUser(Context context) {
    }

    public static String getApmFlag() {
    }

    public static String getAppHashKey(Context context) {
    }

    public static String getAppMD5Signature(Context context) {
    }

    public static String getAppName(Context context) {
    }

    public static String getAppSHA1Key(Context context) {
    }

    public static String getAppVersinoCode(Context context, String str) {
    }

    public static String getAppVersionCode(Context context) {
    }

    public static String getAppVersionName(Context context) {
    }

    public static String getAppkey(Context context) {
    }

    public static String getAppkeyByXML(Context context) {
    }

    public static Properties getBuildProp() {
    }

    public static String getCPU() {
    }

    public static String getChannel(Context context) {
    }

    public static String getChannelByXML(Context context) {
    }

    private static Class<?> getClass(String str) {
    }

    public static String getDeviceToken(Context context) {
    }

    public static String getDeviceType(Context context) {
    }

    public static String getDisplayResolution(Context context) {
    }

    public static String getFileMD5(File file) {
    }

    private static String getFlymeVersion(Properties properties) {
    }

    public static String[] getGPU(GL10 gl10) {
    }

    public static String getLastAppkey(Context context) {
    }

    public static Locale getLocale(Context context) {
    }

    public static String getMac(Context context) {
    }

    private static byte[] getMiniArray() {
    }

    public static String getMultiProcessSP(Context context, String str) {
    }

    public static String[] getNetworkAccessMode(Context context) {
    }

    public static String getNetworkOperatorName(Context context) {
    }

    public static String getOaidRequiredTime(Context context) {
    }

    public static String getOperator(Context context) {
    }

    public static String getRegisteredOperator(Context context) {
    }

    public static String getSubOSName(Context context) {
    }

    public static String getSubOSVersion(Context context) {
    }

    public static String getSystemProperty(String str, String str2) {
    }

    public static int getTargetSdkVersion(Context context) {
    }

    public static String getUMId(Context context) {
    }

    public static String getUUIDForZid(Context context) {
    }

    public static String getUmengToken(Context context) {
    }

    private static String getYunOSVersion(Properties properties) {
    }

    public static String getZid(Context context) {
    }

    public static boolean isAppInstalled(Context context, String str) {
    }

    public static boolean isApplication(Context context) {
    }

    public static boolean isDebug(Context context) {
    }

    private static boolean isFlyMe() {
    }

    public static boolean isMainProgress(Context context) {
    }

    public static boolean isSdCardWrittenable() {
    }

    private static String parseId(String str) {
    }

    private static String readStreamToString(InputStream inputStream) throws IOException {
    }

    private static void safeClose(InputStream inputStream) {
    }

    public static void saveSDKComponent() {
    }

    public static void setAppkey(Context context, String str) {
    }

    public static void setChannel(Context context, String str) {
    }

    public static void setLastAppkey(Context context, String str) {
    }

    public static void setMultiProcessSP(Context context, String str, String str2) {
    }

    public static void setUUIDForZid(Context context) {
    }

    public static String getAppVersionName(Context context, String str) {
    }
}
