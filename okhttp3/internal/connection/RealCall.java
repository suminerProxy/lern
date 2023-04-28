package okhttp3.internal.connection;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.cons.c;
import com.sobot.network.http.model.SobotProgress;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealCall.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001j\u0018\u00002\u00020\u0001:\u0002uvB\u001f\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010U\u001a\u00020\u001c\u0012\u0006\u0010_\u001a\u00020\b¢\u0006\u0004\bs\u0010tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010!J\u000f\u0010+\u001a\u00020\"H\u0000¢\u0006\u0004\b*\u0010$J\u001d\u0010-\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b-\u0010.J\u0017\u00104\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00103J\u0015\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J;\u0010>\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00052\u0006\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010@\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b?\u0010\u000eJ\u0011\u0010D\u001a\u0004\u0018\u00010AH\u0000¢\u0006\u0004\bB\u0010CJ\r\u0010E\u001a\u00020\u0002¢\u0006\u0004\bE\u0010\u0004J\u0017\u0010I\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\bH\u0000¢\u0006\u0004\bG\u0010HJ\r\u0010J\u001a\u00020\b¢\u0006\u0004\bJ\u0010!J\u000f\u0010L\u001a\u00020\u0014H\u0000¢\u0006\u0004\bK\u0010\u0016R\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010PR\u0016\u0010Q\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0019\u0010U\u001a\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010\u001eR(\u0010Y\u001a\u0004\u0018\u0001012\b\u0010X\u001a\u0004\u0018\u0001018\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010PR\u0016\u0010^\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010PR\u0019\u0010_\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010P\u001a\u0004\b`\u0010!R\u0019\u0010b\u001a\u00020a8\u0006@\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010PR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010PR\u0016\u0010\u0018\u001a\u00020j8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u00108R\u0018\u00109\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010Z¨\u0006w"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "", "callStart", "()V", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "e", "", "force", "maybeReleaseConnection", "(Ljava/io/IOException;Z)Ljava/io/IOException;", "cause", "timeoutExit", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Address;", "createAddress", "(Lokhttp3/HttpUrl;)Lokhttp3/Address;", "", "toLoggableString", "()Ljava/lang/String;", "Lokio/AsyncTimeout;", "timeout", "()Lokio/AsyncTimeout;", "clone", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Request;", SobotProgress.REQUEST, "()Lokhttp3/Request;", "cancel", "isCanceled", "()Z", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "isExecuted", "getResponseWithInterceptorChain$okhttp", "getResponseWithInterceptorChain", "newExchangeFinder", "enterNetworkInterceptorExchange", "(Lokhttp3/Request;Z)V", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", "connection", "acquireConnectionNoEvents", "(Lokhttp3/internal/connection/RealConnection;)V", "exchange", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "redactedUrl$okhttp", "redactedUrl", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Z", "executed", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "originalRequest", "Lokhttp3/Request;", "getOriginalRequest", "<set-?>", "interceptorScopedExchange", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "exchangeResponseDone", "exchangeRequestDone", "forWebSocket", "getForWebSocket", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "canceled", "", "callStackTrace", "Ljava/lang/Object;", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "setConnection", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class RealCall implements Call {
    private Object callStackTrace;
    private boolean canceled;
    @NotNull
    private final OkHttpClient client;
    @Nullable
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private boolean exchangeRequestDone;
    private boolean exchangeResponseDone;
    private boolean executed;
    private final boolean forWebSocket;
    @Nullable
    private Exchange interceptorScopedExchange;
    private boolean noMoreExchanges;
    @NotNull
    private final Request originalRequest;
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    /* compiled from: RealCall.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J\u0019\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0010\u001a\u00020\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0014\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/internal/connection/RealCall;", "other", "", "reuseCallsPerHostFrom", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", SobotProgress.REQUEST, "", "getHost", "()Ljava/lang/String;", c.f675f, "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/Callback;", "responseCallback", "Lokhttp3/Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class AsyncCall implements Runnable {
        @NotNull
        private volatile AtomicInteger callsPerHost = new AtomicInteger(0);
        private final Callback responseCallback;

        public AsyncCall(@NotNull Callback callback) {
            this.responseCallback = callback;
        }

        public final void executeOn(@NotNull ExecutorService executorService) {
            Dispatcher dispatcher = RealCall.this.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(dispatcher)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(dispatcher);
                throw new AssertionError(sb.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    RealCall.this.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                    RealCall.this.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                RealCall.this.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        @NotNull
        public final RealCall getCall() {
            return RealCall.this;
        }

        @NotNull
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @NotNull
        public final String getHost() {
            return RealCall.this.getOriginalRequest().url().host();
        }

        @NotNull
        public final Request getRequest() {
            return RealCall.this.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@NotNull AsyncCall asyncCall) {
            this.callsPerHost = asyncCall.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e2;
            Dispatcher dispatcher;
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + RealCall.this.redactedUrl$okhttp());
            try {
                enter();
                try {
                    z = true;
                    try {
                        this.responseCallback.onResponse(RealCall.this, RealCall.this.getResponseWithInterceptorChain$okhttp());
                        dispatcher = RealCall.this.getClient().dispatcher();
                    } catch (IOException e3) {
                        e2 = e3;
                        if (z) {
                            Platform.Companion.get().log("Callback failure for " + RealCall.this.toLoggableString(), 4, e2);
                        } else {
                            this.responseCallback.onFailure(RealCall.this, e2);
                        }
                        dispatcher = RealCall.this.getClient().dispatcher();
                        dispatcher.finished$okhttp(this);
                    } catch (Throwable th2) {
                        th = th2;
                        RealCall.this.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.responseCallback.onFailure(RealCall.this, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    z = false;
                    e2 = e4;
                } catch (Throwable th3) {
                    z = false;
                    th = th3;
                }
                dispatcher.finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "", "callStackTrace", "Ljava/lang/Object;", "getCallStackTrace", "()Ljava/lang/Object;", "referent", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class CallReference extends WeakReference<RealCall> {
        @Nullable
        private final Object callStackTrace;

        public CallReference(@NotNull RealCall realCall, @Nullable Object obj) {
            super(realCall);
            this.callStackTrace = obj;
        }

        @Nullable
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [okio.Timeout, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(@NotNull OkHttpClient okHttpClient, @NotNull Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r4 = new AsyncTimeout(this) { // from class: okhttp3.internal.connection.RealCall$timeout$1
            public final /* synthetic */ RealCall this$0;

            @Override // okio.AsyncTimeout
            public void timedOut() {
            }
        };
        r4.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r4;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000c, B:14:0x0019, B:16:0x0020, B:19:0x0026, B:21:0x002a, B:23:0x0030, B:25:0x0034, B:26:0x0036, B:28:0x003a, B:32:0x0041, B:53:0x0078, B:54:0x0083), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0078 A[Catch: all -> 0x0013, TRY_ENTER, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000c, B:14:0x0019, B:16:0x0020, B:19:0x0026, B:21:0x002a, B:23:0x0030, B:25:0x0034, B:26:0x0036, B:28:0x003a, B:32:0x0041, B:53:0x0078, B:54:0x0083), top: B:57:0x000c }] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, okhttp3.internal.connection.RealConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <E extends java.io.IOException> E maybeReleaseConnection(E r7, boolean r8) {
        /*
            r6 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            okhttp3.internal.connection.RealConnectionPool r1 = r6.connectionPool
            monitor-enter(r1)
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L16
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L11
            goto L16
        L11:
            r4 = r2
            goto L17
        L13:
            r7 = move-exception
            goto L84
        L16:
            r4 = r3
        L17:
            if (r4 == 0) goto L78
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch: java.lang.Throwable -> L13
            r0.element = r4     // Catch: java.lang.Throwable -> L13
            r5 = 0
            if (r4 == 0) goto L2f
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2f
            if (r8 != 0) goto L2a
            boolean r8 = r6.noMoreExchanges     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L2f
        L2a:
            java.net.Socket r8 = r6.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L13
            goto L30
        L2f:
            r8 = r5
        L30:
            okhttp3.internal.connection.RealConnection r4 = r6.connection     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L36
            r0.element = r5     // Catch: java.lang.Throwable -> L13
        L36:
            boolean r4 = r6.noMoreExchanges     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L40
            okhttp3.internal.connection.Exchange r4 = r6.exchange     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L40
            r4 = r3
            goto L41
        L40:
            r4 = r2
        L41:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            if (r8 == 0) goto L49
            okhttp3.internal.Util.closeQuietly(r8)
        L49:
            T r8 = r0.element
            r0 = r8
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            if (r0 == 0) goto L5c
            okhttp3.EventListener r0 = r6.eventListener
            okhttp3.Connection r8 = (okhttp3.Connection) r8
            if (r8 != 0) goto L59
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L59:
            r0.connectionReleased(r6, r8)
        L5c:
            if (r4 == 0) goto L77
            if (r7 == 0) goto L61
            r2 = r3
        L61:
            java.io.IOException r7 = r6.timeoutExit(r7)
            if (r2 == 0) goto L72
            okhttp3.EventListener r8 = r6.eventListener
            if (r7 != 0) goto L6e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L6e:
            r8.callFailed(r6, r7)
            goto L77
        L72:
            okhttp3.EventListener r8 = r6.eventListener
            r8.callEnd(r6)
        L77:
            return r7
        L78:
            java.lang.String r7 = "cannot release connection while it is in use"
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L13
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L13
            throw r8     // Catch: java.lang.Throwable -> L13
        L84:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.maybeReleaseConnection(java.io.IOException, boolean):java.io.IOException");
    }

    private final <E extends IOException> E timeoutExit(E e2) {
        if (!this.timeoutEarlyExit && exit()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (e2 != null) {
                interruptedIOException.initCause(e2);
            }
            return interruptedIOException;
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(@NotNull RealConnection realConnection) {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnectionPool)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(realConnectionPool);
            throw new AssertionError(sb.toString());
        }
        if (this.connection == null) {
            this.connection = realConnection;
            realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    public void cancel() {
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            if (this.canceled) {
                return;
            }
            this.canceled = true;
            Exchange exchange = this.exchange;
            ExchangeFinder exchangeFinder = this.exchangeFinder;
            if (exchangeFinder == null || (realConnection = exchangeFinder.connectingConnection()) == null) {
                realConnection = this.connection;
            }
            Unit unit = Unit.INSTANCE;
            if (exchange != null) {
                exchange.cancel();
            } else if (realConnection != null) {
                realConnection.cancel();
            }
            this.eventListener.canceled(this);
        }
    }

    @Override // okhttp3.Call
    public void enqueue(@NotNull Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        callStart();
        this.client.dispatcher().enqueue$okhttp(new AsyncCall(callback));
    }

    public final void enterNetworkInterceptorExchange(@NotNull Request request, boolean z) {
        if (this.interceptorScopedExchange == null) {
            if (!(this.exchange == null)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (z) {
                this.exchangeFinder = new ExchangeFinder(this.connectionPool, createAddress(request.url()), this, this.eventListener);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    @NotNull
    public Response execute() {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        if (!this.noMoreExchanges) {
            if (z) {
                Exchange exchange = this.exchange;
                if (exchange != null) {
                    exchange.detachWithViolence();
                }
                if (!(this.exchange == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            this.interceptorScopedExchange = null;
            return;
        }
        throw new IllegalStateException("released".toString());
    }

    @NotNull
    public final OkHttpClient getClient() {
        return this.client;
    }

    @Nullable
    public final RealConnection getConnection() {
        return this.connection;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @Nullable
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    @NotNull
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.interceptors()
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r11.client
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r2.add(r0)
            boolean r0 = r11.forWebSocket
            if (r0 != 0) goto L46
            okhttp3.OkHttpClient r0 = r11.client
            java.util.List r0 = r0.networkInterceptors()
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, r0)
        L46:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r1 = r11.forWebSocket
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r9 = new okhttp3.internal.http.RealInterceptorChain
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.originalRequest
            okhttp3.OkHttpClient r0 = r11.client
            int r6 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r7 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r11.client
            int r8 = r0.writeTimeoutMillis()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.originalRequest     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            okhttp3.Response r2 = r9.proceed(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.isCanceled()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.noMoreExchanges$okhttp(r1)
            return r2
        L7f:
            okhttp3.internal.Util.closeQuietly(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La1
        L8c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.noMoreExchanges$okhttp(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L9c
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        La1:
            if (r0 != 0) goto La6
            r11.noMoreExchanges$okhttp(r1)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.getResponseWithInterceptorChain$okhttp():okhttp3.Response");
    }

    @NotNull
    public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain realInterceptorChain) {
        synchronized (this.connectionPool) {
            boolean z = true;
            if (!this.noMoreExchanges) {
                if (this.exchange != null) {
                    z = false;
                }
                if (z) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        if (exchangeFinder == null) {
            Intrinsics.throwNpe();
        }
        ExchangeCodec find = exchangeFinder.find(this.client, realInterceptorChain);
        EventListener eventListener = this.eventListener;
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        if (exchangeFinder2 == null) {
            Intrinsics.throwNpe();
        }
        Exchange exchange = new Exchange(this, eventListener, exchangeFinder2, find);
        this.interceptorScopedExchange = exchange;
        synchronized (this.connectionPool) {
            this.exchange = exchange;
            this.exchangeRequestDone = false;
            this.exchangeResponseDone = false;
        }
        return exchange;
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.canceled;
        }
        return z;
    }

    @Override // okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public final <E extends IOException> E messageDone$okhttp(@NotNull Exchange exchange, boolean z, boolean z2, E e2) {
        boolean z3;
        synchronized (this.connectionPool) {
            boolean z4 = true;
            if (!Intrinsics.areEqual(exchange, this.exchange)) {
                return e2;
            }
            if (z) {
                z3 = !this.exchangeRequestDone;
                this.exchangeRequestDone = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.exchangeResponseDone) {
                    z3 = true;
                }
                this.exchangeResponseDone = true;
            }
            if (this.exchangeRequestDone && this.exchangeResponseDone && z3) {
                Exchange exchange2 = this.exchange;
                if (exchange2 == null) {
                    Intrinsics.throwNpe();
                }
                RealConnection connection$okhttp = exchange2.getConnection$okhttp();
                connection$okhttp.setSuccessCount$okhttp(connection$okhttp.getSuccessCount$okhttp() + 1);
                this.exchange = null;
            } else {
                z4 = false;
            }
            Unit unit = Unit.INSTANCE;
            return z4 ? (E) maybeReleaseConnection(e2, false) : e2;
        }
    }

    @Nullable
    public final IOException noMoreExchanges$okhttp(@Nullable IOException iOException) {
        synchronized (this.connectionPool) {
            this.noMoreExchanges = true;
            Unit unit = Unit.INSTANCE;
        }
        return maybeReleaseConnection(iOException, false);
    }

    @NotNull
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    @Nullable
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnectionPool realConnectionPool = this.connectionPool;
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnectionPool)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(realConnectionPool);
            throw new AssertionError(sb.toString());
        }
        RealConnection realConnection = this.connection;
        if (realConnection == null) {
            Intrinsics.throwNpe();
        }
        Iterator<Reference<RealCall>> it = realConnection.getCalls().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().get(), this)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            RealConnection realConnection2 = this.connection;
            if (realConnection2 == null) {
                Intrinsics.throwNpe();
            }
            realConnection2.getCalls().remove(i2);
            this.connection = null;
            if (realConnection2.getCalls().isEmpty()) {
                realConnection2.setIdleAtNs$okhttp(System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection2)) {
                    return realConnection2.socket();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        if (exchangeFinder == null) {
            Intrinsics.throwNpe();
        }
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnection(@Nullable RealConnection realConnection) {
        this.connection = realConnection;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Call
    @NotNull
    public AsyncTimeout timeout() {
        return this.timeout;
    }

    @Override // okhttp3.Call
    @NotNull
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
