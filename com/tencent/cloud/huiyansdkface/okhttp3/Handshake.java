package com.tencent.cloud.huiyansdkface.okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Handshake {

    /* renamed from: a  reason: collision with root package name */
    private final TlsVersion f10694a;
    private final CipherSuite b;
    private final List<Certificate> c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f10695d;

    private Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
    }

    public static Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
    }

    public static Handshake get(SSLSession sSLSession) throws IOException {
    }

    public final CipherSuite cipherSuite() {
    }

    public final boolean equals(Object obj) {
    }

    public final int hashCode() {
    }

    public final List<Certificate> localCertificates() {
    }

    public final Principal localPrincipal() {
    }

    public final List<Certificate> peerCertificates() {
    }

    public final Principal peerPrincipal() {
    }

    public final TlsVersion tlsVersion() {
    }
}
