package com.facebook.fresco.animation.frame;

import androidx.annotation.VisibleForTesting;
import com.facebook.fresco.animation.backend.AnimationInformation;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DropFramesFrameScheduler implements FrameScheduler {
    private static final int UNSET = -1;
    private final AnimationInformation mAnimationInformation;
    private long mLoopDurationMs;

    public DropFramesFrameScheduler(AnimationInformation animationInformation) {
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public int getFrameNumberToRender(long animationTimeMs, long lastFrameTimeMs) {
    }

    @VisibleForTesting
    public int getFrameNumberWithinLoop(long timeInCurrentLoopMs) {
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public long getLoopDurationMs() {
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public long getTargetRenderTimeForNextFrameMs(long animationTimeMs) {
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public long getTargetRenderTimeMs(int frameNumber) {
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public boolean isInfiniteAnimation() {
    }
}
