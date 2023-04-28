package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;
    @Nullable
    private NotificationCompat.Builder builder;
    @Nullable
    private List<NotificationCompat.Action> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private ControlDispatcher controlDispatcher;
    private int currentNotificationTag;
    @Nullable
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, NotificationCompat.Action> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    @Nullable
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    @Nullable
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    @Nullable
    private final NotificationListener notificationListener;
    private final NotificationManagerCompat notificationManager;
    private final Map<String, NotificationCompat.Action> playbackActions;
    @Nullable
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    @DrawableRes
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class BitmapCallback {
        private final int notificationTag;
        public final /* synthetic */ PlayerNotificationManager this$0;

        public /* synthetic */ BitmapCallback(PlayerNotificationManager playerNotificationManager, int i2, AnonymousClass1 anonymousClass1) {
        }

        public void onBitmap(final Bitmap bitmap) {
        }

        private BitmapCallback(final PlayerNotificationManager this$0, int notificationTag) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context, int instanceId);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String action, Intent intent);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface MediaDescriptionAdapter {
        @Nullable
        PendingIntent createCurrentContentIntent(Player player);

        @Nullable
        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        @Nullable
        Bitmap getCurrentLargeIcon(Player player, BitmapCallback callback);

        @Nullable
        CharSequence getCurrentSubText(Player player);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        public final /* synthetic */ PlayerNotificationManager this$0;

        private NotificationBroadcastReceiver(final PlayerNotificationManager this$0) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ NotificationBroadcastReceiver(PlayerNotificationManager playerNotificationManager, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface NotificationListener {
        void onNotificationCancelled(int notificationId, boolean dismissedByUser);

        void onNotificationPosted(int notificationId, Notification notification, boolean ongoing);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class PlayerListener implements Player.Listener {
        public final /* synthetic */ PlayerNotificationManager this$0;

        private PlayerListener(final PlayerNotificationManager this$0) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onAudioSessionIdChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
        public /* synthetic */ void onCues(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public void onEvents(Player player, Player.Events events) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.metadata.MetadataOutput
        public /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackStateChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onRepeatModeChanged(int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekBackIncrementChanged(long j2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j2) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(int i2, int i3, int i4, float f2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onVolumeChanged(float f2) {
        }

        public /* synthetic */ PlayerListener(PlayerNotificationManager playerNotificationManager, AnonymousClass1 anonymousClass1) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Priority {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Visibility {
    }

    public /* synthetic */ PlayerNotificationManager(Context context, String str, int i2, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener, CustomActionReceiver customActionReceiver, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str2, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ boolean a(PlayerNotificationManager playerNotificationManager, Message message) {
    }

    public static /* synthetic */ void access$100(PlayerNotificationManager playerNotificationManager, Bitmap bitmap, int i2) {
    }

    public static /* synthetic */ void access$1000(PlayerNotificationManager playerNotificationManager, boolean z) {
    }

    public static /* synthetic */ CustomActionReceiver access$1100(PlayerNotificationManager playerNotificationManager) {
    }

    public static /* synthetic */ Map access$1200(PlayerNotificationManager playerNotificationManager) {
    }

    public static /* synthetic */ void access$500(PlayerNotificationManager playerNotificationManager) {
    }

    public static /* synthetic */ Player access$600(PlayerNotificationManager playerNotificationManager) {
    }

    public static /* synthetic */ boolean access$700(PlayerNotificationManager playerNotificationManager) {
    }

    public static /* synthetic */ int access$800(PlayerNotificationManager playerNotificationManager) {
    }

    public static /* synthetic */ ControlDispatcher access$900(PlayerNotificationManager playerNotificationManager) {
    }

    private static PendingIntent createBroadcastIntent(String action, Context context, int instanceId) {
    }

    private static Map<String, NotificationCompat.Action> createPlaybackActions(Context context, int instanceId, int playActionIconResourceId, int pauseActionIconResourceId, int stopActionIconResourceId, int rewindActionIconResourceId, int fastForwardActionIconResourceId, int previousActionIconResourceId, int nextActionIconResourceId) {
    }

    private boolean handleMessage(Message msg) {
    }

    private void postStartOrUpdateNotification() {
    }

    private void postUpdateNotificationBitmap(Bitmap bitmap, int notificationTag) {
    }

    private static void setLargeIcon(NotificationCompat.Builder builder, @Nullable Bitmap largeIcon) {
    }

    private boolean shouldShowPauseButton(Player player) {
    }

    private void startOrUpdateNotification(Player player, @Nullable Bitmap bitmap) {
    }

    private void stopNotification(boolean dismissedByUser) {
    }

    @Nullable
    public NotificationCompat.Builder createNotification(Player player, @Nullable NotificationCompat.Builder builder, boolean ongoing, @Nullable Bitmap largeIcon) {
    }

    public int[] getActionIndicesForCompactView(List<String> actionNames, Player player) {
    }

    public List<String> getActions(Player player) {
    }

    public boolean getOngoing(Player player) {
    }

    public void invalidate() {
    }

    public final void setBadgeIconType(int badgeIconType) {
    }

    public final void setColor(int color) {
    }

    public final void setColorized(boolean colorized) {
    }

    @Deprecated
    public final void setControlDispatcher(ControlDispatcher controlDispatcher) {
    }

    public final void setDefaults(int defaults) {
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
    }

    public final void setPlayer(@Nullable Player player) {
    }

    public final void setPriority(int priority) {
    }

    public final void setSmallIcon(@DrawableRes int smallIconResourceId) {
    }

    public final void setUseChronometer(boolean useChronometer) {
    }

    public void setUseFastForwardAction(boolean useFastForwardAction) {
    }

    public void setUseFastForwardActionInCompactView(boolean useFastForwardActionInCompactView) {
    }

    public void setUseNextAction(boolean useNextAction) {
    }

    public void setUseNextActionInCompactView(boolean useNextActionInCompactView) {
    }

    public final void setUsePlayPauseActions(boolean usePlayPauseActions) {
    }

    public void setUsePreviousAction(boolean usePreviousAction) {
    }

    public void setUsePreviousActionInCompactView(boolean usePreviousActionInCompactView) {
    }

    public void setUseRewindAction(boolean useRewindAction) {
    }

    public void setUseRewindActionInCompactView(boolean useRewindActionInCompactView) {
    }

    public final void setUseStopAction(boolean useStopAction) {
    }

    public final void setVisibility(int visibility) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Builder {
        private int channelDescriptionResourceId;
        private final String channelId;
        private int channelImportance;
        private int channelNameResourceId;
        private final Context context;
        @Nullable
        private CustomActionReceiver customActionReceiver;
        private int fastForwardActionIconResourceId;
        @Nullable
        private String groupKey;
        private MediaDescriptionAdapter mediaDescriptionAdapter;
        private int nextActionIconResourceId;
        private final int notificationId;
        @Nullable
        private NotificationListener notificationListener;
        private int pauseActionIconResourceId;
        private int playActionIconResourceId;
        private int previousActionIconResourceId;
        private int rewindActionIconResourceId;
        private int smallIconResourceId;
        private int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int notificationId, String channelId, MediaDescriptionAdapter mediaDescriptionAdapter) {
        }

        public PlayerNotificationManager build() {
        }

        public Builder setChannelDescriptionResourceId(int channelDescriptionResourceId) {
        }

        public Builder setChannelImportance(int channelImportance) {
        }

        public Builder setChannelNameResourceId(int channelNameResourceId) {
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
        }

        public Builder setFastForwardActionIconResourceId(int fastForwardActionIconResourceId) {
        }

        public Builder setGroup(String groupKey) {
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
        }

        public Builder setNextActionIconResourceId(int nextActionIconResourceId) {
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
        }

        public Builder setPauseActionIconResourceId(int pauseActionIconResourceId) {
        }

        public Builder setPlayActionIconResourceId(int playActionIconResourceId) {
        }

        public Builder setPreviousActionIconResourceId(int previousActionIconResourceId) {
        }

        public Builder setRewindActionIconResourceId(int rewindActionIconResourceId) {
        }

        public Builder setSmallIconResourceId(int smallIconResourceId) {
        }

        public Builder setStopActionIconResourceId(int stopActionIconResourceId) {
        }

        public Builder(Context context, int notificationId, String channelId) {
        }
    }

    private PlayerNotificationManager(Context context, String channelId, int notificationId, MediaDescriptionAdapter mediaDescriptionAdapter, @Nullable NotificationListener notificationListener, @Nullable CustomActionReceiver customActionReceiver, int smallIconResourceId, int playActionIconResourceId, int pauseActionIconResourceId, int stopActionIconResourceId, int rewindActionIconResourceId, int fastForwardActionIconResourceId, int previousActionIconResourceId, int nextActionIconResourceId, @Nullable String groupKey) {
    }
}
