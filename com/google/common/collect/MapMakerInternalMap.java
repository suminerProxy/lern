package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final long CLEANUP_EXECUTOR_DELAY_SECS = 60;
    public static final int CONTAINS_VALUE_RETRIES = 3;
    public static final int DRAIN_MAX = 16;
    public static final int DRAIN_THRESHOLD = 63;
    public static final int MAXIMUM_CAPACITY = 1073741824;
    public static final int MAX_SEGMENTS = 65536;
    public static final WeakValueReference<Object, Object, DummyInternalEntry> UNSET_WEAK_VALUE_REFERENCE = null;
    private static final long serialVersionUID = 5;
    public final int concurrencyLevel;
    public final transient InternalEntryHelper<K, V, E, S> entryHelper;
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> entrySet;
    public final Equivalence<Object> keyEquivalence;
    @MonotonicNonNullDecl
    public transient Set<K> keySet;
    public final transient int segmentMask;
    public final transient int segmentShift;
    public final transient Segment<K, V, E, S>[] segments;
    @MonotonicNonNullDecl
    public transient Collection<V> values;

    /* renamed from: com.google.common.collect.MapMakerInternalMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements WeakValueReference<Object, Object, DummyInternalEntry> {
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }

        /* renamed from: copyFor  reason: avoid collision after fix types in other method */
        public WeakValueReference<Object, Object, DummyInternalEntry> copyFor2(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public /* bridge */ /* synthetic */ WeakValueReference<Object, Object, DummyInternalEntry> copyFor(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public Object get() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public DummyInternalEntry getEntry() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public /* bridge */ /* synthetic */ DummyInternalEntry getEntry() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public final int concurrencyLevel;
        public transient ConcurrentMap<K, V> delegate;
        public final Equivalence<Object> keyEquivalence;
        public final Strength keyStrength;
        public final Equivalence<Object> valueEquivalence;
        public final Strength valueStrength;

        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i2, ConcurrentMap<K, V> concurrentMap) {
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        public void readEntries(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        }

        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
        }

        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Map delegate() {
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public ConcurrentMap<K, V> delegate() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {
        public final int hash;
        public final K key;
        @NullableDecl
        public final E next;

        public AbstractStrongKeyEntry(K k2, int i2, @NullableDecl E e2) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {
        public final int hash;
        @NullableDecl
        public final E next;

        public AbstractWeakKeyEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl E e2) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CleanupMapTask implements Runnable {
        public final WeakReference<MapMakerInternalMap<?, ?, ?, ?>> mapReference;

        public CleanupMapTask(MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        private DummyInternalEntry() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getKey() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ DummyInternalEntry getNext() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public DummyInternalEntry getNext() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        public final /* synthetic */ MapMakerInternalMap this$0;

        public EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class EntrySet extends SafeToArraySet<Map.Entry<K, V>> {
        public final /* synthetic */ MapMakerInternalMap this$0;

        public EntrySet(MapMakerInternalMap mapMakerInternalMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
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
    public abstract class HashIterator<T> implements Iterator<T> {
        @MonotonicNonNullDecl
        public Segment<K, V, E, S> currentSegment;
        @MonotonicNonNullDecl
        public AtomicReferenceArray<E> currentTable;
        @NullableDecl
        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry lastReturned;
        @NullableDecl
        public E nextEntry;
        @NullableDecl
        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextExternal;
        public int nextSegmentIndex;
        public int nextTableIndex;
        public final /* synthetic */ MapMakerInternalMap this$0;

        public HashIterator(MapMakerInternalMap mapMakerInternalMap) {
        }

        public final void advance() {
        }

        public boolean advanceTo(E e2) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public abstract T next();

        public MapMakerInternalMap<K, V, E, S>.WriteThroughEntry nextEntry() {
        }

        public boolean nextInChain() {
        }

        public boolean nextInTable() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        E copy(S s, E e2, @NullableDecl E e3);

        Strength keyStrength();

        E newEntry(S s, K k2, int i2, @NullableDecl E e2);

        S newSegment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i2, int i3);

        void setValue(S s, E e2, V v);

        Strength valueStrength();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        public final /* synthetic */ MapMakerInternalMap this$0;

        public KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class KeySet extends SafeToArraySet<K> {
        public final /* synthetic */ MapMakerInternalMap this$0;

        public KeySet(MapMakerInternalMap mapMakerInternalMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
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
    public static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        private SafeToArraySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        public /* synthetic */ SafeToArraySet(AnonymousClass1 anonymousClass1) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        public SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i2, ConcurrentMap<K, V> concurrentMap) {
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        }

        private Object readResolve() {
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Strength {
        private static final /* synthetic */ Strength[] $VALUES = null;
        public static final Strength STRONG = null;
        public static final Strength WEAK = null;

        /* renamed from: com.google.common.collect.MapMakerInternalMap$Strength$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends Strength {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
            }
        }

        /* renamed from: com.google.common.collect.MapMakerInternalMap$Strength$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends Strength {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
            }
        }

        private Strength(String str, int i2) {
        }

        public static Strength valueOf(String str) {
        }

        public static Strength[] values() {
        }

        public abstract Equivalence<Object> defaultEquivalence();

        public /* synthetic */ Strength(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
            private static final Helper<?> INSTANCE = null;

            public static <K> Helper<K> instance() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ Segment newSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
            }

            public void setValue(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
            }

            public StrongKeyDummyValueEntry<K> copy(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, @NullableDecl StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry2) {
            }

            public StrongKeyDummyValueEntry<K> newEntry(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k2, int i2, @NullableDecl StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i2, int i3) {
            }
        }

        public StrongKeyDummyValueEntry(K k2, int i2, @NullableDecl StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
        }

        public StrongKeyDummyValueEntry<K> copy(StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
        }

        public void setValue(MapMaker.Dummy dummy) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public MapMaker.Dummy getValue() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        public StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i2, int i3) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ InternalEntry castForTesting(InternalEntry internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueSegment<K> self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {
        @NullableDecl
        private volatile V value;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = null;

            public static <K, V> Helper<K, V> instance() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ Segment newSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
            }

            public StrongKeyStrongValueEntry<K, V> copy(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, @NullableDecl StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2) {
            }

            public StrongKeyStrongValueEntry<K, V> newEntry(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k2, int i2, @NullableDecl StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            }

            public void setValue(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, V v) {
            }
        }

        public StrongKeyStrongValueEntry(K k2, int i2, @NullableDecl StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
        }

        public StrongKeyStrongValueEntry<K, V> copy(StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @NullableDecl
        public V getValue() {
        }

        public void setValue(V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ InternalEntry castForTesting(InternalEntry internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueSegment<K, V> self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {
        private volatile WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> valueReference;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = null;

            public static <K, V> Helper<K, V> instance() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ Segment newSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
            }

            public StrongKeyWeakValueEntry<K, V> copy(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, @NullableDecl StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2) {
            }

            public StrongKeyWeakValueEntry<K, V> newEntry(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k2, int i2, @NullableDecl StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            }

            public void setValue(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, V v) {
            }
        }

        public StrongKeyWeakValueEntry(K k2, int i2, @NullableDecl StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
        }

        public static /* synthetic */ WeakValueReference access$600(StrongKeyWeakValueEntry strongKeyWeakValueEntry) {
        }

        public static /* synthetic */ WeakValueReference access$602(StrongKeyWeakValueEntry strongKeyWeakValueEntry, WeakValueReference weakValueReference) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
        }

        public StrongKeyWeakValueEntry<K, V> copy(ReferenceQueue<V> referenceQueue, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getValueReference() {
        }

        public void setValue(V v, ReferenceQueue<V> referenceQueue) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<V> queueForValues;

        public StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
        }

        public static /* synthetic */ ReferenceQueue access$100(StrongKeyWeakValueSegment strongKeyWeakValueSegment) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ InternalEntry castForTesting(InternalEntry internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueSegment<K, V> self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public StrongKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        public final /* synthetic */ MapMakerInternalMap this$0;

        public ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Values extends AbstractCollection<V> {
        public final /* synthetic */ MapMakerInternalMap this$0;

        public Values(MapMakerInternalMap mapMakerInternalMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
            private static final Helper<?> INSTANCE = null;

            public static <K> Helper<K> instance() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ Segment newSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
            }

            public void setValue(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
            }

            public WeakKeyDummyValueEntry<K> copy(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, @NullableDecl WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry2) {
            }

            public WeakKeyDummyValueEntry<K> newEntry(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k2, int i2, @NullableDecl WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i2, int i3) {
            }
        }

        public WeakKeyDummyValueEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
        }

        public WeakKeyDummyValueEntry<K> copy(ReferenceQueue<K> referenceQueue, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public /* bridge */ /* synthetic */ Object getValue() {
        }

        public void setValue(MapMaker.Dummy dummy) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public MapMaker.Dummy getValue() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i2, int i3) {
        }

        public static /* synthetic */ ReferenceQueue access$200(WeakKeyDummyValueSegment weakKeyDummyValueSegment) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ InternalEntry castForTesting(InternalEntry internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueSegment<K> self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {
        @NullableDecl
        private volatile V value;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = null;

            public static <K, V> Helper<K, V> instance() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ Segment newSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
            }

            public WeakKeyStrongValueEntry<K, V> copy(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, @NullableDecl WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2) {
            }

            public WeakKeyStrongValueEntry<K, V> newEntry(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k2, int i2, @NullableDecl WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            }

            public void setValue(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, V v) {
            }
        }

        public WeakKeyStrongValueEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
        }

        public WeakKeyStrongValueEntry<K, V> copy(ReferenceQueue<K> referenceQueue, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @NullableDecl
        public V getValue() {
        }

        public void setValue(V v) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;

        public WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
        }

        public static /* synthetic */ ReferenceQueue access$300(WeakKeyStrongValueSegment weakKeyStrongValueSegment) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ InternalEntry castForTesting(InternalEntry internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueSegment<K, V> self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {
        private volatile WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> valueReference;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
            private static final Helper<?, ?> INSTANCE = null;

            public static <K, V> Helper<K, V> instance() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, @NullableDecl InternalEntry internalEntry2) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i2, @NullableDecl InternalEntry internalEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ Segment newSegment(MapMakerInternalMap mapMakerInternalMap, int i2, int i3) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
            }

            public WeakKeyWeakValueEntry<K, V> copy(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, @NullableDecl WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2) {
            }

            public WeakKeyWeakValueEntry<K, V> newEntry(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k2, int i2, @NullableDecl WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
            }

            public void setValue(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, V v) {
            }
        }

        public WeakKeyWeakValueEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
        }

        public static /* synthetic */ WeakValueReference access$700(WeakKeyWeakValueEntry weakKeyWeakValueEntry) {
        }

        public static /* synthetic */ WeakValueReference access$702(WeakKeyWeakValueEntry weakKeyWeakValueEntry, WeakValueReference weakValueReference) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
        }

        public WeakKeyWeakValueEntry<K, V> copy(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getValueReference() {
        }

        public void setValue(V v, ReferenceQueue<V> referenceQueue) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {
        private final ReferenceQueue<K> queueForKeys;
        private final ReferenceQueue<V> queueForValues;

        public WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i2, int i3) {
        }

        public static /* synthetic */ ReferenceQueue access$400(WeakKeyWeakValueSegment weakKeyWeakValueSegment) {
        }

        public static /* synthetic */ ReferenceQueue access$500(WeakKeyWeakValueSegment weakKeyWeakValueSegment) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ InternalEntry castForTesting(InternalEntry internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeClearReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void maybeDrainReferenceQueues() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public /* bridge */ /* synthetic */ Segment self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueSegment<K, V> self() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        void clearValue();

        WeakValueReference<K, V, E> getValueReference();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        void clear();

        WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e2);

        @NullableDecl
        V get();

        E getEntry();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        @Weak
        public final E entry;

        public WeakValueReferenceImpl(ReferenceQueue<V> referenceQueue, V v, E e2) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e2) {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class WriteThroughEntry extends AbstractMapEntry<K, V> {
        public final K key;
        public final /* synthetic */ MapMakerInternalMap this$0;
        public V value;

        public WriteThroughEntry(MapMakerInternalMap mapMakerInternalMap, K k2, V v) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper<K, V, E, S> internalEntryHelper) {
    }

    public static /* synthetic */ ArrayList access$900(Collection collection) {
    }

    public static <K, V> MapMakerInternalMap<K, V, ? extends InternalEntry<K, V, ?>, ?> create(MapMaker mapMaker) {
    }

    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends InternalEntry<K, MapMaker.Dummy, ?>, ?> createWithDummyValues(MapMaker mapMaker) {
    }

    public static int rehash(int i2) {
    }

    private static <E> ArrayList<E> toArrayList(Collection<E> collection) {
    }

    public static <K, V, E extends InternalEntry<K, V, E>> WeakValueReference<K, V, E> unsetWeakValueReference() {
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

    @VisibleForTesting
    public E copyEntry(E e2, E e3) {
    }

    public Segment<K, V, E, S> createSegment(int i2, int i3) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
    }

    public E getEntry(@NullableDecl Object obj) {
    }

    public V getLiveValue(E e2) {
    }

    public int hash(Object obj) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
    }

    @VisibleForTesting
    public boolean isLiveForTesting(InternalEntry<K, V, ?> internalEntry) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    @VisibleForTesting
    public Strength keyStrength() {
    }

    public final Segment<K, V, E, S>[] newSegmentArray(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k2, V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V putIfAbsent(K k2, V v) {
    }

    public void reclaimKey(E e2) {
    }

    public void reclaimValue(WeakValueReference<K, V, E> weakValueReference) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k2, @NullableDecl V v, V v2) {
    }

    public Segment<K, V, E, S> segmentFor(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    @VisibleForTesting
    public Equivalence<Object> valueEquivalence() {
    }

    @VisibleForTesting
    public Strength valueStrength() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
    }

    public Object writeReplace() {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V replace(K k2, V v) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        public volatile int count;
        @Weak
        public final MapMakerInternalMap<K, V, E, S> map;
        public final int maxSegmentSize;
        public int modCount;
        public final AtomicInteger readCount;
        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<E> table;
        public int threshold;

        public Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i2, int i3) {
        }

        public static <K, V, E extends InternalEntry<K, V, E>> boolean isCollected(E e2) {
        }

        public abstract E castForTesting(InternalEntry<K, V, ?> internalEntry);

        public void clear() {
        }

        public <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
        }

        @CanIgnoreReturnValue
        public boolean clearValueForTesting(K k2, int i2, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
        }

        public boolean containsKey(Object obj, int i2) {
        }

        @VisibleForTesting
        public boolean containsValue(Object obj) {
        }

        public E copyEntry(E e2, E e3) {
        }

        public E copyForTesting(InternalEntry<K, V, ?> internalEntry, @NullableDecl InternalEntry<K, V, ?> internalEntry2) {
        }

        @GuardedBy("this")
        public void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
        }

        @GuardedBy("this")
        public void expand() {
        }

        public V get(Object obj, int i2) {
        }

        public E getEntry(Object obj, int i2) {
        }

        public E getFirst(int i2) {
        }

        public ReferenceQueue<K> getKeyReferenceQueueForTesting() {
        }

        public E getLiveEntry(Object obj, int i2) {
        }

        @NullableDecl
        public V getLiveValue(E e2) {
        }

        @NullableDecl
        public V getLiveValueForTesting(InternalEntry<K, V, ?> internalEntry) {
        }

        public ReferenceQueue<V> getValueReferenceQueueForTesting() {
        }

        public WeakValueReference<K, V, E> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
        }

        public void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
        }

        public void maybeClearReferenceQueues() {
        }

        @GuardedBy("this")
        public void maybeDrainReferenceQueues() {
        }

        public AtomicReferenceArray<E> newEntryArray(int i2) {
        }

        public E newEntryForTesting(K k2, int i2, @NullableDecl InternalEntry<K, V, ?> internalEntry) {
        }

        public WeakValueReference<K, V, E> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
        }

        public void postReadCleanup() {
        }

        @GuardedBy("this")
        public void preWriteCleanup() {
        }

        public V put(K k2, int i2, V v, boolean z) {
        }

        @CanIgnoreReturnValue
        public boolean reclaimKey(E e2, int i2) {
        }

        @CanIgnoreReturnValue
        public boolean reclaimValue(K k2, int i2, WeakValueReference<K, V, E> weakValueReference) {
        }

        @CanIgnoreReturnValue
        public V remove(Object obj, int i2) {
        }

        @GuardedBy("this")
        public boolean removeEntryForTesting(E e2) {
        }

        @GuardedBy("this")
        public E removeFromChain(E e2, E e3) {
        }

        public E removeFromChainForTesting(InternalEntry<K, V, ?> internalEntry, InternalEntry<K, V, ?> internalEntry2) {
        }

        @CanIgnoreReturnValue
        public boolean removeTableEntryForTesting(InternalEntry<K, V, ?> internalEntry) {
        }

        public boolean replace(K k2, int i2, V v, V v2) {
        }

        public void runCleanup() {
        }

        public void runLockedCleanup() {
        }

        public abstract S self();

        public void setTableEntryForTesting(int i2, InternalEntry<K, V, ?> internalEntry) {
        }

        public void setValue(E e2, V v) {
        }

        public void setValueForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
        }

        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
        }

        public void tryDrainReferenceQueues() {
        }

        public boolean remove(Object obj, int i2, Object obj2) {
        }

        public V replace(K k2, int i2, V v) {
        }
    }
}
