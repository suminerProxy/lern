package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DRAGGED_STATE_SET = null;
    private static final String LOG_TAG = "MaterialCardView";
    @NonNull
    private final MaterialCardViewHelper cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private OnCheckedChangeListener onCheckedChangeListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
    }

    public static /* synthetic */ float access$001(MaterialCardView materialCardView) {
    }

    private void forceRippleRedrawIfNeeded() {
    }

    @NonNull
    private RectF getBoundsAsRectF() {
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
    }

    public float getCardViewRadius() {
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

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getProgress() {
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
    }

    public ColorStateList getRippleColor() {
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
    }

    @Dimension
    public int getStrokeWidth() {
    }

    public boolean isCheckable() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    public boolean isDragged() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setAncestorContentPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i2) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f2) {
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
    }

    public void setCheckable(boolean z) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
    }

    public void setCheckedIconMargin(@Dimension int i2) {
    }

    public void setCheckedIconMarginResource(@DimenRes int i2) {
    }

    public void setCheckedIconResource(@DrawableRes int i2) {
    }

    public void setCheckedIconSize(@Dimension int i2) {
    }

    public void setCheckedIconSizeResource(@DimenRes int i2) {
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i2, int i3, int i4, int i5) {
    }

    public void setDragged(boolean z) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f2) {
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f2) {
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
    }

    public void setRippleColorResource(@ColorRes int i2) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStrokeColor(@ColorInt int i2) {
    }

    public void setStrokeWidth(@Dimension int i2) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
    }

    public void setStrokeColor(ColorStateList colorStateList) {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
    }
}
