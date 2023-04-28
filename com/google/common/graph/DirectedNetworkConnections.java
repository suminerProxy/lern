package com.google.common.graph;

import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DirectedNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    public DirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i2) {
    }

    public static <N, E> DirectedNetworkConnections<N, E> of() {
    }

    public static <N, E> DirectedNetworkConnections<N, E> ofImmutable(Map<E, N> map, Map<E, N> map2, int i2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
    }
}
