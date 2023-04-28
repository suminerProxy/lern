package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractNavigableMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements NavigableMap<K, V> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class DescendingMap extends Maps.DescendingMap<K, V> {
        public final /* synthetic */ AbstractNavigableMap this$0;

        private DescendingMap(AbstractNavigableMap abstractNavigableMap) {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public NavigableMap<K, V> forward() {
        }

        public /* synthetic */ DescendingMap(AbstractNavigableMap abstractNavigableMap, AnonymousClass1 anonymousClass1) {
        }
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> ceilingEntry(K k2) {
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
    }

    public abstract Iterator<Map.Entry<K, V>> descendingEntryIterator();

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> firstEntry() {
    }

    @Override // java.util.SortedMap
    public K firstKey() {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> floorEntry(K k2) {
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(K k2) {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> higherEntry(K k2) {
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> lastEntry() {
    }

    @Override // java.util.SortedMap
    public K lastKey() {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> lowerEntry(K k2) {
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> pollFirstEntry() {
    }

    @Override // java.util.NavigableMap
    @NullableDecl
    public Map.Entry<K, V> pollLastEntry() {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(K k2, K k3) {
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k2) {
    }
}
