package com.jakewharton.rxbinding2.widget;

import android.widget.RatingBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class RatingBarChangeEvent {
    @NonNull
    @CheckResult
    public static RatingBarChangeEvent create(@NonNull RatingBar ratingBar, float f2, boolean z) {
    }

    public abstract boolean fromUser();

    public abstract float rating();

    @NonNull
    public abstract RatingBar view();
}
