package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    @NullableDecl
    private transient Node<K, V> head;
    private transient Map<K, KeyList<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;
    @NullableDecl
    private transient Node<K, V> tail;

    /* renamed from: com.google.common.collect.LinkedListMultimap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AbstractSequentialList<V> {
        public final /* synthetic */ LinkedListMultimap this$0;
        public final /* synthetic */ Object val$key;

        public AnonymousClass1(LinkedListMultimap linkedListMultimap, Object obj) {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$1EntriesImpl  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C1EntriesImpl extends AbstractSequentialList<Map.Entry<K, V>> {
        public final /* synthetic */ LinkedListMultimap this$0;

        public C1EntriesImpl(LinkedListMultimap linkedListMultimap) {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$1KeySetImpl  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C1KeySetImpl extends Sets.ImprovedAbstractSet<K> {
        public final /* synthetic */ LinkedListMultimap this$0;

        public C1KeySetImpl(LinkedListMultimap linkedListMultimap) {
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

    /* renamed from: com.google.common.collect.LinkedListMultimap$1ValuesImpl  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C1ValuesImpl extends AbstractSequentialList<V> {
        public final /* synthetic */ LinkedListMultimap this$0;

        /* renamed from: com.google.common.collect.LinkedListMultimap$1ValuesImpl$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends TransformedListIterator<Map.Entry<K, V>, V> {
            public final /* synthetic */ C1ValuesImpl this$1;
            public final /* synthetic */ NodeIterator val$nodeItr;

            public AnonymousClass1(C1ValuesImpl c1ValuesImpl, ListIterator listIterator, NodeIterator nodeIterator) {
            }

            @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
            public void set(V v) {
            }

            @Override // com.google.common.collect.TransformedIterator
            public /* bridge */ /* synthetic */ Object transform(Object obj) {
            }

            public V transform(Map.Entry<K, V> entry) {
            }
        }

        public C1ValuesImpl(LinkedListMultimap linkedListMultimap) {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class KeyList<K, V> {
        public int count;
        public Node<K, V> head;
        public Node<K, V> tail;

        public KeyList(Node<K, V> node) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Node<K, V> extends AbstractMapEntry<K, V> {
        @NullableDecl
        public final K key;
        @NullableDecl
        public Node<K, V> next;
        @NullableDecl
        public Node<K, V> nextSibling;
        @NullableDecl
        public Node<K, V> previous;
        @NullableDecl
        public Node<K, V> previousSibling;
        @NullableDecl
        public V value;

        public Node(@NullableDecl K k2, @NullableDecl V v) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(@NullableDecl V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class NodeIterator implements ListIterator<Map.Entry<K, V>> {
        @NullableDecl
        public Node<K, V> current;
        public int expectedModCount;
        @NullableDecl
        public Node<K, V> next;
        public int nextIndex;
        @NullableDecl
        public Node<K, V> previous;
        public final /* synthetic */ LinkedListMultimap this$0;

        public NodeIterator(LinkedListMultimap linkedListMultimap, int i2) {
        }

        private void checkForConcurrentModification() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ Object previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
        }

        public void setValue(V v) {
        }

        public void add(Map.Entry<K, V> entry) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public Node<K, V> next() {
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public Node<K, V> previous() {
        }

        public void set(Map.Entry<K, V> entry) {
        }
    }

    public LinkedListMultimap() {
    }

    public static /* synthetic */ int access$000(LinkedListMultimap linkedListMultimap) {
    }

    public static /* synthetic */ Node access$100(LinkedListMultimap linkedListMultimap) {
    }

    public static /* synthetic */ Node access$200(LinkedListMultimap linkedListMultimap) {
    }

    public static /* synthetic */ void access$300(Object obj) {
    }

    public static /* synthetic */ void access$400(LinkedListMultimap linkedListMultimap, Node node) {
    }

    public static /* synthetic */ void access$500(LinkedListMultimap linkedListMultimap, Object obj) {
    }

    public static /* synthetic */ Map access$600(LinkedListMultimap linkedListMultimap) {
    }

    public static /* synthetic */ Node access$700(LinkedListMultimap linkedListMultimap, Object obj, Object obj2, Node node) {
    }

    public static /* synthetic */ int access$900(LinkedListMultimap linkedListMultimap) {
    }

    @CanIgnoreReturnValue
    private Node<K, V> addNode(@NullableDecl K k2, @NullableDecl V v, @NullableDecl Node<K, V> node) {
    }

    private static void checkElement(@NullableDecl Object obj) {
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
    }

    private List<V> getCopy(@NullableDecl Object obj) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void removeAllNodes(@NullableDecl Object obj) {
    }

    private void removeNode(Node<K, V> node) {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Map<K, Collection<V>> createAsMap() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ Collection createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Set<K> createKeySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Multiset<K> createKeys() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ Collection createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection entries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public Iterator<Map.Entry<K, V>> entryIterator() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection get(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean isEmpty() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Set keySet() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection removeAll(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(@NullableDecl Object obj, Iterable iterable) {
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Collection values() {
    }

    private LinkedListMultimap(int i2) {
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i2) {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public List<Map.Entry<K, V>> createEntries() {
    }

    @Override // com.google.common.collect.AbstractMultimap
    public List<V> createValues() {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<Map.Entry<K, V>> entries() {
    }

    @Override // com.google.common.collect.Multimap
    public List<V> get(@NullableDecl K k2) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public List<V> values() {
    }

    public static <K, V> LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class DistinctKeyIterator implements Iterator<K> {
        @NullableDecl
        public Node<K, V> current;
        public int expectedModCount;
        public Node<K, V> next;
        public final Set<K> seenKeys;
        public final /* synthetic */ LinkedListMultimap this$0;

        private DistinctKeyIterator(LinkedListMultimap linkedListMultimap) {
        }

        private void checkForConcurrentModification() {
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

        public /* synthetic */ DistinctKeyIterator(LinkedListMultimap linkedListMultimap, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ValueForKeyIterator implements ListIterator<V> {
        @NullableDecl
        public Node<K, V> current;
        @NullableDecl
        public final Object key;
        @NullableDecl
        public Node<K, V> next;
        public int nextIndex;
        @NullableDecl
        public Node<K, V> previous;
        public final /* synthetic */ LinkedListMultimap this$0;

        public ValueForKeyIterator(@NullableDecl LinkedListMultimap linkedListMultimap, Object obj) {
        }

        @Override // java.util.ListIterator
        public void add(V v) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public V next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public V previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public void set(V v) {
        }

        public ValueForKeyIterator(@NullableDecl LinkedListMultimap linkedListMultimap, Object obj, int i2) {
        }
    }

    private LinkedListMultimap(Multimap<? extends K, ? extends V> multimap) {
    }
}
