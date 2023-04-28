package com.google.common.graph;

import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    public final Map<E, N> incidentEdgeMap;

    public AbstractUndirectedNetworkConnections(Map<E, N> map) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e2, N n2, boolean z) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e2, N n2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e2, boolean z) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
    }
}
