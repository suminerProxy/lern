package com.sobot.chat.camera.state;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.sobot.chat.camera.CameraInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BorrowPictureState implements State {
    private final String TAG;
    private CameraMachine machine;

    public BorrowPictureState(CameraMachine cameraMachine) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void cancle(SurfaceHolder surfaceHolder, float f2) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void capture() {
    }

    @Override // com.sobot.chat.camera.state.State
    public void confirm() {
    }

    @Override // com.sobot.chat.camera.state.State
    public void flash(String str) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void foucs(float f2, float f3, CameraInterface.FocusCallback focusCallback) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void record(Surface surface, float f2) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void restart() {
    }

    @Override // com.sobot.chat.camera.state.State
    public void start(SurfaceHolder surfaceHolder, float f2) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void stop() {
    }

    @Override // com.sobot.chat.camera.state.State
    public void stopRecord(boolean z, long j2) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void swtich(SurfaceHolder surfaceHolder, float f2) {
    }

    @Override // com.sobot.chat.camera.state.State
    public void zoom(float f2, int i2) {
    }
}
