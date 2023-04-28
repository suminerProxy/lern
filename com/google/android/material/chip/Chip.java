package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable {
    private static final String BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.Button";
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int CHIP_BODY_VIRTUAL_ID = 0;
    private static final int CLOSE_ICON_VIRTUAL_ID = 1;
    private static final String COMPOUND_BUTTON_ACCESSIBILITY_CLASS_NAME = "android.widget.CompoundButton";
    private static final int DEF_STYLE_RES = 0;
    private static final Rect EMPTY_BOUNDS = null;
    private static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final int[] SELECTED_STATE = null;
    private static final String TAG = "Chip";
    @Nullable
    private ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private boolean ensureMinTouchTargetSize;
    private final TextAppearanceFontCallback fontCallback;
    @Nullable
    private InsetDrawable insetBackgroundDrawable;
    private int lastLayoutDirection;
    @Dimension(unit = 1)
    private int minTouchTargetSize;
    @Nullable
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListenerInternal;
    @Nullable
    private View.OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    @Nullable
    private RippleDrawable ripple;
    @NonNull
    private final ChipTouchHelper touchHelper;

    /* renamed from: com.google.android.material.chip.Chip$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TextAppearanceFontCallback {
        public final /* synthetic */ Chip this$0;

        public AnonymousClass1(Chip chip) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i2) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z) {
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends ViewOutlineProvider {
        public final /* synthetic */ Chip this$0;

        public AnonymousClass2(Chip chip) {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @NonNull Outline outline) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ChipTouchHelper extends ExploreByTouchHelper {
        public final /* synthetic */ Chip this$0;

        public ChipTouchHelper(Chip chip, Chip chip2) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f2, float f3) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onVirtualViewKeyboardFocusChanged(int i2, boolean z) {
        }
    }

    public Chip(Context context) {
    }

    public static /* synthetic */ ChipDrawable access$000(Chip chip) {
    }

    public static /* synthetic */ boolean access$100(Chip chip) {
    }

    public static /* synthetic */ RectF access$200(Chip chip) {
    }

    public static /* synthetic */ View.OnClickListener access$300(Chip chip) {
    }

    public static /* synthetic */ boolean access$402(Chip chip, boolean z) {
    }

    public static /* synthetic */ Rect access$500(Chip chip) {
    }

    public static /* synthetic */ Rect access$600() {
    }

    private void applyChipDrawable(@NonNull ChipDrawable chipDrawable) {
    }

    @NonNull
    private int[] createCloseIconDrawableState() {
    }

    private void ensureChipDrawableHasCallback() {
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
    }

    @NonNull
    private Rect getCloseIconTouchBoundsInt() {
    }

    @Nullable
    private TextAppearance getTextAppearance() {
    }

    @SuppressLint({"PrivateApi"})
    private boolean handleAccessibilityExit(@NonNull MotionEvent motionEvent) {
    }

    private boolean hasCloseIcon() {
    }

    private void initMinTouchTarget(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    private void initOutlineProvider() {
    }

    private void insetChipBackgroundDrawable(int i2, int i3, int i4, int i5) {
    }

    private void removeBackgroundInset() {
    }

    private void setCloseIconHovered(boolean z) {
    }

    private void setCloseIconPressed(boolean z) {
    }

    private void unapplyChipDrawable(@Nullable ChipDrawable chipDrawable) {
    }

    private void updateAccessibilityDelegate() {
    }

    private void updateBackgroundDrawable() {
    }

    private void updateFrameworkRippleBackground() {
    }

    private void updatePaddingInternal() {
    }

    private void updateTextPaintDrawState() {
    }

    private void validateAttributes(@Nullable AttributeSet attributeSet) {
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
    }

    public boolean ensureAccessibleTouchTarget(@Dimension int i2) {
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
    }

    @Nullable
    public Drawable getCheckedIcon() {
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
    }

    public float getChipCornerRadius() {
    }

    public Drawable getChipDrawable() {
    }

    public float getChipEndPadding() {
    }

    @Nullable
    public Drawable getChipIcon() {
    }

    public float getChipIconSize() {
    }

    @Nullable
    public ColorStateList getChipIconTint() {
    }

    public float getChipMinHeight() {
    }

    public float getChipStartPadding() {
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
    }

    public float getChipStrokeWidth() {
    }

    @Deprecated
    public CharSequence getChipText() {
    }

    @Nullable
    public Drawable getCloseIcon() {
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
    }

    public float getCloseIconEndPadding() {
    }

    public float getCloseIconSize() {
    }

    public float getCloseIconStartPadding() {
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
    }

    public float getIconEndPadding() {
    }

    public float getIconStartPadding() {
    }

    @Nullable
    public ColorStateList getRippleColor() {
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
    }

    public float getTextEndPadding() {
    }

    public float getTextStartPadding() {
    }

    public boolean isCheckable() {
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
    }

    public boolean isCheckedIconVisible() {
    }

    @Deprecated
    public boolean isChipIconEnabled() {
    }

    public boolean isChipIconVisible() {
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
    }

    public boolean isCloseIconVisible() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    public void onChipDrawableSizeChange() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
    }

    @CallSuper
    public boolean performCloseIconClick() {
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i2) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
    }

    public void setCheckableResource(@BoolRes int i2) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i2) {
    }

    public void setCheckedIconResource(@DrawableRes int i2) {
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
    }

    public void setCheckedIconTintResource(@ColorRes int i2) {
    }

    public void setCheckedIconVisible(@BoolRes int i2) {
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
    }

    public void setChipBackgroundColorResource(@ColorRes int i2) {
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i2) {
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable) {
    }

    public void setChipEndPadding(float f2) {
    }

    public void setChipEndPaddingResource(@DimenRes int i2) {
    }

    public void setChipIcon(@Nullable Drawable drawable) {
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i2) {
    }

    public void setChipIconResource(@DrawableRes int i2) {
    }

    public void setChipIconSize(float f2) {
    }

    public void setChipIconSizeResource(@DimenRes int i2) {
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
    }

    public void setChipIconTintResource(@ColorRes int i2) {
    }

    public void setChipIconVisible(@BoolRes int i2) {
    }

    public void setChipMinHeight(float f2) {
    }

    public void setChipMinHeightResource(@DimenRes int i2) {
    }

    public void setChipStartPadding(float f2) {
    }

    public void setChipStartPaddingResource(@DimenRes int i2) {
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
    }

    public void setChipStrokeColorResource(@ColorRes int i2) {
    }

    public void setChipStrokeWidth(float f2) {
    }

    public void setChipStrokeWidthResource(@DimenRes int i2) {
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i2) {
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i2) {
    }

    public void setCloseIconEndPadding(float f2) {
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i2) {
    }

    public void setCloseIconResource(@DrawableRes int i2) {
    }

    public void setCloseIconSize(float f2) {
    }

    public void setCloseIconSizeResource(@DimenRes int i2) {
    }

    public void setCloseIconStartPadding(float f2) {
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i2) {
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
    }

    public void setCloseIconTintResource(@ColorRes int i2) {
    }

    public void setCloseIconVisible(@BoolRes int i2) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f2) {
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public void setHideMotionSpecResource(@AnimatorRes int i2) {
    }

    public void setIconEndPadding(float f2) {
    }

    public void setIconEndPaddingResource(@DimenRes int i2) {
    }

    public void setIconStartPadding(float f2) {
    }

    public void setIconStartPaddingResource(@DimenRes int i2) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i2) {
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
    }

    public void setRippleColorResource(@ColorRes int i2) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public void setShowMotionSpecResource(@AnimatorRes int i2) {
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
    }

    public void setTextAppearanceResource(@StyleRes int i2) {
    }

    public void setTextEndPadding(float f2) {
    }

    public void setTextEndPaddingResource(@DimenRes int i2) {
    }

    public void setTextStartPadding(float f2) {
    }

    public void setTextStartPaddingResource(@DimenRes int i2) {
    }

    public boolean shouldEnsureMinTouchTargetSize() {
    }

    public Chip(Context context, AttributeSet attributeSet) {
    }

    public void setCloseIconVisible(boolean z) {
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
    }

    public void setCheckedIconVisible(boolean z) {
    }

    public void setChipIconVisible(boolean z) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
    }
}
