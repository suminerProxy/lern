package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RoundingParams {
    private int mBorderColor;
    private float mBorderWidth;
    @Nullable
    private float[] mCornersRadii;
    private int mOverlayColor;
    private float mPadding;
    private boolean mPaintFilterBitmap;
    private boolean mRoundAsCircle;
    private RoundingMethod mRoundingMethod;
    private boolean mScaleDownInsideBorders;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class RoundingMethod {
        private static final /* synthetic */ RoundingMethod[] $VALUES = null;
        public static final RoundingMethod BITMAP_ONLY = null;
        public static final RoundingMethod OVERLAY_COLOR = null;

        private RoundingMethod(String $enum$name, int $enum$ordinal) {
        }

        public static RoundingMethod valueOf(String name) {
        }

        public static RoundingMethod[] values() {
        }
    }

    public static RoundingParams asCircle() {
    }

    public static RoundingParams fromCornersRadii(float topLeft, float topRight, float bottomRight, float bottomLeft) {
    }

    public static RoundingParams fromCornersRadius(float radius) {
    }

    private float[] getOrCreateRoundedCornersRadii() {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public int getBorderColor() {
    }

    public float getBorderWidth() {
    }

    @Nullable
    public float[] getCornersRadii() {
    }

    public int getOverlayColor() {
    }

    public float getPadding() {
    }

    public boolean getPaintFilterBitmap() {
    }

    public boolean getRoundAsCircle() {
    }

    public RoundingMethod getRoundingMethod() {
    }

    public boolean getScaleDownInsideBorders() {
    }

    public int hashCode() {
    }

    public RoundingParams setBorder(@ColorInt int color, float width) {
    }

    public RoundingParams setBorderColor(@ColorInt int color) {
    }

    public RoundingParams setBorderWidth(float width) {
    }

    public RoundingParams setCornersRadii(float topLeft, float topRight, float bottomRight, float bottomLeft) {
    }

    public RoundingParams setCornersRadius(float radius) {
    }

    public RoundingParams setOverlayColor(@ColorInt int overlayColor) {
    }

    public RoundingParams setPadding(float padding) {
    }

    public RoundingParams setPaintFilterBitmap(boolean paintFilterBitmap) {
    }

    public RoundingParams setRoundAsCircle(boolean roundAsCircle) {
    }

    public RoundingParams setRoundingMethod(RoundingMethod roundingMethod) {
    }

    public RoundingParams setScaleDownInsideBorders(boolean scaleDownInsideBorders) {
    }

    public static RoundingParams fromCornersRadii(float[] radii) {
    }

    public RoundingParams setCornersRadii(float[] radii) {
    }
}
