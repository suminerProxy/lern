package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.video.ColorInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@RequiresApi(30)
@SuppressLint({"Override"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class OutputConsumerAdapterV30 implements MediaParser.OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN = null;
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START = null;
    private static final String TAG = "OutputConsumerAdapterV30";
    @Nullable
    private String containerMimeType;
    @Nullable
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private ExtractorOutput extractorOutput;
    @Nullable
    private ChunkIndex lastChunkIndex;
    private final ArrayList<TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    @Nullable
    private MediaParser.SeekMap lastSeekMap;
    private List<Format> muxedCaptionFormats;
    private int primaryTrackIndex;
    @Nullable
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;
    @Nullable
    private TimestampAdjuster timestampAdjuster;
    private final ArrayList<Format> trackFormats;
    private final ArrayList<TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DataReaderAdapter implements DataReader {
        @Nullable
        public MediaParser.InputReader input;

        private DataReaderAdapter() {
        }

        @Override // com.google.android.exoplayer2.upstream.DataReader
        public int read(byte[] buffer, int offset, int length) throws IOException {
        }

        public /* synthetic */ DataReaderAdapter(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SeekMapAdapter implements SeekMap {
        private final MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(MediaParser.SeekMap adaptedSeekMap) {
        }

        private static SeekPoint asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long timeUs) {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
        }
    }

    public OutputConsumerAdapterV30() {
    }

    private void ensureSpaceForTrackIndex(int trackIndex) {
    }

    private static byte[] getArray(ByteBuffer byteBuffer) {
    }

    @Nullable
    private static ColorInfo getColorInfo(MediaFormat mediaFormat) {
    }

    private static int getFlag(MediaFormat mediaFormat, String key, int returnValueIfPresent) {
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
    }

    private static String getMimeType(String parserName) {
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
    }

    private void maybeEndTracks() {
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
    }

    @Nullable
    private TrackOutput.CryptoData toExoPlayerCryptoData(int trackIndex, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
    }

    @Nullable
    private static DrmInitData toExoPlayerDrmInitData(@Nullable String schemeType, @Nullable android.media.DrmInitData drmInitData) {
    }

    private Format toExoPlayerFormat(MediaParser.TrackData trackData) {
    }

    private static int toTrackTypeConstant(@Nullable String string) {
    }

    public void disableSeeking() {
    }

    @Nullable
    public ChunkIndex getChunkIndex() {
    }

    @Nullable
    public MediaParser.SeekMap getDummySeekMap() {
    }

    @Nullable
    public Format[] getSampleFormats() {
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long seekTimeUs) {
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleCompleted(int trackIndex, long timeUs, int flags, int size, int offset, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleDataFound(int trackIndex, MediaParser.InputReader sampleData) throws IOException {
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackCountFound(int numberOfTracks) {
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackDataFound(int trackIndex, MediaParser.TrackData trackData) {
    }

    public void setExtractorOutput(ExtractorOutput extractorOutput) {
    }

    public void setMuxedCaptionFormats(List<Format> muxedCaptionFormats) {
    }

    public void setSampleTimestampUpperLimitFilterUs(long sampleTimestampUpperLimitFilterUs) {
    }

    public void setSelectedParserName(String parserName) {
    }

    public void setTimestampAdjuster(TimestampAdjuster timestampAdjuster) {
    }

    public OutputConsumerAdapterV30(@Nullable Format primaryTrackManifestFormat, int primaryTrackType, boolean expectDummySeekMap) {
    }
}
