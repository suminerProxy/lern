package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ObjectCountHashMap<K> {
    public static final float DEFAULT_LOAD_FACTOR = 1.0f;
    public static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    public static final int UNSET = -1;
    @VisibleForTesting
    public transient long[] entries;
    public transient Object[] keys;
    private transient float loadFactor;
    public transient int modCount;
    public transient int size;
    private transient int[] table;
    private transient int threshold;
    public transient int[] values;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class MapEntry extends Multisets.AbstractEntry<K> {
        @NullableDecl
        public final K key;
        public int lastKnownIndex;
        public final /* synthetic */ ObjectCountHashMap this$0;

        public MapEntry(ObjectCountHashMap objectCountHashMap, int i2) {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public K getElement() {
        }

        @CanIgnoreReturnValue
        public int setCount(int i2) {
        }

        public void updateLastKnownIndex() {
        }
    }

    public ObjectCountHashMap() {
    }

    public static <K> ObjectCountHashMap<K> create() {
    }

    public static <K> ObjectCountHashMap<K> createWithExpectedSize(int i2) {
    }

    private static int getHash(long j2) {
    }

    private static int getNext(long j2) {
    }

    private int hashTableMask() {
    }

    private static long[] newEntries(int i2) {
    }

    private static int[] newTable(int i2) {
    }

    private void resizeMeMaybe(int i2) {
    }

    private void resizeTable(int i2) {
    }

    private static long swapNext(long j2, int i2) {
    }

    public void clear() {
    }

    public boolean containsKey(@NullableDecl Object obj) {
    }

    public void ensureCapacity(int i2) {
    }

    public int firstIndex() {
    }

    public int get(@NullableDecl Object obj) {
    }

    public Multiset.Entry<K> getEntry(int i2) {
    }

    public K getKey(int i2) {
    }

    public int getValue(int i2) {
    }

    public int indexOf(@NullableDecl Object obj) {
    }

    public void init(int i2, float f2) {
    }

    public void insertEntry(int i2, @NullableDecl K k2, int i3, int i4) {
    }

    public void moveLastEntry(int i2) {
    }

    public int nextIndex(int i2) {
    }

    public int nextIndexAfterRemove(int i2, int i3) {
    }

    @CanIgnoreReturnValue
    public int put(@NullableDecl K k2, int i2) {
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj) {
    }

    @CanIgnoreReturnValue
    public int removeEntry(int i2) {
    }

    public void resizeEntries(int i2) {
    }

    public void setValue(int i2, int i3) {
    }

    public int size() {
    }

    private int remove(@NullableDecl Object obj, int i2) {
    }

    public ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
    }

    public ObjectCountHashMap(int i2) {
    }

    public ObjectCountHashMap(int i2, float f2) {
    }
}
