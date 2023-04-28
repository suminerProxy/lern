package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class StarRating extends Rating {
    public static final Bundleable.Creator<StarRating> CREATOR = null;
    private static final int FIELD_MAX_STARS = 1;
    private static final int FIELD_STAR_RATING = 2;
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    @IntRange(from = 1)
    private final int maxStars;
    private final float starRating;

    public StarRating(@IntRange(from = 1) int maxStars) {
    }

    public static /* synthetic */ StarRating b(Bundle bundle) {
    }

    private static StarRating fromBundle(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @IntRange(from = 1)
    public int getMaxStars() {
    }

    public float getStarRating() {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public StarRating(@IntRange(from = 1) int maxStars, @FloatRange(from = 0.0d) float starRating) {
    }
}
