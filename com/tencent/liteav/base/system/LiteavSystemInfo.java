package com.tencent.liteav.base.system;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.r;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class LiteavSystemInfo {
    private static final int APP_SYSTEM_METHOD_DEFAULT_GET_INTERVAL_MS = 10000;
    private static final String EXT_KEY_APP_NAME = "appName";
    private static final String EXT_KEY_APP_PACKAGE_NAME = "appPackageName";
    private static final String EXT_KEY_APP_VERSION = "appVersion";
    private static final String EXT_KEY_BUILD_BOARD = "buildBoard";
    private static final String EXT_KEY_BUILD_BRAND = "buildBrand";
    private static final String EXT_KEY_BUILD_HARDWARE = "buildHardware";
    private static final String EXT_KEY_BUILD_MANUFACTURER = "buildManufacturer";
    private static final String EXT_KEY_BUILD_MODEL = "buildModel";
    private static final String EXT_KEY_BUILD_VERSION = "buildVersion";
    private static final String EXT_KEY_BUILD_VERSION_INT = "buildVersionInt";
    private static final int GET_APP_MEMORY_INTERVAL_MS = 15000;
    private static final int NETWORK_TYPE_2G = 4;
    private static final int NETWORK_TYPE_3G = 3;
    private static final int NETWORK_TYPE_4G = 2;
    private static final int NETWORK_TYPE_5G = 6;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = 1;
    private static final int NETWORK_TYPE_WIRED = 5;
    private static final String TAG = "LiteavBaseSystemInfo";
    private static final r<String> sAppName = null;
    private static final r<String> sAppPackageName = null;
    private static final r<String> sAppVersion = null;
    private static final r<String> sBoard = null;
    private static final r<String> sBrand = null;
    private static final com.tencent.liteav.base.b.a sGatewayThrottler = null;
    private static final r<String> sHardware = null;
    private static int sLastGateway;
    private static int sLastMemoryUsage;
    private static int sLastNetworkType;
    private static final r<String> sManufacturer = null;
    private static final com.tencent.liteav.base.b.a sMemoryUsageThrottler = null;
    private static final r<String> sModel = null;
    private static final com.tencent.liteav.base.b.a sNetworkTypeThrottler = null;
    private static volatile com.tencent.liteav.base.util.k sProcessStateOwner;
    private static final Object sProcessStateOwnerLock = null;
    private static final r<String> sSystemOSVersion = null;
    private static final r<Integer> sSystemOSVersionInt = null;
    private static final r<String> sUUID = null;

    @CalledByNative
    public static synchronized int getAppBackgroundState() {
    }

    @CalledByNative
    public static synchronized int getAppMemoryUsage() {
    }

    private static int getAppMemoryUsageFromSystem() {
    }

    @CalledByNative
    public static String getAppName() {
    }

    @CalledByNative
    public static String getAppPackageName() {
    }

    @CalledByNative
    public static String getAppVersion() {
    }

    public static String getBoard() {
    }

    public static String getBrand() {
    }

    @CalledByNative
    public static String getDeviceUuid() {
    }

    @CalledByNative
    public static synchronized int getGateway() {
    }

    private static int getGatewayFromSystem() {
    }

    public static String getHardware() {
    }

    @CalledByNative
    public static String getManufacturer() {
    }

    @CalledByNative
    public static String getModel() {
    }

    @CalledByNative
    public static synchronized int getNetworkType() {
    }

    private static int getNetworkTypeFromSystem() {
    }

    @CalledByNative
    public static String getSystemOSVersion() {
    }

    @CalledByNative
    public static int getSystemOSVersionInt() {
    }

    public static /* synthetic */ String lambda$static$0() throws Exception {
    }

    public static /* synthetic */ String lambda$static$1() throws Exception {
    }

    public static /* synthetic */ String lambda$static$2() throws Exception {
    }

    public static /* synthetic */ String lambda$static$3() throws Exception {
    }

    public static /* synthetic */ String lambda$static$4() throws Exception {
    }

    public static /* synthetic */ Integer lambda$static$5() throws Exception {
    }

    public static /* synthetic */ String lambda$static$6() throws Exception {
    }

    public static /* synthetic */ String lambda$static$7() throws Exception {
    }

    public static boolean setExtID(String str, String str2) {
    }
}
