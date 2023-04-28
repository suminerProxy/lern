package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    private static int POOL_SIZE = 1000;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    private int TABLE_SIZE;
    public boolean graphOptimizer;
    public boolean hasSimpleDefinition;
    private boolean[] mAlreadyTestedCandidates;
    public final Cache mCache;
    private Row mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    public int mNumColumns;
    public int mNumRows;
    private SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    public ArrayRow[] mRows;
    private Row mTempGoal;
    private HashMap<String, SolverVariable> mVariables;
    public int mVariablesID;
    public boolean newgraphOptimizer;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z);

        void updateFromSystem(LinearSystem linearSystem);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ValuesRow extends ArrayRow {
        public final /* synthetic */ LinearSystem this$0;

        public ValuesRow(LinearSystem linearSystem, Cache cache) {
        }
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String str) {
    }

    private void addError(ArrayRow arrayRow) {
    }

    private final void addRow(ArrayRow arrayRow) {
    }

    private void addSingleError(ArrayRow arrayRow, int i2) {
    }

    private void computeValues() {
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f2) {
    }

    private SolverVariable createVariable(String str, SolverVariable.Type type) {
    }

    private void displayRows() {
    }

    private void displaySolverVariables() {
    }

    private int enforceBFS(Row row) throws Exception {
    }

    private String getDisplaySize(int i2) {
    }

    private String getDisplayStrength(int i2) {
    }

    public static Metrics getMetrics() {
    }

    private void increaseTableSize() {
    }

    private final int optimize(Row row, boolean z) {
    }

    private void releaseRows() {
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f2, int i2) {
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f2, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i4) {
    }

    public void addConstraint(ArrayRow arrayRow) {
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, boolean z) {
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, boolean z) {
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f2, int i2) {
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i2) {
    }

    public final void cleanupRows() {
    }

    public SolverVariable createErrorVariable(int i2, String str) {
    }

    public SolverVariable createExtraVariable() {
    }

    public SolverVariable createObjectVariable(Object obj) {
    }

    public ArrayRow createRow() {
    }

    public SolverVariable createSlackVariable() {
    }

    public void displayReadableRows() {
    }

    public void displaySystemInformations() {
    }

    public void displayVariablesReadableRows() {
    }

    public void fillMetrics(Metrics metrics) {
    }

    public Cache getCache() {
    }

    public Row getGoal() {
    }

    public int getMemoryUsed() {
    }

    public int getNumEquations() {
    }

    public int getNumVariables() {
    }

    public int getObjectVariableValue(Object obj) {
    }

    public ArrayRow getRow(int i2) {
    }

    public float getValueFor(String str) {
    }

    public SolverVariable getVariable(String str, SolverVariable.Type type) {
    }

    public void minimize() throws Exception {
    }

    public void minimizeGoal(Row row) throws Exception {
    }

    public void removeRow(ArrayRow arrayRow) {
    }

    public void reset() {
    }

    public void addSingleError(ArrayRow arrayRow, int i2, int i3) {
    }

    public void addEquality(SolverVariable solverVariable, int i2) {
    }
}
