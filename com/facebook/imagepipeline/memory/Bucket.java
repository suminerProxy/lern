package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@VisibleForTesting
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Bucket<V> {
    private static final String TAG = "BUCKET";
    private final boolean mFixBucketsReinitialization;
    public final Queue mFreeList;
    private int mInUseLength;
    public final int mItemSize;
    public final int mMaxLength;

    public Bucket(int itemSize, int maxLength, int inUseLength, boolean fixBucketsReinitialization) {
        Preconditions.checkState(itemSize > 0);
        Preconditions.checkState(maxLength >= 0);
        Preconditions.checkState(inUseLength >= 0);
        this.mItemSize = itemSize;
        this.mMaxLength = maxLength;
        this.mFreeList = new LinkedList();
        this.mInUseLength = inUseLength;
        this.mFixBucketsReinitialization = fixBucketsReinitialization;
    }

    public void addToFreeList(V value) {
        this.mFreeList.add(value);
    }

    public void decrementInUseCount() {
        Preconditions.checkState(this.mInUseLength > 0);
        this.mInUseLength--;
    }

    @Nullable
    @Deprecated
    public V get() {
        V pop = pop();
        if (pop != null) {
            this.mInUseLength++;
        }
        return pop;
    }

    public int getFreeListSize() {
        return this.mFreeList.size();
    }

    public int getInUseCount() {
        return this.mInUseLength;
    }

    public void incrementInUseCount() {
        this.mInUseLength++;
    }

    public boolean isMaxLengthExceeded() {
        return this.mInUseLength + getFreeListSize() > this.mMaxLength;
    }

    @Nullable
    public V pop() {
        return (V) this.mFreeList.poll();
    }

    public void release(V value) {
        Preconditions.checkNotNull(value);
        if (this.mFixBucketsReinitialization) {
            Preconditions.checkState(this.mInUseLength > 0);
            this.mInUseLength--;
            addToFreeList(value);
            return;
        }
        int i2 = this.mInUseLength;
        if (i2 > 0) {
            this.mInUseLength = i2 - 1;
            addToFreeList(value);
            return;
        }
        FLog.e(TAG, "Tried to release value %s from an empty bucket!", value);
    }
}
