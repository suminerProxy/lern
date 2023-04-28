package androidx.constraintlayout.solver;

import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    public static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    public int definitionId;
    public float[] goalStrengthVector;
    public int id;
    public boolean inGoal;
    public HashSet<ArrayRow> inRows;
    public boolean isFinalValue;
    public boolean isSynonym;
    public ArrayRow[] mClientEquations;
    public int mClientEquationsCount;
    private String mName;
    public Type mType;
    public int strength;
    public float[] strengthVector;
    public int synonym;
    public float synonymDelta;
    public int usageInRowCount;

    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type CONSTANT = null;
        public static final Type ERROR = null;
        public static final Type SLACK = null;
        public static final Type UNKNOWN = null;
        public static final Type UNRESTRICTED = null;

        private Type(String str, int i2) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    public SolverVariable(String str, Type type) {
    }

    private static String getUniqueName(Type type, String str) {
    }

    public static void increaseErrorId() {
    }

    public final void addToRow(ArrayRow arrayRow) {
    }

    public void clearStrengths() {
    }

    public String getName() {
    }

    public final void removeFromRow(ArrayRow arrayRow) {
    }

    public void reset() {
    }

    public void setFinalValue(LinearSystem linearSystem, float f2) {
    }

    public void setName(String str) {
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f2) {
    }

    public void setType(Type type, String str) {
    }

    public String strengthsToString() {
    }

    public String toString() {
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
    }

    public SolverVariable(Type type, String str) {
    }
}
