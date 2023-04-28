package com.tencent.cloud.huiyansdkface.okhttp3.internal.http2;

import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Header;
import com.tencent.cloud.huiyansdkface.okio.AsyncTimeout;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import com.tencent.cloud.huiyansdkface.okio.Source;
import com.tencent.cloud.huiyansdkface.okio.Timeout;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Deque;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Http2Stream {

    /* renamed from: m  reason: collision with root package name */
    private static /* synthetic */ boolean f11045m = true;

    /* renamed from: a  reason: collision with root package name */
    public long f11046a;
    public long b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Http2Connection f11047d;

    /* renamed from: e  reason: collision with root package name */
    public final FramingSink f11048e;

    /* renamed from: f  reason: collision with root package name */
    public final StreamTimeout f11049f;

    /* renamed from: g  reason: collision with root package name */
    public final StreamTimeout f11050g;

    /* renamed from: h  reason: collision with root package name */
    public ErrorCode f11051h;

    /* renamed from: i  reason: collision with root package name */
    private final Deque<Headers> f11052i;

    /* renamed from: j  reason: collision with root package name */
    private Header.Listener f11053j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11054k;

    /* renamed from: l  reason: collision with root package name */
    private final FramingSource f11055l;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class FramingSink implements Sink {

        /* renamed from: d  reason: collision with root package name */
        private static /* synthetic */ boolean f11056d = true;

        /* renamed from: a  reason: collision with root package name */
        public boolean f11057a;
        public boolean b;
        private final Buffer c;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Http2Stream f11058e;

        public FramingSink(Http2Stream http2Stream) {
        }

        private void a(boolean z) throws IOException {
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
    public final class FramingSource implements Source {

        /* renamed from: f  reason: collision with root package name */
        private static /* synthetic */ boolean f11059f = true;

        /* renamed from: a  reason: collision with root package name */
        public boolean f11060a;
        public boolean b;
        private final Buffer c;

        /* renamed from: d  reason: collision with root package name */
        private final Buffer f11061d;

        /* renamed from: e  reason: collision with root package name */
        private final long f11062e;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Http2Stream f11063g;

        public FramingSource(Http2Stream http2Stream, long j2) {
        }

        private void a(long j2) {
        }

        public final void a(BufferedSource bufferedSource, long j2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public final long read(Buffer buffer, long j2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public final Timeout timeout() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class StreamTimeout extends AsyncTimeout {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Http2Stream f11064a;

        public StreamTimeout(Http2Stream http2Stream) {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.AsyncTimeout
        public void timedOut() {
        }
    }

    public Http2Stream(int i2, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
    }

    public static /* synthetic */ Deque a(Http2Stream http2Stream) {
    }

    public static /* synthetic */ Header.Listener b(Http2Stream http2Stream) {
    }

    private boolean b(ErrorCode errorCode) {
    }

    public final void a() {
    }

    public final void a(long j2) {
    }

    public final synchronized void a(ErrorCode errorCode) {
    }

    public final void a(BufferedSource bufferedSource, int i2) throws IOException {
    }

    public final void a(List<Header> list) {
    }

    public final void b() throws IOException {
    }

    public final void c() throws IOException {
    }

    public final void close(ErrorCode errorCode) throws IOException {
    }

    public final void closeLater(ErrorCode errorCode) {
    }

    public final void d() throws InterruptedIOException {
    }

    public final Http2Connection getConnection() {
    }

    public final synchronized ErrorCode getErrorCode() {
    }

    public final int getId() {
    }

    public final Sink getSink() {
    }

    public final Source getSource() {
    }

    public final boolean isLocallyInitiated() {
    }

    public final synchronized boolean isOpen() {
    }

    public final Timeout readTimeout() {
    }

    public final synchronized void setHeadersListener(Header.Listener listener) {
    }

    public final synchronized Headers takeHeaders() throws IOException {
    }

    public final void writeHeaders(List<Header> list, boolean z) throws IOException {
    }

    public final Timeout writeTimeout() {
    }
}
