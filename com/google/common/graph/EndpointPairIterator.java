package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {
    private final BaseGraph<N> graph;
    public N node;
    private final Iterator<N> nodeIterator;
    public Iterator<N> successorIterator;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Directed<N> extends EndpointPairIterator<N> {
        public /* synthetic */ Directed(BaseGraph baseGraph, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public /* bridge */ /* synthetic */ Object computeNext() {
        }

        private Directed(BaseGraph<N> baseGraph) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public EndpointPair<N> computeNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Undirected<N> extends EndpointPairIterator<N> {
        private Set<N> visitedNodes;

        public /* synthetic */ Undirected(BaseGraph baseGraph, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public /* bridge */ /* synthetic */ Object computeNext() {
        }

        private Undirected(BaseGraph<N> baseGraph) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public EndpointPair<N> computeNext() {
        }
    }

    public /* synthetic */ EndpointPairIterator(BaseGraph baseGraph, AnonymousClass1 anonymousClass1) {
    }

    public static <N> EndpointPairIterator<N> of(BaseGraph<N> baseGraph) {
    }

    public final boolean advance() {
    }

    private EndpointPairIterator(BaseGraph<N> baseGraph) {
    }
}
