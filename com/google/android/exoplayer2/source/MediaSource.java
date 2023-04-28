package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface MediaSource {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaPeriodId extends com.google.android.exoplayer2.source.MediaPeriodId {
        public MediaPeriodId(Object periodUid) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaPeriodId copyWithPeriodUid(Object newPeriodUid) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.source.MediaPeriodId copyWithWindowSequenceNumber(long windowSequenceNumber) {
        }

        public MediaPeriodId(Object periodUid, long windowSequenceNumber) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public MediaPeriodId copyWithPeriodUid(Object newPeriodUid) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriodId
        public MediaPeriodId copyWithWindowSequenceNumber(long windowSequenceNumber) {
        }

        public MediaPeriodId(Object periodUid, long windowSequenceNumber, int nextAdGroupIndex) {
        }

        public MediaPeriodId(Object periodUid, int adGroupIndex, int adIndexInAdGroup, long windowSequenceNumber) {
        }

        public MediaPeriodId(com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(MediaSource source, Timeline timeline);
    }

    void addDrmEventListener(Handler handler, DrmSessionEventListener eventListener);

    void addEventListener(Handler handler, MediaSourceEventListener eventListener);

    MediaPeriod createPeriod(MediaPeriodId id, Allocator allocator, long startPositionUs);

    void disable(MediaSourceCaller caller);

    void enable(MediaSourceCaller caller);

    @Nullable
    Timeline getInitialTimeline();

    MediaItem getMediaItem();

    boolean isSingleWindow();

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(MediaSourceCaller caller, @Nullable TransferListener mediaTransferListener);

    void releasePeriod(MediaPeriod mediaPeriod);

    void releaseSource(MediaSourceCaller caller);

    void removeDrmEventListener(DrmSessionEventListener eventListener);

    void removeEventListener(MediaSourceEventListener eventListener);
}
