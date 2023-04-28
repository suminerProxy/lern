package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.util.FieldInfo;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class FieldSerializer implements Comparable<FieldSerializer> {
    public final int features;
    public final FieldInfo fieldInfo;
    public final String format;
    public char[] name_chars;
    private RuntimeSerializerInfo runtimeInfo;
    public final boolean writeNull;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RuntimeSerializerInfo {
        public ObjectSerializer fieldSerializer;
        public Class<?> runtimeFieldClass;

        public RuntimeSerializerInfo(ObjectSerializer objectSerializer, Class<?> cls) {
        }
    }

    public FieldSerializer(FieldInfo fieldInfo) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(FieldSerializer fieldSerializer) {
    }

    public Object getPropertyValue(Object obj) throws Exception {
    }

    public void writePrefix(JSONSerializer jSONSerializer) throws IOException {
    }

    public void writeValue(JSONSerializer jSONSerializer, Object obj) throws Exception {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(FieldSerializer fieldSerializer) {
    }
}
