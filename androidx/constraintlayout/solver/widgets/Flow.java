package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mAlignedBiggestElementsInCols;
    private ConstraintWidget[] mAlignedBiggestElementsInRows;
    private int[] mAlignedDimensions;
    private ArrayList<WidgetsList> mChainList;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mDisplayedWidgetsCount;
    private float mFirstHorizontalBias;
    private int mFirstHorizontalStyle;
    private float mFirstVerticalBias;
    private int mFirstVerticalStyle;
    private int mHorizontalAlign;
    private float mHorizontalBias;
    private int mHorizontalGap;
    private int mHorizontalStyle;
    private float mLastHorizontalBias;
    private int mLastHorizontalStyle;
    private float mLastVerticalBias;
    private int mLastVerticalStyle;
    private int mMaxElementsWrap;
    private int mOrientation;
    private int mVerticalAlign;
    private float mVerticalBias;
    private int mVerticalGap;
    private int mVerticalStyle;
    private int mWrapMode;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class WidgetsList {
        private ConstraintWidget biggest;
        public int biggestDimension;
        private ConstraintAnchor mBottom;
        private int mCount;
        private int mHeight;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mNbMatchConstraintsWidgets;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private int mStartIndex;
        private ConstraintAnchor mTop;
        private int mWidth;
        public final /* synthetic */ Flow this$0;

        public WidgetsList(Flow flow, int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
        }

        public static /* synthetic */ ConstraintWidget access$2000(WidgetsList widgetsList) {
        }

        private void recomputeDimensions() {
        }

        public void add(ConstraintWidget constraintWidget) {
        }

        public void clear() {
        }

        public void createConstraints(boolean z, int i2, boolean z2) {
        }

        public int getHeight() {
        }

        public int getWidth() {
        }

        public void measureMatchConstraints(int i2) {
        }

        public void setStartIndex(int i2) {
        }

        public void setup(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i4, int i5, int i6, int i7) {
        }
    }

    public static /* synthetic */ int access$000(Flow flow) {
    }

    public static /* synthetic */ int access$100(Flow flow) {
    }

    public static /* synthetic */ int access$1000(Flow flow) {
    }

    public static /* synthetic */ float access$1100(Flow flow) {
    }

    public static /* synthetic */ int access$1200(Flow flow) {
    }

    public static /* synthetic */ float access$1300(Flow flow) {
    }

    public static /* synthetic */ float access$1400(Flow flow) {
    }

    public static /* synthetic */ int access$1500(Flow flow) {
    }

    public static /* synthetic */ float access$1600(Flow flow) {
    }

    public static /* synthetic */ int access$1700(Flow flow) {
    }

    public static /* synthetic */ float access$1800(Flow flow) {
    }

    public static /* synthetic */ int access$1900(Flow flow) {
    }

    public static /* synthetic */ int access$200(Flow flow, ConstraintWidget constraintWidget, int i2) {
    }

    public static /* synthetic */ int access$300(Flow flow, ConstraintWidget constraintWidget, int i2) {
    }

    public static /* synthetic */ int access$400(Flow flow) {
    }

    public static /* synthetic */ ConstraintWidget[] access$500(Flow flow) {
    }

    public static /* synthetic */ int access$600(Flow flow) {
    }

    public static /* synthetic */ int access$700(Flow flow) {
    }

    public static /* synthetic */ int access$800(Flow flow) {
    }

    public static /* synthetic */ float access$900(Flow flow) {
    }

    private void createAlignedConstraints(boolean z) {
    }

    private final int getWidgetHeight(ConstraintWidget constraintWidget, int i2) {
    }

    private final int getWidgetWidth(ConstraintWidget constraintWidget, int i2) {
    }

    private void measureAligned(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i4, int[] iArr) {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
    }

    @Override // androidx.constraintlayout.solver.widgets.HelperWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
    }

    @Override // androidx.constraintlayout.solver.widgets.VirtualLayout
    public void measure(int i2, int i3, int i4, int i5) {
    }

    public void setFirstHorizontalBias(float f2) {
    }

    public void setFirstHorizontalStyle(int i2) {
    }

    public void setFirstVerticalBias(float f2) {
    }

    public void setFirstVerticalStyle(int i2) {
    }

    public void setHorizontalAlign(int i2) {
    }

    public void setHorizontalBias(float f2) {
    }

    public void setHorizontalGap(int i2) {
    }

    public void setHorizontalStyle(int i2) {
    }

    public void setLastHorizontalBias(float f2) {
    }

    public void setLastHorizontalStyle(int i2) {
    }

    public void setLastVerticalBias(float f2) {
    }

    public void setLastVerticalStyle(int i2) {
    }

    public void setMaxElementsWrap(int i2) {
    }

    public void setOrientation(int i2) {
    }

    public void setVerticalAlign(int i2) {
    }

    public void setVerticalBias(float f2) {
    }

    public void setVerticalGap(int i2) {
    }

    public void setVerticalStyle(int i2) {
    }

    public void setWrapMode(int i2) {
    }
}
