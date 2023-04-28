package com.aliyun.identity.ocr.takephoto.permission;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.aliyun.identity.ocr.takephoto.app.TakePhoto;
import com.aliyun.identity.ocr.takephoto.model.InvokeParam;
import com.aliyun.identity.ocr.takephoto.model.TContextWrap;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PermissionManager {
    private static final String[] methodNames = null;

    /* renamed from: com.aliyun.identity.ocr.takephoto.permission.PermissionManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$aliyun$identity$ocr$takephoto$permission$PermissionManager$TPermissionType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TPermission {
        private static final /* synthetic */ TPermission[] $VALUES = null;
        public static final TPermission CAMERA = null;
        public static final TPermission STORAGE = null;
        public String stringValue;

        private TPermission(String str, int i2, String str2) {
        }

        public static TPermission valueOf(String str) {
        }

        public static TPermission[] values() {
        }

        public String stringValue() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TPermissionType {
        private static final /* synthetic */ TPermissionType[] $VALUES = null;
        public static final TPermissionType DENIED = null;
        public static final TPermissionType GRANTED = null;
        public static final TPermissionType NOT_NEED = null;
        public static final TPermissionType ONLY_CAMERA_DENIED = null;
        public static final TPermissionType ONLY_STORAGE_DENIED = null;
        public static final TPermissionType WAIT = null;
        public String stringValue;

        private TPermissionType(String str, int i2, String str2) {
        }

        public static TPermissionType valueOf(String str) {
        }

        public static TPermissionType[] values() {
        }

        public String stringValue() {
        }
    }

    public static TPermissionType checkPermission(@NonNull TContextWrap tContextWrap, @NonNull Method method) {
    }

    public static void handlePermissionsResult(Activity activity, TPermissionType tPermissionType, InvokeParam invokeParam, TakePhoto.TakeResultListener takeResultListener) {
    }

    public static TPermissionType onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public static void requestPermission(@NonNull TContextWrap tContextWrap, @NonNull String[] strArr) {
    }
}
