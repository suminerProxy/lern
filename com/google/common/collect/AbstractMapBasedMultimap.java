package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractMapBasedMultimap<K, V>.Itr<V> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public AnonymousClass1(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public V output(K k2, V v) {
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public AnonymousClass2(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public /* bridge */ /* synthetic */ Object output(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
        public Map.Entry<K, V> output(K k2, V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        public final transient Map<K, Collection<V>> submap;
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            public final /* synthetic */ AsMap this$1;

            public AsMapEntries(AsMap asMap) {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            public Map<K, Collection<V>> map() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {
            @NullableDecl
            public Collection<V> collection;
            public final Iterator<Map.Entry<K, Collection<V>>> delegateIterator;
            public final /* synthetic */ AsMap this$1;

            public AsMapIterator(AsMap asMap) {
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
            public Map.Entry<K, Collection<V>> next() {
            }
        }

        public AsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object remove(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.AbstractMap
        public String toString() {
        }

        public Map.Entry<K, Collection<V>> wrapEntry(Map.Entry<K, Collection<V>> entry) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class Itr<T> implements Iterator<T> {
        @MonotonicNonNullDecl
        public Collection<V> collection;
        @NullableDecl
        public K key;
        public final Iterator<Map.Entry<K, Collection<V>>> keyIterator;
        public final /* synthetic */ AbstractMapBasedMultimap this$0;
        public Iterator<V> valueIterator;

        public Itr(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        public abstract T output(K k2, V v);

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class KeySet extends Maps.KeySet<K, Collection<V>> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$KeySet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Iterator<K> {
            @NullableDecl
            public Map.Entry<K, Collection<V>> entry;
            public final /* synthetic */ KeySet this$1;
            public final /* synthetic */ Iterator val$entryIterator;

            public AnonymousClass1(KeySet keySet, Iterator it) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public K next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        public KeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public NavigableAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap<K, Collection<V>> navigableMap) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public /* bridge */ /* synthetic */ Set createKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        public Map.Entry<K, Collection<V>> pollAsMapEntry(Iterator<Map.Entry<K, Collection<V>>> it) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public /* bridge */ /* synthetic */ SortedMap sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public /* bridge */ /* synthetic */ SortedSet createKeySet() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ SortedSet keySet() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        public NavigableMap<K, Collection<V>> sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, K k3) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        public NavigableSet<K> createKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public NavigableSet<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public NavigableKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap<K, Collection<V>> navigableMap) {
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public /* bridge */ /* synthetic */ SortedMap sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> headSet(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        public NavigableMap<K, Collection<V>> sortedMap() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, K k3) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public RandomAccessWrappedList(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k2, @NullableDecl List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl
        public SortedSet<K> sortedKeySet;
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public SortedAsMap(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap<K, Collection<V>> sortedMap) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public /* bridge */ /* synthetic */ Set createKeySet() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        public SortedMap<K, Collection<V>> sortedMap() {
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public SortedSet<K> createKeySet() {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public SortedKeySet(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap<K, Collection<V>> sortedMap) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
        }

        @Override // java.util.SortedSet
        public K first() {
        }

        public SortedSet<K> headSet(K k2) {
        }

        @Override // java.util.SortedSet
        public K last() {
        }

        public SortedMap<K, Collection<V>> sortedMap() {
        }

        public SortedSet<K> subSet(K k2, K k3) {
        }

        public SortedSet<K> tailSet(K k2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public WrappedNavigableSet(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k2, @NullableDecl NavigableSet<V> navigableSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        private NavigableSet<V> wrap(NavigableSet<V> navigableSet) {
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v) {
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
        }

        @Override // java.util.NavigableSet
        public V floor(V v) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public /* bridge */ /* synthetic */ SortedSet getSortedSetDelegate() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v, boolean z) {
        }

        @Override // java.util.NavigableSet
        public V higher(V v) {
        }

        @Override // java.util.NavigableSet
        public V lower(V v) {
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v, boolean z) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        public NavigableSet<V> getSortedSetDelegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public WrappedSet(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k2, Set<V> set) {
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public WrappedSortedSet(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k2, @NullableDecl SortedSet<V> sortedSet, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
        }

        @Override // java.util.SortedSet
        public V first() {
        }

        public SortedSet<V> getSortedSetDelegate() {
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v) {
        }

        @Override // java.util.SortedSet
        public V last() {
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v, V v2) {
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v) {
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
    }

    public static /* synthetic */ Map access$000(AbstractMapBasedMultimap abstractMapBasedMultimap) {
    }

    public static /* synthetic */ Iterator access$100(Collection collection) {
    }

    public static /* synthetic */ int access$200(AbstractMapBasedMultimap abstractMapBasedMultimap) {
    }

    public static /* synthetic */ int access$202(AbstractMapBasedMultimap abstractMapBasedMultimap, int i2) {
    }

    public static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
    }

    public static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
    }

    public static /* synthetic */ void access$300(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj) {
    }

    private Collection<V> getOrCreateCollection(@NullableDecl K k2) {
    }

    private static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
    }

    private void removeValuesForKey(Object obj) {
    }

    public Map<K, Collection<V>> backingMap() {
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(@NullableDecl K k2) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<Map.Entry<K, V>> createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Multiset<K> createKeys() {
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
    }

    public final Set<K> createMaybeNavigableKeySet() {
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Collection<V> createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<Map.Entry<K, V>> entryIterator() {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(@NullableDecl K k2) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> removeAll(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
    }

    public final void setMap(Map<K, Collection<V>> map) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<V> valueIterator() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
    }

    public Collection<V> wrapCollection(@NullableDecl K k2, Collection<V> collection) {
    }

    public final List<V> wrapList(@NullableDecl K k2, List<V> list, @NullableDecl AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class WrappedCollection extends AbstractCollection<V> {
        @NullableDecl
        public final AbstractMapBasedMultimap<K, V>.WrappedCollection ancestor;
        @NullableDecl
        public final Collection<V> ancestorDelegate;
        public Collection<V> delegate;
        @NullableDecl
        public final K key;
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        public WrappedCollection(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k2, @NullableDecl Collection<V> collection, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
        }

        public void addToMap() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
        }

        public AbstractMapBasedMultimap<K, V>.WrappedCollection getAncestor() {
        }

        public Collection<V> getDelegate() {
        }

        public K getKey() {
        }

        @Override // java.util.Collection
        public int hashCode() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        public void refreshIfEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        public void removeIfEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        @Override // java.util.AbstractCollection
        public String toString() {
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class WrappedIterator implements Iterator<V> {
            public final Iterator<V> delegateIterator;
            public final Collection<V> originalDelegate;
            public final /* synthetic */ WrappedCollection this$1;

            public WrappedIterator(WrappedCollection wrappedCollection) {
            }

            public Iterator<V> getDelegateIterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public V next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }

            public void validateIterator() {
            }

            public WrappedIterator(WrappedCollection wrappedCollection, Iterator<V> it) {
            }
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {
        public final /* synthetic */ AbstractMapBasedMultimap this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            public final /* synthetic */ WrappedList this$1;

            public WrappedListIterator(WrappedList wrappedList) {
            }

            private ListIterator<V> getDelegateListIterator() {
            }

            @Override // java.util.ListIterator
            public void add(V v) {
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
            }

            @Override // java.util.ListIterator
            public V previous() {
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
            }

            @Override // java.util.ListIterator
            public void set(V v) {
            }

            public WrappedListIterator(WrappedList wrappedList, int i2) {
            }
        }

        public WrappedList(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k2, @NullableDecl List<V> list, AbstractMapBasedMultimap<K, V>.WrappedCollection wrappedCollection) {
        }

        @Override // java.util.List
        public void add(int i2, V v) {
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends V> collection) {
        }

        @Override // java.util.List
        public V get(int i2) {
        }

        public List<V> getListDelegate() {
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
        }

        @Override // java.util.List
        public V remove(int i2) {
        }

        @Override // java.util.List
        public V set(int i2, V v) {
        }

        @Override // java.util.List
        public List<V> subList(int i2, int i3) {
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i2) {
        }
    }
}
