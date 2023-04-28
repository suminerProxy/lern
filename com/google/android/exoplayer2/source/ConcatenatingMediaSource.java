package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    private static final MediaItem EMPTY_MEDIA_ITEM = null;
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;
    @GuardedBy("this")
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private Set<HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;
    @GuardedBy("this")
    private final Set<HandlerAndRunnable> pendingOnCompletionActions;
    @Nullable
    @GuardedBy("this")
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> mediaSourceHolders, ShuffleOrder shuffleOrder, boolean isAtomic) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object childUid) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int periodIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int windowIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FakeMediaSource extends BaseMediaSource {
        private FakeMediaSource() {
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

        public /* synthetic */ FakeMediaSource(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class HandlerAndRunnable {
        private final Handler handler;
        private final Runnable runnable;

        public HandlerAndRunnable(Handler handler, Runnable runnable) {
        }

        public void dispatch() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaSourceHolder {
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds;
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final Object uid;

        public MediaSourceHolder(MediaSource mediaSource, boolean useLazyPreparation) {
        }

        public void reset(int childIndex, int firstWindowIndexInChild) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MessageData<T> {
        public final T customData;
        public final int index;
        @Nullable
        public final HandlerAndRunnable onCompletionAction;

        public MessageData(int index, T customData, @Nullable HandlerAndRunnable onCompletionAction) {
        }
    }

    public ConcatenatingMediaSource(MediaSource... mediaSources) {
    }

    public static /* synthetic */ MediaItem access$100() {
    }

    private void addMediaSourceInternal(int newIndex, MediaSourceHolder newMediaSourceHolder) {
    }

    private void addMediaSourcesInternal(int index, Collection<MediaSourceHolder> mediaSourceHolders) {
    }

    @GuardedBy("this")
    private void addPublicMediaSources(int index, Collection<MediaSource> mediaSources, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
    }

    public static /* synthetic */ boolean c(ConcatenatingMediaSource concatenatingMediaSource, Message message) {
    }

    private void correctOffsets(int startIndex, int childIndexUpdate, int windowOffsetUpdate) {
    }

    @Nullable
    @GuardedBy("this")
    private HandlerAndRunnable createOnCompletionAction(@Nullable Handler handler, @Nullable Runnable runnable) {
    }

    private void disableUnusedMediaSources() {
    }

    private synchronized void dispatchOnCompletionActions(Set<HandlerAndRunnable> onCompletionActions) {
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
    }

    private static Object getChildPeriodUid(Object periodUid) {
    }

    private static Object getMediaSourceHolderUid(Object periodUid) {
    }

    private static Object getPeriodUid(MediaSourceHolder holder, Object childPeriodUid) {
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
    }

    private boolean handleMessage(Message msg) {
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
    }

    private void moveMediaSourceInternal(int currentIndex, int newIndex) {
    }

    @GuardedBy("this")
    private void movePublicMediaSource(int currentIndex, int newIndex, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
    }

    private void removeMediaSourceInternal(int index) {
    }

    @GuardedBy("this")
    private void removePublicMediaSources(int fromIndex, int toIndex, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
    }

    private void scheduleTimelineUpdate() {
    }

    @GuardedBy("this")
    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
    }

    public synchronized void addMediaSources(Collection<MediaSource> mediaSources) {
    }

    public synchronized void clear() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public synchronized MediaSource getMediaSource(int index) {
    }

    public synchronized int getSize() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public /* bridge */ /* synthetic */ int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int windowIndex) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
    }

    public synchronized void moveMediaSource(int currentIndex, int newIndex) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void releaseSourceInternal() {
    }

    public synchronized MediaSource removeMediaSource(int index) {
    }

    public synchronized void removeMediaSourceRange(int fromIndex, int toIndex) {
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
    }

    public ConcatenatingMediaSource(boolean isAtomic, MediaSource... mediaSources) {
    }

    private void scheduleTimelineUpdate(@Nullable HandlerAndRunnable onCompletionAction) {
    }

    @Nullable
    /* renamed from: getMediaPeriodIdForChildMediaPeriodId  reason: avoid collision after fix types in other method */
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: getWindowIndexForChildWindowIndex  reason: avoid collision after fix types in other method */
    public int getWindowIndexForChildWindowIndex2(MediaSourceHolder mediaSourceHolder, int windowIndex) {
    }

    /* renamed from: onChildSourceInfoRefreshed  reason: avoid collision after fix types in other method */
    public void onChildSourceInfoRefreshed2(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
    }

    public ConcatenatingMediaSource(boolean isAtomic, ShuffleOrder shuffleOrder, MediaSource... mediaSources) {
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable onCompletionAction) {
    }

    public synchronized void clear(Handler handler, Runnable onCompletionAction) {
    }

    public synchronized void moveMediaSource(int currentIndex, int newIndex, Handler handler, Runnable onCompletionAction) {
    }

    public synchronized void removeMediaSourceRange(int fromIndex, int toIndex, Handler handler, Runnable onCompletionAction) {
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable onCompletionAction) {
    }

    public ConcatenatingMediaSource(boolean isAtomic, boolean useLazyPreparation, ShuffleOrder shuffleOrder, MediaSource... mediaSources) {
    }

    public synchronized MediaSource removeMediaSource(int index, Handler handler, Runnable onCompletionAction) {
    }

    public synchronized void addMediaSource(int index, MediaSource mediaSource) {
    }

    public synchronized void addMediaSources(Collection<MediaSource> mediaSources, Handler handler, Runnable onCompletionAction) {
    }

    public synchronized void addMediaSources(int index, Collection<MediaSource> mediaSources) {
    }

    public synchronized void addMediaSource(int index, MediaSource mediaSource, Handler handler, Runnable onCompletionAction) {
    }

    public synchronized void addMediaSources(int index, Collection<MediaSource> mediaSources, Handler handler, Runnable onCompletionAction) {
    }
}
