package com.facebook.fresco.animation.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.logging.FLog;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.drawable.DrawableProperties;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.frame.DropFramesFrameScheduler;
import com.facebook.fresco.animation.frame.FrameScheduler;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedDrawable2 extends Drawable implements Animatable, DrawableWithCaches {
    private static final int DEFAULT_FRAME_SCHEDULING_DELAY_MS = 8;
    private static final int DEFAULT_FRAME_SCHEDULING_OFFSET_MS = 0;
    @Nullable
    private AnimationBackend mAnimationBackend;
    private volatile AnimationListener mAnimationListener;
    @Nullable
    private volatile DrawListener mDrawListener;
    @Nullable
    private DrawableProperties mDrawableProperties;
    private int mDroppedFrames;
    private long mExpectedRenderTimeMs;
    @Nullable
    private FrameScheduler mFrameScheduler;
    private long mFrameSchedulingDelayMs;
    private long mFrameSchedulingOffsetMs;
    private final Runnable mInvalidateRunnable;
    private volatile boolean mIsRunning;
    private int mLastDrawnFrameNumber;
    private long mLastFrameAnimationTimeMs;
    private int mPausedLastDrawnFrameNumber;
    private long mPausedLastFrameAnimationTimeMsDifference;
    private long mPausedStartTimeMsDifference;
    private long mStartTimeMs;
    private static final Class<?> TAG = AnimatedDrawable2.class;
    private static final AnimationListener NO_OP_LISTENER = new BaseAnimationListener();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface DrawListener {
        void onDraw(AnimatedDrawable2 animatedDrawable, FrameScheduler frameScheduler, int frameNumberToDraw, boolean frameDrawn, boolean isAnimationRunning, long animationStartTimeMs, long animationTimeMs, long lastFrameAnimationTimeMs, long actualRenderTimeStartMs, long actualRenderTimeEndMs, long startRenderTimeForNextFrameMs, long scheduledRenderTimeForNextFrameMs);
    }

    public AnimatedDrawable2() {
        this(null);
    }

    @Nullable
    private static FrameScheduler createSchedulerForBackendAndDelayMethod(@Nullable AnimationBackend animationBackend) {
        if (animationBackend == null) {
            return null;
        }
        return new DropFramesFrameScheduler(animationBackend);
    }

    private long now() {
        return SystemClock.uptimeMillis();
    }

    private void onFrameDropped() {
        this.mDroppedFrames++;
        if (FLog.isLoggable(2)) {
            FLog.v(TAG, "Dropped a frame. Count: %s", Integer.valueOf(this.mDroppedFrames));
        }
    }

    private void scheduleNextFrame(long targetAnimationTimeMs) {
        long j2 = this.mStartTimeMs + targetAnimationTimeMs;
        this.mExpectedRenderTimeMs = j2;
        scheduleSelf(this.mInvalidateRunnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long j2;
        long j3;
        AnimatedDrawable2 animatedDrawable2;
        long j4;
        if (this.mAnimationBackend == null || this.mFrameScheduler == null) {
            return;
        }
        long now = now();
        long max = this.mIsRunning ? (now - this.mStartTimeMs) + this.mFrameSchedulingOffsetMs : Math.max(this.mLastFrameAnimationTimeMs, 0L);
        int frameNumberToRender = this.mFrameScheduler.getFrameNumberToRender(max, this.mLastFrameAnimationTimeMs);
        if (frameNumberToRender == -1) {
            frameNumberToRender = this.mAnimationBackend.getFrameCount() - 1;
            this.mAnimationListener.onAnimationStop(this);
            this.mIsRunning = false;
        } else if (frameNumberToRender == 0 && this.mLastDrawnFrameNumber != -1 && now >= this.mExpectedRenderTimeMs) {
            this.mAnimationListener.onAnimationRepeat(this);
        }
        int i2 = frameNumberToRender;
        boolean drawFrame = this.mAnimationBackend.drawFrame(this, canvas, i2);
        if (drawFrame) {
            this.mAnimationListener.onAnimationFrame(this, i2);
            this.mLastDrawnFrameNumber = i2;
        }
        if (!drawFrame) {
            onFrameDropped();
        }
        long now2 = now();
        if (this.mIsRunning) {
            long targetRenderTimeForNextFrameMs = this.mFrameScheduler.getTargetRenderTimeForNextFrameMs(now2 - this.mStartTimeMs);
            if (targetRenderTimeForNextFrameMs != -1) {
                long j5 = this.mFrameSchedulingDelayMs + targetRenderTimeForNextFrameMs;
                scheduleNextFrame(j5);
                j3 = j5;
            } else {
                this.mAnimationListener.onAnimationStop(this);
                this.mIsRunning = false;
                j3 = -1;
            }
            j2 = targetRenderTimeForNextFrameMs;
        } else {
            j2 = -1;
            j3 = -1;
        }
        DrawListener drawListener = this.mDrawListener;
        if (drawListener != null) {
            drawListener.onDraw(this, this.mFrameScheduler, i2, drawFrame, this.mIsRunning, this.mStartTimeMs, max, this.mLastFrameAnimationTimeMs, now, now2, j2, j3);
            animatedDrawable2 = this;
            j4 = max;
        } else {
            animatedDrawable2 = this;
            j4 = max;
        }
        animatedDrawable2.mLastFrameAnimationTimeMs = j4;
    }

    @Override // com.facebook.drawable.base.DrawableWithCaches
    public void dropCaches() {
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend != null) {
            animationBackend.clear();
        }
    }

    @Nullable
    public AnimationBackend getAnimationBackend() {
        return this.mAnimationBackend;
    }

    public long getDroppedFrames() {
        return this.mDroppedFrames;
    }

    public int getFrameCount() {
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend == null) {
            return 0;
        }
        return animationBackend.getFrameCount();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend == null) {
            return super.getIntrinsicHeight();
        }
        return animationBackend.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend == null) {
            return super.getIntrinsicWidth();
        }
        return animationBackend.getIntrinsicWidth();
    }

    public int getLoopCount() {
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend == null) {
            return 0;
        }
        return animationBackend.getLoopCount();
    }

    public long getLoopDurationMs() {
        if (this.mAnimationBackend == null) {
            return 0L;
        }
        FrameScheduler frameScheduler = this.mFrameScheduler;
        if (frameScheduler != null) {
            return frameScheduler.getLoopDurationMs();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.mAnimationBackend.getFrameCount(); i3++) {
            i2 += this.mAnimationBackend.getFrameDurationMs(i3);
        }
        return i2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public long getStartTimeMs() {
        return this.mStartTimeMs;
    }

    public boolean isInfiniteAnimation() {
        FrameScheduler frameScheduler = this.mFrameScheduler;
        return frameScheduler != null && frameScheduler.isInfiniteAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mIsRunning;
    }

    public void jumpToFrame(int targetFrameNumber) {
        FrameScheduler frameScheduler;
        if (this.mAnimationBackend == null || (frameScheduler = this.mFrameScheduler) == null) {
            return;
        }
        this.mLastFrameAnimationTimeMs = frameScheduler.getTargetRenderTimeMs(targetFrameNumber);
        long now = now() - this.mLastFrameAnimationTimeMs;
        this.mStartTimeMs = now;
        this.mExpectedRenderTimeMs = now;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend != null) {
            animationBackend.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        if (this.mIsRunning) {
            return false;
        }
        long j2 = level;
        if (this.mLastFrameAnimationTimeMs != j2) {
            this.mLastFrameAnimationTimeMs = j2;
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (this.mDrawableProperties == null) {
            this.mDrawableProperties = new DrawableProperties();
        }
        this.mDrawableProperties.setAlpha(alpha);
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend != null) {
            animationBackend.setAlpha(alpha);
        }
    }

    public void setAnimationBackend(@Nullable AnimationBackend animationBackend) {
        this.mAnimationBackend = animationBackend;
        if (animationBackend != null) {
            this.mFrameScheduler = new DropFramesFrameScheduler(animationBackend);
            this.mAnimationBackend.setBounds(getBounds());
            DrawableProperties drawableProperties = this.mDrawableProperties;
            if (drawableProperties != null) {
                drawableProperties.applyTo(this);
            }
        }
        this.mFrameScheduler = createSchedulerForBackendAndDelayMethod(this.mAnimationBackend);
        stop();
    }

    public void setAnimationListener(@Nullable AnimationListener animationListener) {
        if (animationListener == null) {
            animationListener = NO_OP_LISTENER;
        }
        this.mAnimationListener = animationListener;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.mDrawableProperties == null) {
            this.mDrawableProperties = new DrawableProperties();
        }
        this.mDrawableProperties.setColorFilter(colorFilter);
        AnimationBackend animationBackend = this.mAnimationBackend;
        if (animationBackend != null) {
            animationBackend.setColorFilter(colorFilter);
        }
    }

    public void setDrawListener(@Nullable DrawListener drawListener) {
        this.mDrawListener = drawListener;
    }

    public void setFrameSchedulingDelayMs(long frameSchedulingDelayMs) {
        this.mFrameSchedulingDelayMs = frameSchedulingDelayMs;
    }

    public void setFrameSchedulingOffsetMs(long frameSchedulingOffsetMs) {
        this.mFrameSchedulingOffsetMs = frameSchedulingOffsetMs;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        AnimationBackend animationBackend;
        if (this.mIsRunning || (animationBackend = this.mAnimationBackend) == null || animationBackend.getFrameCount() <= 1) {
            return;
        }
        this.mIsRunning = true;
        long now = now();
        long j2 = now - this.mPausedStartTimeMsDifference;
        this.mStartTimeMs = j2;
        this.mExpectedRenderTimeMs = j2;
        this.mLastFrameAnimationTimeMs = now - this.mPausedLastFrameAnimationTimeMsDifference;
        this.mLastDrawnFrameNumber = this.mPausedLastDrawnFrameNumber;
        invalidateSelf();
        this.mAnimationListener.onAnimationStart(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.mIsRunning) {
            long now = now();
            this.mPausedStartTimeMsDifference = now - this.mStartTimeMs;
            this.mPausedLastFrameAnimationTimeMsDifference = now - this.mLastFrameAnimationTimeMs;
            this.mPausedLastDrawnFrameNumber = this.mLastDrawnFrameNumber;
            this.mIsRunning = false;
            this.mStartTimeMs = 0L;
            this.mExpectedRenderTimeMs = 0L;
            this.mLastFrameAnimationTimeMs = -1L;
            this.mLastDrawnFrameNumber = -1;
            unscheduleSelf(this.mInvalidateRunnable);
            this.mAnimationListener.onAnimationStop(this);
        }
    }

    public AnimatedDrawable2(@Nullable AnimationBackend animationBackend) {
        this.mFrameSchedulingDelayMs = 8L;
        this.mFrameSchedulingOffsetMs = 0L;
        this.mAnimationListener = NO_OP_LISTENER;
        this.mDrawListener = null;
        this.mInvalidateRunnable = new Runnable(this) { // from class: com.facebook.fresco.animation.drawable.AnimatedDrawable2.1
            public final /* synthetic */ AnimatedDrawable2 this$0;

            @Override // java.lang.Runnable
            public void run() {
            }
        };
        this.mAnimationBackend = animationBackend;
        this.mFrameScheduler = createSchedulerForBackendAndDelayMethod(animationBackend);
    }
}
