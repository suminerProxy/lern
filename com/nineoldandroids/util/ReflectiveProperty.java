package com.nineoldandroids.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ReflectiveProperty<T, V> extends Property<T, V> {
    private static final String PREFIX_GET = "get";
    private static final String PREFIX_IS = "is";
    private static final String PREFIX_SET = "set";
    private Field mField;
    private Method mGetter;
    private Method mSetter;

    public ReflectiveProperty(Class<T> cls, Class<V> cls2, String str) {
    }

    private boolean typesMatch(Class<V> cls, Class cls2) {
    }

    @Override // com.nineoldandroids.util.Property
    public V get(T t) {
    }

    @Override // com.nineoldandroids.util.Property
    public boolean isReadOnly() {
    }

    @Override // com.nineoldandroids.util.Property
    public void set(T t, V v) {
    }
}
