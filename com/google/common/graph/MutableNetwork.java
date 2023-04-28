package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MutableNetwork<N, E> extends Network<N, E> {
    @CanIgnoreReturnValue
    boolean addEdge(EndpointPair<N> endpointPair, E e2);

    @CanIgnoreReturnValue
    boolean addEdge(N n2, N n3, E e2);

    @CanIgnoreReturnValue
    boolean addNode(N n2);

    @CanIgnoreReturnValue
    boolean removeEdge(E e2);

    @CanIgnoreReturnValue
    boolean removeNode(N n2);
}
