package com.tencent.qcloud.tuikit.tuichat.util;

import com.tencent.qcloud.tuicore.util.PermissionRequester;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PermissionHelper {
    public static final int PERMISSION_CAMERA = 2;
    public static final int PERMISSION_MICROPHONE = 1;
    public static final int PERMISSION_STORAGE = 3;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements PermissionRequester.SimpleCallback {
        public final /* synthetic */ PermissionCallback val$callback;

        public AnonymousClass1(PermissionCallback permissionCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.util.PermissionRequester.SimpleCallback
        public void onDenied() {
        }

        @Override // com.tencent.qcloud.tuicore.util.PermissionRequester.SimpleCallback
        public void onGranted() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface PermissionCallback {
        void onDenied();

        void onGranted();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface PermissionType {
    }

    public static void requestPermission(@PermissionType int i2, PermissionCallback permissionCallback) {
    }
}
