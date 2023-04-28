package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    private static final boolean DEBUG = false;
    public static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    public static int mycounter;
    private WeakReference<ConstraintAnchor> horizontalWrapMax;
    private WeakReference<ConstraintAnchor> horizontalWrapMin;
    public BasicMeasure mBasicMeasureSolver;
    public int mDebugSolverPassCount;
    public DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    private boolean mHeightMeasuredTooSmall;
    public ChainHead[] mHorizontalChainsArray;
    public int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    private boolean mIsRtl;
    public BasicMeasure.Measure mMeasure;
    public BasicMeasure.Measurer mMeasurer;
    public Metrics mMetrics;
    private int mOptimizationLevel;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public boolean mSkipSolver;
    public LinearSystem mSystem;
    public ChainHead[] mVerticalChainsArray;
    public int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    private boolean mWidthMeasuredTooSmall;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;
    private WeakReference<ConstraintAnchor> verticalWrapMax;
    private WeakReference<ConstraintAnchor> verticalWrapMin;

    public ConstraintWidgetContainer() {
    }

    private void addHorizontalChain(ConstraintWidget constraintWidget) {
    }

    private void addMaxWrap(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
    }

    private void addMinWrap(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
    }

    private void addVerticalChain(ConstraintWidget constraintWidget) {
    }

    private void resetChains() {
    }

    public void addChain(ConstraintWidget constraintWidget, int i2) {
    }

    public boolean addChildrenToSolver(LinearSystem linearSystem) {
    }

    public void addHorizontalWrapMaxVariable(ConstraintAnchor constraintAnchor) {
    }

    public void addHorizontalWrapMinVariable(ConstraintAnchor constraintAnchor) {
    }

    public void addVerticalWrapMaxVariable(ConstraintAnchor constraintAnchor) {
    }

    public void addVerticalWrapMinVariable(ConstraintAnchor constraintAnchor) {
    }

    public void defineTerminalWidgets() {
    }

    public boolean directMeasure(boolean z) {
    }

    public boolean directMeasureSetup(boolean z) {
    }

    public boolean directMeasureWithOrientation(boolean z, int i2) {
    }

    public void fillMetrics(Metrics metrics) {
    }

    public ArrayList<Guideline> getHorizontalGuidelines() {
    }

    public BasicMeasure.Measurer getMeasurer() {
    }

    public int getOptimizationLevel() {
    }

    public LinearSystem getSystem() {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String getType() {
    }

    public ArrayList<Guideline> getVerticalGuidelines() {
    }

    public boolean handlesInternalConstraints() {
    }

    public void invalidateGraph() {
    }

    public void invalidateMeasures() {
    }

    public boolean isHeightMeasuredTooSmall() {
    }

    public boolean isRtl() {
    }

    public boolean isWidthMeasuredTooSmall() {
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer
    public void layout() {
    }

    public long measure(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
    }

    public boolean optimizeFor(int i2) {
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void reset() {
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
    }

    public void setOptimizationLevel(int i2) {
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setRtl(boolean z) {
    }

    public void updateChildrenFromSolver(LinearSystem linearSystem, boolean[] zArr) {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromRuns(boolean z, boolean z2) {
    }

    public void updateHierarchy() {
    }

    public static boolean measure(ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure, int i2) {
    }

    public ConstraintWidgetContainer(int i2, int i3, int i4, int i5) {
    }

    public ConstraintWidgetContainer(int i2, int i3) {
    }

    public ConstraintWidgetContainer(String str, int i2, int i3) {
    }
}
