package com.nineoldandroids.util;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Property<T, V> {
    private final String mName;
    private final Class<V> mType;

    public Property(Class<V> cls, String str) {
    }

    public static <T, V> Property<T, V> of(Class<T> cls, Class<V> cls2, String str) {
    }

    public abstract V get(T t);

    public String getName() {
    }

    public Class<V> getType() {
    }

    public boolean isReadOnly() {
    }

    public void set(T t, V v) {
    }
}
