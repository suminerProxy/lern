package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.HasDebugData;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Predicate;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LruCountingMemoryCache<K, V> implements CountingMemoryCache<K, V>, MemoryCache<K, V>, HasDebugData {
    private final MemoryCache.CacheTrimStrategy mCacheTrimStrategy;
    @GuardedBy("this")
    @VisibleForTesting
    public final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mCachedEntries;
    @Nullable
    private final CountingMemoryCache.EntryStateObserver<K> mEntryStateObserver;
    @GuardedBy("this")
    @VisibleForTesting
    public final CountingLruMap<K, CountingMemoryCache.Entry<K, V>> mExclusiveEntries;
    private final boolean mIgnoreSizeMismatch;
    @GuardedBy("this")
    public MemoryCacheParams mMemoryCacheParams;
    private final Supplier<MemoryCacheParams> mMemoryCacheParamsSupplier;
    private final boolean mStoreEntrySize;
    private final ValueDescriptor<V> mValueDescriptor;
    @GuardedBy("this")
    @VisibleForTesting
    public final Map<Bitmap, Object> mOtherEntries = new WeakHashMap();
    @GuardedBy("this")
    private long mLastCacheParamsCheck = SystemClock.uptimeMillis();

    public LruCountingMemoryCache(ValueDescriptor<V> valueDescriptor, MemoryCache.CacheTrimStrategy cacheTrimStrategy, Supplier<MemoryCacheParams> memoryCacheParamsSupplier, @Nullable CountingMemoryCache.EntryStateObserver<K> entryStateObserver, boolean storeEntrySize, boolean ignoreSizeMismatch) {
        this.mValueDescriptor = valueDescriptor;
        this.mExclusiveEntries = new CountingLruMap<>(wrapValueDescriptor(valueDescriptor));
        this.mCachedEntries = new CountingLruMap<>(wrapValueDescriptor(valueDescriptor));
        this.mCacheTrimStrategy = cacheTrimStrategy;
        this.mMemoryCacheParamsSupplier = memoryCacheParamsSupplier;
        this.mMemoryCacheParams = (MemoryCacheParams) Preconditions.checkNotNull(memoryCacheParamsSupplier.get(), "mMemoryCacheParamsSupplier returned null");
        this.mEntryStateObserver = entryStateObserver;
        this.mStoreEntrySize = storeEntrySize;
        this.mIgnoreSizeMismatch = ignoreSizeMismatch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (getInUseSizeInBytes() <= (r3.mMemoryCacheParams.maxCacheSize - r4)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean canCacheNewValueOfSize(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = r3.mMemoryCacheParams     // Catch: java.lang.Throwable -> L22
            int r0 = r0.maxCacheEntrySize     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r4 > r0) goto L1f
            int r0 = r3.getInUseCount()     // Catch: java.lang.Throwable -> L22
            com.facebook.imagepipeline.cache.MemoryCacheParams r2 = r3.mMemoryCacheParams     // Catch: java.lang.Throwable -> L22
            int r2 = r2.maxCacheEntries     // Catch: java.lang.Throwable -> L22
            int r2 = r2 - r1
            if (r0 > r2) goto L1f
            int r0 = r3.getInUseSizeInBytes()     // Catch: java.lang.Throwable -> L22
            com.facebook.imagepipeline.cache.MemoryCacheParams r2 = r3.mMemoryCacheParams     // Catch: java.lang.Throwable -> L22
            int r2 = r2.maxCacheSize     // Catch: java.lang.Throwable -> L22
            int r2 = r2 - r4
            if (r0 > r2) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            monitor-exit(r3)
            return r1
        L22:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.LruCountingMemoryCache.canCacheNewValueOfSize(int):boolean");
    }

    private synchronized void decreaseClientCount(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(entry.clientCount > 0);
        entry.clientCount--;
    }

    private synchronized void increaseClientCount(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(!entry.isOrphan);
        entry.clientCount++;
    }

    private synchronized void makeOrphan(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        Preconditions.checkState(!entry.isOrphan);
        entry.isOrphan = true;
    }

    private synchronized void makeOrphans(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries) {
        if (oldEntries != null) {
            Iterator<CountingMemoryCache.Entry<K, V>> it = oldEntries.iterator();
            while (it.hasNext()) {
                makeOrphan(it.next());
            }
        }
    }

    private synchronized boolean maybeAddToExclusives(CountingMemoryCache.Entry<K, V> entry) {
        if (entry.isOrphan || entry.clientCount != 0) {
            return false;
        }
        this.mExclusiveEntries.put(entry.key, entry);
        return true;
    }

    private void maybeClose(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> oldEntries) {
        if (oldEntries != null) {
            Iterator<CountingMemoryCache.Entry<K, V>> it = oldEntries.iterator();
            while (it.hasNext()) {
                CloseableReference.closeSafely((CloseableReference<?>) referenceToClose(it.next()));
            }
        }
    }

    private static <K, V> void maybeNotifyExclusiveEntryInsertion(@Nullable CountingMemoryCache.Entry<K, V> entry) {
        CountingMemoryCache.EntryStateObserver<K> entryStateObserver;
        if (entry == null || (entryStateObserver = entry.observer) == null) {
            return;
        }
        entryStateObserver.onExclusivityChanged(entry.key, true);
    }

    private void maybeNotifyExclusiveEntryRemoval(@Nullable ArrayList<CountingMemoryCache.Entry<K, V>> entries) {
        if (entries != null) {
            Iterator<CountingMemoryCache.Entry<K, V>> it = entries.iterator();
            while (it.hasNext()) {
                maybeNotifyExclusiveEntryRemoval(it.next());
            }
        }
    }

    private synchronized void maybeUpdateCacheParams() {
        if (this.mLastCacheParamsCheck + this.mMemoryCacheParams.paramsCheckIntervalMs > SystemClock.uptimeMillis()) {
            return;
        }
        this.mLastCacheParamsCheck = SystemClock.uptimeMillis();
        this.mMemoryCacheParams = (MemoryCacheParams) Preconditions.checkNotNull(this.mMemoryCacheParamsSupplier.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized CloseableReference<V> newClientReference(final CountingMemoryCache.Entry<K, V> entry) {
        increaseClientCount(entry);
        return CloseableReference.of(entry.valueRef.get(), new ResourceReleaser<V>() { // from class: com.facebook.imagepipeline.cache.LruCountingMemoryCache.2
            @Override // com.facebook.common.references.ResourceReleaser
            public void release(V unused) {
                LruCountingMemoryCache.this.releaseClientReference(entry);
            }
        });
    }

    @Nullable
    private synchronized CloseableReference<V> referenceToClose(CountingMemoryCache.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        return (entry.isOrphan && entry.clientCount == 0) ? entry.valueRef : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseClientReference(final CountingMemoryCache.Entry<K, V> entry) {
        boolean maybeAddToExclusives;
        CloseableReference<V> referenceToClose;
        Preconditions.checkNotNull(entry);
        synchronized (this) {
            decreaseClientCount(entry);
            maybeAddToExclusives = maybeAddToExclusives(entry);
            referenceToClose = referenceToClose(entry);
        }
        CloseableReference.closeSafely((CloseableReference<?>) referenceToClose);
        if (!maybeAddToExclusives) {
            entry = null;
        }
        maybeNotifyExclusiveEntryInsertion(entry);
        maybeUpdateCacheParams();
        maybeEvictEntries();
    }

    @Nullable
    private synchronized ArrayList<CountingMemoryCache.Entry<K, V>> trimExclusivelyOwnedEntries(int count, int size) {
        int max = Math.max(count, 0);
        int max2 = Math.max(size, 0);
        if (this.mExclusiveEntries.getCount() > max || this.mExclusiveEntries.getSizeInBytes() > max2) {
            ArrayList<CountingMemoryCache.Entry<K, V>> arrayList = new ArrayList<>();
            while (true) {
                if (this.mExclusiveEntries.getCount() <= max && this.mExclusiveEntries.getSizeInBytes() <= max2) {
                    break;
                }
                K firstKey = this.mExclusiveEntries.getFirstKey();
                if (firstKey == null) {
                    if (this.mIgnoreSizeMismatch) {
                        this.mExclusiveEntries.resetSize();
                    } else {
                        throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.mExclusiveEntries.getCount()), Integer.valueOf(this.mExclusiveEntries.getSizeInBytes())));
                    }
                } else {
                    this.mExclusiveEntries.remove(firstKey);
                    arrayList.add(this.mCachedEntries.remove(firstKey));
                }
            }
            return arrayList;
        }
        return null;
    }

    private ValueDescriptor<CountingMemoryCache.Entry<K, V>> wrapValueDescriptor(final ValueDescriptor<V> evictableValueDescriptor) {
        return new ValueDescriptor<CountingMemoryCache.Entry<K, V>>() { // from class: com.facebook.imagepipeline.cache.LruCountingMemoryCache.1
            @Override // com.facebook.imagepipeline.cache.ValueDescriptor
            public /* bridge */ /* synthetic */ int getSizeInBytes(Object entry) {
                return getSizeInBytes((CountingMemoryCache.Entry) ((CountingMemoryCache.Entry) entry));
            }

            public int getSizeInBytes(CountingMemoryCache.Entry<K, V> entry) {
                if (LruCountingMemoryCache.this.mStoreEntrySize) {
                    return entry.size;
                }
                return evictableValueDescriptor.getSizeInBytes(entry.valueRef.get());
            }
        };
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> cache(final K key, final CloseableReference<V> valueRef) {
        return cache(key, valueRef, this.mEntryStateObserver);
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public void clear() {
        ArrayList<CountingMemoryCache.Entry<K, V>> clear;
        ArrayList<CountingMemoryCache.Entry<K, V>> clear2;
        synchronized (this) {
            clear = this.mExclusiveEntries.clear();
            clear2 = this.mCachedEntries.clear();
            makeOrphans(clear2);
        }
        maybeClose(clear2);
        maybeNotifyExclusiveEntryRemoval(clear);
        maybeUpdateCacheParams();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized boolean contains(Predicate<K> predicate) {
        return !this.mCachedEntries.getMatchingEntries(predicate).isEmpty();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> get(final K key) {
        CountingMemoryCache.Entry<K, V> remove;
        CloseableReference<V> newClientReference;
        Preconditions.checkNotNull(key);
        synchronized (this) {
            remove = this.mExclusiveEntries.remove(key);
            CountingMemoryCache.Entry<K, V> entry = this.mCachedEntries.get(key);
            newClientReference = entry != null ? newClientReference(entry) : null;
        }
        maybeNotifyExclusiveEntryRemoval(remove);
        maybeUpdateCacheParams();
        maybeEvictEntries();
        return newClientReference;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public CountingLruMap<K, CountingMemoryCache.Entry<K, V>> getCachedEntries() {
        return this.mCachedEntries;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized int getCount() {
        return this.mCachedEntries.getCount();
    }

    @Override // com.facebook.cache.common.HasDebugData
    @Nullable
    public synchronized String getDebugData() {
        return Objects.toStringHelper("CountingMemoryCache").add("cached_entries_count", this.mCachedEntries.getCount()).add("cached_entries_size_bytes", this.mCachedEntries.getSizeInBytes()).add("exclusive_entries_count", this.mExclusiveEntries.getCount()).add("exclusive_entries_size_bytes", this.mExclusiveEntries.getSizeInBytes()).toString();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getEvictionQueueCount() {
        return this.mExclusiveEntries.getCount();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getEvictionQueueSizeInBytes() {
        return this.mExclusiveEntries.getSizeInBytes();
    }

    public synchronized int getInUseCount() {
        return this.mCachedEntries.getCount() - this.mExclusiveEntries.getCount();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public synchronized int getInUseSizeInBytes() {
        return this.mCachedEntries.getSizeInBytes() - this.mExclusiveEntries.getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public MemoryCacheParams getMemoryCacheParams() {
        return this.mMemoryCacheParams;
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public Map<Bitmap, Object> getOtherEntries() {
        return this.mOtherEntries;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized int getSizeInBytes() {
        return this.mCachedEntries.getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public synchronized V inspect(final K key) {
        CountingMemoryCache.Entry<K, V> entry = this.mCachedEntries.get(key);
        if (entry == null) {
            return null;
        }
        return entry.valueRef.get();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    public void maybeEvictEntries() {
        ArrayList<CountingMemoryCache.Entry<K, V>> trimExclusivelyOwnedEntries;
        synchronized (this) {
            MemoryCacheParams memoryCacheParams = this.mMemoryCacheParams;
            int min = Math.min(memoryCacheParams.maxEvictionQueueEntries, memoryCacheParams.maxCacheEntries - getInUseCount());
            MemoryCacheParams memoryCacheParams2 = this.mMemoryCacheParams;
            trimExclusivelyOwnedEntries = trimExclusivelyOwnedEntries(min, Math.min(memoryCacheParams2.maxEvictionQueueSize, memoryCacheParams2.maxCacheSize - getInUseSizeInBytes()));
            makeOrphans(trimExclusivelyOwnedEntries);
        }
        maybeClose(trimExclusivelyOwnedEntries);
        maybeNotifyExclusiveEntryRemoval(trimExclusivelyOwnedEntries);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public void probe(final K key) {
        Preconditions.checkNotNull(key);
        synchronized (this) {
            CountingMemoryCache.Entry<K, V> remove = this.mExclusiveEntries.remove(key);
            if (remove != null) {
                this.mExclusiveEntries.put(key, remove);
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int removeAll(Predicate<K> predicate) {
        ArrayList<CountingMemoryCache.Entry<K, V>> removeAll;
        ArrayList<CountingMemoryCache.Entry<K, V>> removeAll2;
        synchronized (this) {
            removeAll = this.mExclusiveEntries.removeAll(predicate);
            removeAll2 = this.mCachedEntries.removeAll(predicate);
            makeOrphans(removeAll2);
        }
        maybeClose(removeAll2);
        maybeNotifyExclusiveEntryRemoval(removeAll);
        maybeUpdateCacheParams();
        maybeEvictEntries();
        return removeAll2.size();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    @Nullable
    public CloseableReference<V> reuse(K key) {
        CountingMemoryCache.Entry<K, V> remove;
        boolean z;
        CloseableReference<V> closeableReference;
        Preconditions.checkNotNull(key);
        synchronized (this) {
            remove = this.mExclusiveEntries.remove(key);
            z = true;
            if (remove != null) {
                CountingMemoryCache.Entry<K, V> remove2 = this.mCachedEntries.remove(key);
                Preconditions.checkNotNull(remove2);
                Preconditions.checkState(remove2.clientCount == 0);
                closeableReference = remove2.valueRef;
            } else {
                closeableReference = null;
                z = false;
            }
        }
        if (z) {
            maybeNotifyExclusiveEntryRemoval(remove);
        }
        return closeableReference;
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType trimType) {
        ArrayList<CountingMemoryCache.Entry<K, V>> trimExclusivelyOwnedEntries;
        double trimRatio = this.mCacheTrimStrategy.getTrimRatio(trimType);
        synchronized (this) {
            trimExclusivelyOwnedEntries = trimExclusivelyOwnedEntries(Integer.MAX_VALUE, Math.max(0, ((int) (this.mCachedEntries.getSizeInBytes() * (1.0d - trimRatio))) - getInUseSizeInBytes()));
            makeOrphans(trimExclusivelyOwnedEntries);
        }
        maybeClose(trimExclusivelyOwnedEntries);
        maybeNotifyExclusiveEntryRemoval(trimExclusivelyOwnedEntries);
        maybeUpdateCacheParams();
        maybeEvictEntries();
    }

    @Override // com.facebook.imagepipeline.cache.CountingMemoryCache
    @Nullable
    public CloseableReference<V> cache(final K key, final CloseableReference<V> valueRef, @Nullable final CountingMemoryCache.EntryStateObserver<K> observer) {
        CountingMemoryCache.Entry<K, V> remove;
        CloseableReference<V> closeableReference;
        CloseableReference<V> closeableReference2;
        CountingMemoryCache.Entry<K, V> of;
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(valueRef);
        maybeUpdateCacheParams();
        synchronized (this) {
            remove = this.mExclusiveEntries.remove(key);
            CountingMemoryCache.Entry<K, V> remove2 = this.mCachedEntries.remove(key);
            closeableReference = null;
            if (remove2 != null) {
                makeOrphan(remove2);
                closeableReference2 = referenceToClose(remove2);
            } else {
                closeableReference2 = null;
            }
            int sizeInBytes = this.mValueDescriptor.getSizeInBytes(valueRef.get());
            if (canCacheNewValueOfSize(sizeInBytes)) {
                if (this.mStoreEntrySize) {
                    of = CountingMemoryCache.Entry.of(key, valueRef, sizeInBytes, observer);
                } else {
                    of = CountingMemoryCache.Entry.of(key, valueRef, observer);
                }
                this.mCachedEntries.put(key, of);
                closeableReference = newClientReference(of);
            }
        }
        CloseableReference.closeSafely((CloseableReference<?>) closeableReference2);
        maybeNotifyExclusiveEntryRemoval(remove);
        maybeEvictEntries();
        return closeableReference;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public synchronized boolean contains(K key) {
        return this.mCachedEntries.contains(key);
    }

    private static <K, V> void maybeNotifyExclusiveEntryRemoval(@Nullable CountingMemoryCache.Entry<K, V> entry) {
        CountingMemoryCache.EntryStateObserver<K> entryStateObserver;
        if (entry == null || (entryStateObserver = entry.observer) == null) {
            return;
        }
        entryStateObserver.onExclusivityChanged(entry.key, false);
    }
}
