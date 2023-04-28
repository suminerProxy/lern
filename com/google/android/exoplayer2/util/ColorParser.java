package com.google.android.exoplayer2.util;

import androidx.annotation.ColorInt;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP = null;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = null;
    private static final Pattern RGBA_PATTERN_INT_ALPHA = null;
    private static final Pattern RGB_PATTERN = null;

    private ColorParser() {
    }

    @ColorInt
    private static int parseColorInternal(String colorExpression, boolean alphaHasFloatFormat) {
    }

    @ColorInt
    public static int parseCssColor(String colorExpression) {
    }

    @ColorInt
    public static int parseTtmlColor(String colorExpression) {
    }
}
