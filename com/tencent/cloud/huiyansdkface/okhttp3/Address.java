package com.tencent.cloud.huiyansdkface.okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Address {

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f10577a;
    private HttpUrl b;
    private Dns c;

    /* renamed from: d  reason: collision with root package name */
    private SocketFactory f10578d;

    /* renamed from: e  reason: collision with root package name */
    private Authenticator f10579e;

    /* renamed from: f  reason: collision with root package name */
    private List<Protocol> f10580f;

    /* renamed from: g  reason: collision with root package name */
    private List<ConnectionSpec> f10581g;

    /* renamed from: h  reason: collision with root package name */
    private ProxySelector f10582h;

    /* renamed from: i  reason: collision with root package name */
    private Proxy f10583i;

    /* renamed from: j  reason: collision with root package name */
    private HostnameVerifier f10584j;

    /* renamed from: k  reason: collision with root package name */
    private CertificatePinner f10585k;

    public Address(String str, int i2, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
    }

    public final boolean a(Address address) {
    }

    public final CertificatePinner certificatePinner() {
    }

    public final List<ConnectionSpec> connectionSpecs() {
    }

    public final Dns dns() {
    }

    public final boolean equals(Object obj) {
    }

    public final int hashCode() {
    }

    public final HostnameVerifier hostnameVerifier() {
    }

    public final List<Protocol> protocols() {
    }

    public final Proxy proxy() {
    }

    public final Authenticator proxyAuthenticator() {
    }

    public final ProxySelector proxySelector() {
    }

    public final SocketFactory socketFactory() {
    }

    public final SSLSocketFactory sslSocketFactory() {
    }

    public final String toString() {
    }

    public final HttpUrl url() {
    }
}
