package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.solver.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.solver.state.helpers.BarrierReference;
import androidx.constraintlayout.solver.state.helpers.GuidelineReference;
import androidx.constraintlayout.solver.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.solver.state.helpers.VerticalChainReference;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class State {
    public static final int CONSTRAINT_RATIO = 2;
    public static final int CONSTRAINT_SPREAD = 0;
    public static final int CONSTRAINT_WRAP = 1;
    public static final Integer PARENT = null;
    public static final int UNKNOWN = -1;
    public HashMap<Object, HelperReference> mHelperReferences;
    public final ConstraintReference mParent;
    public HashMap<Object, Reference> mReferences;
    private int numHelpers;

    /* renamed from: androidx.constraintlayout.solver.state.State$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Helper = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Chain {
        private static final /* synthetic */ Chain[] $VALUES = null;
        public static final Chain PACKED = null;
        public static final Chain SPREAD = null;
        public static final Chain SPREAD_INSIDE = null;

        private Chain(String str, int i2) {
        }

        public static Chain valueOf(String str) {
        }

        public static Chain[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Constraint {
        private static final /* synthetic */ Constraint[] $VALUES = null;
        public static final Constraint BASELINE_TO_BASELINE = null;
        public static final Constraint BOTTOM_TO_BOTTOM = null;
        public static final Constraint BOTTOM_TO_TOP = null;
        public static final Constraint CENTER_HORIZONTALLY = null;
        public static final Constraint CENTER_VERTICALLY = null;
        public static final Constraint END_TO_END = null;
        public static final Constraint END_TO_START = null;
        public static final Constraint LEFT_TO_LEFT = null;
        public static final Constraint LEFT_TO_RIGHT = null;
        public static final Constraint RIGHT_TO_LEFT = null;
        public static final Constraint RIGHT_TO_RIGHT = null;
        public static final Constraint START_TO_END = null;
        public static final Constraint START_TO_START = null;
        public static final Constraint TOP_TO_BOTTOM = null;
        public static final Constraint TOP_TO_TOP = null;

        private Constraint(String str, int i2) {
        }

        public static Constraint valueOf(String str) {
        }

        public static Constraint[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Direction {
        private static final /* synthetic */ Direction[] $VALUES = null;
        public static final Direction BOTTOM = null;
        public static final Direction END = null;
        public static final Direction LEFT = null;
        public static final Direction RIGHT = null;
        public static final Direction START = null;
        public static final Direction TOP = null;

        private Direction(String str, int i2) {
        }

        public static Direction valueOf(String str) {
        }

        public static Direction[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Helper {
        private static final /* synthetic */ Helper[] $VALUES = null;
        public static final Helper ALIGN_HORIZONTALLY = null;
        public static final Helper ALIGN_VERTICALLY = null;
        public static final Helper BARRIER = null;
        public static final Helper FLOW = null;
        public static final Helper HORIZONTAL_CHAIN = null;
        public static final Helper LAYER = null;
        public static final Helper VERTICAL_CHAIN = null;

        private Helper(String str, int i2) {
        }

        public static Helper valueOf(String str) {
        }

        public static Helper[] values() {
        }
    }

    private String createHelperKey() {
    }

    public void apply(ConstraintWidgetContainer constraintWidgetContainer) {
    }

    public BarrierReference barrier(Object obj, Direction direction) {
    }

    public AlignHorizontallyReference centerHorizontally(Object... objArr) {
    }

    public AlignVerticallyReference centerVertically(Object... objArr) {
    }

    public ConstraintReference constraints(Object obj) {
    }

    public int convertDimension(Object obj) {
    }

    public ConstraintReference createConstraintReference(Object obj) {
    }

    public void directMapping() {
    }

    public GuidelineReference guideline(Object obj, int i2) {
    }

    public State height(Dimension dimension) {
    }

    public HelperReference helper(Object obj, Helper helper) {
    }

    public HorizontalChainReference horizontalChain(Object... objArr) {
    }

    public GuidelineReference horizontalGuideline(Object obj) {
    }

    public void map(Object obj, Object obj2) {
    }

    public Reference reference(Object obj) {
    }

    public void reset() {
    }

    public State setHeight(Dimension dimension) {
    }

    public State setWidth(Dimension dimension) {
    }

    public VerticalChainReference verticalChain(Object... objArr) {
    }

    public GuidelineReference verticalGuideline(Object obj) {
    }

    public State width(Dimension dimension) {
    }
}
