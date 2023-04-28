package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface NetworkConnections<N, E> {
    void addInEdge(E e2, N n2, boolean z);

    void addOutEdge(E e2, N n2);

    N adjacentNode(E e2);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N n2);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CanIgnoreReturnValue
    N removeInEdge(E e2, boolean z);

    @CanIgnoreReturnValue
    N removeOutEdge(E e2);

    Set<N> successors();
}
