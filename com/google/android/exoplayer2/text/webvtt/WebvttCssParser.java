package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WebvttCssParser {
    private static final Pattern FONT_SIZE_PATTERN = null;
    private static final String PROPERTY_BGCOLOR = "background-color";
    private static final String PROPERTY_COLOR = "color";
    private static final String PROPERTY_FONT_FAMILY = "font-family";
    private static final String PROPERTY_FONT_SIZE = "font-size";
    private static final String PROPERTY_FONT_STYLE = "font-style";
    private static final String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final String RULE_END = "}";
    private static final String RULE_START = "{";
    private static final String TAG = "WebvttCssParser";
    private static final String VALUE_ALL = "all";
    private static final String VALUE_BOLD = "bold";
    private static final String VALUE_DIGITS = "digits";
    private static final String VALUE_ITALIC = "italic";
    private static final String VALUE_OVER = "over";
    private static final String VALUE_UNDER = "under";
    private static final String VALUE_UNDERLINE = "underline";
    private static final Pattern VOICE_NAME_PATTERN = null;
    private final StringBuilder stringBuilder;
    private final ParsableByteArray styleInput;

    private void applySelectorToStyle(WebvttCssStyle style, String selector) {
    }

    private static boolean maybeSkipComment(ParsableByteArray input) {
    }

    private static boolean maybeSkipWhitespace(ParsableByteArray input) {
    }

    private static void parseFontSize(String fontSize, WebvttCssStyle style) {
    }

    private static String parseIdentifier(ParsableByteArray input, StringBuilder stringBuilder) {
    }

    @Nullable
    public static String parseNextToken(ParsableByteArray input, StringBuilder stringBuilder) {
    }

    @Nullable
    private static String parsePropertyValue(ParsableByteArray input, StringBuilder stringBuilder) {
    }

    @Nullable
    private static String parseSelector(ParsableByteArray input, StringBuilder stringBuilder) {
    }

    private static void parseStyleDeclaration(ParsableByteArray input, WebvttCssStyle style, StringBuilder stringBuilder) {
    }

    private static char peekCharAtPosition(ParsableByteArray input, int position) {
    }

    private static String readCueTarget(ParsableByteArray input) {
    }

    public static void skipStyleBlock(ParsableByteArray input) {
    }

    public static void skipWhitespaceAndComments(ParsableByteArray input) {
    }

    public List<WebvttCssStyle> parseBlock(ParsableByteArray input) {
    }
}
