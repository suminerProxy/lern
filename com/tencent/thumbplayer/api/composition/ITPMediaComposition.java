package com.tencent.thumbplayer.api.composition;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPMediaComposition extends ITPMediaAsset {
    ITPMediaTrack addAVTrack();

    ITPMediaTrack addAudioTrack();

    ITPMediaTrack addVideoTrack();

    List<ITPMediaTrack> getAllAVTracks();

    List<ITPMediaTrack> getAllAudioTracks();

    List<ITPMediaTrack> getAllVideoTracks();

    long getDurationMs();

    void release();

    boolean removeAVTrack(ITPMediaTrack iTPMediaTrack);

    boolean removeAudioTrack(ITPMediaTrack iTPMediaTrack);

    boolean removeVideoTrack(ITPMediaTrack iTPMediaTrack);
}
