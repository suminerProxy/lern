package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.lang.reflect.Type;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SerializeConfig {
    public static final SerializeConfig globalInstance = null;
    public PropertyNamingStrategy propertyNamingStrategy;
    private final IdentityHashMap<ObjectSerializer> serializers;
    public String typeKey;

    public static final SerializeConfig getGlobalInstance() {
    }

    public ObjectSerializer get(Class<?> cls) {
    }

    public String getTypeKey() {
    }

    public boolean put(Type type, ObjectSerializer objectSerializer) {
    }

    public ObjectSerializer registerIfNotExists(Class<?> cls) {
    }

    public void setTypeKey(String str) {
    }

    public ObjectSerializer registerIfNotExists(Class<?> cls, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
