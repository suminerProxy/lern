package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Traverser<N> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Order {
        private static final /* synthetic */ Order[] $VALUES = null;
        public static final Order POSTORDER = null;
        public static final Order PREORDER = null;

        private Order(String str, int i2) {
        }

        public static Order valueOf(String str) {
        }

        public static Order[] values() {
        }
    }

    public /* synthetic */ Traverser(AnonymousClass1 anonymousClass1) {
    }

    public static <N> Traverser<N> forGraph(SuccessorsFunction<N> successorsFunction) {
    }

    public static <N> Traverser<N> forTree(SuccessorsFunction<N> successorsFunction) {
    }

    public abstract Iterable<N> breadthFirst(Iterable<? extends N> iterable);

    public abstract Iterable<N> breadthFirst(N n2);

    public abstract Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable);

    public abstract Iterable<N> depthFirstPostOrder(N n2);

    public abstract Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable);

    public abstract Iterable<N> depthFirstPreOrder(N n2);

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class GraphTraverser<N> extends Traverser<N> {
        private final SuccessorsFunction<N> graph;

        /* renamed from: com.google.common.graph.Traverser$GraphTraverser$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Iterable<N> {
            public final /* synthetic */ GraphTraverser this$0;
            public final /* synthetic */ Iterable val$startNodes;

            public AnonymousClass1(GraphTraverser graphTraverser, Iterable iterable) {
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$GraphTraverser$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Iterable<N> {
            public final /* synthetic */ GraphTraverser this$0;
            public final /* synthetic */ Iterable val$startNodes;

            public AnonymousClass2(GraphTraverser graphTraverser, Iterable iterable) {
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$GraphTraverser$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 implements Iterable<N> {
            public final /* synthetic */ GraphTraverser this$0;
            public final /* synthetic */ Iterable val$startNodes;

            public AnonymousClass3(GraphTraverser graphTraverser, Iterable iterable) {
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class BreadthFirstIterator extends UnmodifiableIterator<N> {
            private final Queue<N> queue;
            public final /* synthetic */ GraphTraverser this$0;
            private final Set<N> visited;

            public BreadthFirstIterator(GraphTraverser graphTraverser, Iterable<? extends N> iterable) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public N next() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class DepthFirstIterator extends AbstractIterator<N> {
            private final Order order;
            private final Deque<GraphTraverser<N>.DepthFirstIterator.NodeAndSuccessors> stack;
            public final /* synthetic */ GraphTraverser this$0;
            private final Set<N> visited;

            /* JADX WARN: Field signature parse error: node
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TN at position 1 ('N'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
             */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public final class NodeAndSuccessors {
                @NullableDecl
                public final Object node;
                public final Iterator<? extends N> successorIterator;
                public final /* synthetic */ DepthFirstIterator this$1;

                public NodeAndSuccessors(@NullableDecl DepthFirstIterator depthFirstIterator, N n2, Iterable<? extends N> iterable) {
                }
            }

            public DepthFirstIterator(GraphTraverser graphTraverser, Iterable<? extends N> iterable, Order order) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
            }

            public GraphTraverser<N>.DepthFirstIterator.NodeAndSuccessors withSuccessors(N n2) {
            }
        }

        public GraphTraverser(SuccessorsFunction<N> successorsFunction) {
        }

        public static /* synthetic */ SuccessorsFunction access$100(GraphTraverser graphTraverser) {
        }

        private void checkThatNodeIsInGraph(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TreeTraverser<N> extends Traverser<N> {
        private final SuccessorsFunction<N> tree;

        /* renamed from: com.google.common.graph.Traverser$TreeTraverser$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Iterable<N> {
            public final /* synthetic */ TreeTraverser this$0;
            public final /* synthetic */ Iterable val$startNodes;

            public AnonymousClass1(TreeTraverser treeTraverser, Iterable iterable) {
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$TreeTraverser$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Iterable<N> {
            public final /* synthetic */ TreeTraverser this$0;
            public final /* synthetic */ Iterable val$startNodes;

            public AnonymousClass2(TreeTraverser treeTraverser, Iterable iterable) {
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
            }
        }

        /* renamed from: com.google.common.graph.Traverser$TreeTraverser$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass3 implements Iterable<N> {
            public final /* synthetic */ TreeTraverser this$0;
            public final /* synthetic */ Iterable val$startNodes;

            public AnonymousClass3(TreeTraverser treeTraverser, Iterable iterable) {
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class BreadthFirstIterator extends UnmodifiableIterator<N> {
            private final Queue<N> queue;
            public final /* synthetic */ TreeTraverser this$0;

            public BreadthFirstIterator(TreeTraverser treeTraverser, Iterable<? extends N> iterable) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public N next() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class DepthFirstPostOrderIterator extends AbstractIterator<N> {
            private final ArrayDeque<TreeTraverser<N>.DepthFirstPostOrderIterator.NodeAndChildren> stack;
            public final /* synthetic */ TreeTraverser this$0;

            /* JADX WARN: Field signature parse error: node
            jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TN at position 1 ('N'), unexpected: T
            	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
            	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:128)
            	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:36)
             */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public final class NodeAndChildren {
                public final Iterator<? extends N> childIterator;
                @NullableDecl
                public final Object node;
                public final /* synthetic */ DepthFirstPostOrderIterator this$1;

                public NodeAndChildren(@NullableDecl DepthFirstPostOrderIterator depthFirstPostOrderIterator, N n2, Iterable<? extends N> iterable) {
                }
            }

            public DepthFirstPostOrderIterator(TreeTraverser treeTraverser, Iterable<? extends N> iterable) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
            }

            public TreeTraverser<N>.DepthFirstPostOrderIterator.NodeAndChildren withChildren(N n2) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class DepthFirstPreOrderIterator extends UnmodifiableIterator<N> {
            private final Deque<Iterator<? extends N>> stack;
            public final /* synthetic */ TreeTraverser this$0;

            public DepthFirstPreOrderIterator(TreeTraverser treeTraverser, Iterable<? extends N> iterable) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public N next() {
            }
        }

        public TreeTraverser(SuccessorsFunction<N> successorsFunction) {
        }

        public static /* synthetic */ SuccessorsFunction access$200(TreeTraverser treeTraverser) {
        }

        private void checkThatNodeIsInTree(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(N n2) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        }

        @Override // com.google.common.graph.Traverser
        public Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        }
    }

    private Traverser() {
    }
}
