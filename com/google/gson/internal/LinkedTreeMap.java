package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = null;
    public Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.EntrySet entrySet;
    public final Node<K, V> header;
    private LinkedTreeMap<K, V>.KeySet keySet;
    public int modCount;
    public Node<K, V> root;
    public int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Comparable comparable, Comparable comparable2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public final /* synthetic */ LinkedTreeMap this$0;

        /* renamed from: com.google.gson.internal.LinkedTreeMap$EntrySet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>> {
            public final /* synthetic */ EntrySet this$1;

            public AnonymousClass1(EntrySet entrySet) {
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
            }
        }

        public EntrySet(LinkedTreeMap linkedTreeMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class KeySet extends AbstractSet<K> {
        public final /* synthetic */ LinkedTreeMap this$0;

        /* renamed from: com.google.gson.internal.LinkedTreeMap$KeySet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends LinkedTreeMap<K, V>.LinkedTreeMapIterator<K> {
            public final /* synthetic */ KeySet this$1;

            public AnonymousClass1(KeySet keySet) {
            }

            @Override // java.util.Iterator
            public K next() {
            }
        }

        public KeySet(LinkedTreeMap linkedTreeMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public int expectedModCount;
        public Node<K, V> lastReturned;
        public Node<K, V> next;
        public final /* synthetic */ LinkedTreeMap this$0;

        public LinkedTreeMapIterator(LinkedTreeMap linkedTreeMap) {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
        }

        public final Node<K, V> nextNode() {
        }

        @Override // java.util.Iterator
        public final void remove() {
        }
    }

    public LinkedTreeMap() {
    }

    private boolean equal(Object obj, Object obj2) {
    }

    private void rebalance(Node<K, V> node, boolean z) {
    }

    private void replaceInParent(Node<K, V> node, Node<K, V> node2) {
    }

    private void rotateLeft(Node<K, V> node) {
    }

    private void rotateRight(Node<K, V> node) {
    }

    private Object writeReplace() throws ObjectStreamException {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    public Node<K, V> find(K k2, boolean z) {
    }

    public Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
    }

    public Node<K, V> findByObject(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
    }

    public void removeInternal(Node<K, V> node, boolean z) {
    }

    public Node<K, V> removeInternalByKey(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Node<K, V> implements Map.Entry<K, V> {
        public int height;
        public final K key;
        public Node<K, V> left;
        public Node<K, V> next;
        public Node<K, V> parent;
        public Node<K, V> prev;
        public Node<K, V> right;
        public V value;

        public Node() {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        public Node<K, V> first() {
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

        public Node<K, V> last() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        public String toString() {
        }

        public Node(Node<K, V> node, K k2, Node<K, V> node2, Node<K, V> node3) {
        }
    }
}
