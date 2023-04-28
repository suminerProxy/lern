package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BaseKeyframeAnimation<K, A> {
    private float cachedEndProgress;
    @Nullable
    private A cachedGetValue;
    private float cachedStartDelayProgress;
    private boolean isDiscrete;
    private final KeyframesWrapper<K> keyframesWrapper;
    public final List<AnimationListener> listeners;
    public float progress;
    @Nullable
    public LottieValueCallback<A> valueCallback;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface AnimationListener {
        void onValueChanged();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class EmptyKeyframeWrapper<T> implements KeyframesWrapper<T> {
        private EmptyKeyframeWrapper() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public Keyframe<T> getCurrentKeyframe() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f2) {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f2) {
        }

        public /* synthetic */ EmptyKeyframeWrapper(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface KeyframesWrapper<T> {
        Keyframe<T> getCurrentKeyframe();

        @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
        float getEndProgress();

        @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f2);

        boolean isEmpty();

        boolean isValueChanged(float f2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class KeyframesWrapperImpl<T> implements KeyframesWrapper<T> {
        private Keyframe<T> cachedCurrentKeyframe;
        private float cachedInterpolatedProgress;
        @NonNull
        private Keyframe<T> currentKeyframe;
        private final List<? extends Keyframe<T>> keyframes;

        public KeyframesWrapperImpl(List<? extends Keyframe<T>> list) {
        }

        private Keyframe<T> findKeyframe(float f2) {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        @NonNull
        public Keyframe<T> getCurrentKeyframe() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f2) {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class SingleKeyframeWrapper<T> implements KeyframesWrapper<T> {
        private float cachedInterpolatedProgress;
        @NonNull
        private final Keyframe<T> keyframe;

        public SingleKeyframeWrapper(List<? extends Keyframe<T>> list) {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public Keyframe<T> getCurrentKeyframe() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f2) {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f2) {
        }
    }

    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    private float getStartDelayProgress() {
    }

    private static <T> KeyframesWrapper<T> wrap(List<? extends Keyframe<T>> list) {
    }

    public void addUpdateListener(AnimationListener animationListener) {
    }

    public Keyframe<K> getCurrentKeyframe() {
    }

    @FloatRange(from = ShadowDrawableWrapper.COS_45, to = 1.0d)
    public float getEndProgress() {
    }

    public float getInterpolatedCurrentKeyframeProgress() {
    }

    public float getLinearCurrentKeyframeProgress() {
    }

    public float getProgress() {
    }

    public A getValue() {
    }

    public abstract A getValue(Keyframe<K> keyframe, float f2);

    public void notifyListeners() {
    }

    public void setIsDiscrete() {
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public void setValueCallback(@Nullable LottieValueCallback<A> lottieValueCallback) {
    }
}
