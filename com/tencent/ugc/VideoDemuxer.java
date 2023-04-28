package com.tencent.ugc;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface VideoDemuxer {
    public static final EncodedVideoFrame END_OF_STREAM = null;

    void close();

    EncodedVideoFrame getNextEncodeVideoFrame();

    boolean open(String str);

    boolean seek(long j2);
}
