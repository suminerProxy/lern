package com.google.common.graph;

import com.google.common.annotations.Beta;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ValueGraphBuilder<N, V> extends AbstractGraphBuilder<N> {
    private ValueGraphBuilder(boolean z) {
    }

    private <N1 extends N, V1 extends V> ValueGraphBuilder<N1, V1> cast() {
    }

    public static ValueGraphBuilder<Object, Object> directed() {
    }

    public static <N, V> ValueGraphBuilder<N, V> from(ValueGraph<N, V> valueGraph) {
    }

    public static ValueGraphBuilder<Object, Object> undirected() {
    }

    public ValueGraphBuilder<N, V> allowsSelfLoops(boolean z) {
    }

    public <N1 extends N, V1 extends V> MutableValueGraph<N1, V1> build() {
    }

    public ValueGraphBuilder<N, V> expectedNodeCount(int i2) {
    }

    public <N1 extends N> ValueGraphBuilder<N1, V> nodeOrder(ElementOrder<N1> elementOrder) {
    }
}
