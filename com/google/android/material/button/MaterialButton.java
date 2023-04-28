package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;
    @Nullable
    private Drawable icon;
    private int iconGravity;
    @Px
    private int iconLeft;
    @Px
    private int iconPadding;
    @Px
    private int iconSize;
    @Nullable
    private ColorStateList iconTint;
    @Nullable
    private PorterDuff.Mode iconTintMode;
    @Px
    private int iconTop;
    @NonNull
    private final MaterialButtonHelper materialButtonHelper;
    @NonNull
    private final LinkedHashSet<OnCheckedChangeListener> onCheckedChangeListeners;
    @Nullable
    private OnPressedChangeListener onPressedChangeListenerInternal;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface IconGravity {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnPressedChangeListener {
        void onPressedChanged(MaterialButton materialButton, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public boolean checked;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public /* bridge */ /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public /* bridge */ /* synthetic */ SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
            }
        }

        public SavedState(Parcelable parcelable) {
        }

        private void readFromParcel(@NonNull Parcel parcel) {
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        }
    }

    public MaterialButton(@NonNull Context context) {
    }

    @NonNull
    private String getA11yClassName() {
    }

    private int getTextHeight() {
    }

    private int getTextWidth() {
    }

    private boolean isIconEnd() {
    }

    private boolean isIconStart() {
    }

    private boolean isIconTop() {
    }

    private boolean isLayoutRTL() {
    }

    private boolean isUsingOriginalBackground() {
    }

    private void resetIconDrawable() {
    }

    private void updateIcon(boolean z) {
    }

    private void updateIconPosition(int i2, int i3) {
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void clearOnCheckedChangeListeners() {
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
    }

    @Px
    public int getCornerRadius() {
    }

    public Drawable getIcon() {
    }

    public int getIconGravity() {
    }

    @Px
    public int getIconPadding() {
    }

    @Px
    public int getIconSize() {
    }

    public ColorStateList getIconTint() {
    }

    public PorterDuff.Mode getIconTintMode() {
    }

    @Dimension
    public int getInsetBottom() {
    }

    @Dimension
    public int getInsetTop() {
    }

    @Nullable
    public ColorStateList getRippleColor() {
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    public ColorStateList getStrokeColor() {
    }

    @Px
    public int getStrokeWidth() {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    public boolean isCheckable() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean performClick() {
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setCornerRadius(@Px int i2) {
    }

    public void setCornerRadiusResource(@DimenRes int i2) {
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f2) {
    }

    public void setIcon(@Nullable Drawable drawable) {
    }

    public void setIconGravity(int i2) {
    }

    public void setIconPadding(@Px int i2) {
    }

    public void setIconResource(@DrawableRes int i2) {
    }

    public void setIconSize(@Px int i2) {
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
    }

    public void setIconTintResource(@ColorRes int i2) {
    }

    public void setInsetBottom(@Dimension int i2) {
    }

    public void setInsetTop(@Dimension int i2) {
    }

    public void setInternalBackground(Drawable drawable) {
    }

    public void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener onPressedChangeListener) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
    }

    public void setRippleColorResource(@ColorRes int i2) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
    }

    public void setStrokeColorResource(@ColorRes int i2) {
    }

    public void setStrokeWidth(@Px int i2) {
    }

    public void setStrokeWidthResource(@DimenRes int i2) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
