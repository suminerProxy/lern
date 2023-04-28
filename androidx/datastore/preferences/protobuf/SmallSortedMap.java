package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile SmallSortedMap<K, V>.DescendingEntrySet lazyDescendingEntrySet;
    private volatile SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private final int maxArraySize;
    private Map<K, V> overflowEntries;
    private Map<K, V> overflowEntriesDescending;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1<FieldDescriptorType> extends SmallSortedMap<FieldDescriptorType, Object> {
        public AnonymousClass1(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
        public void makeImmutable() {
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;
        public final /* synthetic */ SmallSortedMap this$0;

        private DescendingEntryIterator(SmallSortedMap smallSortedMap) {
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
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

        public /* synthetic */ DescendingEntryIterator(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public final /* synthetic */ SmallSortedMap this$0;

        private DescendingEntrySet(SmallSortedMap smallSortedMap) {
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        public /* synthetic */ DescendingEntrySet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class EmptySet {
        private static final Iterable<Object> ITERABLE = null;
        private static final Iterator<Object> ITERATOR = null;

        /* renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$EmptySet$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class AnonymousClass1 implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public Object next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$EmptySet$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class AnonymousClass2 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
            }
        }

        private EmptySet() {
        }

        public static /* synthetic */ Iterator access$1000() {
        }

        public static <T> Iterable<T> iterable() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {
        private final K key;
        public final /* synthetic */ SmallSortedMap this$0;
        private V value;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object getKey() {
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

        public String toString() {
        }

        public Entry(SmallSortedMap smallSortedMap, K k2, V v) {
        }

        public int compareTo(SmallSortedMap<K, V>.Entry entry) {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        private boolean equals(Object obj, Object obj2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;
        public final /* synthetic */ SmallSortedMap this$0;

        private EntryIterator(SmallSortedMap smallSortedMap) {
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
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

        public /* synthetic */ EntryIterator(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public final /* synthetic */ SmallSortedMap this$0;

        private EntrySet(SmallSortedMap smallSortedMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
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

        public /* synthetic */ EntrySet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        }

        public boolean add(Map.Entry<K, V> entry) {
        }
    }

    public /* synthetic */ SmallSortedMap(int i2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ void access$300(SmallSortedMap smallSortedMap) {
    }

    public static /* synthetic */ List access$600(SmallSortedMap smallSortedMap) {
    }

    public static /* synthetic */ Map access$700(SmallSortedMap smallSortedMap) {
    }

    public static /* synthetic */ Object access$800(SmallSortedMap smallSortedMap, int i2) {
    }

    public static /* synthetic */ Map access$900(SmallSortedMap smallSortedMap) {
    }

    private int binarySearchInArray(K k2) {
    }

    private void checkMutable() {
    }

    private void ensureEntryArrayMutable() {
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
    }

    public static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> SmallSortedMap<FieldDescriptorType, Object> newFieldMap(int i2) {
    }

    public static <K extends Comparable<K>, V> SmallSortedMap<K, V> newInstanceForTest(int i2) {
    }

    private V removeArrayEntryAt(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
    }

    public Set<Map.Entry<K, V>> descendingEntrySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
    }

    public Map.Entry<K, V> getArrayEntryAt(int i2) {
    }

    public int getNumArrayEntries() {
    }

    public int getNumOverflowEntries() {
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntriesDescending() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
    }

    public boolean isImmutable() {
    }

    public void makeImmutable() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    private SmallSortedMap(int i2) {
    }

    public V put(K k2, V v) {
    }
}
