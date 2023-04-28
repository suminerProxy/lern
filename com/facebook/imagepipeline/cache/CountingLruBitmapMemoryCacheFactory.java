package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CountingLruBitmapMemoryCacheFactory implements BitmapMemoryCacheFactory {
    @Override // com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory
    public CountingMemoryCache<CacheKey, CloseableImage> create(Supplier<MemoryCacheParams> bitmapMemoryCacheParamsSupplier, MemoryTrimmableRegistry memoryTrimmableRegistry, MemoryCache.CacheTrimStrategy trimStrategy, boolean storeEntrySize, boolean ignoreSizeMismatch, @Nullable CountingMemoryCache.EntryStateObserver<CacheKey> observer) {
        LruCountingMemoryCache lruCountingMemoryCache = new LruCountingMemoryCache(new ValueDescriptor<CloseableImage>() { // from class: com.facebook.imagepipeline.cache.CountingLruBitmapMemoryCacheFactory.1
            @Override // com.facebook.imagepipeline.cache.ValueDescriptor
            public int getSizeInBytes(CloseableImage value) {
                return value.getSizeInBytes();
            }
        }, trimStrategy, bitmapMemoryCacheParamsSupplier, observer, storeEntrySize, ignoreSizeMismatch);
        memoryTrimmableRegistry.registerMemoryTrimmable(lruCountingMemoryCache);
        return lruCountingMemoryCache;
    }
}
