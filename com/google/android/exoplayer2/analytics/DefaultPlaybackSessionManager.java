package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.PlaybackSessionManager;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final Supplier<String> DEFAULT_SESSION_ID_GENERATOR = null;
    private static final Random RANDOM = null;
    private static final int SESSION_ID_LENGTH = 12;
    @Nullable
    private String currentSessionId;
    private Timeline currentTimeline;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final Supplier<String> sessionIdGenerator;
    private final HashMap<String, SessionDescriptor> sessions;
    private final Timeline.Window window;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class SessionDescriptor {
        private MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final String sessionId;
        public final /* synthetic */ DefaultPlaybackSessionManager this$0;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(final DefaultPlaybackSessionManager this$0, String sessionId, @Nullable int windowIndex, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        public static /* synthetic */ String access$000(SessionDescriptor sessionDescriptor) {
        }

        public static /* synthetic */ long access$100(SessionDescriptor sessionDescriptor) {
        }

        public static /* synthetic */ int access$200(SessionDescriptor sessionDescriptor) {
        }

        public static /* synthetic */ boolean access$300(SessionDescriptor sessionDescriptor) {
        }

        public static /* synthetic */ boolean access$302(SessionDescriptor sessionDescriptor, boolean z) {
        }

        public static /* synthetic */ boolean access$400(SessionDescriptor sessionDescriptor) {
        }

        public static /* synthetic */ boolean access$402(SessionDescriptor sessionDescriptor, boolean z) {
        }

        public static /* synthetic */ MediaSource.MediaPeriodId access$500(SessionDescriptor sessionDescriptor) {
        }

        private int resolveWindowIndexToNewTimeline(Timeline oldTimeline, Timeline newTimeline, int windowIndex) {
        }

        public boolean belongsToSession(int eventWindowIndex, @Nullable MediaSource.MediaPeriodId eventMediaPeriodId) {
        }

        public boolean isFinishedAtEventTime(AnalyticsListener.EventTime eventTime) {
        }

        public void maybeSetWindowSequenceNumber(int eventWindowIndex, @Nullable MediaSource.MediaPeriodId eventMediaPeriodId) {
        }

        public boolean tryResolvingToNewTimeline(Timeline oldTimeline, Timeline newTimeline) {
        }
    }

    public DefaultPlaybackSessionManager() {
    }

    public static /* synthetic */ String a() {
    }

    public static /* synthetic */ Timeline.Window access$600(DefaultPlaybackSessionManager defaultPlaybackSessionManager) {
    }

    public static /* synthetic */ Timeline.Period access$700(DefaultPlaybackSessionManager defaultPlaybackSessionManager) {
    }

    private static String generateDefaultSessionId() {
    }

    private SessionDescriptor getOrAddSession(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @RequiresNonNull({"listener"})
    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String sessionId) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    @Nullable
    public synchronized String getActiveSessionId() {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessions(AnalyticsListener.EventTime eventTime) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int reason) {
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
    }

    public DefaultPlaybackSessionManager(Supplier<String> sessionIdGenerator) {
    }
}
