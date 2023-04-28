package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FlexByteArrayPool {
    @VisibleForTesting
    public final SoftRefByteArrayPool mDelegatePool;
    private final ResourceReleaser<byte[]> mResourceReleaser;

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SoftRefByteArrayPool extends GenericByteArrayPool {
        public SoftRefByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        }

        @Override // com.facebook.imagepipeline.memory.BasePool
        public Bucket<byte[]> newBucket(int bucketedSize) {
        }
    }

    public FlexByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams params) {
        Preconditions.checkArgument(Boolean.valueOf(params.maxNumThreads > 0));
        this.mDelegatePool = new SoftRefByteArrayPool(memoryTrimmableRegistry, params, NoOpPoolStatsTracker.getInstance());
        this.mResourceReleaser = new ResourceReleaser<byte[]>(this) { // from class: com.facebook.imagepipeline.memory.FlexByteArrayPool.1
            public final /* synthetic */ FlexByteArrayPool this$0;

            @Override // com.facebook.common.references.ResourceReleaser
            public /* bridge */ /* synthetic */ void release(byte[] unused) {
            }

            /* renamed from: release  reason: avoid collision after fix types in other method */
            public void release2(byte[] unused) {
            }
        };
    }

    public CloseableReference<byte[]> get(int size) {
        return CloseableReference.of(this.mDelegatePool.get(size), this.mResourceReleaser);
    }

    public int getMinBufferSize() {
        return this.mDelegatePool.getMinBufferSize();
    }

    public Map<String, Integer> getStats() {
        return this.mDelegatePool.getStats();
    }

    public void release(byte[] value) {
        this.mDelegatePool.release(value);
    }
}
