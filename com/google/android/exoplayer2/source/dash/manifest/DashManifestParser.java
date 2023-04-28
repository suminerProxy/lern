package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = null;
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = null;
    private static final Pattern FRAME_RATE_PATTERN = null;
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = null;
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RepresentationInfo {
        public final ImmutableList<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;
        @Nullable
        public final String drmSchemeType;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;

        public RepresentationInfo(Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable String drmSchemeType, ArrayList<DrmInitData.SchemeData> drmSchemeDatas, ArrayList<Descriptor> inbandEventStreams, long revisionId) {
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> segmentTimeline, long startTime, long elementDuration, int elementRepeatCount, long endTime) {
    }

    private static int checkContentTypeConsistency(int firstType, int secondType) {
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String firstLanguage, @Nullable String secondLanguage) {
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> schemeDatas) {
    }

    private static long getFinalAvailabilityTimeOffset(long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs) {
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String containerMimeType, @Nullable String codecs) {
    }

    public static void maybeSkipTag(XmlPullParser xpp) throws IOException, XmlPullParserException {
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> accessibilityDescriptors) {
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> accessibilityDescriptors) {
    }

    public static long parseDateTime(XmlPullParser xpp, String name, long defaultValue) throws ParserException {
    }

    public static Descriptor parseDescriptor(XmlPullParser xpp, String tag) throws XmlPullParserException, IOException {
    }

    public static int parseDolbyChannelConfiguration(XmlPullParser xpp) {
    }

    public static long parseDuration(XmlPullParser xpp, String name, long defaultValue) {
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> supplementalProperties) {
    }

    public static float parseFloat(XmlPullParser xpp, String name, float defaultValue) {
    }

    public static float parseFrameRate(XmlPullParser xpp, float defaultValue) {
    }

    public static int parseInt(XmlPullParser xpp, String name, int defaultValue) {
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> supplementalProperties) {
    }

    public static long parseLong(XmlPullParser xpp, String name, long defaultValue) {
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xpp) {
    }

    public static String parseString(XmlPullParser xpp, String name, String defaultValue) {
    }

    public static String parseText(XmlPullParser xpp, String label) throws XmlPullParserException, IOException {
    }

    public AdaptationSet buildAdaptationSet(int id, int contentType, List<Representation> representations, List<Descriptor> accessibilityDescriptors, List<Descriptor> essentialProperties, List<Descriptor> supplementalProperties) {
    }

    public EventMessage buildEvent(String schemeIdUri, String value, long id, long durationMs, byte[] messageData) {
    }

    public EventStream buildEventStream(String schemeIdUri, String value, long timescale, long[] presentationTimesUs, EventMessage[] events) {
    }

    public Format buildFormat(@Nullable String id, @Nullable String containerMimeType, int width, int height, float frameRate, int audioChannels, int audioSamplingRate, int bitrate, @Nullable String language, List<Descriptor> roleDescriptors, List<Descriptor> accessibilityDescriptors, @Nullable String codecs, List<Descriptor> essentialProperties, List<Descriptor> supplementalProperties) {
    }

    public DashManifest buildMediaPresentationDescription(long availabilityStartTime, long durationMs, long minBufferTimeMs, boolean dynamic, long minUpdateTimeMs, long timeShiftBufferDepthMs, long suggestedPresentationDelayMs, long publishTimeMs, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTiming, @Nullable ServiceDescriptionElement serviceDescription, @Nullable Uri location, List<Period> periods) {
    }

    public Period buildPeriod(@Nullable String id, long startMs, List<AdaptationSet> adaptationSets, List<EventStream> eventStreams, @Nullable Descriptor assetIdentifier) {
    }

    public RangedUri buildRangedUri(String urlText, long rangeStart, long rangeLength) {
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String label, @Nullable String extraDrmSchemeType, ArrayList<DrmInitData.SchemeData> extraDrmSchemeDatas, ArrayList<Descriptor> extraInbandEventStreams) {
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long duration, @Nullable List<SegmentBase.SegmentTimelineElement> timeline, long availabilityTimeOffsetUs, @Nullable List<RangedUri> segments, long timeShiftBufferDepthMs, long periodStartUnixTimeMs) {
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long endNumber, long duration, List<SegmentBase.SegmentTimelineElement> timeline, long availabilityTimeOffsetUs, @Nullable UrlTemplate initializationTemplate, @Nullable UrlTemplate mediaTemplate, long timeShiftBufferDepthMs, long periodStartUnixTimeMs) {
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long startTime, long duration) {
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri initialization, long timescale, long presentationTimeOffset, long indexStart, long indexLength) {
    }

    public UtcTimingElement buildUtcTimingElement(String schemeIdUri, String value) {
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public /* bridge */ /* synthetic */ DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
    }

    public AdaptationSet parseAdaptationSet(XmlPullParser xpp, List<BaseUrl> parentBaseUrls, @Nullable SegmentBase segmentBase, long periodDurationMs, long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs, long periodStartUnixTimeMs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
    }

    public void parseAdaptationSetChild(XmlPullParser xpp) throws XmlPullParserException, IOException {
    }

    public int parseAudioChannelConfiguration(XmlPullParser xpp) throws XmlPullParserException, IOException {
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xpp, long parentAvailabilityTimeOffsetUs) {
    }

    public List<BaseUrl> parseBaseUrl(XmlPullParser xpp, List<BaseUrl> parentBaseUrls) throws XmlPullParserException, IOException {
    }

    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xpp) throws XmlPullParserException, IOException {
    }

    public int parseContentType(XmlPullParser xpp) {
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xpp, String schemeIdUri, String value, long timescale, ByteArrayOutputStream scratchOutputStream) throws IOException, XmlPullParserException {
    }

    public byte[] parseEventObject(XmlPullParser xpp, ByteArrayOutputStream scratchOutputStream) throws XmlPullParserException, IOException {
    }

    public EventStream parseEventStream(XmlPullParser xpp) throws XmlPullParserException, IOException {
    }

    public RangedUri parseInitialization(XmlPullParser xpp) {
    }

    public String parseLabel(XmlPullParser xpp) throws XmlPullParserException, IOException {
    }

    public DashManifest parseMediaPresentationDescription(XmlPullParser xpp, BaseUrl documentBaseUrl) throws XmlPullParserException, IOException {
    }

    public Pair<Period, Long> parsePeriod(XmlPullParser xpp, List<BaseUrl> parentBaseUrls, long defaultStartMs, long baseUrlAvailabilityTimeOffsetUs, long availabilityStartTimeMs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xpp) throws IOException, XmlPullParserException {
    }

    public RangedUri parseRangedUrl(XmlPullParser xpp, String urlAttribute, String rangeAttribute) {
    }

    public RepresentationInfo parseRepresentation(XmlPullParser xpp, List<BaseUrl> parentBaseUrls, @Nullable String adaptationSetMimeType, @Nullable String adaptationSetCodecs, int adaptationSetWidth, int adaptationSetHeight, float adaptationSetFrameRate, int adaptationSetAudioChannels, int adaptationSetAudioSamplingRate, @Nullable String adaptationSetLanguage, List<Descriptor> adaptationSetRoleDescriptors, List<Descriptor> adaptationSetAccessibilityDescriptors, List<Descriptor> adaptationSetEssentialProperties, List<Descriptor> adaptationSetSupplementalProperties, @Nullable SegmentBase segmentBase, long periodStartUnixTimeMs, long periodDurationMs, long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> accessibilityDescriptors) {
    }

    public int parseRoleFlagsFromDashRoleScheme(@Nullable String value) {
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> accessibilityDescriptors) {
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> roleDescriptors) {
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xpp, @Nullable SegmentBase.SingleSegmentBase parent) throws XmlPullParserException, IOException {
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xpp, @Nullable SegmentBase.SegmentList parent, long periodStartUnixTimeMs, long periodDurationMs, long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xpp, @Nullable SegmentBase.SegmentTemplate parent, List<Descriptor> adaptationSetSupplementalProperties, long periodStartUnixTimeMs, long periodDurationMs, long baseUrlAvailabilityTimeOffsetUs, long segmentBaseAvailabilityTimeOffsetUs, long timeShiftBufferDepthMs) throws XmlPullParserException, IOException {
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xpp, long timescale, long periodDurationMs) throws XmlPullParserException, IOException {
    }

    public RangedUri parseSegmentUrl(XmlPullParser xpp) {
    }

    public int parseSelectionFlagsFromDashRoleScheme(@Nullable String value) {
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> roleDescriptors) {
    }

    public ServiceDescriptionElement parseServiceDescription(XmlPullParser xpp) throws XmlPullParserException, IOException {
    }

    public int parseTvaAudioPurposeCsValue(@Nullable String value) {
    }

    @Nullable
    public UrlTemplate parseUrlTemplate(XmlPullParser xpp, String name, @Nullable UrlTemplate defaultValue) {
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xpp) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
    }
}
