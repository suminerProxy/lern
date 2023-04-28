package com.alibaba.fastjson.serializer;

import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SimplePropertyPreFilter implements PropertyPreFilter {
    private final Class<?> clazz;
    private final Set<String> excludes;
    private final Set<String> includes;
    private int maxLevel;

    public SimplePropertyPreFilter(String... strArr) {
    }

    @Override // com.alibaba.fastjson.serializer.PropertyPreFilter
    public boolean apply(JSONSerializer jSONSerializer, Object obj, String str) {
    }

    public Class<?> getClazz() {
    }

    public Set<String> getExcludes() {
    }

    public Set<String> getIncludes() {
    }

    public int getMaxLevel() {
    }

    public void setMaxLevel(int i2) {
    }

    public SimplePropertyPreFilter(Class<?> cls, String... strArr) {
    }
}
