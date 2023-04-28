package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TransformKeyframeAnimation {
    @NonNull
    private BaseKeyframeAnimation<PointF, PointF> anchorPoint;
    @Nullable
    private BaseKeyframeAnimation<?, Float> endOpacity;
    private final Matrix matrix;
    @NonNull
    private BaseKeyframeAnimation<Integer, Integer> opacity;
    @NonNull
    private BaseKeyframeAnimation<?, PointF> position;
    @NonNull
    private BaseKeyframeAnimation<Float, Float> rotation;
    @NonNull
    private BaseKeyframeAnimation<ScaleXY, ScaleXY> scale;
    @Nullable
    private FloatKeyframeAnimation skew;
    @Nullable
    private FloatKeyframeAnimation skewAngle;
    private final Matrix skewMatrix1;
    private final Matrix skewMatrix2;
    private final Matrix skewMatrix3;
    private final float[] skewValues;
    @Nullable
    private BaseKeyframeAnimation<?, Float> startOpacity;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
    }

    private void clearSkewValues() {
    }

    public void addAnimationsToLayer(BaseLayer baseLayer) {
    }

    public void addListener(BaseKeyframeAnimation.AnimationListener animationListener) {
    }

    public <T> boolean applyValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
    }

    @Nullable
    public BaseKeyframeAnimation<?, Float> getEndOpacity() {
    }

    public Matrix getMatrix() {
    }

    public Matrix getMatrixForRepeater(float f2) {
    }

    @Nullable
    public BaseKeyframeAnimation<?, Integer> getOpacity() {
    }

    @Nullable
    public BaseKeyframeAnimation<?, Float> getStartOpacity() {
    }

    public void setProgress(float f2) {
    }
}
