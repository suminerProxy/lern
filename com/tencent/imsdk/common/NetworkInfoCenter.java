package com.tencent.imsdk.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NetworkInfoCenter extends BroadcastReceiver {
    private static final int NETWORK_1xRTT = 107;
    private static final int NETWORK_2G3G = 2;
    private static final int NETWORK_CDMA = 104;
    private static final int NETWORK_CDMA1X = 98;
    private static final int NETWORK_EDGE = 102;
    private static final int NETWORK_EHRPD = 114;
    private static final int NETWORK_EVDO_0 = 105;
    private static final int NETWORK_EVDO_A = 106;
    private static final int NETWORK_EVDO_B = 112;
    private static final int NETWORK_GPRS = 101;
    private static final int NETWORK_HSDPA = 108;
    private static final int NETWORK_HSPA = 110;
    private static final int NETWORK_HSPAP = 115;
    private static final int NETWORK_HSUPA = 109;
    private static final int NETWORK_IDEN = 111;
    private static final int NETWORK_LTE = 113;
    private static final int NETWORK_UMTS = 103;
    private static final int NETWORK_UNKNOWN = 0;
    private static final int NETWORK_WCDMA = 99;
    private static final int NETWORK_WIFI = 1;
    private static final String TAG = null;
    public final int IP_TYPE_IPV4_ONLY;
    public final int IP_TYPE_IPV6_DUAL;
    public final int IP_TYPE_IPV6_ONLY;
    public final int IP_TYPE_UNKNOWN;
    private boolean isRegisterReceiver;
    private boolean mCheckNetworkInterface;
    private ConnectivityManager mConnectivityManager;
    private Context mContext;
    private int mIPType;
    private long mInitializeCostTime;
    private WeakReference<INetworkChangeListener> mListener;
    private boolean mNetworkConnected;
    private String mNetworkSSID;
    private int mNetworkType;
    private String mServiceProvider;
    private TelephonyManager mTelephonyManager;
    private WifiManager mWifiManager;
    private long mWifiNetworkHandle;
    private long mXgNetworkHandle;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Holder {
        public static NetworkInfoCenter instance;

        private Holder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface INetworkChangeListener {
        void onNetworkChange(boolean z, int i2, int i3, String str, long j2, long j3, long j4);
    }

    public static NetworkInfoCenter getInstance() {
    }

    private String getProviderName() {
    }

    private static long networkToNetId(Network network) {
    }

    private void onNetworkChanged(Context context, Intent intent) {
    }

    private void updateIPType() {
    }

    private void updateNetworkInterface() {
    }

    private void updateNetworkSSID() {
    }

    private void updateNetworkType(NetworkInfo networkInfo) {
    }

    private void updateProviderName() {
    }

    public int getIPType() {
    }

    public long getInitializeCostTime() {
    }

    public String getNetworkID() {
    }

    public String getNetworkSSID() {
    }

    public int getNetworkType() {
    }

    public long getWifiNetworkHandle() {
    }

    public long getXgNetworkHandle() {
    }

    public void init(Context context, INetworkChangeListener iNetworkChangeListener) {
    }

    public boolean isNetworkConnected() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }

    public void uninit() {
    }
}
