package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspClient implements Closeable {
    private static final long DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_MS = 30000;
    private boolean hasUpdatedTimelineAndTracks;
    @Nullable
    private KeepAliveMonitor keepAliveMonitor;
    private RtspMessageChannel messageChannel;
    private final MessageSender messageSender;
    private final SparseArray<RtspRequest> pendingRequests;
    private long pendingSeekPositionUs;
    private final ArrayDeque<RtspMediaPeriod.RtpLoadInfo> pendingSetupRtpLoadInfos;
    private final PlaybackEventListener playbackEventListener;
    private boolean receivedAuthorizationRequest;
    @Nullable
    private final RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo;
    @Nullable
    private RtspAuthenticationInfo rtspAuthenticationInfo;
    @Nullable
    private String sessionId;
    private final SessionInfoListener sessionInfoListener;
    private final Uri uri;
    private final String userAgent;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class KeepAliveMonitor implements Runnable, Closeable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler;
        public final /* synthetic */ RtspClient this$0;

        public KeepAliveMonitor(final RtspClient this$0, long intervalMs) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void start() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class MessageListener implements RtspMessageChannel.MessageListener {
        private final Handler messageHandler;
        public final /* synthetic */ RtspClient this$0;

        public MessageListener(final RtspClient this$0) {
        }

        private /* synthetic */ void a(List list) {
        }

        private void handleRtspMessage(List<String> message) {
        }

        private void onDescribeResponseReceived(RtspDescribeResponse response) {
        }

        private void onOptionsResponseReceived(RtspOptionsResponse response) {
        }

        private void onPauseResponseReceived() {
        }

        private void onPlayResponseReceived(RtspPlayResponse response) {
        }

        private void onSetupResponseReceived(RtspSetupResponse response) {
        }

        public /* synthetic */ void b(List list) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onReceivingFailed(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(List<String> message) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public /* synthetic */ void onSendingFailed(List list, Exception exc) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class MessageSender {
        private int cSeq;
        private RtspRequest lastRequest;
        public final /* synthetic */ RtspClient this$0;

        private MessageSender(final RtspClient this$0) {
        }

        private RtspRequest getRequestWithCommonHeaders(int method, @Nullable String sessionId, Map<String, String> additionalHeaders, Uri uri) {
        }

        private void sendRequest(RtspRequest request) {
        }

        public void retryLastRequest() {
        }

        public void sendDescribeRequest(Uri uri, @Nullable String sessionId) {
        }

        public void sendOptionsRequest(Uri uri, @Nullable String sessionId) {
        }

        public void sendPauseRequest(Uri uri, String sessionId) {
        }

        public void sendPlayRequest(Uri uri, long offsetMs, String sessionId) {
        }

        public void sendSetupRequest(Uri trackUri, String transport, @Nullable String sessionId) {
        }

        public void sendTeardownRequest(Uri uri, String sessionId) {
        }

        public /* synthetic */ MessageSender(RtspClient rtspClient, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException error);

        void onPlaybackStarted(long startPositionUs, ImmutableList<RtspTrackTiming> trackTimingList);

        void onRtspSetupCompleted();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String message, @Nullable Throwable cause);

        void onSessionTimelineUpdated(RtspSessionTiming timing, ImmutableList<RtspMediaTrack> tracks);
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String userAgent, Uri uri) {
    }

    public static /* synthetic */ String access$100(RtspClient rtspClient) {
    }

    public static /* synthetic */ KeepAliveMonitor access$1000(RtspClient rtspClient) {
    }

    public static /* synthetic */ KeepAliveMonitor access$1002(RtspClient rtspClient, KeepAliveMonitor keepAliveMonitor) {
    }

    public static /* synthetic */ String access$102(RtspClient rtspClient, String str) {
    }

    public static /* synthetic */ boolean access$1100(List list) {
    }

    public static /* synthetic */ Uri access$1200(RtspClient rtspClient) {
    }

    public static /* synthetic */ SessionInfoListener access$1300(RtspClient rtspClient) {
    }

    public static /* synthetic */ ImmutableList access$1400(SessionDescription sessionDescription, Uri uri) {
    }

    public static /* synthetic */ boolean access$1502(RtspClient rtspClient, boolean z) {
    }

    public static /* synthetic */ void access$1600(RtspClient rtspClient) {
    }

    public static /* synthetic */ PlaybackEventListener access$1700(RtspClient rtspClient) {
    }

    public static /* synthetic */ long access$1800(RtspClient rtspClient) {
    }

    public static /* synthetic */ long access$1802(RtspClient rtspClient, long j2) {
    }

    public static /* synthetic */ String access$200(RtspClient rtspClient) {
    }

    public static /* synthetic */ RtspAuthenticationInfo access$300(RtspClient rtspClient) {
    }

    public static /* synthetic */ RtspAuthenticationInfo access$302(RtspClient rtspClient, RtspAuthenticationInfo rtspAuthenticationInfo) {
    }

    public static /* synthetic */ RtspMessageUtil.RtspAuthUserInfo access$400(RtspClient rtspClient) {
    }

    public static /* synthetic */ void access$500(RtspClient rtspClient, Throwable th) {
    }

    public static /* synthetic */ SparseArray access$600(RtspClient rtspClient) {
    }

    public static /* synthetic */ RtspMessageChannel access$700(RtspClient rtspClient) {
    }

    public static /* synthetic */ boolean access$800(RtspClient rtspClient) {
    }

    public static /* synthetic */ boolean access$802(RtspClient rtspClient, boolean z) {
    }

    public static /* synthetic */ MessageSender access$900(RtspClient rtspClient) {
    }

    private static ImmutableList<RtspMediaTrack> buildTrackList(SessionDescription sessionDescription, Uri uri) {
    }

    private void continueSetupRtspTrack() {
    }

    private void dispatchRtspError(Throwable error) {
    }

    private static Socket getSocket(Uri uri) throws IOException {
    }

    private static boolean serverSupportsDescribe(List<Integer> serverSupportedMethods) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void registerInterleavedDataChannel(int channel, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
    }

    public void retryWithRtpTcp() {
    }

    public void seekToUs(long positionUs) {
    }

    public void setupSelectedTracks(List<RtspMediaPeriod.RtpLoadInfo> loadInfos) {
    }

    public void start() throws IOException {
    }

    public void startPlayback(long offsetMs) {
    }
}
