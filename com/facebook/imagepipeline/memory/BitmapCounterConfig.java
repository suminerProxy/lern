package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BitmapCounterConfig {
    public static final int DEFAULT_MAX_BITMAP_COUNT = 384;
    private int mMaxBitmapCount;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        private int mMaxBitmapCount;

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public BitmapCounterConfig build() {
        }

        public int getMaxBitmapCount() {
        }

        public Builder setMaxBitmapCount(int maxBitmapCount) {
        }

        private Builder() {
        }
    }

    public BitmapCounterConfig(Builder builder) {
    }

    public static Builder newBuilder() {
    }

    public int getMaxBitmapCount() {
    }

    public void setMaxBitmapCount(int maxBitmapCount) {
    }
}
