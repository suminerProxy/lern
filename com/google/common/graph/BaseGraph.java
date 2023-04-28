package com.google.common.graph;

import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface BaseGraph<N> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    Set<N> adjacentNodes(N n2);

    boolean allowsSelfLoops();

    int degree(N n2);

    Set<EndpointPair<N>> edges();

    boolean hasEdgeConnecting(EndpointPair<N> endpointPair);

    boolean hasEdgeConnecting(N n2, N n3);

    int inDegree(N n2);

    Set<EndpointPair<N>> incidentEdges(N n2);

    boolean isDirected();

    ElementOrder<N> nodeOrder();

    Set<N> nodes();

    int outDegree(N n2);

    Set<N> predecessors(N n2);

    @Override // com.google.common.graph.SuccessorsFunction
    Set<N> successors(N n2);
}
