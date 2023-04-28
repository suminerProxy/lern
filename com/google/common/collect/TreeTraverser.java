package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@Beta
@GwtCompatible
@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class TreeTraverser<T> {

    /* renamed from: com.google.common.collect.TreeTraverser$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends TreeTraverser<T> {
        public final /* synthetic */ Function val$nodeToChildrenFunction;

        public AnonymousClass1(Function function) {
        }

        @Override // com.google.common.collect.TreeTraverser
        public Iterable<T> children(T t) {
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends FluentIterable<T> {
        public final /* synthetic */ TreeTraverser this$0;
        public final /* synthetic */ Object val$root;

        public AnonymousClass2(TreeTraverser treeTraverser, Object obj) {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.lang.Iterable
        public UnmodifiableIterator<T> iterator() {
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends FluentIterable<T> {
        public final /* synthetic */ TreeTraverser this$0;
        public final /* synthetic */ Object val$root;

        public AnonymousClass3(TreeTraverser treeTraverser, Object obj) {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.lang.Iterable
        public UnmodifiableIterator<T> iterator() {
        }
    }

    /* renamed from: com.google.common.collect.TreeTraverser$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 extends FluentIterable<T> {
        public final /* synthetic */ TreeTraverser this$0;
        public final /* synthetic */ Object val$root;

        public AnonymousClass4(TreeTraverser treeTraverser, Object obj) {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.lang.Iterable
        public UnmodifiableIterator<T> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {
        private final Queue<T> queue;
        public final /* synthetic */ TreeTraverser this$0;

        public BreadthFirstIterator(TreeTraverser treeTraverser, T t) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class PostOrderIterator extends AbstractIterator<T> {
        private final ArrayDeque<PostOrderNode<T>> stack;
        public final /* synthetic */ TreeTraverser this$0;

        public PostOrderIterator(TreeTraverser treeTraverser, T t) {
        }

        private PostOrderNode<T> expand(T t) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public T computeNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PostOrderNode<T> {
        public final Iterator<T> childIterator;
        public final T root;

        public PostOrderNode(T t, Iterator<T> it) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class PreOrderIterator extends UnmodifiableIterator<T> {
        private final Deque<Iterator<T>> stack;
        public final /* synthetic */ TreeTraverser this$0;

        public PreOrderIterator(TreeTraverser treeTraverser, T t) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(Function<T, ? extends Iterable<T>> function) {
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(T t) {
    }

    public abstract Iterable<T> children(T t);

    public UnmodifiableIterator<T> postOrderIterator(T t) {
    }

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(T t) {
    }

    public UnmodifiableIterator<T> preOrderIterator(T t) {
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(T t) {
    }
}
