package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultFlexByteArrayPoolParams {
    public static final int DEFAULT_MAX_BYTE_ARRAY_SIZE = 4194304;
    public static final int DEFAULT_MAX_NUM_THREADS = Runtime.getRuntime().availableProcessors();
    private static final int DEFAULT_MIN_BYTE_ARRAY_SIZE = 131072;

    private DefaultFlexByteArrayPoolParams() {
    }

    public static SparseIntArray generateBuckets(int min, int max, int numThreads) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (min <= max) {
            sparseIntArray.put(min, numThreads);
            min *= 2;
        }
        return sparseIntArray;
    }

    public static PoolParams get() {
        int i2 = DEFAULT_MAX_NUM_THREADS;
        return new PoolParams(4194304, i2 * 4194304, generateBuckets(131072, 4194304, i2), 131072, 4194304, i2);
    }
}
