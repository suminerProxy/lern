package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ConstraintHelper extends View {
    public int mCount;
    public Helper mHelperWidget;
    public int[] mIds;
    private HashMap<Integer, String> mMap;
    public String mReferenceIds;
    public String mReferenceTags;
    public boolean mUseViewMeasure;
    private View[] mViews;
    public Context myContext;

    public ConstraintHelper(Context context) {
    }

    private void addID(String str) {
    }

    private void addRscID(int i2) {
    }

    private void addTag(String str) {
    }

    private int[] convertReferenceString(View view, String str) {
    }

    private int findId(String str) {
    }

    public void addView(View view) {
    }

    public void applyLayoutFeatures(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
    }

    public View[] getViews(ConstraintLayout constraintLayout) {
    }

    public void init(AttributeSet attributeSet) {
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void removeView(View view) {
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
    }

    public void setIds(String str) {
    }

    public void setReferenceTags(String str) {
    }

    public void setReferencedIds(int[] iArr) {
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public void updatePreLayout(ConstraintLayout constraintLayout) {
    }

    public void validateParams() {
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
    }

    public void applyLayoutFeatures() {
    }

    private int findId(ConstraintLayout constraintLayout, String str) {
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i2) {
    }

    public void updatePreLayout(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray<ConstraintWidget> sparseArray) {
    }
}
