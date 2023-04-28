package com.tencent.qcloud.tuicore.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class PermissionRequester {
    private static final List<String> PERMISSIONS = null;
    private static Context applicationContext;
    private static PermissionRequester instance;
    private static boolean isRequesting;
    private static final Map<String, PermissionRequestContent> permissionRequestContentMap = null;
    private String mCurrentRequestPermission;
    private String mDeniedAlert;
    private PermissionDialogCallback mDialogCallback;
    private FullCallback mFullCallback;
    private int mIconId;
    private Set<String> mPermissions;
    private List<String> mPermissionsDenied;
    private List<String> mPermissionsGranted;
    private List<String> mPermissionsRequest;
    private String mReason;
    private String mReasonTitle;
    private SimpleCallback mSimpleCallback;

    /* renamed from: com.tencent.qcloud.tuicore.util.PermissionRequester$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements PermissionDialogCallback {
        public final /* synthetic */ PermissionRequester this$0;

        public AnonymousClass1(PermissionRequester permissionRequester) {
        }

        @Override // com.tencent.qcloud.tuicore.util.PermissionRequester.PermissionDialogCallback
        public void onApproved() {
        }

        @Override // com.tencent.qcloud.tuicore.util.PermissionRequester.PermissionDialogCallback
        public void onRefused() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.util.PermissionRequester$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements DialogInterface.OnDismissListener {
        public final /* synthetic */ PermissionRequester this$0;

        public AnonymousClass2(PermissionRequester permissionRequester) {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.util.PermissionRequester$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ PermissionRequester this$0;
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ PermissionDialogCallback val$callback;
        public final /* synthetic */ Dialog val$permissionTipDialog;

        public AnonymousClass3(PermissionRequester permissionRequester, Dialog dialog, Activity activity, PermissionDialogCallback permissionDialogCallback) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.util.PermissionRequester$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ PermissionRequester this$0;
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ PermissionDialogCallback val$callback;
        public final /* synthetic */ Dialog val$permissionTipDialog;

        public AnonymousClass4(PermissionRequester permissionRequester, Dialog dialog, Activity activity, PermissionDialogCallback permissionDialogCallback) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.util.PermissionRequester$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements DialogInterface.OnKeyListener {
        public final /* synthetic */ PermissionRequester this$0;
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ PermissionDialogCallback val$callback;
        public final /* synthetic */ Dialog val$permissionTipDialog;

        public AnonymousClass5(PermissionRequester permissionRequester, Dialog dialog, Activity activity, PermissionDialogCallback permissionDialogCallback) {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface FullCallback {
        void onDenied(List<String> list);

        void onGranted(List<String> list);
    }

    @RequiresApi(api = 23)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class PermissionActivity extends Activity {
        private static final int SHOW_TIP_DELAY = 150;
        private boolean isDenied;

        /* renamed from: com.tencent.qcloud.tuicore.util.PermissionRequester$PermissionActivity$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ PermissionActivity this$0;

            public AnonymousClass1(PermissionActivity permissionActivity) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public static /* synthetic */ boolean access$400(PermissionActivity permissionActivity) {
        }

        public static /* synthetic */ void access$500(PermissionActivity permissionActivity) {
        }

        private void fillContentView() {
        }

        private void requestPermission() {
        }

        @Override // android.app.Activity, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        }

        @Override // android.app.Activity
        public void onCreate(@Nullable Bundle bundle) {
        }

        @Override // android.app.Activity
        public void onDestroy() {
        }

        @Override // android.app.Activity
        public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        }

        @Override // android.app.Activity
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class PermissionConstants {
        public static final String CALENDAR = "android.permission-group.CALENDAR";
        public static final String CAMERA = "android.permission-group.CAMERA";
        public static final String CONTACTS = "android.permission-group.CONTACTS";
        private static final String[] GROUP_CALENDAR = null;
        private static final String[] GROUP_CAMERA = null;
        private static final String[] GROUP_CONTACTS = null;
        private static final String[] GROUP_LOCATION = null;
        private static final String[] GROUP_MICROPHONE = null;
        private static final String[] GROUP_PHONE = null;
        private static final String[] GROUP_PHONE_BELOW_O = null;
        private static final String[] GROUP_SENSORS = null;
        private static final String[] GROUP_SMS = null;
        private static final String[] GROUP_STORAGE = null;
        public static final String LOCATION = "android.permission-group.LOCATION";
        public static final String MICROPHONE = "android.permission-group.MICROPHONE";
        public static final String PHONE = "android.permission-group.PHONE";
        public static final String SENSORS = "android.permission-group.SENSORS";
        public static final String SMS = "android.permission-group.SMS";
        public static final String STORAGE = "android.permission-group.STORAGE";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public @interface Permission {
        }

        public static String[] getPermissions(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface PermissionDialogCallback {
        void onApproved();

        void onRefused();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class PermissionRequestContent {
        public String deniedAlert;
        public int iconResId;
        public String reason;
        public String reasonTitle;

        public void setDeniedAlert(String str) {
        }

        public void setIconResId(int i2) {
        }

        public void setReason(String str) {
        }

        public void setReasonTitle(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface SimpleCallback {
        void onDenied();

        void onGranted();
    }

    private PermissionRequester(String str) {
    }

    public static /* synthetic */ PermissionDialogCallback access$000(PermissionRequester permissionRequester) {
    }

    public static /* synthetic */ PermissionDialogCallback access$002(PermissionRequester permissionRequester, PermissionDialogCallback permissionDialogCallback) {
    }

    public static /* synthetic */ PermissionRequester access$100() {
    }

    public static /* synthetic */ String access$1000(PermissionRequester permissionRequester) {
    }

    public static /* synthetic */ List access$1100(PermissionRequester permissionRequester) {
    }

    public static /* synthetic */ boolean access$1202(boolean z) {
    }

    public static /* synthetic */ List access$200(PermissionRequester permissionRequester) {
    }

    public static /* synthetic */ void access$300(PermissionRequester permissionRequester, Activity activity) {
    }

    public static /* synthetic */ String access$600(PermissionRequester permissionRequester) {
    }

    public static /* synthetic */ Map access$700() {
    }

    public static /* synthetic */ int access$800(PermissionRequester permissionRequester) {
    }

    public static /* synthetic */ String access$900(PermissionRequester permissionRequester) {
    }

    private static Context getApplicationContext() {
    }

    public static List<String> getPermissions() {
    }

    private void getPermissionsStatus() {
    }

    public static boolean isGranted(String... strArr) {
    }

    private static boolean isIntentAvailable(Intent intent) {
    }

    public static void launchAppDetailsSettings() {
    }

    private void onRequestPermissionsResult(Activity activity) {
    }

    public static PermissionRequester permission(String str) {
    }

    private void requestCallback() {
    }

    public static void setPermissionRequestContent(String str, PermissionRequestContent permissionRequestContent) {
    }

    @RequiresApi(api = 23)
    private void startPermissionActivity() {
    }

    public PermissionRequester callback(SimpleCallback simpleCallback) {
    }

    public PermissionRequester deniedAlert(String str) {
    }

    public PermissionRequester permissionDialogCallback(PermissionDialogCallback permissionDialogCallback) {
    }

    public PermissionRequester reason(String str) {
    }

    public PermissionRequester reasonIcon(int i2) {
    }

    public PermissionRequester reasonTitle(String str) {
    }

    public void request() {
    }

    public void showPermissionDialog(Activity activity, PermissionDialogCallback permissionDialogCallback) {
    }

    public static List<String> getPermissions(String str) {
    }

    public PermissionRequester callback(FullCallback fullCallback) {
    }

    private static boolean isGranted(String str) {
    }
}
