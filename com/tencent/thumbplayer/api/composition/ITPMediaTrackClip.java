package com.tencent.thumbplayer.api.composition;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPMediaTrackClip extends ITPMediaAsset {
    ITPMediaTrackClip clone(int i2);

    int getClipId();

    long getEndTimeMs();

    String getFilePath();

    long getOriginalDurationMs();

    long getStartPositionMs();

    long getStartTimeMs();

    void setCutTimeRange(long j2, long j3);

    void setOriginalDurationMs(long j2);

    void setStartPositionMs(long j2);
}
