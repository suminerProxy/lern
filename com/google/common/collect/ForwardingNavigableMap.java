package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        public final /* synthetic */ ForwardingNavigableMap this$0;

        /* renamed from: com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Iterator<Map.Entry<K, V>> {
            private Map.Entry<K, V> nextOrNull;
            public final /* synthetic */ StandardDescendingMap this$1;
            private Map.Entry<K, V> toRemove;

            public AnonymousClass1(StandardDescendingMap standardDescendingMap) {
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
            public Map.Entry<K, V> next() {
            }
        }

        public StandardDescendingMap(ForwardingNavigableMap forwardingNavigableMap) {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public NavigableMap<K, V> forward() {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
        public final /* synthetic */ ForwardingNavigableMap this$0;

        public StandardNavigableKeySet(ForwardingNavigableMap forwardingNavigableMap) {
        }
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k2) {
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Object delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract NavigableMap<K, V> delegate();

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

    public Map.Entry<K, V> standardCeilingEntry(K k2) {
    }

    public K standardCeilingKey(K k2) {
    }

    @Beta
    public NavigableSet<K> standardDescendingKeySet() {
    }

    public Map.Entry<K, V> standardFirstEntry() {
    }

    public K standardFirstKey() {
    }

    public Map.Entry<K, V> standardFloorEntry(K k2) {
    }

    public K standardFloorKey(K k2) {
    }

    public SortedMap<K, V> standardHeadMap(K k2) {
    }

    public Map.Entry<K, V> standardHigherEntry(K k2) {
    }

    public K standardHigherKey(K k2) {
    }

    public Map.Entry<K, V> standardLastEntry() {
    }

    public K standardLastKey() {
    }

    public Map.Entry<K, V> standardLowerEntry(K k2) {
    }

    public K standardLowerKey(K k2) {
    }

    public Map.Entry<K, V> standardPollFirstEntry() {
    }

    public Map.Entry<K, V> standardPollLastEntry() {
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    public SortedMap<K, V> standardSubMap(K k2, K k3) {
    }

    public SortedMap<K, V> standardTailMap(K k2) {
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(K k2, boolean z, K k3, boolean z2) {
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(K k2, boolean z) {
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ Map delegate() {
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public /* bridge */ /* synthetic */ SortedMap delegate() {
    }
}
