package tencent.txlive.zhibo.widget;

import android.graphics.Bitmap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface IController {
    void hideVideo();

    void release();

    void setCallback(IControllerCallback iControllerCallback);

    void setWatermark(Bitmap bitmap, float f2, float f3);

    void showVideo();

    void updatePlayState(int i2);
}
