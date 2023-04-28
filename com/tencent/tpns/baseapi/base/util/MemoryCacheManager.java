package com.tencent.tpns.baseapi.base.util;

import java.util.HashMap;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MemoryCacheManager {

    /* renamed from: a  reason: collision with root package name */
    private static volatile HashMap<Object, Object> f13665a = new HashMap<>(10);

    public static boolean containsKey(Object obj) {
        return f13665a.containsKey(obj);
    }

    public static synchronized Object get(Object obj) {
        Object obj2;
        synchronized (MemoryCacheManager.class) {
            obj2 = f13665a.get(obj);
        }
        return obj2;
    }

    public static synchronized void put(Object obj, Object obj2) {
        synchronized (MemoryCacheManager.class) {
            f13665a.put(obj, obj2);
        }
    }

    public static synchronized Object remove(Object obj) {
        Object remove;
        synchronized (MemoryCacheManager.class) {
            remove = f13665a.remove(obj);
        }
        return remove;
    }
}
