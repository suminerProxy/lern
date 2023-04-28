package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Sets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00721 extends AbstractIterator<E> {
            public final Iterator<? extends E> itr1;
            public final Iterator<? extends E> itr2;
            public final /* synthetic */ AnonymousClass1 this$0;

            public C00721(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
            }
        }

        public AnonymousClass1(Set set, Set set2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.Sets.SetView
        public <S extends Set<E>> S copyInto(S s) {
        }

        @Override // com.google.common.collect.Sets.SetView
        public ImmutableSet<E> immutableCopy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final Iterator<E> itr;
            public final /* synthetic */ AnonymousClass2 this$0;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
            }
        }

        public AnonymousClass2(Set set, Set set2) {
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

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final Iterator<E> itr;
            public final /* synthetic */ AnonymousClass3 this$0;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
            }
        }

        public AnonymousClass3(Set set, Set set2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass4<E> extends SetView<E> {
        public final /* synthetic */ Set val$set1;
        public final /* synthetic */ Set val$set2;

        /* renamed from: com.google.common.collect.Sets$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<E> {
            public final /* synthetic */ AnonymousClass4 this$0;
            public final /* synthetic */ Iterator val$itr1;
            public final /* synthetic */ Iterator val$itr2;

            public AnonymousClass1(AnonymousClass4 anonymousClass4, Iterator it, Iterator it2) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public E computeNext() {
            }
        }

        public AnonymousClass4(Set set, Set set2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<E> iterator() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.Sets$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass5<E> extends AbstractSet<Set<E>> {
        public final /* synthetic */ ImmutableMap val$index;
        public final /* synthetic */ int val$size;

        /* renamed from: com.google.common.collect.Sets$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<Set<E>> {
            public final BitSet bits;
            public final /* synthetic */ AnonymousClass5 this$0;

            /* renamed from: com.google.common.collect.Sets$5$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00731 extends AbstractSet<E> {
                public final /* synthetic */ AnonymousClass1 this$1;
                public final /* synthetic */ BitSet val$copy;

                /* renamed from: com.google.common.collect.Sets$5$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                public class C00741 extends AbstractIterator<E> {

                    /* renamed from: i  reason: collision with root package name */
                    public int f3364i;
                    public final /* synthetic */ C00731 this$2;

                    public C00741(C00731 c00731) {
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public E computeNext() {
                    }
                }

                public C00731(AnonymousClass1 anonymousClass1, BitSet bitSet) {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@NullableDecl Object obj) {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                }
            }

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Set<E> computeNext() {
            }
        }

        public AnonymousClass5(int i2, ImmutableMap immutableMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {
        private final transient ImmutableList<ImmutableSet<E>> axes;
        private final transient CartesianList<E> delegate;

        /* renamed from: com.google.common.collect.Sets$CartesianSet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 extends ImmutableList<List<E>> {
            public final /* synthetic */ ImmutableList val$axes;

            public AnonymousClass1(ImmutableList immutableList) {
            }

            @Override // java.util.List
            public /* bridge */ /* synthetic */ Object get(int i2) {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
            }

            @Override // java.util.List
            public List<E> get(int i2) {
            }
        }

        private CartesianSet(ImmutableList<ImmutableSet<E>> immutableList, CartesianList<E> cartesianList) {
        }

        public static <E> Set<List<E>> create(List<? extends Set<? extends E>> list) {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<List<E>> delegate() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        private final NavigableSet<E> forward;

        public DescendingSet(NavigableSet<E> navigableSet) {
        }

        private static <T> Ordering<T> reverse(Comparator<T> comparator) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E ceiling(E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E first() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E floor(E e2) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E higher(E e2) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E last() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E lower(E e2) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollLast() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ SortedSet delegate() {
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet<E> delegate() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        public FilteredNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // java.util.NavigableSet
        @NullableDecl
        public E floor(E e2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        public E last() {
        }

        @Override // java.util.NavigableSet
        @NullableDecl
        public E lower(E e2) {
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
        }

        public NavigableSet<E> unfiltered() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        public FilteredSet(Set<E> set, Predicate<? super E> predicate) {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        public FilteredSortedSet(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
        }

        @Override // java.util.SortedSet
        public E first() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
        }

        public E last() {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PowerSet<E> extends AbstractSet<Set<E>> {
        public final ImmutableMap<E, Integer> inputSet;

        /* renamed from: com.google.common.collect.Sets$PowerSet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIndexedListIterator<Set<E>> {
            public final /* synthetic */ PowerSet this$0;

            public AnonymousClass1(PowerSet powerSet, int i2) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public /* bridge */ /* synthetic */ Object get(int i2) {
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Set<E> get(int i2) {
            }
        }

        public PowerSet(Set<E> set) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SetView<E> extends AbstractSet<E> {
        public /* synthetic */ SetView(AnonymousClass1 anonymousClass1) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
        }

        @CanIgnoreReturnValue
        public <S extends Set<E>> S copyInto(S s) {
        }

        public ImmutableSet<E> immutableCopy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
        }

        private SetView() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SubSet<E> extends AbstractSet<E> {
        private final ImmutableMap<E, Integer> inputSet;
        private final int mask;

        /* renamed from: com.google.common.collect.Sets$SubSet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends UnmodifiableIterator<E> {
            public final ImmutableList<E> elements;
            public int remainingSetBits;
            public final /* synthetic */ SubSet this$0;

            public AnonymousClass1(SubSet subSet) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public E next() {
            }
        }

        public SubSet(ImmutableMap<E, Integer> immutableMap, int i2) {
        }

        public static /* synthetic */ ImmutableMap access$100(SubSet subSet) {
        }

        public static /* synthetic */ int access$200(SubSet subSet) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;
        private final NavigableSet<E> delegate;
        @MonotonicNonNullDecl
        private transient UnmodifiableNavigableSet<E> descendingSet;
        private final SortedSet<E> unmodifiableDelegate;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
        }
    }

    private Sets() {
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
    }

    @Beta
    public static <E> Set<Set<E>> combinations(Set<E> set, int i2) {
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
    }

    public static <E> SetView<E> difference(Set<E> set, Set<?> set2) {
    }

    public static boolean equalsImpl(Set<?> set, @NullableDecl Object obj) {
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
    }

    public static int hashCodeImpl(Set<?> set) {
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e2, E... eArr) {
    }

    public static <E> SetView<E> intersection(Set<E> set, Set<?> set2) {
    }

    private static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> collection, Class<E> cls) {
    }

    public static <E> Set<E> newConcurrentHashSet() {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
    }

    public static <E> HashSet<E> newHashSet() {
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i2) {
    }

    public static <E> Set<E> newIdentityHashSet() {
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i2) {
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
    }

    @GwtCompatible(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
    }

    public static boolean removeAllImpl(Set<?> set, Iterator<?> it) {
    }

    @Beta
    @GwtIncompatible
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, Range<K> range) {
    }

    public static <E> SetView<E> symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
    }

    public static <E> SetView<E> union(Set<? extends E> set, Set<? extends E> set2) {
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
    }

    public static boolean removeAllImpl(Set<?> set, Collection<?> collection) {
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
    }

    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
    }
}
