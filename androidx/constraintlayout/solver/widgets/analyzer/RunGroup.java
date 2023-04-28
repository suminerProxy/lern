package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    public int direction;
    public boolean dual;
    public WidgetRun firstRun;
    public int groupIndex;
    public WidgetRun lastRun;
    public int position;
    public ArrayList<WidgetRun> runs;

    public RunGroup(WidgetRun widgetRun, int i2) {
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i2) {
    }

    private long traverseEnd(DependencyNode dependencyNode, long j2) {
    }

    private long traverseStart(DependencyNode dependencyNode, long j2) {
    }

    public void add(WidgetRun widgetRun) {
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
    }

    public void defineTerminalWidgets(boolean z, boolean z2) {
    }
}
