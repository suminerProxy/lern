package com.tencent.ugc;

import com.tencent.liteav.videobase.frame.PixelFrame;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface UGCPixelFrameProvider {
    public static final List<PixelFrame> END_OF_STREAM = null;

    UGCFrameQueue<List<PixelFrame>> getFrameQueue();

    void initialize();

    void seekTo(long j2, boolean z);

    void setReverse(boolean z);

    void start();

    void stop();

    void uninitialize();
}
