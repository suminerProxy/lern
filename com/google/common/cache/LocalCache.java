package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final int CONTAINS_VALUE_RETRIES = 3;
    public static final Queue<?> DISCARDING_QUEUE = null;
    public static final int DRAIN_MAX = 16;
    public static final int DRAIN_THRESHOLD = 63;
    public static final int MAXIMUM_CAPACITY = 1073741824;
    public static final int MAX_SEGMENTS = 65536;
    public static final ValueReference<Object, Object> UNSET = null;
    public static final Logger logger = null;
    public final int concurrencyLevel;
    @NullableDecl
    public final CacheLoader<? super K, V> defaultLoader;
    public final EntryFactory entryFactory;
    @MonotonicNonNullDecl
    public Set<Map.Entry<K, V>> entrySet;
    public final long expireAfterAccessNanos;
    public final long expireAfterWriteNanos;
    public final AbstractCache.StatsCounter globalStatsCounter;
    public final Equivalence<Object> keyEquivalence;
    @MonotonicNonNullDecl
    public Set<K> keySet;
    public final Strength keyStrength;
    public final long maxWeight;
    public final long refreshNanos;
    public final RemovalListener<K, V> removalListener;
    public final Queue<RemovalNotification<K, V>> removalNotificationQueue;
    public final int segmentMask;
    public final int segmentShift;
    public final Segment<K, V>[] segments;
    public final Ticker ticker;
    public final Equivalence<Object> valueEquivalence;
    public final Strength valueStrength;
    @MonotonicNonNullDecl
    public Collection<V> values;
    public final Weigher<K, V> weigher;

    /* renamed from: com.google.common.cache.LocalCache$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements ValueReference<Object, Object> {
        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, @NullableDecl Object obj, ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object get() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<Object, Object> getEntry() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object waitForValue() {
        }
    }

    /* renamed from: com.google.common.cache.LocalCache$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
        }

        @Override // java.util.Queue
        public Object peek() {
        }

        @Override // java.util.Queue
        public Object poll() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        @Weak
        public final ConcurrentMap<?, ?> map;
        public final /* synthetic */ LocalCache this$0;

        public AbstractCacheSet(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j2) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        public final ReferenceEntry<K, V> head;

        /* renamed from: com.google.common.cache.LocalCache$AccessQueue$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {
            public ReferenceEntry<K, V> nextAccess;
            public ReferenceEntry<K, V> previousAccess;
            public final /* synthetic */ AccessQueue this$0;

            public AnonymousClass1(AccessQueue accessQueue) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInAccessQueue() {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j2) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$AccessQueue$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractSequentialIterator<ReferenceEntry<K, V>> {
            public final /* synthetic */ AccessQueue this$0;

            public AnonymousClass2(AccessQueue accessQueue, ReferenceEntry referenceEntry) {
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public /* bridge */ /* synthetic */ Object computeNext(Object obj) {
            }

            public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
            }
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ Object peek() {
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ Object poll() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class EntryFactory {
        private static final /* synthetic */ EntryFactory[] $VALUES = null;
        public static final int ACCESS_MASK = 1;
        public static final EntryFactory STRONG = null;
        public static final EntryFactory STRONG_ACCESS = null;
        public static final EntryFactory STRONG_ACCESS_WRITE = null;
        public static final EntryFactory STRONG_WRITE = null;
        public static final EntryFactory WEAK = null;
        public static final EntryFactory WEAK_ACCESS = null;
        public static final EntryFactory WEAK_ACCESS_WRITE = null;
        public static final int WEAK_MASK = 4;
        public static final EntryFactory WEAK_WRITE = null;
        public static final int WRITE_MASK = 2;
        public static final EntryFactory[] factories = null;

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends EntryFactory {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends EntryFactory {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends EntryFactory {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass4 extends EntryFactory {
            public AnonymousClass4(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass5 extends EntryFactory {
            public AnonymousClass5(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass6 extends EntryFactory {
            public AnonymousClass6(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$7  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass7 extends EntryFactory {
            public AnonymousClass7(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$EntryFactory$8  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass8 extends EntryFactory {
            public AnonymousClass8(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
            }
        }

        private EntryFactory(String str, int i2) {
        }

        public static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
        }

        public static EntryFactory valueOf(String str) {
        }

        public static EntryFactory[] values() {
        }

        public <K, V> void copyAccessEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        }

        public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        }

        public <K, V> void copyWriteEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        }

        public abstract <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry);

        public /* synthetic */ EntryFactory(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        public final /* synthetic */ LocalCache this$0;

        public EntryIterator(LocalCache localCache) {
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        public final /* synthetic */ LocalCache this$0;

        public EntrySet(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
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
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class HashIterator<T> implements Iterator<T> {
        @MonotonicNonNullDecl
        public Segment<K, V> currentSegment;
        @MonotonicNonNullDecl
        public AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
        @NullableDecl
        public LocalCache<K, V>.WriteThroughEntry lastReturned;
        @NullableDecl
        public ReferenceEntry<K, V> nextEntry;
        @NullableDecl
        public LocalCache<K, V>.WriteThroughEntry nextExternal;
        public int nextSegmentIndex;
        public int nextTableIndex;
        public final /* synthetic */ LocalCache this$0;

        public HashIterator(LocalCache localCache) {
        }

        public final void advance() {
        }

        public boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public abstract T next();

        public LocalCache<K, V>.WriteThroughEntry nextEntry() {
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
    public final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        public final /* synthetic */ LocalCache this$0;

        public KeyIterator(LocalCache localCache) {
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        public final /* synthetic */ LocalCache this$0;

        public KeySet(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
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
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        @MonotonicNonNullDecl
        public transient LoadingCache<K, V> autoDelegate;

        public LoadingSerializationProxy(LocalCache<K, V> localCache) {
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k2) {
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k2) throws ExecutionException {
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k2) {
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {
        public final SettableFuture<V> futureValue;
        public volatile ValueReference<K, V> oldValue;
        public final Stopwatch stopwatch;

        /* renamed from: com.google.common.cache.LocalCache$LoadingValueReference$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Function<V, V> {
            public final /* synthetic */ LoadingValueReference this$0;

            public AnonymousClass1(LoadingValueReference loadingValueReference) {
            }

            @Override // com.google.common.base.Function
            public V apply(V v) {
            }
        }

        public LoadingValueReference() {
        }

        private ListenableFuture<V> fullyFailedFuture(Throwable th) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, @NullableDecl V v, ReferenceEntry<K, V> referenceEntry) {
        }

        public long elapsedNanos() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
        }

        public ValueReference<K, V> getOldValue() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
        }

        public ListenableFuture<V> loadFuture(K k2, CacheLoader<? super K, V> cacheLoader) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(@NullableDecl V v) {
        }

        public boolean set(@NullableDecl V v) {
        }

        public boolean setException(Throwable th) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws ExecutionException {
        }

        public LoadingValueReference(ValueReference<K, V> valueReference) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k2) {
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k2) throws ExecutionException {
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k2) {
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k2) {
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        public Object writeReplace() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        public final LocalCache<K, V> localCache;

        /* renamed from: com.google.common.cache.LocalCache$LocalManualCache$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends CacheLoader<Object, V> {
            public final /* synthetic */ LocalManualCache this$0;
            public final /* synthetic */ Callable val$valueLoader;

            public AnonymousClass1(LocalManualCache localManualCache, Callable callable) {
            }

            @Override // com.google.common.cache.CacheLoader
            public V load(Object obj) throws Exception {
            }
        }

        public /* synthetic */ LocalManualCache(LocalCache localCache, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
        }

        @Override // com.google.common.cache.Cache
        public V get(K k2, Callable<? extends V> callable) throws ExecutionException {
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
        }

        @Override // com.google.common.cache.Cache
        @NullableDecl
        public V getIfPresent(Object obj) {
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
        }

        @Override // com.google.common.cache.Cache
        public void put(K k2, V v) {
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
        }

        @Override // com.google.common.cache.Cache
        public long size() {
        }

        @Override // com.google.common.cache.Cache
        public CacheStats stats() {
        }

        public Object writeReplace() {
        }

        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        public final int concurrencyLevel;
        @MonotonicNonNullDecl
        public transient Cache<K, V> delegate;
        public final long expireAfterAccessNanos;
        public final long expireAfterWriteNanos;
        public final Equivalence<Object> keyEquivalence;
        public final Strength keyStrength;
        public final CacheLoader<? super K, V> loader;
        public final long maxWeight;
        public final RemovalListener<? super K, ? super V> removalListener;
        @NullableDecl
        public final Ticker ticker;
        public final Equivalence<Object> valueEquivalence;
        public final Strength valueStrength;
        public final Weigher<K, V> weigher;

        public ManualSerializationProxy(LocalCache<K, V> localCache) {
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public /* bridge */ /* synthetic */ Object delegate() {
        }

        public CacheBuilder<K, V> recreateCacheBuilder() {
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j2, long j3, long j4, Weigher<K, V> weigher, int i2, RemovalListener<? super K, ? super V> removalListener, Ticker ticker, CacheLoader<? super K, V> cacheLoader) {
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public Cache<K, V> delegate() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NullEntry implements ReferenceEntry<Object, Object> {
        private static final /* synthetic */ NullEntry[] $VALUES = null;
        public static final NullEntry INSTANCE = null;

        private NullEntry(String str, int i2) {
        }

        public static NullEntry valueOf(String str) {
        }

        public static NullEntry[] values() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNext() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInAccessQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInWriteQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<Object, Object> getValueReference() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j2) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        public final ReferenceEntry<K, V> entry;

        public SoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Strength {
        private static final /* synthetic */ Strength[] $VALUES = null;
        public static final Strength SOFT = null;
        public static final Strength STRONG = null;
        public static final Strength WEAK = null;

        /* renamed from: com.google.common.cache.LocalCache$Strength$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends Strength {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$Strength$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends Strength {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$Strength$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends Strength {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
            }

            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2) {
            }
        }

        private Strength(String str, int i2) {
        }

        public static Strength valueOf(String str) {
        }

        public static Strength[] values() {
        }

        public abstract Equivalence<Object> defaultEquivalence();

        public abstract <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i2);

        public /* synthetic */ Strength(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        public volatile long accessTime;
        public ReferenceEntry<K, V> nextAccess;
        public ReferenceEntry<K, V> previousAccess;

        public StrongAccessEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j2) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        public volatile long accessTime;
        public ReferenceEntry<K, V> nextAccess;
        public ReferenceEntry<K, V> nextWrite;
        public ReferenceEntry<K, V> previousAccess;
        public ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public StrongAccessWriteEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j2) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {
        public final int hash;
        public final K key;
        @NullableDecl
        public final ReferenceEntry<K, V> next;
        public volatile ValueReference<K, V> valueReference;

        public StrongEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StrongValueReference<K, V> implements ValueReference<K, V> {
        public final V referent;

        public StrongValueReference(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {
        public ReferenceEntry<K, V> nextWrite;
        public ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public StrongWriteEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        public final /* synthetic */ LocalCache this$0;

        public ValueIterator(LocalCache localCache) {
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, @NullableDecl V v, ReferenceEntry<K, V> referenceEntry);

        @NullableDecl
        V get();

        @NullableDecl
        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(@NullableDecl V v);

        V waitForValue() throws ExecutionException;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Values extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> map;
        public final /* synthetic */ LocalCache this$0;

        public Values(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
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
        public <E> E[] toArray(E[] eArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        public volatile long accessTime;
        public ReferenceEntry<K, V> nextAccess;
        public ReferenceEntry<K, V> previousAccess;

        public WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j2) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        public volatile long accessTime;
        public ReferenceEntry<K, V> nextAccess;
        public ReferenceEntry<K, V> nextWrite;
        public ReferenceEntry<K, V> previousAccess;
        public ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j2) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        public final int hash;
        @NullableDecl
        public final ReferenceEntry<K, V> next;
        public volatile ValueReference<K, V> valueReference;

        public WeakEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        public long getAccessTime() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
        }

        public ReferenceEntry<K, V> getNextInWriteQueue() {
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
        }

        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
        }

        public long getWriteTime() {
        }

        public void setAccessTime(long j2) {
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
        }

        public void setWriteTime(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        public final ReferenceEntry<K, V> entry;

        public WeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {
        public ReferenceEntry<K, V> nextWrite;
        public ReferenceEntry<K, V> previousWrite;
        public volatile long writeTime;

        public WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {
        public final int weight;

        public WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i2) {
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {
        public final int weight;

        public WeightedStrongValueReference(V v, int i2) {
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {
        public final int weight;

        public WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i2) {
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        public final ReferenceEntry<K, V> head;

        /* renamed from: com.google.common.cache.LocalCache$WriteQueue$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractReferenceEntry<K, V> {
            public ReferenceEntry<K, V> nextWrite;
            public ReferenceEntry<K, V> previousWrite;
            public final /* synthetic */ WriteQueue this$0;

            public AnonymousClass1(WriteQueue writeQueue) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInWriteQueue() {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j2) {
            }
        }

        /* renamed from: com.google.common.cache.LocalCache$WriteQueue$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 extends AbstractSequentialIterator<ReferenceEntry<K, V>> {
            public final /* synthetic */ WriteQueue this$0;

            public AnonymousClass2(WriteQueue writeQueue, ReferenceEntry referenceEntry) {
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public /* bridge */ /* synthetic */ Object computeNext(Object obj) {
            }

            public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
            }
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ Object peek() {
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ Object poll() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
        }

        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class WriteThroughEntry implements Map.Entry<K, V> {
        public final K key;
        public final /* synthetic */ LocalCache this$0;
        public V value;

        public WriteThroughEntry(LocalCache localCache, K k2, V v) {
        }

        @Override // java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
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

        @Override // java.util.Map.Entry
        public V setValue(V v) {
        }

        public String toString() {
        }
    }

    public LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, @NullableDecl CacheLoader<? super K, V> cacheLoader) {
    }

    public static /* synthetic */ ArrayList access$200(Collection collection) {
    }

    public static <K, V> void connectAccessOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
    }

    public static <K, V> void connectWriteOrder(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
    }

    public static <E> Queue<E> discardingQueue() {
    }

    public static <K, V> ReferenceEntry<K, V> nullEntry() {
    }

    public static <K, V> void nullifyAccessOrder(ReferenceEntry<K, V> referenceEntry) {
    }

    public static <K, V> void nullifyWriteOrder(ReferenceEntry<K, V> referenceEntry) {
    }

    public static int rehash(int i2) {
    }

    private static <E> ArrayList<E> toArrayList(Collection<E> collection) {
    }

    public static <K, V> ValueReference<K, V> unset() {
    }

    public void cleanUp() {
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
    public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
    }

    public Segment<K, V> createSegment(int i2, long j2, AbstractCache.StatsCounter statsCounter) {
    }

    public boolean customWeigher() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
    }

    public boolean evictsBySize() {
    }

    public boolean expires() {
    }

    public boolean expiresAfterAccess() {
    }

    public boolean expiresAfterWrite() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
    }

    public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
    }

    public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
    }

    public ReferenceEntry<K, V> getEntry(@NullableDecl Object obj) {
    }

    @NullableDecl
    public V getIfPresent(Object obj) {
    }

    @NullableDecl
    public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j2) {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @NullableDecl
    public V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
    }

    public V getOrLoad(K k2) throws ExecutionException {
    }

    public int hash(@NullableDecl Object obj) {
    }

    public void invalidateAll(Iterable<?> iterable) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
    }

    public boolean isExpired(ReferenceEntry<K, V> referenceEntry, long j2) {
    }

    @VisibleForTesting
    public boolean isLive(ReferenceEntry<K, V> referenceEntry, long j2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
    }

    @NullableDecl
    public Map<K, V> loadAll(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
    }

    public long longSize() {
    }

    @VisibleForTesting
    public ReferenceEntry<K, V> newEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
    }

    public final Segment<K, V>[] newSegmentArray(int i2) {
    }

    @VisibleForTesting
    public ValueReference<K, V> newValueReference(ReferenceEntry<K, V> referenceEntry, V v, int i2) {
    }

    public void processPendingNotifications() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v) {
    }

    public void reclaimKey(ReferenceEntry<K, V> referenceEntry) {
    }

    public void reclaimValue(ValueReference<K, V> valueReference) {
    }

    public boolean recordsAccess() {
    }

    public boolean recordsTime() {
    }

    public boolean recordsWrite() {
    }

    public void refresh(K k2) {
    }

    public boolean refreshes() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@NullableDecl Object obj) {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, @NullableDecl V v, V v2) {
    }

    public Segment<K, V> segmentFor(int i2) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
    }

    public boolean usesAccessEntries() {
    }

    public boolean usesAccessQueue() {
    }

    public boolean usesKeyReferences() {
    }

    public boolean usesValueReferences() {
    }

    public boolean usesWriteEntries() {
    }

    public boolean usesWriteQueue() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
    }

    public V get(K k2, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Segment<K, V> extends ReentrantLock {
        @GuardedBy("this")
        public final Queue<ReferenceEntry<K, V>> accessQueue;
        public volatile int count;
        @NullableDecl
        public final ReferenceQueue<K> keyReferenceQueue;
        @Weak
        public final LocalCache<K, V> map;
        public final long maxSegmentWeight;
        public int modCount;
        public final AtomicInteger readCount;
        public final Queue<ReferenceEntry<K, V>> recencyQueue;
        public final AbstractCache.StatsCounter statsCounter;
        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        public int threshold;
        @GuardedBy("this")
        public long totalWeight;
        @NullableDecl
        public final ReferenceQueue<V> valueReferenceQueue;
        @GuardedBy("this")
        public final Queue<ReferenceEntry<K, V>> writeQueue;

        /* renamed from: com.google.common.cache.LocalCache$Segment$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ Segment this$0;
            public final /* synthetic */ int val$hash;
            public final /* synthetic */ Object val$key;
            public final /* synthetic */ ListenableFuture val$loadingFuture;
            public final /* synthetic */ LoadingValueReference val$loadingValueReference;

            public AnonymousClass1(Segment segment, Object obj, int i2, LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public Segment(LocalCache<K, V> localCache, int i2, long j2, AbstractCache.StatsCounter statsCounter) {
        }

        public void cleanUp() {
        }

        public void clear() {
        }

        public void clearKeyReferenceQueue() {
        }

        public void clearReferenceQueues() {
        }

        public void clearValueReferenceQueue() {
        }

        public boolean containsKey(Object obj, int i2) {
        }

        @VisibleForTesting
        public boolean containsValue(Object obj) {
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        }

        @GuardedBy("this")
        public void drainKeyReferenceQueue() {
        }

        @GuardedBy("this")
        public void drainRecencyQueue() {
        }

        @GuardedBy("this")
        public void drainReferenceQueues() {
        }

        @GuardedBy("this")
        public void drainValueReferenceQueue() {
        }

        @GuardedBy("this")
        public void enqueueNotification(@NullableDecl K k2, int i2, @NullableDecl V v, int i3, RemovalCause removalCause) {
        }

        @GuardedBy("this")
        public void evictEntries(ReferenceEntry<K, V> referenceEntry) {
        }

        @GuardedBy("this")
        public void expand() {
        }

        @GuardedBy("this")
        public void expireEntries(long j2) {
        }

        public V get(K k2, int i2, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        }

        public V getAndRecordStats(K k2, int i2, LoadingValueReference<K, V> loadingValueReference, ListenableFuture<V> listenableFuture) throws ExecutionException {
        }

        @NullableDecl
        public ReferenceEntry<K, V> getEntry(Object obj, int i2) {
        }

        public ReferenceEntry<K, V> getFirst(int i2) {
        }

        @NullableDecl
        public ReferenceEntry<K, V> getLiveEntry(Object obj, int i2, long j2) {
        }

        public V getLiveValue(ReferenceEntry<K, V> referenceEntry, long j2) {
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> getNextEvictable() {
        }

        public void initTable(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
        }

        @NullableDecl
        public LoadingValueReference<K, V> insertLoadingValueReference(K k2, int i2, boolean z) {
        }

        public ListenableFuture<V> loadAsync(K k2, int i2, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) {
        }

        public V loadSync(K k2, int i2, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        }

        public V lockedGetOrLoad(K k2, int i2, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        }

        @GuardedBy("this")
        public ReferenceEntry<K, V> newEntry(K k2, int i2, @NullableDecl ReferenceEntry<K, V> referenceEntry) {
        }

        public AtomicReferenceArray<ReferenceEntry<K, V>> newEntryArray(int i2) {
        }

        public void postReadCleanup() {
        }

        public void postWriteCleanup() {
        }

        @GuardedBy("this")
        public void preWriteCleanup(long j2) {
        }

        @NullableDecl
        public V put(K k2, int i2, V v, boolean z) {
        }

        public boolean reclaimKey(ReferenceEntry<K, V> referenceEntry, int i2) {
        }

        public boolean reclaimValue(K k2, int i2, ValueReference<K, V> valueReference) {
        }

        @GuardedBy("this")
        public void recordLockedRead(ReferenceEntry<K, V> referenceEntry, long j2) {
        }

        public void recordRead(ReferenceEntry<K, V> referenceEntry, long j2) {
        }

        @GuardedBy("this")
        public void recordWrite(ReferenceEntry<K, V> referenceEntry, int i2, long j2) {
        }

        @NullableDecl
        public V refresh(K k2, int i2, CacheLoader<? super K, V> cacheLoader, boolean z) {
        }

        @NullableDecl
        public V remove(Object obj, int i2) {
        }

        @GuardedBy("this")
        public void removeCollectedEntry(ReferenceEntry<K, V> referenceEntry) {
        }

        @VisibleForTesting
        @GuardedBy("this")
        public boolean removeEntry(ReferenceEntry<K, V> referenceEntry, int i2, RemovalCause removalCause) {
        }

        @NullableDecl
        @GuardedBy("this")
        public ReferenceEntry<K, V> removeEntryFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        }

        public boolean removeLoadingValue(K k2, int i2, LoadingValueReference<K, V> loadingValueReference) {
        }

        @NullableDecl
        @GuardedBy("this")
        public ReferenceEntry<K, V> removeValueFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, @NullableDecl K k2, int i2, V v, ValueReference<K, V> valueReference, RemovalCause removalCause) {
        }

        public boolean replace(K k2, int i2, V v, V v2) {
        }

        public void runLockedCleanup(long j2) {
        }

        public void runUnlockedCleanup() {
        }

        public V scheduleRefresh(ReferenceEntry<K, V> referenceEntry, K k2, int i2, V v, long j2, CacheLoader<? super K, V> cacheLoader) {
        }

        @GuardedBy("this")
        public void setValue(ReferenceEntry<K, V> referenceEntry, K k2, V v, long j2) {
        }

        public boolean storeLoadedValue(K k2, int i2, LoadingValueReference<K, V> loadingValueReference, V v) {
        }

        public void tryDrainReferenceQueues() {
        }

        public void tryExpireEntries(long j2) {
        }

        public V waitForLoadingValue(ReferenceEntry<K, V> referenceEntry, K k2, ValueReference<K, V> valueReference) throws ExecutionException {
        }

        @NullableDecl
        public V get(Object obj, int i2) {
        }

        public boolean remove(Object obj, int i2, Object obj2) {
        }

        @NullableDecl
        public V replace(K k2, int i2, V v) {
        }
    }
}
