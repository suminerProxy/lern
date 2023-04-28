package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TransitionUtils {
    private static final RectF transformAlphaRectF = null;

    /* renamed from: com.google.android.material.transition.TransitionUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements ShapeAppearanceModel.CornerSizeUnaryOperator {
        public final /* synthetic */ RectF val$bounds;

        public AnonymousClass1(RectF rectF) {
        }

        @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
        @NonNull
        public CornerSize apply(@NonNull CornerSize cornerSize) {
        }
    }

    /* renamed from: com.google.android.material.transition.TransitionUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements CornerSizeBinaryOperator {
        public final /* synthetic */ RectF val$endBounds;
        public final /* synthetic */ float val$endFraction;
        public final /* synthetic */ float val$fraction;
        public final /* synthetic */ RectF val$startBounds;
        public final /* synthetic */ float val$startFraction;

        public AnonymousClass2(RectF rectF, RectF rectF2, float f2, float f3, float f4) {
        }

        @Override // com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator
        @NonNull
        public CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface CanvasOperation {
        void run(Canvas canvas);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface CornerSizeBinaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize, @NonNull CornerSize cornerSize2);
    }

    private TransitionUtils() {
    }

    public static float calculateArea(@NonNull RectF rectF) {
    }

    public static ShapeAppearanceModel convertToRelativeCornerSizes(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
    }

    public static Shader createColorShader(@ColorInt int i2) {
    }

    @NonNull
    public static <T> T defaultIfNull(@Nullable T t, @NonNull T t2) {
    }

    public static View findAncestorById(View view, @IdRes int i2) {
    }

    public static View findDescendantOrAncestorById(View view, @IdRes int i2) {
    }

    public static RectF getLocationOnScreen(View view) {
    }

    public static RectF getRelativeBounds(View view) {
    }

    public static Rect getRelativeBoundsRect(View view) {
    }

    private static boolean isShapeAppearanceSignificant(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
    }

    public static float lerp(float f2, float f3, float f4) {
    }

    public static float lerp(float f2, float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4, @FloatRange(from = 0.0d, to = 1.0d) float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
    }

    public static void maybeAddTransition(TransitionSet transitionSet, @Nullable Transition transition) {
    }

    public static void maybeRemoveTransition(TransitionSet transitionSet, @Nullable Transition transition) {
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i2) {
    }

    public static void transform(Canvas canvas, Rect rect, float f2, float f3, float f4, int i2, CanvasOperation canvasOperation) {
    }

    public static ShapeAppearanceModel transformCornerSizes(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, CornerSizeBinaryOperator cornerSizeBinaryOperator) {
    }

    public static float lerp(float f2, float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4, @FloatRange(from = 0.0d, to = 1.0d) float f5, @FloatRange(from = 0.0d) float f6, boolean z) {
    }

    public static int lerp(int i2, int i3, @FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4) {
    }

    public static ShapeAppearanceModel lerp(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, @FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4) {
    }
}
