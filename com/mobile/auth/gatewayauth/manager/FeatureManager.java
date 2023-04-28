package com.mobile.auth.gatewayauth.manager;

import androidx.annotation.Keep;
import java.util.HashMap;

@Keep
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FeatureManager {
    public static final String FEATURE_KEY_SWITCH_CELLULAR = "switchCellularEnable";
    public static final String FEATURE_KEY_WHITE_CHECK = "whiteFileCheck";
    private static volatile FeatureManager mInstance;
    private HashMap<String, Object> mConfigs;

    private FeatureManager() {
    }

    public static FeatureManager getInstance() {
    }

    public Object get(String str) {
    }

    public void put(String str, Object obj) {
    }
}
