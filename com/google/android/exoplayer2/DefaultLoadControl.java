package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private boolean isLoading;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private int targetBufferBytes;
    private final int targetBufferBytesOverwrite;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        @Nullable
        private DefaultAllocator allocator;
        private int backBufferDurationMs;
        private int bufferForPlaybackAfterRebufferMs;
        private int bufferForPlaybackMs;
        private boolean buildCalled;
        private int maxBufferMs;
        private int minBufferMs;
        private boolean prioritizeTimeOverSizeThresholds;
        private boolean retainBackBufferFromKeyframe;
        private int targetBufferBytes;

        public DefaultLoadControl build() {
        }

        @Deprecated
        public DefaultLoadControl createDefaultLoadControl() {
        }

        public Builder setAllocator(DefaultAllocator allocator) {
        }

        public Builder setBackBuffer(int backBufferDurationMs, boolean retainBackBufferFromKeyframe) {
        }

        public Builder setBufferDurationsMs(int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs) {
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean prioritizeTimeOverSizeThresholds) {
        }

        public Builder setTargetBufferBytes(int targetBufferBytes) {
        }
    }

    public DefaultLoadControl() {
    }

    public static /* synthetic */ void access$000(int i2, int i3, String str, String str2) {
    }

    private static void assertGreaterOrEqual(int value1, int value2, String name1, String name2) {
    }

    private static int getDefaultBufferSize(int trackType) {
    }

    private void reset(boolean resetAllocator) {
    }

    public int calculateTargetBufferBytes(Renderer[] renderers, ExoTrackSelection[] trackSelectionArray) {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public Allocator getAllocator() {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onPrepared() {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onReleased() {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onStopped() {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onTracksSelected(Renderer[] renderers, TrackGroupArray trackGroups, ExoTrackSelection[] trackSelections) {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long playbackPositionUs, long bufferedDurationUs, float playbackSpeed) {
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long bufferedDurationUs, float playbackSpeed, boolean rebuffering, long targetLiveOffsetUs) {
    }

    public DefaultLoadControl(DefaultAllocator allocator, int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs, int targetBufferBytes, boolean prioritizeTimeOverSizeThresholds, int backBufferDurationMs, boolean retainBackBufferFromKeyframe) {
    }
}
