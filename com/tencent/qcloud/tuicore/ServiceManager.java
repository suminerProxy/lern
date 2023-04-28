package com.tencent.qcloud.tuicore;

import android.text.TextUtils;
import com.tencent.qcloud.tuicore.interfaces.ITUIService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ServiceManager {
    private static final String TAG = "ServiceManager";
    private final Map<String, ITUIService> serviceMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ServiceManagerHolder {
        private static final ServiceManager serviceManager = new ServiceManager();

        private ServiceManagerHolder() {
        }
    }

    public static ServiceManager getInstance() {
        return ServiceManagerHolder.serviceManager;
    }

    public Object callService(String str, String str2, Map<String, Object> map) {
        String str3 = "callService : " + str + " method : " + str2;
        ITUIService iTUIService = this.serviceMap.get(str);
        if (iTUIService != null) {
            return iTUIService.onCall(str2, map);
        }
        String str4 = "can't find service : " + str;
        return null;
    }

    public void registerService(String str, ITUIService iTUIService) {
        String str2 = "registerService : " + str + "  " + iTUIService;
        if (TextUtils.isEmpty(str) || iTUIService == null) {
            return;
        }
        this.serviceMap.put(str, iTUIService);
    }

    private ServiceManager() {
        this.serviceMap = new ConcurrentHashMap();
    }
}
