package com.sobot.chat.camera.state;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.sobot.chat.camera.CameraInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PreviewState implements State {
    public static final String TAG = "PreviewState";
    private CameraMachine machine;

    /* renamed from: com.sobot.chat.camera.state.PreviewState$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements CameraInterface.TakePictureCallback {
        public final /* synthetic */ PreviewState this$0;

        public AnonymousClass1(PreviewState previewState) {
        }

        @Override // com.sobot.chat.camera.CameraInterface.TakePictureCallback
        public void captureResult(Bitmap bitmap, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.camera.state.PreviewState$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements CameraInterface.StopRecordCallback {
        public final /* synthetic */ PreviewState this$0;
        public final /* synthetic */ boolean val$isShort;

        public AnonymousClass2(PreviewState previewState, boolean z) {
        }

        @Override // com.sobot.chat.camera.CameraInterface.StopRecordCallback
        public void recordResult(String str, Bitmap bitmap) {
        }
    }

    public PreviewState(CameraMachine cameraMachine) {
    }

    public static /* synthetic */ CameraMachine access$000(PreviewState previewState) {
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
