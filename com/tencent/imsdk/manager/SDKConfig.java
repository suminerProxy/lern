package com.tencent.imsdk.manager;

import com.tencent.imsdk.common.SystemUtil;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SDKConfig {
    public long sdkAppId = 0;
    public String sdkInitPath = "";
    public long sdkInstanceType = 0;
    public boolean isTestEnvironment = false;
    public boolean forceUseQuicChannel = false;
    public boolean isIPv6Prior = false;
    public String stringUIPlatform = "";
    public int numberUIPlatform = 0;
    public DeviceInfo deviceInfo = new DeviceInfo();
    public NetworkInfo networkInfo = new NetworkInfo();
    public ProxyInfo proxyInfo = new ProxyInfo();
    public DatabaseEncryptInfo databaseEncryptInfo = new DatabaseEncryptInfo();
    public PacketRetryInfo packetRetryInfo = new PacketRetryInfo();
    public LogSetting logSetting = new LogSetting();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class DatabaseEncryptInfo {
        public int encryptType = 0;
        public String encryptKey = "";

        public void clean() {
            this.encryptType = 0;
            this.encryptKey = "";
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class DeviceInfo {
        public long deviceBrand;
        public String deviceId;
        public String deviceType;
        public String systemVersion;

        public static float onGetAppCpuUsage() {
        }

        public static int onGetAppMemUsage() {
        }

        public static float onGetSysCpuUsage() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class LogSetting {
        public boolean enableConsoleLog = true;
        public int logLevel = 0;
        public String logFilePath = "";
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class NetworkInfo {
        public long initializeCostTime;
        public int ipType;
        public boolean networkConnected;
        public String networkId;
        public int networkType;
        public long wifiNetworkHandle;
        public long xgNetworkHandle;

        public void clean() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class PacketRetryInfo {
        public int maxRetryCount = 0;
        public int packetRequestTimeout = 0;

        public void clean() {
            this.maxRetryCount = 0;
            this.maxRetryCount = 0;
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ProxyInfo {
        public int proxyType = 0;
        public String proxyHost = "";
        public int proxyPort = 0;
        public String proxyUsername = "";
        public String proxyPassword = "";

        public void clean() {
            this.proxyType = 0;
            this.proxyHost = "";
            this.proxyPort = 0;
            this.proxyUsername = "";
            this.proxyPassword = "";
        }
    }

    public static float getAppCpuUsage() {
        return SystemUtil.getAppCpuUsage();
    }

    public static float getAppMemoryUsage() {
        return SystemUtil.getAppMemory();
    }

    public static float getSysCpuUsage() {
        return SystemUtil.getSysCpuUsage();
    }
}
