package com.aliyun.identity.face.ui;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.aliyun.identity.face.ToygerPresenter;
import com.aliyun.identity.face.ui.overlay.CommAlertOverlay;
import com.aliyun.identity.platform.camera.CameraSurfaceView;
import com.aliyun.identity.platform.camera.ICameraInterface;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToygerActivity extends Activity implements SensorEventListener {
    private static final int MAX_ACC_SENSOR_CNT = 500;
    private static final int MAX_GYROSCOPE_SENSOR_CNT = 500;
    private int DEFAULT_SCAN_COST_TIME;
    private int SHARK_COST_TIME;
    private Button btnClose;
    private int faceScanRetryCnt;
    private boolean isMsgBoxPopuped;
    private boolean isProcessFulled;
    private boolean isSharked;
    private int mAccSensorCnt;
    private String mAccSensorTxt;
    private CameraSurfaceView mCameraSurfaceView;
    private int mGyrSensorCnt;
    private String mGyroscopeTxt;
    private SensorManager mSensorManager;
    private Runnable runnable;
    private Runnable shark_runnable;
    private long startTime;
    private TextView tvZhazhayan;
    private Handler uiHandler;

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ ToygerActivity this$0;

        public AnonymousClass1(ToygerActivity toygerActivity) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ToygerActivity this$0;

        /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements MessageBoxCB {
            public final /* synthetic */ AnonymousClass2 this$1;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
            public void onCancel() {
            }

            @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
            public void onOK() {
            }
        }

        /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C00222 implements MessageBoxCB {
            public final /* synthetic */ AnonymousClass2 this$1;

            public C00222(AnonymousClass2 anonymousClass2) {
            }

            @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
            public void onCancel() {
            }

            @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
            public void onOK() {
            }
        }

        public AnonymousClass2(ToygerActivity toygerActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements MessageBoxCB {
        public final /* synthetic */ ToygerActivity this$0;
        public final /* synthetic */ String val$returnCode;

        public AnonymousClass3(ToygerActivity toygerActivity, String str) {
        }

        @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements MessageBoxCB {
        public final /* synthetic */ ToygerActivity this$0;

        public AnonymousClass4(ToygerActivity toygerActivity) {
        }

        @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ ToygerActivity this$0;

        public AnonymousClass5(ToygerActivity toygerActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ ToygerActivity this$0;

        public AnonymousClass6(ToygerActivity toygerActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements MessageBoxCB {
        public final /* synthetic */ ToygerActivity this$0;

        public AnonymousClass7(ToygerActivity toygerActivity) {
        }

        @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.face.ui.ToygerActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.face.ui.ToygerActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements CommAlertOverlay.CommAlertOverlayListener {
        public final /* synthetic */ ToygerActivity this$0;
        public final /* synthetic */ MessageBoxCB val$messageBoxCB;
        public final /* synthetic */ ToygerPresenter val$toygerPresenter;

        public AnonymousClass8(ToygerActivity toygerActivity, ToygerPresenter toygerPresenter, MessageBoxCB messageBoxCB) {
        }

        @Override // com.aliyun.identity.face.ui.overlay.CommAlertOverlay.CommAlertOverlayListener
        public void onCancel() {
        }

        @Override // com.aliyun.identity.face.ui.overlay.CommAlertOverlay.CommAlertOverlayListener
        public void onConfirm() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MessageBoxCB {
        void onCancel();

        void onOK();
    }

    public static /* synthetic */ void access$000(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ void access$100(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ void access$1000(ToygerActivity toygerActivity, String str) {
    }

    public static /* synthetic */ boolean access$1100(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ TextView access$1200(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ boolean access$1302(ToygerActivity toygerActivity, boolean z) {
    }

    public static /* synthetic */ void access$1400(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ void access$1501(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ Button access$1600(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ void access$200(ToygerActivity toygerActivity, double d2, double d3) {
    }

    public static /* synthetic */ void access$300(ToygerActivity toygerActivity, String str) {
    }

    public static /* synthetic */ void access$400(ToygerActivity toygerActivity, int i2) {
    }

    public static /* synthetic */ boolean access$500(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ boolean access$502(ToygerActivity toygerActivity, boolean z) {
    }

    public static /* synthetic */ int access$600(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ int access$608(ToygerActivity toygerActivity) {
    }

    public static /* synthetic */ void access$700(ToygerActivity toygerActivity, String str) {
    }

    public static /* synthetic */ void access$800(ToygerActivity toygerActivity, int i2, int i3, int i4, int i5, MessageBoxCB messageBoxCB) {
    }

    public static /* synthetic */ Handler access$900(ToygerActivity toygerActivity) {
    }

    private void clickClostButton() {
    }

    private ICameraInterface getCameraInterface() {
    }

    private void initToyger() {
    }

    private void initToygerUI() {
    }

    private void onErrorCode(String str) {
    }

    private void onFaceComplete() {
    }

    private void onLandUIInit(double d2, double d3) {
    }

    private void onPortUIInit(double d2, double d3) {
    }

    private void onSurfaceChanged(double d2, double d3) {
    }

    private void retryFaceScan() {
    }

    private void sendErrorCode(String str) {
    }

    private void sendResponseAndFinish(String str) {
    }

    private void showAvatar(boolean z) {
    }

    private boolean showErrorMsgBox(String str, MessageBoxCB messageBoxCB) {
    }

    private void showFaceTips(int i2) {
    }

    private void showMessageBox(int i2, int i3, int i4, int i5, MessageBoxCB messageBoxCB) {
    }

    public boolean isMessageBoxShow() {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.app.Activity
    public void onPause() {
    }

    @Override // android.app.Activity
    public void onResume() {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
    }
}
