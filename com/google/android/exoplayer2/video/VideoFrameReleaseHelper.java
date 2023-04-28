package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    @Nullable
    private final DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final FixedFrameRateEstimator frameRateEstimator;
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;
    @Nullable
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    @Nullable
    private final VSyncSampler vsyncSampler;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface DisplayHelper {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public interface Listener {
            void onDefaultDisplayChanged(@Nullable Display defaultDisplay);
        }

        void register(Listener listener);

        void unregister();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DisplayHelperV16 implements DisplayHelper {
        private final WindowManager windowManager;

        private DisplayHelperV16(WindowManager windowManager) {
        }

        @Nullable
        public static DisplayHelper maybeBuildNewInstance(Context context) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }
    }

    @RequiresApi(17)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DisplayHelperV17 implements DisplayHelper, DisplayManager.DisplayListener {
        private final DisplayManager displayManager;
        @Nullable
        private DisplayHelper.Listener listener;

        private DisplayHelperV17(DisplayManager displayManager) {
        }

        private Display getDefaultDisplay() {
        }

        @Nullable
        public static DisplayHelper maybeBuildNewInstance(Context context) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int displayId) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int displayId) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int displayId) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final VSyncSampler INSTANCE = null;
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs;

        private VSyncSampler() {
        }

        private void addObserverInternal() {
        }

        private void createChoreographerInstanceInternal() {
        }

        public static VSyncSampler getInstance() {
        }

        private void removeObserverInternal() {
        }

        public void addObserver() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long vsyncTimeNs) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }

        public void removeObserver() {
        }
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
    }

    public static /* synthetic */ void a(VideoFrameReleaseHelper videoFrameReleaseHelper, Display display) {
    }

    private static boolean adjustmentAllowed(long unadjustedReleaseTimeNs, long adjustedReleaseTimeNs) {
    }

    private void clearSurfaceFrameRate() {
    }

    private static long closestVsync(long releaseTime, long sampledVsyncTime, long vsyncDuration) {
    }

    @Nullable
    private static DisplayHelper maybeBuildDisplayHelper(@Nullable Context context) {
    }

    private void resetAdjustment() {
    }

    @RequiresApi(30)
    private static void setSurfaceFrameRateV30(Surface surface, float frameRate) {
    }

    private void updateDefaultDisplayRefreshRateParams(@Nullable Display defaultDisplay) {
    }

    private void updateSurfaceMediaFrameRate() {
    }

    private void updateSurfacePlaybackFrameRate(boolean isNewSurface) {
    }

    public long adjustReleaseTime(long releaseTimeNs) {
    }

    public void onDisabled() {
    }

    public void onEnabled() {
    }

    public void onFormatChanged(float formatFrameRate) {
    }

    public void onNextFrame(long framePresentationTimeUs) {
    }

    public void onPlaybackSpeed(float playbackSpeed) {
    }

    public void onPositionReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void onSurfaceChanged(@Nullable Surface surface) {
    }
}
