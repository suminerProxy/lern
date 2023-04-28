package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HeartRating extends Rating {
    public static final Bundleable.Creator<HeartRating> CREATOR = null;
    private static final int FIELD_IS_HEART = 2;
    private static final int FIELD_RATED = 1;
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;

    public HeartRating() {
    }

    public static /* synthetic */ HeartRating b(Bundle bundle) {
    }

    private static HeartRating fromBundle(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    public boolean isHeart() {
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    public HeartRating(boolean isHeart) {
    }
}
