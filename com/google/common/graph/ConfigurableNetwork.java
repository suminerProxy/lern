package com.google.common.graph;

import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ConfigurableNetwork<N, E> extends AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final ElementOrder<E> edgeOrder;
    public final MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    public final MapIteratorCache<N, NetworkConnections<N, E>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    public ConfigurableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n2) {
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
    }

    public final NetworkConnections<N, E> checkedConnections(N n2) {
    }

    public final N checkedReferenceNode(E e2) {
    }

    public final boolean containsEdge(@NullableDecl E e2) {
    }

    public final boolean containsNode(@NullableDecl N n2) {
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n2, N n3) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n2) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n2) {
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e2) {
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n2) {
    }

    @Override // com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
    }

    @Override // com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n2) {
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n2) {
    }

    public ConfigurableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder, Map<N, NetworkConnections<N, E>> map, Map<E, N> map2) {
    }
}
