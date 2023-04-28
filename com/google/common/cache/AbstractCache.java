package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SimpleStatsCounter implements StatsCounter {
        private final LongAddable evictionCount;
        private final LongAddable hitCount;
        private final LongAddable loadExceptionCount;
        private final LongAddable loadSuccessCount;
        private final LongAddable missCount;
        private final LongAddable totalLoadTime;

        public void incrementBy(StatsCounter statsCounter) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i2) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface StatsCounter {
        void recordEviction();

        void recordHits(int i2);

        void recordLoadException(long j2);

        void recordLoadSuccess(long j2);

        void recordMisses(int i2);

        CacheStats snapshot();
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

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
    }
}
