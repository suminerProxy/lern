package com.mobile.auth.gatewayauth.network;

import com.mobile.auth.gatewayauth.annotations.SafeProtector;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

@SafeProtector
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TopRequestUtils {
    private static final String APP_KEY = "25331768";
    private static final String CHARSET_UTF8 = "utf-8";
    private static final String CONTENT_ENCODING_GZIP = "gzip";
    private static final String SIGN_METHOD_HMAC = "hmac";
    private static final String SIGN_METHOD_MD5 = "md5";

    private static native Map<String, String> assembleTopParameter(String str) throws IOException;

    private static native String buildQuery(Map<String, String> map, String str) throws IOException;

    private static native String byte2hex(byte[] bArr);

    private static native String callApi(URL url, Map<String, String> map) throws IOException;

    private static String callHttpsApi(URL url, Map<String, String> map) throws IOException {
    }

    private static native byte[] encryptHMAC(String str, String str2) throws IOException;

    private static native byte[] encryptMD5(String str) throws IOException;

    private static native byte[] encryptMD5(byte[] bArr) throws IOException;

    public static native String getLifeBodyVerifyCertifyID(String str) throws IOException;

    private static native String getResponseAsString(HttpURLConnection httpURLConnection) throws IOException;

    private static native String getResponseCharset(String str);

    public static native String getSDKConfig(String str) throws IOException;

    private static native String getSecret1();

    private static native String getSecret2();

    private static native String getSecret3();

    private static native String getSecret4();

    private static native String getStreamAsString(InputStream inputStream, String str) throws IOException;

    public static native String getVendorList(String str, String str2) throws IOException;

    private static native boolean isNotEmpty(String str);

    private static native String signTopRequest(Map<String, String> map, String str, String str2) throws IOException;

    public static native String uploadUserTrackInfo(String str) throws IOException;
}
