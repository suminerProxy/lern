package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Sets;
import com.facebook.common.internal.Throwables;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.Pool;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BasePool<V> implements Pool<V> {
    private final Class<?> TAG;
    private boolean mAllowNewBuckets;
    @VisibleForTesting
    public final SparseArray<Bucket<V>> mBuckets;
    @GuardedBy("this")
    @VisibleForTesting
    public final Counter mFree;
    private boolean mIgnoreHardCap;
    @VisibleForTesting
    public final Set<V> mInUseValues;
    public final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
    public final PoolParams mPoolParams;
    private final PoolStatsTracker mPoolStatsTracker;
    @GuardedBy("this")
    @VisibleForTesting
    public final Counter mUsed;

    @NotThreadSafe
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Counter {
        private static final String TAG = "com.facebook.imagepipeline.memory.BasePool.Counter";
        public int mCount;
        public int mNumBytes;

        public void decrement(int numBytes) {
            int i2;
            int i3 = this.mNumBytes;
            if (i3 >= numBytes && (i2 = this.mCount) > 0) {
                this.mCount = i2 - 1;
                this.mNumBytes = i3 - numBytes;
                return;
            }
            FLog.wtf(TAG, "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(numBytes), Integer.valueOf(this.mNumBytes), Integer.valueOf(this.mCount));
        }

        public void increment(int numBytes) {
            this.mCount++;
            this.mNumBytes += numBytes;
        }

        public void reset() {
            this.mCount = 0;
            this.mNumBytes = 0;
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object size) {
            super("Invalid size: " + size.toString());
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InvalidValueException extends RuntimeException {
        public InvalidValueException(Object value) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int hardCap, int usedBytes, int freeBytes, int allocSize) {
            super("Pool hard cap violation? Hard cap = " + hardCap + " Used size = " + usedBytes + " Free size = " + freeBytes + " Request size = " + allocSize);
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SizeTooLargeException extends InvalidSizeException {
        public SizeTooLargeException(Object size) {
        }
    }

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        this.TAG = getClass();
        this.mMemoryTrimmableRegistry = (MemoryTrimmableRegistry) Preconditions.checkNotNull(memoryTrimmableRegistry);
        PoolParams poolParams2 = (PoolParams) Preconditions.checkNotNull(poolParams);
        this.mPoolParams = poolParams2;
        this.mPoolStatsTracker = (PoolStatsTracker) Preconditions.checkNotNull(poolStatsTracker);
        this.mBuckets = new SparseArray<>();
        if (poolParams2.fixBucketsReinitialization) {
            initBuckets();
        } else {
            legacyInitBuckets(new SparseIntArray(0));
        }
        this.mInUseValues = Sets.newIdentityHashSet();
        this.mFree = new Counter();
        this.mUsed = new Counter();
    }

    private synchronized void ensurePoolSizeInvariant() {
        boolean z;
        if (isMaxSizeSoftCapExceeded() && this.mFree.mNumBytes != 0) {
            z = false;
            Preconditions.checkState(z);
        }
        z = true;
        Preconditions.checkState(z);
    }

    private void fillBuckets(SparseIntArray bucketSizes) {
        this.mBuckets.clear();
        for (int i2 = 0; i2 < bucketSizes.size(); i2++) {
            int keyAt = bucketSizes.keyAt(i2);
            this.mBuckets.put(keyAt, new Bucket<>(getSizeInBytes(keyAt), bucketSizes.valueAt(i2), 0, this.mPoolParams.fixBucketsReinitialization));
        }
    }

    @Nullable
    private synchronized Bucket<V> getBucketIfPresent(int bucketedSize) {
        return this.mBuckets.get(bucketedSize);
    }

    private synchronized void initBuckets() {
        SparseIntArray sparseIntArray = this.mPoolParams.bucketSizes;
        if (sparseIntArray != null) {
            fillBuckets(sparseIntArray);
            this.mAllowNewBuckets = false;
        } else {
            this.mAllowNewBuckets = true;
        }
    }

    private synchronized void legacyInitBuckets(SparseIntArray inUseCounts) {
        Preconditions.checkNotNull(inUseCounts);
        this.mBuckets.clear();
        SparseIntArray sparseIntArray = this.mPoolParams.bucketSizes;
        if (sparseIntArray != null) {
            for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
                int keyAt = sparseIntArray.keyAt(i2);
                this.mBuckets.put(keyAt, new Bucket<>(getSizeInBytes(keyAt), sparseIntArray.valueAt(i2), inUseCounts.get(keyAt, 0), this.mPoolParams.fixBucketsReinitialization));
            }
            this.mAllowNewBuckets = false;
        } else {
            this.mAllowNewBuckets = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void logStats() {
        if (FLog.isLoggable(2)) {
            FLog.v(this.TAG, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.mUsed.mCount), Integer.valueOf(this.mUsed.mNumBytes), Integer.valueOf(this.mFree.mCount), Integer.valueOf(this.mFree.mNumBytes));
        }
    }

    private List<Bucket<V>> refillBuckets() {
        ArrayList arrayList = new ArrayList(this.mBuckets.size());
        int size = this.mBuckets.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i2));
            int i3 = bucket.mItemSize;
            int i4 = bucket.mMaxLength;
            int inUseCount = bucket.getInUseCount();
            if (bucket.getFreeListSize() > 0) {
                arrayList.add(bucket);
            }
            this.mBuckets.setValueAt(i2, new Bucket<>(getSizeInBytes(i3), i4, inUseCount, this.mPoolParams.fixBucketsReinitialization));
        }
        return arrayList;
    }

    public abstract V alloc(int bucketedSize);

    @VisibleForTesting
    public synchronized boolean canAllocate(int sizeInBytes) {
        if (this.mIgnoreHardCap) {
            return true;
        }
        PoolParams poolParams = this.mPoolParams;
        int i2 = poolParams.maxSizeHardCap;
        int i3 = this.mUsed.mNumBytes;
        if (sizeInBytes > i2 - i3) {
            this.mPoolStatsTracker.onHardCapReached();
            return false;
        }
        int i4 = poolParams.maxSizeSoftCap;
        if (sizeInBytes > i4 - (i3 + this.mFree.mNumBytes)) {
            trimToSize(i4 - sizeInBytes);
        }
        if (sizeInBytes > i2 - (this.mUsed.mNumBytes + this.mFree.mNumBytes)) {
            this.mPoolStatsTracker.onHardCapReached();
            return false;
        }
        return true;
    }

    @VisibleForTesting
    public abstract void free(V value);

    @Override // com.facebook.common.memory.Pool
    public V get(int size) {
        V value;
        ensurePoolSizeInvariant();
        int bucketedSize = getBucketedSize(size);
        synchronized (this) {
            Bucket<V> bucket = getBucket(bucketedSize);
            if (bucket != null && (value = getValue(bucket)) != null) {
                Preconditions.checkState(this.mInUseValues.add(value));
                int bucketedSizeForValue = getBucketedSizeForValue(value);
                int sizeInBytes = getSizeInBytes(bucketedSizeForValue);
                this.mUsed.increment(sizeInBytes);
                this.mFree.decrement(sizeInBytes);
                this.mPoolStatsTracker.onValueReuse(sizeInBytes);
                logStats();
                if (FLog.isLoggable(2)) {
                    FLog.v(this.TAG, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(value)), Integer.valueOf(bucketedSizeForValue));
                }
                return value;
            }
            int sizeInBytes2 = getSizeInBytes(bucketedSize);
            if (canAllocate(sizeInBytes2)) {
                this.mUsed.increment(sizeInBytes2);
                if (bucket != null) {
                    bucket.incrementInUseCount();
                }
                V v = null;
                try {
                    v = alloc(bucketedSize);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.mUsed.decrement(sizeInBytes2);
                        Bucket<V> bucket2 = getBucket(bucketedSize);
                        if (bucket2 != null) {
                            bucket2.decrementInUseCount();
                        }
                        Throwables.propagateIfPossible(th);
                    }
                }
                synchronized (this) {
                    Preconditions.checkState(this.mInUseValues.add(v));
                    trimToSoftCap();
                    this.mPoolStatsTracker.onAlloc(sizeInBytes2);
                    logStats();
                    if (FLog.isLoggable(2)) {
                        FLog.v(this.TAG, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(bucketedSize));
                    }
                }
                return v;
            }
            throw new PoolSizeViolationException(this.mPoolParams.maxSizeHardCap, this.mUsed.mNumBytes, this.mFree.mNumBytes, sizeInBytes2);
        }
    }

    @Nullable
    @VisibleForTesting
    public synchronized Bucket<V> getBucket(int bucketedSize) {
        Bucket<V> bucket = this.mBuckets.get(bucketedSize);
        if (bucket == null && this.mAllowNewBuckets) {
            if (FLog.isLoggable(2)) {
                FLog.v(this.TAG, "creating new bucket %s", Integer.valueOf(bucketedSize));
            }
            Bucket<V> newBucket = newBucket(bucketedSize);
            this.mBuckets.put(bucketedSize, newBucket);
            return newBucket;
        }
        return bucket;
    }

    public abstract int getBucketedSize(int requestSize);

    public abstract int getBucketedSizeForValue(V value);

    public abstract int getSizeInBytes(int bucketedSize);

    public synchronized Map<String, Integer> getStats() {
        HashMap hashMap;
        hashMap = new HashMap();
        for (int i2 = 0; i2 < this.mBuckets.size(); i2++) {
            int keyAt = this.mBuckets.keyAt(i2);
            hashMap.put(PoolStatsTracker.BUCKETS_USED_PREFIX + getSizeInBytes(keyAt), Integer.valueOf(((Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i2))).getInUseCount()));
        }
        hashMap.put(PoolStatsTracker.SOFT_CAP, Integer.valueOf(this.mPoolParams.maxSizeSoftCap));
        hashMap.put(PoolStatsTracker.HARD_CAP, Integer.valueOf(this.mPoolParams.maxSizeHardCap));
        hashMap.put(PoolStatsTracker.USED_COUNT, Integer.valueOf(this.mUsed.mCount));
        hashMap.put(PoolStatsTracker.USED_BYTES, Integer.valueOf(this.mUsed.mNumBytes));
        hashMap.put(PoolStatsTracker.FREE_COUNT, Integer.valueOf(this.mFree.mCount));
        hashMap.put(PoolStatsTracker.FREE_BYTES, Integer.valueOf(this.mFree.mNumBytes));
        return hashMap;
    }

    @Nullable
    public synchronized V getValue(Bucket<V> bucket) {
        return bucket.get();
    }

    public void initialize() {
        this.mMemoryTrimmableRegistry.registerMemoryTrimmable(this);
        this.mPoolStatsTracker.setBasePool(this);
    }

    @VisibleForTesting
    public synchronized boolean isMaxSizeSoftCapExceeded() {
        boolean z;
        z = this.mUsed.mNumBytes + this.mFree.mNumBytes > this.mPoolParams.maxSizeSoftCap;
        if (z) {
            this.mPoolStatsTracker.onSoftCapReached();
        }
        return z;
    }

    public boolean isReusable(V value) {
        Preconditions.checkNotNull(value);
        return true;
    }

    public Bucket<V> newBucket(int bucketedSize) {
        return new Bucket<>(getSizeInBytes(bucketedSize), Integer.MAX_VALUE, 0, this.mPoolParams.fixBucketsReinitialization);
    }

    public void onParamsChanged() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.decrementInUseCount();
     */
    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void release(V r8) {
        /*
            r7 = this;
            com.facebook.common.internal.Preconditions.checkNotNull(r8)
            int r0 = r7.getBucketedSizeForValue(r8)
            int r1 = r7.getSizeInBytes(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.Bucket r2 = r7.getBucketIfPresent(r0)     // Catch: java.lang.Throwable -> Lae
            java.util.Set<V> r3 = r7.mInUseValues     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.TAG     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lae
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.logging.FLog.e(r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            r7.free(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.PoolStatsTracker r8 = r7.mPoolStatsTracker     // Catch: java.lang.Throwable -> Lae
            r8.onFree(r1)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.isMaxLengthExceeded()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.isMaxSizeSoftCapExceeded()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.isReusable(r8)     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.release(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$Counter r2 = r7.mFree     // Catch: java.lang.Throwable -> Lae
            r2.increment(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$Counter r2 = r7.mUsed     // Catch: java.lang.Throwable -> Lae
            r2.decrement(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.PoolStatsTracker r2 = r7.mPoolStatsTracker     // Catch: java.lang.Throwable -> Lae
            r2.onValueRelease(r1)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = com.facebook.common.logging.FLog.isLoggable(r4)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La9
            java.lang.Class<?> r1 = r7.TAG     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.logging.FLog.v(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L7e:
            if (r2 == 0) goto L83
            r2.decrementInUseCount()     // Catch: java.lang.Throwable -> Lae
        L83:
            boolean r2 = com.facebook.common.logging.FLog.isLoggable(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.TAG     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            com.facebook.common.logging.FLog.v(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lae
        L9c:
            r7.free(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.BasePool$Counter r8 = r7.mUsed     // Catch: java.lang.Throwable -> Lae
            r8.decrement(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.PoolStatsTracker r8 = r7.mPoolStatsTracker     // Catch: java.lang.Throwable -> Lae
            r8.onFree(r1)     // Catch: java.lang.Throwable -> Lae
        La9:
            r7.logStats()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.release(java.lang.Object):void");
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType memoryTrimType) {
        trimToNothing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public void trimToNothing() {
        int i2;
        List arrayList;
        synchronized (this) {
            if (this.mPoolParams.fixBucketsReinitialization) {
                arrayList = refillBuckets();
            } else {
                arrayList = new ArrayList(this.mBuckets.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i3 = 0; i3 < this.mBuckets.size(); i3++) {
                    Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i3));
                    if (bucket.getFreeListSize() > 0) {
                        arrayList.add(bucket);
                    }
                    sparseIntArray.put(this.mBuckets.keyAt(i3), bucket.getInUseCount());
                }
                legacyInitBuckets(sparseIntArray);
            }
            this.mFree.reset();
            logStats();
        }
        onParamsChanged();
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            Bucket bucket2 = (Bucket) arrayList.get(i2);
            while (true) {
                Object pop = bucket2.pop();
                if (pop == null) {
                    break;
                }
                free(pop);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public synchronized void trimToSize(int targetSize) {
        int i2 = this.mUsed.mNumBytes;
        int i3 = this.mFree.mNumBytes;
        int min = Math.min((i2 + i3) - targetSize, i3);
        if (min <= 0) {
            return;
        }
        if (FLog.isLoggable(2)) {
            FLog.v(this.TAG, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(targetSize), Integer.valueOf(this.mUsed.mNumBytes + this.mFree.mNumBytes), Integer.valueOf(min));
        }
        logStats();
        for (int i4 = 0; i4 < this.mBuckets.size() && min > 0; i4++) {
            Bucket bucket = (Bucket) Preconditions.checkNotNull(this.mBuckets.valueAt(i4));
            while (min > 0) {
                Object pop = bucket.pop();
                if (pop == null) {
                    break;
                }
                free(pop);
                int i5 = bucket.mItemSize;
                min -= i5;
                this.mFree.decrement(i5);
            }
        }
        logStats();
        if (FLog.isLoggable(2)) {
            FLog.v(this.TAG, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(targetSize), Integer.valueOf(this.mUsed.mNumBytes + this.mFree.mNumBytes));
        }
    }

    @VisibleForTesting
    public synchronized void trimToSoftCap() {
        if (isMaxSizeSoftCapExceeded()) {
            trimToSize(this.mPoolParams.maxSizeSoftCap);
        }
    }

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker, boolean ignoreHardCap) {
        this(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        this.mIgnoreHardCap = ignoreHardCap;
    }
}
