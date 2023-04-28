package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.common.collect.ImmutableList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Timeline implements Bundleable {
    public static final Bundleable.Creator<Timeline> CREATOR = null;
    public static final Timeline EMPTY = null;
    private static final int FIELD_PERIODS = 1;
    private static final int FIELD_SHUFFLED_WINDOW_INDICES = 2;
    private static final int FIELD_WINDOWS = 0;

    /* renamed from: com.google.android.exoplayer2.Timeline$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends Timeline {
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int periodIndex, Period period, boolean setIds) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Period implements Bundleable {
        public static final Bundleable.Creator<Period> CREATOR = null;
        private static final int FIELD_AD_PLAYBACK_STATE = 4;
        private static final int FIELD_DURATION_US = 1;
        private static final int FIELD_PLACEHOLDER = 3;
        private static final int FIELD_POSITION_IN_WINDOW_US = 2;
        private static final int FIELD_WINDOW_INDEX = 0;
        private AdPlaybackState adPlaybackState;
        public long durationUs;
        @Nullable
        public Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        @Nullable
        public Object uid;
        public int windowIndex;

        public static /* synthetic */ Period a(Bundle bundle) {
        }

        public static /* synthetic */ AdPlaybackState access$100(Period period) {
        }

        private static Period fromBundle(Bundle bundle) {
        }

        private static String keyForField(int field) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int getAdCountInAdGroup(int adGroupIndex) {
        }

        public long getAdDurationUs(int adGroupIndex, int adIndexInAdGroup) {
        }

        public int getAdGroupCount() {
        }

        public int getAdGroupIndexAfterPositionUs(long positionUs) {
        }

        public int getAdGroupIndexForPositionUs(long positionUs) {
        }

        public long getAdGroupTimeUs(int adGroupIndex) {
        }

        public long getAdResumePositionUs() {
        }

        @Nullable
        public Object getAdsId() {
        }

        public long getContentResumeOffsetUs(int adGroupIndex) {
        }

        public long getDurationMs() {
        }

        public long getDurationUs() {
        }

        public int getFirstAdIndexToPlay(int adGroupIndex) {
        }

        public int getNextAdIndexToPlay(int adGroupIndex, int lastPlayedAdIndex) {
        }

        public long getPositionInWindowMs() {
        }

        public long getPositionInWindowUs() {
        }

        public int getRemovedAdGroupCount() {
        }

        public boolean hasPlayedAdGroup(int adGroupIndex) {
        }

        public int hashCode() {
        }

        public boolean isServerSideInsertedAdGroup(int adGroupIndex) {
        }

        public Period set(@Nullable Object id, @Nullable Object uid, int windowIndex, long durationUs, long positionInWindowUs) {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        public Period set(@Nullable Object id, @Nullable Object uid, int windowIndex, long durationUs, long positionInWindowUs, AdPlaybackState adPlaybackState, boolean isPlaceholder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RemotableTimeline extends Timeline {
        private final ImmutableList<Period> periods;
        private final int[] shuffledWindowIndices;
        private final int[] windowIndicesInShuffled;
        private final ImmutableList<Window> windows;

        public RemotableTimeline(ImmutableList<Window> windows, ImmutableList<Period> periods, int[] shuffledWindowIndices) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int periodIndex, Period period, boolean setIds) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    public static /* synthetic */ Timeline a(Bundle bundle) {
    }

    private static Timeline fromBundle(Bundle bundle) {
    }

    private static <T extends Bundleable> ImmutableList<T> fromBundleListRetriever(Bundleable.Creator<T> creator, @Nullable IBinder binder) {
    }

    private static int[] generateUnshuffledIndices(int n2) {
    }

    private static String keyForField(int field) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int getFirstWindowIndex(boolean shuffleModeEnabled) {
    }

    public abstract int getIndexOfPeriod(Object uid);

    public int getLastWindowIndex(boolean shuffleModeEnabled) {
    }

    public final int getNextPeriodIndex(int periodIndex, Period period, Window window, int repeatMode, boolean shuffleModeEnabled) {
    }

    public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
    }

    public final Period getPeriod(int periodIndex, Period period) {
    }

    public abstract Period getPeriod(int periodIndex, Period period, boolean setIds);

    public Period getPeriodByUid(Object periodUid, Period period) {
    }

    public abstract int getPeriodCount();

    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int windowIndex, long windowPositionUs) {
    }

    public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
    }

    public abstract Object getUidOfPeriod(int periodIndex);

    public final Window getWindow(int windowIndex, Window window) {
    }

    public abstract Window getWindow(int windowIndex, Window window, long defaultPositionProjectionUs);

    public abstract int getWindowCount();

    public int hashCode() {
    }

    public final boolean isEmpty() {
    }

    public final boolean isLastPeriod(int periodIndex, Period period, Window window, int repeatMode, boolean shuffleModeEnabled) {
    }

    public final Bundle toBundle(boolean excludeMediaItems) {
    }

    @Nullable
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int windowIndex, long windowPositionUs, long defaultPositionProjectionUs) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Window implements Bundleable {
        public static final Bundleable.Creator<Window> CREATOR = null;
        private static final MediaItem EMPTY_MEDIA_ITEM = null;
        private static final Object FAKE_WINDOW_UID = null;
        private static final int FIELD_DEFAULT_POSITION_US = 9;
        private static final int FIELD_DURATION_US = 10;
        private static final int FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = 4;
        private static final int FIELD_FIRST_PERIOD_INDEX = 11;
        private static final int FIELD_IS_DYNAMIC = 6;
        private static final int FIELD_IS_PLACEHOLDER = 8;
        private static final int FIELD_IS_SEEKABLE = 5;
        private static final int FIELD_LAST_PERIOD_INDEX = 12;
        private static final int FIELD_LIVE_CONFIGURATION = 7;
        private static final int FIELD_MEDIA_ITEM = 1;
        private static final int FIELD_POSITION_IN_FIRST_PERIOD_US = 13;
        private static final int FIELD_PRESENTATION_START_TIME_MS = 2;
        private static final int FIELD_WINDOW_START_TIME_MS = 3;
        public static final Object SINGLE_WINDOW_UID = null;
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        @Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        @Nullable
        public MediaItem.LiveConfiguration liveConfiguration;
        @Nullable
        public Object manifest;
        public MediaItem mediaItem;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;
        @Nullable
        @Deprecated
        public Object tag;
        public Object uid;
        public long windowStartTimeMs;

        public static /* synthetic */ Window a(Bundle bundle) {
        }

        public static /* synthetic */ Bundle access$000(Window window, boolean z) {
        }

        private static Window fromBundle(Bundle bundle) {
        }

        private static String keyForField(int field) {
        }

        private final Bundle toBundle(boolean excludeMediaItem) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public long getCurrentUnixTimeMs() {
        }

        public long getDefaultPositionMs() {
        }

        public long getDefaultPositionUs() {
        }

        public long getDurationMs() {
        }

        public long getDurationUs() {
        }

        public long getPositionInFirstPeriodMs() {
        }

        public long getPositionInFirstPeriodUs() {
        }

        public int hashCode() {
        }

        public boolean isLive() {
        }

        public Window set(Object uid, @Nullable MediaItem mediaItem, @Nullable Object manifest, long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, boolean isSeekable, boolean isDynamic, @Nullable MediaItem.LiveConfiguration liveConfiguration, long defaultPositionUs, long durationUs, int firstPeriodIndex, int lastPeriodIndex, long positionInFirstPeriodUs) {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
    }
}
