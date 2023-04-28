package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    @NullableDecl
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    @RetainedWith
    @MonotonicNonNullDecl
    private transient BiMap<V, K> inverse;
    private transient Set<K> keySet;
    public transient K[] keys;
    @NullableDecl
    private transient int lastInInsertionOrder;
    public transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    public transient int size;
    private transient Set<V> valueSet;
    public transient V[] values;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class EntryForKey extends AbstractMapEntry<K, V> {
        public int index;
        @NullableDecl
        public final K key;
        public final /* synthetic */ HashBiMap this$0;

        public EntryForKey(HashBiMap hashBiMap, int i2) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @NullableDecl
        public V getValue() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
        }

        public void updateIndex() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        public final HashBiMap<K, V> biMap;
        public int index;
        public final V value;

        public EntryForValue(HashBiMap<K, V> hashBiMap, int i2) {
        }

        private void updateIndex() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getValue() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K setValue(K k2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public final /* synthetic */ HashBiMap this$0;

        public EntrySet(HashBiMap hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        public /* bridge */ /* synthetic */ Object forEntry(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        public Inverse(HashBiMap<K, V> hashBiMap) {
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @NullableDecl
        public K forcePut(@NullableDecl V v, @NullableDecl K k2) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K get(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @NullableDecl
        public K put(@NullableDecl V v, @NullableDecl K k2) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @NullableDecl
        public K remove(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        public InverseEntrySet(HashBiMap<K, V> hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        public /* bridge */ /* synthetic */ Object forEntry(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class KeySet extends View<K, V, K> {
        public final /* synthetic */ HashBiMap this$0;

        public KeySet(HashBiMap hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        public K forEntry(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ValueSet extends View<K, V, V> {
        public final /* synthetic */ HashBiMap this$0;

        public ValueSet(HashBiMap hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.HashBiMap.View
        public V forEntry(int i2) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class View<K, V, T> extends AbstractSet<T> {
        public final HashBiMap<K, V> biMap;

        /* renamed from: com.google.common.collect.HashBiMap$View$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Iterator<T> {
            private int expectedModCount;
            private int index;
            private int indexToRemove;
            private int remaining;
            public final /* synthetic */ View this$0;

            public AnonymousClass1(View view) {
            }

            private void checkForComodification() {
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

        public View(HashBiMap<K, V> hashBiMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        public abstract T forEntry(int i2);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    private HashBiMap(int i2) {
    }

    public static /* synthetic */ int access$000(HashBiMap hashBiMap) {
    }

    public static /* synthetic */ int[] access$100(HashBiMap hashBiMap) {
    }

    public static /* synthetic */ void access$200(HashBiMap hashBiMap, int i2, Object obj, boolean z) {
    }

    public static /* synthetic */ BiMap access$302(HashBiMap hashBiMap, BiMap biMap) {
    }

    public static /* synthetic */ void access$400(HashBiMap hashBiMap, int i2, Object obj, boolean z) {
    }

    private int bucket(int i2) {
    }

    public static <K, V> HashBiMap<K, V> create() {
    }

    private static int[] createFilledWithAbsent(int i2) {
    }

    private void deleteFromTableKToV(int i2, int i3) {
    }

    private void deleteFromTableVToK(int i2, int i3) {
    }

    private void ensureCapacity(int i2) {
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i2) {
    }

    private void insertIntoTableKToV(int i2, int i3) {
    }

    private void insertIntoTableVToK(int i2, int i3) {
    }

    private void moveEntryToIndex(int i2, int i3) {
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void replaceKeyInEntry(int i2, @NullableDecl K k2, boolean z) {
    }

    private void replaceValueInEntry(int i2, @NullableDecl V v, boolean z) {
    }

    private void setSucceeds(int i2, int i3) {
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    public int findEntry(@NullableDecl Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
    }

    public int findEntryByKey(@NullableDecl Object obj) {
    }

    public int findEntryByValue(@NullableDecl Object obj) {
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @NullableDecl
    public V forcePut(@NullableDecl K k2, @NullableDecl V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
    }

    @NullableDecl
    public K getInverse(@NullableDecl Object obj) {
    }

    public void init(int i2) {
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v) {
    }

    @NullableDecl
    public K putInverse(@NullableDecl V v, @NullableDecl K k2, boolean z) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
    }

    public void removeEntry(int i2) {
    }

    public void removeEntryKeyHashKnown(int i2, int i3) {
    }

    public void removeEntryValueHashKnown(int i2, int i3) {
    }

    @NullableDecl
    public K removeInverse(@NullableDecl Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
    }

    public static <K, V> HashBiMap<K, V> create(int i2) {
    }

    private void removeEntry(int i2, int i3, int i4) {
    }

    public int findEntryByKey(@NullableDecl Object obj, int i2) {
    }

    public int findEntryByValue(@NullableDecl Object obj, int i2) {
    }

    @NullableDecl
    public V put(@NullableDecl K k2, @NullableDecl V v, boolean z) {
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
    }
}
