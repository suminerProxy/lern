package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ChangeTransform extends Transition {
    private static final Property<PathAnimatorMatrix, float[]> NON_TRANSLATIONS_PROPERTY = null;
    private static final String PROPNAME_INTERMEDIATE_MATRIX = "android:changeTransform:intermediateMatrix";
    private static final String PROPNAME_INTERMEDIATE_PARENT_MATRIX = "android:changeTransform:intermediateParentMatrix";
    private static final String PROPNAME_MATRIX = "android:changeTransform:matrix";
    private static final String PROPNAME_PARENT = "android:changeTransform:parent";
    private static final String PROPNAME_PARENT_MATRIX = "android:changeTransform:parentMatrix";
    private static final String PROPNAME_TRANSFORMS = "android:changeTransform:transforms";
    private static final boolean SUPPORTS_VIEW_REMOVAL_SUPPRESSION = false;
    private static final Property<PathAnimatorMatrix, PointF> TRANSLATIONS_PROPERTY = null;
    private static final String[] sTransitionProperties = null;
    private boolean mReparent;
    private Matrix mTempMatrix;
    public boolean mUseOverlay;

    /* renamed from: androidx.transition.ChangeTransform$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends Property<PathAnimatorMatrix, float[]> {
        public AnonymousClass1(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public float[] get2(PathAnimatorMatrix pathAnimatorMatrix) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends Property<PathAnimatorMatrix, PointF> {
        public AnonymousClass2(Class cls, String str) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public PointF get2(PathAnimatorMatrix pathAnimatorMatrix) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        private boolean mIsCanceled;
        private Matrix mTempMatrix;
        public final /* synthetic */ ChangeTransform this$0;
        public final /* synthetic */ Matrix val$finalEndMatrix;
        public final /* synthetic */ boolean val$handleParentChange;
        public final /* synthetic */ PathAnimatorMatrix val$pathAnimatorMatrix;
        public final /* synthetic */ Transforms val$transforms;
        public final /* synthetic */ View val$view;

        public AnonymousClass3(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, Transforms transforms, PathAnimatorMatrix pathAnimatorMatrix) {
        }

        private void setCurrentMatrix(Matrix matrix) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class GhostListener extends TransitionListenerAdapter {
        private GhostView mGhostView;
        private View mView;

        public GhostListener(View view, GhostView ghostView) {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PathAnimatorMatrix {
        private final Matrix mMatrix;
        private float mTranslationX;
        private float mTranslationY;
        private final float[] mValues;
        private final View mView;

        public PathAnimatorMatrix(View view, float[] fArr) {
        }

        private void setAnimationMatrix() {
        }

        public Matrix getMatrix() {
        }

        public void setTranslation(PointF pointF) {
        }

        public void setValues(float[] fArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Transforms {
        public final float mRotationX;
        public final float mRotationY;
        public final float mRotationZ;
        public final float mScaleX;
        public final float mScaleY;
        public final float mTranslationX;
        public final float mTranslationY;
        public final float mTranslationZ;

        public Transforms(View view) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public void restore(View view) {
        }
    }

    public ChangeTransform() {
    }

    private void captureValues(TransitionValues transitionValues) {
    }

    private void createGhostView(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
    }

    private ObjectAnimator createTransformAnimator(TransitionValues transitionValues, TransitionValues transitionValues2, boolean z) {
    }

    private boolean parentsMatch(ViewGroup viewGroup, ViewGroup viewGroup2) {
    }

    public static void setIdentityTransforms(View view) {
    }

    private void setMatricesForParent(TransitionValues transitionValues, TransitionValues transitionValues2) {
    }

    public static void setTransforms(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(@NonNull ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
    }

    public boolean getReparent() {
    }

    public boolean getReparentWithOverlay() {
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
    }

    public void setReparent(boolean z) {
    }

    public void setReparentWithOverlay(boolean z) {
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
    }
}
