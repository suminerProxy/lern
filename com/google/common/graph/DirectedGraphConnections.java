package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private static final Object PRED = null;
    private final Map<N, Object> adjacentNodeValues;
    private int predecessorCount;
    private int successorCount;

    /* renamed from: com.google.common.graph.DirectedGraphConnections$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractSet<N> {
        public final /* synthetic */ DirectedGraphConnections this$0;

        /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00791 extends AbstractIterator<N> {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ Iterator val$entries;

            public C00791(AnonymousClass1 anonymousClass1, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
            }
        }

        public AnonymousClass1(DirectedGraphConnections directedGraphConnections) {
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
        public UnmodifiableIterator<N> iterator() {
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AbstractSet<N> {
        public final /* synthetic */ DirectedGraphConnections this$0;

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<N> {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ Iterator val$entries;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
            }
        }

        public AnonymousClass2(DirectedGraphConnections directedGraphConnections) {
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
        public UnmodifiableIterator<N> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PredAndSucc {
        private final Object successorValue;

        public PredAndSucc(Object obj) {
        }

        public static /* synthetic */ Object access$500(PredAndSucc predAndSucc) {
        }
    }

    private DirectedGraphConnections(Map<N, Object> map, int i2, int i3) {
    }

    public static /* synthetic */ Map access$000(DirectedGraphConnections directedGraphConnections) {
    }

    public static /* synthetic */ boolean access$100(Object obj) {
    }

    public static /* synthetic */ int access$200(DirectedGraphConnections directedGraphConnections) {
    }

    public static /* synthetic */ boolean access$300(Object obj) {
    }

    public static /* synthetic */ int access$400(DirectedGraphConnections directedGraphConnections) {
    }

    private static boolean isPredecessor(@NullableDecl Object obj) {
    }

    private static boolean isSuccessor(@NullableDecl Object obj) {
    }

    public static <N, V> DirectedGraphConnections<N, V> of() {
    }

    public static <N, V> DirectedGraphConnections<N, V> ofImmutable(Set<N> set, Map<N, V> map) {
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n2, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n2, V v) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n2) {
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(Object obj) {
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
    }

    @Override // com.google.common.graph.GraphConnections
    public V value(N n2) {
    }
}
