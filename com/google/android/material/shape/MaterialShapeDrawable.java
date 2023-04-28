package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = null;
    private static final Paint clearPaint = null;
    private final BitSet containsIncompatibleShadowOp;
    private final ShapePath.ShadowCompatOperation[] cornerShadowOperation;
    private MaterialShapeDrawableState drawableState;
    private final ShapePath.ShadowCompatOperation[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private final Matrix matrix;
    private final Path path;
    @NonNull
    private final RectF pathBounds;
    private boolean pathDirty;
    private final Path pathInsetByStroke;
    private final ShapeAppearancePathProvider pathProvider;
    @NonNull
    private final ShapeAppearancePathProvider.PathListener pathShadowListener;
    private final RectF rectF;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final ShadowRenderer shadowRenderer;
    private final Paint strokePaint;
    private ShapeAppearanceModel strokeShapeAppearance;
    @Nullable
    private PorterDuffColorFilter strokeTintFilter;
    @Nullable
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements ShapeAppearancePathProvider.PathListener {
        public final /* synthetic */ MaterialShapeDrawable this$0;

        public AnonymousClass1(MaterialShapeDrawable materialShapeDrawable) {
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public void onCornerPathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i2) {
        }

        @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
        public void onEdgePathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i2) {
        }
    }

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements ShapeAppearanceModel.CornerSizeUnaryOperator {
        public final /* synthetic */ MaterialShapeDrawable this$0;
        public final /* synthetic */ float val$strokeInsetLength;

        public AnonymousClass2(MaterialShapeDrawable materialShapeDrawable, float f2) {
        }

        @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
        @NonNull
        public CornerSize apply(@NonNull CornerSize cornerSize) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface CompatibilityShadowMode {
    }

    public /* synthetic */ MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ BitSet access$000(MaterialShapeDrawable materialShapeDrawable) {
    }

    public static /* synthetic */ ShapePath.ShadowCompatOperation[] access$100(MaterialShapeDrawable materialShapeDrawable) {
    }

    public static /* synthetic */ ShapePath.ShadowCompatOperation[] access$200(MaterialShapeDrawable materialShapeDrawable) {
    }

    public static /* synthetic */ boolean access$402(MaterialShapeDrawable materialShapeDrawable, boolean z) {
    }

    @Nullable
    private PorterDuffColorFilter calculatePaintColorTintFilter(@NonNull Paint paint, boolean z) {
    }

    private void calculatePath(@NonNull RectF rectF, @NonNull Path path) {
    }

    private void calculateStrokePath() {
    }

    @NonNull
    private PorterDuffColorFilter calculateTintColorTintFilter(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
    }

    @NonNull
    private PorterDuffColorFilter calculateTintFilter(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
    }

    private void drawCompatShadow(@NonNull Canvas canvas) {
    }

    private void drawFillShape(@NonNull Canvas canvas) {
    }

    private void drawStrokeShape(@NonNull Canvas canvas) {
    }

    @NonNull
    private RectF getBoundsInsetByStroke() {
    }

    private float getStrokeInsetLength() {
    }

    private boolean hasCompatShadow() {
    }

    private boolean hasFill() {
    }

    private boolean hasStroke() {
    }

    private void invalidateSelfIgnoreShape() {
    }

    private void maybeDrawCompatShadow(@NonNull Canvas canvas) {
    }

    private static int modulateAlpha(int i2, int i3) {
    }

    private void prepareCanvasForShadow(@NonNull Canvas canvas) {
    }

    private boolean updateColorsForState(int[] iArr) {
    }

    private boolean updateTintFilter() {
    }

    private void updateZ() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void calculatePathForSize(@NonNull RectF rectF, @NonNull Path path) {
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int compositeElevationOverlayIfNeeded(@ColorInt int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
    }

    public float getBottomLeftCornerResolvedSize() {
    }

    public float getBottomRightCornerResolvedSize() {
    }

    @NonNull
    public RectF getBoundsAsRectF() {
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
    }

    public float getElevation() {
    }

    @Nullable
    public ColorStateList getFillColor() {
    }

    public float getInterpolation() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
    }

    public Paint.Style getPaintStyle() {
    }

    public float getParentAbsoluteElevation() {
    }

    @Deprecated
    public void getPathForSize(int i2, int i3, @NonNull Path path) {
    }

    public float getScale() {
    }

    public int getShadowCompatRotation() {
    }

    public int getShadowCompatibilityMode() {
    }

    @Deprecated
    public int getShadowElevation() {
    }

    public int getShadowOffsetX() {
    }

    public int getShadowOffsetY() {
    }

    public int getShadowRadius() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
    }

    @Nullable
    public ColorStateList getStrokeColor() {
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
    }

    public float getStrokeWidth() {
    }

    @Nullable
    public ColorStateList getTintList() {
    }

    public float getTopLeftCornerResolvedSize() {
    }

    public float getTopRightCornerResolvedSize() {
    }

    public float getTranslationZ() {
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
    }

    public float getZ() {
    }

    public void initializeElevationOverlay(Context context) {
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
    }

    public boolean isElevationOverlayEnabled() {
    }

    public boolean isElevationOverlayInitialized() {
    }

    public boolean isPointInTransparentRegion(int i2, int i3) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
    }

    @Deprecated
    public boolean isShadowEnabled() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
    }

    public boolean requiresCompatShadow() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public void setCornerSize(float f2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z) {
    }

    public void setElevation(float f2) {
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
    }

    public void setInterpolation(float f2) {
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaintStyle(Paint.Style style) {
    }

    public void setParentAbsoluteElevation(float f2) {
    }

    public void setScale(float f2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z) {
    }

    public void setShadowColor(int i2) {
    }

    public void setShadowCompatRotation(int i2) {
    }

    public void setShadowCompatibilityMode(int i2) {
    }

    @Deprecated
    public void setShadowElevation(int i2) {
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
    }

    @Deprecated
    public void setShadowRadius(int i2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int i2) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel) {
    }

    public void setStroke(float f2, @ColorInt int i2) {
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
    }

    public void setStrokeTint(ColorStateList colorStateList) {
    }

    public void setStrokeWidth(float f2) {
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i2) {
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
    }

    public void setTranslationZ(float f2) {
    }

    public void setUseTintColorForShadow(boolean z) {
    }

    public void setZ(float f2) {
    }

    public MaterialShapeDrawable() {
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f2) {
    }

    private void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull ShapeAppearanceModel shapeAppearanceModel, @NonNull RectF rectF) {
    }

    public void setCornerSize(@NonNull CornerSize cornerSize) {
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    public void setStroke(float f2, @Nullable ColorStateList colorStateList) {
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel) {
    }

    public void setStrokeTint(@ColorInt int i2) {
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    private MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MaterialShapeDrawableState extends Drawable.ConstantState {
        public int alpha;
        @Nullable
        public ColorFilter colorFilter;
        public float elevation;
        @Nullable
        public ElevationOverlayProvider elevationOverlayProvider;
        @Nullable
        public ColorStateList fillColor;
        public float interpolation;
        @Nullable
        public Rect padding;
        public Paint.Style paintStyle;
        public float parentAbsoluteElevation;
        public float scale;
        public int shadowCompatMode;
        public int shadowCompatOffset;
        public int shadowCompatRadius;
        public int shadowCompatRotation;
        @NonNull
        public ShapeAppearanceModel shapeAppearanceModel;
        @Nullable
        public ColorStateList strokeColor;
        @Nullable
        public ColorStateList strokeTintList;
        public float strokeWidth;
        @Nullable
        public ColorStateList tintList;
        @Nullable
        public PorterDuff.Mode tintMode;
        public float translationZ;
        public boolean useTintColorForShadow;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel, ElevationOverlayProvider elevationOverlayProvider) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        }
    }
}
