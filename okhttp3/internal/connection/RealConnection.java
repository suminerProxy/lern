package okhttp3.internal.connection;

import cn.sharesdk.framework.InnerShareParams;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealConnection.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u0002:\u0002\u009d\u0001B\u001b\u0012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\u0006\u0010G\u001a\u00020\"¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010,JE\u0010/\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010.\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b/\u00100J'\u00106\u001a\u00020$2\u0006\u00102\u001a\u0002012\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b7\u00108J\u001f\u0010@\u001a\u00020=2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010F\u001a\u00020C2\u0006\u0010B\u001a\u00020AH\u0000¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020\"H\u0016¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u000b¢\u0006\u0004\bI\u0010,J\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020$2\u0006\u0010M\u001a\u00020$¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010X\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010ZJ'\u0010`\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\u0006\u0010[\u001a\u00020\"2\u0006\u0010]\u001a\u00020\\H\u0000¢\u0006\u0004\b^\u0010_J!\u0010e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010\\H\u0000¢\u0006\u0004\bc\u0010dJ\u000f\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kR%\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0m0l8\u0006@\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0013\u0010r\u001a\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\br\u0010sR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010t\u001a\u0004\bu\u0010s\"\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010\u007fR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u0080\u0001R(\u0010\u0081\u0001\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0005\b\u0085\u0001\u0010\u0016R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0082\u0001R\u001f\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u0010G\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u0091\u0001R\u0019\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bK\u0010\u0090\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010tR(\u0010\u0097\u0001\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0082\u0001\u001a\u0006\b\u0098\u0001\u0010\u0084\u0001\"\u0005\b\u0099\u0001\u0010\u0016R\u0019\u0010\u009a\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0082\u0001¨\u0006\u009e\u0001"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "eventListener", "", "connectTunnel", "(IIILokhttp3/Call;Lokhttp3/EventListener;)V", "connectSocket", "(IILokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectionSpecSelector", "pingIntervalMillis", "establishProtocol", "(Lokhttp3/internal/connection/ConnectionSpecSelector;ILokhttp3/Call;Lokhttp3/EventListener;)V", "startHttp2", "(I)V", "connectTls", "(Lokhttp3/internal/connection/ConnectionSpecSelector;)V", "Lokhttp3/Request;", "tunnelRequest", "Lokhttp3/HttpUrl;", "url", "createTunnel", "(IILokhttp3/Request;Lokhttp3/HttpUrl;)Lokhttp3/Request;", "createTunnelRequest", "()Lokhttp3/Request;", "", "Lokhttp3/Route;", "candidates", "", "routeMatchesAny", "(Ljava/util/List;)Z", "Lokhttp3/Handshake;", "handshake", "certificateSupportHost", "(Lokhttp3/HttpUrl;Lokhttp3/Handshake;)Z", "noNewExchanges", "()V", "noCoalescedConnections", "connectionRetryEnabled", "connect", "(IIIIZLokhttp3/Call;Lokhttp3/EventListener;)V", "Lokhttp3/Address;", InnerShareParams.ADDRESS, "routes", "isEligible$okhttp", "(Lokhttp3/Address;Ljava/util/List;)Z", "isEligible", "supportsUrl", "(Lokhttp3/HttpUrl;)Z", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "route", "()Lokhttp3/Route;", "cancel", "Ljava/net/Socket;", "socket", "()Ljava/net/Socket;", "doExtensiveChecks", "isHealthy", "(Z)Z", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "()Lokhttp3/Handshake;", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/OkHttpClient;Lokhttp3/Route;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "e", "trackFailure$okhttp", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "trackFailure", "Lokhttp3/Protocol;", "protocol", "()Lokhttp3/Protocol;", "", "toString", "()Ljava/lang/String;", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "isMultiplexed", "()Z", "Z", "getNoNewExchanges", "setNoNewExchanges", "(Z)V", "", "idleAtNs", "J", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "Lokhttp3/Protocol;", "Lokhttp3/Handshake;", "routeFailureCount", "I", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "Lokio/BufferedSource;", MessageKey.MSG_SOURCE, "Lokio/BufferedSource;", "allocationLimit", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "rawSocket", "Ljava/net/Socket;", "Lokhttp3/Route;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSink;", "successCount", "getSuccessCount$okhttp", "setSuccessCount$okhttp", "refusedStreamCount", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    @NotNull
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    private int successCount;
    private int allocationLimit = 1;
    @NotNull
    private final List<Reference<RealCall>> calls = new ArrayList();
    private long idleAtNs = Long.MAX_VALUE;

    /* compiled from: RealConnection.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/Route;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNanos", "Lokhttp3/internal/connection/RealConnection;", "newTestConnection", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;J)Lokhttp3/internal/connection/RealConnection;", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final RealConnection newTestConnection(@NotNull RealConnectionPool realConnectionPool, @NotNull Route route, @NotNull Socket socket, long j2) {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
    }

    public RealConnection(@NotNull RealConnectionPool realConnectionPool, @NotNull Route route) {
        this.connectionPool = realConnectionPool;
        this.route = route;
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        if (!peerCertificates.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String host = httpUrl.host();
            Certificate certificate = peerCertificates.get(0);
            if (certificate != null) {
                if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return false;
    }

    private final void connectSocket(int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Socket socket;
        int i4;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type == null || ((i4 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) != 1 && i4 != 2)) {
            socket = new Socket(proxy);
        } else {
            socket = address.socketFactory().createSocket();
            if (socket == null) {
                Intrinsics.throwNpe();
            }
        }
        this.rawSocket = socket;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socket.setSoTimeout(i3);
        try {
            Platform.Companion.get().connectSocket(socket, this.route.socketAddress(), i2);
            try {
                this.source = Okio.buffer(Okio.source(socket));
                this.sink = Okio.buffer(Okio.sink(socket));
            } catch (NullPointerException e2) {
                if (Intrinsics.areEqual(e2.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    private final void connectTunnel(int i2, int i3, int i4, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        for (int i5 = 0; i5 < 21; i5++) {
            connectSocket(i2, i3, call, eventListener);
            createTunnelRequest = createTunnel(i3, i4, createTunnelRequest, url);
            if (createTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int i2, int i3, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource == null) {
                Intrinsics.throwNpe();
            }
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink == null) {
                Intrinsics.throwNpe();
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.timeout().timeout(i2, timeUnit);
            bufferedSink.timeout().timeout(i3, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            if (readResponseHeaders == null) {
                Intrinsics.throwNpe();
            }
            Response build = readResponseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(build);
            int code = build.code();
            if (code == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (code == 407) {
                Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                if (authenticate != null) {
                    if (StringsKt__StringsJVMKt.equals("close", Response.header$default(build, "Connection", null, 2, null), true)) {
                        return authenticate;
                    }
                    request = authenticate;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + build.code());
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(TPNativePlayerInitConfig.BOOL_ENABLE_COLOR_MANAGEMENT).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return authenticate != null ? authenticate : build;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i2, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            List<Protocol> protocols = this.route.address().protocols();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (protocols.contains(protocol)) {
                this.socket = this.rawSocket;
                this.protocol = protocol;
                startHttp2(i2);
                return;
            }
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            return;
        }
        eventListener.secureConnectStart(call);
        connectTls(connectionSpecSelector);
        eventListener.secureConnectEnd(call, this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            startHttp2(i2);
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route : list) {
                if (route.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && Intrinsics.areEqual(this.route.socketAddress(), route.socketAddress())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startHttp2(int i2) throws IOException {
        Socket socket = this.socket;
        if (socket == null) {
            Intrinsics.throwNpe();
        }
        BufferedSource bufferedSource = this.source;
        if (bufferedSource == null) {
            Intrinsics.throwNpe();
        }
        BufferedSink bufferedSink = this.sink;
        if (bufferedSink == null) {
            Intrinsics.throwNpe();
        }
        socket.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(i2).build();
        this.http2Connection = build;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(build, false, null, 3, null);
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: IOException -> 0x00f3, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f3, blocks: (B:21:0x0090, B:23:0x0098), top: B:66:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[EDGE_INSN: B:73:0x0142->B:61:0x0142 ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, @org.jetbrains.annotations.NotNull okhttp3.Call r22, @org.jetbrains.annotations.NotNull okhttp3.EventListener r23) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void connectFailed$okhttp(@NotNull OkHttpClient okHttpClient, @NotNull Route route, @NotNull IOException iOException) {
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    @NotNull
    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    @NotNull
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    public final int getSuccessCount$okhttp() {
        return this.successCount;
    }

    @Override // okhttp3.Connection
    @Nullable
    public Handshake handshake() {
        return this.handshake;
    }

    public final boolean isEligible$okhttp(@NotNull Address address, @Nullable List<Route> list) {
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection != null && list != null && routeMatchesAny(list) && address.hostnameVerifier() == OkHostnameVerifier.INSTANCE && supportsUrl(address.url())) {
            try {
                CertificatePinner certificatePinner = address.certificatePinner();
                if (certificatePinner == null) {
                    Intrinsics.throwNpe();
                }
                String host = address.url().host();
                Handshake handshake = handshake();
                if (handshake == null) {
                    Intrinsics.throwNpe();
                }
                certificatePinner.check(host, handshake.peerCertificates());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean isHealthy(boolean z) {
        long nanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        if (socket == null) {
            Intrinsics.throwNpe();
        }
        Socket socket2 = this.socket;
        if (socket2 == null) {
            Intrinsics.throwNpe();
        }
        BufferedSource bufferedSource = this.source;
        if (bufferedSource == null) {
            Intrinsics.throwNpe();
        }
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(nanoTime);
        }
        if (nanoTime - this.idleAtNs < IDLE_CONNECTION_HEALTHY_NS || !z) {
            return true;
        }
        return Util.isHealthy(socket2, bufferedSource);
    }

    public final boolean isMultiplexed() {
        return this.http2Connection != null;
    }

    @NotNull
    public final ExchangeCodec newCodec$okhttp(@NotNull OkHttpClient okHttpClient, @NotNull RealInterceptorChain realInterceptorChain) throws SocketException {
        Socket socket = this.socket;
        if (socket == null) {
            Intrinsics.throwNpe();
        }
        BufferedSource bufferedSource = this.source;
        if (bufferedSource == null) {
            Intrinsics.throwNpe();
        }
        BufferedSink bufferedSink = this.sink;
        if (bufferedSink == null) {
            Intrinsics.throwNpe();
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bufferedSource.timeout().timeout(realInterceptorChain.getReadTimeoutMillis$okhttp(), timeUnit);
        bufferedSink.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, bufferedSource, bufferedSink);
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams$okhttp(@NotNull final Exchange exchange) throws SocketException {
        Socket socket = this.socket;
        if (socket == null) {
            Intrinsics.throwNpe();
        }
        final BufferedSource bufferedSource = this.source;
        if (bufferedSource == null) {
            Intrinsics.throwNpe();
        }
        final BufferedSink bufferedSink = this.sink;
        if (bufferedSink == null) {
            Intrinsics.throwNpe();
        }
        socket.setSoTimeout(0);
        noNewExchanges();
        return new RealWebSocket.Streams(exchange, bufferedSource, bufferedSink, true, bufferedSource, bufferedSink) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            public final /* synthetic */ Exchange $exchange;
            public final /* synthetic */ BufferedSink $sink;
            public final /* synthetic */ BufferedSource $source;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    public final void noCoalescedConnections() {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (Util.assertionsEnabled && Thread.holdsLock(realConnectionPool)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(realConnectionPool);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.connectionPool) {
            this.noCoalescedConnections = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void noNewExchanges() {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (Util.assertionsEnabled && Thread.holdsLock(realConnectionPool)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(realConnectionPool);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.connectionPool) {
            this.noNewExchanges = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(@NotNull Http2Connection http2Connection, @NotNull Settings settings) {
        synchronized (this.connectionPool) {
            this.allocationLimit = settings.getMaxConcurrentStreams();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(@NotNull Http2Stream http2Stream) throws IOException {
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.Connection
    @NotNull
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        if (protocol == null) {
            Intrinsics.throwNpe();
        }
        return protocol;
    }

    @Override // okhttp3.Connection
    @NotNull
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j2) {
        this.idleAtNs = j2;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i2) {
        this.routeFailureCount = i2;
    }

    public final void setSuccessCount$okhttp(int i2) {
        this.successCount = i2;
    }

    @Override // okhttp3.Connection
    @NotNull
    public Socket socket() {
        Socket socket = this.socket;
        if (socket == null) {
            Intrinsics.throwNpe();
        }
        return socket;
    }

    public final boolean supportsUrl(@NotNull HttpUrl httpUrl) {
        Handshake handshake;
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (Intrinsics.areEqual(httpUrl.host(), url.host())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        if (handshake == null) {
            Intrinsics.throwNpe();
        }
        return certificateSupportHost(httpUrl, handshake);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        sb.append((handshake == null || (r1 = handshake.cipherSuite()) == null) ? "none" : "none");
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final void trackFailure$okhttp(@NotNull RealCall realCall, @Nullable IOException iOException) {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (Util.assertionsEnabled && Thread.holdsLock(realConnectionPool)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(realConnectionPool);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.connectionPool) {
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i2 = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i2;
                    if (i2 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed() || (iOException instanceof ConnectionShutdownException)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
