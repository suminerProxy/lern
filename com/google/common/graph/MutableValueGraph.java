package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    @CanIgnoreReturnValue
    boolean addNode(N n2);

    @CanIgnoreReturnValue
    V putEdgeValue(EndpointPair<N> endpointPair, V v);

    @CanIgnoreReturnValue
    V putEdgeValue(N n2, N n3, V v);

    @CanIgnoreReturnValue
    V removeEdge(EndpointPair<N> endpointPair);

    @CanIgnoreReturnValue
    V removeEdge(N n2, N n3);

    @CanIgnoreReturnValue
    boolean removeNode(N n2);
}
