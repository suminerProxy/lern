package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.transition.TransitionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MaterialContainerTransform extends Transition {
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS = null;
    private static final ProgressThresholdsGroup DEFAULT_ENTER_THRESHOLDS_ARC = null;
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS = null;
    private static final ProgressThresholdsGroup DEFAULT_RETURN_THRESHOLDS_ARC = null;
    private static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    private static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    private static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    private static final String TAG = null;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    private static final String[] TRANSITION_PROPS = null;
    @ColorInt
    private int containerColor;
    private boolean drawDebugEnabled;
    @IdRes
    private int drawingViewId;
    private boolean elevationShadowEnabled;
    @ColorInt
    private int endContainerColor;
    private float endElevation;
    @Nullable
    private ShapeAppearanceModel endShapeAppearanceModel;
    @Nullable
    private View endView;
    @IdRes
    private int endViewId;
    private int fadeMode;
    @Nullable
    private ProgressThresholds fadeProgressThresholds;
    private int fitMode;
    private boolean holdAtEndEnabled;
    @Nullable
    private ProgressThresholds scaleMaskProgressThresholds;
    @Nullable
    private ProgressThresholds scaleProgressThresholds;
    @ColorInt
    private int scrimColor;
    @Nullable
    private ProgressThresholds shapeMaskProgressThresholds;
    @ColorInt
    private int startContainerColor;
    private float startElevation;
    @Nullable
    private ShapeAppearanceModel startShapeAppearanceModel;
    @Nullable
    private View startView;
    @IdRes
    private int startViewId;
    private int transitionDirection;

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ MaterialContainerTransform this$0;
        public final /* synthetic */ TransitionDrawable val$transitionDrawable;

        public AnonymousClass1(MaterialContainerTransform materialContainerTransform, TransitionDrawable transitionDrawable) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends TransitionListenerAdapter {
        public final /* synthetic */ MaterialContainerTransform this$0;
        public final /* synthetic */ View val$drawingView;
        public final /* synthetic */ View val$endView;
        public final /* synthetic */ View val$startView;
        public final /* synthetic */ TransitionDrawable val$transitionDrawable;

        public AnonymousClass2(MaterialContainerTransform materialContainerTransform, View view, TransitionDrawable transitionDrawable, View view2, View view3) {
        }

        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface FitMode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ProgressThresholds {
        @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
        private final float end;
        @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
        private final float start;

        public ProgressThresholds(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        }

        public static /* synthetic */ float access$1000(ProgressThresholds progressThresholds) {
        }

        public static /* synthetic */ float access$1100(ProgressThresholds progressThresholds) {
        }

        @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
        public float getEnd() {
        }

        @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
        public float getStart() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ProgressThresholdsGroup {
        @NonNull
        private final ProgressThresholds fade;
        @NonNull
        private final ProgressThresholds scale;
        @NonNull
        private final ProgressThresholds scaleMask;
        @NonNull
        private final ProgressThresholds shapeMask;

        public /* synthetic */ ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ ProgressThresholds access$400(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        public static /* synthetic */ ProgressThresholds access$500(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        public static /* synthetic */ ProgressThresholds access$600(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        public static /* synthetic */ ProgressThresholds access$700(ProgressThresholdsGroup progressThresholdsGroup) {
        }

        private ProgressThresholdsGroup(@NonNull ProgressThresholds progressThresholds, @NonNull ProgressThresholds progressThresholds2, @NonNull ProgressThresholds progressThresholds3, @NonNull ProgressThresholds progressThresholds4) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface TransitionDirection {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TransitionDrawable extends Drawable {
        private static final int COMPAT_SHADOW_COLOR = -7829368;
        private static final int SHADOW_COLOR = 754974720;
        private static final float SHADOW_DX_MULTIPLIER_ADJUSTMENT = 0.3f;
        private static final float SHADOW_DY_MULTIPLIER_ADJUSTMENT = 1.5f;
        private final MaterialShapeDrawable compatShadowDrawable;
        private final Paint containerPaint;
        private float currentElevation;
        private float currentElevationDy;
        private final RectF currentEndBounds;
        private final RectF currentEndBoundsMasked;
        private RectF currentMaskBounds;
        private final RectF currentStartBounds;
        private final RectF currentStartBoundsMasked;
        private final Paint debugPaint;
        private final Path debugPath;
        private final float displayHeight;
        private final float displayWidth;
        private final boolean drawDebugEnabled;
        private final boolean elevationShadowEnabled;
        private final RectF endBounds;
        private final Paint endContainerPaint;
        private final float endElevation;
        private final ShapeAppearanceModel endShapeAppearanceModel;
        private final View endView;
        private final boolean entering;
        private final FadeModeEvaluator fadeModeEvaluator;
        private FadeModeResult fadeModeResult;
        private final FitModeEvaluator fitModeEvaluator;
        private FitModeResult fitModeResult;
        private final MaskEvaluator maskEvaluator;
        private final float motionPathLength;
        private final PathMeasure motionPathMeasure;
        private final float[] motionPathPosition;
        private float progress;
        private final ProgressThresholdsGroup progressThresholds;
        private final Paint scrimPaint;
        private final Paint shadowPaint;
        private final RectF startBounds;
        private final Paint startContainerPaint;
        private final float startElevation;
        private final ShapeAppearanceModel startShapeAppearanceModel;
        private final View startView;

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements TransitionUtils.CanvasOperation {
            public final /* synthetic */ TransitionDrawable this$0;

            public AnonymousClass1(TransitionDrawable transitionDrawable) {
            }

            @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
            public void run(Canvas canvas) {
            }
        }

        /* renamed from: com.google.android.material.transition.MaterialContainerTransform$TransitionDrawable$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements TransitionUtils.CanvasOperation {
            public final /* synthetic */ TransitionDrawable this$0;

            public AnonymousClass2(TransitionDrawable transitionDrawable) {
            }

            @Override // com.google.android.material.transition.TransitionUtils.CanvasOperation
            public void run(Canvas canvas) {
            }
        }

        public /* synthetic */ TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f2, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f3, int i2, int i3, int i4, int i5, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ void access$200(TransitionDrawable transitionDrawable, float f2) {
        }

        public static /* synthetic */ View access$800(TransitionDrawable transitionDrawable) {
        }

        public static /* synthetic */ View access$900(TransitionDrawable transitionDrawable) {
        }

        private static float calculateElevationDxMultiplier(RectF rectF, float f2) {
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f2) {
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, @ColorInt int i2) {
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, @ColorInt int i2) {
        }

        private void drawElevationShadow(Canvas canvas) {
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
        }

        private void drawEndView(Canvas canvas) {
        }

        private void drawStartView(Canvas canvas) {
        }

        private static PointF getMotionPathPoint(RectF rectF) {
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
        }

        private void setProgress(float f2) {
        }

        private void updateProgress(float f2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }

        private TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f2, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f3, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, int i5, boolean z, boolean z2, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup, boolean z3) {
        }
    }

    public static /* synthetic */ boolean access$300(MaterialContainerTransform materialContainerTransform) {
    }

    private ProgressThresholdsGroup buildThresholdsGroup(boolean z) {
    }

    private static RectF calculateDrawableBounds(View view, @Nullable View view2, float f2, float f3) {
    }

    private static ShapeAppearanceModel captureShapeAppearance(@NonNull View view, @NonNull RectF rectF, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
    }

    private static void captureValues(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i2, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
    }

    private static float getElevationOrDefault(float f2, View view) {
    }

    private static ShapeAppearanceModel getShapeAppearance(@NonNull View view, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
    }

    private ProgressThresholdsGroup getThresholdsOrDefault(boolean z, ProgressThresholdsGroup progressThresholdsGroup, ProgressThresholdsGroup progressThresholdsGroup2) {
    }

    @StyleRes
    private static int getTransitionShapeAppearanceResId(Context context) {
    }

    private boolean isEntering(@NonNull RectF rectF, @NonNull RectF rectF2) {
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
    }

    @ColorInt
    public int getContainerColor() {
    }

    @IdRes
    public int getDrawingViewId() {
    }

    @ColorInt
    public int getEndContainerColor() {
    }

    public float getEndElevation() {
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
    }

    @Nullable
    public View getEndView() {
    }

    @IdRes
    public int getEndViewId() {
    }

    public int getFadeMode() {
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
    }

    public int getFitMode() {
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
    }

    @ColorInt
    public int getScrimColor() {
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
    }

    @ColorInt
    public int getStartContainerColor() {
    }

    public float getStartElevation() {
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
    }

    @Nullable
    public View getStartView() {
    }

    @IdRes
    public int getStartViewId() {
    }

    public int getTransitionDirection() {
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
    }

    public boolean isDrawDebugEnabled() {
    }

    public boolean isElevationShadowEnabled() {
    }

    public boolean isHoldAtEndEnabled() {
    }

    public void setAllContainerColors(@ColorInt int i2) {
    }

    public void setContainerColor(@ColorInt int i2) {
    }

    public void setDrawDebugEnabled(boolean z) {
    }

    public void setDrawingViewId(@IdRes int i2) {
    }

    public void setElevationShadowEnabled(boolean z) {
    }

    public void setEndContainerColor(@ColorInt int i2) {
    }

    public void setEndElevation(float f2) {
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setEndView(@Nullable View view) {
    }

    public void setEndViewId(@IdRes int i2) {
    }

    public void setFadeMode(int i2) {
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
    }

    public void setFitMode(int i2) {
    }

    public void setHoldAtEndEnabled(boolean z) {
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
    }

    public void setScrimColor(@ColorInt int i2) {
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
    }

    public void setStartContainerColor(@ColorInt int i2) {
    }

    public void setStartElevation(float f2) {
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
    }

    public void setStartView(@Nullable View view) {
    }

    public void setStartViewId(@IdRes int i2) {
    }

    public void setTransitionDirection(int i2) {
    }
}
