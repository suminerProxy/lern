package com.tencent.qcloud.tuikit.tuichat.component.camera.state;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface State {
    void cancle(SurfaceHolder surfaceHolder, float f2);

    void capture();

    void confirm();

    void flash(String str);

    void foucs(float f2, float f3, CameraInterface.FocusCallback focusCallback);

    void record(Surface surface, float f2);

    void restart();

    void start(SurfaceHolder surfaceHolder, float f2);

    void stop();

    void stopRecord(boolean z, long j2);

    void swtich(SurfaceHolder surfaceHolder, float f2);

    void zoom(float f2, int i2);
}
