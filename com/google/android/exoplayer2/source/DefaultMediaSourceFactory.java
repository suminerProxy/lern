package com.google.android.exoplayer2.source;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DefaultMediaSourceFactory";
    @Nullable
    private AdViewProvider adViewProvider;
    @Nullable
    private AdsLoaderProvider adsLoaderProvider;
    private final DataSource.Factory dataSourceFactory;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    @Nullable
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final SparseArray<MediaSourceFactory> mediaSourceFactories;
    private final int[] supportedTypes;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AdsLoaderProvider {
        @Nullable
        AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration);
    }

    public DefaultMediaSourceFactory(Context context) {
    }

    private static SparseArray<MediaSourceFactory> loadDelegates(DataSource.Factory dataSourceFactory, ExtractorsFactory extractorsFactory) {
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public /* synthetic */ MediaSource createMediaSource(Uri uri) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public MediaSource createMediaSource(MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public int[] getSupportedTypes() {
    }

    public DefaultMediaSourceFactory setAdViewProvider(@Nullable AdViewProvider adViewProvider) {
    }

    public DefaultMediaSourceFactory setAdsLoaderProvider(@Nullable AdsLoaderProvider adsLoaderProvider) {
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

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long liveMaxOffsetMs) {
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float maxSpeed) {
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long liveMinOffsetMs) {
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float minSpeed) {
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long liveTargetOffsetMs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public /* bridge */ /* synthetic */ MediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(@Nullable List streamKeys) {
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setDrmUserAgent(@Nullable String userAgent) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    public DefaultMediaSourceFactory setStreamKeys(@Nullable List<StreamKey> streamKeys) {
    }

    public DefaultMediaSourceFactory(DataSource.Factory dataSourceFactory) {
    }

    public DefaultMediaSourceFactory(DataSource.Factory dataSourceFactory, ExtractorsFactory extractorsFactory) {
    }
}
