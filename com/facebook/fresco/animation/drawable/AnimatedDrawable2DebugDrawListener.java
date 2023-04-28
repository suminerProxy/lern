package com.facebook.fresco.animation.drawable;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.fresco.animation.frame.FrameScheduler;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedDrawable2DebugDrawListener implements AnimatedDrawable2.DrawListener {
    private static final Class<?> TAG = null;
    private int mDrawCalls;
    private int mDuplicateFrames;
    private int mLastFrameNumber;
    private int mSkippedFrames;

    @Override // com.facebook.fresco.animation.drawable.AnimatedDrawable2.DrawListener
    public void onDraw(AnimatedDrawable2 animatedDrawable, FrameScheduler frameScheduler, int frameNumberToDraw, boolean frameDrawn, boolean isAnimationRunning, long animationStartTimeMs, long animationTimeMs, long lastFrameAnimationTimeMs, long actualRenderTimeStartMs, long actualRenderTimeEndMs, long startRenderTimeForNextFrameMs, long scheduledRenderTimeForNextFrameMs) {
    }
}
