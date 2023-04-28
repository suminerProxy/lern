package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TtmlNode {
    public static final String ANNOTATION_POSITION_AFTER = "after";
    public static final String ANNOTATION_POSITION_BEFORE = "before";
    public static final String ANNOTATION_POSITION_OUTSIDE = "outside";
    public static final String ANONYMOUS_REGION_ID = "";
    public static final String ATTR_EBUTTS_MULTI_ROW_ALIGN = "multiRowAlign";
    public static final String ATTR_ID = "id";
    public static final String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
    public static final String ATTR_TTS_COLOR = "color";
    public static final String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
    public static final String ATTR_TTS_EXTENT = "extent";
    public static final String ATTR_TTS_FONT_FAMILY = "fontFamily";
    public static final String ATTR_TTS_FONT_SIZE = "fontSize";
    public static final String ATTR_TTS_FONT_STYLE = "fontStyle";
    public static final String ATTR_TTS_FONT_WEIGHT = "fontWeight";
    public static final String ATTR_TTS_ORIGIN = "origin";
    public static final String ATTR_TTS_RUBY = "ruby";
    public static final String ATTR_TTS_RUBY_POSITION = "rubyPosition";
    public static final String ATTR_TTS_SHEAR = "shear";
    public static final String ATTR_TTS_TEXT_ALIGN = "textAlign";
    public static final String ATTR_TTS_TEXT_COMBINE = "textCombine";
    public static final String ATTR_TTS_TEXT_DECORATION = "textDecoration";
    public static final String ATTR_TTS_TEXT_EMPHASIS = "textEmphasis";
    public static final String ATTR_TTS_WRITING_MODE = "writingMode";
    public static final String BOLD = "bold";
    public static final String CENTER = "center";
    public static final String COMBINE_ALL = "all";
    public static final String COMBINE_NONE = "none";
    public static final String END = "end";
    public static final String ITALIC = "italic";
    public static final String LEFT = "left";
    public static final String LINETHROUGH = "linethrough";
    public static final String NO_LINETHROUGH = "nolinethrough";
    public static final String NO_UNDERLINE = "nounderline";
    public static final String RIGHT = "right";
    public static final String RUBY_BASE = "base";
    public static final String RUBY_BASE_CONTAINER = "baseContainer";
    public static final String RUBY_CONTAINER = "container";
    public static final String RUBY_DELIMITER = "delimiter";
    public static final String RUBY_TEXT = "text";
    public static final String RUBY_TEXT_CONTAINER = "textContainer";
    public static final String START = "start";
    public static final String TAG_BODY = "body";
    public static final String TAG_BR = "br";
    public static final String TAG_DATA = "data";
    public static final String TAG_DIV = "div";
    public static final String TAG_HEAD = "head";
    public static final String TAG_IMAGE = "image";
    public static final String TAG_INFORMATION = "information";
    public static final String TAG_LAYOUT = "layout";
    public static final String TAG_METADATA = "metadata";
    public static final String TAG_P = "p";
    public static final String TAG_REGION = "region";
    public static final String TAG_SPAN = "span";
    public static final String TAG_STYLE = "style";
    public static final String TAG_STYLING = "styling";
    public static final String TAG_TT = "tt";
    public static final String TEXT_EMPHASIS_AUTO = "auto";
    public static final String TEXT_EMPHASIS_MARK_CIRCLE = "circle";
    public static final String TEXT_EMPHASIS_MARK_DOT = "dot";
    public static final String TEXT_EMPHASIS_MARK_FILLED = "filled";
    public static final String TEXT_EMPHASIS_MARK_OPEN = "open";
    public static final String TEXT_EMPHASIS_MARK_SESAME = "sesame";
    public static final String TEXT_EMPHASIS_NONE = "none";
    public static final String UNDERLINE = "underline";
    public static final String VERTICAL = "tb";
    public static final String VERTICAL_LR = "tblr";
    public static final String VERTICAL_RL = "tbrl";
    private List<TtmlNode> children;
    public final long endTimeUs;
    @Nullable
    public final String imageId;
    public final boolean isTextNode;
    private final HashMap<String, Integer> nodeEndsByRegion;
    private final HashMap<String, Integer> nodeStartsByRegion;
    @Nullable
    public final TtmlNode parent;
    public final String regionId;
    public final long startTimeUs;
    @Nullable
    public final TtmlStyle style;
    @Nullable
    private final String[] styleIds;
    @Nullable
    public final String tag;
    @Nullable
    public final String text;

    private TtmlNode(@Nullable String tag, @Nullable String text, long startTimeUs, long endTimeUs, @Nullable TtmlStyle style, @Nullable String[] styleIds, String regionId, @Nullable String imageId, @Nullable TtmlNode parent) {
    }

    private void applyStyleToOutput(Map<String, TtmlStyle> globalStyles, Cue.Builder regionOutput, int start, int end, int verticalType) {
    }

    public static TtmlNode buildNode(@Nullable String tag, long startTimeUs, long endTimeUs, @Nullable TtmlStyle style, @Nullable String[] styleIds, String regionId, @Nullable String imageId, @Nullable TtmlNode parent) {
    }

    public static TtmlNode buildTextNode(String text) {
    }

    private static void cleanUpText(SpannableStringBuilder builder) {
    }

    private void getEventTimes(TreeSet<Long> out, boolean descendsPNode) {
    }

    private static SpannableStringBuilder getRegionOutputText(String resolvedRegionId, Map<String, Cue.Builder> regionOutputs) {
    }

    private void traverseForImage(long timeUs, String inheritedRegion, List<Pair<String, String>> regionImageList) {
    }

    private void traverseForStyle(long timeUs, Map<String, TtmlStyle> globalStyles, Map<String, TtmlRegion> regionMaps, String inheritedRegion, Map<String, Cue.Builder> regionOutputs) {
    }

    private void traverseForText(long timeUs, boolean descendsPNode, String inheritedRegion, Map<String, Cue.Builder> regionOutputs) {
    }

    public void addChild(TtmlNode child) {
    }

    public TtmlNode getChild(int index) {
    }

    public int getChildCount() {
    }

    public List<Cue> getCues(long timeUs, Map<String, TtmlStyle> globalStyles, Map<String, TtmlRegion> regionMap, Map<String, String> imageMap) {
    }

    public long[] getEventTimesUs() {
    }

    @Nullable
    public String[] getStyleIds() {
    }

    public boolean isActive(long timeUs) {
    }
}
