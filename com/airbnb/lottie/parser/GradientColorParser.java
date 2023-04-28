package com.airbnb.lottie.parser;

import androidx.annotation.IntRange;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GradientColorParser implements ValueParser<GradientColor> {
    private int colorPoints;

    public GradientColorParser(int i2) {
    }

    private void addOpacityStopsToGradientIfNeeded(GradientColor gradientColor, List<Float> list) {
    }

    @IntRange(from = 0, to = 255)
    private int getOpacityAtPosition(double d2, double[] dArr, double[] dArr2) {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    public /* bridge */ /* synthetic */ GradientColor parse(JsonReader jsonReader, float f2) throws IOException {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.parser.ValueParser
    public GradientColor parse(JsonReader jsonReader, float f2) throws IOException {
    }
}
