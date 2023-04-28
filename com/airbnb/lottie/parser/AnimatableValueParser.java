package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatableValueParser {
    private AnimatableValueParser() {
    }

    @Nullable
    private static <T> List<Keyframe<T>> parse(JsonReader jsonReader, LottieComposition lottieComposition, ValueParser<T> valueParser) throws IOException {
    }

    public static AnimatableColorValue parseColor(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }

    public static AnimatableTextFrame parseDocumentData(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }

    public static AnimatableGradientColorValue parseGradientColor(JsonReader jsonReader, LottieComposition lottieComposition, int i2) throws IOException {
    }

    public static AnimatableIntegerValue parseInteger(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }

    public static AnimatablePointValue parsePoint(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }

    public static AnimatableScaleValue parseScale(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }

    public static AnimatableShapeValue parseShapeData(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
    }

    @Nullable
    private static <T> List<Keyframe<T>> parse(JsonReader jsonReader, float f2, LottieComposition lottieComposition, ValueParser<T> valueParser) throws IOException {
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition, boolean z) throws IOException {
    }
}
