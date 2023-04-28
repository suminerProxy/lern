package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatableTransformParser {
    private static JsonReader.Options ANIMATABLE_NAMES;
    private static JsonReader.Options NAMES;

    private AnimatableTransformParser() {
    }

    private static boolean isAnchorPointIdentity(AnimatablePathValue animatablePathValue) {
    }

    private static boolean isPositionIdentity(AnimatableValue<PointF, PointF> animatableValue) {
    }

    private static boolean isRotationIdentity(AnimatableFloatValue animatableFloatValue) {
    }

    private static boolean isScaleIdentity(AnimatableScaleValue animatableScaleValue) {
    }

    private static boolean isSkewAngleIdentity(AnimatableFloatValue animatableFloatValue) {
    }

    private static boolean isSkewIdentity(AnimatableFloatValue animatableFloatValue) {
    }

    public static AnimatableTransform parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }
}
