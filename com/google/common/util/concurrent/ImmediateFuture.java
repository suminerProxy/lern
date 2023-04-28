package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ImmediateFuture<V> implements ListenableFuture<V> {
    private static final Logger log = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ImmediateFailedCheckedFuture<V, X extends Exception> extends ImmediateFuture<V> implements CheckedFuture<V, X> {
        private final X thrown;

        public ImmediateFailedCheckedFuture(X x) {
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet() throws Exception {
        }

        @Override // com.google.common.util.concurrent.ImmediateFuture, java.util.concurrent.Future
        public V get() throws ExecutionException {
        }

        public String toString() {
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet(long j2, TimeUnit timeUnit) throws Exception {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
        public ImmediateFailedFuture(Throwable th) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ImmediateSuccessfulCheckedFuture<V, X extends Exception> extends ImmediateFuture<V> implements CheckedFuture<V, X> {
        @NullableDecl
        private final V value;

        public ImmediateSuccessfulCheckedFuture(@NullableDecl V v) {
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet() {
        }

        @Override // com.google.common.util.concurrent.ImmediateFuture, java.util.concurrent.Future
        public V get() {
        }

        public String toString() {
        }

        @Override // com.google.common.util.concurrent.CheckedFuture
        public V checkedGet(long j2, TimeUnit timeUnit) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        public static final ImmediateSuccessfulFuture<Object> NULL = null;
        @NullableDecl
        private final V value;

        public ImmediateSuccessfulFuture(@NullableDecl V v) {
        }

        @Override // com.google.common.util.concurrent.ImmediateFuture, java.util.concurrent.Future
        public V get() {
        }

        public String toString() {
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
    }
}
