package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    public static final int DIMENSION_HORIZONTAL = 0;
    public static final int DIMENSION_VERTICAL = 1;
    public static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    public ArrayList<ConstraintAnchor> mAnchors;
    public ConstraintAnchor mBaseline;
    public int mBaselineDistance;
    public ConstraintAnchor mBottom;
    public boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    public ConstraintAnchor mCenterX;
    public ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public int mDistToBottom;
    public int mDistToLeft;
    public int mDistToRight;
    public int mDistToTop;
    public boolean mGroupsToSolver;
    public int mHeight;
    public float mHorizontalBiasPercent;
    public boolean mHorizontalChainFixedPosition;
    public int mHorizontalChainStyle;
    public ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    public boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public ConstraintAnchor mLeft;
    public boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    public ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    public int mMinHeight;
    public int mMinWidth;
    public ConstraintWidget[] mNextChainWidget;
    public int mOffsetX;
    public int mOffsetY;
    public ConstraintWidget mParent;
    public int mRelX;
    public int mRelY;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    public boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    public boolean mTopHasCentered;
    private String mType;
    public float mVerticalBiasPercent;
    public boolean mVerticalChainFixedPosition;
    public int mVerticalChainStyle;
    public ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    public boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    public int mWidth;
    public int mX;
    public int mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public int verticalGroup;
    public VerticalWidgetRun verticalRun;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = null;
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DimensionBehaviour {
        private static final /* synthetic */ DimensionBehaviour[] $VALUES = null;
        public static final DimensionBehaviour FIXED = null;
        public static final DimensionBehaviour MATCH_CONSTRAINT = null;
        public static final DimensionBehaviour MATCH_PARENT = null;
        public static final DimensionBehaviour WRAP_CONTENT = null;

        private DimensionBehaviour(String str, int i2) {
        }

        public static DimensionBehaviour valueOf(String str) {
        }

        public static DimensionBehaviour[] values() {
        }
    }

    public ConstraintWidget() {
    }

    private void addAnchors() {
    }

    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2, int i3, int i4, int i5, float f2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f3, boolean z11) {
    }

    private boolean isChainHead(int i2) {
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i2, boolean z) {
    }

    public boolean addFirst() {
    }

    public void addToSolver(LinearSystem linearSystem, boolean z) {
    }

    public boolean allowedInBarrier() {
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f2, int i2) {
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
    }

    public void createObjectVariables(LinearSystem linearSystem) {
    }

    public void ensureMeasureRequested() {
    }

    public void ensureWidgetRuns() {
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
    }

    public int getBaselineDistance() {
    }

    public float getBiasPercent(int i2) {
    }

    public int getBottom() {
    }

    public Object getCompanionWidget() {
    }

    public int getContainerItemSkip() {
    }

    public String getDebugName() {
    }

    public DimensionBehaviour getDimensionBehaviour(int i2) {
    }

    public float getDimensionRatio() {
    }

    public int getDimensionRatioSide() {
    }

    public boolean getHasBaseline() {
    }

    public int getHeight() {
    }

    public float getHorizontalBiasPercent() {
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
    }

    public int getHorizontalChainStyle() {
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
    }

    public int getHorizontalMargin() {
    }

    public int getLastHorizontalMeasureSpec() {
    }

    public int getLastVerticalMeasureSpec() {
    }

    public int getLeft() {
    }

    public int getLength(int i2) {
    }

    public int getMaxHeight() {
    }

    public int getMaxWidth() {
    }

    public int getMinHeight() {
    }

    public int getMinWidth() {
    }

    public ConstraintWidget getNextChainMember(int i2) {
    }

    public int getOptimizerWrapHeight() {
    }

    public int getOptimizerWrapWidth() {
    }

    public ConstraintWidget getParent() {
    }

    public ConstraintWidget getPreviousChainMember(int i2) {
    }

    public int getRelativePositioning(int i2) {
    }

    public int getRight() {
    }

    public int getRootX() {
    }

    public int getRootY() {
    }

    public WidgetRun getRun(int i2) {
    }

    public int getTop() {
    }

    public String getType() {
    }

    public float getVerticalBiasPercent() {
    }

    public ConstraintWidget getVerticalChainControlWidget() {
    }

    public int getVerticalChainStyle() {
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
    }

    public int getVerticalMargin() {
    }

    public int getVisibility() {
    }

    public int getWidth() {
    }

    public int getX() {
    }

    public int getY() {
    }

    public boolean hasBaseline() {
    }

    public boolean hasDanglingDimension(int i2) {
    }

    public boolean hasDependencies() {
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2, int i3) {
    }

    public boolean isHeightWrapContent() {
    }

    public boolean isInHorizontalChain() {
    }

    public boolean isInPlaceholder() {
    }

    public boolean isInVerticalChain() {
    }

    public boolean isInVirtualLayout() {
    }

    public boolean isMeasureRequested() {
    }

    public boolean isResolvedHorizontally() {
    }

    public boolean isResolvedVertically() {
    }

    public boolean isRoot() {
    }

    public boolean isSpreadHeight() {
    }

    public boolean isSpreadWidth() {
    }

    public boolean isWidthWrapContent() {
    }

    public boolean oppositeDimensionDependsOn(int i2) {
    }

    public boolean oppositeDimensionsTied() {
    }

    public void reset() {
    }

    public void resetAllConstraints() {
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
    }

    public void resetAnchors() {
    }

    public void resetFinalResolution() {
    }

    public void resetSolverVariables(Cache cache) {
    }

    public void setBaselineDistance(int i2) {
    }

    public void setCompanionWidget(Object obj) {
    }

    public void setContainerItemSkip(int i2) {
    }

    public void setDebugName(String str) {
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
    }

    public void setDimension(int i2, int i3) {
    }

    public void setDimensionRatio(String str) {
    }

    public void setFinalBaseline(int i2) {
    }

    public void setFinalFrame(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public void setFinalHorizontal(int i2, int i3) {
    }

    public void setFinalLeft(int i2) {
    }

    public void setFinalTop(int i2) {
    }

    public void setFinalVertical(int i2, int i3) {
    }

    public void setFrame(int i2, int i3, int i4, int i5) {
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i2) {
    }

    public void setHasBaseline(boolean z) {
    }

    public void setHeight(int i2) {
    }

    public void setHeightWrapContent(boolean z) {
    }

    public void setHorizontalBiasPercent(float f2) {
    }

    public void setHorizontalChainStyle(int i2) {
    }

    public void setHorizontalDimension(int i2, int i3) {
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
    }

    public void setHorizontalMatchStyle(int i2, int i3, int i4, float f2) {
    }

    public void setHorizontalWeight(float f2) {
    }

    public void setInBarrier(int i2, boolean z) {
    }

    public void setInPlaceholder(boolean z) {
    }

    public void setInVirtualLayout(boolean z) {
    }

    public void setLastMeasureSpec(int i2, int i3) {
    }

    public void setLength(int i2, int i3) {
    }

    public void setMaxHeight(int i2) {
    }

    public void setMaxWidth(int i2) {
    }

    public void setMeasureRequested(boolean z) {
    }

    public void setMinHeight(int i2) {
    }

    public void setMinWidth(int i2) {
    }

    public void setOffset(int i2, int i3) {
    }

    public void setOrigin(int i2, int i3) {
    }

    public void setParent(ConstraintWidget constraintWidget) {
    }

    public void setRelativePositioning(int i2, int i3) {
    }

    public void setType(String str) {
    }

    public void setVerticalBiasPercent(float f2) {
    }

    public void setVerticalChainStyle(int i2) {
    }

    public void setVerticalDimension(int i2, int i3) {
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
    }

    public void setVerticalMatchStyle(int i2, int i3, int i4, float f2) {
    }

    public void setVerticalWeight(float f2) {
    }

    public void setVisibility(int i2) {
    }

    public void setWidth(int i2) {
    }

    public void setWidthWrapContent(boolean z) {
    }

    public void setX(int i2) {
    }

    public void setY(int i2) {
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public String toString() {
    }

    public void updateFromRuns(boolean z, boolean z2) {
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2) {
    }

    public void setFrame(int i2, int i3, int i4) {
    }

    public void setDimensionRatio(float f2, int i2) {
    }

    public ConstraintWidget(String str) {
    }

    public ConstraintWidget(int i2, int i3, int i4, int i5) {
    }

    public ConstraintWidget(String str, int i2, int i3, int i4, int i5) {
    }

    public ConstraintWidget(int i2, int i3) {
    }

    public ConstraintWidget(String str, int i2, int i3) {
    }
}
