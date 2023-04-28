package androidx.constraintlayout.solver;

import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    public static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE;
    public GoalVariableAccessor accessor;
    private SolverVariable[] arrayGoals;
    public Cache mCache;
    private int numGoals;
    private SolverVariable[] sortArray;

    /* renamed from: androidx.constraintlayout.solver.PriorityGoalRow$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Comparator<SolverVariable> {
        public final /* synthetic */ PriorityGoalRow this$0;

        public AnonymousClass1(PriorityGoalRow priorityGoalRow) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(SolverVariable solverVariable, SolverVariable solverVariable2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class GoalVariableAccessor implements Comparable {
        public PriorityGoalRow row;
        public final /* synthetic */ PriorityGoalRow this$0;
        public SolverVariable variable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow, PriorityGoalRow priorityGoalRow2) {
        }

        public void add(SolverVariable solverVariable) {
        }

        public boolean addToGoal(SolverVariable solverVariable, float f2) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
        }

        public void init(SolverVariable solverVariable) {
        }

        public final boolean isNegative() {
        }

        public final boolean isNull() {
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
        }

        public void reset() {
        }

        public String toString() {
        }
    }

    public PriorityGoalRow(Cache cache) {
    }

    public static /* synthetic */ void access$000(PriorityGoalRow priorityGoalRow, SolverVariable solverVariable) {
    }

    private final void addToGoal(SolverVariable solverVariable) {
    }

    private final void removeGoal(SolverVariable solverVariable) {
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public void clear() {
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public boolean isEmpty() {
    }

    @Override // androidx.constraintlayout.solver.ArrayRow
    public String toString() {
    }

    @Override // androidx.constraintlayout.solver.ArrayRow, androidx.constraintlayout.solver.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
    }
}
