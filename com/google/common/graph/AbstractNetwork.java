package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* renamed from: com.google.common.graph.AbstractNetwork$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractGraph<N> {
        public final /* synthetic */ AbstractNetwork this$0;

        /* renamed from: com.google.common.graph.AbstractNetwork$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00771 extends AbstractSet<EndpointPair<N>> {
            public final /* synthetic */ AnonymousClass1 this$1;

            /* renamed from: com.google.common.graph.AbstractNetwork$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00781 implements Function<E, EndpointPair<N>> {
                public final /* synthetic */ C00771 this$2;

                public C00781(C00771 c00771) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public EndpointPair<N> apply(E e2) {
                }
            }

            public C00771(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@NullableDecl Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
            }
        }

        public AnonymousClass1(AbstractNetwork abstractNetwork) {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> adjacentNodes(N n2) {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> edges() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public ElementOrder<N> nodeOrder() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> nodes() {
        }

        @Override // com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        }

        @Override // com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n2) {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n2) {
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Predicate<E> {
        public final /* synthetic */ AbstractNetwork this$0;
        public final /* synthetic */ Object val$nodePresent;
        public final /* synthetic */ Object val$nodeToCheck;

        public AnonymousClass2(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(E e2) {
        }
    }

    /* renamed from: com.google.common.graph.AbstractNetwork$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements Function<E, EndpointPair<N>> {
        public final /* synthetic */ Network val$network;

        public AnonymousClass3(Network network) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @Override // com.google.common.base.Function
        public EndpointPair<N> apply(E e2) {
        }
    }

    private Predicate<E> connectedPredicate(N n2, N n3) {
    }

    private static <N, E> Map<E, EndpointPair<N>> edgeIncidentNodesMap(Network<N, E> network) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e2) {
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
    }

    @Override // com.google.common.graph.Network
    public int degree(N n2) {
    }

    @Override // com.google.common.graph.Network
    @NullableDecl
    public E edgeConnectingOrNull(N n2, N n3) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n2, N n3) {
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n2, N n3) {
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n2) {
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n2) {
    }

    public String toString() {
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    @NullableDecl
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
    }
}
