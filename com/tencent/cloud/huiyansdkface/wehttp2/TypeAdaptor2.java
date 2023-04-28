package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.wejson.WeJsonException;
import java.lang.reflect.Type;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class TypeAdaptor2 implements TypeAdapter {
    public abstract <T> T a(String str, Type type) throws WeJsonException;

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.TypeAdapter
    public <T> T from(String str, Class<T> cls) throws WeJsonException {
    }
}
