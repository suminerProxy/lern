package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {
        private final AsyncCallable<V> callable;
        public final /* synthetic */ CombinedFuture this$0;

        public AsyncCallableInterruptibleTask(CombinedFuture combinedFuture, AsyncCallable<V> asyncCallable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public /* bridge */ /* synthetic */ Object runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public /* bridge */ /* synthetic */ void setValue(Object obj) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public ListenableFuture<V> runInterruptibly() throws Exception {
        }

        public void setValue(ListenableFuture<V> listenableFuture) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final Callable<V> callable;
        public final /* synthetic */ CombinedFuture this$0;

        public CallableInterruptibleTask(CombinedFuture combinedFuture, Callable<V> callable, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public V runInterruptibly() throws Exception {
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public void setValue(V v) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;
        public final /* synthetic */ CombinedFuture this$0;
        public boolean thrownByExecute;

        public CombinedFutureInterruptibleTask(CombinedFuture combinedFuture, Executor executor) {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptibly(T t, Throwable th) {
        }

        public final void execute() {
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
        }

        public abstract void setValue(T t);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class CombinedFutureRunningState extends AggregateFuture<Object, V>.RunningState {
        private CombinedFutureInterruptibleTask task;
        public final /* synthetic */ CombinedFuture this$0;

        public CombinedFutureRunningState(CombinedFuture combinedFuture, ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, CombinedFutureInterruptibleTask combinedFutureInterruptibleTask) {
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        public void collectOneValue(boolean z, int i2, @NullableDecl Object obj) {
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        public void handleAllCompleted() {
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        public void interruptTask() {
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        public void releaseResourcesAfterFailure() {
        }
    }

    public CombinedFuture(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, AsyncCallable<V> asyncCallable) {
    }

    public CombinedFuture(ImmutableCollection<? extends ListenableFuture<?>> immutableCollection, boolean z, Executor executor, Callable<V> callable) {
    }
}
