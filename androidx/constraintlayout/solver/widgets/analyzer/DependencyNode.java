package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DependencyNode implements Dependency {
    public boolean delegateToWidgetRun;
    public List<Dependency> dependencies;
    public int margin;
    public DimensionDependency marginDependency;
    public int marginFactor;
    public boolean readyToSolve;
    public boolean resolved;
    public WidgetRun run;
    public List<DependencyNode> targets;
    public Type type;
    public Dependency updateDelegate;
    public int value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type BASELINE = null;
        public static final Type BOTTOM = null;
        public static final Type HORIZONTAL_DIMENSION = null;
        public static final Type LEFT = null;
        public static final Type RIGHT = null;
        public static final Type TOP = null;
        public static final Type UNKNOWN = null;
        public static final Type VERTICAL_DIMENSION = null;

        private Type(String str, int i2) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
    }

    public void addDependency(Dependency dependency) {
    }

    public void clear() {
    }

    public String name() {
    }

    public void resolve(int i2) {
    }

    public String toString() {
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }
}
