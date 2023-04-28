package com.tencent.liteav.sdk.common;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav::license")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class LicenseCheckerPlatformAndroid {
    private static final String ALGORITHM_AES = "AES";
    private static final String ALGORITHM_AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM_RSA = "RSA";
    private static final String ALGORITHM_SHA256WITH_RSA = "SHA256WithRSA";
    private static final String TAG = "LicenseCheckerPlatformAndroid";

    @CalledByNative
    public static String decryptLicense(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }

    @CalledByNative
    public static String getPackageFile(String str) {
    }

    @CalledByNative
    public static boolean verifyLicense(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }
}
