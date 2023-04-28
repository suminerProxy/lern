package com.tencent.qcloud.tuicore;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class EventManager {
    private static final String TAG = ServiceManager.class.getSimpleName();
    private final Map<Pair<String, String>, List<ITUINotification>> eventMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EventManagerHolder {
        private static final EventManager eventManager = new EventManager();

        private EventManagerHolder() {
        }
    }

    public static EventManager getInstance() {
        return EventManagerHolder.eventManager;
    }

    public void notifyEvent(String str, String str2, Map<String, Object> map) {
        String str3 = "notifyEvent : key : " + str + ", subKey : " + str2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        List<ITUINotification> list = this.eventMap.get(new Pair(str, str2));
        if (list != null) {
            for (ITUINotification iTUINotification : list) {
                iTUINotification.onNotifyEvent(str, str2, map);
            }
        }
    }

    public void registerEvent(String str, String str2, ITUINotification iTUINotification) {
        String str3 = "registerEvent : key : " + str + ", subKey : " + str2 + ", notification : " + iTUINotification;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iTUINotification == null) {
            return;
        }
        Pair<String, String> pair = new Pair<>(str, str2);
        List<ITUINotification> list = this.eventMap.get(pair);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.eventMap.put(pair, list);
        }
        if (list.contains(iTUINotification)) {
            return;
        }
        list.add(iTUINotification);
    }

    public void unRegisterEvent(String str, String str2, ITUINotification iTUINotification) {
        String str3 = "removeEvent : key : " + str + ", subKey : " + str2 + " notification : " + iTUINotification;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || iTUINotification == null) {
            return;
        }
        List<ITUINotification> list = this.eventMap.get(new Pair(str, str2));
        if (list == null) {
            return;
        }
        list.remove(iTUINotification);
    }

    private EventManager() {
        this.eventMap = new ConcurrentHashMap();
    }

    public void unRegisterEvent(ITUINotification iTUINotification) {
        String str = "removeEvent : notification : " + iTUINotification;
        if (iTUINotification == null) {
            return;
        }
        for (Pair<String, String> pair : this.eventMap.keySet()) {
            List<ITUINotification> list = this.eventMap.get(pair);
            if (list != null) {
                Iterator<ITUINotification> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ITUINotification next = it.next();
                    if (next == iTUINotification) {
                        list.remove(next);
                        break;
                    }
                }
            }
        }
    }
}
