package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PolystarShape implements ContentModel {
    private final boolean hidden;
    private final AnimatableFloatValue innerRadius;
    private final AnimatableFloatValue innerRoundedness;
    private final String name;
    private final AnimatableFloatValue outerRadius;
    private final AnimatableFloatValue outerRoundedness;
    private final AnimatableFloatValue points;
    private final AnimatableValue<PointF, PointF> position;
    private final AnimatableFloatValue rotation;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type POLYGON = null;
        public static final Type STAR = null;
        private final int value;

        private Type(String str, int i2, int i3) {
        }

        public static Type forValue(int i2) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z) {
    }

    public AnimatableFloatValue getInnerRadius() {
    }

    public AnimatableFloatValue getInnerRoundedness() {
    }

    public String getName() {
    }

    public AnimatableFloatValue getOuterRadius() {
    }

    public AnimatableFloatValue getOuterRoundedness() {
    }

    public AnimatableFloatValue getPoints() {
    }

    public AnimatableValue<PointF, PointF> getPosition() {
    }

    public AnimatableFloatValue getRotation() {
    }

    public Type getType() {
    }

    public boolean isHidden() {
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
    }
}
