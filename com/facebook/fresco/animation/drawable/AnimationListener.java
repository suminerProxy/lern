package com.facebook.fresco.animation.drawable;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AnimationListener {
    void onAnimationFrame(AnimatedDrawable2 drawable, int frameNumber);

    void onAnimationRepeat(AnimatedDrawable2 drawable);

    void onAnimationReset(AnimatedDrawable2 drawable);

    void onAnimationStart(AnimatedDrawable2 drawable);

    void onAnimationStop(AnimatedDrawable2 drawable);
}
