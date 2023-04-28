package com.google.common.graph;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import java.util.Set;

@Immutable(containerOf = {"N", ExifInterface.LONGITUDE_EAST})
@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableNetwork<N, E> extends ConfigurableNetwork<N, E> {

    /* renamed from: com.google.common.graph.ImmutableNetwork$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Function<E, N> {
        public final /* synthetic */ Network val$network;

        public AnonymousClass1(Network network) {
        }

        @Override // com.google.common.base.Function
        public N apply(E e2) {
        }
    }

    /* renamed from: com.google.common.graph.ImmutableNetwork$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements Function<E, N> {
        public final /* synthetic */ Network val$network;

        public AnonymousClass2(Network network) {
        }

        @Override // com.google.common.base.Function
        public N apply(E e2) {
        }
    }

    /* renamed from: com.google.common.graph.ImmutableNetwork$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements Function<E, N> {
        public final /* synthetic */ Network val$network;
        public final /* synthetic */ Object val$node;

        public AnonymousClass3(Network network, Object obj) {
        }

        @Override // com.google.common.base.Function
        public N apply(E e2) {
        }
    }

    private ImmutableNetwork(Network<N, E> network) {
    }

    private static <N, E> Function<E, N> adjacentNodeFn(Network<N, E> network, N n2) {
    }

    private static <N, E> NetworkConnections<N, E> connectionsOf(Network<N, E> network, N n2) {
    }

    public static <N, E> ImmutableNetwork<N, E> copyOf(Network<N, E> network) {
    }

    private static <N, E> Map<E, N> getEdgeToReferenceNode(Network<N, E> network) {
    }

    private static <N, E> Map<N, NetworkConnections<N, E>> getNodeConnections(Network<N, E> network) {
    }

    private static <N, E> Function<E, N> sourceNodeFn(Network<N, E> network) {
    }

    private static <N, E> Function<E, N> targetNodeFn(Network<N, E> network) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsParallelEdges() {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Graph asGraph() {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder edgeOrder() {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edges() {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set edgesConnecting(Object obj, Object obj2) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set inEdges(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ EndpointPair incidentNodes(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ boolean isDirected() {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set nodes() {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network
    public /* bridge */ /* synthetic */ Set outEdges(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
    }

    @Deprecated
    public static <N, E> ImmutableNetwork<N, E> copyOf(ImmutableNetwork<N, E> immutableNetwork) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public ImmutableGraph<N> asGraph() {
    }
}
