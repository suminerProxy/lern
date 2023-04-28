package com.tencent.cloud.huiyansdkface.okhttp3.internal.http2;

import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient;
import com.tencent.cloud.huiyansdkface.okhttp3.Protocol;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.StreamAllocation;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.ForwardingSource;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import com.tencent.cloud.huiyansdkface.okio.Source;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Http2Codec implements HttpCodec {
    private static final List<String> b = null;
    private static final List<String> c = null;

    /* renamed from: a  reason: collision with root package name */
    public final StreamAllocation f10996a;

    /* renamed from: d  reason: collision with root package name */
    private final Interceptor.Chain f10997d;

    /* renamed from: e  reason: collision with root package name */
    private final Http2Connection f10998e;

    /* renamed from: f  reason: collision with root package name */
    private Http2Stream f10999f;

    /* renamed from: g  reason: collision with root package name */
    private final Protocol f11000g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class StreamFinishingSource extends ForwardingSource {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11001a;
        private long b;
        private /* synthetic */ Http2Codec c;

        public StreamFinishingSource(Http2Codec http2Codec, Source source) {
        }

        private void a(IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSource, com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSource, com.tencent.cloud.huiyansdkface.okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }
    }

    public Http2Codec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation, Http2Connection http2Connection) {
    }

    public static List<Header> http2HeadersList(Request request) {
    }

    public static Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) throws IOException {
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

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final ResponseBody openResponseBody(Response response) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final Response.Builder readResponseHeaders(boolean z) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.http.HttpCodec
    public final void writeRequestHeaders(Request request) throws IOException {
    }
}
