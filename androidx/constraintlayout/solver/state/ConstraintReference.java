package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstraintReference implements Reference {
    private Object key;
    public Object mBaselineToBaseline;
    public Object mBottomToBottom;
    public Object mBottomToTop;
    private ConstraintWidget mConstraintWidget;
    public Object mEndToEnd;
    public Object mEndToStart;
    public float mHorizontalBias;
    public int mHorizontalChainStyle;
    public Dimension mHorizontalDimension;
    public State.Constraint mLast;
    public Object mLeftToLeft;
    public Object mLeftToRight;
    public int mMarginBottom;
    public int mMarginBottomGone;
    public int mMarginEnd;
    public int mMarginEndGone;
    public int mMarginLeft;
    public int mMarginLeftGone;
    public int mMarginRight;
    public int mMarginRightGone;
    public int mMarginStart;
    public int mMarginStartGone;
    public int mMarginTop;
    public int mMarginTopGone;
    public Object mRightToLeft;
    public Object mRightToRight;
    public Object mStartToEnd;
    public Object mStartToStart;
    public final State mState;
    public Object mTopToBottom;
    public Object mTopToTop;
    public float mVerticalBias;
    public int mVerticalChainStyle;
    public Dimension mVerticalDimension;
    private Object mView;

    /* renamed from: androidx.constraintlayout.solver.state.ConstraintReference$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$state$State$Constraint = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;
        public final /* synthetic */ ConstraintReference this$0;

        public IncorrectConstraintException(ConstraintReference constraintReference, ArrayList<String> arrayList) {
        }

        public ArrayList<String> getErrors() {
        }

        @Override // java.lang.Throwable
        public String toString() {
        }
    }

    public ConstraintReference(State state) {
    }

    private void applyConnection(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
    }

    private void dereference() {
    }

    private Object get(Object obj) {
    }

    private ConstraintWidget getTarget(Object obj) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void apply() {
    }

    public ConstraintReference baseline() {
    }

    public ConstraintReference baselineToBaseline(Object obj) {
    }

    public ConstraintReference bias(float f2) {
    }

    public ConstraintReference bottom() {
    }

    public ConstraintReference bottomToBottom(Object obj) {
    }

    public ConstraintReference bottomToTop(Object obj) {
    }

    public ConstraintReference centerHorizontally(Object obj) {
    }

    public ConstraintReference centerVertically(Object obj) {
    }

    public ConstraintReference clear() {
    }

    public ConstraintReference clearHorizontal() {
    }

    public ConstraintReference clearVertical() {
    }

    public ConstraintWidget createConstraintWidget() {
    }

    public ConstraintReference end() {
    }

    public ConstraintReference endToEnd(Object obj) {
    }

    public ConstraintReference endToStart(Object obj) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public ConstraintWidget getConstraintWidget() {
    }

    public Dimension getHeight() {
    }

    public int getHorizontalChainStyle() {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public Object getKey() {
    }

    public int getVerticalChainStyle(int i2) {
    }

    public Object getView() {
    }

    public Dimension getWidth() {
    }

    public ConstraintReference height(Dimension dimension) {
    }

    public ConstraintReference horizontalBias(float f2) {
    }

    public ConstraintReference left() {
    }

    public ConstraintReference leftToLeft(Object obj) {
    }

    public ConstraintReference leftToRight(Object obj) {
    }

    public ConstraintReference margin(Object obj) {
    }

    public ConstraintReference marginGone(int i2) {
    }

    public ConstraintReference right() {
    }

    public ConstraintReference rightToLeft(Object obj) {
    }

    public ConstraintReference rightToRight(Object obj) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
    }

    public ConstraintReference setHeight(Dimension dimension) {
    }

    public void setHorizontalChainStyle(int i2) {
    }

    @Override // androidx.constraintlayout.solver.state.Reference
    public void setKey(Object obj) {
    }

    public void setVerticalChainStyle(int i2) {
    }

    public void setView(Object obj) {
    }

    public ConstraintReference setWidth(Dimension dimension) {
    }

    public ConstraintReference start() {
    }

    public ConstraintReference startToEnd(Object obj) {
    }

    public ConstraintReference startToStart(Object obj) {
    }

    public ConstraintReference top() {
    }

    public ConstraintReference topToBottom(Object obj) {
    }

    public ConstraintReference topToTop(Object obj) {
    }

    public void validate() throws IncorrectConstraintException {
    }

    public ConstraintReference verticalBias(float f2) {
    }

    public ConstraintReference width(Dimension dimension) {
    }

    public ConstraintReference margin(int i2) {
    }
}
