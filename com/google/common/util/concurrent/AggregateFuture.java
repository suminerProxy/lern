package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AggregateFuture<InputT, OutputT> extends AbstractFuture.TrustedFuture<OutputT> {
    private static final Logger logger = null;
    @NullableDecl
    private AggregateFuture<InputT, OutputT>.RunningState runningState;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class RunningState extends AggregateFutureState implements Runnable {
        private final boolean allMustSucceed;
        private final boolean collectsValues;
        private ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures;
        public final /* synthetic */ AggregateFuture this$0;

        /* renamed from: com.google.common.util.concurrent.AggregateFuture$RunningState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ RunningState this$1;
            public final /* synthetic */ int val$index;
            public final /* synthetic */ ListenableFuture val$listenable;

            public AnonymousClass1(RunningState runningState, int i2, ListenableFuture listenableFuture) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public RunningState(AggregateFuture aggregateFuture, ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z, boolean z2) {
        }

        public static /* synthetic */ ImmutableCollection access$000(RunningState runningState) {
        }

        public static /* synthetic */ void access$100(RunningState runningState) {
        }

        public static /* synthetic */ void access$200(RunningState runningState, int i2, Future future) {
        }

        public static /* synthetic */ void access$300(RunningState runningState) {
        }

        private void decrementCountAndMaybeComplete() {
        }

        private void handleException(Throwable th) {
        }

        private void handleOneInputDone(int i2, Future<? extends InputT> future) {
        }

        private void init() {
        }

        private void processCompleted() {
        }

        @Override // com.google.common.util.concurrent.AggregateFutureState
        public final void addInitialException(Set<Throwable> set) {
        }

        public abstract void collectOneValue(boolean z, int i2, @NullableDecl InputT inputt);

        public abstract void handleAllCompleted();

        public void interruptTask() {
        }

        @ForOverride
        @OverridingMethodsMustInvokeSuper
        public void releaseResourcesAfterFailure() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static /* synthetic */ boolean access$400(Set set, Throwable th) {
    }

    public static /* synthetic */ Logger access$500() {
    }

    public static /* synthetic */ RunningState access$602(AggregateFuture aggregateFuture, RunningState runningState) {
    }

    private static boolean addCausalChain(Set<Throwable> set, Throwable th) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
    }

    public final void init(AggregateFuture<InputT, OutputT>.RunningState runningState) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
    }
}
