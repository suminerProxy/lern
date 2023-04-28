package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    @NonNull
    public int[] indicatorColors;
    public int showAnimationBehavior;
    @ColorInt
    public int trackColor;
    @Px
    public int trackCornerRadius;
    @Px
    public int trackThickness;

    public BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    private void loadIndicatorColors(@NonNull Context context, @NonNull TypedArray typedArray) {
    }

    private void loadTrackColor(@NonNull Context context, @NonNull TypedArray typedArray) {
    }

    public boolean isHideAnimationEnabled() {
    }

    public boolean isShowAnimationEnabled() {
    }

    public abstract void validateSpec();
}
