package androidx.constraintlayout.motion.widget;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.widget.ConstraintAttribute;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class SplineSet {
    private static final String TAG = "SplineSet";
    private int count;
    public CurveFit mCurveFit;
    public int[] mTimePoints;
    private String mType;
    public float[] mValues;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AlphaSet extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CustomSet extends SplineSet {
        public String mAttributeName;
        public SparseArray<ConstraintAttribute> mConstraintAttributeList;
        public float[] mTempValues;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setPoint(int i2, float f2) {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setup(int i2) {
        }

        public void setPoint(int i2, ConstraintAttribute constraintAttribute) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ElevationSet extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PathRotate extends SplineSet {
        public void setPathRotate(View view, float f2, double d2, double d3) {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PivotXset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PivotYset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ProgressSet extends SplineSet {
        public boolean mNoMethod;

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RotationSet extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RotationXset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RotationYset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleXset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ScaleYset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Sort {
        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[] fArr, int i2, int i3) {
        }

        private static int partition(int[] iArr, float[] fArr, int i2, int i3) {
        }

        private static void swap(int[] iArr, float[] fArr, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class TranslationXset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class TranslationYset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class TranslationZset extends SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(View view, float f2) {
        }
    }

    public static SplineSet makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
    }

    public static SplineSet makeSpline(String str) {
    }

    public float get(float f2) {
    }

    public CurveFit getCurveFit() {
    }

    public float getSlope(float f2) {
    }

    public void setPoint(int i2, float f2) {
    }

    public abstract void setProperty(View view, float f2);

    public void setType(String str) {
    }

    public void setup(int i2) {
    }

    public String toString() {
    }
}
