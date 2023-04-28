package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FieldDeserializer {
    public final Class<?> clazz;
    public long[] enumNameHashCodes;
    public Enum[] enums;
    public final FieldInfo fieldInfo;

    public FieldDeserializer(Class<?> cls, FieldInfo fieldInfo, int i2) {
    }

    public Enum getEnumByHashCode(long j2) {
    }

    public abstract void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map);

    public void setValue(Object obj, int i2) throws IllegalAccessException {
    }

    public void setValue(Object obj, long j2) throws IllegalAccessException {
    }

    public void setValue(Object obj, float f2) throws IllegalAccessException {
    }

    public void setValue(Object obj, double d2) throws IllegalAccessException {
    }

    public void setValue(Object obj, Object obj2) {
    }
}
