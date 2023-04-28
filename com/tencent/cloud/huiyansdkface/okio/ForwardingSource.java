package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class ForwardingSource implements Source {
    private final Source delegate;

    public ForwardingSource(Source source) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final Source delegate() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public long read(Buffer buffer, long j2) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.Source
    public Timeout timeout() {
    }

    public String toString() {
    }
}
