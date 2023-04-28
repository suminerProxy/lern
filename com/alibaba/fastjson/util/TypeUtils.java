package com.alibaba.fastjson.util;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.ParserConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TypeUtils {
    public static boolean compatibleWithJavaBean = false;
    private static volatile Map<Class, String[]> kotlinIgnores = null;
    private static volatile boolean kotlinIgnores_error = false;
    private static volatile boolean kotlin_class_klass_error = false;
    private static volatile boolean kotlin_error = false;
    private static volatile Constructor kotlin_kclass_constructor = null;
    private static volatile Method kotlin_kclass_getConstructors = null;
    private static volatile Method kotlin_kfunction_getParameters = null;
    private static volatile Method kotlin_kparameter_getName = null;
    private static volatile Class kotlin_metadata = null;
    private static volatile boolean kotlin_metadata_error = false;
    private static final ConcurrentMap<String, Class<?>> mappings = null;
    private static boolean setAccessibleEnable = true;

    public static void addMapping(String str, Class<?> cls) {
    }

    public static final <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig) {
    }

    public static final BigDecimal castToBigDecimal(Object obj) {
    }

    public static final BigInteger castToBigInteger(Object obj) {
    }

    public static final Boolean castToBoolean(Object obj) {
    }

    public static final Byte castToByte(Object obj) {
    }

    public static final byte[] castToBytes(Object obj) {
    }

    public static final Character castToChar(Object obj) {
    }

    public static final Date castToDate(Object obj) {
    }

    public static final Double castToDouble(Object obj) {
    }

    public static final <T> T castToEnum(Object obj, Class<T> cls, ParserConfig parserConfig) {
    }

    public static final Float castToFloat(Object obj) {
    }

    public static final Integer castToInt(Object obj) {
    }

    public static final <T> T castToJavaBean(Object obj, Class<T> cls) {
    }

    public static final Long castToLong(Object obj) {
    }

    public static final Short castToShort(Object obj) {
    }

    public static final String castToString(Object obj) {
    }

    public static Type checkPrimitiveArray(GenericArrayType genericArrayType) {
    }

    public static List<FieldInfo> computeGetters(Class<?> cls, int i2, boolean z, JSONType jSONType, Map<String, String> map, boolean z2, boolean z3, boolean z4, PropertyNamingStrategy propertyNamingStrategy) {
    }

    public static String decapitalize(String str) {
    }

    public static Object defaultValue(Class<?> cls) {
    }

    public static long fnv_64_lower(String str) {
    }

    public static boolean getArgument(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
    }

    public static Class<?> getClass(Type type) {
    }

    public static Class<?> getClassFromMapping(String str) {
    }

    public static Type getCollectionItemType(Type type) {
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr) {
    }

    private static Field getField0(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
    }

    public static Type getGenericParamType(Type type) {
    }

    public static String[] getKoltinConstructorParameters(Class cls) {
    }

    public static JSONField getSupperMethodAnnotation(Class<?> cls, Method method) {
    }

    public static boolean isGenericParamType(Type type) {
    }

    private static boolean isJSONTypeIgnore(Class<?> cls, JSONType jSONType, String str) {
    }

    public static boolean isKotlin(Class cls) {
    }

    private static boolean isKotlinIgnore(Class cls, String str) {
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader) {
    }

    public static double parseDouble(String str) {
    }

    public static float parseFloat(String str) {
    }

    public static boolean setAccessible(Class<?> cls, Member member, int i2) {
    }

    public static final <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig, int i2) {
    }

    public static final <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig) {
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader, boolean z) {
    }

    public static final <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig, int i2) {
    }

    public static final <T> T cast(Object obj, Type type, ParserConfig parserConfig) {
    }

    public static final <T> T cast(Object obj, ParameterizedType parameterizedType, ParserConfig parserConfig) {
    }
}
