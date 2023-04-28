package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtspClient;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspMediaPeriod implements MediaPeriod {
    private static final int PORT_BINDING_MAX_RETRY_COUNT = 3;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final Handler handler;
    private final InternalListener internalListener;
    private boolean isUsingRtpTcp;
    private long lastSeekPositionUs;
    private final Listener listener;
    private boolean loadingFinished;
    private long pendingSeekPositionUs;
    @Nullable
    private RtspMediaSource.RtspPlaybackException playbackException;
    private int portBindingRetryCount;
    @Nullable
    private IOException preparationError;
    private boolean prepared;
    private boolean released;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    private final RtspClient rtspClient;
    private final List<RtspLoaderWrapper> rtspLoaderWrappers;
    private final List<RtpLoadInfo> selectedLoadInfos;
    private ImmutableList<TrackGroup> trackGroups;
    private boolean trackSelected;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class InternalListener implements ExtractorOutput, Loader.Callback<RtpDataLoadable>, SampleQueue.UpstreamFormatChangedListener, RtspClient.SessionInfoListener, RtspClient.PlaybackEventListener {
        public final /* synthetic */ RtspMediaPeriod this$0;

        private InternalListener(final RtspMediaPeriod this$0) {
        }

        public static /* synthetic */ void a(RtspMediaPeriod rtspMediaPeriod) {
        }

        public static /* synthetic */ void b(RtspMediaPeriod rtspMediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
        }

        /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackError(RtspMediaSource.RtspPlaybackException error) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackStarted(long startPositionUs, ImmutableList<RtspTrackTiming> trackTimingList) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onRtspSetupCompleted() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineRequestFailed(String message, @Nullable Throwable cause) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineUpdated(RtspSessionTiming timing, ImmutableList<RtspMediaTrack> tracks) {
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
        public void onUpstreamFormatChanged(Format format) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int id, int type) {
        }

        public /* synthetic */ InternalListener(RtspMediaPeriod rtspMediaPeriod, AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onSourceInfoRefreshed(RtspSessionTiming timing);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class RtpLoadInfo {
        private final RtpDataLoadable loadable;
        public final RtspMediaTrack mediaTrack;
        public final /* synthetic */ RtspMediaPeriod this$0;
        @Nullable
        private String transport;

        public RtpLoadInfo(final RtspMediaPeriod this$0, RtspMediaTrack mediaTrack, int trackId, RtpDataChannel.Factory rtpDataChannelFactory) {
        }

        private /* synthetic */ void a(String str, RtpDataChannel rtpDataChannel) {
        }

        public static /* synthetic */ RtpDataLoadable access$300(RtpLoadInfo rtpLoadInfo) {
        }

        public /* synthetic */ void b(String str, RtpDataChannel rtpDataChannel) {
        }

        public Uri getTrackUri() {
        }

        public String getTransport() {
        }

        public boolean isTransportReady() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class RtspLoaderWrapper {
        private boolean canceled;
        public final RtpLoadInfo loadInfo;
        private final Loader loader;
        private boolean released;
        private final SampleQueue sampleQueue;
        public final /* synthetic */ RtspMediaPeriod this$0;

        public RtspLoaderWrapper(final RtspMediaPeriod this$0, RtspMediaTrack mediaTrack, int trackId, RtpDataChannel.Factory rtpDataChannelFactory) {
        }

        public static /* synthetic */ boolean access$100(RtspLoaderWrapper rtspLoaderWrapper) {
        }

        public static /* synthetic */ SampleQueue access$200(RtspLoaderWrapper rtspLoaderWrapper) {
        }

        public void cancelLoad() {
        }

        public long getBufferedPositionUs() {
        }

        public boolean isSampleQueueReady() {
        }

        public int read(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        }

        public void release() {
        }

        public void seekTo(long positionUs) {
        }

        public void startLoading() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class SampleStreamImpl implements SampleStream {
        public final /* synthetic */ RtspMediaPeriod this$0;
        private final int track;

        public SampleStreamImpl(final RtspMediaPeriod this$0, int track) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
        }
    }

    public RtspMediaPeriod(Allocator allocator, RtpDataChannel.Factory rtpDataChannelFactory, Uri uri, Listener listener, String userAgent) {
    }

    public static /* synthetic */ int access$1008(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ RtspMediaSource.RtspPlaybackException access$1100(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ RtspMediaSource.RtspPlaybackException access$1102(RtspMediaPeriod rtspMediaPeriod, RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
    }

    public static /* synthetic */ RtspClient access$1200(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ List access$1300(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ RtpDataLoadable access$1400(RtspMediaPeriod rtspMediaPeriod, Uri uri) {
    }

    public static /* synthetic */ boolean access$1500(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ long access$1602(RtspMediaPeriod rtspMediaPeriod, long j2) {
    }

    public static /* synthetic */ RtpDataChannel.Factory access$1700(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ Listener access$1800(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ void access$1900(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ Allocator access$2000(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ InternalListener access$2100(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ void access$2200(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ void access$2300(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ List access$400(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ Handler access$500(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ boolean access$600(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ boolean access$602(RtspMediaPeriod rtspMediaPeriod, boolean z) {
    }

    public static /* synthetic */ void access$700(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ boolean access$800(RtspMediaPeriod rtspMediaPeriod) {
    }

    public static /* synthetic */ IOException access$902(RtspMediaPeriod rtspMediaPeriod, IOException iOException) {
    }

    private static ImmutableList<TrackGroup> buildTrackGroups(ImmutableList<RtspLoaderWrapper> rtspLoaderWrappers) {
    }

    @Nullable
    private RtpDataLoadable getLoadableByTrackUri(Uri trackUri) {
    }

    private boolean isSeekPending() {
    }

    private void maybeFinishPrepare() {
    }

    private void maybeSetupTracks() {
    }

    private void retryWithRtpTcp() {
    }

    private boolean seekInsideBufferUs(long positionUs) {
    }

    private void updateLoadingFinished() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List trackSelections) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
    }

    public boolean isReady(int trackGroupIndex) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
    }

    public int readData(int sampleQueueIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
    }

    public void release() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public ImmutableList<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
    }
}
