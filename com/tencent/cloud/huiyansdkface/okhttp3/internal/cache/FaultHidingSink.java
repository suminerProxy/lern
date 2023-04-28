package com.tencent.cloud.huiyansdkface.okhttp3.internal.cache;

import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.ForwardingSink;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FaultHidingSink extends ForwardingSink {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10879a;

    public FaultHidingSink(Sink sink) {
    }

    public void a() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSink, com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSink, com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSink, com.tencent.cloud.huiyansdkface.okio.Sink
    public void write(Buffer buffer, long j2) throws IOException {
    }
}
