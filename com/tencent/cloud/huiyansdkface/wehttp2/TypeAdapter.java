package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.wejson.WeJsonException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface TypeAdapter {
    <T> T from(String str, Class<T> cls) throws WeJsonException;

    <T> String to(T t);
}
