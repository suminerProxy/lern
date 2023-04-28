package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.lang.reflect.Type;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ParserConfig {
    private static long[] denyList;
    public static ParserConfig global;
    public boolean autoTypeSupport;
    public ClassLoader defaultClassLoader;
    private final IdentityHashMap<ObjectDeserializer> deserializers;
    public PropertyNamingStrategy propertyNamingStrategy;
    public final SymbolTable symbolTable;

    public static ParserConfig getGlobalInstance() {
    }

    public static boolean isPrimitive(Class<?> cls) {
    }

    public Class<?> checkAutoType(String str, Class<?> cls, int i2) {
    }

    public boolean containsKey(Class cls) {
    }

    public FieldDeserializer createFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
    }

    public ObjectDeserializer getDeserializer(Type type) {
    }

    public void putDeserializer(Type type, ObjectDeserializer objectDeserializer) {
    }

    public ObjectDeserializer registerIfNotExists(Class<?> cls) {
    }

    public ObjectDeserializer registerIfNotExists(Class<?> cls, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public ObjectDeserializer getDeserializer(Class<?> cls, Type type) {
    }
}
