package com.sobot.chat.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.sobot.chat.api.ZhiChiApi;
import com.sobot.chat.listener.PermissionListener;
import com.sobot.chat.listener.PermissionListenerImpl;
import com.sobot.chat.notchlib.INotchScreen;
import com.sobot.chat.widget.dialog.SobotPermissionTipDialog;
import com.sobot.chat.widget.image.SobotRCImageView;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class SobotBaseFragment extends Fragment {
    public static final int REQUEST_CODE_CAMERA = 108;
    private Activity activity;
    public File cameraFile;
    public PermissionListener permissionListener;
    public ZhiChiApi zhiChiApi;

    /* renamed from: com.sobot.chat.fragment.SobotBaseFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
        public final /* synthetic */ SobotBaseFragment this$0;
        public final /* synthetic */ View val$view;

        public AnonymousClass1(SobotBaseFragment sobotBaseFragment, View view) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
        public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotBaseFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseFragment this$0;

        public AnonymousClass2(SobotBaseFragment sobotBaseFragment) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotBaseFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseFragment this$0;

        public AnonymousClass3(SobotBaseFragment sobotBaseFragment) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotBaseFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseFragment this$0;

        public AnonymousClass4(SobotBaseFragment sobotBaseFragment) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotBaseFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements SobotPermissionTipDialog.ClickViewListener {
        public final /* synthetic */ SobotBaseFragment this$0;
        public final /* synthetic */ int val$type;

        public AnonymousClass5(SobotBaseFragment sobotBaseFragment, int i2) {
        }

        @Override // com.sobot.chat.widget.dialog.SobotPermissionTipDialog.ClickViewListener
        public void clickLeftView(Context context, SobotPermissionTipDialog sobotPermissionTipDialog) {
        }

        @Override // com.sobot.chat.widget.dialog.SobotPermissionTipDialog.ClickViewListener
        public void clickRightView(Context context, SobotPermissionTipDialog sobotPermissionTipDialog) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotBaseFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 extends PermissionListenerImpl {
        public final /* synthetic */ SobotBaseFragment this$0;

        public AnonymousClass6(SobotBaseFragment sobotBaseFragment) {
        }

        @Override // com.sobot.chat.listener.PermissionListenerImpl, com.sobot.chat.listener.PermissionListener
        public void onPermissionSuccessListener() {
        }
    }

    public static boolean isCameraCanUse() {
    }

    public void applyTitleTextColor(TextView textView) {
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

    public float getDimens(String str) {
    }

    public int getResDimenId(String str) {
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

    public Activity getSobotActivity() {
    }

    public SobotBaseFragment getSobotBaseFragment() {
    }

    public boolean isHasAudioPermission() {
    }

    public boolean isHasCameraPermission() {
    }

    public boolean isHasPermission(int i2) {
    }

    public boolean isHasStoragePermission() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void selectPicFromCamera() {
    }

    public void selectPicFromCameraBySys() {
    }

    public void selectPicFromLocal() {
    }

    public void selectVedioFromLocal() {
    }

    public void showAvatar(SobotRCImageView sobotRCImageView, String str, boolean z) {
    }

    public void showLeftMenu(View view, int i2, String str) {
    }

    public void showRightMenu(View view, int i2, String str) {
    }
}
