package com.alibaba.fastjson.serializer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AfterFilter implements SerializeFilter {
    private static final Character COMMA = null;
    private static final ThreadLocal<Character> seperatorLocal = null;
    private static final ThreadLocal<JSONSerializer> serializerLocal = null;

    public final char writeAfter(JSONSerializer jSONSerializer, Object obj, char c) {
    }

    public abstract void writeAfter(Object obj);

    public final void writeKeyValue(String str, Object obj) {
    }
}
