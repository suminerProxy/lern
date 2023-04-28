package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Multisets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset1;
        public final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00711 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ AnonymousClass1 this$0;
            public final /* synthetic */ Iterator val$iterator1;
            public final /* synthetic */ Iterator val$iterator2;

            public C00711(AnonymousClass1 anonymousClass1, Iterator it, Iterator it2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Multiset.Entry<E> computeNext() {
            }
        }

        public AnonymousClass1(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset1;
        public final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ AnonymousClass2 this$0;
            public final /* synthetic */ Iterator val$iterator1;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Multiset.Entry<E> computeNext() {
            }
        }

        public AnonymousClass2(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset1;
        public final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ AnonymousClass3 this$0;
            public final /* synthetic */ Iterator val$iterator1;
            public final /* synthetic */ Iterator val$iterator2;

            public AnonymousClass1(AnonymousClass3 anonymousClass3, Iterator it, Iterator it2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Multiset.Entry<E> computeNext() {
            }
        }

        public AnonymousClass3(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4<E> extends ViewMultiset<E> {
        public final /* synthetic */ Multiset val$multiset1;
        public final /* synthetic */ Multiset val$multiset2;

        /* renamed from: com.google.common.collect.Multisets$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final /* synthetic */ AnonymousClass4 this$0;
            public final /* synthetic */ Iterator val$iterator1;

            public AnonymousClass1(AnonymousClass4 anonymousClass4, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
            }
        }

        /* renamed from: com.google.common.collect.Multisets$4$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractIterator<Multiset.Entry<E>> {
            public final /* synthetic */ AnonymousClass4 this$0;
            public final /* synthetic */ Iterator val$iterator1;

            public AnonymousClass2(AnonymousClass4 anonymousClass4, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Multiset.Entry<E> computeNext() {
            }
        }

        public AnonymousClass4(Multiset multiset, Multiset multiset2) {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // com.google.common.collect.Multiset
        public int count(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
        public int distinctElements() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Multisets$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5<E> extends TransformedIterator<Multiset.Entry<E>, E> {
        public AnonymousClass5(Iterator it) {
        }

        @Override // com.google.common.collect.TransformedIterator
        public /* bridge */ /* synthetic */ Object transform(Object obj) {
        }

        public E transform(Multiset.Entry<E> entry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        public static final DecreasingCount INSTANCE = null;

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        public abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        public abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FilteredMultiset<E> extends ViewMultiset<E> {
        public final Predicate<? super E> predicate;
        public final Multiset<E> unfiltered;

        /* renamed from: com.google.common.collect.Multisets$FilteredMultiset$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Predicate<Multiset.Entry<E>> {
            public final /* synthetic */ FilteredMultiset this$0;

            public AnonymousClass1(FilteredMultiset filteredMultiset) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            }

            public boolean apply(Multiset.Entry<E> entry) {
            }
        }

        public FilteredMultiset(Multiset<E> multiset, Predicate<? super E> predicate) {
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(@NullableDecl E e2, int i2) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<Multiset.Entry<E>> createEntrySet() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(@NullableDecl Object obj, int i2) {
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        @NullableDecl
        private final E element;

        public ImmutableEntry(@NullableDecl E e2, int i2) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        @NullableDecl
        public final E getElement() {
        }

        public ImmutableEntry<E> nextInBucket() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MultisetIteratorImpl<E> implements Iterator<E> {
        private boolean canRemove;
        @MonotonicNonNullDecl
        private Multiset.Entry<E> currentEntry;
        private final Iterator<Multiset.Entry<E>> entryIterator;
        private int laterCount;
        private final Multiset<E> multiset;
        private int totalCount;

        public MultisetIteratorImpl(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Multiset<? extends E> delegate;
        @MonotonicNonNullDecl
        public transient Set<E> elementSet;
        @MonotonicNonNullDecl
        public transient Set<Multiset.Entry<E>> entrySet;

        public UnmodifiableMultiset(Multiset<? extends E> multiset) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e2) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        public Set<E> createElementSet() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(E e2, int i2) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(E e2, int i2) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i2) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(E e2, int i2, int i3) {
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Multiset<E> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        private ViewMultiset() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int distinctElements() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
        }

        public /* synthetic */ ViewMultiset(AnonymousClass1 anonymousClass1) {
        }
    }

    private Multisets() {
    }

    public static <E> boolean addAllImpl(Multiset<E> multiset, Collection<? extends E> collection) {
    }

    public static <T> Multiset<T> cast(Iterable<T> iterable) {
    }

    @CanIgnoreReturnValue
    public static boolean containsOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
    }

    @Beta
    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
    }

    @Beta
    public static <E> Multiset<E> difference(Multiset<E> multiset, Multiset<?> multiset2) {
    }

    public static <E> Iterator<E> elementIterator(Iterator<Multiset.Entry<E>> it) {
    }

    public static boolean equalsImpl(Multiset<?> multiset, @NullableDecl Object obj) {
    }

    @Beta
    public static <E> Multiset<E> filter(Multiset<E> multiset, Predicate<? super E> predicate) {
    }

    public static <E> Multiset.Entry<E> immutableEntry(@NullableDecl E e2, int i2) {
    }

    public static int inferDistinctElements(Iterable<?> iterable) {
    }

    public static <E> Multiset<E> intersection(Multiset<E> multiset, Multiset<?> multiset2) {
    }

    public static <E> Iterator<E> iteratorImpl(Multiset<E> multiset) {
    }

    public static int linearTimeSizeImpl(Multiset<?> multiset) {
    }

    public static boolean removeAllImpl(Multiset<?> multiset, Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Iterable<?> iterable) {
    }

    public static boolean retainAllImpl(Multiset<?> multiset, Collection<?> collection) {
    }

    @CanIgnoreReturnValue
    public static boolean retainOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
    }

    private static <E> boolean retainOccurrencesImpl(Multiset<E> multiset, Multiset<?> multiset2) {
    }

    public static <E> int setCountImpl(Multiset<E> multiset, E e2, int i2) {
    }

    @Beta
    public static <E> Multiset<E> sum(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
    }

    @Beta
    public static <E> Multiset<E> union(Multiset<? extends E> multiset, Multiset<? extends E> multiset2) {
    }

    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
    }

    @Beta
    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> immutableMultiset) {
    }

    public static <E> boolean setCountImpl(Multiset<E> multiset, E e2, int i2, int i3) {
    }

    private static <E> boolean addAllImpl(Multiset<E> multiset, Multiset<? extends E> multiset2) {
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
    }

    private static <E> boolean addAllImpl(Multiset<E> multiset, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
    }
}
