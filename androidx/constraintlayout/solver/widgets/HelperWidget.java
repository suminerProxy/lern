package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] mWidgets;
    public int mWidgetsCount;

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void add(ConstraintWidget constraintWidget) {
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i2, WidgetGroup widgetGroup) {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
    }

    public int findGroupInDependents(int i2) {
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void removeAllIds() {
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
