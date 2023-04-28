package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Multiset;
import com.google.common.collect.Table;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Synchronized {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, Collection<V>>> asMapEntrySet;
        @MonotonicNonNullDecl
        public transient Collection<Collection<V>> asMapValues;

        public SynchronizedAsMap(Map<K, Collection<V>> map, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public /* bridge */ /* synthetic */ Object get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<Collection<V>> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<V> get(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapValues$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TransformedIterator<Collection<V>, Collection<V>> {
            public final /* synthetic */ SynchronizedAsMapValues this$0;

            public AnonymousClass1(SynchronizedAsMapValues synchronizedAsMapValues, Iterator it) {
            }

            @Override // com.google.common.collect.TransformedIterator
            public /* bridge */ /* synthetic */ Object transform(Object obj) {
            }

            public Collection<V> transform(Collection<V> collection) {
            }
        }

        public SynchronizedAsMapValues(Collection<Collection<V>> collection, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        @RetainedWith
        @MonotonicNonNullDecl
        private transient BiMap<V, K> inverse;
        @MonotonicNonNullDecl
        private transient Set<V> valueSet;

        public /* synthetic */ SynchronizedBiMap(BiMap biMap, Object obj, BiMap biMap2, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(K k2, V v) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
        }

        private SynchronizedBiMap(BiMap<K, V> biMap, @NullableDecl Object obj, @NullableDecl BiMap<V, K> biMap2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public BiMap<K, V> delegate() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        private static final long serialVersionUID = 0;

        public /* synthetic */ SynchronizedCollection(Collection collection, Object obj, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.util.Collection
        public boolean add(E e2) {
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
        }

        @Override // java.util.Collection
        public void clear() {
        }

        public boolean contains(Object obj) {
        }

        public boolean containsAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
        }

        public Iterator<E> iterator() {
        }

        public boolean remove(Object obj) {
        }

        public boolean removeAll(Collection<?> collection) {
        }

        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public int size() {
        }

        public Object[] toArray() {
        }

        private SynchronizedCollection(Collection<E> collection, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Collection<E> delegate() {
        }

        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedDeque(Deque<E> deque, @NullableDecl Object obj) {
        }

        @Override // java.util.Deque
        public void addFirst(E e2) {
        }

        @Override // java.util.Deque
        public void addLast(E e2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
        }

        @Override // java.util.Deque
        public E getFirst() {
        }

        @Override // java.util.Deque
        public E getLast() {
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e2) {
        }

        @Override // java.util.Deque
        public boolean offerLast(E e2) {
        }

        @Override // java.util.Deque
        public E peekFirst() {
        }

        @Override // java.util.Deque
        public E peekLast() {
        }

        @Override // java.util.Deque
        public E pollFirst() {
        }

        @Override // java.util.Deque
        public E pollLast() {
        }

        @Override // java.util.Deque
        public E pop() {
        }

        @Override // java.util.Deque
        public void push(E e2) {
        }

        @Override // java.util.Deque
        public E removeFirst() {
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(Object obj) {
        }

        @Override // java.util.Deque
        public E removeLast() {
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Queue delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedQueue, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public Deque<E> delegate() {
        }
    }

    @GwtIncompatible
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedEntry(Map.Entry<K, V> entry, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        @Override // java.util.Map.Entry
        public V getValue() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Map.Entry<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedList(List<E> list, @NullableDecl Object obj) {
        }

        @Override // java.util.List
        public void add(int i2, E e2) {
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends E> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
        }

        @Override // java.util.List
        public E get(int i2) {
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
        }

        @Override // java.util.List
        public E remove(int i2) {
        }

        @Override // java.util.List
        public E set(int i2, E e2) {
        }

        @Override // java.util.List
        public List<E> subList(int i2, int i3) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public List<E> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedListMultimap(ListMultimap<K, V> listMultimap, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Multimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public List<V> get(K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public List<V> removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public List<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public ListMultimap<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> entrySet;
        @MonotonicNonNullDecl
        public transient Set<K> keySet;
        @MonotonicNonNullDecl
        public transient Collection<V> values;

        public SynchronizedMap(Map<K, V> map, @NullableDecl Object obj) {
        }

        @Override // java.util.Map
        public void clear() {
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
        }

        public boolean containsValue(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        public Set<Map.Entry<K, V>> entrySet() {
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
        }

        public V get(Object obj) {
        }

        @Override // java.util.Map
        public int hashCode() {
        }

        @Override // java.util.Map
        public boolean isEmpty() {
        }

        @Override // java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.Map
        public V put(K k2, V v) {
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // java.util.Map
        public V remove(Object obj) {
        }

        @Override // java.util.Map
        public int size() {
        }

        public Collection<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Map<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Map<K, Collection<V>> asMap;
        @MonotonicNonNullDecl
        public transient Collection<Map.Entry<K, V>> entries;
        @MonotonicNonNullDecl
        public transient Set<K> keySet;
        @MonotonicNonNullDecl
        public transient Multiset<K> keys;
        @MonotonicNonNullDecl
        public transient Collection<V> valuesCollection;

        public SynchronizedMultimap(Multimap<K, V> multimap, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Map<K, Collection<V>> asMap() {
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsEntry(Object obj, Object obj2) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Multimap
        public Collection<Map.Entry<K, V>> entries() {
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public boolean equals(Object obj) {
        }

        public Collection<V> get(K k2) {
        }

        @Override // com.google.common.collect.Multimap
        public int hashCode() {
        }

        @Override // com.google.common.collect.Multimap
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Multimap
        public Set<K> keySet() {
        }

        @Override // com.google.common.collect.Multimap
        public Multiset<K> keys() {
        }

        @Override // com.google.common.collect.Multimap
        public boolean put(K k2, V v) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(K k2, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
        }

        public Collection<V> removeAll(Object obj) {
        }

        public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
        }

        @Override // com.google.common.collect.Multimap
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Multimap<K, V> delegate() {
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<E> elementSet;
        @MonotonicNonNullDecl
        public transient Set<Multiset.Entry<E>> entrySet;

        public SynchronizedMultiset(Multiset<E> multiset, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Multiset
        public int add(E e2, int i2) {
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Multiset
        public Set<E> elementSet() {
        }

        @Override // com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public int hashCode() {
        }

        @Override // com.google.common.collect.Multiset
        public int remove(Object obj, int i2) {
        }

        @Override // com.google.common.collect.Multiset
        public int setCount(E e2, int i2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public Multiset<E> delegate() {
        }

        @Override // com.google.common.collect.Multiset
        public boolean setCount(E e2, int i2, int i3) {
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient NavigableSet<K> descendingKeySet;
        @MonotonicNonNullDecl
        public transient NavigableMap<K, V> descendingMap;
        @MonotonicNonNullDecl
        public transient NavigableSet<K> navigableKeySet;

        public SynchronizedNavigableMap(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k2, boolean z) {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<K> keySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k2) {
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k2, boolean z) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ SortedMap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public NavigableMap<K, V> delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k2, K k3) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k2) {
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient NavigableSet<E> descendingSet;

        public SynchronizedNavigableSet(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
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

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ SortedSet delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public NavigableSet<E> delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e2, E e3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedObject implements Serializable {
        @GwtIncompatible
        private static final long serialVersionUID = 0;
        public final Object delegate;
        public final Object mutex;

        public SynchronizedObject(Object obj, @NullableDecl Object obj2) {
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        }

        public Object delegate() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedQueue(Queue<E> queue, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.Queue
        public E element() {
        }

        @Override // java.util.Queue
        public boolean offer(E e2) {
        }

        @Override // java.util.Queue
        public E peek() {
        }

        @Override // java.util.Queue
        public E poll() {
        }

        @Override // java.util.Queue
        public E remove() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public Queue<E> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public SynchronizedRandomAccessList(List<E> list, @NullableDecl Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedSet(Set<E> set, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        public boolean equals(Object obj) {
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public Set<E> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> entrySet;

        public SynchronizedSetMultimap(SetMultimap<K, V> setMultimap, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Multimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection entries() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public Set<V> get(K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public Set<V> removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public SetMultimap<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedMap(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.SortedMap
        public K firstKey() {
        }

        public SortedMap<K, V> headMap(K k2) {
        }

        @Override // java.util.SortedMap
        public K lastKey() {
        }

        public SortedMap<K, V> subMap(K k2, K k3) {
        }

        public SortedMap<K, V> tailMap(K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, com.google.common.collect.Synchronized.SynchronizedObject
        public SortedMap<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedSet(SortedSet<E> sortedSet, @NullableDecl Object obj) {
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // java.util.SortedSet
        public E first() {
        }

        public SortedSet<E> headSet(E e2) {
        }

        @Override // java.util.SortedSet
        public E last() {
        }

        public SortedSet<E> subSet(E e2, E e3) {
        }

        public SortedSet<E> tailSet(E e2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Collection delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Set delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, com.google.common.collect.Synchronized.SynchronizedCollection, com.google.common.collect.Synchronized.SynchronizedObject
        public SortedSet<E> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        public SynchronizedSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Multimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ SetMultimap delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Set get(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public SortedSet<V> get(K k2) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public SortedSet<V> removeAll(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public SortedSet<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Synchronized.SynchronizedObject
        public SortedSetMultimap<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Function<Map<C, V>, Map<C, V>> {
            public final /* synthetic */ SynchronizedTable this$0;

            public AnonymousClass1(SynchronizedTable synchronizedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<C, V> apply(Map<C, V> map) {
            }
        }

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedTable$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Function<Map<R, V>, Map<R, V>> {
            public final /* synthetic */ SynchronizedTable this$0;

            public AnonymousClass2(SynchronizedTable synchronizedTable) {
            }

            @Override // com.google.common.base.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
            }

            public Map<R, V> apply(Map<R, V> map) {
            }
        }

        public SynchronizedTable(Table<R, C, V> table, Object obj) {
        }

        @Override // com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
        }

        @Override // com.google.common.collect.Table
        public void clear() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> column(@NullableDecl C c) {
        }

        @Override // com.google.common.collect.Table
        public Set<C> columnKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
        }

        @Override // com.google.common.collect.Table
        public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public boolean containsColumn(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Table
        public boolean containsRow(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Table
        public boolean containsValue(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        @Override // com.google.common.collect.Table
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Table
        public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public int hashCode() {
        }

        @Override // com.google.common.collect.Table
        public boolean isEmpty() {
        }

        @Override // com.google.common.collect.Table
        public V put(@NullableDecl R r, @NullableDecl C c, @NullableDecl V v) {
        }

        @Override // com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        }

        @Override // com.google.common.collect.Table
        public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> row(@NullableDecl R r) {
        }

        @Override // com.google.common.collect.Table
        public Set<R> rowKeySet() {
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
        }

        @Override // com.google.common.collect.Table
        public int size() {
        }

        @Override // com.google.common.collect.Table
        public Collection<V> values() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedObject
        public Table<R, C, V> delegate() {
        }
    }

    private Synchronized() {
    }

    public static /* synthetic */ SortedSet access$100(SortedSet sortedSet, Object obj) {
    }

    public static /* synthetic */ List access$200(List list, Object obj) {
    }

    public static /* synthetic */ Set access$300(Set set, Object obj) {
    }

    public static /* synthetic */ Collection access$400(Collection collection, Object obj) {
    }

    public static /* synthetic */ Collection access$500(Collection collection, Object obj) {
    }

    public static /* synthetic */ Map.Entry access$700(Map.Entry entry, Object obj) {
    }

    public static <K, V> BiMap<K, V> biMap(BiMap<K, V> biMap, @NullableDecl Object obj) {
    }

    private static <E> Collection<E> collection(Collection<E> collection, @NullableDecl Object obj) {
    }

    public static <E> Deque<E> deque(Deque<E> deque, @NullableDecl Object obj) {
    }

    private static <E> List<E> list(List<E> list, @NullableDecl Object obj) {
    }

    public static <K, V> ListMultimap<K, V> listMultimap(ListMultimap<K, V> listMultimap, @NullableDecl Object obj) {
    }

    @VisibleForTesting
    public static <K, V> Map<K, V> map(Map<K, V> map, @NullableDecl Object obj) {
    }

    public static <K, V> Multimap<K, V> multimap(Multimap<K, V> multimap, @NullableDecl Object obj) {
    }

    public static <E> Multiset<E> multiset(Multiset<E> multiset, @NullableDecl Object obj) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> navigableMap(NavigableMap<K, V> navigableMap) {
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> navigableSet(NavigableSet<E> navigableSet, @NullableDecl Object obj) {
    }

    @GwtIncompatible
    private static <K, V> Map.Entry<K, V> nullableSynchronizedEntry(@NullableDecl Map.Entry<K, V> entry, @NullableDecl Object obj) {
    }

    public static <E> Queue<E> queue(Queue<E> queue, @NullableDecl Object obj) {
    }

    @VisibleForTesting
    public static <E> Set<E> set(Set<E> set, @NullableDecl Object obj) {
    }

    public static <K, V> SetMultimap<K, V> setMultimap(SetMultimap<K, V> setMultimap, @NullableDecl Object obj) {
    }

    public static <K, V> SortedMap<K, V> sortedMap(SortedMap<K, V> sortedMap, @NullableDecl Object obj) {
    }

    private static <E> SortedSet<E> sortedSet(SortedSet<E> sortedSet, @NullableDecl Object obj) {
    }

    public static <K, V> SortedSetMultimap<K, V> sortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap, @NullableDecl Object obj) {
    }

    public static <R, C, V> Table<R, C, V> table(Table<R, C, V> table, Object obj) {
    }

    private static <E> Collection<E> typePreservingCollection(Collection<E> collection, @NullableDecl Object obj) {
    }

    private static <E> Set<E> typePreservingSet(Set<E> set, @NullableDecl Object obj) {
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> navigableMap(NavigableMap<K, V> navigableMap, @NullableDecl Object obj) {
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> navigableSet(NavigableSet<E> navigableSet) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TransformedIterator<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {
            public final /* synthetic */ SynchronizedAsMapEntries this$0;

            /* renamed from: com.google.common.collect.Synchronized$SynchronizedAsMapEntries$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00751 extends ForwardingMapEntry<K, Collection<V>> {
                public final /* synthetic */ AnonymousClass1 this$1;
                public final /* synthetic */ Map.Entry val$entry;

                public C00751(AnonymousClass1 anonymousClass1, Map.Entry entry) {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                public /* bridge */ /* synthetic */ Object delegate() {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public /* bridge */ /* synthetic */ Object getValue() {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                public Map.Entry<K, Collection<V>> delegate() {
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public Collection<V> getValue() {
                }
            }

            public AnonymousClass1(SynchronizedAsMapEntries synchronizedAsMapEntries, Iterator it) {
            }

            @Override // com.google.common.collect.TransformedIterator
            public /* bridge */ /* synthetic */ Object transform(Object obj) {
            }

            public Map.Entry<K, Collection<V>> transform(Map.Entry<K, Collection<V>> entry) {
            }
        }

        public SynchronizedAsMapEntries(Set<Map.Entry<K, Collection<V>>> set, @NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }
    }
}
