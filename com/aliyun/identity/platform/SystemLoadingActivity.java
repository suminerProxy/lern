package com.aliyun.identity.platform;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.aliyun.identity.platform.config.OSSConfig;
import com.aliyun.identity.platform.network.ZimInitCallback;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SystemLoadingActivity extends AppCompatActivity {
    private static final String DEFAULT_PROTOCL = "{\"content\":\"{\\\"androidcfg\\\":\\\"{\\\\\\\"coll\\\\\\\":{\\\\\\\"TopText_blink\\\\\\\":\\\\\\\"眨眨眼\\\\\\\",\\\\\\\"topText_noface\\\\\\\":\\\\\\\"没有检测到脸\\\\\\\",\\\\\\\"topText_integrity\\\\\\\":\\\\\\\"把脸移入框内\\\\\\\",\\\\\\\"topText_angle\\\\\\\":\\\\\\\"请正对手机\\\\\\\",\\\\\\\"actionMode\\\\\\\":[\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\",\\\\\\\"7\\\\\\\"],\\\\\\\"bottomText\\\\\\\":\\\\\\\"请把脸放入框内保持不动\\\\\\\",\\\\\\\"authorization\\\\\\\":false,\\\\\\\"TopText_max_rectwidth\\\\\\\":\\\\\\\"离远一点\\\\\\\",\\\\\\\"uploadMonitorPic\\\\\\\":1,\\\\\\\"uploadBigPic\\\\\\\":true,\\\\\\\"light\\\\\\\":204,\\\\\\\"topText_light\\\\\\\":\\\\\\\"脸部亮一点\\\\\\\",\\\\\\\"topText_stay\\\\\\\":\\\\\\\"请保持不动\\\\\\\",\\\\\\\"progressbar\\\\\\\":true,\\\\\\\"time\\\\\\\":20,\\\\\\\"topText_rectwidth\\\\\\\":\\\\\\\"靠近一点\\\\\\\",\\\\\\\"retry\\\\\\\":3,\\\\\\\"imageIndex\\\\\\\":1,\\\\\\\"topText_blur\\\\\\\":\\\\\\\"再清晰一点\\\\\\\",\\\\\\\"topText_quality\\\\\\\":\\\\\\\"请调整姿势\\\\\\\"},\\\\\\\"ui\\\\\\\":992,\\\\\\\"navi\\\\\\\":{\\\\\\\"enable\\\\\\\":false,\\\\\\\"url\\\\\\\":\\\\\\\"https://www.aliyun.com/cloudauth/cloudauth_sdk_flash\\\\\\\"},\\\\\\\"upload\\\\\\\":{\\\\\\\"mode\\\\\\\":\\\\\\\"2.0\\\\\\\",\\\\\\\"desiredWidth\\\\\\\":480,\\\\\\\"minquality\\\\\\\":9,\\\\\\\"upload_compress_rate\\\\\\\":0.8,\\\\\\\"collection\\\\\\\":[\\\\\\\"Pano\\\\\\\",\\\\\\\"Dark\\\\\\\"],\\\\\\\"log_classifier\\\\\\\":1},\\\\\\\"verifyMode\\\\\\\":\\\\\\\"normal\\\\\\\",\\\\\\\"noCamPermissionWords\\\\\\\":\\\\\\\"开通后才可以使用刷脸功能，进入免密时代\\\\\\\",\\\\\\\"sceneEnv\\\\\\\":{\\\\\\\"sceneCode\\\\\\\":\\\\\\\"ZolozID+aliyunCommercialize+capture+face\\\\\\\",\\\\\\\"sceneType\\\\\\\":\\\\\\\"normal\\\\\\\"},\\\\\\\"sdkVersion\\\\\\\":\\\\\\\"1.0\\\\\\\",\\\\\\\"env\\\\\\\":0,\\\\\\\"faceTips\\\\\\\":{\\\\\\\"systemErrorAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":205,\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"我知道了\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"系统错误\\\\\\\"},\\\\\\\"systemVersionErrorAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":101,\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"我知道了\\\\\\\",\\\\\\\"message\\\\\\\":\\\\\\\"刷脸仅在Android4.3及以上系统可用\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"当前系统不支持刷脸\\\\\\\"},\\\\\\\"limitAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":209,\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"我知道了\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"本次操作失败\\\\\\\"},\\\\\\\"failAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":202,\\\\\\\"leftButtonText\\\\\\\":\\\\\\\"退出\\\\\\\",\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"再试一次\\\\\\\",\\\\\\\"message\\\\\\\":\\\\\\\"提示:正对手机,更容易成功\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"刷脸失败\\\\\\\"},\\\\\\\"brandTip\\\\\\\":\\\\\\\"蚂蚁佐罗提供技术支持\\\\\\\",\\\\\\\"unsurpportAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":101,\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"我知道了\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"当前设备不支持刷脸\\\\\\\"},\\\\\\\"cameraNoPermissionAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":100,\\\\\\\"leftButtonText\\\\\\\":\\\\\\\"退出\\\\\\\",\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"立即开启\\\\\\\",\\\\\\\"message\\\\\\\":\\\\\\\"请查看当前应用是否有访问相机的权限，或返回重试\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"无法启动相机\\\\\\\"},\\\\\\\"networkErrorAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":207,\\\\\\\"leftButtonText\\\\\\\":\\\\\\\"退出\\\\\\\",\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"再试一次\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"网络不给力\\\\\\\"},\\\\\\\"exitAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":202,\\\\\\\"leftButtonText\\\\\\\":\\\\\\\"取消\\\\\\\",\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"确定\\\\\\\",\\\\\\\"message\\\\\\\":\\\\\\\"露个脸就能通过\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"确定退出吗?\\\\\\\"},\\\\\\\"interruptAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":202,\\\\\\\"leftButtonText\\\\\\\":\\\\\\\"退出\\\\\\\",\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"再试一次\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"验证中断\\\\\\\"},\\\\\\\"timeoutAlert\\\\\\\":{\\\\\\\"returnCode\\\\\\\":203,\\\\\\\"leftButtonText\\\\\\\":\\\\\\\"退出\\\\\\\",\\\\\\\"rightButtonText\\\\\\\":\\\\\\\"再试一次\\\\\\\",\\\\\\\"message\\\\\\\":\\\\\\\"提示:正对手机,更容易成功\\\\\\\",\\\\\\\"title\\\\\\\":\\\\\\\"操作超时\\\\\\\"}},\\\\\\\"algorithm\\\\\\\":{\\\\\\\"pose_distanceMax\\\\\\\":6000,\\\\\\\"eyeHwratio\\\\\\\":0.16,\\\\\\\"stack_time\\\\\\\":2,\\\\\\\"threshold\\\\\\\":{\\\\\\\"zfaceBlinkLiveness\\\\\\\":[0.2,0.8]},\\\\\\\"blink\\\\\\\":0,\\\\\\\"pose_pitch\\\\\\\":0.2,\\\\\\\"yunqiQuality\\\\\\\":4,\\\\\\\"pose_yaw\\\\\\\":0.2,\\\\\\\"pose_gaussian\\\\\\\":0.15,\\\\\\\"liveness_combinations\\\\\\\":\\\\\\\"zfaceBlinkLiveness\\\\\\\",\\\\\\\"minpose\\\\\\\":0,\\\\\\\"secProtocol\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"pose_motion\\\\\\\":1,\\\\\\\"pitchWeight\\\\\\\":4,\\\\\\\"pose_pitchMin\\\\\\\":-0.2,\\\\\\\"pose_rectwidth\\\\\\\":0.25,\\\\\\\"pose_integrity\\\\\\\":0.9,\\\\\\\"disWeight\\\\\\\":4,\\\\\\\"pose_light\\\\\\\":0.16,\\\\\\\"yawWeight\\\\\\\":1,\\\\\\\"pose_yawMin\\\\\\\":-0.17,\\\\\\\"log_level\\\\\\\":0,\\\\\\\"pose_distanceMin\\\\\\\":5000,\\\\\\\"differ\\\\\\\":0.15,\\\\\\\"liveness_combination\\\\\\\":[\\\\\\\"zfaceBlinkLiveness\\\\\\\"],\\\\\\\"mouth\\\\\\\":0,\\\\\\\"max_iod\\\\\\\":0.4,\\\\\\\"facesize\\\\\\\":50,\\\\\\\"stack_size\\\\\\\":2,\\\\\\\"quality_min_quality\\\\\\\":20,\\\\\\\"min_iod\\\\\\\":0.18}}\\\",\\\"sampleMode\\\":0,\\\"token\\\":\\\"240f987d891d2a31ed8744f5502273d6d\\\",\\\"type\\\":100}\",\"sign\":\"\"}";
    private static final int IDENTITY_PERMISSION_REQUEST_CODE = 1024;
    private static final int IDENTITY_UI_MSG_BASE = 1000;
    private static final int IDENTITY_UI_MSG_ERROR_CODE = 1001;
    private static final int IDENTITY_UI_MSG_INIT_SUCESSS = 1002;
    private static String[] identityPermissions;
    private long startTime;
    private Handler uiHandler;

    /* renamed from: com.aliyun.identity.platform.SystemLoadingActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ SystemLoadingActivity this$0;

        public AnonymousClass1(SystemLoadingActivity systemLoadingActivity) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.SystemLoadingActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ZimInitCallback {
        public final /* synthetic */ SystemLoadingActivity this$0;
        public final /* synthetic */ long val$time;

        public AnonymousClass2(SystemLoadingActivity systemLoadingActivity, long j2) {
        }

        @Override // com.aliyun.identity.platform.network.ZimInitCallback
        public void onError(String str, String str2) {
        }

        @Override // com.aliyun.identity.platform.network.ZimInitCallback
        public void onServerError(String str, String str2) {
        }

        @Override // com.aliyun.identity.platform.network.ZimInitCallback
        public void onSuccess(String str, OSSConfig oSSConfig, String str2) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.SystemLoadingActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$aliyun$identity$platform$api$IdentityPlatform$IdentityVerifyType = null;
    }

    public static /* synthetic */ void access$000(SystemLoadingActivity systemLoadingActivity, String str) {
    }

    public static /* synthetic */ void access$100(SystemLoadingActivity systemLoadingActivity) {
    }

    public static /* synthetic */ void access$200(SystemLoadingActivity systemLoadingActivity, String str) {
    }

    public static /* synthetic */ Handler access$300(SystemLoadingActivity systemLoadingActivity) {
    }

    private List<String> genUnGrantedToygerPermissions() {
    }

    private void init() {
    }

    private void onErrorCode(String str) {
    }

    private void onInitSuccess() {
    }

    private void sendErrorCode(String str) {
    }

    private boolean startFace(boolean z) {
    }

    private boolean startOCR(boolean z) {
    }

    public void handlePermissionsAndInit() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
