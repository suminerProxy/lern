package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.Partially;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* renamed from: com.google.common.util.concurrent.Futures$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Future val$scheduled;

        public AnonymousClass1(Future future) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* renamed from: com.google.common.util.concurrent.Futures$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<O> implements Future<O> {
        public final /* synthetic */ Function val$function;
        public final /* synthetic */ Future val$input;

        public AnonymousClass2(Future future, Function function) {
        }

        private O applyTransformation(I i2) throws ExecutionException {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
        }

        @Override // java.util.concurrent.Future
        public O get() throws InterruptedException, ExecutionException {
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
        }

        @Override // java.util.concurrent.Future
        public O get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ImmutableList val$delegates;
        public final /* synthetic */ int val$localI;
        public final /* synthetic */ InCompletionOrderState val$state;

        public AnonymousClass3(InCompletionOrderState inCompletionOrderState, ImmutableList immutableList, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CallbackListener<V> implements Runnable {
        public final FutureCallback<? super V> callback;
        public final Future<V> future;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
        }
    }

    @Beta
    @GwtCompatible
    @CanIgnoreReturnValue
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FutureCombiner<V> {
        private final boolean allMustSucceed;
        private final ImmutableList<ListenableFuture<? extends V>> futures;

        /* renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Callable<Void> {
            public final /* synthetic */ FutureCombiner this$0;
            public final /* synthetic */ Runnable val$combiner;

            public AnonymousClass1(FutureCombiner futureCombiner, Runnable runnable) {
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() throws Exception {
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            public Void call2() throws Exception {
            }
        }

        public /* synthetic */ FutureCombiner(boolean z, ImmutableList immutableList, AnonymousClass1 anonymousClass1) {
        }

        @CanIgnoreReturnValue
        public <C> ListenableFuture<C> call(Callable<C> callable, Executor executor) {
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> asyncCallable, Executor executor) {
        }

        public ListenableFuture<?> run(Runnable runnable, Executor executor) {
        }

        private FutureCombiner(boolean z, ImmutableList<ListenableFuture<? extends V>> immutableList) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        private InCompletionOrderState<T> state;

        public /* synthetic */ InCompletionOrderFuture(InCompletionOrderState inCompletionOrderState, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
        }

        private InCompletionOrderFuture(InCompletionOrderState<T> inCompletionOrderState) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InCompletionOrderState<T> {
        private volatile int delegateIndex;
        private final AtomicInteger incompleteOutputCount;
        private final ListenableFuture<? extends T>[] inputFutures;
        private boolean shouldInterrupt;
        private boolean wasCancelled;

        public /* synthetic */ InCompletionOrderState(ListenableFuture[] listenableFutureArr, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ void access$300(InCompletionOrderState inCompletionOrderState, ImmutableList immutableList, int i2) {
        }

        public static /* synthetic */ void access$400(InCompletionOrderState inCompletionOrderState, boolean z) {
        }

        public static /* synthetic */ ListenableFuture[] access$500(InCompletionOrderState inCompletionOrderState) {
        }

        public static /* synthetic */ AtomicInteger access$600(InCompletionOrderState inCompletionOrderState) {
        }

        private void recordCompletion() {
        }

        private void recordInputCompletion(ImmutableList<AbstractFuture<T>> immutableList, int i2) {
        }

        private void recordOutputCancellation(boolean z) {
        }

        private InCompletionOrderState(ListenableFuture<? extends T>[] listenableFutureArr) {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MappingCheckedFuture<V, X extends Exception> extends AbstractCheckedFuture<V, X> {
        public final Function<? super Exception, X> mapper;

        public MappingCheckedFuture(ListenableFuture<V> listenableFuture, Function<? super Exception, X> function) {
        }

        @Override // com.google.common.util.concurrent.AbstractCheckedFuture
        public X mapException(Exception exc) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        private ListenableFuture<V> delegate;

        public NonCancellationPropagatingFuture(ListenableFuture<V> listenableFuture) {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @Beta
    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @Beta
    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
    }

    @Beta
    @GwtIncompatible
    @CanIgnoreReturnValue
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
    }

    @CanIgnoreReturnValue
    public static <V> V getDone(Future<V> future) throws ExecutionException {
    }

    @CanIgnoreReturnValue
    public static <V> V getUnchecked(Future<V> future) {
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
    }

    @Beta
    @GwtIncompatible
    @Deprecated
    public static <V, X extends Exception> CheckedFuture<V, X> immediateCheckedFuture(@NullableDecl V v) {
    }

    @Beta
    @GwtIncompatible
    @Deprecated
    public static <V, X extends Exception> CheckedFuture<V, X> immediateFailedCheckedFuture(X x) {
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th) {
    }

    public static <V> ListenableFuture<V> immediateFuture(@NullableDecl V v) {
    }

    @Beta
    public static <T> ImmutableList<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> iterable) {
    }

    @Beta
    @GwtIncompatible
    public static <I, O> Future<O> lazyTransform(Future<I> future, Function<? super I, ? extends O> function) {
    }

    @Beta
    @GwtIncompatible
    @Deprecated
    public static <V, X extends Exception> CheckedFuture<V, X> makeChecked(ListenableFuture<V> listenableFuture, Function<? super Exception, X> function) {
    }

    @Beta
    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> listenableFuture) {
    }

    @Beta
    @GwtIncompatible
    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> asyncCallable, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
    }

    @Beta
    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> asyncCallable, Executor executor) {
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @Beta
    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
    }

    @Beta
    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
    }

    @SafeVarargs
    @Beta
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @SafeVarargs
    @Beta
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... listenableFutureArr) {
    }

    @Beta
    @GwtIncompatible
    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> listenableFuture, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
    }

    private static void wrapAndThrowUnchecked(Throwable th) {
    }

    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }

    @Beta
    @GwtIncompatible
    @CanIgnoreReturnValue
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j2, TimeUnit timeUnit) throws Exception {
    }

    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }

    @Beta
    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }

    @Beta
    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> iterable) {
    }
}
