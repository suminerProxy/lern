package com.mob.tools.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.k;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Data implements PublicMemberKeeper {
    public static String AES128Decode(String str, byte[] bArr) throws Throwable {
        if (str == null || bArr == null) {
            return null;
        }
        return new String(AES128Decode(str.getBytes("UTF-8"), bArr), "UTF-8");
    }

    public static byte[] AES128Encode(String str, String str2) throws Throwable {
        if (str == null || str2 == null) {
            return null;
        }
        byte[] bytes = str.getBytes("UTF-8");
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        byte[] bytes2 = str2.getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, k.a("003Vchebcf"));
        Cipher cipher = getCipher(k.a("003Ochebcf") + k.a("003e=ebee") + k.a("008@dh)eQeffheecfgfef") + k.a("0068bd[ff?bcbidd"), k.a("0024dhee"));
        cipher.init(1, secretKeySpec);
        byte[] bArr2 = new byte[cipher.getOutputSize(bytes2.length)];
        cipher.doFinal(bArr2, cipher.update(bytes2, 0, bytes2.length, bArr2, 0));
        return bArr2;
    }

    public static String AES128PaddingDecode(byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, k.a("003)chebcf"));
        Cipher cipher = getCipher(k.a("003Pchebcf") + k.a("003eTebee") + k.a("008'dh:eTeffheecfgfef") + k.a("0061bd7ffHbcbidd"), k.a("002Rdhee"));
        cipher.init(2, secretKeySpec);
        return new String(cipher.doFinal(bArr2), "UTF-8");
    }

    @Deprecated
    public static String Base64AES(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            String encodeToString = Base64.encodeToString(AES128Encode(str2, str), 0);
            return (!TextUtils.isEmpty(encodeToString) && encodeToString.contains("\n")) ? encodeToString.replace("\n", "") : encodeToString;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String CRC32(byte[] bArr) throws Throwable {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        long value = crc32.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 56)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 48)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 40)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 32)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 24)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 16)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) (value >>> 8)) & 255)));
        sb.append(String.format("%02x", Integer.valueOf(((byte) value) & 255)));
        while (sb.charAt(0) == '0') {
            sb = sb.deleteCharAt(0);
        }
        return sb.toString().toLowerCase();
    }

    public static String MD5(String str) {
        byte[] rawMD5;
        if (str == null || (rawMD5 = rawMD5(str)) == null) {
            return null;
        }
        return a(rawMD5);
    }

    public static byte[] SHA1(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return SHA1(str.getBytes("utf-8"));
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < bArr.length; i2++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i2])));
        }
        return stringBuffer.toString();
    }

    public static String byteToHex(byte[] bArr) {
        return byteToHex(bArr, 0, bArr.length);
    }

    public static Cipher getCipher(String str, String str2) throws Throwable {
        Cipher cipher = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                Provider provider = Security.getProvider(str2);
                if (provider != null) {
                    cipher = Cipher.getInstance(str, provider);
                }
            } catch (Throwable unused) {
            }
        }
        return cipher == null ? Cipher.getInstance(str, str2) : cipher;
    }

    public static byte[] rawMD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            return rawMD5(str.getBytes("utf-8"));
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String urlEncode(String str) {
        try {
            return urlEncode(str, "utf-8");
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String byteToHex(byte[] bArr, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr == null) {
            return stringBuffer.toString();
        }
        while (i2 < i3) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i2])));
            i2++;
        }
        return stringBuffer.toString();
    }

    public static String MD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return MD5(bArr, 0, bArr.length);
    }

    public static byte[] rawMD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return rawMD5(bArr, 0, bArr.length);
    }

    public static String urlEncode(String str, String str2) throws Throwable {
        String encode = TextUtils.isEmpty(str) ? "" : URLEncoder.encode(str, str2);
        return TextUtils.isEmpty(encode) ? encode : encode.replace("+", "%20");
    }

    public static byte[] AES128Decode(byte[] bArr, byte[] bArr2) throws Throwable {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, k.a("003Qchebcf"));
        Cipher cipher = getCipher(k.a("003Xchebcf") + k.a("003e(ebee") + k.a("005!dh@eVcdcaef") + k.a("006TbdCff4bcbidd"), k.a("002Jdhee"));
        cipher.init(2, secretKeySpec);
        byte[] bArr4 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr4, cipher.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public static String MD5(byte[] bArr, int i2, int i3) {
        byte[] rawMD5;
        if (bArr == null || (rawMD5 = rawMD5(bArr, i2, i3)) == null) {
            return null;
        }
        return a(rawMD5);
    }

    public static byte[] SHA1(byte[] bArr) throws Throwable {
        MessageDigest messageDigest = MessageDigest.getInstance(k.a("005-cffbchfgej"));
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static byte[] rawMD5(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i2, i3);
            byte[] rawMD5 = rawMD5(byteArrayInputStream);
            byteArrayInputStream.close();
            return rawMD5;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static String MD5(File file) {
        if (file != null && file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] rawMD5 = rawMD5(fileInputStream);
                fileInputStream.close();
                if (rawMD5 == null) {
                    return null;
                }
                return a(rawMD5);
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
            }
        }
        return null;
    }

    public static byte[] rawMD5(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance(k.a("003:egdgfc"));
            int read = inputStream.read(bArr);
            while (read != -1) {
                messageDigest.update(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            return messageDigest.digest();
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public static byte[] AES128Encode(byte[] bArr, String str) throws Throwable {
        if (bArr == null || str == null) {
            return null;
        }
        return AES128Encode(bArr, str.getBytes("UTF-8"));
    }

    public static void AES128Decode(String str, InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (str == null) {
            return;
        }
        AES128Decode(str.getBytes("UTF-8"), inputStream, outputStream);
    }

    public static byte[] AES128Encode(byte[] bArr, byte[] bArr2) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, k.a("003.chebcf"));
        Cipher cipher = getCipher(k.a("0033chebcf") + k.a("003e$ebee") + k.a("008'dhWe5effheecfgfef") + k.a("0064bd>ff8bcbidd"), k.a("002Zdhee"));
        cipher.init(1, secretKeySpec);
        byte[] bArr3 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr3, cipher.update(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    public static void AES128Decode(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (bArr == null || inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, k.a("003Zchebcf"));
        Cipher cipher = getCipher(k.a("003Qchebcf") + k.a("003e7ebee") + k.a("008Cdh3eWeffheecfgfef") + k.a("006!bd;ff?bcbidd"), k.a("002Wdhee"));
        cipher.init(2, secretKeySpec);
        CipherInputStream cipherInputStream = new CipherInputStream(inputStream, cipher);
        byte[] bArr3 = new byte[1024];
        for (int read = cipherInputStream.read(bArr3); read != -1; read = cipherInputStream.read(bArr3)) {
            outputStream.write(bArr3, 0, read);
        }
        outputStream.flush();
    }
}
