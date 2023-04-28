package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    public final Map<E, N> inEdgeMap;
    public final Map<E, N> outEdgeMap;
    private int selfLoopCount;

    /* renamed from: com.google.common.graph.AbstractDirectedNetworkConnections$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractSet<E> {
        public final /* synthetic */ AbstractDirectedNetworkConnections this$0;

        public AnonymousClass1(AbstractDirectedNetworkConnections abstractDirectedNetworkConnections) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    public AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i2) {
    }

    public static /* synthetic */ int access$000(AbstractDirectedNetworkConnections abstractDirectedNetworkConnections) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e2, N n2, boolean z) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e2, N n2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e2) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e2, boolean z) {
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e2) {
    }
}
