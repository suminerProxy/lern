package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MotionController {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private int MAX_DIMENSION;
    public String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    public String mConstraintTag;
    private int mCurveFitType;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    private MotionPaths mEndMotionPath;
    private MotionConstrainedPoint mEndPoint;
    public int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private ArrayList<Key> mKeyList;
    private KeyTrigger[] mKeyTriggers;
    private ArrayList<MotionPaths> mMotionPaths;
    public float mMotionStagger;
    private int mPathMotionArc;
    private CurveFit[] mSpline;
    public float mStaggerOffset;
    public float mStaggerScale;
    private MotionPaths mStartMotionPath;
    private MotionConstrainedPoint mStartPoint;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    private float[] mValuesBuff;
    private float[] mVelocity;
    public View mView;

    public MotionController(View view) {
    }

    private float getAdjustedPosition(float f2, float[] fArr) {
    }

    private float getPreCycleDistance() {
    }

    private void insertKey(MotionPaths motionPaths) {
    }

    private void readView(MotionPaths motionPaths) {
    }

    public void addKey(Key key) {
    }

    public void addKeys(ArrayList<Key> arrayList) {
    }

    public void buildBounds(float[] fArr, int i2) {
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
    }

    public int buildKeyFrames(float[] fArr, int[] iArr) {
    }

    public void buildPath(float[] fArr, int i2) {
    }

    public void buildRect(float f2, float[] fArr, int i2) {
    }

    public void buildRectangles(float[] fArr, int i2) {
    }

    public int getAttributeValues(String str, float[] fArr, int i2) {
    }

    public void getDpDt(float f2, float f3, float f4, float[] fArr) {
    }

    public int getDrawPath() {
    }

    public float getFinalX() {
    }

    public float getFinalY() {
    }

    public MotionPaths getKeyFrame(int i2) {
    }

    public int getKeyFrameInfo(int i2, int[] iArr) {
    }

    public float getKeyFrameParameter(int i2, float f2, float f3) {
    }

    public KeyPositionBase getPositionKeyframe(int i2, int i3, float f2, float f3) {
    }

    public void getPostLayoutDvDp(float f2, int i2, int i3, float f3, float f4, float[] fArr) {
    }

    public float getStartX() {
    }

    public float getStartY() {
    }

    public int getkeyFramePositions(int[] iArr, float[] fArr) {
    }

    public boolean interpolate(View view, float f2, long j2, KeyCache keyCache) {
    }

    public String name() {
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f2, float f3, String[] strArr, float[] fArr) {
    }

    public void setDrawPath(int i2) {
    }

    public void setEndState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
    }

    public void setPathMotionArc(int i2) {
    }

    public void setStartCurrentState(View view) {
    }

    public void setStartState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
    }

    public void setView(View view) {
    }

    public void setup(int i2, int i3, float f2, long j2) {
    }

    public String toString() {
    }
}
