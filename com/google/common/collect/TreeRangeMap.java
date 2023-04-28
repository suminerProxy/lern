package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {
    private static final RangeMap EMPTY_SUB_RANGE_MAP = null;
    private final NavigableMap<Cut<K>, RangeMapEntry<K, V>> entriesByLowerBound;

    /* renamed from: com.google.common.collect.TreeRangeMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements RangeMap {
        @Override // com.google.common.collect.RangeMap
        public Map<Range, Object> asDescendingMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range, Object> asMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public Object get(Comparable comparable) {
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public Map.Entry<Range, Object> getEntry(Comparable comparable) {
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range range, Object obj) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap rangeMap) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range range, Object obj) {
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range range) {
        }

        @Override // com.google.common.collect.RangeMap
        public Range span() {
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap subRangeMap(Range range) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AsMapOfRanges extends Maps.IteratorBasedAbstractMap<Range<K>, V> {
        public final Iterable<Map.Entry<Range<K>, V>> entryIterable;
        public final /* synthetic */ TreeRangeMap this$0;

        public AsMapOfRanges(TreeRangeMap treeRangeMap, Iterable<RangeMapEntry<K, V>> iterable) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<Range<K>, V>> entryIterator() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RangeMapEntry<K extends Comparable, V> extends AbstractMapEntry<Range<K>, V> {
        private final Range<K> range;
        private final V value;

        public RangeMapEntry(Cut<K> cut, Cut<K> cut2, V v) {
        }

        public boolean contains(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getKey() {
        }

        public Cut<K> getLowerBound() {
        }

        public Cut<K> getUpperBound() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
        }

        public RangeMapEntry(Range<K> range, V v) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Range<K> getKey() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SubRangeMap implements RangeMap<K, V> {
        private final Range<K> subRange;
        public final /* synthetic */ TreeRangeMap this$0;

        /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TreeRangeMap<K, V>.SubRangeMap.SubRangeMapAsMap {
            public final /* synthetic */ SubRangeMap this$1;

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00761 extends AbstractIterator<Map.Entry<Range<K>, V>> {
                public final /* synthetic */ AnonymousClass1 this$2;
                public final /* synthetic */ Iterator val$backingItr;

                public C00761(AnonymousClass1 anonymousClass1, Iterator it) {
                }

                @Override // com.google.common.collect.AbstractIterator
                public /* bridge */ /* synthetic */ Object computeNext() {
                }

                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Range<K>, V> computeNext() {
                }
            }

            public AnonymousClass1(SubRangeMap subRangeMap) {
            }

            @Override // com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap
            public Iterator<Map.Entry<Range<K>, V>> entryIterator() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class SubRangeMapAsMap extends AbstractMap<Range<K>, V> {
            public final /* synthetic */ SubRangeMap this$1;

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass1 extends Maps.KeySet<Range<K>, V> {
                public final /* synthetic */ SubRangeMapAsMap this$2;

                public AnonymousClass1(SubRangeMapAsMap subRangeMapAsMap, Map map) {
                }

                @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@NullableDecl Object obj) {
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$2  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass2 extends Maps.EntrySet<Range<K>, V> {
                public final /* synthetic */ SubRangeMapAsMap this$2;

                public AnonymousClass2(SubRangeMapAsMap subRangeMapAsMap) {
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<Range<K>, V>> iterator() {
                }

                @Override // com.google.common.collect.Maps.EntrySet
                public Map<Range<K>, V> map() {
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$3  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass3 extends AbstractIterator<Map.Entry<Range<K>, V>> {
                public final /* synthetic */ SubRangeMapAsMap this$2;
                public final /* synthetic */ Iterator val$backingItr;

                public AnonymousClass3(SubRangeMapAsMap subRangeMapAsMap, Iterator it) {
                }

                @Override // com.google.common.collect.AbstractIterator
                public /* bridge */ /* synthetic */ Object computeNext() {
                }

                @Override // com.google.common.collect.AbstractIterator
                public Map.Entry<Range<K>, V> computeNext() {
                }
            }

            /* renamed from: com.google.common.collect.TreeRangeMap$SubRangeMap$SubRangeMapAsMap$4  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass4 extends Maps.Values<Range<K>, V> {
                public final /* synthetic */ SubRangeMapAsMap this$2;

                public AnonymousClass4(SubRangeMapAsMap subRangeMapAsMap, Map map) {
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                }
            }

            public SubRangeMapAsMap(SubRangeMap subRangeMap) {
            }

            public static /* synthetic */ boolean access$400(SubRangeMapAsMap subRangeMapAsMap, Predicate predicate) {
            }

            private boolean removeEntryIf(Predicate<? super Map.Entry<Range<K>, V>> predicate) {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
            }

            public Iterator<Map.Entry<Range<K>, V>> entryIterator() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V get(Object obj) {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(Object obj) {
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
            }
        }

        public SubRangeMap(TreeRangeMap treeRangeMap, Range<K> range) {
        }

        public static /* synthetic */ Range access$300(SubRangeMap subRangeMap) {
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asDescendingMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asMapOfRanges() {
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public V get(K k2) {
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public Map.Entry<Range<K>, V> getEntry(K k2) {
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<K> range, V v) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<K, V> rangeMap) {
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<K> range, V v) {
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range<K> range) {
        }

        @Override // com.google.common.collect.RangeMap
        public Range<K> span() {
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap<K, V> subRangeMap(Range<K> range) {
        }

        @Override // com.google.common.collect.RangeMap
        public String toString() {
        }
    }

    private TreeRangeMap() {
    }

    public static /* synthetic */ NavigableMap access$000(TreeRangeMap treeRangeMap) {
    }

    public static /* synthetic */ Range access$100(TreeRangeMap treeRangeMap, Range range, Object obj) {
    }

    public static /* synthetic */ RangeMap access$200(TreeRangeMap treeRangeMap) {
    }

    private static <K extends Comparable, V> Range<K> coalesce(Range<K> range, V v, @NullableDecl Map.Entry<Cut<K>, RangeMapEntry<K, V>> entry) {
    }

    private Range<K> coalescedRange(Range<K> range, V v) {
    }

    public static <K extends Comparable, V> TreeRangeMap<K, V> create() {
    }

    private RangeMap<K, V> emptySubRangeMap() {
    }

    private void putRangeMapEntry(Cut<K> cut, Cut<K> cut2, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asDescendingMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asMapOfRanges() {
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.RangeMap
    @NullableDecl
    public V get(K k2) {
    }

    @Override // com.google.common.collect.RangeMap
    @NullableDecl
    public Map.Entry<Range<K>, V> getEntry(K k2) {
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
    }

    @Override // com.google.common.collect.RangeMap
    public void put(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(RangeMap<K, V> rangeMap) {
    }

    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(Range<K> range, V v) {
    }

    @Override // com.google.common.collect.RangeMap
    public void remove(Range<K> range) {
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
    }

    @Override // com.google.common.collect.RangeMap
    public RangeMap<K, V> subRangeMap(Range<K> range) {
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
    }
}
