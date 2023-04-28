package com.google.common.graph;

import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UndirectedNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {
    public UndirectedNetworkConnections(Map<E, N> map) {
    }

    public static <N, E> UndirectedNetworkConnections<N, E> of() {
    }

    public static <N, E> UndirectedNetworkConnections<N, E> ofImmutable(Map<E, N> map) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n2) {
    }
}
