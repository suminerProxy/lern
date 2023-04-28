package com.google.common.graph;

import com.google.common.annotations.Beta;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class GraphBuilder<N> extends AbstractGraphBuilder<N> {
    private GraphBuilder(boolean z) {
    }

    private <N1 extends N> GraphBuilder<N1> cast() {
    }

    public static GraphBuilder<Object> directed() {
    }

    public static <N> GraphBuilder<N> from(Graph<N> graph) {
    }

    public static GraphBuilder<Object> undirected() {
    }

    public GraphBuilder<N> allowsSelfLoops(boolean z) {
    }

    public <N1 extends N> MutableGraph<N1> build() {
    }

    public GraphBuilder<N> expectedNodeCount(int i2) {
    }

    public <N1 extends N> GraphBuilder<N1> nodeOrder(ElementOrder<N1> elementOrder) {
    }
}
