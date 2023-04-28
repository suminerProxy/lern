package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    public static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    public static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    public static String[] names;
    private float alpha;
    private boolean applyElevation;
    public LinkedHashMap<String, ConstraintAttribute> attributes;
    private float elevation;
    private float height;
    private int mDrawPath;
    private Easing mKeyFrameEasing;
    public int mMode;
    private float mPathRotate;
    private float mPivotX;
    private float mPivotY;
    private float mProgress;
    public double[] mTempDelta;
    public double[] mTempValue;
    public int mVisibilityMode;
    private float position;
    private float rotation;
    private float rotationX;
    public float rotationY;
    private float scaleX;
    private float scaleY;
    private float translationX;
    private float translationY;
    private float translationZ;
    public int visibility;
    private float width;
    private float x;
    private float y;

    private boolean diff(float f2, float f3) {
    }

    public void addValues(HashMap<String, SplineSet> hashMap, int i2) {
    }

    public void applyParameters(View view) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
    }

    public void fillStandard(double[] dArr, int[] iArr) {
    }

    public int getCustomData(String str, double[] dArr, int i2) {
    }

    public int getCustomDataCount(String str) {
    }

    public boolean hasCustomData(String str) {
    }

    public void setBounds(float f2, float f3, float f4, float f5) {
    }

    public void setState(View view) {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(MotionConstrainedPoint motionConstrainedPoint) {
    }

    public void setState(ConstraintWidget constraintWidget, ConstraintSet constraintSet, int i2) {
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
    }
}
