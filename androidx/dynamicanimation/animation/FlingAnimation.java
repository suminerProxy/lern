package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    private final DragForce mFlingForce;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction;
        private final DynamicAnimation.MassState mMassState;
        private float mVelocityThreshold;

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float f2, float f3) {
        }

        public float getFrictionScalar() {
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float f2, float f3) {
        }

        public void setFrictionScalar(float f2) {
        }

        public void setValueThreshold(float f2) {
        }

        public DynamicAnimation.MassState updateValueAndVelocity(float f2, float f3, long j2) {
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f2, float f3) {
    }

    public float getFriction() {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f2, float f3) {
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public /* bridge */ /* synthetic */ FlingAnimation setMaxValue(float f2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public /* bridge */ /* synthetic */ FlingAnimation setMinValue(float f2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public /* bridge */ /* synthetic */ FlingAnimation setStartVelocity(float f2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: setMaxValue  reason: avoid collision after fix types in other method */
    public FlingAnimation setMaxValue2(float f2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: setMinValue  reason: avoid collision after fix types in other method */
    public FlingAnimation setMinValue2(float f2) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: setStartVelocity  reason: avoid collision after fix types in other method */
    public FlingAnimation setStartVelocity2(float f2) {
    }

    public <K> FlingAnimation(K k2, FloatPropertyCompat<K> floatPropertyCompat) {
    }
}
