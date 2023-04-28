package com.tencent.qcloud.tuikit.tuichat.component.camera.state;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraInterface;
import com.tencent.qcloud.tuikit.tuichat.component.camera.view.CameraView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CameraMachine implements State {
    private State borrowPictureState;
    private State borrowVideoState;
    private Context context;
    private State previewState;
    private State state;
    private CameraView view;

    public CameraMachine(Context context, CameraView cameraView, CameraInterface.CameraOpenOverCallback cameraOpenOverCallback) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void cancle(SurfaceHolder surfaceHolder, float f2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void capture() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void confirm() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void flash(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void foucs(float f2, float f3, CameraInterface.FocusCallback focusCallback) {
    }

    public State getBorrowPictureState() {
    }

    public State getBorrowVideoState() {
    }

    public Context getContext() {
    }

    public State getPreviewState() {
    }

    public State getState() {
    }

    public CameraView getView() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void record(Surface surface, float f2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void restart() {
    }

    public void setState(State state) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void start(SurfaceHolder surfaceHolder, float f2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void stop() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void stopRecord(boolean z, long j2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void swtich(SurfaceHolder surfaceHolder, float f2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.state.State
    public void zoom(float f2, int i2) {
    }
}
