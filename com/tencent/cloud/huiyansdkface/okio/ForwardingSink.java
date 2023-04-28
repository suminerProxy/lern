package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ForwardingSink implements Sink {
    private final Sink delegate;

    public ForwardingSink(Sink sink) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final Sink delegate() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public Timeout timeout() {
    }

    public String toString() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Sink
    public void write(Buffer buffer, long j2) throws IOException {
    }
}
