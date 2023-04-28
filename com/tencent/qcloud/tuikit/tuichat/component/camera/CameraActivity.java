package com.tencent.qcloud.tuikit.tuichat.component.camera;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ClickListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ErrorListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.listener.JCameraListener;
import com.tencent.qcloud.tuikit.tuichat.component.camera.view.JCameraView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CameraActivity extends Activity {
    private static final int REQUEST_CODE_PHOTO_AND_VIDEO = 1000;
    private static final String TAG = null;
    public static IUIKitCallback mCallBack;
    private JCameraView jCameraView;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.CameraActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements ErrorListener {
        public final /* synthetic */ CameraActivity this$0;

        public AnonymousClass1(CameraActivity cameraActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ErrorListener
        public void AudioPermissionError() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ErrorListener
        public void onError() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.CameraActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements JCameraListener {
        public final /* synthetic */ CameraActivity this$0;

        public AnonymousClass2(CameraActivity cameraActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.JCameraListener
        public void captureSuccess(Bitmap bitmap) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.JCameraListener
        public void recordSuccess(String str, Bitmap bitmap, long j2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.CameraActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements ClickListener {
        public final /* synthetic */ CameraActivity this$0;

        public AnonymousClass3(CameraActivity cameraActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.camera.CameraActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements ClickListener {
        public final /* synthetic */ CameraActivity this$0;

        public AnonymousClass4(CameraActivity cameraActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.camera.listener.ClickListener
        public void onClick() {
        }
    }

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ void access$100(CameraActivity cameraActivity) {
    }

    private void startSendPhoto() {
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onResume() {
    }

    @Override // android.app.Activity
    public void onStart() {
    }
}
