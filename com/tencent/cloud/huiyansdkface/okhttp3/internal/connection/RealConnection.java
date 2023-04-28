package com.tencent.cloud.huiyansdkface.okhttp3.internal.connection;

import com.tencent.cloud.huiyansdkface.okhttp3.Address;
import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.Connection;
import com.tencent.cloud.huiyansdkface.okhttp3.ConnectionPool;
import com.tencent.cloud.huiyansdkface.okhttp3.EventListener;
import com.tencent.cloud.huiyansdkface.okhttp3.Handshake;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient;
import com.tencent.cloud.huiyansdkface.okhttp3.Protocol;
import com.tencent.cloud.huiyansdkface.okhttp3.Route;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Stream;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.ws.RealWebSocket;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10896a;
    public int b;
    public final List<Reference<StreamAllocation>> c;

    /* renamed from: d  reason: collision with root package name */
    public long f10897d;

    /* renamed from: f  reason: collision with root package name */
    private final ConnectionPool f10898f;

    /* renamed from: g  reason: collision with root package name */
    private final Route f10899g;

    /* renamed from: h  reason: collision with root package name */
    private Socket f10900h;

    /* renamed from: i  reason: collision with root package name */
    private Socket f10901i;

    /* renamed from: j  reason: collision with root package name */
    private Handshake f10902j;

    /* renamed from: k  reason: collision with root package name */
    private Protocol f10903k;

    /* renamed from: l  reason: collision with root package name */
    private Http2Connection f10904l;

    /* renamed from: m  reason: collision with root package name */
    private BufferedSource f10905m;

    /* renamed from: n  reason: collision with root package name */
    private BufferedSink f10906n;

    /* renamed from: o  reason: collision with root package name */
    private int f10907o;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.RealConnection$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends RealWebSocket.Streams {

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ StreamAllocation f10908d;

        public AnonymousClass1(RealConnection realConnection, boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, StreamAllocation streamAllocation) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public RealConnection(ConnectionPool connectionPool, Route route) {
    }

    private void a(int i2) throws IOException {
    }

    private void a(int i2, int i3, int i4, Call call, EventListener eventListener) throws IOException {
    }

    private void a(int i2, int i3, Call call, EventListener eventListener) throws IOException {
    }

    private void a(ConnectionSpecSelector connectionSpecSelector) throws IOException {
    }

    public static RealConnection testConnection(ConnectionPool connectionPool, Route route, Socket socket, long j2) {
    }

    public final void cancel() {
    }

    public final void connect(int i2, int i3, int i4, int i5, boolean z, Call call, EventListener eventListener) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Connection
    public final Handshake handshake() {
    }

    public final boolean isEligible(Address address, Route route) {
    }

    public final boolean isHealthy(boolean z) {
    }

    public final boolean isMultiplexed() {
    }

    public final HttpCodec newCodec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation) throws SocketException {
    }

    public final RealWebSocket.Streams newWebSocketStreams(StreamAllocation streamAllocation) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection.Listener
    public final void onSettings(Http2Connection http2Connection) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Http2Connection.Listener
    public final void onStream(Http2Stream http2Stream) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Connection
    public final Protocol protocol() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Connection
    public final Route route() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Connection
    public final Socket socket() {
    }

    public final boolean supportsUrl(HttpUrl httpUrl) {
    }

    public final String toString() {
    }
}
