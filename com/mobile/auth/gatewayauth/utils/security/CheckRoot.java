package com.mobile.auth.gatewayauth.utils.security;

import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import java.util.ArrayList;

@SafeProtector
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CheckRoot {
    private static String LOG_TAG;

    private static native synchronized boolean checkAccessRootData();

    private static native synchronized boolean checkBusybox();

    private static native boolean checkDeviceDebuggable();

    private static native synchronized boolean checkGetRootAuth();

    private static native boolean checkRootPathSU();

    private static native boolean checkRootWhichSU();

    private static native boolean checkSuperuserApk();

    private static native ArrayList<String> executeCommand(String[] strArr);

    public static native boolean isDeviceRooted();

    private static native String readFile(String str);

    private static native Boolean writeFile(String str, String str2);
}
