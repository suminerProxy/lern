package com.tencent.thumbplayer.core.player;

import com.tencent.thumbplayer.core.common.TPPostProcessFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPNativePlayerPostProcessFrameCallback {
    public static final int EVENT_EOS = 1;
    public static final int EVENT_FLUSH = 2;

    TPPostProcessFrame onPostProcessFrame(TPPostProcessFrame tPPostProcessFrame, int i2);
}
