package com.mobile.auth.gatewayauth.utils.security;

import android.content.Context;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;

@SafeProtector
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class EmulatorDetector {
    private static final String TAG = "EmulatorDetector";
    private static int rating;

    private static final native String getProp(Context context, String str);

    public static native boolean isEmulator(Context context);

    private static native boolean isEmulatorAbsoluly(Context context);

    private static final native boolean mayOnEmulatorViaQEMU(Context context);
}
