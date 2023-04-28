package com.aliyun.identity.platform.network;

import com.aliyun.identity.platform.config.OSSConfig;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ZimInitCallback {
    void onError(String str, String str2);

    void onServerError(String str, String str2);

    void onSuccess(String str, OSSConfig oSSConfig, String str2);
}
