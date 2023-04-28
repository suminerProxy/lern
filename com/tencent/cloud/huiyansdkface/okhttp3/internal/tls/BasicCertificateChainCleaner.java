package com.tencent.cloud.huiyansdkface.okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: a  reason: collision with root package name */
    private final TrustRootIndex f11092a;

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
    }

    private static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.CertificateChainCleaner
    public final List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
    }

    public final boolean equals(Object obj) {
    }

    public final int hashCode() {
    }
}
