package skin.support.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class MapCollections<K, V> {
    public MapCollections<K, V>.EntrySet mEntrySet;
    public MapCollections<K, V>.KeySet mKeySet;
    public MapCollections<K, V>.ValuesCollection mValues;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class ArrayIterator<T> implements Iterator<T> {
        public boolean mCanRemove;
        public int mIndex;
        public final int mOffset;
        public int mSize;
        public final /* synthetic */ MapCollections this$0;

        public ArrayIterator(MapCollections mapCollections, int i2) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class EntrySet implements Set<Map.Entry<K, V>> {
        public final /* synthetic */ MapCollections this$0;

        public EntrySet(MapCollections mapCollections) {
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
        }

        public boolean add(Map.Entry<K, V> entry) {
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class KeySet implements Set<K> {
        public final /* synthetic */ MapCollections this$0;

        public KeySet(MapCollections mapCollections) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int mEnd;
        public boolean mEntryValid;
        public int mIndex;
        public final /* synthetic */ MapCollections this$0;

        public MapIterator(MapCollections mapCollections) {
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

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        public String toString() {
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class ValuesCollection implements Collection<V> {
        public final /* synthetic */ MapCollections this$0;

        public ValuesCollection(MapCollections mapCollections) {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
        }

        @Override // java.util.Collection
        public void clear() {
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
        }

        @Override // java.util.Collection
        public int size() {
        }

        @Override // java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    public static <K, V> boolean containsAllHelper(Map<K, V> map, Collection<?> collection) {
    }

    public static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
    }

    public static <K, V> boolean removeAllHelper(Map<K, V> map, Collection<?> collection) {
    }

    public static <K, V> boolean retainAllHelper(Map<K, V> map, Collection<?> collection) {
    }

    public abstract void colClear();

    public abstract Object colGetEntry(int i2, int i3);

    public abstract Map<K, V> colGetMap();

    public abstract int colGetSize();

    public abstract int colIndexOfKey(Object obj);

    public abstract int colIndexOfValue(Object obj);

    public abstract void colPut(K k2, V v);

    public abstract void colRemoveAt(int i2);

    public abstract V colSetValue(int i2, V v);

    public Set<Map.Entry<K, V>> getEntrySet() {
    }

    public Set<K> getKeySet() {
    }

    public Collection<V> getValues() {
    }

    public Object[] toArrayHelper(int i2) {
    }

    public <T> T[] toArrayHelper(T[] tArr, int i2) {
    }
}
