package com.tencent.qcloud.tuicore;

import android.text.TextUtils;
import com.tencent.qcloud.tuicore.interfaces.ITUIExtension;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ExtensionManager {
    private static final String TAG = "ExtensionManager";
    private final Map<String, List<ITUIExtension>> extensionHashMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ExtensionManagerHolder {
        private static final ExtensionManager extensionManager = new ExtensionManager();

        private ExtensionManagerHolder() {
        }
    }

    public static ExtensionManager getInstance() {
        return ExtensionManagerHolder.extensionManager;
    }

    public Map<String, Object> getExtensionInfo(String str, Map<String, Object> map) {
        List<ITUIExtension> list;
        String str2 = "getExtensionInfo key : " + str;
        if (TextUtils.isEmpty(str) || (list = this.extensionHashMap.get(str)) == null) {
            return null;
        }
        Iterator<ITUIExtension> it = list.iterator();
        if (it.hasNext()) {
            return it.next().onGetExtensionInfo(str, map);
        }
        return null;
    }

    public void registerExtension(String str, ITUIExtension iTUIExtension) {
        String str2 = "registerExtension key : " + str + ", extension : " + iTUIExtension;
        if (TextUtils.isEmpty(str) || iTUIExtension == null) {
            return;
        }
        List<ITUIExtension> list = this.extensionHashMap.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.extensionHashMap.put(str, list);
        }
        if (list.contains(iTUIExtension)) {
            return;
        }
        list.add(iTUIExtension);
    }

    public void unRegisterExtension(String str, ITUIExtension iTUIExtension) {
        List<ITUIExtension> list;
        String str2 = "removeExtension key : " + str + ", extension : " + iTUIExtension;
        if (TextUtils.isEmpty(str) || iTUIExtension == null || (list = this.extensionHashMap.get(str)) == null) {
            return;
        }
        list.remove(iTUIExtension);
    }

    private ExtensionManager() {
        this.extensionHashMap = new ConcurrentHashMap();
    }
}
