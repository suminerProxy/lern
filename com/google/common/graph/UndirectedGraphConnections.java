package com.google.common.graph;

import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private final Map<N, V> adjacentNodeValues;

    private UndirectedGraphConnections(Map<N, V> map) {
    }

    public static <N, V> UndirectedGraphConnections<N, V> of() {
    }

    public static <N, V> UndirectedGraphConnections<N, V> ofImmutable(Map<N, V> map) {
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n2, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n2, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n2) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(N n2) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N n2) {
    }
}
