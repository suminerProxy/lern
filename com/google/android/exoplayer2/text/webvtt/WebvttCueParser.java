package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = null;
    private static final Pattern CUE_SETTING_PATTERN = null;
    private static final Map<String, Integer> DEFAULT_BACKGROUND_COLORS = null;
    public static final float DEFAULT_POSITION = 0.5f;
    private static final Map<String, Integer> DEFAULT_TEXT_COLORS = null;
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_RUBY = "ruby";
    private static final String TAG_RUBY_TEXT = "rt";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Element {
        private static final Comparator<Element> BY_START_POSITION_ASC = null;
        private final int endPosition;
        private final StartTag startTag;

        public /* synthetic */ Element(StartTag startTag, int i2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ int a(Element element, Element element2) {
        }

        public static /* synthetic */ Comparator access$100() {
        }

        public static /* synthetic */ StartTag access$200(Element element) {
        }

        public static /* synthetic */ int access$300(Element element) {
        }

        private Element(StartTag startTag, int endPosition) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StartTag {
        public final Set<String> classes;
        public final String name;
        public final int position;
        public final String voice;

        private StartTag(String name, int position, String voice, Set<String> classes) {
        }

        public static StartTag buildStartTag(String fullTagExpression, int position) {
        }

        public static StartTag buildWholeCueVirtualTag() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StyleMatch implements Comparable<StyleMatch> {
        public final int score;
        public final WebvttCssStyle style;

        public StyleMatch(int score, WebvttCssStyle style) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(StyleMatch another) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(StyleMatch another) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class WebvttCueInfoBuilder {
        public long endTimeUs;
        public float line;
        public int lineAnchor;
        public int lineType;
        public float position;
        public int positionAnchor;
        public float size;
        public long startTimeUs;
        public CharSequence text;
        public int textAlignment;
        public int verticalType;

        private static float computeLine(float line, int lineType) {
        }

        @Nullable
        private static Layout.Alignment convertTextAlignment(int textAlignment) {
        }

        private static float deriveMaxSize(int positionAnchor, float position) {
        }

        private static float derivePosition(int textAlignment) {
        }

        private static int derivePositionAnchor(int textAlignment) {
        }

        public WebvttCueInfo build() {
        }

        public Cue.Builder toCueBuilder() {
        }
    }

    private static void applyDefaultColors(SpannableStringBuilder text, Set<String> classes, int start, int end) {
    }

    private static void applyEntity(String entity, SpannableStringBuilder spannedText) {
    }

    private static void applyRubySpans(SpannableStringBuilder text, @Nullable String cueId, StartTag startTag, List<Element> nestedElements, List<WebvttCssStyle> styles) {
    }

    private static void applySpansForTag(@Nullable String cueId, StartTag startTag, List<Element> nestedElements, SpannableStringBuilder text, List<WebvttCssStyle> styles) {
    }

    private static void applyStyleToText(SpannableStringBuilder spannedText, WebvttCssStyle style, int start, int end) {
    }

    private static int findEndOfTag(String markup, int startPos) {
    }

    private static int firstKnownRubyPosition(int position1, int position2, int position3) {
    }

    private static List<StyleMatch> getApplicableStyles(List<WebvttCssStyle> declaredStyles, @Nullable String id, StartTag tag) {
    }

    private static int getRubyPosition(List<WebvttCssStyle> styles, @Nullable String cueId, StartTag startTag) {
    }

    private static String getTagName(String tagExpression) {
    }

    private static boolean isSupportedTag(String tagName) {
    }

    public static Cue newCueForText(CharSequence text) {
    }

    @Nullable
    public static WebvttCueInfo parseCue(ParsableByteArray webvttData, List<WebvttCssStyle> styles) {
    }

    public static Cue.Builder parseCueSettingsList(String cueSettingsList) {
    }

    public static SpannedString parseCueText(@Nullable String id, String markup, List<WebvttCssStyle> styles) {
    }

    private static int parseLineAnchor(String s) {
    }

    private static void parseLineAttribute(String s, WebvttCueInfoBuilder builder) {
    }

    private static int parsePositionAnchor(String s) {
    }

    private static void parsePositionAttribute(String s, WebvttCueInfoBuilder builder) {
    }

    private static int parseTextAlignment(String s) {
    }

    private static int parseVerticalAttribute(String s) {
    }

    private static void parseCueSettingsList(String cueSettingsList, WebvttCueInfoBuilder builder) {
    }

    @Nullable
    private static WebvttCueInfo parseCue(@Nullable String id, Matcher cueHeaderMatcher, ParsableByteArray webvttData, List<WebvttCssStyle> styles) {
    }
}
