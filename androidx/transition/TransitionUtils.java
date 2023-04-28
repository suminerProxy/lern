package androidx.transition;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TransitionUtils {
    private static final boolean HAS_IS_ATTACHED_TO_WINDOW = false;
    private static final boolean HAS_OVERLAY = false;
    private static final boolean HAS_PICTURE_BITMAP = false;
    private static final int MAX_IMAGE_SIZE = 1048576;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MatrixEvaluator implements TypeEvaluator<Matrix> {
        public final float[] mTempEndValues;
        public final Matrix mTempMatrix;
        public final float[] mTempStartValues;

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        }

        /* renamed from: evaluate  reason: avoid collision after fix types in other method */
        public Matrix evaluate2(float f2, Matrix matrix, Matrix matrix2) {
        }
    }

    private TransitionUtils() {
    }

    public static View copyViewImage(ViewGroup viewGroup, View view, View view2) {
    }

    private static Bitmap createViewBitmap(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
    }

    public static Animator mergeAnimators(Animator animator, Animator animator2) {
    }
}
