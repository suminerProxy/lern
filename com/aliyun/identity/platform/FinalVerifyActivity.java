package com.aliyun.identity.platform;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import com.aliyun.identity.platform.IdentityAlertOverlay;
import com.aliyun.identity.platform.network.IdentityOcrVerifyCallback;
import com.aliyun.identity.platform.network.OssClientHelper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FinalVerifyActivity extends AppCompatActivity {
    private final String OSS_FILE_TYPE_BANKCARD;
    private final String OSS_FILE_TYPE_FACE;
    private final String OSS_FILE_TYPE_OCRIDBACK;
    private final String OSS_FILE_TYPE_OCRIDFACE;
    private final int UI_MSG_ERROR_CODE;
    private final int UI_MSG_OSS_FAIL;
    private final int UI_MSG_OSS_SUCCESS;
    private final int UI_MSG_VERIFY_NET_ERROR;
    public Runnable runnable;
    private long startTime;
    private Handler uiHandler;

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ FinalVerifyActivity this$0;

        public AnonymousClass1(FinalVerifyActivity finalVerifyActivity) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements MessageBoxCB {
        public final /* synthetic */ FinalVerifyActivity this$0;

        public AnonymousClass2(FinalVerifyActivity finalVerifyActivity) {
        }

        @Override // com.aliyun.identity.platform.FinalVerifyActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.platform.FinalVerifyActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements IdentityOcrVerifyCallback {
        public final /* synthetic */ FinalVerifyActivity this$0;
        public final /* synthetic */ long val$time;

        public AnonymousClass3(FinalVerifyActivity finalVerifyActivity, long j2) {
        }

        @Override // com.aliyun.identity.platform.network.IdentityOcrVerifyCallback
        public void onError(String str, String str2) {
        }

        @Override // com.aliyun.identity.platform.network.IdentityOcrVerifyCallback
        public void onServerError(String str, String str2) {
        }

        @Override // com.aliyun.identity.platform.network.IdentityOcrVerifyCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass4 extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements MessageBoxCB {
        public final /* synthetic */ FinalVerifyActivity this$0;

        public AnonymousClass5(FinalVerifyActivity finalVerifyActivity) {
        }

        @Override // com.aliyun.identity.platform.FinalVerifyActivity.MessageBoxCB
        public void onCancel() {
        }

        @Override // com.aliyun.identity.platform.FinalVerifyActivity.MessageBoxCB
        public void onOK() {
        }
    }

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements Runnable {
        public final /* synthetic */ FinalVerifyActivity this$0;

        public AnonymousClass6(FinalVerifyActivity finalVerifyActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements OssClientHelper.OssClientUploadListener {
        public final /* synthetic */ FinalVerifyActivity this$0;
        public final /* synthetic */ long val$time;

        public AnonymousClass7(FinalVerifyActivity finalVerifyActivity, long j2) {
        }

        @Override // com.aliyun.identity.platform.network.OssClientHelper.OssClientUploadListener
        public void onFinish(int i2, int i3) {
        }

        @Override // com.aliyun.identity.platform.network.OssClientHelper.OssClientUploadListener
        public boolean onUploadError(int i2, String str, String str2, String str3) {
        }

        @Override // com.aliyun.identity.platform.network.OssClientHelper.OssClientUploadListener
        public boolean onUploadSuccess(int i2, String str, String str2) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.FinalVerifyActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements IdentityAlertOverlay.CommAlertOverlayListener {
        public final /* synthetic */ FinalVerifyActivity this$0;
        public final /* synthetic */ MessageBoxCB val$messageBoxCB;

        public AnonymousClass8(FinalVerifyActivity finalVerifyActivity, MessageBoxCB messageBoxCB) {
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

    public static /* synthetic */ void access$000(FinalVerifyActivity finalVerifyActivity, String str) {
    }

    public static /* synthetic */ void access$100(FinalVerifyActivity finalVerifyActivity) {
    }

    public static /* synthetic */ void access$200(FinalVerifyActivity finalVerifyActivity) {
    }

    public static /* synthetic */ void access$300(FinalVerifyActivity finalVerifyActivity) {
    }

    public static /* synthetic */ void access$400(FinalVerifyActivity finalVerifyActivity) {
    }

    public static /* synthetic */ void access$500(FinalVerifyActivity finalVerifyActivity, String str) {
    }

    public static /* synthetic */ Handler access$600(FinalVerifyActivity finalVerifyActivity) {
    }

    private String buildFaceVerifyParam() {
    }

    private String buildOCRVerifyParam(String str, String str2, String str3) {
    }

    private void onErrorCode(String str) {
    }

    private void onMessageOssFail() {
    }

    private void onMessageOssSuccess() {
    }

    private void onMessageVerifyNetError() {
    }

    private void sendErrorCode(String str) {
    }

    private void showMessageBox(String str, String str2, String str3, String str4, MessageBoxCB messageBoxCB) {
    }

    private void startVerify() {
    }

    public static void updateDeviceToken() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    public void showLoadingOverlay(boolean z) {
    }
}
