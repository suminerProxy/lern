package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PercentageRating extends Rating {
    public static final Bundleable.Creator<PercentageRating> CREATOR = null;
    private static final int FIELD_PERCENT = 1;
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating() {
    }

    public static /* synthetic */ PercentageRating b(Bundle bundle) {
    }

    private static PercentageRating fromBundle(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public float getPercent() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public PercentageRating(@FloatRange(from = 0.0d, to = 100.0d) float percent) {
    }
}
