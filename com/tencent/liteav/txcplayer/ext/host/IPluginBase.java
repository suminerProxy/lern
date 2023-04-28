package com.tencent.liteav.txcplayer.ext.host;

import android.content.Context;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface IPluginBase {
    PluginInfo getPluginInfo();

    void handleAsyncRequest(int i2, int i3, Map<String, Object> map, PluginCallback pluginCallback);

    void handleSyncRequest(int i2, int i3, Map<String, Object> map, Map<String, Object> map2);

    void onCreate(Context context);

    void onDestroy();
}
