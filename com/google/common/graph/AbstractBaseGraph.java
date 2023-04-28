package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* renamed from: com.google.common.graph.AbstractBaseGraph$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractSet<EndpointPair<N>> {
        public final /* synthetic */ AbstractBaseGraph this$0;

        public AnonymousClass1(AbstractBaseGraph abstractBaseGraph) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class IncidentEdgeSet<N> extends AbstractSet<EndpointPair<N>> {
        public final BaseGraph<N> graph;
        public final N node;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Directed<N> extends IncidentEdgeSet<N> {

            /* renamed from: com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 implements Function<N, EndpointPair<N>> {
                public final /* synthetic */ Directed this$0;

                public AnonymousClass1(Directed directed) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public EndpointPair<N> apply(N n2) {
                }
            }

            /* renamed from: com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Directed$2  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass2 implements Function<N, EndpointPair<N>> {
                public final /* synthetic */ Directed this$0;

                public AnonymousClass2(Directed directed) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public EndpointPair<N> apply(N n2) {
                }
            }

            public /* synthetic */ Directed(BaseGraph baseGraph, Object obj, AnonymousClass1 anonymousClass1) {
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

            private Directed(BaseGraph<N> baseGraph, N n2) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Undirected<N> extends IncidentEdgeSet<N> {

            /* renamed from: com.google.common.graph.AbstractBaseGraph$IncidentEdgeSet$Undirected$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 implements Function<N, EndpointPair<N>> {
                public final /* synthetic */ Undirected this$0;

                public AnonymousClass1(Undirected undirected) {
                }

                @Override // com.google.common.base.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                }

                @Override // com.google.common.base.Function
                public EndpointPair<N> apply(N n2) {
                }
            }

            public /* synthetic */ Undirected(BaseGraph baseGraph, Object obj, AnonymousClass1 anonymousClass1) {
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

            private Undirected(BaseGraph<N> baseGraph, N n2) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
            }
        }

        public /* synthetic */ IncidentEdgeSet(BaseGraph baseGraph, Object obj, AnonymousClass1 anonymousClass1) {
        }

        public static <N> IncidentEdgeSet<N> of(BaseGraph<N> baseGraph, N n2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        private IncidentEdgeSet(BaseGraph<N> baseGraph, N n2) {
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n2) {
    }

    public long edgeCount() {
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n2, N n3) {
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n2) {
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n2) {
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n2) {
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
    }
}
