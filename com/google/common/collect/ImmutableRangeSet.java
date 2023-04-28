package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {
    private static final ImmutableRangeSet<Comparable<?>> ALL = null;
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = null;
    @LazyInit
    private transient ImmutableRangeSet<C> complement;
    private final transient ImmutableList<Range<C>> ranges;

    /* renamed from: com.google.common.collect.ImmutableRangeSet$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ImmutableList<Range<C>> {
        public final /* synthetic */ ImmutableRangeSet this$0;
        public final /* synthetic */ int val$fromIndex;
        public final /* synthetic */ int val$length;
        public final /* synthetic */ Range val$range;

        public AnonymousClass1(ImmutableRangeSet immutableRangeSet, int i2, int i3, Range range) {
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
        public Range<C> get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AsSet extends ImmutableSortedSet<C> {
        private final DiscreteDomain<C> domain;
        @MonotonicNonNullDecl
        private transient Integer size;
        public final /* synthetic */ ImmutableRangeSet this$0;

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<C> {
            public Iterator<C> elemItr;
            public final Iterator<Range<C>> rangeItr;
            public final /* synthetic */ AsSet this$1;

            public AnonymousClass1(AsSet asSet) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public C computeNext() {
            }
        }

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractIterator<C> {
            public Iterator<C> elemItr;
            public final Iterator<Range<C>> rangeItr;
            public final /* synthetic */ AsSet this$1;

            public AnonymousClass2(AsSet asSet) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public C computeNext() {
            }
        }

        public AsSet(ImmutableRangeSet immutableRangeSet, DiscreteDomain<C> discreteDomain) {
        }

        public static /* synthetic */ DiscreteDomain access$100(AsSet asSet) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> createDescendingSet() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible("NavigableSet")
        public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public /* bridge */ /* synthetic */ ImmutableSortedSet headSetImpl(Object obj, boolean z) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public int indexOf(Object obj) {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        public ImmutableSortedSet<C> subSet(Range<C> range) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public /* bridge */ /* synthetic */ ImmutableSortedSet subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public /* bridge */ /* synthetic */ ImmutableSortedSet tailSetImpl(Object obj, boolean z) {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible("NavigableSet")
        public UnmodifiableIterator<C> descendingIterator() {
        }

        public ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<C> iterator() {
        }

        public ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
        }

        public ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        private final DiscreteDomain<C> domain;
        private final ImmutableList<Range<C>> ranges;

        public AsSetSerializedForm(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
        }

        public Object readResolve() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder<C extends Comparable<?>> {
        private final List<Range<C>> ranges;

        @CanIgnoreReturnValue
        public Builder<C> add(Range<C> range) {
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(RangeSet<C> rangeSet) {
        }

        public ImmutableRangeSet<C> build() {
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(Iterable<Range<C>> iterable) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ComplementRanges extends ImmutableList<Range<C>> {
        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;
        public final /* synthetic */ ImmutableRangeSet this$0;

        public ComplementRanges(ImmutableRangeSet immutableRangeSet) {
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
        public Range<C> get(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        public SerializedForm(ImmutableList<Range<C>> immutableList) {
        }

        public Object readResolve() {
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
    }

    public static /* synthetic */ ImmutableList access$000(ImmutableRangeSet immutableRangeSet) {
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
    }

    public static <C extends Comparable<?>> Builder<C> builder() {
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(RangeSet<C> rangeSet) {
    }

    private ImmutableList<Range<C>> intersectRanges(Range<C> range) {
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of() {
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void add(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void addAll(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ Set asDescendingSetOfRanges() {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ Set asRanges() {
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ RangeSet complement() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
    }

    public ImmutableRangeSet<C> difference(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
    }

    public ImmutableRangeSet<C> intersection(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean isEmpty() {
    }

    public boolean isPartialView() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public Range<C> rangeContaining(C c) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void remove(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void removeAll(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
    }

    @Override // com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ RangeSet subRangeSet(Range range) {
    }

    public ImmutableRangeSet<C> union(RangeSet<C> rangeSet) {
    }

    public Object writeReplace() {
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asRanges() {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> complement() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
    }
}
