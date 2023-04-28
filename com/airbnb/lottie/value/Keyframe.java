package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Keyframe<T> {
    private static final float UNSET_FLOAT = -3987645.8f;
    private static final int UNSET_INT = 784923401;
    @Nullable
    private final LottieComposition composition;
    @Nullable
    public Float endFrame;
    private float endProgress;
    @Nullable
    public T endValue;
    private float endValueFloat;
    private int endValueInt;
    @Nullable
    public final Interpolator interpolator;
    public PointF pathCp1;
    public PointF pathCp2;
    public final float startFrame;
    private float startProgress;
    @Nullable
    public final T startValue;
    private float startValueFloat;
    private int startValueInt;

    public Keyframe(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f2, @Nullable Float f3) {
    }

    public boolean containsProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }

    public float getEndProgress() {
    }

    public float getEndValueFloat() {
    }

    public int getEndValueInt() {
    }

    public float getStartProgress() {
    }

    public float getStartValueFloat() {
    }

    public int getStartValueInt() {
    }

    public boolean isStatic() {
    }

    public String toString() {
    }

    public Keyframe(T t) {
    }
}
