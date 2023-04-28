package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ChangeImageTransform extends Transition {
    private static final Property<ImageView, Matrix> ANIMATED_TRANSFORM_PROPERTY = null;
    private static final TypeEvaluator<Matrix> NULL_MATRIX_EVALUATOR = null;
    private static final String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
    private static final String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
    private static final String[] sTransitionProperties = null;

    /* renamed from: androidx.transition.ChangeImageTransform$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements TypeEvaluator<Matrix> {
        /* renamed from: evaluate  reason: avoid collision after fix types in other method */
        public Matrix evaluate2(float f2, Matrix matrix, Matrix matrix2) {
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 extends Property<ImageView, Matrix> {
        public AnonymousClass2(Class cls, String str) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Matrix get2(ImageView imageView) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(ImageView imageView, Matrix matrix) {
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = null;
    }

    public ChangeImageTransform() {
    }

    private void captureValues(TransitionValues transitionValues) {
    }

    private static Matrix centerCropMatrix(ImageView imageView) {
    }

    @NonNull
    private static Matrix copyImageMatrix(@NonNull ImageView imageView) {
    }

    private ObjectAnimator createMatrixAnimator(ImageView imageView, Matrix matrix, Matrix matrix2) {
    }

    @NonNull
    private ObjectAnimator createNullAnimator(@NonNull ImageView imageView) {
    }

    private static Matrix fitXYMatrix(ImageView imageView) {
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

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
    }
}
