package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.videobase.frame.PixelFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface CustomVideoProcessListener {
    void onGLContextCreated();

    void onGLContextDestroy();

    void onProcessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2);
}
