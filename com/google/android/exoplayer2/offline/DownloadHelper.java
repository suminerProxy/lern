package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DownloadHelper {
    @Deprecated
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS = null;
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = null;
    @Deprecated
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_VIEWPORT = null;
    private Callback callback;
    private final Handler callbackHandler;
    private List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private MediaPreparer mediaPreparer;
    @Nullable
    private final MediaSource mediaSource;
    private final MediaItem.PlaybackProperties playbackProperties;
    private final RendererCapabilities[] rendererCapabilities;
    private final SparseIntArray scratchSet;
    private TrackGroupArray[] trackGroupArrays;
    private List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final DefaultTrackSelector trackSelector;
    private final Timeline.Window window;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements VideoRendererEventListener {
        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onDroppedFrames(int i2, long j2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onRenderedFirstFrame(Object obj, long j2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoCodecError(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoDecoderInitialized(String str, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoDecoderReleased(String str) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoFrameProcessingOffset(long j2, int i2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.offline.DownloadHelper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements AudioRendererEventListener {
        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioCodecError(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioDecoderInitialized(String str, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioDecoderReleased(String str) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioPositionAdvancing(long j2) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioSinkError(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onAudioUnderrun(int i2, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Callback {
        void onPrepareError(DownloadHelper helper, IOException e2);

        void onPrepared(DownloadHelper helper);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DownloadTrackSelection extends BaseTrackSelection {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class Factory implements ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitions, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            }

            public /* synthetic */ Factory(AnonymousClass1 anonymousClass1) {
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup, int[] tracks) {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends MediaChunk> queue, MediaChunkIterator[] mediaChunkIterators) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FakeBandwidthMeter implements BandwidthMeter {
        private FakeBandwidthMeter() {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void addEventListener(Handler eventHandler, BandwidthMeter.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public long getBitrateEstimate() {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public /* synthetic */ long getTimeToFirstByteEstimateUs() {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        @Nullable
        public TransferListener getTransferListener() {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }

        public /* synthetic */ FakeBandwidthMeter(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LiveContentUnsupportedException extends IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 1;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 0;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final Allocator allocator;
        private final DownloadHelper downloadHelper;
        private final Handler downloadHelperHandler;
        public MediaPeriod[] mediaPeriods;
        private final MediaSource mediaSource;
        private final Handler mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private final ArrayList<MediaPeriod> pendingMediaPeriods;
        private boolean released;
        public Timeline timeline;

        public MediaPreparer(MediaSource mediaSource, DownloadHelper downloadHelper) {
        }

        public static /* synthetic */ boolean a(MediaPreparer mediaPreparer, Message message) {
        }

        private boolean handleDownloadHelperCallbackMessage(Message msg) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public /* bridge */ /* synthetic */ void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource source, Timeline timeline) {
        }

        public void release() {
        }

        /* renamed from: onContinueLoadingRequested  reason: avoid collision after fix types in other method */
        public void onContinueLoadingRequested2(MediaPeriod mediaPeriod) {
        }
    }

    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, DefaultTrackSelector.Parameters trackSelectorParameters, RendererCapabilities[] rendererCapabilities) {
    }

    public static /* synthetic */ void a(List list) {
    }

    public static /* synthetic */ void access$200(DownloadHelper downloadHelper) {
    }

    public static /* synthetic */ void access$300(DownloadHelper downloadHelper, IOException iOException) {
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void assertPreparedWithMedia() {
    }

    public static /* synthetic */ void b(Metadata metadata) {
    }

    public static /* synthetic */ void c() {
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory dataSourceFactory) {
    }

    private static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory dataSourceFactory, @Nullable DrmSessionManager drmSessionManager) {
    }

    private /* synthetic */ void d(IOException iOException) {
    }

    private /* synthetic */ void f() {
    }

    @Deprecated
    public static DownloadHelper forDash(Context context, Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
    }

    @Deprecated
    public static DownloadHelper forHls(Context context, Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri) {
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
    }

    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
    }

    public static RendererCapabilities[] getRendererCapabilities(RenderersFactory renderersFactory) {
    }

    private /* synthetic */ void h(Callback callback) {
    }

    private static boolean isProgressive(MediaItem.PlaybackProperties playbackProperties) {
    }

    private void onMediaPreparationFailed(IOException error) {
    }

    private void onMediaPrepared() {
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    private TrackSelectorResult runTrackSelection(int periodIndex) {
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    private void setPreparedWithMedia() {
    }

    public void addAudioLanguagesToSelection(String... languages) {
    }

    public void addTextLanguagesToSelection(boolean selectUndeterminedTextLanguage, String... languages) {
    }

    public void addTrackSelection(int periodIndex, DefaultTrackSelector.Parameters trackSelectorParameters) {
    }

    public void addTrackSelectionForSingleRenderer(int periodIndex, int rendererIndex, DefaultTrackSelector.Parameters trackSelectorParameters, List<DefaultTrackSelector.SelectionOverride> overrides) {
    }

    public void clearTrackSelections(int periodIndex) {
    }

    public /* synthetic */ void e(IOException iOException) {
    }

    public /* synthetic */ void g() {
    }

    public DownloadRequest getDownloadRequest(@Nullable byte[] data) {
    }

    @Nullable
    public Object getManifest() {
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int periodIndex) {
    }

    public int getPeriodCount() {
    }

    public TrackGroupArray getTrackGroups(int periodIndex) {
    }

    public List<ExoTrackSelection> getTrackSelections(int periodIndex, int rendererIndex) {
    }

    public /* synthetic */ void i(Callback callback) {
    }

    public void prepare(Callback callback) {
    }

    public void release() {
    }

    public void replaceTrackSelections(int periodIndex, DefaultTrackSelector.Parameters trackSelectorParameters) {
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory dataSourceFactory, @Nullable DrmSessionManager drmSessionManager) {
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri, @Nullable String cacheKey) {
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Context context, Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory) {
    }

    public DownloadRequest getDownloadRequest(String id, @Nullable byte[] data) {
    }

    @Deprecated
    public static DownloadHelper forDash(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, DefaultTrackSelector.Parameters trackSelectorParameters) {
    }

    @Deprecated
    public static DownloadHelper forHls(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, DefaultTrackSelector.Parameters trackSelectorParameters) {
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory dataSourceFactory) {
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory dataSourceFactory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, DefaultTrackSelector.Parameters trackSelectorParameters) {
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, DefaultTrackSelector.Parameters trackSelectorParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory dataSourceFactory) {
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, DefaultTrackSelector.Parameters trackSelectorParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory dataSourceFactory, @Nullable DrmSessionManager drmSessionManager) {
    }
}
