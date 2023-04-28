package com.aliyun.identity.ocr;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.aliyun.identity.platform.IdentityAlertOverlay;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IDCardResultActivity extends AppCompatActivity {
    private final int UI_MSG_ERROR_CODE;
    private final int UI_MSG_SDK_MAX_TIME_OUT;
    private final float idcardImageScale;
    private long startTime;
    private Handler uiHandler;

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ IDCardResultActivity this$0;

        public AnonymousClass1(IDCardResultActivity iDCardResultActivity) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ IDCardResultActivity this$0;
        public final /* synthetic */ EditText val$editCertName;

        public AnonymousClass2(IDCardResultActivity iDCardResultActivity, EditText editText) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ IDCardResultActivity this$0;
        public final /* synthetic */ EditText val$editCertName;

        public AnonymousClass3(IDCardResultActivity iDCardResultActivity, EditText editText) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ IDCardResultActivity this$0;
        public final /* synthetic */ EditText val$editCertNo;

        public AnonymousClass4(IDCardResultActivity iDCardResultActivity, EditText editText) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ IDCardResultActivity this$0;

        /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements MessageBoxCB {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }

            @Override // com.aliyun.identity.ocr.IDCardResultActivity.MessageBoxCB
            public void onCancel() {
            }

            @Override // com.aliyun.identity.ocr.IDCardResultActivity.MessageBoxCB
            public void onOK() {
            }
        }

        public AnonymousClass5(IDCardResultActivity iDCardResultActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ IDCardResultActivity this$0;

        public AnonymousClass6(IDCardResultActivity iDCardResultActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements MessageBoxCB {
        public final /* synthetic */ IDCardResultActivity this$0;
        public final /* synthetic */ Button val$btnStartVerify;

        public AnonymousClass7(IDCardResultActivity iDCardResultActivity, Button button) {
        }

        @Override // com.aliyun.identity.ocr.IDCardResultActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.ocr.IDCardResultActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.IDCardResultActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements IdentityAlertOverlay.CommAlertOverlayListener {
        public final /* synthetic */ IDCardResultActivity this$0;
        public final /* synthetic */ MessageBoxCB val$messageBoxCB;

        public AnonymousClass8(IDCardResultActivity iDCardResultActivity, MessageBoxCB messageBoxCB) {
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

    public static /* synthetic */ void access$000(IDCardResultActivity iDCardResultActivity, String str) {
    }

    public static /* synthetic */ void access$100(IDCardResultActivity iDCardResultActivity, String str) {
    }

    public static /* synthetic */ void access$200(IDCardResultActivity iDCardResultActivity, String str, String str2, String str3, String str4, MessageBoxCB messageBoxCB) {
    }

    public static /* synthetic */ boolean access$300(IDCardResultActivity iDCardResultActivity) {
    }

    public static /* synthetic */ void access$400(IDCardResultActivity iDCardResultActivity) {
    }

    public static /* synthetic */ void access$500(IDCardResultActivity iDCardResultActivity) {
    }

    public static /* synthetic */ void access$601(IDCardResultActivity iDCardResultActivity) {
    }

    private boolean checkAndSaveBankCardInfos() {
    }

    private boolean checkAndSaveIdCardInfos() {
    }

    private boolean checkAndSaveInfos() {
    }

    private void initBankCardUI() {
    }

    private void initIDCardUI() {
    }

    private void initOnce() {
    }

    private void initUI() {
    }

    private void onClickStartFaceView() {
    }

    private void onClickStartVerifyView() {
    }

    private void onErrorCode(String str) {
    }

    private void sendErrorCode(String str) {
    }

    private void showMessageBox(String str, String str2, String str3, String str4, MessageBoxCB messageBoxCB) {
    }

    private boolean startFace(boolean z) {
    }

    public void enableUI(boolean z) {
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

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
    }
}
