package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
    }

    public DeflaterSink(Sink sink, Deflater deflater) {
    }

    private void deflate(boolean z) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final void finishDeflate() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public final Timeout timeout() {
    }

    public final String toString() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public final void write(Buffer buffer, long j2) throws IOException {
    }
}
