package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.CertificateChainCleaner;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class CertificatePinner {

    /* renamed from: a  reason: collision with root package name */
    public static final CertificatePinner f10629a = null;
    private final CertificatePinProvider b;
    private final Set<Pin> c;

    /* renamed from: d  reason: collision with root package name */
    private final CertificateChainCleaner f10630d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final List<Pin> f10631a;
        private CertificatePinProvider b;

        public final Builder add(String str, String... strArr) {
        }

        public final CertificatePinner build() {
        }

        public final Builder pinProvider(CertificatePinProvider certificatePinProvider) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface CertificatePinProvider {
        String getPattern();

        Set<String> getPins();

        void onPinVerifyFailed(String str, List<String> list);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Pin {

        /* renamed from: a  reason: collision with root package name */
        public final String f10632a;
        public final String b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final ByteString f10633d;

        public Pin(String str, String str2) {
        }

        public final boolean equals(Object obj) {
        }

        public final int hashCode() {
        }

        public final String toString() {
        }
    }

    public CertificatePinner(CertificatePinProvider certificatePinProvider, CertificateChainCleaner certificateChainCleaner) {
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
    }

    private static ByteString a(X509Certificate x509Certificate) {
    }

    public static String pin(Certificate certificate) {
    }

    public final CertificatePinner a(CertificateChainCleaner certificateChainCleaner) {
    }

    public final void check(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
    }

    public final void check(String str, List<Certificate> list, boolean z) throws SSLPeerUnverifiedException {
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
    }

    public final void checkPin(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
    }

    public final boolean equals(Object obj) {
    }

    public final int hashCode() {
    }
}
