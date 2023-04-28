package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;
    @Nullable
    private WifiManager.WifiLock wifiLock;
    @Nullable
    private final WifiManager wifiManager;

    public WifiLockManager(Context context) {
    }

    private void updateWifiLock() {
    }

    public void setEnabled(boolean enabled) {
    }

    public void setStayAwake(boolean stayAwake) {
    }
}
