package com.aliyun.identity.platform.camera;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ICameraCallback {
    void onError(int i2);

    void onPreviewFrame(CameraData cameraData);

    void onSurfaceChanged(double d2, double d3);

    void onSurfaceCreated();

    void onSurfaceDestroyed();
}
