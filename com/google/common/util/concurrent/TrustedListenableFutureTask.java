package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {
    private volatile InterruptibleTask<?> task;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {
        private final AsyncCallable<V> callable;
        public final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleAsyncTask(TrustedListenableFutureTask trustedListenableFutureTask, AsyncCallable<V> asyncCallable) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public /* bridge */ /* synthetic */ void afterRanInterruptibly(Object obj, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public /* bridge */ /* synthetic */ Object runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
        }

        public void afterRanInterruptibly(ListenableFuture<V> listenableFuture, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public ListenableFuture<V> runInterruptibly() throws Exception {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;
        public final /* synthetic */ TrustedListenableFutureTask this$0;

        public TrustedFutureInterruptibleTask(TrustedListenableFutureTask trustedListenableFutureTask, Callable<V> callable) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptibly(V v, Throwable th) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public V runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
        }
    }

    public TrustedListenableFutureTask(Callable<V> callable) {
    }

    public static <V> TrustedListenableFutureTask<V> create(AsyncCallable<V> asyncCallable) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
    }

    public static <V> TrustedListenableFutureTask<V> create(Callable<V> callable) {
    }

    public TrustedListenableFutureTask(AsyncCallable<V> asyncCallable) {
    }

    public static <V> TrustedListenableFutureTask<V> create(Runnable runnable, @NullableDecl V v) {
    }
}
