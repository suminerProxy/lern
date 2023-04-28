package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WrappingUtils {
    private static final String TAG = "WrappingUtils";
    private static final Drawable sEmptyDrawable = null;

    private static Drawable applyLeafRounding(Drawable drawable, RoundingParams roundingParams, Resources resources) {
    }

    public static void applyRoundingParams(Rounded rounded, RoundingParams roundingParams) {
    }

    public static DrawableParent findDrawableParentForLeaf(DrawableParent parent) {
    }

    public static Drawable maybeApplyLeafRounding(@Nullable Drawable drawable, @Nullable RoundingParams roundingParams, Resources resources) {
    }

    @Nullable
    public static Drawable maybeWrapWithMatrix(@Nullable Drawable drawable, @Nullable Matrix matrix) {
    }

    public static Drawable maybeWrapWithRoundedOverlayColor(@Nullable Drawable drawable, @Nullable RoundingParams roundingParams) {
    }

    @Nullable
    public static Drawable maybeWrapWithScaleType(@Nullable Drawable drawable, @Nullable ScalingUtils.ScaleType scaleType) {
    }

    public static void resetRoundingParams(Rounded rounded) {
    }

    public static void updateLeafRounding(DrawableParent parent, @Nullable RoundingParams roundingParams, Resources resources) {
    }

    public static void updateOverlayColorRounding(DrawableParent parent, @Nullable RoundingParams roundingParams) {
    }

    public static ScaleTypeDrawable wrapChildWithScaleType(DrawableParent parent, ScalingUtils.ScaleType scaleType) {
    }

    @Nullable
    public static Drawable maybeWrapWithScaleType(@Nullable Drawable drawable, @Nullable ScalingUtils.ScaleType scaleType, @Nullable PointF focusPoint) {
    }
}
