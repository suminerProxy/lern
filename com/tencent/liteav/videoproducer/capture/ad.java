package com.tencent.liteav.videoproducer.capture;

import android.graphics.SurfaceTexture;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ad {
    void a();

    void a(float f2);

    void a(int i2, int i3);

    void a(ServerVideoProducerConfig serverVideoProducerConfig);

    void a(boolean z);

    boolean a(int i2, int i3, boolean z);

    boolean a(CameraCaptureParams cameraCaptureParams, SurfaceTexture surfaceTexture, ae aeVar);

    Rotation b();

    void b(float f2);

    void b(boolean z);

    int c();

    com.tencent.liteav.base.util.p d();

    boolean e();

    boolean f();

    boolean g();

    boolean h();
}
