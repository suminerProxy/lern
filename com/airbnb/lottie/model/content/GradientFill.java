package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GradientFill implements ContentModel {
    private final AnimatablePointValue endPoint;
    private final Path.FillType fillType;
    private final AnimatableGradientColorValue gradientColor;
    private final GradientType gradientType;
    private final boolean hidden;
    @Nullable
    private final AnimatableFloatValue highlightAngle;
    @Nullable
    private final AnimatableFloatValue highlightLength;
    private final String name;
    private final AnimatableIntegerValue opacity;
    private final AnimatablePointValue startPoint;

    public GradientFill(String str, GradientType gradientType, Path.FillType fillType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, boolean z) {
    }

    public AnimatablePointValue getEndPoint() {
    }

    public Path.FillType getFillType() {
    }

    public AnimatableGradientColorValue getGradientColor() {
    }

    public GradientType getGradientType() {
    }

    @Nullable
    public AnimatableFloatValue getHighlightAngle() {
    }

    @Nullable
    public AnimatableFloatValue getHighlightLength() {
    }

    public String getName() {
    }

    public AnimatableIntegerValue getOpacity() {
    }

    public AnimatablePointValue getStartPoint() {
    }

    public boolean isHidden() {
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
    }
}
