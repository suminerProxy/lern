package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable(containerOf = {"N"})
@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class EndpointPair<N> implements Iterable<N> {
    private final N nodeU;
    private final N nodeV;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Ordered<N> extends EndpointPair<N> {
        public /* synthetic */ Ordered(Object obj, Object obj2, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
        }

        public String toString() {
        }

        private Ordered(N n2, N n3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Unordered<N> extends EndpointPair<N> {
        public /* synthetic */ Unordered(Object obj, Object obj2, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.graph.EndpointPair
        public int hashCode() {
        }

        @Override // com.google.common.graph.EndpointPair
        public boolean isOrdered() {
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N source() {
        }

        @Override // com.google.common.graph.EndpointPair
        public N target() {
        }

        public String toString() {
        }

        private Unordered(N n2, N n3) {
        }
    }

    public /* synthetic */ EndpointPair(Object obj, Object obj2, AnonymousClass1 anonymousClass1) {
    }

    public static <N> EndpointPair<N> of(Graph<?> graph, N n2, N n3) {
    }

    public static <N> EndpointPair<N> ordered(N n2, N n3) {
    }

    public static <N> EndpointPair<N> unordered(N n2, N n3) {
    }

    public final N adjacentNode(Object obj) {
    }

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract int hashCode();

    public abstract boolean isOrdered();

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
    }

    public final N nodeU() {
    }

    public final N nodeV() {
    }

    public abstract N source();

    public abstract N target();

    private EndpointPair(N n2, N n3) {
    }

    public static <N> EndpointPair<N> of(Network<?, ?> network, N n2, N n3) {
    }

    @Override // java.lang.Iterable
    public final UnmodifiableIterator<N> iterator() {
    }
}
