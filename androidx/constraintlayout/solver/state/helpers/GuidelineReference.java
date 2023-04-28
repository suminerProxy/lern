package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.Reference;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.Guideline;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GuidelineReference implements Reference {
    private Object key;
    private int mEnd;
    private Guideline mGuidelineWidget;
    private int mOrientation;
    private float mPercent;
    private int mStart;
    public final State mState;

    public GuidelineReference(State state) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void apply() {
    }

    public void end(Object obj) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public ConstraintWidget getConstraintWidget() {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public Object getKey() {
    }

    public int getOrientation() {
    }

    public void percent(float f2) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setKey(Object obj) {
    }

    public void setOrientation(int i2) {
    }

    public void start(Object obj) {
    }
}
