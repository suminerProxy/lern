package com.facebook.imagepipeline.animated.impl;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedFrameCache {
    private final CountingMemoryCache<CacheKey, CloseableImage> mBackingCache;
    private final CacheKey mImageCacheKey;
    @GuardedBy("this")
    private final LinkedHashSet<CacheKey> mFreeItemsPool = new LinkedHashSet<>();
    private final CountingMemoryCache.EntryStateObserver<CacheKey> mEntryStateObserver = new CountingMemoryCache.EntryStateObserver<CacheKey>(this) { // from class: com.facebook.imagepipeline.animated.impl.AnimatedFrameCache.1
        public final /* synthetic */ AnimatedFrameCache this$0;

        @Override // com.facebook.imagepipeline.cache.CountingMemoryCache.EntryStateObserver
        public /* bridge */ /* synthetic */ void onExclusivityChanged(CacheKey key, boolean isExclusive) {
        }

        /* renamed from: onExclusivityChanged  reason: avoid collision after fix types in other method */
        public void onExclusivityChanged2(CacheKey key, boolean isExclusive) {
        }
    };

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FrameKey implements CacheKey {
        private final int mFrameIndex;
        private final CacheKey mImageCacheKey;

        public FrameKey(CacheKey imageCacheKey, int frameIndex) {
        }

        @Override // com.facebook.cache.common.CacheKey
        public boolean containsUri(Uri uri) {
        }

        @Override // com.facebook.cache.common.CacheKey
        public boolean equals(@Nullable Object o2) {
        }

        @Override // com.facebook.cache.common.CacheKey
        @Nullable
        public String getUriString() {
        }

        @Override // com.facebook.cache.common.CacheKey
        public int hashCode() {
        }

        @Override // com.facebook.cache.common.CacheKey
        public boolean isResourceIdForDebugging() {
        }

        @Override // com.facebook.cache.common.CacheKey
        public String toString() {
        }
    }

    public AnimatedFrameCache(CacheKey imageCacheKey, final CountingMemoryCache<CacheKey, CloseableImage> backingCache) {
        this.mImageCacheKey = imageCacheKey;
        this.mBackingCache = backingCache;
    }

    private FrameKey keyFor(int frameIndex) {
        return new FrameKey(this.mImageCacheKey, frameIndex);
    }

    @Nullable
    private synchronized CacheKey popFirstFreeItemKey() {
        CacheKey cacheKey;
        cacheKey = null;
        Iterator<CacheKey> it = this.mFreeItemsPool.iterator();
        if (it.hasNext()) {
            cacheKey = it.next();
            it.remove();
        }
        return cacheKey;
    }

    @Nullable
    public CloseableReference<CloseableImage> cache(int frameIndex, CloseableReference<CloseableImage> imageRef) {
        return this.mBackingCache.cache(keyFor(frameIndex), imageRef, this.mEntryStateObserver);
    }

    public boolean contains(int frameIndex) {
        return this.mBackingCache.contains((CountingMemoryCache<CacheKey, CloseableImage>) keyFor(frameIndex));
    }

    @Nullable
    public CloseableReference<CloseableImage> get(int frameIndex) {
        return this.mBackingCache.get(keyFor(frameIndex));
    }

    @Nullable
    public CloseableReference<CloseableImage> getForReuse() {
        CloseableReference<CloseableImage> reuse;
        do {
            CacheKey popFirstFreeItemKey = popFirstFreeItemKey();
            if (popFirstFreeItemKey == null) {
                return null;
            }
            reuse = this.mBackingCache.reuse(popFirstFreeItemKey);
        } while (reuse == null);
        return reuse;
    }

    public synchronized void onReusabilityChange(CacheKey key, boolean isReusable) {
        if (isReusable) {
            this.mFreeItemsPool.add(key);
        } else {
            this.mFreeItemsPool.remove(key);
        }
    }
}
