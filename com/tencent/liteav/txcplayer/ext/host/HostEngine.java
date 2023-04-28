package com.tencent.liteav.txcplayer.ext.host;

import android.content.Context;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class HostEngine {
    public static final String TAG = "HostEngine";
    private static HostEngine mInstance;
    private Context mAppContext;
    private boolean mIsInit;

    private HostEngine() {
    }

    public static HostEngine getInstance() {
    }

    public boolean checkAndLoadPlugin(int i2) {
    }

    public Context getAppContext() {
    }

    public void handleSyncRequestHandleByHost(int i2, Map<String, Object> map, Map<String, Object> map2) {
    }

    public synchronized void init(Context context) {
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void sendAsyncRequestToPlugin(int i2, int i3, Map<String, Object> map, PluginCallback pluginCallback) {
    }

    public void sendSyncRequestHandleByHost(int i2, Map<String, Object> map, Map<String, Object> map2) {
    }

    public void sendSyncRequestToPlugin(int i2, int i3, Map<String, Object> map, Map<String, Object> map2) {
    }
}
