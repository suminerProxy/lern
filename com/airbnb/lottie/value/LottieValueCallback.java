package com.airbnb.lottie.value;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieValueCallback<T> {
    @Nullable
    private BaseKeyframeAnimation<?, ?> animation;
    private final LottieFrameInfo<T> frameInfo;
    @Nullable
    public T value;

    public LottieValueCallback() {
    }

    @Nullable
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T getValueInternal(float f2, float f3, T t, T t2, float f4, float f5, float f6) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
    }

    public final void setValue(@Nullable T t) {
    }

    public LottieValueCallback(@Nullable T t) {
    }
}
