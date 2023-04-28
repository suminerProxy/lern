package com.tencent.cloud.huiyansdkface.okhttp3;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ConnectionSpec {

    /* renamed from: a  reason: collision with root package name */
    public static final ConnectionSpec f10656a = null;
    public static final ConnectionSpec b = null;

    /* renamed from: g  reason: collision with root package name */
    private static final CipherSuite[] f10657g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final CipherSuite[] f10658h = null;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10659d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f10660e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f10661f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10662a;
        public String[] b;
        public String[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10663d;

        public Builder(ConnectionSpec connectionSpec) {
        }

        public Builder(boolean z) {
        }

        public final Builder allEnabledCipherSuites() {
        }

        public final Builder allEnabledTlsVersions() {
        }

        public final ConnectionSpec build() {
        }

        public final Builder cipherSuites(CipherSuite... cipherSuiteArr) {
        }

        public final Builder cipherSuites(String... strArr) {
        }

        public final Builder supportsTlsExtensions(boolean z) {
        }

        public final Builder tlsVersions(TlsVersion... tlsVersionArr) {
        }

        public final Builder tlsVersions(String... strArr) {
        }
    }

    public ConnectionSpec(Builder builder) {
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
    }

    public final List<CipherSuite> cipherSuites() {
    }

    public final boolean equals(Object obj) {
    }

    public final int hashCode() {
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
    }

    public final boolean isTls() {
    }

    public final boolean supportsTlsExtensions() {
    }

    public final List<TlsVersion> tlsVersions() {
    }

    public final String toString() {
    }
}
