package com.tencent.cloud.huiyansdkface.okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final OkHostnameVerifier f11099a = null;

    private OkHostnameVerifier() {
    }

    private static List<String> a(X509Certificate x509Certificate, int i2) {
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
    }

    public final boolean verifyHostname(String str, String str2) {
    }
}
