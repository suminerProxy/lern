package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@CanIgnoreReturnValue
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class WrappingExecutorService implements ExecutorService {
    private final ExecutorService delegate;

    /* renamed from: com.google.common.util.concurrent.WrappingExecutorService$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ WrappingExecutorService this$0;
        public final /* synthetic */ Callable val$wrapped;

        public AnonymousClass1(WrappingExecutorService wrappingExecutorService, Callable callable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public WrappingExecutorService(ExecutorService executorService) {
    }

    private <T> ImmutableList<Callable<T>> wrapTasks(Collection<? extends Callable<T>> collection) {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
    }

    public Runnable wrapTask(Runnable runnable) {
    }

    public abstract <T> Callable<T> wrapTask(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
    }
}
