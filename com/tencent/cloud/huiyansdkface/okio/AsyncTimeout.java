package com.tencent.cloud.huiyansdkface.okio;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AsyncTimeout extends Timeout {
    private static final long IDLE_TIMEOUT_MILLIS = 0;
    private static final long IDLE_TIMEOUT_NANOS = 0;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    public static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.AsyncTimeout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Sink {
        public final /* synthetic */ AsyncTimeout this$0;
        public final /* synthetic */ Sink val$sink;

        public AnonymousClass1(AsyncTimeout asyncTimeout, Sink sink) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
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

    /* renamed from: com.tencent.cloud.huiyansdkface.okio.AsyncTimeout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Source {
        public final /* synthetic */ AsyncTimeout this$0;
        public final /* synthetic */ Source val$source;

        public AnonymousClass2(AsyncTimeout asyncTimeout, Source source) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Watchdog extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
        }
    }

    public static AsyncTimeout awaitTimeout() throws InterruptedException {
    }

    private static synchronized boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
    }

    private long remainingNanos(long j2) {
    }

    private static synchronized void scheduleTimeout(AsyncTimeout asyncTimeout, long j2, boolean z) {
    }

    public final void enter() {
    }

    public final IOException exit(IOException iOException) throws IOException {
    }

    public final void exit(boolean z) throws IOException {
    }

    public final boolean exit() {
    }

    public IOException newTimeoutException(IOException iOException) {
    }

    public final Sink sink(Sink sink) {
    }

    public final Source source(Source source) {
    }

    public void timedOut() {
    }
}
