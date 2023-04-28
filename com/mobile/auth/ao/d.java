package com.mobile.auth.ao;

import android.net.Network;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f4668a;

    /* renamed from: com.mobile.auth.ao.d$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements HostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4669a;

        public AnonymousClass1(d dVar) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements HostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4670a;

        public a(d dVar) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b implements X509TrustManager {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f4671a;

        public b(d dVar) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
        }
    }

    private String a(InputStream inputStream) {
    }

    public String a(String str, String str2) {
    }

    public String a(String str, HashMap<String, String> hashMap, Network network) {
    }

    public String b(String str, HashMap<String, String> hashMap, Network network) {
    }
}
