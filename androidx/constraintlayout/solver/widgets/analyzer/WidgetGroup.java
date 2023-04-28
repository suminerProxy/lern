package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WidgetGroup {
    private static final boolean DEBUG = false;
    public static int count;
    public boolean authoritative;
    public int id;
    private int moveTo;
    public int orientation;
    public ArrayList<MeasureResult> results;
    public ArrayList<ConstraintWidget> widgets;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class MeasureResult {
        public int baseline;
        public int bottom;
        public int left;
        public int orientation;
        public int right;
        public final /* synthetic */ WidgetGroup this$0;

        /* renamed from: top  reason: collision with root package name */
        public int f26top;
        public WeakReference<ConstraintWidget> widgetRef;

        public MeasureResult(WidgetGroup widgetGroup, ConstraintWidget constraintWidget, LinearSystem linearSystem, int i2) {
        }

        public void apply() {
        }
    }

    public WidgetGroup(int i2) {
    }

    private boolean contains(ConstraintWidget constraintWidget) {
    }

    private String getOrientationString() {
    }

    private int measureWrap(int i2, ConstraintWidget constraintWidget) {
    }

    private int solverMeasure(LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i2) {
    }

    public boolean add(ConstraintWidget constraintWidget) {
    }

    public void apply() {
    }

    public void cleanup(ArrayList<WidgetGroup> arrayList) {
    }

    public void clear() {
    }

    public int getId() {
    }

    public int getOrientation() {
    }

    public boolean intersectWith(WidgetGroup widgetGroup) {
    }

    public boolean isAuthoritative() {
    }

    public void moveTo(int i2, WidgetGroup widgetGroup) {
    }

    public void setAuthoritative(boolean z) {
    }

    public void setOrientation(int i2) {
    }

    public int size() {
    }

    public String toString() {
    }

    public int measureWrap(LinearSystem linearSystem, int i2) {
    }
}
