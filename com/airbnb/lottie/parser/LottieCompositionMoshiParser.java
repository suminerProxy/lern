package com.airbnb.lottie.parser;

import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieCompositionMoshiParser {
    public static JsonReader.Options ASSETS_NAMES;
    private static final JsonReader.Options FONT_NAMES = null;
    private static final JsonReader.Options MARKER_NAMES = null;
    private static final JsonReader.Options NAMES = null;

    public static LottieComposition parse(JsonReader jsonReader) throws IOException {
    }

    private static void parseAssets(JsonReader jsonReader, LottieComposition lottieComposition, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2) throws IOException {
    }

    private static void parseChars(JsonReader jsonReader, LottieComposition lottieComposition, SparseArrayCompat<FontCharacter> sparseArrayCompat) throws IOException {
    }

    private static void parseFonts(JsonReader jsonReader, Map<String, Font> map) throws IOException {
    }

    private static void parseLayers(JsonReader jsonReader, LottieComposition lottieComposition, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
    }

    private static void parseMarkers(JsonReader jsonReader, LottieComposition lottieComposition, List<Marker> list) throws IOException {
    }
}
