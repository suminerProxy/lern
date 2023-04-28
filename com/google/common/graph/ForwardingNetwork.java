package com.google.common.graph;

import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingNetwork<N, E> extends AbstractNetwork<N, E> {
    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> adjacentEdges(E e2) {
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

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int degree(N n2) {
    }

    public abstract Network<N, E> delegate();

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(N n2, N n3) {
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

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n2, N n3) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int inDegree(N n2) {
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

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public int outDegree(N n2) {
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

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n2) {
    }

    @Override // com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n2) {
    }
}
