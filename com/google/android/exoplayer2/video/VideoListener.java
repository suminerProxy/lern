package com.google.android.exoplayer2.video;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface VideoListener {
    void onRenderedFirstFrame();

    void onSurfaceSizeChanged(int width, int height);

    @Deprecated
    void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio);

    void onVideoSizeChanged(VideoSize videoSize);
}
