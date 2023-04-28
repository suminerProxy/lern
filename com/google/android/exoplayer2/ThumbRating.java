package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ThumbRating extends Rating {
    public static final Bundleable.Creator<ThumbRating> CREATOR = null;
    private static final int FIELD_IS_THUMBS_UP = 2;
    private static final int FIELD_RATED = 1;
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;

    public ThumbRating() {
    }

    public static /* synthetic */ ThumbRating b(Bundle bundle) {
    }

    private static ThumbRating fromBundle(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
    }

    public boolean isThumbsUp() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public ThumbRating(boolean isThumbsUp) {
    }
}
