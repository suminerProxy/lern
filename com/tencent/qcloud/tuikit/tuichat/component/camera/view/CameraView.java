package com.tencent.qcloud.tuikit.tuichat.component.camera.view;

import android.graphics.Bitmap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface CameraView {
    void confirmState(int i2);

    boolean handlerFoucs(float f2, float f3);

    void playVideo(Bitmap bitmap, String str);

    void resetState(int i2);

    void setTip(String str);

    void showPicture(Bitmap bitmap, boolean z);

    void startPreviewCallback();

    void stopVideo();
}
