package com.baidu.platform.comapi.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.NetworkInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NetworkUtil {
    public static final int NETYPE_2G = 2;
    public static final int NETYPE_3G = 3;
    public static final int NETYPE_4G = 4;
    public static final int NETYPE_4G_UNKNOWN = 10;
    public static final int NETYPE_MOBILE_3G = 8;
    public static final int NETYPE_MOBILE_UNICOM_2G = 6;
    public static final int NETYPE_NOCON = -1;
    public static final int NETYPE_TELECOM_2G = 5;
    public static final int NETYPE_TELECOM_3G = 7;
    public static final int NETYPE_UNICOM_3G = 9;
    public static final int NETYPE_UNKNOWN = 0;
    public static final int NETYPE_WIFI = 1;
    public static String mProxyHost = "";
    public static int mProxyPort;
    public static boolean mUseProxy;

    public static NetworkInfo getActiveNetworkInfo(Context context) {
    }

    public static NetworkInfo[] getAllNetworkInfo(Context context) {
    }

    public static String getCurrentNetMode(Context context) {
    }

    public static String getNetworkOperatorInfo(Context context) {
    }

    public static int getNetworkOperatorType(Context context) {
    }

    public static boolean initConnectState() {
    }

    public static boolean isNetworkAvailable(Context context) {
    }

    public static boolean isWifiConnected(Context context) {
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isWifiState(Context context) {
    }

    public static void updateNetworkProxy(Context context) {
    }
}
