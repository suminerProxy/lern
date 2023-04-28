package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FloatingActionButtonImpl {
    public static final int ANIM_STATE_HIDING = 1;
    public static final int ANIM_STATE_NONE = 0;
    public static final int ANIM_STATE_SHOWING = 2;
    public static final long ELEVATION_ANIM_DELAY = 100;
    public static final long ELEVATION_ANIM_DURATION = 100;
    public static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = null;
    public static final int[] EMPTY_STATE_SET = null;
    public static final int[] ENABLED_STATE_SET = null;
    public static final int[] FOCUSED_ENABLED_STATE_SET = null;
    private static final float HIDE_ICON_SCALE = 0.0f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.0f;
    public static final int[] HOVERED_ENABLED_STATE_SET = null;
    public static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = null;
    public static final int[] PRESSED_ENABLED_STATE_SET = null;
    public static final float SHADOW_MULTIPLIER = 1.5f;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private int animState;
    @Nullable
    public BorderDrawable borderDrawable;
    @Nullable
    public Drawable contentBackground;
    @Nullable
    private Animator currentAnimator;
    @Nullable
    private MotionSpec defaultHideMotionSpec;
    @Nullable
    private MotionSpec defaultShowMotionSpec;
    public float elevation;
    public boolean ensureMinTouchTargetSize;
    private ArrayList<Animator.AnimatorListener> hideListeners;
    @Nullable
    private MotionSpec hideMotionSpec;
    public float hoveredFocusedTranslationZ;
    private float imageMatrixScale;
    private int maxImageSize;
    public int minTouchTargetSize;
    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    public float pressedTranslationZ;
    @Nullable
    public Drawable rippleDrawable;
    private float rotation;
    public boolean shadowPaddingEnabled;
    public final ShadowViewDelegate shadowViewDelegate;
    @Nullable
    public ShapeAppearanceModel shapeAppearance;
    @Nullable
    public MaterialShapeDrawable shapeDrawable;
    private ArrayList<Animator.AnimatorListener> showListeners;
    @Nullable
    private MotionSpec showMotionSpec;
    @NonNull
    private final StateListAnimator stateListAnimator;
    private final Matrix tmpMatrix;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;
    private ArrayList<InternalTransformationCallback> transformationCallbacks;
    public final FloatingActionButton view;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        private boolean cancelled;
        public final /* synthetic */ FloatingActionButtonImpl this$0;
        public final /* synthetic */ boolean val$fromUser;
        public final /* synthetic */ InternalVisibilityChangedListener val$listener;

        public AnonymousClass1(FloatingActionButtonImpl floatingActionButtonImpl, boolean z, InternalVisibilityChangedListener internalVisibilityChangedListener) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ FloatingActionButtonImpl this$0;
        public final /* synthetic */ boolean val$fromUser;
        public final /* synthetic */ InternalVisibilityChangedListener val$listener;

        public AnonymousClass2(FloatingActionButtonImpl floatingActionButtonImpl, boolean z, InternalVisibilityChangedListener internalVisibilityChangedListener) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 extends MatrixEvaluator {
        public final /* synthetic */ FloatingActionButtonImpl this$0;

        public AnonymousClass3(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f2, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.animation.MatrixEvaluator
        public Matrix evaluate(float f2, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements TypeEvaluator<Float> {
        public FloatEvaluator floatEvaluator;
        public final /* synthetic */ FloatingActionButtonImpl this$0;

        public AnonymousClass4(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Float evaluate(float f2, Float f3, Float f4) {
        }

        /* renamed from: evaluate  reason: avoid collision after fix types in other method */
        public Float evaluate2(float f2, Float f3, Float f4) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ FloatingActionButtonImpl this$0;

        public AnonymousClass5(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class DisabledElevationAnimation extends ShadowAnimatorImpl {
        public final /* synthetic */ FloatingActionButtonImpl this$0;

        public DisabledElevationAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        public final /* synthetic */ FloatingActionButtonImpl this$0;

        public ElevateToHoveredFocusedTranslationZAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        public final /* synthetic */ FloatingActionButtonImpl this$0;

        public ElevateToPressedTranslationZAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ResetElevationAnimation extends ShadowAnimatorImpl {
        public final /* synthetic */ FloatingActionButtonImpl this$0;

        public ResetElevationAnimation(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        public final /* synthetic */ FloatingActionButtonImpl this$0;
        private boolean validValues;

        private ShadowAnimatorImpl(FloatingActionButtonImpl floatingActionButtonImpl) {
        }

        public abstract float getTargetShadowSize();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        }

        public /* synthetic */ ShadowAnimatorImpl(FloatingActionButtonImpl floatingActionButtonImpl, AnonymousClass1 anonymousClass1) {
        }
    }

    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
    }

    public static /* synthetic */ int access$002(FloatingActionButtonImpl floatingActionButtonImpl, int i2) {
    }

    public static /* synthetic */ Animator access$102(FloatingActionButtonImpl floatingActionButtonImpl, Animator animator) {
    }

    public static /* synthetic */ float access$202(FloatingActionButtonImpl floatingActionButtonImpl, float f2) {
    }

    private void calculateImageMatrixFromScale(float f2, @NonNull Matrix matrix) {
    }

    @NonNull
    private AnimatorSet createAnimator(@NonNull MotionSpec motionSpec, float f2, float f3, float f4) {
    }

    @NonNull
    private ValueAnimator createElevationAnimator(@NonNull ShadowAnimatorImpl shadowAnimatorImpl) {
    }

    private MotionSpec getDefaultHideMotionSpec() {
    }

    private MotionSpec getDefaultShowMotionSpec() {
    }

    @NonNull
    private ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
    }

    private boolean shouldAnimateVisibilityChange() {
    }

    private void workAroundOreoBug(ObjectAnimator objectAnimator) {
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void addTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
    }

    public MaterialShapeDrawable createShapeDrawable() {
    }

    @Nullable
    public final Drawable getContentBackground() {
    }

    public float getElevation() {
    }

    public boolean getEnsureMinTouchTargetSize() {
    }

    @Nullable
    public final MotionSpec getHideMotionSpec() {
    }

    public float getHoveredFocusedTranslationZ() {
    }

    public void getPadding(@NonNull Rect rect) {
    }

    public float getPressedTranslationZ() {
    }

    @Nullable
    public final ShapeAppearanceModel getShapeAppearance() {
    }

    @Nullable
    public final MotionSpec getShowMotionSpec() {
    }

    public void hide(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener, boolean z) {
    }

    public void initializeBackgroundDrawable(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
    }

    public boolean isOrWillBeHidden() {
    }

    public boolean isOrWillBeShown() {
    }

    public void jumpDrawableToCurrentState() {
    }

    public void onAttachedToWindow() {
    }

    public void onCompatShadowChanged() {
    }

    public void onDetachedFromWindow() {
    }

    public void onDrawableStateChanged(int[] iArr) {
    }

    public void onElevationsChanged(float f2, float f3, float f4) {
    }

    public void onPaddingUpdated(@NonNull Rect rect) {
    }

    public void onPreDraw() {
    }

    public void onScaleChanged() {
    }

    public void onTranslationChanged() {
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
    }

    public void removeTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
    }

    public boolean requirePreDrawListener() {
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    public final void setElevation(float f2) {
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
    }

    public final void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public final void setHoveredFocusedTranslationZ(float f2) {
    }

    public final void setImageMatrixScale(float f2) {
    }

    public final void setMaxImageSize(int i2) {
    }

    public void setMinTouchTargetSize(int i2) {
    }

    public final void setPressedTranslationZ(float f2) {
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
    }

    public void setShadowPaddingEnabled(boolean z) {
    }

    public final void setShapeAppearance(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
    }

    public final void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
    }

    public boolean shouldAddPadding() {
    }

    public final boolean shouldExpandBoundsForA11y() {
    }

    public void show(@Nullable InternalVisibilityChangedListener internalVisibilityChangedListener, boolean z) {
    }

    public void updateFromViewRotation() {
    }

    public final void updateImageMatrixScale() {
    }

    public final void updatePadding() {
    }

    public void updateShapeElevation(float f2) {
    }
}
