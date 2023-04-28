package com.aliyun.identity.platform.network;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NetworkPresenter {
    private static String INIT_SMART_DEVICE = "InitSmartDeviceSecurity";
    private static String OCR_SMART_DEVICE = "OcrSmartDeviceSecurity";
    private static String VERIFY_SMART_DEVICE = "VerifySmartDeviceSecurity";

    /* renamed from: com.aliyun.identity.platform.network.NetworkPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements PopNetCallback {
        public final /* synthetic */ String val$certifyId;
        public final /* synthetic */ String val$metaInfo;
        public final /* synthetic */ boolean val$retry;
        public final /* synthetic */ ZimInitCallback val$zimInitCallback;

        public AnonymousClass1(ZimInitCallback zimInitCallback, boolean z, String str, String str2) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onError(int i2, String str, Object obj) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onSuccess(int i2, String str, Object obj) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.network.NetworkPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements PopNetCallback {
        public final /* synthetic */ String val$certifyId;
        public final /* synthetic */ IdentityOcrCallback val$identityOcrCallback;
        public final /* synthetic */ String val$ossFileName;
        public final /* synthetic */ boolean val$retry;
        public final /* synthetic */ String val$sideType;

        public AnonymousClass2(IdentityOcrCallback identityOcrCallback, boolean z, String str, String str2, String str3) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onError(int i2, String str, Object obj) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onSuccess(int i2, String str, Object obj) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.network.NetworkPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass3 implements PopNetCallback {
        public final /* synthetic */ String val$certifyData;
        public final /* synthetic */ String val$certifyId;
        public final /* synthetic */ IdentityOcrVerifyCallback val$identityOcrCallback;
        public final /* synthetic */ String val$ocrData;
        public final /* synthetic */ boolean val$retry;

        public AnonymousClass3(IdentityOcrVerifyCallback identityOcrVerifyCallback, boolean z, String str, String str2, String str3) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onError(int i2, String str, Object obj) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onSuccess(int i2, String str, Object obj) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.network.NetworkPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass4 implements PopNetCallback {
        public final /* synthetic */ List val$logs;
        public final /* synthetic */ boolean val$retry;
        public final /* synthetic */ UploadLogCallback val$zimUploadLogCallback;

        public AnonymousClass4(boolean z, List list, UploadLogCallback uploadLogCallback) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onError(int i2, String str, Object obj) {
        }

        @Override // com.aliyun.identity.platform.network.PopNetCallback
        public void onSuccess(int i2, String str, Object obj) {
        }
    }

    public static void initSmartDevice(String str, String str2, boolean z, ZimInitCallback zimInitCallback) {
    }

    public static void ocrSmartDevice(String str, String str2, String str3, boolean z, IdentityOcrCallback identityOcrCallback) {
    }

    public static void uploadLogInfo(List<String> list, boolean z, UploadLogCallback uploadLogCallback) {
    }

    public static void verifySmartDevice(String str, String str2, String str3, boolean z, IdentityOcrVerifyCallback identityOcrVerifyCallback) {
    }
}
