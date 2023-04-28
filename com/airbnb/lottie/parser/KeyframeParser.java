package com.airbnb.lottie.parser;

import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class KeyframeParser {
    private static final Interpolator LINEAR_INTERPOLATOR = null;
    private static final float MAX_CP_VALUE = 100.0f;
    public static JsonReader.Options NAMES;
    private static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache;

    @Nullable
    private static WeakReference<Interpolator> getInterpolator(int i2) {
    }

    public static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f2, ValueParser<T> valueParser, boolean z) throws IOException {
    }

    private static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f2, ValueParser<T> valueParser) throws IOException {
    }

    private static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f2, ValueParser<T> valueParser) throws IOException {
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache() {
    }

    private static void putInterpolator(int i2, WeakReference<Interpolator> weakReference) {
    }
}
