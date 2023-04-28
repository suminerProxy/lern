package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.util.concurrent.FluentFuture;
import com.google.errorprone.annotations.ForOverride;
import java.lang.Throwable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {
    @NullableDecl
    public Class<X> exceptionType;
    @NullableDecl
    public F fallback;
    @NullableDecl
    public ListenableFuture<? extends V> inputFuture;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        public AsyncCatchingFuture(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction) {
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public /* bridge */ /* synthetic */ Object doFallback(Object obj, Throwable th) throws Exception {
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public /* bridge */ /* synthetic */ void setResult(Object obj) {
        }

        public ListenableFuture<? extends V> doFallback(AsyncFunction<? super X, ? extends V> asyncFunction, X x) throws Exception {
        }

        public void setResult(ListenableFuture<? extends V> listenableFuture) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
        public CatchingFuture(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function) {
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        @NullableDecl
        public /* bridge */ /* synthetic */ Object doFallback(Object obj, Throwable th) throws Exception {
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public void setResult(@NullableDecl V v) {
        }

        @NullableDecl
        public V doFallback(Function<? super X, ? extends V> function, X x) throws Exception {
        }
    }

    public AbstractCatchingFuture(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f2) {
    }

    public static <V, X extends Throwable> ListenableFuture<V> create(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
    }

    @NullableDecl
    @ForOverride
    public abstract T doFallback(F f2, X x) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    @ForOverride
    public abstract void setResult(@NullableDecl T t);

    public static <X extends Throwable, V> ListenableFuture<V> create(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
    }
}
