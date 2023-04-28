package com.tencent.cloud.huiyansdkface.facelight.api.listeners;

import com.tencent.cloud.huiyansdkface.facelight.api.result.WbFaceError;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface WbCloudFaceVerifyLoginListener {
    void onLoginFailed(WbFaceError wbFaceError);

    void onLoginSuccess();
}
