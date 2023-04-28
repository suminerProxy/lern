package androidx.dynamicanimation.animation;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {
    private static final float UNSET = Float.MAX_VALUE;
    private boolean mEndRequested;
    private float mPendingPosition;
    private SpringForce mSpring;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
    }

    private void sanityCheck() {
    }

    public void animateToFinalPosition(float f2) {
    }

    public boolean canSkipToEnd() {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f2, float f3) {
    }

    public SpringForce getSpring() {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f2, float f3) {
    }

    public SpringAnimation setSpring(SpringForce springForce) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f2) {
    }

    public void skipToEnd() {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j2) {
    }

    public <K> SpringAnimation(K k2, FloatPropertyCompat<K> floatPropertyCompat) {
    }

    public <K> SpringAnimation(K k2, FloatPropertyCompat<K> floatPropertyCompat, float f2) {
    }
}
