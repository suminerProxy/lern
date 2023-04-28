package com.tencent.cloud.huiyansdkface.okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {

    /* renamed from: a  reason: collision with root package name */
    private final Map<X500Principal, Set<X509Certificate>> f11093a;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
    }

    public final boolean equals(Object obj) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.TrustRootIndex
    public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
    }

    public final int hashCode() {
    }
}
