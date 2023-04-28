package com.tencent.ugc;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface UGCAudioFrameProvider {
    public static final List<AudioFrame> END_OF_STREAM = null;

    UGCFrameQueue<List<AudioFrame>> getFrameQueue();

    void initialize();

    void seekTo(long j2);

    void start();

    void stop();

    void uninitialize();
}
