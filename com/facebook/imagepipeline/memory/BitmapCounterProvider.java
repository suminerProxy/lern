package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.ThreadSafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BitmapCounterProvider {
    private static final long KB = 1024;
    public static final int MAX_BITMAP_TOTAL_SIZE = 0;
    private static final long MB = 1048576;
    private static volatile BitmapCounter sBitmapCounter;
    private static int sMaxBitmapCount;

    @ThreadSafe
    public static BitmapCounter get() {
    }

    private static int getMaxSizeHardCap() {
    }

    public static void initialize(BitmapCounterConfig bitmapCounterConfig) {
    }
}
