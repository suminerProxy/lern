package com.tencent.bugly.idasc.proguard;

import android.content.Context;
import java.net.HttpURLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s {
    private static s b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f9605a;
    private Context c;

    /* renamed from: com.tencent.bugly.idasc.proguard.s$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public final X509Certificate[] getAcceptedIssuers() {
        }
    }

    private s(Context context) {
    }

    public static s a(Context context) {
    }

    private static HttpURLConnection a(String str, String str2) {
    }

    private HttpURLConnection a(String str, byte[] bArr, String str2, Map<String, String> map) {
    }

    private static Map<String, String> a(HttpURLConnection httpURLConnection) {
    }

    private static byte[] b(HttpURLConnection httpURLConnection) {
    }

    public final byte[] a(String str, byte[] bArr, v vVar, Map<String, String> map) {
    }
}
