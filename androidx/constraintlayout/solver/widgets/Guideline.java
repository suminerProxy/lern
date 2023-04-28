package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Guideline extends ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNWON = -1;
    public static final int VERTICAL = 1;
    private ConstraintAnchor mAnchor;
    private int mMinimumPosition;
    private int mOrientation;
    public int mRelativeBegin;
    public int mRelativeEnd;
    public float mRelativePercent;
    private boolean resolved;

    /* renamed from: androidx.constraintlayout.solver.widgets.Guideline$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = null;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
    }

    public void cyclePosition() {
    }

    public ConstraintAnchor getAnchor() {
    }

    public int getOrientation() {
    }

    public int getRelativeBegin() {
    }

    public int getRelativeBehaviour() {
    }

    public int getRelativeEnd() {
    }

    public float getRelativePercent() {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String getType() {
    }

    public void inferRelativeBeginPosition() {
    }

    public void inferRelativeEndPosition() {
    }

    public void inferRelativePercentPosition() {
    }

    public boolean isPercent() {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
    }

    public void setFinalValue(int i2) {
    }

    public void setGuideBegin(int i2) {
    }

    public void setGuideEnd(int i2) {
    }

    public void setGuidePercent(int i2) {
    }

    public void setMinimumPosition(int i2) {
    }

    public void setOrientation(int i2) {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromSolver(LinearSystem linearSystem, boolean z) {
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
    }

    public void setGuidePercent(float f2) {
    }
}
