package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MotionHelper extends ConstraintHelper implements Animatable, MotionLayout.TransitionListener {
    private float mProgress;
    private boolean mUseOnHide;
    private boolean mUseOnShow;
    public View[] views;

    public MotionHelper(Context context) {
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
    }

    public boolean isUseOnHide() {
    }

    public boolean isUsedOnShow() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i2, int i3, float f2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(MotionLayout motionLayout, int i2, int i3) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(MotionLayout motionLayout, int i2, boolean z, float f2) {
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float f2) {
    }

    public void setProgress(View view, float f2) {
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i2) {
    }
}
