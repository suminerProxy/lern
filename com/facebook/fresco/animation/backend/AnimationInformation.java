package com.facebook.fresco.animation.backend;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AnimationInformation {
    public static final int LOOP_COUNT_INFINITE = 0;

    int getFrameCount();

    int getFrameDurationMs(int frameNumber);

    int getLoopCount();
}
