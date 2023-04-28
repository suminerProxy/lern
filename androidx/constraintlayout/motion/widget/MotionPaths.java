package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.LinkedHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    public static final int OFF_HEIGHT = 4;
    public static final int OFF_PATH_ROTATE = 5;
    public static final int OFF_POSITION = 0;
    public static final int OFF_WIDTH = 3;
    public static final int OFF_X = 1;
    public static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 3;
    public static final String TAG = "MotionPaths";
    public static String[] names;
    public LinkedHashMap<String, ConstraintAttribute> attributes;
    public float height;
    public int mDrawPath;
    public Easing mKeyFrameEasing;
    public int mMode;
    public int mPathMotionArc;
    public float mPathRotate;
    public float mProgress;
    public double[] mTempDelta;
    public double[] mTempValue;
    public float position;
    public float time;
    public float width;
    public float x;
    public float y;

    public MotionPaths() {
    }

    private boolean diff(float f2, float f3) {
    }

    private static final float xRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    private static final float yRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@NonNull MotionPaths motionPaths) {
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
    }

    public void fillStandard(double[] dArr, int[] iArr) {
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i2) {
    }

    public void getCenter(int[] iArr, double[] dArr, float[] fArr, int i2) {
    }

    public int getCustomData(String str, double[] dArr, int i2) {
    }

    public int getCustomDataCount(String str) {
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i2) {
    }

    public boolean hasCustomData(String str) {
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
    }

    public void initScreen(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
    }

    public void setBounds(float f2, float f3, float f4, float f5) {
    }

    public void setDpDt(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
    }

    public void setView(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(@NonNull MotionPaths motionPaths) {
    }

    public MotionPaths(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
    }
}
