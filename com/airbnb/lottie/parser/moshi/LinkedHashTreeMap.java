package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = null;
    public Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.EntrySet entrySet;
    public final Node<K, V> header;
    private LinkedHashTreeMap<K, V>.KeySet keySet;
    public int modCount;
    public int size;
    public Node<K, V>[] table;
    public int threshold;

    /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Comparable comparable, Comparable comparable2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private Node<K, V> stack;

        public void add(Node<K, V> node) {
        }

        public void reset(int i2) {
        }

        public Node<K, V> root() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AvlIterator<K, V> {
        private Node<K, V> stackTop;

        public Node<K, V> next() {
        }

        public void reset(Node<K, V> node) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public final /* synthetic */ LinkedHashTreeMap this$0;

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$EntrySet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>> {
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

        public EntrySet(LinkedHashTreeMap linkedHashTreeMap) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class KeySet extends AbstractSet<K> {
        public final /* synthetic */ LinkedHashTreeMap this$0;

        /* renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$KeySet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K> {
            public final /* synthetic */ KeySet this$1;

            public AnonymousClass1(KeySet keySet) {
            }

            @Override // java.util.Iterator
            public K next() {
            }
        }

        public KeySet(LinkedHashTreeMap linkedHashTreeMap) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public int expectedModCount;
        public Node<K, V> lastReturned;
        public Node<K, V> next;
        public final /* synthetic */ LinkedHashTreeMap this$0;

        public LinkedTreeMapIterator(LinkedHashTreeMap linkedHashTreeMap) {
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

    public LinkedHashTreeMap() {
    }

    private void doubleCapacity() {
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

    private static int secondaryHash(int i2) {
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

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
    }

    public static <K, V> Node<K, V>[] doubleCapacity(Node<K, V>[] nodeArr) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Node<K, V> implements Map.Entry<K, V> {
        public final int hash;
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

        public Node(Node<K, V> node, K k2, int i2, Node<K, V> node2, Node<K, V> node3) {
        }
    }
}
