package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_TO_BASELINE = 1;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    public static final int INVISIBLE = 4;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 82;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int[] VISIBILITY_FLAGS = null;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    private static SparseIntArray mapToConstant;
    private HashMap<Integer, Constraint> mConstraints;
    private boolean mForceId;
    private HashMap<String, ConstraintAttribute> mSavedAttributes;
    private boolean mValidate;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Constraint {
        public final Layout layout;
        public HashMap<String, ConstraintAttribute> mCustomConstraints;
        public int mViewId;
        public final Motion motion;
        public final PropertySet propertySet;
        public final Transform transform;

        public static /* synthetic */ void access$000(Constraint constraint, int i2, ConstraintLayout.LayoutParams layoutParams) {
        }

        public static /* synthetic */ void access$300(Constraint constraint, ConstraintHelper constraintHelper, int i2, Constraints.LayoutParams layoutParams) {
        }

        public static /* synthetic */ void access$400(Constraint constraint, int i2, Constraints.LayoutParams layoutParams) {
        }

        public static /* synthetic */ void access$500(Constraint constraint, String str, int i2) {
        }

        public static /* synthetic */ void access$600(Constraint constraint, String str, int i2) {
        }

        public static /* synthetic */ void access$700(Constraint constraint, String str, float f2) {
        }

        public static /* synthetic */ void access$800(Constraint constraint, String str, String str2) {
        }

        private void fillFrom(int i2, ConstraintLayout.LayoutParams layoutParams) {
        }

        private void fillFromConstraints(ConstraintHelper constraintHelper, int i2, Constraints.LayoutParams layoutParams) {
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
        }

        private void setColorValue(String str, int i2) {
        }

        private void setFloatValue(String str, float f2) {
        }

        private void setIntValue(String str, int i2) {
        }

        private void setStringValue(String str, String str2) {
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
        }

        /* renamed from: clone  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m2clone() throws CloneNotSupportedException {
        }

        public Constraint clone() {
        }

        private void fillFromConstraints(int i2, Constraints.LayoutParams layoutParams) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        private static final int UNUSED = 76;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray mapToConstant;
        public int baselineToBaseline;
        public int bottomMargin;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endMargin;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public int heightDefault;
        public int heightMax;
        public int heightMin;
        public float heightPercent;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftMargin;
        public int leftToLeft;
        public int leftToRight;
        public boolean mApply;
        public boolean mBarrierAllowsGoneWidgets;
        public int mBarrierDirection;
        public int mBarrierMargin;
        public String mConstraintTag;
        public int mHeight;
        public int mHelperType;
        public boolean mIsGuideline;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public int orientation;
        public int rightMargin;
        public int rightToLeft;
        public int rightToRight;
        public int startMargin;
        public int startToEnd;
        public int startToStart;
        public int topMargin;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int widthDefault;
        public int widthMax;
        public int widthMin;
        public float widthPercent;

        public void copyFrom(Layout layout) {
        }

        public void dump(MotionScene motionScene, StringBuilder sb) {
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Motion {
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 6;
        private static final int PATH_MOTION_ARC = 2;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray mapToConstant;
        public int mAnimateRelativeTo;
        public boolean mApply;
        public int mDrawPath;
        public float mMotionStagger;
        public int mPathMotionArc;
        public float mPathRotate;
        public String mTransitionEasing;

        public void copyFrom(Motion motion) {
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PropertySet {
        public float alpha;
        public boolean mApply;
        public float mProgress;
        public int mVisibilityMode;
        public int visibility;

        public void copyFrom(PropertySet propertySet) {
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray mapToConstant;
        public boolean applyElevation;
        public float elevation;
        public boolean mApply;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        public void copyFrom(Transform transform) {
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        }
    }

    public static /* synthetic */ int access$100(TypedArray typedArray, int i2, int i3) {
    }

    public static /* synthetic */ int[] access$200() {
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... strArr) {
    }

    private int[] convertReferenceString(View view, String str) {
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet) {
    }

    private Constraint get(int i2) {
    }

    private static int lookupID(TypedArray typedArray, int i2, int i3) {
    }

    private void populateConstraint(Context context, Constraint constraint, TypedArray typedArray) {
    }

    private String sideToString(int i2) {
    }

    private static String[] splitString(String str) {
    }

    public void addColorAttributes(String... strArr) {
    }

    public void addFloatAttributes(String... strArr) {
    }

    public void addIntAttributes(String... strArr) {
    }

    public void addStringAttributes(String... strArr) {
    }

    public void addToHorizontalChain(int i2, int i3, int i4) {
    }

    public void addToHorizontalChainRTL(int i2, int i3, int i4) {
    }

    public void addToVerticalChain(int i2, int i3, int i4) {
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
    }

    public void applyTo(ConstraintLayout constraintLayout) {
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
    }

    public void applyToInternal(ConstraintLayout constraintLayout, boolean z) {
    }

    public void applyToLayoutParams(int i2, ConstraintLayout.LayoutParams layoutParams) {
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
    }

    public void center(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
    }

    public void centerHorizontally(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
    }

    public void centerHorizontallyRtl(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
    }

    public void centerVertically(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
    }

    public void clear(int i2) {
    }

    public void clone(Context context, int i2) {
    }

    public void connect(int i2, int i3, int i4, int i5, int i6) {
    }

    public void constrainCircle(int i2, int i3, int i4, float f2) {
    }

    public void constrainDefaultHeight(int i2, int i3) {
    }

    public void constrainDefaultWidth(int i2, int i3) {
    }

    public void constrainHeight(int i2, int i3) {
    }

    public void constrainMaxHeight(int i2, int i3) {
    }

    public void constrainMaxWidth(int i2, int i3) {
    }

    public void constrainMinHeight(int i2, int i3) {
    }

    public void constrainMinWidth(int i2, int i3) {
    }

    public void constrainPercentHeight(int i2, float f2) {
    }

    public void constrainPercentWidth(int i2, float f2) {
    }

    public void constrainWidth(int i2, int i3) {
    }

    public void constrainedHeight(int i2, boolean z) {
    }

    public void constrainedWidth(int i2, boolean z) {
    }

    public void create(int i2, int i3) {
    }

    public void createBarrier(int i2, int i3, int i4, int... iArr) {
    }

    public void createHorizontalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
    }

    public void createHorizontalChainRtl(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
    }

    public void createVerticalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
    }

    public void dump(MotionScene motionScene, int... iArr) {
    }

    public boolean getApplyElevation(int i2) {
    }

    public Constraint getConstraint(int i2) {
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
    }

    public int getHeight(int i2) {
    }

    public int[] getKnownIds() {
    }

    public Constraint getParameters(int i2) {
    }

    public int[] getReferencedIds(int i2) {
    }

    public int getVisibility(int i2) {
    }

    public int getVisibilityMode(int i2) {
    }

    public int getWidth(int i2) {
    }

    public boolean isForceId() {
    }

    public void load(Context context, int i2) {
    }

    public void parseColorAttributes(Constraint constraint, String str) {
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
    }

    public void parseIntAttributes(Constraint constraint, String str) {
    }

    public void parseStringAttributes(Constraint constraint, String str) {
    }

    public void readFallback(ConstraintSet constraintSet) {
    }

    public void removeAttribute(String str) {
    }

    public void removeFromHorizontalChain(int i2) {
    }

    public void removeFromVerticalChain(int i2) {
    }

    public void setAlpha(int i2, float f2) {
    }

    public void setApplyElevation(int i2, boolean z) {
    }

    public void setBarrierType(int i2, int i3) {
    }

    public void setColorValue(int i2, String str, int i3) {
    }

    public void setDimensionRatio(int i2, String str) {
    }

    public void setEditorAbsoluteX(int i2, int i3) {
    }

    public void setEditorAbsoluteY(int i2, int i3) {
    }

    public void setElevation(int i2, float f2) {
    }

    public void setFloatValue(int i2, String str, float f2) {
    }

    public void setForceId(boolean z) {
    }

    public void setGoneMargin(int i2, int i3, int i4) {
    }

    public void setGuidelineBegin(int i2, int i3) {
    }

    public void setGuidelineEnd(int i2, int i3) {
    }

    public void setGuidelinePercent(int i2, float f2) {
    }

    public void setHorizontalBias(int i2, float f2) {
    }

    public void setHorizontalChainStyle(int i2, int i3) {
    }

    public void setHorizontalWeight(int i2, float f2) {
    }

    public void setIntValue(int i2, String str, int i3) {
    }

    public void setMargin(int i2, int i3, int i4) {
    }

    public void setReferencedIds(int i2, int... iArr) {
    }

    public void setRotation(int i2, float f2) {
    }

    public void setRotationX(int i2, float f2) {
    }

    public void setRotationY(int i2, float f2) {
    }

    public void setScaleX(int i2, float f2) {
    }

    public void setScaleY(int i2, float f2) {
    }

    public void setStringValue(int i2, String str, String str2) {
    }

    public void setTransformPivot(int i2, float f2, float f3) {
    }

    public void setTransformPivotX(int i2, float f2) {
    }

    public void setTransformPivotY(int i2, float f2) {
    }

    public void setTranslation(int i2, float f2, float f3) {
    }

    public void setTranslationX(int i2, float f2) {
    }

    public void setTranslationY(int i2, float f2) {
    }

    public void setTranslationZ(int i2, float f2) {
    }

    public void setValidateOnParse(boolean z) {
    }

    public void setVerticalBias(int i2, float f2) {
    }

    public void setVerticalChainStyle(int i2, int i3) {
    }

    public void setVerticalWeight(int i2, float f2) {
    }

    public void setVisibility(int i2, int i3) {
    }

    public void setVisibilityMode(int i2, int i3) {
    }

    private void createHorizontalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6, int i7, int i8) {
    }

    public void clear(int i2, int i3) {
    }

    public void clone(ConstraintSet constraintSet) {
    }

    public void centerHorizontally(int i2, int i3) {
    }

    public void centerHorizontallyRtl(int i2, int i3) {
    }

    public void centerVertically(int i2, int i3) {
    }

    public void clone(ConstraintLayout constraintLayout) {
    }

    public void load(Context context, XmlPullParser xmlPullParser) {
    }

    public void readFallback(ConstraintLayout constraintLayout) {
    }

    public void clone(Constraints constraints) {
    }

    public void connect(int i2, int i3, int i4, int i5) {
    }
}
