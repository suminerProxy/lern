package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private ConstraintWidgetContainer container;
    private ConstraintWidgetContainer mContainer;
    public ArrayList<RunGroup> mGroups;
    private BasicMeasure.Measure mMeasure;
    private BasicMeasure.Measurer mMeasurer;
    private boolean mNeedBuildGraph;
    private boolean mNeedRedoMeasures;
    private ArrayList<WidgetRun> mRuns;
    private ArrayList<RunGroup> runGroups;

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
    }

    private void applyGroup(DependencyNode dependencyNode, int i2, int i3, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
    }

    private boolean basicMeasureWidgets(ConstraintWidgetContainer constraintWidgetContainer) {
    }

    private int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
    }

    private void displayGraph() {
    }

    private void findGroup(WidgetRun widgetRun, int i2, ArrayList<RunGroup> arrayList) {
    }

    private String generateChainDisplayGraph(ChainRun chainRun, String str) {
    }

    private String generateDisplayGraph(WidgetRun widgetRun, String str) {
    }

    private String generateDisplayNode(DependencyNode dependencyNode, boolean z, String str) {
    }

    private boolean isCenteredConnection(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
    }

    private void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i2, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i3) {
    }

    private String nodeDefinition(WidgetRun widgetRun) {
    }

    public void buildGraph() {
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
    }

    public boolean directMeasure(boolean z) {
    }

    public boolean directMeasureSetup(boolean z) {
    }

    public boolean directMeasureWithOrientation(boolean z, int i2) {
    }

    public void invalidateGraph() {
    }

    public void invalidateMeasures() {
    }

    public void measureWidgets() {
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
    }
}
