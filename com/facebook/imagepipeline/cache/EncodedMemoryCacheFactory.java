package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EncodedMemoryCacheFactory {
    public static InstrumentedMemoryCache<CacheKey, PooledByteBuffer> get(final MemoryCache<CacheKey, PooledByteBuffer> encodedMemoryCache, final ImageCacheStatsTracker imageCacheStatsTracker) {
        imageCacheStatsTracker.registerEncodedMemoryCache(encodedMemoryCache);
        return new InstrumentedMemoryCache<>(encodedMemoryCache, new MemoryCacheTracker<CacheKey>() { // from class: com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory.1
            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCacheHit(CacheKey cacheKey) {
                ImageCacheStatsTracker.this.onMemoryCacheHit(cacheKey);
            }

            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCacheMiss(CacheKey cacheKey) {
                ImageCacheStatsTracker.this.onMemoryCacheMiss(cacheKey);
            }

            @Override // com.facebook.imagepipeline.cache.MemoryCacheTracker
            public void onCachePut(CacheKey cacheKey) {
                ImageCacheStatsTracker.this.onMemoryCachePut(cacheKey);
            }
        });
    }
}
