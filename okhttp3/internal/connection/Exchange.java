package okhttp3.internal.connection;

import androidx.exifinterface.media.ExifInterface;
import com.sobot.network.http.model.SobotProgress;
import com.tencent.android.tpush.common.MessageKey;
import java.io.IOException;
import java.net.SocketException;
import kotlin.Metadata;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.ws.RealWebSocket;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Exchange.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002QRB'\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\bO\u0010PJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0011J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0011J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0011J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0011J9\u0010.\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\u0011R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\u0002048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u000b8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R$\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010?R\u001c\u0010F\u001a\u00020E8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010K\u001a\u00020J8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006S"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Ljava/io/IOException;", "e", "", "trackFailure", "(Ljava/io/IOException;)V", "Lokhttp3/Request;", SobotProgress.REQUEST, "writeRequestHeaders", "(Lokhttp3/Request;)V", "", "duplex", "Lokio/Sink;", "createRequestBody", "(Lokhttp3/Request;Z)Lokio/Sink;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Headers;", "trailers", "()Lokhttp3/Headers;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "()Lokhttp3/internal/ws/RealWebSocket$Streams;", "webSocketUpgradeFailed", "noNewExchangesOnConnection", "cancel", "detachWithViolence", ExifInterface.LONGITUDE_EAST, "", "bytesRead", "responseDone", "requestDone", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "isCoalescedConnection$okhttp", "()Z", "isCoalescedConnection", "<set-?>", "isDuplex", "Z", "isDuplex$okhttp", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Exchange {
    @NotNull
    private final RealCall call;
    private final ExchangeCodec codec;
    @NotNull
    private final RealConnection connection;
    @NotNull
    private final EventListener eventListener;
    @NotNull
    private final ExchangeFinder finder;
    private boolean isDuplex;

    /* compiled from: Exchange.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lokio/ForwardingSink;", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/Buffer;", MessageKey.MSG_SOURCE, "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "", "closed", "Z", "bytesReceived", "J", "completed", "contentLength", "Lokio/Sink;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Sink;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class RequestBodySink extends ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        public final /* synthetic */ Exchange this$0;

        public RequestBodySink(@NotNull Exchange exchange, Sink sink, long j2) {
        }

        private final <E extends IOException> E complete(E e2) {
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(@NotNull Buffer buffer, long j2) throws IOException {
        }
    }

    /* compiled from: Exchange.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/ForwardingSource;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "bytesReceived", "J", "", "invokeStartEvent", "Z", "closed", "completed", "contentLength", "Lokio/Source;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Source;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class ResponseBodySource extends ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        public final /* synthetic */ Exchange this$0;

        public ResponseBodySource(@NotNull Exchange exchange, Source source, long j2) {
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final <E extends IOException> E complete(E e2) {
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(@NotNull Buffer buffer, long j2) throws IOException {
        }
    }

    public Exchange(@NotNull RealCall realCall, @NotNull EventListener eventListener, @NotNull ExchangeFinder exchangeFinder, @NotNull ExchangeCodec exchangeCodec) {
    }

    private final void trackFailure(IOException iOException) {
    }

    public final <E extends IOException> E bodyComplete(long j2, boolean z, boolean z2, E e2) {
    }

    public final void cancel() {
    }

    @NotNull
    public final Sink createRequestBody(@NotNull Request request, boolean z) throws IOException {
    }

    public final void detachWithViolence() {
    }

    public final void finishRequest() throws IOException {
    }

    public final void flushRequest() throws IOException {
    }

    @NotNull
    public final RealCall getCall$okhttp() {
    }

    @NotNull
    public final RealConnection getConnection$okhttp() {
    }

    @NotNull
    public final EventListener getEventListener$okhttp() {
    }

    @NotNull
    public final ExchangeFinder getFinder$okhttp() {
    }

    public final boolean isCoalescedConnection$okhttp() {
    }

    public final boolean isDuplex$okhttp() {
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
    }

    public final void noNewExchangesOnConnection() {
    }

    public final void noRequestBody() {
    }

    @NotNull
    public final ResponseBody openResponseBody(@NotNull Response response) throws IOException {
    }

    @Nullable
    public final Response.Builder readResponseHeaders(boolean z) throws IOException {
    }

    public final void responseHeadersEnd(@NotNull Response response) {
    }

    public final void responseHeadersStart() {
    }

    @NotNull
    public final Headers trailers() throws IOException {
    }

    public final void webSocketUpgradeFailed() {
    }

    public final void writeRequestHeaders(@NotNull Request request) throws IOException {
    }
}
