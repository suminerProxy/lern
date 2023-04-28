package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = 0.0f;
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public ArcMotion() {
    }

    private static float toTangent(float f2) {
    }

    public float getMaximumAngle() {
    }

    public float getMinimumHorizontalAngle() {
    }

    public float getMinimumVerticalAngle() {
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f2, float f3, float f4, float f5) {
    }

    public void setMaximumAngle(float f2) {
    }

    public void setMinimumHorizontalAngle(float f2) {
    }

    public void setMinimumVerticalAngle(float f2) {
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
    }
}
