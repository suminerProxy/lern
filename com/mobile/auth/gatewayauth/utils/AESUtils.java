package com.mobile.auth.gatewayauth.utils;

import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@SafeProtector
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class AESUtils {
    private static final String CipherMode = "AES/CBC/PKCS7Padding";

    private static native IvParameterSpec createIV(String str);

    private static native SecretKeySpec createKey(String str);

    public static native String decrypt(String str, String str2);

    public static native byte[] decryptBase642Byte(String str, String str2, String str3);

    public static native String decryptBase642String(String str, String str2, String str3);

    public static native byte[] decryptByte2Byte(byte[] bArr, String str, String str2);

    public static native String decryptByte2String(byte[] bArr, String str, String str2);

    public static native byte[] decryptString2Byte(String str, String str2, String str3);

    public static String encrypt(String str, String str2) {
    }

    public static native String encryptByte2Base64(byte[] bArr, String str, String str2);

    public static native byte[] encryptByte2Byte(byte[] bArr, String str, String str2);

    public static native String encryptByte2String(byte[] bArr, String str, String str2);

    public static native String encryptString2Base64(String str, String str2, String str3);

    public static native byte[] encryptString2Byte(String str, String str2, String str3);

    public static native String encryptString2String(String str, String str2, String str3);
}
