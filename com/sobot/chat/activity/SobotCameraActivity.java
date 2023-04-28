package com.sobot.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.camera.StCameraView;
import com.sobot.chat.camera.listener.StCameraListener;
import com.sobot.chat.camera.listener.StClickListener;
import com.sobot.chat.camera.listener.StErrorListener;
import com.sobot.chat.listener.PermissionListenerImpl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotCameraActivity extends SobotBaseActivity {
    public static final int ACTION_TYPE_PHOTO = 0;
    public static final int ACTION_TYPE_VIDEO = 1;
    private static final String EXTRA_ACTION_TYPE = "EXTRA_ACTION_TYPE";
    private static final String EXTRA_IMAGE_FILE_PATH = "EXTRA_IMAGE_FILE_PATH";
    private static final String EXTRA_VIDEO_FILE_PATH = "EXTRA_VIDEO_FILE_PATH";
    private static final int RESULT_CODE = 103;
    private StCameraView jCameraView;

    /* renamed from: com.sobot.chat.activity.SobotCameraActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements StErrorListener {
        public final /* synthetic */ SobotCameraActivity this$0;

        /* renamed from: com.sobot.chat.activity.SobotCameraActivity$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C01421 extends PermissionListenerImpl {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C01421(AnonymousClass1 anonymousClass1) {
            }
        }

        public AnonymousClass1(SobotCameraActivity sobotCameraActivity) {
        }

        @Override // com.sobot.chat.camera.listener.StErrorListener
        public void AudioPermissionError() {
        }

        @Override // com.sobot.chat.camera.listener.StErrorListener
        public void onError() {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotCameraActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StCameraListener {
        public final /* synthetic */ SobotCameraActivity this$0;

        public AnonymousClass2(SobotCameraActivity sobotCameraActivity) {
        }

        @Override // com.sobot.chat.camera.listener.StCameraListener
        public void captureSuccess(Bitmap bitmap) {
        }

        @Override // com.sobot.chat.camera.listener.StCameraListener
        public void recordSuccess(String str, Bitmap bitmap) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotCameraActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements StClickListener {
        public final /* synthetic */ SobotCameraActivity this$0;

        public AnonymousClass3(SobotCameraActivity sobotCameraActivity) {
        }

        @Override // com.sobot.chat.camera.listener.StClickListener
        public void onClick() {
        }
    }

    public static /* synthetic */ boolean access$000(SobotCameraActivity sobotCameraActivity) {
    }

    public static int getActionType(Intent intent) {
    }

    public static String getSelectedImage(Intent intent) {
    }

    public static String getSelectedVideo(Intent intent) {
    }

    public static Intent newIntent(Context context) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }
}
