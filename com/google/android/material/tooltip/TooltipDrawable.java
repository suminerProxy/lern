package com.google.android.material.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    @StyleRes
    private static final int DEFAULT_STYLE = 0;
    @AttrRes
    private static final int DEFAULT_THEME_ATTR = 0;
    private int arrowSize;
    @NonNull
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    @NonNull
    private final Context context;
    @NonNull
    private final Rect displayFrame;
    @Nullable
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    @Nullable
    private CharSequence text;
    @NonNull
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    /* renamed from: com.google.android.material.tooltip.TooltipDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements View.OnLayoutChangeListener {
        public final /* synthetic */ TooltipDrawable this$0;

        public AnonymousClass1(TooltipDrawable tooltipDrawable) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    private TooltipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    public static /* synthetic */ void access$000(TooltipDrawable tooltipDrawable, View view) {
    }

    private float calculatePointerOffset() {
    }

    private float calculateTextCenterFromBaseline() {
    }

    private float calculateTextOriginAndAlignment(@NonNull Rect rect) {
    }

    @NonNull
    public static TooltipDrawable create(@NonNull Context context) {
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    private EdgeTreatment createMarkerEdge() {
    }

    private void drawText(@NonNull Canvas canvas) {
    }

    private float getTextWidth() {
    }

    private void loadFromAttributes(@Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    private void updateLocationOnScreen(@NonNull View view) {
    }

    public void detachView(@Nullable View view) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    public int getLayoutMargin() {
    }

    public int getMinHeight() {
    }

    public int getMinWidth() {
    }

    @Nullable
    public CharSequence getText() {
    }

    @Nullable
    public TextAppearance getTextAppearance() {
    }

    public int getTextPadding() {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
    }

    public void setLayoutMargin(@Px int i2) {
    }

    public void setMinHeight(@Px int i2) {
    }

    public void setMinWidth(@Px int i2) {
    }

    public void setRelativeToView(@Nullable View view) {
    }

    public void setRevealFraction(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setText(@Nullable CharSequence charSequence) {
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
    }

    public void setTextAppearanceResource(@StyleRes int i2) {
    }

    public void setTextPadding(@Px int i2) {
    }

    public void setTextResource(@StringRes int i2) {
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
