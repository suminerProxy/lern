package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 1;
    private final transient AvlNode<E> header;
    private final transient GeneralRange<E> range;
    private final transient Reference<AvlNode<E>> rootReference;

    /* renamed from: com.google.common.collect.TreeMultiset$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Multisets.AbstractEntry<E> {
        public final /* synthetic */ TreeMultiset this$0;
        public final /* synthetic */ AvlNode val$baseEntry;

        public AnonymousClass1(TreeMultiset treeMultiset, AvlNode avlNode) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public E getElement() {
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Iterator<Multiset.Entry<E>> {
        public AvlNode<E> current;
        @NullableDecl
        public Multiset.Entry<E> prevEntry;
        public final /* synthetic */ TreeMultiset this$0;

        public AnonymousClass2(TreeMultiset treeMultiset) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Multiset.Entry<E> next() {
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Iterator<Multiset.Entry<E>> {
        public AvlNode<E> current;
        public Multiset.Entry<E> prevEntry;
        public final /* synthetic */ TreeMultiset this$0;

        public AnonymousClass3(TreeMultiset treeMultiset) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Multiset.Entry<E> next() {
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Aggregate {
        private static final /* synthetic */ Aggregate[] $VALUES = null;
        public static final Aggregate DISTINCT = null;
        public static final Aggregate SIZE = null;

        /* renamed from: com.google.common.collect.TreeMultiset$Aggregate$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends Aggregate {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> avlNode) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@NullableDecl AvlNode<?> avlNode) {
            }
        }

        /* renamed from: com.google.common.collect.TreeMultiset$Aggregate$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends Aggregate {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> avlNode) {
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(@NullableDecl AvlNode<?> avlNode) {
            }
        }

        private Aggregate(String str, int i2) {
        }

        public static Aggregate valueOf(String str) {
        }

        public static Aggregate[] values() {
        }

        public abstract int nodeAggregate(AvlNode<?> avlNode);

        public abstract long treeAggregate(@NullableDecl AvlNode<?> avlNode);

        public /* synthetic */ Aggregate(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Reference<T> {
        @NullableDecl
        private T value;

        private Reference() {
        }

        public void checkAndSet(@NullableDecl T t, T t2) {
        }

        public void clear() {
        }

        @NullableDecl
        public T get() {
        }

        public /* synthetic */ Reference(AnonymousClass1 anonymousClass1) {
        }
    }

    public TreeMultiset(Reference<AvlNode<E>> reference, GeneralRange<E> generalRange, AvlNode<E> avlNode) {
    }

    public static /* synthetic */ AvlNode access$1200(TreeMultiset treeMultiset) {
    }

    public static /* synthetic */ GeneralRange access$1300(TreeMultiset treeMultiset) {
    }

    public static /* synthetic */ Multiset.Entry access$1400(TreeMultiset treeMultiset, AvlNode avlNode) {
    }

    public static /* synthetic */ AvlNode access$1500(TreeMultiset treeMultiset) {
    }

    public static /* synthetic */ AvlNode access$1600(TreeMultiset treeMultiset) {
    }

    public static /* synthetic */ void access$1700(AvlNode avlNode, AvlNode avlNode2, AvlNode avlNode3) {
    }

    public static /* synthetic */ void access$1800(AvlNode avlNode, AvlNode avlNode2) {
    }

    private long aggregateAboveRange(Aggregate aggregate, @NullableDecl AvlNode<E> avlNode) {
    }

    private long aggregateBelowRange(Aggregate aggregate, @NullableDecl AvlNode<E> avlNode) {
    }

    private long aggregateForEntries(Aggregate aggregate) {
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
    }

    @NullableDecl
    private AvlNode<E> firstNode() {
    }

    @NullableDecl
    private AvlNode<E> lastNode() {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2) {
    }

    private Multiset.Entry<E> wrapEntry(AvlNode<E> avlNode) {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@NullableDecl E e2, int i2) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ Comparator comparator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    public Iterator<Multiset.Entry<E>> descendingEntryIterator() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset descendingMultiset() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry firstEntry() {
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@NullableDecl E e2, BoundType boundType) {
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry lastEntry() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollFirstEntry() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ Multiset.Entry pollLastEntry() {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e2, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(@NullableDecl Object obj, BoundType boundType, @NullableDecl Object obj2, BoundType boundType2) {
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@NullableDecl E e2, BoundType boundType) {
    }

    public static <E> TreeMultiset<E> create(@NullableDecl Comparator<? super E> comparator) {
    }

    public static int distinctElements(@NullableDecl AvlNode<?> avlNode) {
    }

    private static <T> void successor(AvlNode<T> avlNode, AvlNode<T> avlNode2, AvlNode<T> avlNode3) {
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
    }

    public TreeMultiset(Comparator<? super E> comparator) {
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e2, int i2, int i3) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AvlNode<E> {
        private int distinctElements;
        @NullableDecl
        private final E elem;
        private int elemCount;
        private int height;
        @NullableDecl
        private AvlNode<E> left;
        @NullableDecl
        private AvlNode<E> pred;
        @NullableDecl
        private AvlNode<E> right;
        @NullableDecl
        private AvlNode<E> succ;
        private long totalCount;

        public AvlNode(@NullableDecl E e2, int i2) {
        }

        public static /* synthetic */ AvlNode access$1000(AvlNode avlNode, Comparator comparator, Object obj) {
        }

        public static /* synthetic */ AvlNode access$1100(AvlNode avlNode, Comparator comparator, Object obj) {
        }

        public static /* synthetic */ int access$200(AvlNode avlNode) {
        }

        public static /* synthetic */ int access$202(AvlNode avlNode, int i2) {
        }

        public static /* synthetic */ long access$300(AvlNode avlNode) {
        }

        public static /* synthetic */ int access$400(AvlNode avlNode) {
        }

        public static /* synthetic */ Object access$500(AvlNode avlNode) {
        }

        public static /* synthetic */ AvlNode access$600(AvlNode avlNode) {
        }

        public static /* synthetic */ AvlNode access$602(AvlNode avlNode, AvlNode avlNode2) {
        }

        public static /* synthetic */ AvlNode access$700(AvlNode avlNode) {
        }

        public static /* synthetic */ AvlNode access$702(AvlNode avlNode, AvlNode avlNode2) {
        }

        public static /* synthetic */ AvlNode access$800(AvlNode avlNode) {
        }

        public static /* synthetic */ AvlNode access$802(AvlNode avlNode, AvlNode avlNode2) {
        }

        public static /* synthetic */ AvlNode access$900(AvlNode avlNode) {
        }

        public static /* synthetic */ AvlNode access$902(AvlNode avlNode, AvlNode avlNode2) {
        }

        private AvlNode<E> addLeftChild(E e2, int i2) {
        }

        private AvlNode<E> addRightChild(E e2, int i2) {
        }

        private int balanceFactor() {
        }

        @NullableDecl
        private AvlNode<E> ceiling(Comparator<? super E> comparator, E e2) {
        }

        private AvlNode<E> deleteMe() {
        }

        @NullableDecl
        private AvlNode<E> floor(Comparator<? super E> comparator, E e2) {
        }

        private static int height(@NullableDecl AvlNode<?> avlNode) {
        }

        private AvlNode<E> rebalance() {
        }

        private void recompute() {
        }

        private void recomputeHeight() {
        }

        private void recomputeMultiset() {
        }

        private AvlNode<E> removeMax(AvlNode<E> avlNode) {
        }

        private AvlNode<E> removeMin(AvlNode<E> avlNode) {
        }

        private AvlNode<E> rotateLeft() {
        }

        private AvlNode<E> rotateRight() {
        }

        private static long totalCount(@NullableDecl AvlNode<?> avlNode) {
        }

        public AvlNode<E> add(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
        }

        public int count(Comparator<? super E> comparator, E e2) {
        }

        public int getCount() {
        }

        public E getElement() {
        }

        public AvlNode<E> remove(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
        }

        public AvlNode<E> setCount(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int[] iArr) {
        }

        public String toString() {
        }

        public AvlNode<E> setCount(Comparator<? super E> comparator, @NullableDecl E e2, int i2, int i3, int[] iArr) {
        }
    }
}
