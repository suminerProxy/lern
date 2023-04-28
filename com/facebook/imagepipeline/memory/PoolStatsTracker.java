package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface PoolStatsTracker {
    public static final String BUCKETS_USED_PREFIX = "buckets_used_";
    public static final String FREE_BYTES = "free_bytes";
    public static final String FREE_COUNT = "free_count";
    public static final String HARD_CAP = "hard_cap";
    public static final String SOFT_CAP = "soft_cap";
    public static final String USED_BYTES = "used_bytes";
    public static final String USED_COUNT = "used_count";

    void onAlloc(int size);

    void onFree(int sizeInBytes);

    void onHardCapReached();

    void onSoftCapReached();

    void onValueRelease(int sizeInBytes);

    void onValueReuse(int bucketedSize);

    void setBasePool(BasePool basePool);
}
