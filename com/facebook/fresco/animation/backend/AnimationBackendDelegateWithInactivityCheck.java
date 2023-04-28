package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.time.MonotonicClock;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimationBackendDelegateWithInactivityCheck<T extends AnimationBackend> extends AnimationBackendDelegate<T> {
    @VisibleForTesting
    public static final long INACTIVITY_CHECK_POLLING_TIME_MS = 1000;
    @VisibleForTesting
    public static final long INACTIVITY_THRESHOLD_MS = 2000;
    private long mInactivityCheckPollingTimeMs;
    private boolean mInactivityCheckScheduled;
    @Nullable
    private InactivityListener mInactivityListener;
    private long mInactivityThresholdMs;
    private final Runnable mIsInactiveCheck;
    private long mLastDrawnTimeMs;
    private final MonotonicClock mMonotonicClock;
    private final ScheduledExecutorService mScheduledExecutorServiceForUiThread;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InactivityListener {
        void onInactive();
    }

    private AnimationBackendDelegateWithInactivityCheck(@Nullable T animationBackend, @Nullable InactivityListener inactivityListener, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorServiceForUiThread) {
        super(animationBackend);
        this.mInactivityCheckScheduled = false;
        this.mInactivityThresholdMs = 2000L;
        this.mInactivityCheckPollingTimeMs = 1000L;
        this.mIsInactiveCheck = new Runnable(this) { // from class: com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck.1
            public final /* synthetic */ AnimationBackendDelegateWithInactivityCheck this$0;

            @Override // java.lang.Runnable
            public void run() {
            }
        };
        this.mInactivityListener = inactivityListener;
        this.mMonotonicClock = monotonicClock;
        this.mScheduledExecutorServiceForUiThread = scheduledExecutorServiceForUiThread;
    }

    public static <T extends AnimationBackend & InactivityListener> AnimationBackendDelegate<T> createForBackend(T backend, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorServiceForUiThread) {
        return createForBackend(backend, (InactivityListener) backend, monotonicClock, scheduledExecutorServiceForUiThread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInactive() {
        return this.mMonotonicClock.now() - this.mLastDrawnTimeMs > this.mInactivityThresholdMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void maybeScheduleInactivityCheck() {
        if (!this.mInactivityCheckScheduled) {
            this.mInactivityCheckScheduled = true;
            this.mScheduledExecutorServiceForUiThread.schedule(this.mIsInactiveCheck, this.mInactivityCheckPollingTimeMs, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackendDelegate, com.facebook.fresco.animation.backend.AnimationBackend
    public boolean drawFrame(Drawable parent, Canvas canvas, int frameNumber) {
        this.mLastDrawnTimeMs = this.mMonotonicClock.now();
        boolean drawFrame = super.drawFrame(parent, canvas, frameNumber);
        maybeScheduleInactivityCheck();
        return drawFrame;
    }

    public long getInactivityCheckPollingTimeMs() {
        return this.mInactivityCheckPollingTimeMs;
    }

    public long getInactivityThresholdMs() {
        return this.mInactivityThresholdMs;
    }

    public void setInactivityCheckPollingTimeMs(long inactivityCheckPollingTimeMs) {
        this.mInactivityCheckPollingTimeMs = inactivityCheckPollingTimeMs;
    }

    public void setInactivityListener(@Nullable InactivityListener inactivityListener) {
        this.mInactivityListener = inactivityListener;
    }

    public void setInactivityThresholdMs(long inactivityThresholdMs) {
        this.mInactivityThresholdMs = inactivityThresholdMs;
    }

    public static <T extends AnimationBackend> AnimationBackendDelegate<T> createForBackend(T backend, InactivityListener inactivityListener, MonotonicClock monotonicClock, ScheduledExecutorService scheduledExecutorServiceForUiThread) {
        return new AnimationBackendDelegateWithInactivityCheck(backend, inactivityListener, monotonicClock, scheduledExecutorServiceForUiThread);
    }
}
