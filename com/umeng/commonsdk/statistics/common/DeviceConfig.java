package com.umeng.commonsdk.statistics.common;

import android.app.Activity;
import android.content.Context;
import java.util.Locale;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    public static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    private static DeviceTypeEnum deviceTypeEnum;
    private static volatile boolean hasReadAndroidID;
    private static volatile boolean hasReadIDFA;
    private static volatile boolean hasReadIMEI2;
    private static volatile boolean hasReadImeiOrMeid;
    private static volatile boolean hasReadImsi;
    private static volatile boolean hasReadMac;
    private static volatile boolean hasReadOAID;
    private static volatile boolean hasReadOperator;
    private static volatile boolean hasReadOperatorName;
    private static volatile boolean hasReadSerialNo;
    private static volatile boolean hasReadSimSerialNumber;
    private static volatile String sAndroidID;
    private static volatile String sAppName;
    private static volatile String sAppPkgName;
    private static volatile String sIDFA;
    private static volatile String sImei;
    private static volatile String sImsi;
    private static volatile String sMeid;
    private static volatile String sOAID;
    private static volatile String sOperator;
    private static volatile String sOperatorName;
    private static volatile String sSecondImei;
    private static volatile String sSerialNo;
    private static volatile String sSimSerialNumber;
    private static volatile String sWifiMac;

    private static String byte2HexFormatted(byte[] bArr) {
    }

    public static boolean checkPermission(Context context, String str) {
    }

    public static String getAndroidId(Context context) {
    }

    public static String getAppHashKey(Context context) {
    }

    public static String getAppMD5Signature(Context context) {
    }

    public static String getAppName(Context context) {
    }

    public static String getAppSHA1Key(Context context) {
    }

    public static String getAppVersionCode(Context context) {
    }

    public static String getAppVersionName(Context context) {
    }

    public static String getApplicationLable(Context context) {
    }

    private static Properties getBuildProp() {
    }

    public static String getCPU() {
    }

    public static String getDBencryptID(Context context) {
    }

    public static String getDeviceId(Context context) {
    }

    public static String getDeviceIdForBox(Context context) {
    }

    public static String getDeviceIdForGeneral(Context context) {
    }

    public static String getDeviceIdType() {
    }

    public static String getDeviceIdUmengMD5(Context context) {
    }

    public static String getDeviceType(Context context) {
    }

    public static String getDisplayResolution(Context context) {
    }

    private static String getEmuiVersion(Properties properties) {
    }

    private static String getFlymeVersion(Properties properties) {
    }

    public static String[] getGPU(GL10 gl10) {
    }

    public static Activity getGlobleActivity(Context context) {
    }

    private static String getIMEI(Context context) {
    }

    public static String getIdfa(Context context) {
    }

    public static String getImei(Context context) {
    }

    public static String getImeiNew(Context context) {
    }

    public static String getImsi(Context context) {
    }

    private static Locale getLocale(Context context) {
    }

    public static String[] getLocaleInfo(Context context) {
    }

    public static String getMCCMNC(Context context) {
    }

    public static String getMac(Context context) {
    }

    private static String getMacByJavaAPI() {
    }

    private static String getMacBySystemInterface(Context context) {
    }

    private static String getMacShell() {
    }

    public static String getMeid(Context context) {
    }

    public static String[] getNetworkAccessMode(Context context) {
    }

    public static String getNetworkOperatorName(Context context) {
    }

    public static int getNetworkType(Context context) {
    }

    public static String getOaid(Context context) {
    }

    public static String getPackageName(Context context) {
    }

    public static String getRegisteredOperator(Context context) {
    }

    public static int[] getResolutionArray(Context context) {
    }

    public static String getSecondSimIMEi(Context context) {
    }

    public static String getSerial() {
    }

    private static String getSerialNo() {
    }

    public static String getSimICCID(Context context) {
    }

    public static String getSubOSName(Context context) {
    }

    public static String getSubOSVersion(Context context) {
    }

    public static int getTimeZone(Context context) {
    }

    private static String getYunOSVersion(Properties properties) {
    }

    public static boolean isChineseAera(Context context) {
    }

    private static boolean isEmui(Properties properties) {
    }

    private static boolean isFlyMe() {
    }

    public static boolean isHarmony(Context context) {
    }

    public static boolean isOnline(Context context) {
    }

    public static boolean isWiFiAvailable(Context context) {
    }

    private static String meid(Context context) {
    }

    private static String reaMac(String str) {
    }

    private static int reflectMetrics(Object obj, String str) {
    }
}
