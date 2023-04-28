package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>> {
    public static final double DEFAULT_PLAYLIST_STUCK_TARGET_DURATION_COEFFICIENT = 3.5d;
    public static final HlsPlaylistTracker.Factory FACTORY = null;
    private final HlsDataSourceFactory dataSourceFactory;
    @Nullable
    private MediaSourceEventListener.EventDispatcher eventDispatcher;
    @Nullable
    private Loader initialPlaylistLoader;
    private long initialStartTimeUs;
    private boolean isLive;
    private final CopyOnWriteArrayList<HlsPlaylistTracker.PlaylistEventListener> listeners;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    @Nullable
    private HlsMasterPlaylist masterPlaylist;
    private final HashMap<Uri, MediaPlaylistBundle> playlistBundles;
    private final HlsPlaylistParserFactory playlistParserFactory;
    @Nullable
    private Handler playlistRefreshHandler;
    private final double playlistStuckTargetDurationCoefficient;
    @Nullable
    private HlsMediaPlaylist primaryMediaPlaylistSnapshot;
    @Nullable
    private Uri primaryMediaPlaylistUrl;
    @Nullable
    private HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class FirstPrimaryMediaPlaylistListener implements HlsPlaylistTracker.PlaylistEventListener {
        public final /* synthetic */ DefaultHlsPlaylistTracker this$0;

        private FirstPrimaryMediaPlaylistListener(final DefaultHlsPlaylistTracker this$0) {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public void onPlaylistChanged() {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        public boolean onPlaylistError(Uri url, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean forceRetry) {
        }

        public /* synthetic */ FirstPrimaryMediaPlaylistListener(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class MediaPlaylistBundle implements Loader.Callback<ParsingLoadable<HlsPlaylist>> {
        private static final String BLOCK_MSN_PARAM = "_HLS_msn";
        private static final String BLOCK_PART_PARAM = "_HLS_part";
        private static final String SKIP_PARAM = "_HLS_skip";
        private long earliestNextLoadTimeMs;
        private long excludeUntilMs;
        private long lastSnapshotChangeMs;
        private long lastSnapshotLoadMs;
        private boolean loadPending;
        private final DataSource mediaPlaylistDataSource;
        private final Loader mediaPlaylistLoader;
        @Nullable
        private IOException playlistError;
        @Nullable
        private HlsMediaPlaylist playlistSnapshot;
        private final Uri playlistUrl;
        public final /* synthetic */ DefaultHlsPlaylistTracker this$0;

        public MediaPlaylistBundle(final DefaultHlsPlaylistTracker this$0, Uri playlistUrl) {
        }

        private /* synthetic */ void a(Uri uri) {
        }

        public static /* synthetic */ boolean access$000(MediaPlaylistBundle mediaPlaylistBundle, long j2) {
        }

        public static /* synthetic */ void access$200(MediaPlaylistBundle mediaPlaylistBundle, HlsMediaPlaylist hlsMediaPlaylist, LoadEventInfo loadEventInfo) {
        }

        public static /* synthetic */ long access$300(MediaPlaylistBundle mediaPlaylistBundle) {
        }

        public static /* synthetic */ Uri access$400(MediaPlaylistBundle mediaPlaylistBundle) {
        }

        public static /* synthetic */ void access$500(MediaPlaylistBundle mediaPlaylistBundle, Uri uri) {
        }

        public static /* synthetic */ HlsMediaPlaylist access$600(MediaPlaylistBundle mediaPlaylistBundle) {
        }

        private boolean excludePlaylist(long exclusionDurationMs) {
        }

        private Uri getMediaPlaylistUriForReload() {
        }

        private void loadPlaylistImmediately(Uri playlistRequestUri) {
        }

        private void loadPlaylistInternal(Uri playlistRequestUri) {
        }

        private void processLoadedPlaylist(HlsMediaPlaylist loadedPlaylist, LoadEventInfo loadEventInfo) {
        }

        public /* synthetic */ void b(Uri uri) {
        }

        @Nullable
        public HlsMediaPlaylist getPlaylistSnapshot() {
        }

        public boolean isSnapshotValid() {
        }

        public void loadPlaylist() {
        }

        public void maybeThrowPlaylistRefreshError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }

        public void release() {
        }

        /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory dataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory playlistParserFactory) {
    }

    public static /* synthetic */ boolean access$1000(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
    }

    public static /* synthetic */ Handler access$1100(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ HlsMasterPlaylist access$1200(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ HlsPlaylistParserFactory access$1300(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ HlsMediaPlaylist access$1400(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
    }

    public static /* synthetic */ void access$1500(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, Uri uri, HlsMediaPlaylist hlsMediaPlaylist) {
    }

    public static /* synthetic */ double access$1600(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ Uri access$1700(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ boolean access$1800(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ CopyOnWriteArrayList access$1900(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ HlsMediaPlaylist access$2000(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ HashMap access$2100(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ HlsDataSourceFactory access$700(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ MediaSourceEventListener.EventDispatcher access$800(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    public static /* synthetic */ LoadErrorHandlingPolicy access$900(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker) {
    }

    private void createBundles(List<Uri> urls) {
    }

    private static HlsMediaPlaylist.Segment getFirstOldOverlappingSegment(HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
    }

    private HlsMediaPlaylist getLatestPlaylistSnapshot(@Nullable HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
    }

    private int getLoadedPlaylistDiscontinuitySequence(@Nullable HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
    }

    private long getLoadedPlaylistStartTimeUs(@Nullable HlsMediaPlaylist oldPlaylist, HlsMediaPlaylist loadedPlaylist) {
    }

    private Uri getRequestUriForPrimaryChange(Uri newPrimaryPlaylistUri) {
    }

    private boolean isVariantUrl(Uri playlistUrl) {
    }

    private boolean maybeSelectNewPrimaryUrl() {
    }

    private void maybeSetPrimaryUrl(Uri url) {
    }

    private boolean notifyPlaylistError(Uri playlistUrl, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean forceRetry) {
    }

    private void onPlaylistUpdated(Uri url, HlsMediaPlaylist newSnapshot) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void addListener(HlsPlaylistTracker.PlaylistEventListener listener) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean excludeMediaPlaylist(Uri playlistUrl, long exclusionDurationMs) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long getInitialStartTimeUs() {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public HlsMasterPlaylist getMasterPlaylist() {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    public HlsMediaPlaylist getPlaylistSnapshot(Uri url, boolean isForPlayback) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isLive() {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean isSnapshotValid(Uri url) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPlaylistRefreshError(Uri url) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void maybeThrowPrimaryPlaylistRefreshError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void refreshPlaylist(Uri url) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void removeListener(HlsPlaylistTracker.PlaylistEventListener listener) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void start(Uri initialPlaylistUri, MediaSourceEventListener.EventDispatcher eventDispatcher, HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener) {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory dataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory playlistParserFactory, double playlistStuckTargetDurationCoefficient) {
    }

    /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
    public void onLoadCanceled2(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
    }

    /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
    public void onLoadCompleted2(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
    public Loader.LoadErrorAction onLoadError2(ParsingLoadable<HlsPlaylist> loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
    }
}
