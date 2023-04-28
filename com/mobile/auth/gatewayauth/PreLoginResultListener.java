package com.mobile.auth.gatewayauth;

import androidx.annotation.Keep;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;

@SafeProtector
@Keep
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface PreLoginResultListener {
    void onTokenFailed(String str, String str2);

    void onTokenSuccess(String str);
}
