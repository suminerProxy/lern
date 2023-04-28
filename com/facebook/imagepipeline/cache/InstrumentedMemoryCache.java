package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Predicate;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class InstrumentedMemoryCache<K, V> implements MemoryCache<K, V> {
    private final MemoryCache<K, V> mDelegate;
    private final MemoryCacheTracker mTracker;

    public InstrumentedMemoryCache(MemoryCache<K, V> delegate, MemoryCacheTracker tracker) {
        this.mDelegate = delegate;
        this.mTracker = tracker;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> cache(K key, CloseableReference<V> value) {
        this.mTracker.onCachePut(key);
        return this.mDelegate.cache(key, value);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public boolean contains(Predicate<K> predicate) {
        return this.mDelegate.contains((Predicate) predicate);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public CloseableReference<V> get(K key) {
        CloseableReference<V> closeableReference = this.mDelegate.get(key);
        if (closeableReference == null) {
            this.mTracker.onCacheMiss(key);
        } else {
            this.mTracker.onCacheHit(key);
        }
        return closeableReference;
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int getCount() {
        return this.mDelegate.getCount();
    }

    @Override // com.facebook.cache.common.HasDebugData
    @Nullable
    public String getDebugData() {
        return this.mDelegate.getDebugData();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int getSizeInBytes() {
        return this.mDelegate.getSizeInBytes();
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    @Nullable
    public V inspect(K key) {
        return this.mDelegate.inspect(key);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public void probe(K key) {
        this.mDelegate.probe(key);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public int removeAll(Predicate<K> predicate) {
        return this.mDelegate.removeAll(predicate);
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType trimType) {
        this.mDelegate.trim(trimType);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache
    public boolean contains(K key) {
        return this.mDelegate.contains((MemoryCache<K, V>) key);
    }
}
