package com.tencent.cloud.huiyansdkface.okhttp3.internal.http1;

import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.StreamAllocation;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ForwardingTimeout;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import com.tencent.cloud.huiyansdkface.okio.Source;
import com.tencent.cloud.huiyansdkface.okio.Timeout;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Http1Codec implements HttpCodec {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f10951a;
    public final StreamAllocation b;
    public final BufferedSource c;

    /* renamed from: d  reason: collision with root package name */
    public final BufferedSink f10952d;

    /* renamed from: e  reason: collision with root package name */
    public int f10953e;

    /* renamed from: f  reason: collision with root package name */
    private long f10954f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public abstract class AbstractSource implements Source {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10955a;
        private ForwardingTimeout b;
        private long c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Http1Codec f10956d;

        private AbstractSource(Http1Codec http1Codec) {
        }

        public /* synthetic */ AbstractSource(Http1Codec http1Codec, byte b) {
        }

        public final void a(boolean z, IOException iOException) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public Timeout timeout() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class ChunkedSink implements Sink {

        /* renamed from: a  reason: collision with root package name */
        private final ForwardingTimeout f10957a;
        private boolean b;
        private /* synthetic */ Http1Codec c;

        public ChunkedSink(Http1Codec http1Codec) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
        public final synchronized void flush() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final Timeout timeout() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final void write(Buffer buffer, long j2) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ChunkedSource extends AbstractSource {
        private final HttpUrl b;
        private long c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10958d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Http1Codec f10959e;

        public ChunkedSource(Http1Codec http1Codec, HttpUrl httpUrl) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http1.Http1Codec.AbstractSource, com.tencent.cloud.huiyansdkface.okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class FixedLengthSink implements Sink {

        /* renamed from: a  reason: collision with root package name */
        private final ForwardingTimeout f10960a;
        private boolean b;
        private long c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Http1Codec f10961d;

        public FixedLengthSink(Http1Codec http1Codec, long j2) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final Timeout timeout() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink
        public final void write(Buffer buffer, long j2) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FixedLengthSource extends AbstractSource {
        private long b;

        public FixedLengthSource(Http1Codec http1Codec, long j2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http1.Http1Codec.AbstractSource, com.tencent.cloud.huiyansdkface.okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean b;

        public UnknownLengthSource(Http1Codec http1Codec) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http1.Http1Codec.AbstractSource, com.tencent.cloud.huiyansdkface.okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, BufferedSource bufferedSource, BufferedSink bufferedSink) {
    }

    private String a() throws IOException {
    }

    public static void a(ForwardingTimeout forwardingTimeout) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final void cancel() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final Sink createRequestBody(Request request, long j2) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final void finishRequest() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final void flushRequest() throws IOException {
    }

    public final boolean isClosed() {
    }

    public final Sink newChunkedSink() {
    }

    public final Source newChunkedSource(HttpUrl httpUrl) throws IOException {
    }

    public final Sink newFixedLengthSink(long j2) {
    }

    public final Source newFixedLengthSource(long j2) throws IOException {
    }

    public final Source newUnknownLengthSource() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) throws IOException {
    }

    public final Headers readHeaders() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final Response.Builder readResponseHeaders(boolean z) throws IOException {
    }

    public final void writeRequest(Headers headers, String str) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) throws IOException {
    }
}
