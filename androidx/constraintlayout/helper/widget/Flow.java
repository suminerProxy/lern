package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.VirtualLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.solver.widgets.Flow mFlow;

    public Flow(Context context) {
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i2, int i3) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
    }

    public void setFirstHorizontalBias(float f2) {
    }

    public void setFirstHorizontalStyle(int i2) {
    }

    public void setFirstVerticalBias(float f2) {
    }

    public void setFirstVerticalStyle(int i2) {
    }

    public void setHorizontalAlign(int i2) {
    }

    public void setHorizontalBias(float f2) {
    }

    public void setHorizontalGap(int i2) {
    }

    public void setHorizontalStyle(int i2) {
    }

    public void setMaxElementsWrap(int i2) {
    }

    public void setOrientation(int i2) {
    }

    public void setPadding(int i2) {
    }

    public void setPaddingBottom(int i2) {
    }

    public void setPaddingLeft(int i2) {
    }

    public void setPaddingRight(int i2) {
    }

    public void setPaddingTop(int i2) {
    }

    public void setVerticalAlign(int i2) {
    }

    public void setVerticalBias(float f2) {
    }

    public void setVerticalGap(int i2) {
    }

    public void setVerticalStyle(int i2) {
    }

    public void setWrapMode(int i2) {
    }

    public Flow(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.solver.widgets.VirtualLayout virtualLayout, int i2, int i3) {
    }

    public Flow(Context context, AttributeSet attributeSet, int i2) {
    }
}
