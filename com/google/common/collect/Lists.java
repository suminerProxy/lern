package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Lists {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Lists$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<E> extends RandomAccessListWrapper<E> {
        private static final long serialVersionUID = 0;

        public AnonymousClass1(List list) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i2) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Lists$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<E> extends AbstractListWrapper<E> {
        private static final long serialVersionUID = 0;

        public AnonymousClass2(List list) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AbstractListWrapper<E> extends AbstractList<E> {
        public final List<E> backingList;

        public AbstractListWrapper(List<E> list) {
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, E e2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i2, Collection<? extends E> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i2, E e2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CharSequenceAsList extends AbstractList<Character> {
        private final CharSequence sequence;

        public CharSequenceAsList(CharSequence charSequence) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @NullableDecl
        public final E first;
        public final E[] rest;

        public OnePlusArrayList(@NullableDecl E e2, E[] eArr) {
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Partition<T> extends AbstractList<List<T>> {
        public final List<T> list;
        public final int size;

        public Partition(List<T> list, int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
        public RandomAccessListWrapper(List<E> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        public RandomAccessPartition(List<T> list, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        public RandomAccessReverseList(List<T> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ReverseList<T> extends AbstractList<T> {
        private final List<T> forwardList;

        /* renamed from: com.google.common.collect.Lists$ReverseList$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements ListIterator<T> {
            public boolean canRemoveOrSet;
            public final /* synthetic */ ReverseList this$0;
            public final /* synthetic */ ListIterator val$forwardIterator;

            public AnonymousClass1(ReverseList reverseList, ListIterator listIterator) {
            }

            @Override // java.util.ListIterator
            public void add(T t) {
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
            }

            @Override // java.util.ListIterator
            public T previous() {
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
            }

            @Override // java.util.ListIterator
            public void set(T t) {
            }
        }

        public ReverseList(List<T> list) {
        }

        public static /* synthetic */ int access$000(ReverseList reverseList, int i2) {
        }

        private int reverseIndex(int i2) {
        }

        private int reversePosition(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, @NullableDecl T t) {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
        }

        public List<T> getForwardList() {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i2) {
        }

        @Override // java.util.AbstractList
        public void removeRange(int i2, int i3) {
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i2, @NullableDecl T t) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        }

        @Override // java.util.List
        public Character get(int i2) {
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> fromList;
        public final Function<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingRandomAccessList$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TransformedListIterator<F, T> {
            public final /* synthetic */ TransformingRandomAccessList this$0;

            public AnonymousClass1(TransformingRandomAccessList transformingRandomAccessList, ListIterator listIterator) {
            }

            @Override // com.google.common.collect.TransformedIterator
            public T transform(F f2) {
            }
        }

        public TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final List<F> fromList;
        public final Function<? super F, ? extends T> function;

        /* renamed from: com.google.common.collect.Lists$TransformingSequentialList$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TransformedListIterator<F, T> {
            public final /* synthetic */ TransformingSequentialList this$0;

            public AnonymousClass1(TransformingSequentialList transformingSequentialList, ListIterator listIterator) {
            }

            @Override // com.google.common.collect.TransformedIterator
            public T transform(F f2) {
            }
        }

        public TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        @NullableDecl
        public final E first;
        public final E[] rest;
        @NullableDecl
        public final E second;

        public TwoPlusArrayList(@NullableDecl E e2, @NullableDecl E e3, E[] eArr) {
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    private Lists() {
    }

    public static <E> boolean addAllImpl(List<E> list, int i2, Iterable<? extends E> iterable) {
    }

    public static <E> List<E> asList(@NullableDecl E e2, E[] eArr) {
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
    }

    public static <T> List<T> cast(Iterable<T> iterable) {
    }

    public static ImmutableList<Character> charactersOf(String str) {
    }

    @VisibleForTesting
    public static int computeArrayListCapacity(int i2) {
    }

    public static boolean equalsImpl(List<?> list, @NullableDecl Object obj) {
    }

    public static int hashCodeImpl(List<?> list) {
    }

    public static int indexOfImpl(List<?> list, @NullableDecl Object obj) {
    }

    private static int indexOfRandomAccess(List<?> list, @NullableDecl Object obj) {
    }

    public static int lastIndexOfImpl(List<?> list, @NullableDecl Object obj) {
    }

    private static int lastIndexOfRandomAccess(List<?> list, @NullableDecl Object obj) {
    }

    public static <E> ListIterator<E> listIteratorImpl(List<E> list, int i2) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i2) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i2) {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
    }

    public static <T> List<List<T>> partition(List<T> list, int i2) {
    }

    public static <T> List<T> reverse(List<T> list) {
    }

    public static <E> List<E> subListImpl(List<E> list, int i2, int i3) {
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
    }

    public static <E> List<E> asList(@NullableDecl E e2, @NullableDecl E e3, E[] eArr) {
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
    }

    @Beta
    public static List<Character> charactersOf(CharSequence charSequence) {
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
    }
}
