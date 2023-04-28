package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
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
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.video.VideoSize;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PlayerView extends FrameLayout implements AdViewProvider {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int PICTURE_TYPE_NOT_SET = -1;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    @Nullable
    private final FrameLayout adOverlayFrameLayout;
    @Nullable
    private final ImageView artworkView;
    @Nullable
    private final View bufferingView;
    private final ComponentListener componentListener;
    @Nullable
    private final AspectRatioFrameLayout contentFrame;
    @Nullable
    private final PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    @Nullable
    private PlayerControlView.VisibilityListener controllerVisibilityListener;
    @Nullable
    private CharSequence customErrorMessage;
    @Nullable
    private Drawable defaultArtwork;
    @Nullable
    private ErrorMessageProvider<? super PlaybackException> errorMessageProvider;
    @Nullable
    private final TextView errorMessageView;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;
    @Nullable
    private final FrameLayout overlayFrameLayout;
    @Nullable
    private Player player;
    private int showBuffering;
    @Nullable
    private final View shutterView;
    @Nullable
    private final SubtitleView subtitleView;
    @Nullable
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ComponentListener implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.VisibilityListener {
        @Nullable
        private Object lastPeriodUidWithTracks;
        private final Timeline.Period period;
        public final /* synthetic */ PlayerView this$0;

        public ComponentListener(final PlayerView this$0) {
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
        public void onCues(List<Cue> cues) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
        public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
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
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int playbackState) {
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
        public void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
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
        public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray selections) {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onVideoSizeChanged(int i2, int i3, int i4, float f2) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.VisibilityListener
        public void onVisibilityChange(int visibility) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
        public /* synthetic */ void onVolumeChanged(float f2) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface ShowBuffering {
    }

    public PlayerView(Context context) {
    }

    public static /* synthetic */ SubtitleView access$000(PlayerView playerView) {
    }

    public static /* synthetic */ void access$100(PlayerView playerView) {
    }

    public static /* synthetic */ int access$1000(PlayerView playerView) {
    }

    public static /* synthetic */ void access$1100(TextureView textureView, int i2) {
    }

    public static /* synthetic */ boolean access$1200(PlayerView playerView) {
    }

    public static /* synthetic */ void access$1300(PlayerView playerView) {
    }

    public static /* synthetic */ View access$200(PlayerView playerView) {
    }

    public static /* synthetic */ Player access$300(PlayerView playerView) {
    }

    public static /* synthetic */ void access$400(PlayerView playerView, boolean z) {
    }

    public static /* synthetic */ void access$500(PlayerView playerView) {
    }

    public static /* synthetic */ void access$600(PlayerView playerView) {
    }

    public static /* synthetic */ void access$700(PlayerView playerView) {
    }

    public static /* synthetic */ boolean access$800(PlayerView playerView) {
    }

    public static /* synthetic */ boolean access$900(PlayerView playerView) {
    }

    private static void applyTextureViewRotation(TextureView textureView, int textureViewRotation) {
    }

    private void closeShutter() {
    }

    private static void configureEditModeLogo(Resources resources, ImageView logo) {
    }

    @RequiresApi(23)
    private static void configureEditModeLogoV23(Resources resources, ImageView logo) {
    }

    private void hideArtwork() {
    }

    @SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int keyCode) {
    }

    private boolean isPlayingAd() {
    }

    private void maybeShowController(boolean isForced) {
    }

    @RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMediaMetadata(MediaMetadata mediaMetadata) {
    }

    @RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(@Nullable Drawable drawable) {
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrame, int resizeMode) {
    }

    private boolean shouldShowControllerIndefinitely() {
    }

    public static void switchTargetView(Player player, @Nullable PlayerView oldPlayerView, @Nullable PlayerView newPlayerView) {
    }

    private boolean toggleControllerVisibility() {
    }

    private void updateAspectRatio() {
    }

    private void updateBuffering() {
    }

    private void updateContentDescription() {
    }

    private void updateControllerVisibility() {
    }

    private void updateErrorMessage() {
    }

    private void updateForCurrentTrackSelections(boolean isNewPlayer) {
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
    }

    public boolean dispatchMediaKeyEvent(KeyEvent event) {
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public List<AdOverlayInfo> getAdOverlayInfos() {
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public ViewGroup getAdViewGroup() {
    }

    public boolean getControllerAutoShow() {
    }

    public boolean getControllerHideOnTouch() {
    }

    public int getControllerShowTimeoutMs() {
    }

    @Nullable
    public Drawable getDefaultArtwork() {
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
    }

    @Nullable
    public Player getPlayer() {
    }

    public int getResizeMode() {
    }

    @Nullable
    public SubtitleView getSubtitleView() {
    }

    public boolean getUseArtwork() {
    }

    public boolean getUseController() {
    }

    @Nullable
    public View getVideoSurfaceView() {
    }

    public void hideController() {
    }

    public boolean isControllerVisible() {
    }

    public void onContentAspectRatioChanged(@Nullable AspectRatioFrameLayout contentFrame, float aspectRatio) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent ev) {
    }

    @Override // android.view.View
    public boolean performClick() {
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.AspectRatioListener listener) {
    }

    @Deprecated
    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
    }

    public void setControllerAutoShow(boolean controllerAutoShow) {
    }

    public void setControllerHideDuringAds(boolean controllerHideDuringAds) {
    }

    public void setControllerHideOnTouch(boolean controllerHideOnTouch) {
    }

    public void setControllerShowTimeoutMs(int controllerShowTimeoutMs) {
    }

    public void setControllerVisibilityListener(@Nullable PlayerControlView.VisibilityListener listener) {
    }

    public void setCustomErrorMessage(@Nullable CharSequence message) {
    }

    public void setDefaultArtwork(@Nullable Drawable defaultArtwork) {
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
    }

    public void setExtraAdGroupMarkers(@Nullable long[] extraAdGroupTimesMs, @Nullable boolean[] extraPlayedAdGroups) {
    }

    public void setKeepContentOnPlayerReset(boolean keepContentOnPlayerReset) {
    }

    public void setPlayer(@Nullable Player player) {
    }

    public void setRepeatToggleModes(int repeatToggleModes) {
    }

    public void setResizeMode(int resizeMode) {
    }

    public void setShowBuffering(int showBuffering) {
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

    public void setShutterBackgroundColor(int color) {
    }

    public void setUseArtwork(boolean useArtwork) {
    }

    public void setUseController(boolean useController) {
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public void showController() {
    }

    public PlayerView(Context context, @Nullable AttributeSet attrs) {
    }

    private void showController(boolean showIndefinitely) {
    }

    public PlayerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    }
}
