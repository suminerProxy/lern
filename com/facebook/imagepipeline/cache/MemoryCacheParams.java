package com.facebook.imagepipeline.cache;

import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.TimeUnit;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MemoryCacheParams {
    public final int maxCacheEntries;
    public final int maxCacheEntrySize;
    public final int maxCacheSize;
    public final int maxEvictionQueueEntries;
    public final int maxEvictionQueueSize;
    public final long paramsCheckIntervalMs;

    public MemoryCacheParams(int maxCacheSize, int maxCacheEntries, int maxEvictionQueueSize, int maxEvictionQueueEntries, int maxCacheEntrySize) {
        this(maxCacheSize, maxCacheEntries, maxEvictionQueueSize, maxEvictionQueueEntries, maxCacheEntrySize, TimeUnit.MINUTES.toMillis(5L));
    }

    public MemoryCacheParams(int maxCacheSize, int maxCacheEntries, int maxEvictionQueueSize, int maxEvictionQueueEntries, int maxCacheEntrySize, long paramsCheckIntervalMs) {
        this.maxCacheSize = maxCacheSize;
        this.maxCacheEntries = maxCacheEntries;
        this.maxEvictionQueueSize = maxEvictionQueueSize;
        this.maxEvictionQueueEntries = maxEvictionQueueEntries;
        this.maxCacheEntrySize = maxCacheEntrySize;
        this.paramsCheckIntervalMs = paramsCheckIntervalMs;
    }
}
