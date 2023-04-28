package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final float DEFAULT_LOAD_FACTOR = 1.0f;
    public static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    public static final int UNSET = -1;
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient long[] entries;
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> entrySetView;
    @MonotonicNonNullDecl
    private transient Set<K> keySetView;
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient Object[] keys;
    public transient float loadFactor;
    public transient int modCount;
    private transient int size;
    @MonotonicNonNullDecl
    private transient int[] table;
    private transient int threshold;
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient Object[] values;
    @MonotonicNonNullDecl
    private transient Collection<V> valuesView;

    /* renamed from: com.google.common.collect.CompactHashMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends CompactHashMap<K, V>.Itr<K> {
        public final /* synthetic */ CompactHashMap this$0;

        public AnonymousClass1(CompactHashMap compactHashMap) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public K getOutput(int i2) {
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends CompactHashMap<K, V>.Itr<Map.Entry<K, V>> {
        public final /* synthetic */ CompactHashMap this$0;

        public AnonymousClass2(CompactHashMap compactHashMap) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public /* bridge */ /* synthetic */ Object getOutput(int i2) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public Map.Entry<K, V> getOutput(int i2) {
        }
    }

    /* renamed from: com.google.common.collect.CompactHashMap$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends CompactHashMap<K, V>.Itr<V> {
        public final /* synthetic */ CompactHashMap this$0;

        public AnonymousClass3(CompactHashMap compactHashMap) {
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public V getOutput(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public final /* synthetic */ CompactHashMap this$0;

        public EntrySetView(CompactHashMap compactHashMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class KeySetView extends AbstractSet<K> {
        public final /* synthetic */ CompactHashMap this$0;

        public KeySetView(CompactHashMap compactHashMap) {
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
        public boolean remove(@NullableDecl Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class MapEntry extends AbstractMapEntry<K, V> {
        @NullableDecl
        private final K key;
        private int lastKnownIndex;
        public final /* synthetic */ CompactHashMap this$0;

        public MapEntry(CompactHashMap compactHashMap, int i2) {
        }

        private void updateLastKnownIndex() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ValuesView extends AbstractCollection<V> {
        public final /* synthetic */ CompactHashMap this$0;

        public ValuesView(CompactHashMap compactHashMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    public CompactHashMap() {
    }

    public static /* synthetic */ Object access$000(CompactHashMap compactHashMap, int i2) {
    }

    public static /* synthetic */ int access$100(CompactHashMap compactHashMap) {
    }

    public static /* synthetic */ int access$200(CompactHashMap compactHashMap, Object obj) {
    }

    public static <K, V> CompactHashMap<K, V> create() {
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i2) {
    }

    private static int getHash(long j2) {
    }

    private static int getNext(long j2) {
    }

    private int hashTableMask() {
    }

    private int indexOf(@NullableDecl Object obj) {
    }

    private static long[] newEntries(int i2) {
    }

    private static int[] newTable(int i2) {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    @CanIgnoreReturnValue
    private V removeEntry(int i2) {
    }

    private void resizeMeMaybe(int i2) {
    }

    private void resizeTable(int i2) {
    }

    private static long swapNext(long j2, int i2) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    public void accessEntry(int i2) {
    }

    public int adjustAfterRemove(int i2, int i3) {
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

    public Set<Map.Entry<K, V>> createEntrySet() {
    }

    public Set<K> createKeySet() {
    }

    public Collection<V> createValues() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
    }

    public int firstEntryIndex() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
    }

    public int getSuccessor(int i2) {
    }

    public void init(int i2, float f2) {
    }

    public void insertEntry(int i2, @NullableDecl K k2, @NullableDecl V v, int i3) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    public Iterator<K> keySetIterator() {
    }

    public void moveLastEntry(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k2, @NullableDecl V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
    }

    public void resizeEntries(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public void trimToSize() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
    }

    public Iterator<V> valuesIterator() {
    }

    @NullableDecl
    private V remove(@NullableDecl Object obj, int i2) {
    }

    public CompactHashMap(int i2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class Itr<T> implements Iterator<T> {
        public int currentIndex;
        public int expectedModCount;
        public int indexToRemove;
        public final /* synthetic */ CompactHashMap this$0;

        private Itr(CompactHashMap compactHashMap) {
        }

        private void checkForConcurrentModification() {
        }

        public abstract T getOutput(int i2);

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public T next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        public /* synthetic */ Itr(CompactHashMap compactHashMap, AnonymousClass1 anonymousClass1) {
        }
    }

    public CompactHashMap(int i2, float f2) {
    }
}
