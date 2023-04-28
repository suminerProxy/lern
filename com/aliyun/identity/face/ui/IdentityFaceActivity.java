package com.aliyun.identity.face.ui;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.aliyun.identity.face.ToygerPresenter;
import com.aliyun.identity.face.ui.IdentityScanFrameView;
import com.aliyun.identity.platform.IdentityAlertOverlay;
import com.aliyun.identity.platform.camera.CameraSurfaceView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityFaceActivity extends AppCompatActivity implements SensorEventListener {
    private static final int MAX_ACC_SENSOR_CNT = 500;
    private static final int MAX_GYROSCOPE_SENSOR_CNT = 500;
    private static boolean isDoingExpansionAnimation;
    private int DEFAULT_SCAN_COST_TIME;
    private int faceScanRetryCnt;
    private boolean isMsgBoxPopuped;
    private int mAccSensorCnt;
    private String mAccSensorTxt;
    private CameraSurfaceView mCameraSurfaceView;
    private int mGyrSensorCnt;
    private String mGyroscopeTxt;
    private SensorManager mSensorManager;
    private Runnable runnable;
    private Runnable runnableExpansionAnimation;
    private long startTime;
    private Handler uiHandler;

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ IdentityFaceActivity this$0;

        public AnonymousClass1(IdentityFaceActivity identityFaceActivity) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ IdentityFaceActivity this$0;

        /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements IdentityScanFrameView.AnimationListener {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ IdentityScanFrameView val$identityScanFrameView;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, IdentityScanFrameView identityScanFrameView) {
            }

            @Override // com.aliyun.identity.face.ui.IdentityScanFrameView.AnimationListener
            public void onAnimationFinish() {
            }
        }

        public AnonymousClass2(IdentityFaceActivity identityFaceActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ IdentityFaceActivity this$0;

        /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements MessageBoxCB {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
            public void onCancel() {
            }

            @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
            public void onOK() {
            }
        }

        /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$3$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements MessageBoxCB {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass2(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
            public void onCancel() {
            }

            @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
            public void onOK() {
            }
        }

        public AnonymousClass3(IdentityFaceActivity identityFaceActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements IdentityScanFrameView.AnimationListener {
        public final /* synthetic */ IdentityFaceActivity this$0;
        public final /* synthetic */ IdentityScanFrameView val$identityScanFrameView;

        /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements IdentityScanFrameView.AnimationListener {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.aliyun.identity.face.ui.IdentityScanFrameView.AnimationListener
            public void onAnimationFinish() {
            }
        }

        public AnonymousClass4(IdentityFaceActivity identityFaceActivity, IdentityScanFrameView identityScanFrameView) {
        }

        @Override // com.aliyun.identity.face.ui.IdentityScanFrameView.AnimationListener
        public void onAnimationFinish() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements MessageBoxCB {
        public final /* synthetic */ IdentityFaceActivity this$0;
        public final /* synthetic */ String val$returnCode;

        public AnonymousClass5(IdentityFaceActivity identityFaceActivity, String str) {
        }

        @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ IdentityFaceActivity this$0;

        /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$6$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements MessageBoxCB {
            public final /* synthetic */ AnonymousClass6 this$1;

            public AnonymousClass1(AnonymousClass6 anonymousClass6) {
            }

            @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
            public void onCancel() {
            }

            @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
            public void onOK() {
            }
        }

        public AnonymousClass6(IdentityFaceActivity identityFaceActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements MessageBoxCB {
        public final /* synthetic */ IdentityFaceActivity this$0;

        public AnonymousClass7(IdentityFaceActivity identityFaceActivity) {
        }

        @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.face.ui.IdentityFaceActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.IdentityFaceActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements IdentityAlertOverlay.CommAlertOverlayListener {
        public final /* synthetic */ IdentityFaceActivity this$0;
        public final /* synthetic */ Button val$btnClose;
        public final /* synthetic */ IdentityAlertOverlay val$identityAlertOverlay;
        public final /* synthetic */ MessageBoxCB val$messageBoxCB;
        public final /* synthetic */ ToygerPresenter val$toygerPresenter;

        public AnonymousClass8(IdentityFaceActivity identityFaceActivity, ToygerPresenter toygerPresenter, Button button, MessageBoxCB messageBoxCB, IdentityAlertOverlay identityAlertOverlay) {
        }

        @Override // com.aliyun.identity.platform.IdentityAlertOverlay.CommAlertOverlayListener
        public void onCancel() {
        }

        @Override // com.aliyun.identity.platform.IdentityAlertOverlay.CommAlertOverlayListener
        public void onConfirm() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MessageBoxCB {
        void onCancel();

        void onOK();
    }

    public static /* synthetic */ void access$000(IdentityFaceActivity identityFaceActivity) {
    }

    public static /* synthetic */ void access$100(IdentityFaceActivity identityFaceActivity) {
    }

    public static /* synthetic */ void access$1000(IdentityFaceActivity identityFaceActivity) {
    }

    public static /* synthetic */ void access$1100(IdentityFaceActivity identityFaceActivity, String str) {
    }

    public static /* synthetic */ void access$1201(IdentityFaceActivity identityFaceActivity) {
    }

    public static /* synthetic */ void access$200(IdentityFaceActivity identityFaceActivity, double d2, double d3) {
    }

    public static /* synthetic */ void access$300(IdentityFaceActivity identityFaceActivity, String str) {
    }

    public static /* synthetic */ void access$400(IdentityFaceActivity identityFaceActivity, int i2) {
    }

    public static /* synthetic */ boolean access$500(IdentityFaceActivity identityFaceActivity) {
    }

    public static /* synthetic */ boolean access$502(IdentityFaceActivity identityFaceActivity, boolean z) {
    }

    public static /* synthetic */ int access$600(IdentityFaceActivity identityFaceActivity) {
    }

    public static /* synthetic */ int access$608(IdentityFaceActivity identityFaceActivity) {
    }

    public static /* synthetic */ void access$700(IdentityFaceActivity identityFaceActivity, String str) {
    }

    public static /* synthetic */ void access$800(IdentityFaceActivity identityFaceActivity, int i2, int i3, int i4, int i5, MessageBoxCB messageBoxCB) {
    }

    public static /* synthetic */ Handler access$900(IdentityFaceActivity identityFaceActivity) {
    }

    private void initToyger() {
    }

    private void initUI() {
    }

    private void onErrorCode(String str) {
    }

    private void onFaceComplete() {
    }

    private void onFaceVerify() {
    }

    private void onSurfaceChanged(double d2, double d3) {
    }

    private void retryFaceScan() {
    }

    private void sendErrorCode(String str) {
    }

    private void sendResponseAndFinish(String str) {
    }

    private boolean showErrorMsgBox(String str, MessageBoxCB messageBoxCB) {
    }

    private void showFaceTips(int i2) {
    }

    private void showMessageBox(int i2, int i3, int i4, int i5, MessageBoxCB messageBoxCB) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
    }
}
