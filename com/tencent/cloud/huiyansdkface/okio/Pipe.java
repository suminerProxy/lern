package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Pipe {
    public final Buffer buffer;
    public final long maxBufferSize;
    private final Sink sink;
    public boolean sinkClosed;
    private final Source source;
    public boolean sourceClosed;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class PipeSink implements Sink {
        public final /* synthetic */ Pipe this$0;
        public final Timeout timeout;

        public PipeSink(Pipe pipe) {
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
    public final class PipeSource implements Source {
        public final /* synthetic */ Pipe this$0;
        public final Timeout timeout;

        public PipeSource(Pipe pipe) {
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

    public Pipe(long j2) {
    }

    public final Sink sink() {
    }

    public final Source source() {
    }
}
