package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;
import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SsManifest implements FilterableManifest<SsManifest> {
    public static final int UNSET_LOOKAHEAD = -1;
    public final long durationUs;
    public final long dvrWindowLengthUs;
    public final boolean isLive;
    public final int lookAheadCount;
    public final int majorVersion;
    public final int minorVersion;
    @Nullable
    public final ProtectionElement protectionElement;
    public final StreamElement[] streamElements;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ProtectionElement {
        public final byte[] data;
        public final TrackEncryptionBox[] trackEncryptionBoxes;
        public final UUID uuid;

        public ProtectionElement(UUID uuid, byte[] data, TrackEncryptionBox[] trackEncryptionBoxes) {
        }
    }

    public SsManifest(int majorVersion, int minorVersion, long timescale, long duration, long dvrWindowLength, int lookAheadCount, boolean isLive, @Nullable ProtectionElement protectionElement, StreamElement[] streamElements) {
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public /* bridge */ /* synthetic */ SsManifest copy(List streamKeys) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public final SsManifest copy(List<StreamKey> streamKeys) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StreamElement {
        private static final String URL_PLACEHOLDER_BITRATE_1 = "{bitrate}";
        private static final String URL_PLACEHOLDER_BITRATE_2 = "{Bitrate}";
        private static final String URL_PLACEHOLDER_START_TIME_1 = "{start time}";
        private static final String URL_PLACEHOLDER_START_TIME_2 = "{start_time}";
        private final String baseUri;
        public final int chunkCount;
        private final List<Long> chunkStartTimes;
        private final long[] chunkStartTimesUs;
        private final String chunkTemplate;
        public final int displayHeight;
        public final int displayWidth;
        public final Format[] formats;
        @Nullable
        public final String language;
        private final long lastChunkDurationUs;
        public final int maxHeight;
        public final int maxWidth;
        public final String name;
        public final String subType;
        public final long timescale;
        public final int type;

        public StreamElement(String baseUri, String chunkTemplate, int type, String subType, long timescale, String name, int maxWidth, int maxHeight, int displayWidth, int displayHeight, @Nullable String language, Format[] formats, List<Long> chunkStartTimes, long lastChunkDuration) {
        }

        public Uri buildRequestUri(int track, int chunkIndex) {
        }

        public StreamElement copy(Format[] formats) {
        }

        public long getChunkDurationUs(int chunkIndex) {
        }

        public int getChunkIndex(long timeUs) {
        }

        public long getStartTimeUs(int chunkIndex) {
        }

        private StreamElement(String baseUri, String chunkTemplate, int type, String subType, long timescale, String name, int maxWidth, int maxHeight, int displayWidth, int displayHeight, @Nullable String language, Format[] formats, List<Long> chunkStartTimes, long[] chunkStartTimesUs, long lastChunkDurationUs) {
        }
    }

    private SsManifest(int majorVersion, int minorVersion, long durationUs, long dvrWindowLengthUs, int lookAheadCount, boolean isLive, @Nullable ProtectionElement protectionElement, StreamElement[] streamElements) {
    }
}
