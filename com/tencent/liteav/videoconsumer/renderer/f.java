package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface f {
    void a(GLConstants.GLScaleType gLScaleType);

    void a(TakeSnapshotListener takeSnapshotListener);

    void a(PixelFrame pixelFrame);

    void a(Rotation rotation);

    void a(DisplayTarget displayTarget, boolean z);

    void a(VideoRenderListener videoRenderListener);

    void a(boolean z);

    void b(boolean z);
}
