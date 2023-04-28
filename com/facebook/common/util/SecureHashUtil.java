package com.facebook.common.util;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SecureHashUtil {
    private static final int BUFFER_SIZE = 4096;
    public static final byte[] HEX_CHAR_TABLE = null;

    public static String convertToHex(byte[] raw) throws UnsupportedEncodingException {
    }

    private static String makeHash(byte[] bytes, String algorithm) {
    }

    public static String makeMD5Hash(String text) {
    }

    public static String makeSHA1Hash(String text) {
    }

    public static String makeSHA1HashBase64(byte[] bytes) {
    }

    public static String makeSHA256Hash(byte[] bytes) {
    }

    public static String makeMD5Hash(byte[] bytes) {
    }

    public static String makeSHA1Hash(byte[] bytes) {
    }

    public static String makeMD5Hash(InputStream stream) throws IOException {
    }

    private static String makeHash(InputStream stream, String algorithm) throws IOException {
    }
}
