package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class WidgetRun implements Dependency {
    public DimensionDependency dimension;
    public ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public DependencyNode end;
    public RunType mRunType;
    public int matchConstraintsType;
    public int orientation;
    public boolean resolved;
    public RunGroup runGroup;
    public DependencyNode start;
    public ConstraintWidget widget;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class RunType {
        private static final /* synthetic */ RunType[] $VALUES = null;
        public static final RunType CENTER = null;
        public static final RunType END = null;
        public static final RunType NONE = null;
        public static final RunType START = null;

        private RunType(String str, int i2) {
        }

        public static RunType valueOf(String str) {
        }

        public static RunType[] values() {
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
    }

    private void resolveDimension(int i2, int i3) {
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2) {
    }

    public abstract void apply();

    public abstract void applyToWidget();

    public abstract void clear();

    public final int getLimitedDimension(int i2, int i3) {
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
    }

    public long getWrapDimension() {
    }

    public boolean isCenterConnection() {
    }

    public boolean isDimensionResolved() {
    }

    public boolean isResolved() {
    }

    public abstract void reset();

    public abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
    }

    public void updateRunEnd(Dependency dependency) {
    }

    public void updateRunStart(Dependency dependency) {
    }

    public long wrapSize(int i2) {
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i2, DimensionDependency dimensionDependency) {
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i2) {
    }
}
