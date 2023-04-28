package androidx.palette.graphics;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowDrawableWrapper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Target {
    public static final Target DARK_MUTED = null;
    public static final Target DARK_VIBRANT = null;
    public static final int INDEX_MAX = 2;
    public static final int INDEX_MIN = 0;
    public static final int INDEX_TARGET = 1;
    public static final int INDEX_WEIGHT_LUMA = 1;
    public static final int INDEX_WEIGHT_POP = 2;
    public static final int INDEX_WEIGHT_SAT = 0;
    public static final Target LIGHT_MUTED = null;
    public static final Target LIGHT_VIBRANT = null;
    private static final float MAX_DARK_LUMA = 0.45f;
    private static final float MAX_MUTED_SATURATION = 0.4f;
    private static final float MAX_NORMAL_LUMA = 0.7f;
    private static final float MIN_LIGHT_LUMA = 0.55f;
    private static final float MIN_NORMAL_LUMA = 0.3f;
    private static final float MIN_VIBRANT_SATURATION = 0.35f;
    public static final Target MUTED = null;
    private static final float TARGET_DARK_LUMA = 0.26f;
    private static final float TARGET_LIGHT_LUMA = 0.74f;
    private static final float TARGET_MUTED_SATURATION = 0.3f;
    private static final float TARGET_NORMAL_LUMA = 0.5f;
    private static final float TARGET_VIBRANT_SATURATION = 1.0f;
    public static final Target VIBRANT = null;
    private static final float WEIGHT_LUMA = 0.52f;
    private static final float WEIGHT_POPULATION = 0.24f;
    private static final float WEIGHT_SATURATION = 0.24f;
    public boolean mIsExclusive;
    public final float[] mLightnessTargets;
    public final float[] mSaturationTargets;
    public final float[] mWeights;

    public Target() {
    }

    private static void setDefaultDarkLightnessValues(Target target) {
    }

    private static void setDefaultLightLightnessValues(Target target) {
    }

    private static void setDefaultMutedSaturationValues(Target target) {
    }

    private static void setDefaultNormalLightnessValues(Target target) {
    }

    private static void setDefaultVibrantSaturationValues(Target target) {
    }

    private void setDefaultWeights() {
    }

    private static void setTargetDefaultValues(float[] fArr) {
    }

    public float getLightnessWeight() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getMaximumLightness() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getMaximumSaturation() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getMinimumLightness() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getMinimumSaturation() {
    }

    public float getPopulationWeight() {
    }

    public float getSaturationWeight() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getTargetLightness() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getTargetSaturation() {
    }

    public boolean isExclusive() {
    }

    public void normalizeWeights() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        private final Target mTarget;

        public Builder() {
        }

        @NonNull
        public Target build() {
        }

        @NonNull
        public Builder setExclusive(boolean z) {
        }

        @NonNull
        public Builder setLightnessWeight(@FloatRange(from = 0.0d) float f2) {
        }

        @NonNull
        public Builder setMaximumLightness(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        }

        @NonNull
        public Builder setMaximumSaturation(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        }

        @NonNull
        public Builder setMinimumLightness(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        }

        @NonNull
        public Builder setMinimumSaturation(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        }

        @NonNull
        public Builder setPopulationWeight(@FloatRange(from = 0.0d) float f2) {
        }

        @NonNull
        public Builder setSaturationWeight(@FloatRange(from = 0.0d) float f2) {
        }

        @NonNull
        public Builder setTargetLightness(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        }

        @NonNull
        public Builder setTargetSaturation(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        }

        public Builder(@NonNull Target target) {
        }
    }

    public Target(@NonNull Target target) {
    }
}
