package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {
    @MonotonicNonNullDecl
    private transient Set<Range<C>> asDescendingSetOfRanges;
    @MonotonicNonNullDecl
    private transient Set<Range<C>> asRanges;
    @MonotonicNonNullDecl
    private transient RangeSet<C> complement;
    @VisibleForTesting
    public final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {
        public final Collection<Range<C>> delegate;
        public final /* synthetic */ TreeRangeSet this$0;

        public AsRanges(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
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
        public Collection<Range<C>> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Complement extends TreeRangeSet<C> {
        public final /* synthetic */ TreeRangeSet this$0;

        public Complement(TreeRangeSet treeRangeSet) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> complement() {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C c) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        private final Range<Cut<C>> complementLowerBoundWindow;
        private final NavigableMap<Cut<C>, Range<C>> positiveRangesByLowerBound;
        private final NavigableMap<Cut<C>, Range<C>> positiveRangesByUpperBound;

        /* renamed from: com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public Cut<C> nextComplementRangeLowerBound;
            public final /* synthetic */ ComplementRangesByLowerBound this$0;
            public final /* synthetic */ Cut val$firstComplementRangeLowerBound;
            public final /* synthetic */ PeekingIterator val$positiveItr;

            public AnonymousClass1(ComplementRangesByLowerBound complementRangesByLowerBound, Cut cut, PeekingIterator peekingIterator) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$ComplementRangesByLowerBound$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public Cut<C> nextComplementRangeUpperBound;
            public final /* synthetic */ ComplementRangesByLowerBound this$0;
            public final /* synthetic */ Cut val$firstComplementRangeUpperBound;
            public final /* synthetic */ PeekingIterator val$positiveItr;

            public AnonymousClass2(ComplementRangesByLowerBound complementRangesByLowerBound, Cut cut, PeekingIterator peekingIterator) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
            }
        }

        public ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        }

        public static /* synthetic */ Range access$100(ComplementRangesByLowerBound complementRangesByLowerBound) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        }

        private ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> range) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public Range<C> get(Object obj) {
        }

        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
        }

        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
        }

        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        private final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;
        private final Range<Cut<C>> upperBoundWindow;

        /* renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ RangesByUpperBound this$0;
            public final /* synthetic */ Iterator val$backingItr;

            public AnonymousClass1(RangesByUpperBound rangesByUpperBound, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ RangesByUpperBound this$0;
            public final /* synthetic */ PeekingIterator val$backingItr;

            public AnonymousClass2(RangesByUpperBound rangesByUpperBound, PeekingIterator peekingIterator) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
            }
        }

        public RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        }

        public static /* synthetic */ Range access$000(RangesByUpperBound rangesByUpperBound) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj) {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> range) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public Range<C> get(@NullableDecl Object obj) {
        }

        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
        }

        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
        }

        private RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
        }

        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class SubRangeSet extends TreeRangeSet<C> {
        private final Range<C> restriction;
        public final /* synthetic */ TreeRangeSet this$0;

        public SubRangeSet(TreeRangeSet treeRangeSet, Range<C> range) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void clear() {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C c) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean encloses(Range<C> range) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        @NullableDecl
        public Range<C> rangeContaining(C c) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> subRangeSet(Range<C> range) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        private final Range<Cut<C>> lowerBoundWindow;
        private final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;
        private final NavigableMap<Cut<C>, Range<C>> rangesByUpperBound;
        private final Range<C> restriction;

        /* renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ SubRangeSetRangesByLowerBound this$0;
            public final /* synthetic */ Iterator val$completeRangeItr;
            public final /* synthetic */ Cut val$upperBoundOnLowerBounds;

            public AnonymousClass1(SubRangeSetRangesByLowerBound subRangeSetRangesByLowerBound, Iterator it, Cut cut) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {
            public final /* synthetic */ SubRangeSetRangesByLowerBound this$0;
            public final /* synthetic */ Iterator val$completeRangeItr;

            public AnonymousClass2(SubRangeSetRangesByLowerBound subRangeSetRangesByLowerBound, Iterator it) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ Object computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            public Map.Entry<Cut<C>, Range<C>> computeNext() {
            }
        }

        public /* synthetic */ SubRangeSetRangesByLowerBound(Range range, Range range2, NavigableMap navigableMap, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ Range access$300(SubRangeSetRangesByLowerBound subRangeSetRangesByLowerBound) {
        }

        public static /* synthetic */ Range access$400(SubRangeSetRangesByLowerBound subRangeSetRangesByLowerBound) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> descendingEntryIterator() {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Cut<C>, Range<C>>> entryIterator() {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj) {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        }

        private SubRangeSetRangesByLowerBound(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
        }

        private NavigableMap<Cut<C>, Range<C>> subMap(Range<Cut<C>> range) {
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public Range<C> get(@NullableDecl Object obj) {
        }

        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z) {
        }

        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z) {
        }

        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z, Cut<C> cut2, boolean z2) {
        }
    }

    public /* synthetic */ TreeRangeSet(NavigableMap navigableMap, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Range access$600(TreeRangeSet treeRangeSet, Range range) {
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
    }

    @NullableDecl
    private Range<C> rangeEnclosing(Range<C> range) {
    }

    private void replaceRangeWithSameLowerBound(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void add(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(RangeSet rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asDescendingSetOfRanges() {
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asRanges() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> complement() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
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

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @NullableDecl
    public Range<C> rangeContaining(C c) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void remove(Range<C> range) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(RangeSet rangeSet) {
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> subRangeSet(Range<C> range) {
    }

    private TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet<C> rangeSet) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
    }
}
