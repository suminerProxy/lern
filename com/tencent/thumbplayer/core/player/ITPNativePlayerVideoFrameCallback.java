package com.tencent.thumbplayer.core.player;

import com.tencent.thumbplayer.core.common.TPVideoFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPNativePlayerVideoFrameCallback {
    public static final int FLAG_EOS = 1;
    public static final int FLAG_MULTITRACK_END = 4;
    public static final int FLAG_MULTITRACK_START = 2;

    void onVideoFrame(TPVideoFrame tPVideoFrame, int i2);
}
