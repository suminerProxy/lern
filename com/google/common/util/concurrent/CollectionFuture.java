package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableCollection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class CollectionFutureRunningState extends AggregateFuture<V, C>.RunningState {
        public final /* synthetic */ CollectionFuture this$0;
        private List<Optional<V>> values;

        public CollectionFutureRunningState(CollectionFuture collectionFuture, ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        public final void collectOneValue(boolean z, int i2, @NullableDecl V v) {
        }

        public abstract C combine(List<Optional<V>> list);

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        public final void handleAllCompleted() {
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        public void releaseResourcesAfterFailure() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class ListFutureRunningState extends CollectionFuture<V, List<V>>.CollectionFutureRunningState {
            public final /* synthetic */ ListFuture this$0;

            public ListFutureRunningState(ListFuture listFuture, ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
            }

            @Override // com.google.common.util.concurrent.CollectionFuture.CollectionFutureRunningState
            public /* bridge */ /* synthetic */ Object combine(List list) {
            }

            @Override // com.google.common.util.concurrent.CollectionFuture.CollectionFutureRunningState
            public List<V> combine(List<Optional<V>> list) {
            }
        }

        public ListFuture(ImmutableCollection<? extends ListenableFuture<? extends V>> immutableCollection, boolean z) {
        }
    }
}
