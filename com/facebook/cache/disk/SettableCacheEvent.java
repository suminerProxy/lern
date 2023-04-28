package com.facebook.cache.disk;

import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheKey;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.io.IOException;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SettableCacheEvent implements CacheEvent {
    private static final int MAX_RECYCLED = 5;
    private static final Object RECYCLER_LOCK = new Object();
    @Nullable
    private static SettableCacheEvent sFirstRecycledEvent;
    private static int sRecycledCount;
    @Nullable
    private CacheKey mCacheKey;
    private long mCacheLimit;
    private long mCacheSize;
    @Nullable
    private CacheEventListener.EvictionReason mEvictionReason;
    @Nullable
    private IOException mException;
    private long mItemSize;
    @Nullable
    private SettableCacheEvent mNextRecycledEvent;
    @Nullable
    private String mResourceId;

    private SettableCacheEvent() {
    }

    @ReturnsOwnership
    public static SettableCacheEvent obtain() {
        synchronized (RECYCLER_LOCK) {
            SettableCacheEvent settableCacheEvent = sFirstRecycledEvent;
            if (settableCacheEvent != null) {
                sFirstRecycledEvent = settableCacheEvent.mNextRecycledEvent;
                settableCacheEvent.mNextRecycledEvent = null;
                sRecycledCount--;
                return settableCacheEvent;
            }
            return new SettableCacheEvent();
        }
    }

    private void reset() {
        this.mCacheKey = null;
        this.mResourceId = null;
        this.mItemSize = 0L;
        this.mCacheLimit = 0L;
        this.mCacheSize = 0L;
        this.mException = null;
        this.mEvictionReason = null;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public CacheKey getCacheKey() {
        return this.mCacheKey;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public long getCacheLimit() {
        return this.mCacheLimit;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public long getCacheSize() {
        return this.mCacheSize;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public CacheEventListener.EvictionReason getEvictionReason() {
        return this.mEvictionReason;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public IOException getException() {
        return this.mException;
    }

    @Override // com.facebook.cache.common.CacheEvent
    public long getItemSize() {
        return this.mItemSize;
    }

    @Override // com.facebook.cache.common.CacheEvent
    @Nullable
    public String getResourceId() {
        return this.mResourceId;
    }

    public void recycle() {
        synchronized (RECYCLER_LOCK) {
            if (sRecycledCount < 5) {
                reset();
                sRecycledCount++;
                SettableCacheEvent settableCacheEvent = sFirstRecycledEvent;
                if (settableCacheEvent != null) {
                    this.mNextRecycledEvent = settableCacheEvent;
                }
                sFirstRecycledEvent = this;
            }
        }
    }

    public SettableCacheEvent setCacheKey(CacheKey cacheKey) {
        this.mCacheKey = cacheKey;
        return this;
    }

    public SettableCacheEvent setCacheLimit(long cacheLimit) {
        this.mCacheLimit = cacheLimit;
        return this;
    }

    public SettableCacheEvent setCacheSize(long cacheSize) {
        this.mCacheSize = cacheSize;
        return this;
    }

    public SettableCacheEvent setEvictionReason(CacheEventListener.EvictionReason evictionReason) {
        this.mEvictionReason = evictionReason;
        return this;
    }

    public SettableCacheEvent setException(IOException exception) {
        this.mException = exception;
        return this;
    }

    public SettableCacheEvent setItemSize(long itemSize) {
        this.mItemSize = itemSize;
        return this;
    }

    public SettableCacheEvent setResourceId(String resourceId) {
        this.mResourceId = resourceId;
        return this;
    }
}
