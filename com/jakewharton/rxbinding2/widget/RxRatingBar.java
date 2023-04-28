package com.jakewharton.rxbinding2.widget;

import android.widget.RatingBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import i.a.x0.g;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RxRatingBar {
    private RxRatingBar() {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Boolean> isIndicator(@NonNull RatingBar ratingBar) {
    }

    @NonNull
    @CheckResult
    @Deprecated
    public static g<? super Float> rating(@NonNull RatingBar ratingBar) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<RatingBarChangeEvent> ratingChangeEvents(@NonNull RatingBar ratingBar) {
    }

    @NonNull
    @CheckResult
    public static InitialValueObservable<Float> ratingChanges(@NonNull RatingBar ratingBar) {
    }
}
