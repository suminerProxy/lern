package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {
    @NullableDecl
    private ListenableFuture<V> delegateRef;
    @NullableDecl
    private ScheduledFuture<?> timer;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Fire<V> implements Runnable {
        @NullableDecl
        public TimeoutFuture<V> timeoutFutureRef;

        public Fire(TimeoutFuture<V> timeoutFuture) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TimeoutFutureException extends TimeoutException {
        public /* synthetic */ TimeoutFutureException(String str, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
        }

        private TimeoutFutureException(String str) {
        }
    }

    private TimeoutFuture(ListenableFuture<V> listenableFuture) {
    }

    public static /* synthetic */ ListenableFuture access$000(TimeoutFuture timeoutFuture) {
    }

    public static /* synthetic */ ScheduledFuture access$100(TimeoutFuture timeoutFuture) {
    }

    public static /* synthetic */ ScheduledFuture access$102(TimeoutFuture timeoutFuture, ScheduledFuture scheduledFuture) {
    }

    public static <V> ListenableFuture<V> create(ListenableFuture<V> listenableFuture, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
    }
}
