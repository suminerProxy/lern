package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    private static final int DEF_STYLE_RES = 0;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;
    @Dimension
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;
    @Dimension
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    @Dimension
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final ShapeAppearancePathProvider pathProvider;
    @Dimension
    private int rightContentPadding;
    @Nullable
    private MaterialShapeDrawable shadowDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    @Dimension
    private int startContentPadding;
    @Nullable
    private ColorStateList strokeColor;
    @Dimension
    private float strokeWidth;
    @Dimension
    private int topContentPadding;

    @TargetApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class OutlineProvider extends ViewOutlineProvider {
        private final Rect rect;
        public final /* synthetic */ ShapeableImageView this$0;

        public OutlineProvider(ShapeableImageView shapeableImageView) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }
    }

    public ShapeableImageView(Context context) {
    }

    public static /* synthetic */ ShapeAppearanceModel access$000(ShapeableImageView shapeableImageView) {
    }

    public static /* synthetic */ MaterialShapeDrawable access$100(ShapeableImageView shapeableImageView) {
    }

    public static /* synthetic */ MaterialShapeDrawable access$102(ShapeableImageView shapeableImageView, MaterialShapeDrawable materialShapeDrawable) {
    }

    public static /* synthetic */ RectF access$200(ShapeableImageView shapeableImageView) {
    }

    private void drawStroke(Canvas canvas) {
    }

    private boolean isContentPaddingRelative() {
    }

    private boolean isRtl() {
    }

    private void updateShapeMask(int i2, int i3) {
    }

    @Dimension
    public int getContentPaddingBottom() {
    }

    @Dimension
    public final int getContentPaddingEnd() {
    }

    @Dimension
    public int getContentPaddingLeft() {
    }

    @Dimension
    public int getContentPaddingRight() {
    }

    @Dimension
    public final int getContentPaddingStart() {
    }

    @Dimension
    public int getContentPaddingTop() {
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
    }

    @Nullable
    public ColorStateList getStrokeColor() {
    }

    @Dimension
    public float getStrokeWidth() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    public void setContentPadding(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5) {
    }

    @RequiresApi(17)
    public void setContentPaddingRelative(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5) {
    }

    @Override // android.view.View
    public void setPadding(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(@Dimension int i2, @Dimension int i3, @Dimension int i4, @Dimension int i5) {
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
    }

    public void setStrokeColorResource(@ColorRes int i2) {
    }

    public void setStrokeWidth(@Dimension float f2) {
    }

    public void setStrokeWidthResource(@DimenRes int i2) {
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
