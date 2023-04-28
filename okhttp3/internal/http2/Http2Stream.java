package okhttp3.internal.http2;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.tencent.android.tpush.common.MessageKey;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Http2Stream.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 u2\u00020\u0001:\u0004uvwxB3\b\u0000\u0012\u0006\u0010\\\u001a\u00020(\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bs\u0010tJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b0\u0010%J\u000f\u00103\u001a\u00020\u0012H\u0000¢\u0006\u0004\b1\u00102J\u0015\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\u0012H\u0000¢\u0006\u0004\b8\u00102J\u000f\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0004\b:\u00102R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010\u0018\u001a\u00060AR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR\u0013\u0010E\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0019\u0010H\u001a\u00020G8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR*\u0010M\u001a\u0002042\u0006\u0010L\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u00107R \u0010'\u001a\u00060RR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010S\u001a\u0004\bT\u0010UR\u0013\u0010V\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\bV\u0010FR \u0010X\u001a\u00060WR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\\\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R*\u0010`\u001a\u0002042\u0006\u0010L\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010N\u001a\u0004\ba\u0010P\"\u0004\bb\u00107R\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020\t0c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010%R*\u0010l\u001a\u0002042\u0006\u0010L\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010N\u001a\u0004\bm\u0010P\"\u0004\bn\u00107R*\u0010o\u001a\u0002042\u0006\u0010L\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010N\u001a\u0004\bp\u0010P\"\u0004\bq\u00107R \u0010\u001a\u001a\u00060AR\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\br\u0010D¨\u0006y"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "Ljava/io/IOException;", "errorException", "", "closeInternal", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "Lokhttp3/Headers;", "takeHeaders", "()Lokhttp3/Headers;", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "outFinished", "flushHeaders", "", "writeHeaders", "(Ljava/util/List;ZZ)V", "enqueueTrailers", "(Lokhttp3/Headers;)V", "Lokio/Timeout;", "readTimeout", "()Lokio/Timeout;", "writeTimeout", "Lokio/Source;", "getSource", "()Lokio/Source;", "Lokio/Sink;", "getSink", "()Lokio/Sink;", "rstStatusCode", "close", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "closeLater", "(Lokhttp3/internal/http2/ErrorCode;)V", "Lokio/BufferedSource;", MessageKey.MSG_SOURCE, "", SessionDescription.ATTR_LENGTH, "receiveData", "(Lokio/BufferedSource;I)V", "headers", "inFinished", "receiveHeaders", "(Lokhttp3/Headers;Z)V", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "(J)V", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "isLocallyInitiated", "()Z", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "writeBytesMaximum", "J", "getWriteBytesMaximum", "()J", "setWriteBytesMaximum$okhttp", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "isOpen", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "id", "I", "getId", "()I", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "getWriteTimeout$okhttp", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Http2Stream {
    public static final Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 16384;
    @NotNull
    private final Http2Connection connection;
    @Nullable
    private ErrorCode errorCode;
    @Nullable
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    @NotNull
    private final StreamTimeout readTimeout;
    @NotNull
    private final FramingSink sink;
    @NotNull
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    @NotNull
    private final StreamTimeout writeTimeout;

    /* compiled from: Http2Stream.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "", "EMIT_BUFFER_SIZE", "J", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020 ¢\u0006\u0004\b.\u0010/J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u0019\u0010*\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u0018R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "", "read", "", "updateConnectionFlowControl", "(J)V", "Lokio/Buffer;", "sink", "byteCount", "(Lokio/Buffer;J)J", "Lokio/BufferedSource;", MessageKey.MSG_SOURCE, "receive$okhttp", "(Lokio/BufferedSource;J)V", "receive", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "()V", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "", "closed", "Z", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "finished", "getFinished$okhttp", "setFinished$okhttp", "receiveBuffer", "getReceiveBuffer", "maxByteCount", "J", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class FramingSource implements Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        @NotNull
        private final Buffer readBuffer;
        @NotNull
        private final Buffer receiveBuffer;
        public final /* synthetic */ Http2Stream this$0;
        @Nullable
        private Headers trailers;

        public FramingSource(Http2Stream http2Stream, long j2, boolean z) {
        }

        private final void updateConnectionFlowControl(long j2) {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final boolean getClosed$okhttp() {
        }

        public final boolean getFinished$okhttp() {
        }

        @NotNull
        public final Buffer getReadBuffer() {
        }

        @NotNull
        public final Buffer getReceiveBuffer() {
        }

        @Nullable
        public final Headers getTrailers() {
        }

        @Override // okio.Source
        public long read(@NotNull Buffer buffer, long j2) throws IOException {
        }

        public final void receive$okhttp(@NotNull BufferedSource bufferedSource, long j2) throws IOException {
        }

        public final void setClosed$okhttp(boolean z) {
        }

        public final void setFinished$okhttp(boolean z) {
        }

        public final void setTrailers(@Nullable Headers headers) {
        }

        @Override // okio.Source
        @NotNull
        public Timeout timeout() {
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "", "timedOut", "()V", "Ljava/io/IOException;", "cause", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class StreamTimeout extends AsyncTimeout {
        public final /* synthetic */ Http2Stream this$0;

        public StreamTimeout(Http2Stream http2Stream) {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
        }

        @Override // okio.AsyncTimeout
        @NotNull
        public IOException newTimeoutException(@Nullable IOException iOException) {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
        }
    }

    public Http2Stream(int i2, @NotNull Http2Connection http2Connection, boolean z, boolean z2, @Nullable Headers headers) {
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
    }

    public final void addBytesToWriteWindow(long j2) {
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
    }

    public final void close(@NotNull ErrorCode errorCode, @Nullable IOException iOException) throws IOException {
    }

    public final void closeLater(@NotNull ErrorCode errorCode) {
    }

    public final void enqueueTrailers(@NotNull Headers headers) {
    }

    @NotNull
    public final Http2Connection getConnection() {
    }

    @Nullable
    public final synchronized ErrorCode getErrorCode$okhttp() {
    }

    @Nullable
    public final IOException getErrorException$okhttp() {
    }

    public final int getId() {
    }

    public final long getReadBytesAcknowledged() {
    }

    public final long getReadBytesTotal() {
    }

    @NotNull
    public final StreamTimeout getReadTimeout$okhttp() {
    }

    @NotNull
    public final Sink getSink() {
    }

    @NotNull
    public final FramingSink getSink$okhttp() {
    }

    @NotNull
    public final Source getSource() {
    }

    @NotNull
    public final FramingSource getSource$okhttp() {
    }

    public final long getWriteBytesMaximum() {
    }

    public final long getWriteBytesTotal() {
    }

    @NotNull
    public final StreamTimeout getWriteTimeout$okhttp() {
    }

    public final boolean isLocallyInitiated() {
    }

    public final synchronized boolean isOpen() {
    }

    @NotNull
    public final Timeout readTimeout() {
    }

    public final void receiveData(@NotNull BufferedSource bufferedSource, int i2) throws IOException {
    }

    public final void receiveHeaders(@NotNull Headers headers, boolean z) {
    }

    public final synchronized void receiveRstStream(@NotNull ErrorCode errorCode) {
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode) {
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException) {
    }

    public final void setReadBytesAcknowledged$okhttp(long j2) {
    }

    public final void setReadBytesTotal$okhttp(long j2) {
    }

    public final void setWriteBytesMaximum$okhttp(long j2) {
    }

    public final void setWriteBytesTotal$okhttp(long j2) {
    }

    @NotNull
    public final synchronized Headers takeHeaders() throws IOException {
    }

    @NotNull
    public final synchronized Headers trailers() throws IOException {
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
    }

    public final void writeHeaders(@NotNull List<Header> list, boolean z, boolean z2) throws IOException {
    }

    @NotNull
    public final Timeout writeTimeout() {
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0006R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0006R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "", "outFinishedOnLastFrame", "", "emitFrame", "(Z)V", "Lokio/Buffer;", MessageKey.MSG_SOURCE, "", "byteCount", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "closed", "Z", "getClosed", "()Z", "setClosed", "finished", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class FramingSink implements Sink {
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer;
        public final /* synthetic */ Http2Stream this$0;
        @Nullable
        private Headers trailers;

        public FramingSink(Http2Stream http2Stream, boolean z) {
        }

        private final void emitFrame(boolean z) throws IOException {
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
        }

        public final boolean getClosed() {
        }

        public final boolean getFinished() {
        }

        @Nullable
        public final Headers getTrailers() {
        }

        public final void setClosed(boolean z) {
        }

        public final void setFinished(boolean z) {
        }

        public final void setTrailers(@Nullable Headers headers) {
        }

        @Override // okio.Sink
        @NotNull
        public Timeout timeout() {
        }

        @Override // okio.Sink
        public void write(@NotNull Buffer buffer, long j2) throws IOException {
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
