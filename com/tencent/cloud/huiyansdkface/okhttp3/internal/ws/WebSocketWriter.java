package com.tencent.cloud.huiyansdkface.okhttp3.internal.ws;

import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import com.tencent.cloud.huiyansdkface.okio.Timeout;
import java.io.IOException;
import java.util.Random;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class WebSocketWriter {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSink f11131a;
    public final Buffer b;
    public final FrameSink c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11132d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11133e;

    /* renamed from: f  reason: collision with root package name */
    private Random f11134f;

    /* renamed from: g  reason: collision with root package name */
    private Buffer f11135g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11136h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f11137i;

    /* renamed from: j  reason: collision with root package name */
    private final Buffer.UnsafeCursor f11138j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class FrameSink implements Sink {

        /* renamed from: a  reason: collision with root package name */
        public int f11139a;
        public long b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f11140d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ WebSocketWriter f11141e;

        public FrameSink(WebSocketWriter webSocketWriter) {
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

    public WebSocketWriter(boolean z, BufferedSink bufferedSink, Random random) {
    }

    private void b(int i2, ByteString byteString) throws IOException {
    }

    public final void a(int i2, long j2, boolean z, boolean z2) throws IOException {
    }

    public final void a(int i2, ByteString byteString) throws IOException {
    }

    public final void a(ByteString byteString) throws IOException {
    }

    public final void b(ByteString byteString) throws IOException {
    }
}
