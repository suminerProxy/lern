package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WebvttParserUtil {
    private static final Pattern COMMENT = null;
    private static final String WEBVTT_HEADER = "WEBVTT";

    private WebvttParserUtil() {
    }

    @Nullable
    public static Matcher findNextCueHeader(ParsableByteArray input) {
    }

    public static boolean isWebvttHeaderLine(ParsableByteArray input) {
    }

    public static float parsePercentage(String s) throws NumberFormatException {
    }

    public static long parseTimestampUs(String timestamp) throws NumberFormatException {
    }

    public static void validateWebvttHeaderLine(ParsableByteArray input) throws ParserException {
    }
}
