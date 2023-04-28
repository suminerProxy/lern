package com.facebook.stetho.inspector.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class GunzippingOutputStream extends FilterOutputStream {
    private static final ExecutorService sExecutor = null;
    private final Future<Void> mCopyFuture;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GunzippingCallable implements Callable<Void> {
        private final InputStream mIn;
        private final OutputStream mOut;

        public GunzippingCallable(InputStream inputStream, OutputStream outputStream) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call  reason: avoid collision after fix types in other method */
        public Void call2() throws IOException {
        }
    }

    private GunzippingOutputStream(OutputStream outputStream, Future<Void> future) throws IOException {
    }

    public static GunzippingOutputStream create(OutputStream outputStream) throws IOException {
    }

    private static <T> T getAndRethrow(Future<T> future) throws IOException {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
