package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    private static final int UNSET_GONE_MARGIN = -1;
    private HashSet<ConstraintAnchor> mDependents;
    private int mFinalValue;
    public int mGoneMargin;
    private boolean mHasFinalValue;
    public int mMargin;
    public final ConstraintWidget mOwner;
    public SolverVariable mSolverVariable;
    public ConstraintAnchor mTarget;
    public final Type mType;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type BASELINE = null;
        public static final Type BOTTOM = null;
        public static final Type CENTER = null;
        public static final Type CENTER_X = null;
        public static final Type CENTER_Y = null;
        public static final Type LEFT = null;
        public static final Type NONE = null;
        public static final Type RIGHT = null;
        public static final Type TOP = null;

        private Type(String str, int i2) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
    }

    private boolean isConnectionToMe(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z) {
    }

    public void copyFrom(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
    }

    public void findDependents(int i2, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
    }

    public HashSet<ConstraintAnchor> getDependents() {
    }

    public int getFinalValue() {
    }

    public int getMargin() {
    }

    public final ConstraintAnchor getOpposite() {
    }

    public ConstraintWidget getOwner() {
    }

    public SolverVariable getSolverVariable() {
    }

    public ConstraintAnchor getTarget() {
    }

    public Type getType() {
    }

    public boolean hasCenteredDependents() {
    }

    public boolean hasDependents() {
    }

    public boolean hasFinalValue() {
    }

    public boolean isConnected() {
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
    }

    public boolean isSideAnchor() {
    }

    public boolean isSimilarDimensionConnection(ConstraintAnchor constraintAnchor) {
    }

    public boolean isValidConnection(ConstraintAnchor constraintAnchor) {
    }

    public boolean isVerticalAnchor() {
    }

    public void reset() {
    }

    public void resetFinalResolution() {
    }

    public void resetSolverVariable(Cache cache) {
    }

    public void setFinalValue(int i2) {
    }

    public void setGoneMargin(int i2) {
    }

    public void setMargin(int i2) {
    }

    public String toString() {
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget) {
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i2) {
    }
}
