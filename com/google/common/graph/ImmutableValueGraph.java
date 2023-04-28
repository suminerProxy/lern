package com.google.common.graph;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable(containerOf = {"N", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableValueGraph<N, V> extends ConfigurableValueGraph<N, V> {

    /* renamed from: com.google.common.graph.ImmutableValueGraph$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Function<N, V> {
        public final /* synthetic */ ValueGraph val$graph;
        public final /* synthetic */ Object val$node;

        public AnonymousClass1(ValueGraph valueGraph, Object obj) {
        }

        @Override // com.google.common.base.Function
        public V apply(N n2) {
        }
    }

    private ImmutableValueGraph(ValueGraph<N, V> valueGraph) {
    }

    private static <N, V> GraphConnections<N, V> connectionsOf(ValueGraph<N, V> valueGraph, N n2) {
    }

    public static <N, V> ImmutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
    }

    private static <N, V> ImmutableMap<N, GraphConnections<N, V>> getNodeConnections(ValueGraph<N, V> valueGraph) {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set adjacentNodes(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean allowsSelfLoops() {
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public /* bridge */ /* synthetic */ Graph asGraph() {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.ValueGraph
    @NullableDecl
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(EndpointPair endpointPair, @NullableDecl Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ boolean isDirected() {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ ElementOrder nodeOrder() {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.Graph
    public /* bridge */ /* synthetic */ Set nodes() {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Set predecessors(Object obj) {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Set successors(Object obj) {
    }

    @Deprecated
    public static <N, V> ImmutableValueGraph<N, V> copyOf(ImmutableValueGraph<N, V> immutableValueGraph) {
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.ValueGraph
    public ImmutableGraph<N> asGraph() {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.ValueGraph
    @NullableDecl
    public /* bridge */ /* synthetic */ Object edgeValueOrDefault(Object obj, Object obj2, @NullableDecl Object obj3) {
    }

    @Override // com.google.common.graph.ConfigurableValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
    }
}
