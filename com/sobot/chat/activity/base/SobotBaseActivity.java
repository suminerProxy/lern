package com.sobot.chat.activity.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.sobot.chat.api.ZhiChiApi;
import com.sobot.chat.listener.PermissionListener;
import com.sobot.chat.listener.PermissionListenerImpl;
import com.sobot.chat.notchlib.INotchScreen;
import com.sobot.chat.widget.dialog.SobotPermissionTipDialog;
import com.sobot.chat.widget.image.SobotRCImageView;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotBaseActivity extends FragmentActivity {
    public File cameraFile;
    private int initMode;
    public PermissionListener permissionListener;
    public ZhiChiApi zhiChiApi;

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
        public final /* synthetic */ SobotBaseActivity this$0;
        public final /* synthetic */ View val$view;

        public AnonymousClass1(SobotBaseActivity sobotBaseActivity, View view) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
        public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
        }
    }

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SobotBaseActivity this$0;

        public AnonymousClass2(SobotBaseActivity sobotBaseActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SobotBaseActivity this$0;

        public AnonymousClass3(SobotBaseActivity sobotBaseActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseActivity this$0;

        public AnonymousClass4(SobotBaseActivity sobotBaseActivity) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseActivity this$0;

        public AnonymousClass5(SobotBaseActivity sobotBaseActivity) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseActivity this$0;

        public AnonymousClass6(SobotBaseActivity sobotBaseActivity) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements SobotPermissionTipDialog.ClickViewListener {
        public final /* synthetic */ SobotBaseActivity this$0;
        public final /* synthetic */ int val$type;

        public AnonymousClass7(SobotBaseActivity sobotBaseActivity, int i2) {
        }

        @Override // com.sobot.chat.widget.dialog.SobotPermissionTipDialog.ClickViewListener
        public void clickLeftView(Context context, SobotPermissionTipDialog sobotPermissionTipDialog) {
        }

        @Override // com.sobot.chat.widget.dialog.SobotPermissionTipDialog.ClickViewListener
        public void clickRightView(Context context, SobotPermissionTipDialog sobotPermissionTipDialog) {
        }
    }

    /* renamed from: com.sobot.chat.activity.base.SobotBaseActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseActivity this$0;

        public AnonymousClass8(SobotBaseActivity sobotBaseActivity) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    private void applyTitleUIConfig(TextView textView) {
    }

    public static boolean isCameraCanUse() {
    }

    public void changeAppLanguage() {
    }

    public boolean checkAudioPermission() {
    }

    public boolean checkCameraPermission() {
    }

    public boolean checkIsShowPermissionPop(String str, String str2, int i2) {
    }

    public boolean checkStoragePermission() {
    }

    public void displayInNotch(View view) {
    }

    public SobotRCImageView getAvatarMenu() {
    }

    public abstract int getContentViewResId();

    public TextView getLeftMenu() {
    }

    public int getResColor(String str) {
    }

    public int getResColorId(String str) {
    }

    public int getResDrawableId(String str) {
    }

    public int getResId(String str) {
    }

    public int getResLayoutId(String str) {
    }

    public String getResString(String str) {
    }

    public int getResStringId(String str) {
    }

    public TextView getRightMenu() {
    }

    public SobotBaseActivity getSobotBaseActivity() {
    }

    public Context getSobotBaseContext() {
    }

    public int getStatusBarColor() {
    }

    public View getTitleView() {
    }

    public View getToolBar() {
    }

    public void initBundleData(Bundle bundle) {
    }

    public abstract void initData();

    public abstract void initView();

    public boolean isFullScreen() {
    }

    public boolean isHasAudioPermission() {
    }

    public boolean isHasCameraPermission() {
    }

    public boolean isHasPermission(int i2) {
    }

    public boolean isHasStoragePermission() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    public void onLeftMenuClick(View view) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onRightMenuClick(View view) {
    }

    public void selectPicFromCamera() {
    }

    public void selectPicFromCameraBySys() {
    }

    public void selectPicFromLocal() {
    }

    public void selectVedioFromLocal() {
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
    }

    public void setUpToolBar() {
    }

    public void setUpToolBarLeftMenu() {
    }

    public void setUpToolBarRightMenu() {
    }

    public void showLeftMenu(int i2, String str, boolean z) {
    }

    public void showRightMenu(int i2, String str, boolean z) {
    }

    @Override // android.app.Activity
    public void setTitle(int i2) {
    }
}
