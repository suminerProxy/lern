package com.mobile.auth.gatewayauth.utils;

import android.app.Activity;
import android.app.Application;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;

@SafeProtector
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ReflectionUtils {
    private static volatile Application sApplication;

    public static native Activity getActivity();

    public static native Application getApplication();
}
