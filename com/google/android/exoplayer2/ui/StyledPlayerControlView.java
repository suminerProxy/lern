package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
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
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    @Nullable
    private View audioTrackButton;
    private TrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private ControlDispatcher controlDispatcher;
    private StyledPlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    @Nullable
    private final View fastForwardButton;
    @Nullable
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    @Nullable
    private ImageView fullScreenButton;
    private final String fullScreenEnterContentDescription;
    private final Drawable fullScreenEnterDrawable;
    private final String fullScreenExitContentDescription;
    private final Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;
    @Nullable
    private ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    @Nullable
    private final View nextButton;
    @Nullable
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Timeline.Period period;
    @Nullable
    private final View playPauseButton;
    private PlaybackSpeedAdapter playbackSpeedAdapter;
    @Nullable
    private View playbackSpeedButton;
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
    private Resources resources;
    @Nullable
    private final View rewindButton;
    @Nullable
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private SettingsAdapter settingsAdapter;
    @Nullable
    private View settingsButton;
    private RecyclerView settingsView;
    private PopupWindow settingsWindow;
    private int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;
    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    @Nullable
    private ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private TrackSelectionAdapter textTrackSelectionAdapter;
    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private TrackNameProvider trackNameProvider;
    @Nullable
    private DefaultTrackSelector trackSelector;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    @Nullable
    private final View vrButton;
    private final Timeline.Window window;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        public final /* synthetic */ StyledPlayerControlView this$0;

        private AudioTrackSelectionAdapter(final StyledPlayerControlView this$0) {
        }

        private /* synthetic */ void e(View view) {
        }

        public /* synthetic */ void f(View view) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<Integer> rendererIndices, List<TrackInfo> trackInfos, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder holder) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String subtext) {
        }

        public /* synthetic */ AudioTrackSelectionAdapter(StyledPlayerControlView styledPlayerControlView, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        public final /* synthetic */ StyledPlayerControlView this$0;

        private ComponentListener(final StyledPlayerControlView this$0) {
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

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
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

        public /* synthetic */ ComponentListener(StyledPlayerControlView styledPlayerControlView, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean isFullScreen);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final int[] playbackSpeedsMultBy100;
        private int selectedIndex;
        public final /* synthetic */ StyledPlayerControlView this$0;

        public PlaybackSpeedAdapter(final StyledPlayerControlView this$0, String[] playbackSpeedTexts, int[] playbackSpeedsMultBy100) {
        }

        private /* synthetic */ void c(int i2, View view) {
        }

        public /* synthetic */ void d(int i2, View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        public String getSelectedText() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(SubSettingViewHolder holder, int position) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ SubSettingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        }

        public void updateSelectedIndex(float playbackSpeed) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(SubSettingViewHolder holder, int position) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public SubSettingViewHolder onCreateViewHolder2(ViewGroup parent, int viewType) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ProgressUpdateListener {
        void onProgressUpdate(long position, long bufferedPosition);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class SettingViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;
        public final /* synthetic */ StyledPlayerControlView this$0;

        public SettingViewHolder(final StyledPlayerControlView this$0, View itemView) {
        }

        public static /* synthetic */ TextView access$3800(SettingViewHolder settingViewHolder) {
        }

        public static /* synthetic */ TextView access$3900(SettingViewHolder settingViewHolder) {
        }

        public static /* synthetic */ ImageView access$4000(SettingViewHolder settingViewHolder) {
        }

        private /* synthetic */ void c(View view) {
        }

        public /* synthetic */ void d(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;
        public final /* synthetic */ StyledPlayerControlView this$0;

        public SettingsAdapter(final StyledPlayerControlView this$0, String[] mainTexts, Drawable[] iconIds) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(SettingViewHolder holder, int position) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ SettingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        }

        public void setSubTextAtPosition(int position, String subText) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(SettingViewHolder holder, int position) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public SettingViewHolder onCreateViewHolder2(ViewGroup parent, int viewType) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View itemView) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        public final /* synthetic */ StyledPlayerControlView this$0;

        private TextTrackSelectionAdapter(final StyledPlayerControlView this$0) {
        }

        private /* synthetic */ void e(View view) {
        }

        public /* synthetic */ void f(View view) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<Integer> rendererIndices, List<TrackInfo> trackInfos, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(SubSettingViewHolder holder, int position) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder holder) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String subtext) {
        }

        public /* synthetic */ TextTrackSelectionAdapter(StyledPlayerControlView styledPlayerControlView, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(SubSettingViewHolder holder, int position) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TrackInfo {
        public final int groupIndex;
        public final int rendererIndex;
        public final boolean selected;
        public final int trackIndex;
        public final String trackName;

        public TrackInfo(int rendererIndex, int groupIndex, int trackIndex, String trackName, boolean selected) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        @Nullable
        public MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
        public List<Integer> rendererIndices;
        public final /* synthetic */ StyledPlayerControlView this$0;
        public List<TrackInfo> tracks;

        public TrackSelectionAdapter(final StyledPlayerControlView this$0) {
        }

        private /* synthetic */ void c(TrackInfo trackInfo, View view) {
        }

        public void clear() {
        }

        public /* synthetic */ void d(TrackInfo trackInfo, View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        public abstract void init(List<Integer> rendererIndices, List<TrackInfo> trackInfos, MappingTrackSelector.MappedTrackInfo mappedTrackInfo);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(SubSettingViewHolder holder, int position) {
        }

        public abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder holder);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ SubSettingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        }

        public abstract void onTrackSelection(String subtext);

        /* JADX WARN: Can't rename method to resolve collision */
        public void onBindViewHolder(SubSettingViewHolder holder, int position) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public SubSettingViewHolder onCreateViewHolder2(ViewGroup parent, int viewType) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface VisibilityListener {
        void onVisibilityChange(int visibility);
    }

    public StyledPlayerControlView(Context context) {
    }

    public static /* synthetic */ void a(StyledPlayerControlView styledPlayerControlView, View view) {
    }

    public static /* synthetic */ void access$1000(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ boolean access$1102(StyledPlayerControlView styledPlayerControlView, boolean z) {
    }

    public static /* synthetic */ TextView access$1200(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ StringBuilder access$1300(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ Formatter access$1400(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ StyledPlayerControlViewLayoutManager access$1500(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ Player access$1600(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$1700(StyledPlayerControlView styledPlayerControlView, Player player, long j2) {
    }

    public static /* synthetic */ boolean access$1800(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ View access$1900(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ ControlDispatcher access$2000(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ View access$2100(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ View access$2200(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ View access$2300(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ View access$2400(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$2500(StyledPlayerControlView styledPlayerControlView, Player player) {
    }

    public static /* synthetic */ ImageView access$2600(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ int access$2700(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ ImageView access$2800(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ View access$2900(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$300(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ SettingsAdapter access$3000(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$3100(StyledPlayerControlView styledPlayerControlView, RecyclerView.Adapter adapter) {
    }

    public static /* synthetic */ View access$3200(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ PlaybackSpeedAdapter access$3300(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ View access$3400(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ TrackSelectionAdapter access$3500(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ ImageView access$3600(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ TrackSelectionAdapter access$3700(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$400(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$4100(StyledPlayerControlView styledPlayerControlView, int i2) {
    }

    public static /* synthetic */ void access$4200(StyledPlayerControlView styledPlayerControlView, float f2) {
    }

    public static /* synthetic */ PopupWindow access$4300(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ Drawable access$4400(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ Drawable access$4500(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ String access$4600(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ String access$4700(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ DefaultTrackSelector access$4800(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$500(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$600(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$700(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$800(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void access$900(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void b(StyledPlayerControlView styledPlayerControlView) {
    }

    public static /* synthetic */ void c(StyledPlayerControlView styledPlayerControlView, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
    }

    private void dispatchPause(Player player) {
    }

    private void dispatchPlay(Player player) {
    }

    private void dispatchPlayPause(Player player) {
    }

    private void displaySettingsWindow(RecyclerView.Adapter<?> adapter) {
    }

    private void gatherTrackInfosForAdapter(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int rendererIndex, List<TrackInfo> tracks) {
    }

    private void initTrackSelectionAdapter() {
    }

    private static void initializeFullScreenButton(View fullScreenButton, View.OnClickListener listener) {
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int keyCode) {
    }

    private void onFullScreenButtonClicked(View v) {
    }

    private void onLayoutChange(View v, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    }

    private void onSettingViewClicked(int position) {
    }

    private boolean seekTo(Player player, int windowIndex, long positionMs) {
    }

    private void seekToTimeBarPosition(Player player, long positionMs) {
    }

    private void setPlaybackSpeed(float speed) {
    }

    private boolean shouldShowPauseButton() {
    }

    private void updateButton(boolean enabled, @Nullable View view) {
    }

    private void updateFastForwardButton() {
    }

    private void updateFullScreenButtonForState(@Nullable ImageView fullScreenButton, boolean isFullScreen) {
    }

    private static void updateFullScreenButtonVisibility(@Nullable View fullScreenButton, boolean visible) {
    }

    private void updateNavigation() {
    }

    private void updatePlayPauseButton() {
    }

    private void updatePlaybackSpeedList() {
    }

    private void updateProgress() {
    }

    private void updateRepeatModeButton() {
    }

    private void updateRewindButton() {
    }

    private void updateSettingsWindowSize() {
    }

    private void updateShuffleButton() {
    }

    private void updateTimeline() {
    }

    private void updateTrackLists() {
    }

    public void addVisibilityListener(VisibilityListener listener) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
    }

    public boolean dispatchMediaKeyEvent(KeyEvent event) {
    }

    @Nullable
    public Player getPlayer() {
    }

    public int getRepeatToggleModes() {
    }

    public boolean getShowShuffleButton() {
    }

    public boolean getShowSubtitleButton() {
    }

    public int getShowTimeoutMs() {
    }

    public boolean getShowVrButton() {
    }

    public void hide() {
    }

    public void hideImmediately() {
    }

    public boolean isAnimationEnabled() {
    }

    public boolean isFullyVisible() {
    }

    public boolean isVisible() {
    }

    public void notifyOnVisibilityChange() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
    }

    public void removeVisibilityListener(VisibilityListener listener) {
    }

    public void requestPlayPauseFocus() {
    }

    public void setAnimationEnabled(boolean animationEnabled) {
    }

    @Deprecated
    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
    }

    public void setExtraAdGroupMarkers(@Nullable long[] extraAdGroupTimesMs, @Nullable boolean[] extraPlayedAdGroups) {
    }

    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener listener) {
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

    public void setShowSubtitleButton(boolean showSubtitleButton) {
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

    public void updateAll() {
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attrs) {
    }

    private static int getRepeatToggleModes(TypedArray a2, int defaultValue) {
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet playbackAttrs) {
    }
}
