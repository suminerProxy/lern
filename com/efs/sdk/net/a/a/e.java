package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class e extends FilterOutputStream {
    private static final ExecutorService b = null;

    /* renamed from: a  reason: collision with root package name */
    private final Future<Void> f3201a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f3202a;
        private final OutputStream b;

        public a(InputStream inputStream, OutputStream outputStream) {
        }

        private Void a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() {
        }
    }

    private e(OutputStream outputStream, Future<Void> future) {
    }

    public static e a(OutputStream outputStream) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    private static <T> T a(Future<T> future) {
    }
}
