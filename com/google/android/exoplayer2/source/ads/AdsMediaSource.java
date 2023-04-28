package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = null;
    private final MediaSourceFactory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;
    @Nullable
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;
    @Nullable
    private ComponentListener componentListener;
    private final MediaSource contentMediaSource;
    @Nullable
    private Timeline contentTimeline;
    private final Handler mainHandler;
    private final Timeline.Period period;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public @interface Type {
        }

        private AdLoadException(int type, Exception cause) {
        }

        public static AdLoadException createForAd(Exception error) {
        }

        public static AdLoadException createForAdGroup(Exception error, int adGroupIndex) {
        }

        public static AdLoadException createForAllAds(Exception error) {
        }

        public static AdLoadException createForUnexpected(RuntimeException error) {
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AdMediaSourceHolder {
        private final List<MaskingMediaPeriod> activeMediaPeriods;
        private MediaSource adMediaSource;
        private Uri adUri;
        private final MediaSource.MediaPeriodId id;
        public final /* synthetic */ AdsMediaSource this$0;
        private Timeline timeline;

        public AdMediaSourceHolder(final AdsMediaSource this$0, MediaSource.MediaPeriodId id) {
        }

        public MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        }

        public long getDurationUs() {
        }

        public void handleSourceInfoRefresh(Timeline timeline) {
        }

        public boolean hasMediaSource() {
        }

        public void initializeWithMediaSource(MediaSource adMediaSource, Uri adUri) {
        }

        public boolean isInactive() {
        }

        public void release() {
        }

        public void releaseMediaPeriod(MaskingMediaPeriod maskingMediaPeriod) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {
        private final Uri adUri;
        public final /* synthetic */ AdsMediaSource this$0;

        public AdPrepareListener(final AdsMediaSource this$0, Uri adUri) {
        }

        private /* synthetic */ void a(MediaSource.MediaPeriodId mediaPeriodId) {
        }

        private /* synthetic */ void c(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
        }

        public /* synthetic */ void b(MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public /* synthetic */ void d(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException exception) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler;
        private volatile boolean stopped;
        public final /* synthetic */ AdsMediaSource this$0;

        public ComponentListener(final AdsMediaSource this$0) {
        }

        private /* synthetic */ void a(AdPlaybackState adPlaybackState) {
        }

        public /* synthetic */ void b(AdPlaybackState adPlaybackState) {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdClicked() {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdLoadError(final AdLoadException error, DataSpec dataSpec) {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        public /* synthetic */ void onAdTapped() {
        }

        public void stop() {
        }
    }

    public AdsMediaSource(MediaSource contentMediaSource, DataSpec adTagDataSpec, Object adsId, MediaSourceFactory adMediaSourceFactory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
    }

    public static /* synthetic */ MediaSourceEventListener.EventDispatcher access$000(AdsMediaSource adsMediaSource, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public static /* synthetic */ void access$100(AdsMediaSource adsMediaSource, AdPlaybackState adPlaybackState) {
    }

    public static /* synthetic */ Handler access$200(AdsMediaSource adsMediaSource) {
    }

    public static /* synthetic */ MediaSourceEventListener.EventDispatcher access$300(AdsMediaSource adsMediaSource, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public static /* synthetic */ AdsLoader access$400(AdsMediaSource adsMediaSource) {
    }

    public static /* synthetic */ void access$500(AdsMediaSource adsMediaSource, Object obj, MediaSource mediaSource) {
    }

    public static /* synthetic */ Timeline.Period access$600(AdsMediaSource adsMediaSource) {
    }

    public static /* synthetic */ void access$700(AdsMediaSource adsMediaSource, Object obj) {
    }

    private /* synthetic */ void c(ComponentListener componentListener) {
    }

    private /* synthetic */ void e(ComponentListener componentListener) {
    }

    private long[][] getAdDurationsUs() {
    }

    private void maybeUpdateAdMediaSources() {
    }

    private void maybeUpdateSourceInfo() {
    }

    private void onAdPlaybackState(AdPlaybackState adPlaybackState) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    public /* synthetic */ void d(ComponentListener componentListener) {
    }

    public /* synthetic */ void f(ComponentListener componentListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId childId, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    /* renamed from: getMediaPeriodIdForChildMediaPeriodId  reason: avoid collision after fix types in other method */
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(MediaSource.MediaPeriodId childId, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: onChildSourceInfoRefreshed  reason: avoid collision after fix types in other method */
    public void onChildSourceInfoRefreshed2(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
    }
}
