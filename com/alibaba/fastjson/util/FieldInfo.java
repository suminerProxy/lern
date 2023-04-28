package com.alibaba.fastjson.util;

import com.alibaba.fastjson.annotation.JSONField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FieldInfo implements Comparable<FieldInfo> {
    public final String[] alternateNames;
    public final Class<?> declaringClass;
    public final Field field;
    public final boolean fieldAccess;
    private final JSONField fieldAnnotation;
    public final Class<?> fieldClass;
    public final boolean fieldTransient;
    public final Type fieldType;
    public final String format;
    public final boolean getOnly;
    public final boolean isEnum;
    public final Method method;
    private final JSONField methodAnnotation;
    public final String name;
    public final long nameHashCode;
    private int ordinal;
    public final int serialzeFeatures;

    public FieldInfo(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i2, int i3) {
    }

    public static Type getFieldType(Class<?> cls, Type type, Type type2) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(FieldInfo fieldInfo) {
    }

    public boolean equals(FieldInfo fieldInfo) {
    }

    public Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
    }

    public JSONField getAnnotation() {
    }

    public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
    }

    public String toString() {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(FieldInfo fieldInfo) {
    }

    public FieldInfo(String str, Method method, Field field, Class<?> cls, Type type, int i2, int i3, JSONField jSONField, JSONField jSONField2, boolean z) {
    }
}
