package com.baidu.vi;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.net.wifi.ScanResult;
import android.os.PowerManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class VDeviceAPI {

    /* renamed from: a  reason: collision with root package name */
    private static PowerManager.WakeLock f2902a;
    private static BroadcastReceiver b;

    public static String getAppVersion() {
    }

    public static long getAvailableMemory() {
    }

    public static String getCachePath() {
    }

    public static String getCellId() {
    }

    public static String getCuid() {
    }

    public static int getCurrentNetworkType() {
    }

    public static long getFreeSpace() {
    }

    public static String getImei() {
    }

    public static String getImsi() {
    }

    public static String getLac() {
    }

    public static String getModuleFileName() {
    }

    public static VNetworkInfo getNetworkInfo(int i2) {
    }

    public static String getOsVersion() {
    }

    @TargetApi(8)
    public static int getScreenBrightness() {
    }

    public static float getScreenDensity() {
    }

    public static int getScreenDensityDpi() {
    }

    public static long getSdcardFreeSpace() {
    }

    public static String getSdcardPath() {
    }

    public static long getSdcardTotalSpace() {
    }

    public static float getSystemMetricsX() {
    }

    public static float getSystemMetricsY() {
    }

    @Deprecated
    public static int getTelecomInfo() {
    }

    public static long getTotalMemory() {
    }

    public static long getTotalSpace() {
    }

    public static ScanResult[] getWifiHotpot() {
    }

    public static boolean isWifiConnected() {
    }

    public static void makeCall(String str) {
    }

    public static native void onNetworkStateChanged();

    public static void openUrl(String str) {
    }

    public static int sendMMS(String str, String str2, String str3, String str4) {
    }

    public static void sendSMS(String str, String str2) {
    }

    public static void setNetworkChangedCallback() {
    }

    public static void setScreenAlwaysOn(boolean z) {
    }

    public static void setupSoftware(String str) {
    }

    public static void unsetNetworkChangedCallback() {
    }
}
