package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class GzipSink implements Sink {
    private boolean closed;
    private final CRC32 crc;
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final BufferedSink sink;

    public GzipSink(Sink sink) {
    }

    private void updateCrc(Buffer buffer, long j2) {
    }

    private void writeFooter() throws IOException {
    }

    private void writeHeader() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final Deflater deflater() {
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
