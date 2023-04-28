package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.OOMSoftReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.Semaphore;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SharedByteArray implements MemoryTrimmable {
    @VisibleForTesting
    public final OOMSoftReference<byte[]> mByteArraySoftRef;
    @VisibleForTesting
    public final int mMaxByteArraySize;
    @VisibleForTesting
    public final int mMinByteArraySize;
    private final ResourceReleaser<byte[]> mResourceReleaser;
    @VisibleForTesting
    public final Semaphore mSemaphore;

    public SharedByteArray(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams params) {
        Preconditions.checkNotNull(memoryTrimmableRegistry);
        Preconditions.checkArgument(Boolean.valueOf(params.minBucketSize > 0));
        Preconditions.checkArgument(Boolean.valueOf(params.maxBucketSize >= params.minBucketSize));
        this.mMaxByteArraySize = params.maxBucketSize;
        this.mMinByteArraySize = params.minBucketSize;
        this.mByteArraySoftRef = new OOMSoftReference<>();
        this.mSemaphore = new Semaphore(1);
        this.mResourceReleaser = new ResourceReleaser<byte[]>(this) { // from class: com.facebook.imagepipeline.memory.SharedByteArray.1
            public final /* synthetic */ SharedByteArray this$0;

            @Override // com.facebook.common.references.ResourceReleaser
            public /* bridge */ /* synthetic */ void release(byte[] unused) {
            }

            /* renamed from: release  reason: avoid collision after fix types in other method */
            public void release2(byte[] unused) {
            }
        };
        memoryTrimmableRegistry.registerMemoryTrimmable(this);
    }

    private synchronized byte[] allocateByteArray(int size) {
        byte[] bArr;
        this.mByteArraySoftRef.clear();
        bArr = new byte[size];
        this.mByteArraySoftRef.set(bArr);
        return bArr;
    }

    private byte[] getByteArray(int requestedSize) {
        int bucketedSize = getBucketedSize(requestedSize);
        byte[] bArr = this.mByteArraySoftRef.get();
        return (bArr == null || bArr.length < bucketedSize) ? allocateByteArray(bucketedSize) : bArr;
    }

    public CloseableReference<byte[]> get(int size) {
        Preconditions.checkArgument(size > 0, "Size must be greater than zero");
        Preconditions.checkArgument(size <= this.mMaxByteArraySize, "Requested size is too big");
        this.mSemaphore.acquireUninterruptibly();
        try {
            return CloseableReference.of(getByteArray(size), this.mResourceReleaser);
        } catch (Throwable th) {
            this.mSemaphore.release();
            throw Throwables.propagate(th);
        }
    }

    @VisibleForTesting
    public int getBucketedSize(int size) {
        return Integer.highestOneBit(Math.max(size, this.mMinByteArraySize) - 1) * 2;
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType trimType) {
        if (this.mSemaphore.tryAcquire()) {
            try {
                this.mByteArraySoftRef.clear();
            } finally {
                this.mSemaphore.release();
            }
        }
    }
}
