package com.alibaba.fastjson.util;

import java.lang.reflect.Type;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityHashMap<V> {
    private final Entry<V>[] buckets;
    private final int indexMask;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Entry<V> {
        public final int hashCode;
        public final Type key;
        public final Entry<V> next;
        public V value;

        public Entry(Type type, V v, int i2, Entry<V> entry) {
        }
    }

    public IdentityHashMap(int i2) {
    }

    public Class findClass(String str) {
    }

    public final V get(Type type) {
    }

    public boolean put(Type type, V v) {
    }
}
