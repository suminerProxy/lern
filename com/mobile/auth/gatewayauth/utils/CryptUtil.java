package com.mobile.auth.gatewayauth.utils;

import androidx.annotation.Keep;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

@Keep
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CryptUtil {
    private static final char[] DIGITS = null;
    private static final byte[] defaultIV = null;
    private static final String desAlgorithm = "DESede/CBC/NoPadding";
    private static final String desKeyAlgorithm = "DESede";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static char[] f5073a;
        private static byte[] b;

        public static String a(byte[] bArr) {
        }

        public static byte[] a(String str) {
        }
    }

    private static IvParameterSpec IvGenerator(byte[] bArr) {
    }

    private static SecretKey KeyGenerator(String str) throws Exception {
    }

    public static byte[] cryptBy3Des(String str, int i2, byte[] bArr, byte[] bArr2) throws Exception {
    }

    public static byte[] decryptBy3Des(byte[] bArr, String str) throws Exception {
    }

    public static String decryptBy3DesAndBase64(String str, String str2) throws Exception {
    }

    public static String decryptBy3DesAndBase64(String str, String str2, String str3) throws Exception {
    }

    public static char[] encodeHex(byte[] bArr) {
    }

    public static byte[] encryptBy3Des(byte[] bArr, String str) throws Exception {
    }

    public static String encryptBy3DesAndBase64(String str, String str2) throws Exception {
    }

    public static String encryptBy3DesAndBase64(String str, String str2, String str3) throws Exception {
    }

    public static void main(String[] strArr) throws Exception {
    }

    public static String md5Hex(String str) throws Exception {
    }
}
