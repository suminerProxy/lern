package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = 0;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
    }

    private void initializeDrawables() {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public /* bridge */ /* synthetic */ CircularProgressIndicatorSpec createSpec(@NonNull Context context, @NonNull AttributeSet attributeSet) {
    }

    public int getIndicatorDirection() {
    }

    @Px
    public int getIndicatorInset() {
    }

    @Px
    public int getIndicatorSize() {
    }

    public void setIndicatorDirection(int i2) {
    }

    public void setIndicatorInset(@Px int i2) {
    }

    public void setIndicatorSize(@Px int i2) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i2) {
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: createSpec  reason: avoid collision after fix types in other method */
    public CircularProgressIndicatorSpec createSpec2(@NonNull Context context, @NonNull AttributeSet attributeSet) {
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
    }
}
