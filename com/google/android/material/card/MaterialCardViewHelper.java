package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final int[] CHECKED_STATE_SET = null;
    private static final double COS_45 = 0.0d;
    private static final int DEFAULT_STROKE_VALUE = -1;
    @NonNull
    private final MaterialShapeDrawable bgDrawable;
    private boolean checkable;
    @Nullable
    private Drawable checkedIcon;
    @Dimension
    private int checkedIconMargin;
    @Dimension
    private int checkedIconSize;
    @Nullable
    private ColorStateList checkedIconTint;
    @Nullable
    private LayerDrawable clickableForegroundDrawable;
    @Nullable
    private MaterialShapeDrawable compatRippleDrawable;
    @Nullable
    private Drawable fgDrawable;
    @NonNull
    private final MaterialShapeDrawable foregroundContentDrawable;
    @Nullable
    private MaterialShapeDrawable foregroundShapeDrawable;
    private boolean isBackgroundOverwritten;
    @NonNull
    private final MaterialCardView materialCardView;
    @Nullable
    private ColorStateList rippleColor;
    @Nullable
    private Drawable rippleDrawable;
    @Nullable
    private ShapeAppearanceModel shapeAppearanceModel;
    @Nullable
    private ColorStateList strokeColor;
    @Dimension
    private int strokeWidth;
    @NonNull
    private final Rect userContentPadding;

    /* renamed from: com.google.android.material.card.MaterialCardViewHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends InsetDrawable {
        public final /* synthetic */ MaterialCardViewHelper this$0;

        public AnonymousClass1(MaterialCardViewHelper materialCardViewHelper, Drawable drawable, int i2, int i3, int i4, int i5) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
        }
    }

    public MaterialCardViewHelper(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i2, @StyleRes int i3) {
    }

    private float calculateActualCornerPadding() {
    }

    private float calculateCornerPaddingForCornerTreatment(CornerTreatment cornerTreatment, float f2) {
    }

    private float calculateHorizontalBackgroundPadding() {
    }

    private float calculateVerticalBackgroundPadding() {
    }

    private boolean canClipToOutline() {
    }

    @NonNull
    private Drawable createCheckedIconLayer() {
    }

    @NonNull
    private Drawable createCompatRippleDrawable() {
    }

    @NonNull
    private Drawable createForegroundRippleDrawable() {
    }

    @NonNull
    private MaterialShapeDrawable createForegroundShapeDrawable() {
    }

    @NonNull
    private Drawable getClickableForeground() {
    }

    private float getParentCardViewCalculatedCornerPadding() {
    }

    @NonNull
    private Drawable insetDrawable(Drawable drawable) {
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
    }

    private void updateInsetForeground(Drawable drawable) {
    }

    private void updateRippleColor() {
    }

    @RequiresApi(api = 23)
    public void forceRippleRedraw() {
    }

    @NonNull
    public MaterialShapeDrawable getBackground() {
    }

    public ColorStateList getCardBackgroundColor() {
    }

    public ColorStateList getCardForegroundColor() {
    }

    @Nullable
    public Drawable getCheckedIcon() {
    }

    @Dimension
    public int getCheckedIconMargin() {
    }

    @Dimension
    public int getCheckedIconSize() {
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
    }

    public float getCornerRadius() {
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
    }

    @Nullable
    public ColorStateList getRippleColor() {
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @ColorInt
    public int getStrokeColor() {
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
    }

    @Dimension
    public int getStrokeWidth() {
    }

    @NonNull
    public Rect getUserContentPadding() {
    }

    public boolean isBackgroundOverwritten() {
    }

    public boolean isCheckable() {
    }

    public void loadFromAttributes(@NonNull TypedArray typedArray) {
    }

    public void onMeasure(int i2, int i3) {
    }

    public void setBackgroundOverwritten(boolean z) {
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
    }

    public void setCheckable(boolean z) {
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
    }

    public void setCheckedIconMargin(@Dimension int i2) {
    }

    public void setCheckedIconSize(@Dimension int i2) {
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
    }

    public void setCornerRadius(float f2) {
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStrokeColor(ColorStateList colorStateList) {
    }

    public void setStrokeWidth(@Dimension int i2) {
    }

    public void setUserContentPadding(int i2, int i3, int i4, int i5) {
    }

    public void updateClickable() {
    }

    public void updateContentPadding() {
    }

    public void updateElevation() {
    }

    public void updateInsets() {
    }

    public void updateStroke() {
    }
}
