package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
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
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private ControlDispatcher controlDispatcher;
    private long currentWindowOffset;
    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    @Nullable
    private final View fastForwardButton;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    @Nullable
    private final View nextButton;
    @Nullable
    private final View pauseButton;
    private final Timeline.Period period;
    @Nullable
    private final View playButton;
    private boolean[] playedAdGroups;
    @Nullable
    private Player player;
    @Nullable
    private final TextView positionView;
    @Nullable
    private final View previousButton;
    @Nullable
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    @Nullable
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    @Nullable
    private final View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    @Nullable
    private final View vrButton;
    private final Timeline.Window window;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        public final /* synthetic */ PlayerControlView this$0;

        private ComponentListener(final PlayerControlView this$0) {
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
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

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long position) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long position) {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long position, boolean canceled) {
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

        public /* synthetic */ ComponentListener(PlayerControlView playerControlView, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ProgressUpdateListener {
        void onProgressUpdate(long position, long bufferedPosition);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface VisibilityListener {
        void onVisibilityChange(int visibility);
    }

    public PlayerControlView(Context context) {
    }

    public static /* synthetic */ void a(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$100(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ Formatter access$1000(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ Player access$1100(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$1200(PlayerControlView playerControlView, Player player, long j2) {
    }

    public static /* synthetic */ View access$1300(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ ControlDispatcher access$1400(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ View access$1500(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ View access$1600(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ View access$1700(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ View access$1800(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$1900(PlayerControlView playerControlView, Player player) {
    }

    public static /* synthetic */ void access$200(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ View access$2000(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$2100(PlayerControlView playerControlView, Player player) {
    }

    public static /* synthetic */ ImageView access$2200(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ int access$2300(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ ImageView access$2400(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$300(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$400(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$500(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ void access$600(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ boolean access$702(PlayerControlView playerControlView, boolean z) {
    }

    public static /* synthetic */ TextView access$800(PlayerControlView playerControlView) {
    }

    public static /* synthetic */ StringBuilder access$900(PlayerControlView playerControlView) {
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
    }

    private void dispatchPause(Player player) {
    }

    private void dispatchPlay(Player player) {
    }

    private void dispatchPlayPause(Player player) {
    }

    private void hideAfterTimeout() {
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int keyCode) {
    }

    private void requestPlayPauseFocus() {
    }

    private boolean seekTo(Player player, int windowIndex, long positionMs) {
    }

    private void seekToTimeBarPosition(Player player, long positionMs) {
    }

    private boolean shouldShowPauseButton() {
    }

    private void updateAll() {
    }

    private void updateButton(boolean visible, boolean enabled, @Nullable View view) {
    }

    private void updateNavigation() {
    }

    private void updatePlayPauseButton() {
    }

    private void updateProgress() {
    }

    private void updateRepeatModeButton() {
    }

    private void updateShuffleButton() {
    }

    private void updateTimeline() {
    }

    public void addVisibilityListener(VisibilityListener listener) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
    }

    public boolean dispatchMediaKeyEvent(KeyEvent event) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
    }

    @Nullable
    public Player getPlayer() {
    }

    public int getRepeatToggleModes() {
    }

    public boolean getShowShuffleButton() {
    }

    public int getShowTimeoutMs() {
    }

    public boolean getShowVrButton() {
    }

    public void hide() {
    }

    public boolean isVisible() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public void removeVisibilityListener(VisibilityListener listener) {
    }

    @Deprecated
    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
    }

    public void setExtraAdGroupMarkers(@Nullable long[] extraAdGroupTimesMs, @Nullable boolean[] extraPlayedAdGroups) {
    }

    public void setPlayer(@Nullable Player player) {
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener listener) {
    }

    public void setRepeatToggleModes(int repeatToggleModes) {
    }

    public void setShowFastForwardButton(boolean showFastForwardButton) {
    }

    public void setShowMultiWindowTimeBar(boolean showMultiWindowTimeBar) {
    }

    public void setShowNextButton(boolean showNextButton) {
    }

    public void setShowPreviousButton(boolean showPreviousButton) {
    }

    public void setShowRewindButton(boolean showRewindButton) {
    }

    public void setShowShuffleButton(boolean showShuffleButton) {
    }

    public void setShowTimeoutMs(int showTimeoutMs) {
    }

    public void setShowVrButton(boolean showVrButton) {
    }

    public void setTimeBarMinUpdateInterval(int minUpdateIntervalMs) {
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
    }

    public void show() {
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attrs) {
    }

    private static int getRepeatToggleModes(TypedArray a2, int defaultValue) {
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet playbackAttrs) {
    }
}
