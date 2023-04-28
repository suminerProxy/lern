package com.tencent.thumbplayer.core.player;

import com.tencent.thumbplayer.core.common.TPAudioFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPNativePlayerAudioFrameCallback {
    public static final int FLAG_EOS = 1;

    void onAudioFrame(TPAudioFrame tPAudioFrame, int i2);
}
