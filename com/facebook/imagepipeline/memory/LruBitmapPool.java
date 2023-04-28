package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LruBitmapPool implements BitmapPool {
    private int mCurrentSize;
    private int mMaxBitmapSize;
    private final int mMaxPoolSize;
    private final PoolStatsTracker mPoolStatsTracker;
    public final PoolBackend<Bitmap> mStrategy = new BitmapPoolBackend();

    public LruBitmapPool(int maxPoolSize, int maxBitmapSize, PoolStatsTracker poolStatsTracker, @Nullable MemoryTrimmableRegistry memoryTrimmableRegistry) {
        this.mMaxPoolSize = maxPoolSize;
        this.mMaxBitmapSize = maxBitmapSize;
        this.mPoolStatsTracker = poolStatsTracker;
        if (memoryTrimmableRegistry != null) {
            memoryTrimmableRegistry.registerMemoryTrimmable(this);
        }
    }

    @VisibleForTesting
    private Bitmap alloc(int size) {
        this.mPoolStatsTracker.onAlloc(size);
        return Bitmap.createBitmap(1, size, Bitmap.Config.ALPHA_8);
    }

    private synchronized void trimTo(int maxSize) {
        Bitmap pop;
        while (this.mCurrentSize > maxSize && (pop = this.mStrategy.pop()) != null) {
            int size = this.mStrategy.getSize(pop);
            this.mCurrentSize -= size;
            this.mPoolStatsTracker.onFree(size);
        }
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType trimType) {
        trimTo((int) (this.mMaxPoolSize * (1.0d - trimType.getSuggestedTrimRatio())));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.common.memory.Pool
    public synchronized Bitmap get(final int size) {
        int i2 = this.mCurrentSize;
        int i3 = this.mMaxPoolSize;
        if (i2 > i3) {
            trimTo(i3);
        }
        Bitmap bitmap = this.mStrategy.get(size);
        if (bitmap != null) {
            int size2 = this.mStrategy.getSize(bitmap);
            this.mCurrentSize -= size2;
            this.mPoolStatsTracker.onValueReuse(size2);
            return bitmap;
        }
        return alloc(size);
    }

    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public void release(final Bitmap value) {
        int size = this.mStrategy.getSize(value);
        if (size <= this.mMaxBitmapSize) {
            this.mPoolStatsTracker.onValueRelease(size);
            this.mStrategy.put(value);
            synchronized (this) {
                this.mCurrentSize += size;
            }
        }
    }
}
