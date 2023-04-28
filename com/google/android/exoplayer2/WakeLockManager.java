package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WakeLockManager {
    private static final String TAG = "WakeLockManager";
    private static final String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;
    @Nullable
    private final PowerManager powerManager;
    private boolean stayAwake;
    @Nullable
    private PowerManager.WakeLock wakeLock;

    public WakeLockManager(Context context) {
    }

    @SuppressLint({"WakelockTimeout"})
    private void updateWakeLock() {
    }

    public void setEnabled(boolean enabled) {
    }

    public void setStayAwake(boolean stayAwake) {
    }
}
