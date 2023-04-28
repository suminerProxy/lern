package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BorderDrawable extends Drawable {
    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    @Nullable
    private ColorStateList borderTint;
    @Dimension
    public float borderWidth;
    @ColorInt
    private int bottomInnerStrokeColor;
    @ColorInt
    private int bottomOuterStrokeColor;
    private final RectF boundsRectF;
    @ColorInt
    private int currentBorderTintColor;
    private boolean invalidateShader;
    @NonNull
    private final Paint paint;
    private final ShapeAppearancePathProvider pathProvider;
    private final Rect rect;
    private final RectF rectF;
    private ShapeAppearanceModel shapeAppearanceModel;
    private final Path shapePath;
    private final BorderState state;
    @ColorInt
    private int topInnerStrokeColor;
    @ColorInt
    private int topOuterStrokeColor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class BorderState extends Drawable.ConstantState {
        public final /* synthetic */ BorderDrawable this$0;

        private BorderState(BorderDrawable borderDrawable) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
        }

        public /* synthetic */ BorderState(BorderDrawable borderDrawable, AnonymousClass1 anonymousClass1) {
        }
    }

    public BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
    }

    @NonNull
    private Shader createGradientShader() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @NonNull
    public RectF getBoundsAsRectF() {
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
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

    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i2) {
    }

    public void setBorderTint(@Nullable ColorStateList colorStateList) {
    }

    public void setBorderWidth(@Dimension float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public void setGradientColors(@ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @ColorInt int i5) {
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
    }
}
