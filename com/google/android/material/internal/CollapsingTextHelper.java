package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.CancelableFontCallback;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    @NonNull
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final String ELLIPSIS_NORMAL = "…";
    private static final String TAG = "CollapsingTextHelper";
    private static final boolean USE_SCALING_TEXTURE = false;
    private boolean boundsChanged;
    @NonNull
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private ColorStateList collapsedTextColor;
    private int collapsedTextGravity;
    private float collapsedTextSize;
    private Typeface collapsedTypeface;
    @NonNull
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentTextSize;
    private Typeface currentTypeface;
    private boolean drawTitle;
    @NonNull
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private float expandedFirstLineDrawX;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private ColorStateList expandedTextColor;
    private int expandedTextGravity;
    private float expandedTextSize;
    @Nullable
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private boolean isRtl;
    private int maxLines;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    @Nullable
    private CharSequence text;
    private StaticLayout textLayout;
    @NonNull
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    @Nullable
    private CharSequence textToDraw;
    private CharSequence textToDrawCollapsed;
    private Paint texturePaint;
    @NonNull
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;

    /* renamed from: com.google.android.material.internal.CollapsingTextHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements CancelableFontCallback.ApplyFont {
        public final /* synthetic */ CollapsingTextHelper this$0;

        public AnonymousClass1(CollapsingTextHelper collapsingTextHelper) {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public void apply(Typeface typeface) {
        }
    }

    /* renamed from: com.google.android.material.internal.CollapsingTextHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements CancelableFontCallback.ApplyFont {
        public final /* synthetic */ CollapsingTextHelper this$0;

        public AnonymousClass2(CollapsingTextHelper collapsingTextHelper) {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public void apply(Typeface typeface) {
        }
    }

    public CollapsingTextHelper(View view) {
    }

    private static int blendColors(int i2, int i3, float f2) {
    }

    private void calculateBaseOffsets() {
    }

    private void calculateCurrentOffsets() {
    }

    private boolean calculateIsRtl(@NonNull CharSequence charSequence) {
    }

    private void calculateOffsets(float f2) {
    }

    private void calculateUsingTextSize(float f2) {
    }

    private void clearTexture() {
    }

    private StaticLayout createStaticLayout(int i2, float f2, boolean z) {
    }

    private void drawMultinlineTransition(@NonNull Canvas canvas, float f2, float f3) {
    }

    private void ensureExpandedTexture() {
    }

    private float getCollapsedTextLeftBound(int i2, int i3) {
    }

    private float getCollapsedTextRightBound(@NonNull RectF rectF, int i2, int i3) {
    }

    @ColorInt
    private int getCurrentColor(@Nullable ColorStateList colorStateList) {
    }

    @ColorInt
    private int getCurrentExpandedTextColor() {
    }

    private void getTextPaintCollapsed(@NonNull TextPaint textPaint) {
    }

    private void getTextPaintExpanded(@NonNull TextPaint textPaint) {
    }

    private void interpolateBounds(float f2) {
    }

    private static boolean isClose(float f2, float f3) {
    }

    private boolean isDefaultIsRtl() {
    }

    private static float lerp(float f2, float f3, float f4, @Nullable TimeInterpolator timeInterpolator) {
    }

    private static boolean rectEquals(@NonNull Rect rect, int i2, int i3, int i4, int i5) {
    }

    private void setCollapsedTextBlend(float f2) {
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
    }

    private void setExpandedTextBlend(float f2) {
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
    }

    private void setInterpolatedTextSize(float f2) {
    }

    private boolean shouldDrawMultiline() {
    }

    public float calculateCollapsedTextWidth() {
    }

    public void draw(@NonNull Canvas canvas) {
    }

    public void getCollapsedTextActualBounds(@NonNull RectF rectF, int i2, int i3) {
    }

    public ColorStateList getCollapsedTextColor() {
    }

    public int getCollapsedTextGravity() {
    }

    public float getCollapsedTextHeight() {
    }

    public float getCollapsedTextSize() {
    }

    public Typeface getCollapsedTypeface() {
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
    }

    public ColorStateList getExpandedTextColor() {
    }

    public int getExpandedTextGravity() {
    }

    public float getExpandedTextHeight() {
    }

    public float getExpandedTextSize() {
    }

    public Typeface getExpandedTypeface() {
    }

    public float getExpansionFraction() {
    }

    public int getMaxLines() {
    }

    @Nullable
    public CharSequence getText() {
    }

    public final boolean isStateful() {
    }

    public void onBoundsChanged() {
    }

    public void recalculate() {
    }

    public void setCollapsedBounds(int i2, int i3, int i4, int i5) {
    }

    public void setCollapsedTextAppearance(int i2) {
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
    }

    public void setCollapsedTextGravity(int i2) {
    }

    public void setCollapsedTextSize(float f2) {
    }

    public void setCollapsedTypeface(Typeface typeface) {
    }

    public void setExpandedBounds(int i2, int i3, int i4, int i5) {
    }

    public void setExpandedTextAppearance(int i2) {
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
    }

    public void setExpandedTextGravity(int i2) {
    }

    public void setExpandedTextSize(float f2) {
    }

    public void setExpandedTypeface(Typeface typeface) {
    }

    public void setExpansionFraction(float f2) {
    }

    public void setMaxLines(int i2) {
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
    }

    public final boolean setState(int[] iArr) {
    }

    public void setText(@Nullable CharSequence charSequence) {
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
    }

    public void setTypefaces(Typeface typeface) {
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
    }

    public void setExpandedBounds(@NonNull Rect rect) {
    }
}
