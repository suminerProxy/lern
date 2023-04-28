package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final Pattern REGEX_ATTR_BYTERANGE = null;
    private static final Pattern REGEX_ATTR_DURATION = null;
    private static final Pattern REGEX_AUDIO = null;
    private static final Pattern REGEX_AUTOSELECT = null;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = null;
    private static final Pattern REGEX_BANDWIDTH = null;
    private static final Pattern REGEX_BYTERANGE = null;
    private static final Pattern REGEX_BYTERANGE_LENGTH = null;
    private static final Pattern REGEX_BYTERANGE_START = null;
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = null;
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = null;
    private static final Pattern REGEX_CAN_SKIP_UNTIL = null;
    private static final Pattern REGEX_CHANNELS = null;
    private static final Pattern REGEX_CHARACTERISTICS = null;
    private static final Pattern REGEX_CLOSED_CAPTIONS = null;
    private static final Pattern REGEX_CODECS = null;
    private static final Pattern REGEX_DEFAULT = null;
    private static final Pattern REGEX_FORCED = null;
    private static final Pattern REGEX_FRAME_RATE = null;
    private static final Pattern REGEX_GAP = null;
    private static final Pattern REGEX_GROUP_ID = null;
    private static final Pattern REGEX_HOLD_BACK = null;
    private static final Pattern REGEX_IMPORT = null;
    private static final Pattern REGEX_INDEPENDENT = null;
    private static final Pattern REGEX_INSTREAM_ID = null;
    private static final Pattern REGEX_IV = null;
    private static final Pattern REGEX_KEYFORMAT = null;
    private static final Pattern REGEX_KEYFORMATVERSIONS = null;
    private static final Pattern REGEX_LANGUAGE = null;
    private static final Pattern REGEX_LAST_MSN = null;
    private static final Pattern REGEX_LAST_PART = null;
    private static final Pattern REGEX_MEDIA_DURATION = null;
    private static final Pattern REGEX_MEDIA_SEQUENCE = null;
    private static final Pattern REGEX_MEDIA_TITLE = null;
    private static final Pattern REGEX_METHOD = null;
    private static final Pattern REGEX_NAME = null;
    private static final Pattern REGEX_PART_HOLD_BACK = null;
    private static final Pattern REGEX_PART_TARGET_DURATION = null;
    private static final Pattern REGEX_PLAYLIST_TYPE = null;
    private static final Pattern REGEX_PRECISE = null;
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = null;
    private static final Pattern REGEX_RESOLUTION = null;
    private static final Pattern REGEX_SKIPPED_SEGMENTS = null;
    private static final Pattern REGEX_SUBTITLES = null;
    private static final Pattern REGEX_TARGET_DURATION = null;
    private static final Pattern REGEX_TIME_OFFSET = null;
    private static final Pattern REGEX_TYPE = null;
    private static final Pattern REGEX_URI = null;
    private static final Pattern REGEX_VALUE = null;
    private static final Pattern REGEX_VARIABLE_REFERENCE = null;
    private static final Pattern REGEX_VERSION = null;
    private static final Pattern REGEX_VIDEO = null;
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMasterPlaylist masterPlaylist;
    @Nullable
    private final HlsMediaPlaylist previousMediaPlaylist;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DeltaUpdateException extends IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LineIterator {
        private final Queue<String> extraLines;
        @Nullable
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> extraLines, BufferedReader reader) {
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws IOException {
        }

        public String next() throws IOException {
        }
    }

    public HlsPlaylistParser() {
    }

    private static boolean checkPlaylistHeader(BufferedReader reader) throws IOException {
    }

    private static Pattern compileBooleanAttrPattern(String attribute) {
    }

    private static DrmInitData getPlaylistProtectionSchemes(@Nullable String encryptionScheme, DrmInitData.SchemeData[] schemeDatas) {
    }

    @Nullable
    private static String getSegmentEncryptionIV(long segmentMediaSequence, @Nullable String fullSegmentEncryptionKeyUri, @Nullable String fullSegmentEncryptionIV) {
    }

    @Nullable
    private static HlsMasterPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMasterPlaylist.Variant> variants, String groupId) {
    }

    @Nullable
    private static HlsMasterPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMasterPlaylist.Variant> variants, String groupId) {
    }

    @Nullable
    private static HlsMasterPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMasterPlaylist.Variant> variants, String groupId) {
    }

    private static double parseDoubleAttr(String line, Pattern pattern) throws ParserException {
    }

    @Nullable
    private static DrmInitData.SchemeData parseDrmSchemeData(String line, String keyFormat, Map<String, String> variableDefinitions) throws ParserException {
    }

    private static String parseEncryptionScheme(String method) {
    }

    private static int parseIntAttr(String line, Pattern pattern) throws ParserException {
    }

    private static long parseLongAttr(String line, Pattern pattern) throws ParserException {
    }

    private static HlsMasterPlaylist parseMasterPlaylist(LineIterator iterator, String baseUri) throws IOException {
    }

    private static HlsMediaPlaylist parseMediaPlaylist(HlsMasterPlaylist masterPlaylist, @Nullable HlsMediaPlaylist previousMediaPlaylist, LineIterator iterator, String baseUri) throws IOException {
    }

    private static boolean parseOptionalBooleanAttribute(String line, Pattern pattern, boolean defaultValue) {
    }

    private static double parseOptionalDoubleAttr(String line, Pattern pattern, double defaultValue) {
    }

    private static int parseOptionalIntAttr(String line, Pattern pattern, int defaultValue) {
    }

    private static long parseOptionalLongAttr(String line, Pattern pattern, long defaultValue) {
    }

    @Nullable
    private static String parseOptionalStringAttr(String line, Pattern pattern, Map<String, String> variableDefinitions) {
    }

    private static int parseRoleFlags(String line, Map<String, String> variableDefinitions) {
    }

    private static int parseSelectionFlags(String line) {
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String line) {
    }

    private static String parseStringAttr(String line, Pattern pattern, Map<String, String> variableDefinitions) throws ParserException {
    }

    private static String replaceVariableReferences(String string, Map<String, String> variableDefinitions) {
    }

    private static int skipIgnorableWhitespace(BufferedReader reader, boolean skipLinebreaks, int c) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public /* bridge */ /* synthetic */ HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
    }

    public HlsPlaylistParser(HlsMasterPlaylist masterPlaylist, @Nullable HlsMediaPlaylist previousMediaPlaylist) {
    }

    private static String parseOptionalStringAttr(String line, Pattern pattern, String defaultValue, Map<String, String> variableDefinitions) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
    }
}
