package com.mobile.auth.gatewayauth.manager.compat;

import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import com.mobile.auth.gatewayauth.model.TokenRet;

@SafeProtector
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface ResultCodeProcessor {
    String convertCode(String str);

    TokenRet convertErrorInfo(String str, String str2, String str3);

    String getApiLevel();
}
