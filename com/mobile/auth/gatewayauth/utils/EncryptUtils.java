package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import com.mobile.auth.gatewayauth.annotations.SafeProtector;

@SafeProtector
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class EncryptUtils {
    public static final String IV_PARAMETER_SPEC = "0000000000000000";

    public static String encrpytAESKey(String str) {
    }

    public static native String encrpytAESKey(String str, String str2);

    private static native String encrypt(String str, String str2);

    public static native String encryptInfoForCertifyId(Context context, String str, String str2, String str3, String str4, String str5);

    public static native String encryptToken(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    public static native String generateAesKey();

    private static native String getSecret1();

    private static native String getSecret2();

    private static native String getSecret3();

    private static native String getSecret4();

    public static native String noEncryptTinfo(Context context, String str, String str2);
}
