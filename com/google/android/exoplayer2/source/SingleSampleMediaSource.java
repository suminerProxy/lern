package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final long durationUs;
    private final Format format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private final Timeline timeline;
    @Nullable
    private TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory {
        private final DataSource.Factory dataSourceFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        @Nullable
        private Object tag;
        @Nullable
        private String trackId;
        private boolean treatLoadErrorsAsEndOfStream;

        public Factory(DataSource.Factory dataSourceFactory) {
        }

        public SingleSampleMediaSource createMediaSource(MediaItem.Subtitle subtitle, long durationUs) {
        }

        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        public Factory setTag(@Nullable Object tag) {
        }

        public Factory setTrackId(@Nullable String trackId) {
        }

        public Factory setTreatLoadErrorsAsEndOfStream(boolean treatLoadErrorsAsEndOfStream) {
        }

        @Deprecated
        public SingleSampleMediaSource createMediaSource(Uri uri, Format format, long durationUs) {
        }
    }

    public /* synthetic */ SingleSampleMediaSource(String str, MediaItem.Subtitle subtitle, DataSource.Factory factory, long j2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z, Object obj, AnonymousClass1 anonymousClass1) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
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

    private SingleSampleMediaSource(@Nullable String trackId, MediaItem.Subtitle subtitle, DataSource.Factory dataSourceFactory, long durationUs, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean treatLoadErrorsAsEndOfStream, @Nullable Object tag) {
    }
}
