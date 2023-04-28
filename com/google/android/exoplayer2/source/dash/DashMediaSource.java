package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.SntpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;
    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private final DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private final MediaItem mediaItem;
    @Nullable
    private TransferListener mediaTransferListener;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements SntpClient.InitializationCallback {
        public final /* synthetic */ DashMediaSource this$0;

        public AnonymousClass1(final DashMediaSource this$0) {
        }

        @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
        public void onInitializationFailed(IOException error) {
        }

        @Override // com.google.android.exoplayer2.util.SntpClient.InitializationCallback
        public void onInitialized() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DashTimeline extends Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;
        @Nullable
        private final MediaItem.LiveConfiguration liveConfiguration;
        private final DashManifest manifest;
        private final MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        public DashTimeline(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, int firstPeriodId, long offsetInFirstPeriodUs, long windowDurationUs, long windowDefaultStartPositionUs, DashManifest manifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        }

        private long getAdjustedWindowDefaultStartPositionUs(long defaultPositionProjectionUs) {
        }

        private static boolean isMovingLiveWindow(DashManifest manifest) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        public final /* synthetic */ DashMediaSource this$0;

        private DefaultPlayerEmsgCallback(final DashMediaSource this$0) {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long expiredManifestPublishTimeUs) {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
        }

        public /* synthetic */ DefaultPlayerEmsgCallback(DashMediaSource dashMediaSource, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory implements MediaSourceFactory {
        private final DashChunkSource.Factory chunkSourceFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        @Nullable
        private final DataSource.Factory manifestDataSourceFactory;
        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
        private List<StreamKey> streamKeys;
        @Nullable
        private Object tag;
        private long targetLiveOffsetOverrideMs;
        private boolean usingCustomDrmSessionManagerProvider;

        public Factory(DataSource.Factory dataSourceFactory) {
        }

        public static /* synthetic */ DrmSessionManager a(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSource createMediaSource(Uri uri) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
        }

        public Factory setCompositeSequenceableLoaderFactory(@Nullable CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmUserAgent(@Nullable String userAgent) {
        }

        public Factory setFallbackTargetLiveOffsetMs(long fallbackTargetLiveOffsetMs) {
        }

        @Deprecated
        public Factory setLivePresentationDelayMs(long livePresentationDelayMs, boolean overridesManifest) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        public Factory setManifestParser(@Nullable ParsingLoadable.Parser<? extends DashManifest> manifestParser) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(@Nullable List streamKeys) {
        }

        @Deprecated
        public Factory setTag(@Nullable Object tag) {
        }

        public Factory(DashChunkSource.Factory chunkSourceFactory, @Nullable DataSource.Factory manifestDataSourceFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSource createMediaSource(MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmUserAgent(@Nullable String userAgent) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setStreamKeys(@Nullable List<StreamKey> streamKeys) {
        }

        public DashMediaSource createMediaSource(DashManifest manifest) {
        }

        public DashMediaSource createMediaSource(DashManifest manifest, MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public DashMediaSource createMediaSource(Uri uri) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public DashMediaSource createMediaSource(MediaItem mediaItem) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = null;

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public /* bridge */ /* synthetic */ Long parse(Uri uri, InputStream inputStream) throws IOException {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        public final /* synthetic */ DashMediaSource this$0;

        private ManifestCallback(final DashMediaSource this$0) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }

        public /* synthetic */ ManifestCallback(DashMediaSource dashMediaSource, AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        public final /* synthetic */ DashMediaSource this$0;

        private UtcTimestampCallback(final DashMediaSource this$0) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }

        public /* synthetic */ UtcTimestampCallback(DashMediaSource dashMediaSource, AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public /* bridge */ /* synthetic */ Long parse(Uri uri, InputStream inputStream) throws IOException {
        }

        public /* synthetic */ XsDateTimeParser(AnonymousClass1 anonymousClass1) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
        }
    }

    public /* synthetic */ DashMediaSource(MediaItem mediaItem, DashManifest dashManifest, DataSource.Factory factory, ParsingLoadable.Parser parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ void a(DashMediaSource dashMediaSource) {
    }

    public static /* synthetic */ void access$500(DashMediaSource dashMediaSource, long j2) {
    }

    public static /* synthetic */ void access$600(DashMediaSource dashMediaSource, IOException iOException) {
    }

    public static /* synthetic */ Loader access$700(DashMediaSource dashMediaSource) {
    }

    public static /* synthetic */ IOException access$800(DashMediaSource dashMediaSource) {
    }

    private /* synthetic */ void b() {
    }

    private static long getAvailableEndTimeInManifestUs(Period period, long periodDurationUs, long nowUnixTimeUs) {
    }

    private static long getAvailableStartTimeInManifestUs(Period period, long periodDurationUs, long nowUnixTimeUs) {
    }

    private static long getIntervalUntilNextManifestRefreshMs(DashManifest manifest, long nowUnixTimeMs) {
    }

    private long getManifestLoadRetryDelayMillis() {
    }

    private static boolean hasVideoOrAudioAdaptationSets(Period period) {
    }

    private static boolean isIndexExplicit(Period period) {
    }

    private void loadNtpTimeOffset() {
    }

    private void onUtcTimestampResolutionError(IOException error) {
    }

    private void onUtcTimestampResolved(long elapsedRealtimeOffsetMs) {
    }

    private void processManifest(boolean scheduleRefresh) {
    }

    private void resolveUtcTimingElement(UtcTimingElement timingElement) {
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement timingElement) {
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement timingElement, ParsingLoadable.Parser<Long> parser) {
    }

    private void scheduleManifestRefresh(long delayUntilNextLoadMs) {
    }

    private <T> void startLoading(ParsingLoadable<T> loadable, Loader.Callback<ParsingLoadable<T>> callback, int minRetryCount) {
    }

    private void startLoadingManifest() {
    }

    private void updateMediaItemLiveConfiguration(long nowInWindowUs, long windowDurationUs) {
    }

    public /* synthetic */ void c() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    public void onDashManifestPublishTimeExpired(long expiredManifestPublishTimeUs) {
    }

    public void onDashManifestRefreshRequested() {
    }

    public void onLoadCanceled(ParsingLoadable<?> loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    public void onManifestLoadCompleted(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    public Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
    }

    public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    public Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    public void replaceManifestUri(Uri manifestUri) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        public final /* synthetic */ DashMediaSource this$0;

        public ManifestLoadErrorThrower(final DashMediaSource this$0) {
        }

        private void maybeThrowManifestError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int minRetryCount) throws IOException {
        }
    }

    private DashMediaSource(MediaItem mediaItem, @Nullable DashManifest manifest, @Nullable DataSource.Factory manifestDataSourceFactory, @Nullable ParsingLoadable.Parser<? extends DashManifest> manifestParser, DashChunkSource.Factory chunkSourceFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long fallbackTargetLiveOffsetMs) {
    }
}
