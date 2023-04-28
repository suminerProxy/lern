package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int[] DEFAULT_STATE = null;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private static final ShapeDrawable closeIconRippleMask = null;
    private int alpha;
    private boolean checkable;
    @Nullable
    private Drawable checkedIcon;
    @Nullable
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;
    @Nullable
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    @Nullable
    private Drawable chipIcon;
    private float chipIconSize;
    @Nullable
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;
    @Nullable
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    @Nullable
    private ColorStateList chipSurfaceColor;
    @Nullable
    private Drawable closeIcon;
    @Nullable
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    @Nullable
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    @Nullable
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    @Nullable
    private ColorFilter colorFilter;
    @Nullable
    private ColorStateList compatRippleColor;
    @NonNull
    private final Context context;
    private boolean currentChecked;
    @ColorInt
    private int currentChipBackgroundColor;
    @ColorInt
    private int currentChipStrokeColor;
    @ColorInt
    private int currentChipSurfaceColor;
    @ColorInt
    private int currentCompatRippleColor;
    @ColorInt
    private int currentCompositeSurfaceBackgroundColor;
    @ColorInt
    private int currentTextColor;
    @ColorInt
    private int currentTint;
    @Nullable
    private final Paint debugPaint;
    @NonNull
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;
    @Nullable
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;
    @Nullable
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;
    @Nullable
    private MotionSpec showMotionSpec;
    @Nullable
    private CharSequence text;
    @NonNull
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;
    @Nullable
    private ColorStateList tint;
    @Nullable
    private PorterDuffColorFilter tintFilter;
    @Nullable
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    private void applyChildDrawable(@Nullable Drawable drawable) {
    }

    private void calculateChipIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
    }

    private void calculateChipTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
    }

    private void calculateCloseIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
    }

    private void calculateCloseIconTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
    }

    private void calculateTextBounds(@NonNull Rect rect, @NonNull RectF rectF) {
    }

    private float calculateTextCenterFromBaseline() {
    }

    private boolean canShowCheckedIcon() {
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context, @XmlRes int i2) {
    }

    private void drawCheckedIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawChipBackground(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawChipIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawChipStroke(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawChipSurface(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawCloseIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawCompatRipple(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawDebug(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private void drawText(@NonNull Canvas canvas, @NonNull Rect rect) {
    }

    private float getCurrentChipIconHeight() {
    }

    private float getCurrentChipIconWidth() {
    }

    @Nullable
    private ColorFilter getTintColorFilter() {
    }

    private static boolean hasState(@Nullable int[] iArr, @AttrRes int i2) {
    }

    private void loadFromAttributes(@Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    private void setChipSurfaceColor(@Nullable ColorStateList colorStateList) {
    }

    private boolean showsCheckedIcon() {
    }

    private boolean showsChipIcon() {
    }

    private boolean showsCloseIcon() {
    }

    private void unapplyChildDrawable(@Nullable Drawable drawable) {
    }

    private void updateCompatRippleColor() {
    }

    @TargetApi(21)
    private void updateFrameworkCloseIconRipple() {
    }

    public float calculateChipIconWidth() {
    }

    public float calculateCloseIconWidth() {
    }

    @NonNull
    public Paint.Align calculateTextOriginAndAlignment(@NonNull Rect rect, @NonNull PointF pointF) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
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

    public void getChipTouchBounds(@NonNull RectF rectF) {
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

    @NonNull
    public int[] getCloseIconState() {
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF) {
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
    }

    public TextUtils.TruncateAt getEllipsize() {
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
    }

    public float getIconEndPadding() {
    }

    public float getIconStartPadding() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Px
    public int getMaxWidth() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
    }

    @Nullable
    public ColorStateList getRippleColor() {
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
    }

    @Nullable
    public CharSequence getText() {
    }

    @Nullable
    public TextAppearance getTextAppearance() {
    }

    public float getTextEndPadding() {
    }

    public float getTextStartPadding() {
    }

    public boolean getUseCompatRipple() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
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

    public boolean isCloseIconStateful() {
    }

    public boolean isCloseIconVisible() {
    }

    public boolean isShapeThemingEnabled() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
    }

    public void onSizeChange() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setCheckable(boolean z) {
    }

    public void setCheckableResource(@BoolRes int i2) {
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

    public boolean setCloseIconState(@NonNull int[] iArr) {
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
    }

    public void setCloseIconTintResource(@ColorRes int i2) {
    }

    public void setCloseIconVisible(@BoolRes int i2) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public void setDelegate(@Nullable Delegate delegate) {
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
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

    public void setMaxWidth(@Px int i2) {
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
    }

    public void setRippleColorResource(@ColorRes int i2) {
    }

    public void setShouldDrawText(boolean z) {
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public void setShowMotionSpecResource(@AnimatorRes int i2) {
    }

    public void setText(@Nullable CharSequence charSequence) {
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
    }

    public void setTextAppearanceResource(@StyleRes int i2) {
    }

    public void setTextEndPadding(float f2) {
    }

    public void setTextEndPaddingResource(@DimenRes int i2) {
    }

    public void setTextResource(@StringRes int i2) {
    }

    public void setTextSize(@Dimension float f2) {
    }

    public void setTextStartPadding(float f2) {
    }

    public void setTextStartPaddingResource(@DimenRes int i2) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
    }

    public void setUseCompatRipple(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    public boolean shouldDrawText() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
    }

    public void setCheckedIconVisible(boolean z) {
    }

    public void setChipIconVisible(boolean z) {
    }

    public void setCloseIconVisible(boolean z) {
    }

    private boolean onStateChange(@NonNull int[] iArr, @NonNull int[] iArr2) {
    }

    private static boolean isStateful(@Nullable ColorStateList colorStateList) {
    }

    private static boolean isStateful(@Nullable Drawable drawable) {
    }

    private static boolean isStateful(@Nullable TextAppearance textAppearance) {
    }
}
