package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaSourceList {
    private static final String TAG = "MediaSourceList";
    private final HashMap<MediaSourceHolder, MediaSourceAndListener> childSources;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private boolean isPrepared;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final MediaSourceListInfoRefreshListener mediaSourceListInfoListener;
    @Nullable
    private TransferListener mediaTransferListener;
    private ShuffleOrder shuffleOrder;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        private DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        private final MediaSourceHolder id;
        private MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final /* synthetic */ MediaSourceList this$0;

        public ForwardingEventListener(final MediaSourceList this$0, MediaSourceHolder id) {
        }

        private boolean maybeUpdateEventDispatcher(int childWindowIndex, @Nullable MediaSource.MediaPeriodId childMediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaSourceAndListener {
        public final MediaSource.MediaSourceCaller caller;
        public final ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller caller, ForwardingEventListener eventListener) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaSourceHolder implements MediaSourceInfoHolder {
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final Object uid;

        public MediaSourceHolder(MediaSource mediaSource, boolean useLazyPreparation) {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Timeline getTimeline() {
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public Object getUid() {
        }

        public void reset(int firstWindowIndexInChild) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener listener, @Nullable AnalyticsCollector analyticsCollector, Handler analyticsCollectorHandler) {
    }

    private /* synthetic */ void a(MediaSource mediaSource, Timeline timeline) {
    }

    public static /* synthetic */ MediaSourceEventListener.EventDispatcher access$000(MediaSourceList mediaSourceList) {
    }

    public static /* synthetic */ DrmSessionEventListener.EventDispatcher access$100(MediaSourceList mediaSourceList) {
    }

    public static /* synthetic */ MediaSource.MediaPeriodId access$200(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public static /* synthetic */ int access$300(MediaSourceHolder mediaSourceHolder, int i2) {
    }

    private void correctOffsets(int startIndex, int windowOffsetUpdate) {
    }

    private void disableChildSource(MediaSourceHolder holder) {
    }

    private void disableUnusedMediaSources() {
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
    }

    private static Object getChildPeriodUid(Object periodUid) {
    }

    @Nullable
    private static MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    private static Object getMediaSourceHolderUid(Object periodUid) {
    }

    private static Object getPeriodUid(MediaSourceHolder holder, Object childPeriodUid) {
    }

    private static int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int windowIndex) {
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
    }

    private void prepareChildSource(MediaSourceHolder holder) {
    }

    private void removeMediaSourcesInternal(int fromIndex, int toIndex) {
    }

    public Timeline addMediaSources(int index, List<MediaSourceHolder> holders, ShuffleOrder shuffleOrder) {
    }

    public /* synthetic */ void b(MediaSource mediaSource, Timeline timeline) {
    }

    public Timeline clear(@Nullable ShuffleOrder shuffleOrder) {
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    public Timeline createTimeline() {
    }

    public int getSize() {
    }

    public boolean isPrepared() {
    }

    public Timeline moveMediaSource(int currentIndex, int newIndex, ShuffleOrder shuffleOrder) {
    }

    public Timeline moveMediaSourceRange(int fromIndex, int toIndex, int newFromIndex, ShuffleOrder shuffleOrder) {
    }

    public void prepare(@Nullable TransferListener mediaTransferListener) {
    }

    public void release() {
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    public Timeline removeMediaSourceRange(int fromIndex, int toIndex, ShuffleOrder shuffleOrder) {
    }

    public Timeline setMediaSources(List<MediaSourceHolder> holders, ShuffleOrder shuffleOrder) {
    }

    public Timeline setShuffleOrder(ShuffleOrder shuffleOrder) {
    }
}
