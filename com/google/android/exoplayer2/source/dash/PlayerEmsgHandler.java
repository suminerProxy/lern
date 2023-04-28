package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private final EventMessageDecoder decoder;
    private long expiredManifestPublishTimeUs;
    private final Handler handler;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long eventTimeUs, long manifestPublishTimeMsInEmsg) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long expiredManifestPublishTimeUs);

        void onDashManifestRefreshRequested();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final MetadataInputBuffer buffer;
        private final FormatHolder formatHolder;
        private long maxLoadedChunkEndTimeUs;
        private final SampleQueue sampleQueue;
        public final /* synthetic */ PlayerEmsgHandler this$0;

        public PlayerTrackEmsgHandler(final PlayerEmsgHandler this$0, Allocator allocator) {
        }

        @Nullable
        private MetadataInputBuffer dequeueSample() {
        }

        private void onManifestExpiredMessageEncountered(long eventTimeUs, long manifestPublishTimeMsInEmsg) {
        }

        private void parseAndDiscardSamples() {
        }

        private void parsePlayerEmsgEvent(long eventTimeUs, EventMessage eventMessage) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long presentationPositionUs) {
        }

        public void onChunkLoadCompleted(Chunk chunk) {
        }

        public boolean onChunkLoadError(Chunk chunk) {
        }

        public void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader input, int length, boolean allowEndOfInput, int sampleDataPart) throws IOException {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i2) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray data, int length, int sampleDataPart) {
        }
    }

    public PlayerEmsgHandler(DashManifest manifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
    }

    public static /* synthetic */ EventMessageDecoder access$000(PlayerEmsgHandler playerEmsgHandler) {
    }

    public static /* synthetic */ boolean access$100(String str, String str2) {
    }

    public static /* synthetic */ long access$200(EventMessage eventMessage) {
    }

    public static /* synthetic */ Handler access$300(PlayerEmsgHandler playerEmsgHandler) {
    }

    @Nullable
    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long publishTimeMs) {
    }

    private static long getManifestPublishTimeMsInEmsg(EventMessage eventMessage) {
    }

    private void handleManifestExpiredMessage(long eventTimeUs, long manifestPublishTimeMsInEmsg) {
    }

    private static boolean isPlayerEmsgEvent(String schemeIdUri, String value) {
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
    }

    private void notifyManifestPublishTimeExpired() {
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    public boolean maybeRefreshManifestBeforeLoadingNextChunk(long presentationPositionUs) {
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
    }

    public void onChunkLoadCompleted(Chunk chunk) {
    }

    public boolean onChunkLoadError(boolean isForwardSeek) {
    }

    public void release() {
    }

    public void updateManifest(DashManifest newManifest) {
    }
}
