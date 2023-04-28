package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;
import java.util.zip.Inflater;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
    }

    public InflaterSource(Source source, Inflater inflater) {
    }

    private void releaseInflatedBytes() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public final long read(Buffer buffer, long j2) throws IOException {
    }

    public final boolean refill() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public final Timeout timeout() {
    }
}
