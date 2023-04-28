package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    private static final float DEFAULT_LOAD_FACTOR = 1.0f;
    private static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    public static final int UNSET = -1;
    @MonotonicNonNullDecl
    public transient Object[] elements;
    @MonotonicNonNullDecl
    private transient long[] entries;
    public transient float loadFactor;
    public transient int modCount;
    private transient int size;
    @MonotonicNonNullDecl
    private transient int[] table;
    private transient int threshold;

    /* renamed from: com.google.common.collect.CompactHashSet$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Iterator<E> {
        public int expectedModCount;
        public int index;
        public int indexToRemove;
        public final /* synthetic */ CompactHashSet this$0;

        public AnonymousClass1(CompactHashSet compactHashSet) {
        }

        private void checkForConcurrentModification() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public E next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public CompactHashSet() {
    }

    public static /* synthetic */ long[] access$000(CompactHashSet compactHashSet) {
    }

    public static /* synthetic */ int access$100(long j2) {
    }

    public static /* synthetic */ boolean access$200(CompactHashSet compactHashSet, Object obj, int i2) {
    }

    public static <E> CompactHashSet<E> create() {
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i2) {
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

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    private void resizeMeMaybe(int i2) {
    }

    private void resizeTable(int i2) {
    }

    private static long swapNext(long j2, int i2) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@NullableDecl E e2) {
    }

    public int adjustAfterRemove(int i2, int i3) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
    }

    public int firstEntryIndex() {
    }

    public int getSuccessor(int i2) {
    }

    public void init(int i2, float f2) {
    }

    public void insertEntry(int i2, E e2, int i3) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
    }

    public void moveEntry(int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj) {
    }

    public void resizeEntries(int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
    }

    public void trimToSize() {
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
    }

    @CanIgnoreReturnValue
    private boolean remove(Object obj, int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
    }

    public CompactHashSet(int i2) {
    }

    public static <E> CompactHashSet<E> create(E... eArr) {
    }
}
