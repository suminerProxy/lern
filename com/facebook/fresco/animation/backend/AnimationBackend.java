package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AnimationBackend extends AnimationInformation {
    public static final int INTRINSIC_DIMENSION_UNSET = -1;

    void clear();

    boolean drawFrame(Drawable parent, Canvas canvas, int frameNumber);

    int getIntrinsicHeight();

    int getIntrinsicWidth();

    int getSizeInBytes();

    void setAlpha(@IntRange(from = 0, to = 255) int alpha);

    void setBounds(Rect bounds);

    void setColorFilter(@Nullable ColorFilter colorFilter);
}
