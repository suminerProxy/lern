package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class NetworkBuilder<N, E> extends AbstractGraphBuilder<N> {
    public boolean allowsParallelEdges;
    public ElementOrder<? super E> edgeOrder;
    public Optional<Integer> expectedEdgeCount;

    private NetworkBuilder(boolean z) {
    }

    private <N1 extends N, E1 extends E> NetworkBuilder<N1, E1> cast() {
    }

    public static NetworkBuilder<Object, Object> directed() {
    }

    public static <N, E> NetworkBuilder<N, E> from(Network<N, E> network) {
    }

    public static NetworkBuilder<Object, Object> undirected() {
    }

    public NetworkBuilder<N, E> allowsParallelEdges(boolean z) {
    }

    public NetworkBuilder<N, E> allowsSelfLoops(boolean z) {
    }

    public <N1 extends N, E1 extends E> MutableNetwork<N1, E1> build() {
    }

    public <E1 extends E> NetworkBuilder<N, E1> edgeOrder(ElementOrder<E1> elementOrder) {
    }

    public NetworkBuilder<N, E> expectedEdgeCount(int i2) {
    }

    public NetworkBuilder<N, E> expectedNodeCount(int i2) {
    }

    public <N1 extends N> NetworkBuilder<N1, E> nodeOrder(ElementOrder<N1> elementOrder) {
    }
}
