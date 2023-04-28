package com.google.gson.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TypeToken<T> {
    public final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    public TypeToken() {
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
    }

    public static TypeToken<?> get(Type type) {
    }

    public static TypeToken<?> getArray(Type type) {
    }

    public static TypeToken<?> getParameterized(Type type, Type... typeArr) {
    }

    public static Type getSuperclassTypeParameter(Class<?> cls) {
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
    }

    public final boolean equals(Object obj) {
    }

    public final Class<? super T> getRawType() {
    }

    public final Type getType() {
    }

    public final int hashCode() {
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
    }

    public final String toString() {
    }

    public static <T> TypeToken<T> get(Class<T> cls) {
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
    }

    public TypeToken(Type type) {
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> typeToken) {
    }

    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
    }
}
