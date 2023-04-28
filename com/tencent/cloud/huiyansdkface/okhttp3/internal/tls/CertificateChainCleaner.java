package com.tencent.cloud.huiyansdkface.okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class CertificateChainCleaner {
    public static CertificateChainCleaner get(X509TrustManager x509TrustManager) {
    }

    public static CertificateChainCleaner get(X509Certificate... x509CertificateArr) {
    }

    public abstract List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
