package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialButtonHelper {
    private static final boolean IS_LOLLIPOP = false;
    private boolean backgroundOverwritten;
    @Nullable
    private ColorStateList backgroundTint;
    @Nullable
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private boolean cornerRadiusSet;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    @Nullable
    private Drawable maskDrawable;
    private final MaterialButton materialButton;
    @Nullable
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;
    @NonNull
    private ShapeAppearanceModel shapeAppearanceModel;
    private boolean shouldDrawSurfaceColorStroke;
    @Nullable
    private ColorStateList strokeColor;
    private int strokeWidth;

    public MaterialButtonHelper(MaterialButton materialButton, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    private Drawable createBackground() {
    }

    @Nullable
    private MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
    }

    @Nullable
    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
    }

    private void setVerticalInsets(@Dimension int i2, @Dimension int i3) {
    }

    private void updateBackground() {
    }

    private void updateButtonShape(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    private void updateStroke() {
    }

    @NonNull
    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
    }

    public int getCornerRadius() {
    }

    public int getInsetBottom() {
    }

    public int getInsetTop() {
    }

    @Nullable
    public Shapeable getMaskDrawable() {
    }

    @Nullable
    public ColorStateList getRippleColor() {
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Nullable
    public ColorStateList getStrokeColor() {
    }

    public int getStrokeWidth() {
    }

    public ColorStateList getSupportBackgroundTintList() {
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    public boolean isBackgroundOverwritten() {
    }

    public boolean isCheckable() {
    }

    public void loadFromAttributes(@NonNull TypedArray typedArray) {
    }

    public void setBackgroundColor(int i2) {
    }

    public void setBackgroundOverwritten() {
    }

    public void setCheckable(boolean z) {
    }

    public void setCornerRadius(int i2) {
    }

    public void setInsetBottom(@Dimension int i2) {
    }

    public void setInsetTop(@Dimension int i2) {
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
    }

    public void setStrokeWidth(int i2) {
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    public void updateMaskBounds(int i2, int i3) {
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeDrawable() {
    }
}
