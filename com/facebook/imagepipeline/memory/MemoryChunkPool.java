package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class MemoryChunkPool extends BasePool<MemoryChunk> {
    private final int[] mBucketSizes;

    public MemoryChunkPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker memoryChunkPoolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, memoryChunkPoolStatsTracker);
        SparseIntArray sparseIntArray = (SparseIntArray) Preconditions.checkNotNull(poolParams.bucketSizes);
        this.mBucketSizes = new int[sparseIntArray.size()];
        int i2 = 0;
        while (true) {
            int[] iArr = this.mBucketSizes;
            if (i2 < iArr.length) {
                iArr[i2] = sparseIntArray.keyAt(i2);
                i2++;
            } else {
                initialize();
                return;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public abstract MemoryChunk alloc(int bucketedSize);

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getBucketedSize(int requestSize) {
        int[] iArr;
        if (requestSize > 0) {
            for (int i2 : this.mBucketSizes) {
                if (i2 >= requestSize) {
                    return i2;
                }
            }
            return requestSize;
        }
        throw new BasePool.InvalidSizeException(Integer.valueOf(requestSize));
    }

    public int getMinBufferSize() {
        return this.mBucketSizes[0];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getSizeInBytes(int bucketedSize) {
        return bucketedSize;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public void free(MemoryChunk value) {
        Preconditions.checkNotNull(value);
        value.close();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getBucketedSizeForValue(MemoryChunk value) {
        Preconditions.checkNotNull(value);
        return value.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public boolean isReusable(MemoryChunk value) {
        Preconditions.checkNotNull(value);
        return !value.isClosed();
    }
}
