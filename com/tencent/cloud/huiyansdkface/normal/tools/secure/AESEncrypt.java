package com.tencent.cloud.huiyansdkface.normal.tools.secure;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AESEncrypt {
    public static final String ALGORITHM = "AES";
    private static final String SHA1PRNG = "SHA1PRNG";
    private String ivParameter;

    public AESEncrypt() {
    }

    public AESEncrypt(String str) {
    }

    public static String generateKey() {
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
    }

    public byte[] encrypt(String str, String str2, byte[] bArr) throws Exception {
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
    }

    public String getIvParameter() {
    }

    public void setIvParameter(String str) {
    }
}
