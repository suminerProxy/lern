package com.google.common.graph;

import com.google.common.graph.GraphConstants;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ConfigurableMutableGraph<N> extends ForwardingGraph<N> implements MutableGraph<N> {
    private final MutableValueGraph<N, GraphConstants.Presence> backingValueGraph;

    public ConfigurableMutableGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(N n2) {
    }

    @Override // com.google.common.graph.ForwardingGraph
    public BaseGraph<N> delegate() {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(N n2, N n3) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(N n2, N n3) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(N n2) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(EndpointPair<N> endpointPair) {
    }
}
