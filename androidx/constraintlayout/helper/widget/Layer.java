package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Layer extends ConstraintHelper {
    private static final String TAG = "Layer";
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;
    public float mComputedCenterX;
    public float mComputedCenterY;
    public float mComputedMaxX;
    public float mComputedMaxY;
    public float mComputedMinX;
    public float mComputedMinY;
    public ConstraintLayout mContainer;
    private float mGroupRotateAngle;
    public boolean mNeedBounds;
    private float mRotationCenterX;
    private float mRotationCenterY;
    private float mScaleX;
    private float mScaleY;
    private float mShiftX;
    private float mShiftY;
    public View[] mViews;

    public Layer(Context context) {
    }

    private void reCacheViews() {
    }

    private void transform() {
    }

    public void calcCenters() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void setElevation(float f2) {
    }

    @Override // android.view.View
    public void setPivotX(float f2) {
    }

    @Override // android.view.View
    public void setPivotY(float f2) {
    }

    @Override // android.view.View
    public void setRotation(float f2) {
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public Layer(Context context, AttributeSet attributeSet) {
    }

    public Layer(Context context, AttributeSet attributeSet, int i2) {
    }
}
