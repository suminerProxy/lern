package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Collections2 {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredCollection<E> extends AbstractCollection<E> {
        public final Predicate<? super E> predicate;
        public final Collection<E> unfiltered;

        public FilteredCollection(Collection<E> collection, Predicate<? super E> predicate) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        public FilteredCollection<E> createCombined(Predicate<? super E> predicate) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {
        public final Comparator<? super E> comparator;
        public final ImmutableList<E> inputList;
        public final int size;

        public OrderedPermutationCollection(Iterable<E> iterable, Comparator<? super E> comparator) {
        }

        private static <E> int calculateSize(List<E> list, Comparator<? super E> comparator) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {
        public final Comparator<? super E> comparator;
        @NullableDecl
        public List<E> nextPermutation;

        public OrderedPermutationIterator(List<E> list, Comparator<? super E> comparator) {
        }

        public void calculateNextPermutation() {
        }

        @Override // com.google.common.collect.AbstractIterator
        public /* bridge */ /* synthetic */ Object computeNext() {
        }

        public int findNextJ() {
        }

        public int findNextL(int i2) {
        }

        @Override // com.google.common.collect.AbstractIterator
        public List<E> computeNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PermutationCollection<E> extends AbstractCollection<List<E>> {
        public final ImmutableList<E> inputList;

        public PermutationCollection(ImmutableList<E> immutableList) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PermutationIterator<E> extends AbstractIterator<List<E>> {
        public final int[] c;

        /* renamed from: j  reason: collision with root package name */
        public int f3361j;
        public final List<E> list;

        /* renamed from: o  reason: collision with root package name */
        public final int[] f3362o;

        public PermutationIterator(List<E> list) {
        }

        public void calculateNextPermutation() {
        }

        @Override // com.google.common.collect.AbstractIterator
        public /* bridge */ /* synthetic */ Object computeNext() {
        }

        public void switchDirection() {
        }

        @Override // com.google.common.collect.AbstractIterator
        public List<E> computeNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransformedCollection<F, T> extends AbstractCollection<T> {
        public final Collection<F> fromCollection;
        public final Function<? super F, ? extends T> function;

        public TransformedCollection(Collection<F> collection, Function<? super F, ? extends T> function) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    private Collections2() {
    }

    public static /* synthetic */ boolean access$000(List list, List list2) {
    }

    public static <T> Collection<T> cast(Iterable<T> iterable) {
    }

    public static boolean containsAllImpl(Collection<?> collection, Collection<?> collection2) {
    }

    private static <E> ObjectCountHashMap<E> counts(Collection<E> collection) {
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
    }

    private static boolean isPermutation(List<?> list, List<?> list2) {
    }

    public static StringBuilder newStringBuilderForCollection(int i2) {
    }

    @Beta
    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
    }

    @Beta
    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
    }

    public static boolean safeContains(Collection<?> collection, @NullableDecl Object obj) {
    }

    public static boolean safeRemove(Collection<?> collection, @NullableDecl Object obj) {
    }

    public static String toStringImpl(Collection<?> collection) {
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
    }

    @Beta
    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
    }
}
