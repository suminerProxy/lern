package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ImageCacheStatsTracker {
    void onBitmapCacheHit(CacheKey cacheKey);

    void onBitmapCacheMiss(CacheKey cacheKey);

    void onBitmapCachePut(CacheKey cacheKey);

    void onDiskCacheGetFail(CacheKey cacheKey);

    void onDiskCacheHit(CacheKey cacheKey);

    void onDiskCacheMiss(CacheKey cacheKey);

    void onDiskCachePut(CacheKey cacheKey);

    void onMemoryCacheHit(CacheKey cacheKey);

    void onMemoryCacheMiss(CacheKey cacheKey);

    void onMemoryCachePut(CacheKey cacheKey);

    void onStagingAreaHit(CacheKey cacheKey);

    void onStagingAreaMiss(CacheKey cacheKey);

    void registerBitmapMemoryCache(MemoryCache<?, ?> bitmapMemoryCache);

    void registerEncodedMemoryCache(MemoryCache<?, ?> encodedMemoryCache);
}
