package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowDrawableWrapper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public RelativeCornerSize(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getRelativePercent() {
    }

    public int hashCode() {
    }
}
