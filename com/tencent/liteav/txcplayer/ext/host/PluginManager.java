package com.tencent.liteav.txcplayer.ext.host;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PluginManager {
    private static final String TAG = "HostEngine-PluginManager";
    private static PluginManager mInstance;
    private List<PluginInfo> mPluginConfigList;
    private ConcurrentHashMap<Integer, IPluginBase> mPluginMap;

    private PluginManager() {
    }

    private boolean _doLoadPlugin(PluginInfo pluginInfo) {
    }

    private IPluginBase createPluginInstance(int i2, String str) {
    }

    private void doLoadPlugin() {
    }

    public static PluginManager getInstance() {
    }

    private void loadPluginConfig() {
    }

    public boolean checkAndLoadPlugin(int i2) {
    }

    public IPluginBase getPluginInstance(int i2) {
    }

    public void loadPlugin() {
    }

    public void unLoadPlugin() {
    }
}
