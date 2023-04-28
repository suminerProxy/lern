package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ChainHead {
    private boolean mDefined;
    public ConstraintWidget mFirst;
    public ConstraintWidget mFirstMatchConstraintWidget;
    public ConstraintWidget mFirstVisibleWidget;
    public boolean mHasComplexMatchWeights;
    public boolean mHasDefinedWeights;
    public boolean mHasRatio;
    public boolean mHasUndefinedWeights;
    public ConstraintWidget mHead;
    private boolean mIsRtl;
    public ConstraintWidget mLast;
    public ConstraintWidget mLastMatchConstraintWidget;
    public ConstraintWidget mLastVisibleWidget;
    public boolean mOptimizable;
    private int mOrientation;
    public int mTotalMargins;
    public int mTotalSize;
    public float mTotalWeight;
    public int mVisibleWidgets;
    public ArrayList<ConstraintWidget> mWeightedMatchConstraintsWidgets;
    public int mWidgetsCount;
    public int mWidgetsMatchCount;

    public ChainHead(ConstraintWidget constraintWidget, int i2, boolean z) {
    }

    private void defineChainProperties() {
    }

    private static boolean isMatchConstraintEqualityCandidate(ConstraintWidget constraintWidget, int i2) {
    }

    public void define() {
    }

    public ConstraintWidget getFirst() {
    }

    public ConstraintWidget getFirstMatchConstraintWidget() {
    }

    public ConstraintWidget getFirstVisibleWidget() {
    }

    public ConstraintWidget getHead() {
    }

    public ConstraintWidget getLast() {
    }

    public ConstraintWidget getLastMatchConstraintWidget() {
    }

    public ConstraintWidget getLastVisibleWidget() {
    }

    public float getTotalWeight() {
    }
}
