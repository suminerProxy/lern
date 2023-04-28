package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class JavaBeanSerializer implements ObjectSerializer {
    private static final char[] false_chars = null;
    private static final char[] true_chars = null;
    public int features;
    private final FieldSerializer[] getters;
    private final FieldSerializer[] sortedGetters;
    public final String typeKey;
    public final String typeName;

    public JavaBeanSerializer(Class<?> cls) {
    }

    private static Map<String, String> map(String... strArr) {
    }

    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
    }

    public JavaBeanSerializer(Class<?> cls, PropertyNamingStrategy propertyNamingStrategy) {
    }

    public JavaBeanSerializer(Class<?> cls, String... strArr) {
    }

    public JavaBeanSerializer(Class<?> cls, int i2, Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, PropertyNamingStrategy propertyNamingStrategy) {
    }
}
