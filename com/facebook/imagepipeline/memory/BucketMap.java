package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.ThreadSafe;
import java.util.LinkedList;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BucketMap<T> {
    @Nullable
    @VisibleForTesting
    public LinkedEntry<T> mHead;
    public final SparseArray<LinkedEntry<T>> mMap;
    @Nullable
    @VisibleForTesting
    public LinkedEntry<T> mTail;

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LinkedEntry<I> {
        public int key;
        @Nullable
        public LinkedEntry<I> next;
        @Nullable
        public LinkedEntry<I> prev;
        public LinkedList<I> value;

        public /* synthetic */ LinkedEntry(LinkedEntry linkedEntry, int i2, LinkedList linkedList, LinkedEntry linkedEntry2, AnonymousClass1 anonymousClass1) {
        }

        public String toString() {
        }

        private LinkedEntry(@Nullable LinkedEntry<I> prev, int key, LinkedList<I> value, @Nullable LinkedEntry<I> next) {
        }
    }

    private void maybePrune(LinkedEntry<T> bucket) {
    }

    private void moveToFront(LinkedEntry<T> bucket) {
    }

    private synchronized void prune(LinkedEntry<T> bucket) {
    }

    @Nullable
    public synchronized T acquire(int key) {
    }

    public synchronized void release(int key, T value) {
    }

    @Nullable
    public synchronized T removeFromEnd() {
    }

    @VisibleForTesting
    public synchronized int valueCount() {
    }
}
