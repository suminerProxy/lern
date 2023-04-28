package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NoOpImageCacheStatsTracker implements ImageCacheStatsTracker {
    @Nullable
    private static NoOpImageCacheStatsTracker sInstance;

    private NoOpImageCacheStatsTracker() {
    }

    public static synchronized NoOpImageCacheStatsTracker getInstance() {
        NoOpImageCacheStatsTracker noOpImageCacheStatsTracker;
        synchronized (NoOpImageCacheStatsTracker.class) {
            if (sInstance == null) {
                sInstance = new NoOpImageCacheStatsTracker();
            }
            noOpImageCacheStatsTracker = sInstance;
        }
        return noOpImageCacheStatsTracker;
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCacheHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCacheMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCachePut(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheGetFail(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCachePut(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCacheHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCacheMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCachePut(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onStagingAreaHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onStagingAreaMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void registerBitmapMemoryCache(MemoryCache<?, ?> bitmapMemoryCache) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void registerEncodedMemoryCache(MemoryCache<?, ?> encodedMemoryCache) {
    }
}
