package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {
    @Nullable
    private final AnimatablePathValue anchorPoint;
    @Nullable
    private final AnimatableFloatValue endOpacity;
    @Nullable
    private final AnimatableIntegerValue opacity;
    @Nullable
    private final AnimatableValue<PointF, PointF> position;
    @Nullable
    private final AnimatableFloatValue rotation;
    @Nullable
    private final AnimatableScaleValue scale;
    @Nullable
    private final AnimatableFloatValue skew;
    @Nullable
    private final AnimatableFloatValue skewAngle;
    @Nullable
    private final AnimatableFloatValue startOpacity;

    public AnimatableTransform() {
    }

    public TransformKeyframeAnimation createAnimation() {
    }

    @Nullable
    public AnimatablePathValue getAnchorPoint() {
    }

    @Nullable
    public AnimatableFloatValue getEndOpacity() {
    }

    @Nullable
    public AnimatableIntegerValue getOpacity() {
    }

    @Nullable
    public AnimatableValue<PointF, PointF> getPosition() {
    }

    @Nullable
    public AnimatableFloatValue getRotation() {
    }

    @Nullable
    public AnimatableScaleValue getScale() {
    }

    @Nullable
    public AnimatableFloatValue getSkew() {
    }

    @Nullable
    public AnimatableFloatValue getSkewAngle() {
    }

    @Nullable
    public AnimatableFloatValue getStartOpacity() {
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
    }

    public AnimatableTransform(@Nullable AnimatablePathValue animatablePathValue, @Nullable AnimatableValue<PointF, PointF> animatableValue, @Nullable AnimatableScaleValue animatableScaleValue, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableFloatValue animatableFloatValue2, @Nullable AnimatableFloatValue animatableFloatValue3, @Nullable AnimatableFloatValue animatableFloatValue4, @Nullable AnimatableFloatValue animatableFloatValue5) {
    }
}
