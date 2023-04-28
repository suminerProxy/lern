package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final Pattern CELL_RESOLUTION = null;
    private static final Pattern CLOCK_TIME = null;
    private static final CellResolution DEFAULT_CELL_RESOLUTION = null;
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = null;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final Pattern FONT_SIZE = null;
    private static final Pattern OFFSET_TIME = null;
    public static final Pattern PERCENTAGE_COORDINATES = null;
    private static final Pattern PIXEL_COORDINATES = null;
    public static final Pattern SIGNED_PERCENTAGE = null;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CellResolution {
        public final int columns;
        public final int rows;

        public CellResolution(int columns, int rows) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FrameAndTickRate {
        public final float effectiveFrameRate;
        public final int subFrameRate;
        public final int tickRate;

        public FrameAndTickRate(float effectiveFrameRate, int subFrameRate, int tickRate) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TtsExtent {
        public final int height;
        public final int width;

        public TtsExtent(int width, int height) {
        }
    }

    private static TtmlStyle createIfNull(@Nullable TtmlStyle style) {
    }

    private static boolean isSupportedTag(String tag) {
    }

    @Nullable
    private static Layout.Alignment parseAlignment(String alignment) {
    }

    private static CellResolution parseCellResolution(XmlPullParser xmlParser, CellResolution defaultValue) throws SubtitleDecoderException {
    }

    private static void parseFontSize(String expression, TtmlStyle out) throws SubtitleDecoderException {
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlParser) throws SubtitleDecoderException {
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlParser, Map<String, TtmlStyle> globalStyles, CellResolution cellResolution, @Nullable TtsExtent ttsExtent, Map<String, TtmlRegion> globalRegions, Map<String, String> imageMap) throws IOException, XmlPullParserException {
    }

    private static void parseMetadata(XmlPullParser xmlParser, Map<String, String> imageMap) throws IOException, XmlPullParserException {
    }

    private static TtmlNode parseNode(XmlPullParser parser, @Nullable TtmlNode parent, Map<String, TtmlRegion> regionMap, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
    }

    @Nullable
    private static TtmlRegion parseRegionAttributes(XmlPullParser xmlParser, CellResolution cellResolution, @Nullable TtsExtent ttsExtent) {
    }

    private static float parseShear(String expression) {
    }

    private static TtmlStyle parseStyleAttributes(XmlPullParser parser, TtmlStyle style) {
    }

    private static String[] parseStyleIds(String parentStyleIds) {
    }

    private static long parseTimeExpression(String time, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
    }

    @Nullable
    private static TtsExtent parseTtsExtent(XmlPullParser xmlParser) {
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bytes, int length, boolean reset) throws SubtitleDecoderException {
    }
}
