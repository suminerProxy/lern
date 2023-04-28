package com.google.common.graph;

import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UndirectedMultiNetworkConnections<N, E> extends AbstractUndirectedNetworkConnections<N, E> {
    @LazyInit
    private transient Reference<Multiset<N>> adjacentNodesReference;

    /* renamed from: com.google.common.graph.UndirectedMultiNetworkConnections$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends MultiEdgesConnecting<E> {
        public final /* synthetic */ UndirectedMultiNetworkConnections this$0;
        public final /* synthetic */ Object val$node;

        public AnonymousClass1(UndirectedMultiNetworkConnections undirectedMultiNetworkConnections, Map map, Object obj, Object obj2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    private UndirectedMultiNetworkConnections(Map<E, N> map) {
    }

    public static /* synthetic */ Multiset access$000(UndirectedMultiNetworkConnections undirectedMultiNetworkConnections) {
    }

    private Multiset<N> adjacentNodesMultiset() {
    }

    @NullableDecl
    private static <T> T getReference(@NullableDecl Reference<T> reference) {
    }

    public static <N, E> UndirectedMultiNetworkConnections<N, E> of() {
    }

    public static <N, E> UndirectedMultiNetworkConnections<N, E> ofImmutable(Map<E, N> map) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addInEdge(E e2, N n2, boolean z) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public void addOutEdge(E e2, N n2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> edgesConnecting(N n2) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeInEdge(E e2, boolean z) {
    }

    @Override // com.google.common.graph.AbstractUndirectedNetworkConnections, com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e2) {
    }
}
