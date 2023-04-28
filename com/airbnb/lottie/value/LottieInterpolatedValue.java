package com.airbnb.lottie.value;

import android.view.animation.Interpolator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class LottieInterpolatedValue<T> extends LottieValueCallback<T> {
    private final T endValue;
    private final Interpolator interpolator;
    private final T startValue;

    public LottieInterpolatedValue(T t, T t2) {
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
    }

    public abstract T interpolateValue(T t, T t2, float f2);

    public LottieInterpolatedValue(T t, T t2, Interpolator interpolator) {
    }
}
