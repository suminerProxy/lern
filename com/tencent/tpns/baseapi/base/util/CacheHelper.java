package com.tencent.tpns.baseapi.base.util;

import android.content.Context;
import com.tencent.tpns.baseapi.base.logger.TBaseLogger;
import com.tencent.tpns.baseapi.core.a.a;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CacheHelper {

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Key<T> {
        public String file;
        public boolean md5Key;
        public boolean multiProcess;
        public String name;
        public boolean useMemoryCache;
        public T value;

        public Key(String str, String str2, T t) {
            this.file = str;
            this.name = str2;
            if (t != null) {
                this.value = t;
                return;
            }
            throw new IllegalArgumentException("default value can not be null");
        }

        public Key<T> file(String str) {
            this.file = str;
            return this;
        }

        public Key<T> name(String str) {
            this.name = str;
            return this;
        }

        public Key<T> set(T t) {
            this.value = t;
            return this;
        }
    }

    public static <T> T get(Context context, Key<T> key) {
        Context context2 = TGlobalHelper.getContext(context);
        if (key == null || context2 == null) {
            TBaseLogger.w("BaseCache", "action - get, key or context was null");
        }
        return (T) a.a(context2, key);
    }

    public static void set(Context context, Key<?>... keyArr) {
        Context context2 = TGlobalHelper.getContext(context);
        if (keyArr == null || context2 == null) {
            TBaseLogger.w("BaseCache", "action - set, key or context was null");
        }
        a.a(context2, keyArr);
    }
}
