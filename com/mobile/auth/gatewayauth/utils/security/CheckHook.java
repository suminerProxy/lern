package com.mobile.auth.gatewayauth.utils.security;

import com.mobile.auth.gatewayauth.annotations.SafeProtector;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CheckHook {
    public static boolean a() {
    }

    @SafeProtector
    public static native synchronized boolean isHookByJar();

    @SafeProtector
    public static native synchronized boolean isHookByStack();
}
