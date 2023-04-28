package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.EventListener;
import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okhttp3.WebSocket;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.InternalCache;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.RealConnection;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.RouteDatabase;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.StreamAllocation;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.tls.CertificateChainCleaner;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Protocol> f10734a = null;
    public static final List<ConnectionSpec> b = null;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final Dispatcher c;

    /* renamed from: d  reason: collision with root package name */
    public final Proxy f10735d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Protocol> f10736e;

    /* renamed from: f  reason: collision with root package name */
    public final List<ConnectionSpec> f10737f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Interceptor> f10738g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Interceptor> f10739h;

    /* renamed from: i  reason: collision with root package name */
    public final EventListener.Factory f10740i;

    /* renamed from: j  reason: collision with root package name */
    public final ProxySelector f10741j;

    /* renamed from: k  reason: collision with root package name */
    public final CookieJar f10742k;

    /* renamed from: l  reason: collision with root package name */
    public final Cache f10743l;

    /* renamed from: m  reason: collision with root package name */
    public final InternalCache f10744m;

    /* renamed from: n  reason: collision with root package name */
    public final SocketFactory f10745n;

    /* renamed from: o  reason: collision with root package name */
    public final SSLSocketFactory f10746o;

    /* renamed from: p  reason: collision with root package name */
    public final CertificateChainCleaner f10747p;
    public final HostnameVerifier q;
    public final CertificatePinner r;
    public final Authenticator s;
    public final Authenticator t;
    public final ConnectionPool u;
    public final Dns v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final int z;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 extends Internal {
        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final void addLenient(Headers.Builder builder, String str) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final void addLenient(Headers.Builder builder, String str, String str2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final int code(Response.Builder builder) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final boolean equalsNonHost(Address address, Address address2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final boolean isInvalidHttpUrlHost(IllegalArgumentException illegalArgumentException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final Call newWebSocketCall(OkHttpClient okHttpClient, Request request) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final void put(ConnectionPool connectionPool, RealConnection realConnection) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final void setCache(Builder builder, InternalCache internalCache) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final StreamAllocation streamAllocation(Call call) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.Internal
        public final IOException timeoutExit(Call call, IOException iOException) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {
        public int A;
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public Dispatcher f10748a;
        public Proxy b;
        public List<Protocol> c;

        /* renamed from: d  reason: collision with root package name */
        public List<ConnectionSpec> f10749d;

        /* renamed from: e  reason: collision with root package name */
        public final List<Interceptor> f10750e;

        /* renamed from: f  reason: collision with root package name */
        public final List<Interceptor> f10751f;

        /* renamed from: g  reason: collision with root package name */
        public EventListener.Factory f10752g;

        /* renamed from: h  reason: collision with root package name */
        public ProxySelector f10753h;

        /* renamed from: i  reason: collision with root package name */
        public CookieJar f10754i;

        /* renamed from: j  reason: collision with root package name */
        public Cache f10755j;

        /* renamed from: k  reason: collision with root package name */
        public InternalCache f10756k;

        /* renamed from: l  reason: collision with root package name */
        public SocketFactory f10757l;

        /* renamed from: m  reason: collision with root package name */
        public SSLSocketFactory f10758m;

        /* renamed from: n  reason: collision with root package name */
        public CertificateChainCleaner f10759n;

        /* renamed from: o  reason: collision with root package name */
        public HostnameVerifier f10760o;

        /* renamed from: p  reason: collision with root package name */
        public CertificatePinner f10761p;
        public Authenticator q;
        public Authenticator r;
        public ConnectionPool s;
        public Dns t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        public Builder() {
        }

        public Builder(OkHttpClient okHttpClient) {
        }

        public final Builder addInterceptor(Interceptor interceptor) {
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
        }

        public final Builder authenticator(Authenticator authenticator) {
        }

        public final OkHttpClient build() {
        }

        public final Builder cache(Cache cache) {
        }

        public final Builder callTimeout(long j2, TimeUnit timeUnit) {
        }

        public final Builder callTimeout(Duration duration) {
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
        }

        public final Builder connectTimeout(long j2, TimeUnit timeUnit) {
        }

        public final Builder connectTimeout(Duration duration) {
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
        }

        public final Builder cookieJar(CookieJar cookieJar) {
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
        }

        public final Builder dns(Dns dns) {
        }

        public final Builder eventListener(EventListener eventListener) {
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
        }

        public final Builder followRedirects(boolean z) {
        }

        public final Builder followSslRedirects(boolean z) {
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
        }

        public final List<Interceptor> interceptors() {
        }

        public final List<Interceptor> networkInterceptors() {
        }

        public final Builder pingInterval(long j2, TimeUnit timeUnit) {
        }

        public final Builder pingInterval(Duration duration) {
        }

        public final Builder protocols(List<Protocol> list) {
        }

        public final Builder proxy(Proxy proxy) {
        }

        public final Builder proxyAuthenticator(Authenticator authenticator) {
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
        }

        public final Builder readTimeout(long j2, TimeUnit timeUnit) {
        }

        public final Builder readTimeout(Duration duration) {
        }

        public final Builder retryOnConnectionFailure(boolean z) {
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        }

        public final Builder writeTimeout(long j2, TimeUnit timeUnit) {
        }

        public final Builder writeTimeout(Duration duration) {
        }
    }

    public OkHttpClient() {
    }

    public OkHttpClient(Builder builder) {
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
    }

    public Authenticator authenticator() {
    }

    public Cache cache() {
    }

    public int callTimeoutMillis() {
    }

    public CertificatePinner certificatePinner() {
    }

    public int connectTimeoutMillis() {
    }

    public ConnectionPool connectionPool() {
    }

    public List<ConnectionSpec> connectionSpecs() {
    }

    public CookieJar cookieJar() {
    }

    public Dispatcher dispatcher() {
    }

    public Dns dns() {
    }

    public EventListener.Factory eventListenerFactory() {
    }

    public boolean followRedirects() {
    }

    public boolean followSslRedirects() {
    }

    public HostnameVerifier hostnameVerifier() {
    }

    public List<Interceptor> interceptors() {
    }

    public List<Interceptor> networkInterceptors() {
    }

    public Builder newBuilder() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Call.Factory
    public Call newCall(Request request) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
    }

    public int pingIntervalMillis() {
    }

    public List<Protocol> protocols() {
    }

    public Proxy proxy() {
    }

    public Authenticator proxyAuthenticator() {
    }

    public ProxySelector proxySelector() {
    }

    public int readTimeoutMillis() {
    }

    public boolean retryOnConnectionFailure() {
    }

    public SocketFactory socketFactory() {
    }

    public SSLSocketFactory sslSocketFactory() {
    }

    public int writeTimeoutMillis() {
    }
}
