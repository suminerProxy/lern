package com.tencent.cloud.huiyansdkface.facelight.api;

import android.content.Context;
import android.os.Bundle;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyLoginListener;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbCloudFaceVerifyResultListener;
import com.tencent.cloud.huiyansdkface.facelight.api.listeners.WbFaceVerifyInitCusSdkCallback;
import com.tencent.cloud.huiyansdkface.facelight.process.FaceVerifyStatus;
import com.tencent.cloud.huiyansdkface.facelight.process.d;
import java.io.Serializable;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WbCloudFaceVerifySdk {

    /* renamed from: a  reason: collision with root package name */
    private static volatile WbCloudFaceVerifySdk f10200a;
    private d b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class InputData implements Serializable {
        public final String appId;
        public String faceId;
        public final String licence;
        public String nonce;
        public final String orderNo;
        public String sign;
        public String userId;
        public FaceVerifyStatus.Mode verifyMode;
        public String version;

        public InputData(String str, String str2, String str3) {
        }

        public InputData(String str, String str2, String str3, String str4, String str5, String str6, FaceVerifyStatus.Mode mode, String str7) {
        }

        public InputData(String str, String str2, String str3, String str4, String str5, String str6, String str7, FaceVerifyStatus.Mode mode, String str8) {
        }

        public String toString() {
        }
    }

    public static WbCloudFaceVerifySdk getInstance() {
    }

    public void initAdvSdk(Context context, Bundle bundle, WbCloudFaceVerifyLoginListener wbCloudFaceVerifyLoginListener) {
    }

    public void initCusSdk(Context context, Bundle bundle, WbFaceVerifyInitCusSdkCallback wbFaceVerifyInitCusSdkCallback) {
    }

    public void initSdk(Context context, Bundle bundle, WbCloudFaceVerifyLoginListener wbCloudFaceVerifyLoginListener) {
    }

    public void release() {
    }

    public void startWbCusFaceVerifySdk(Context context, Map<String, Object> map, WbCloudFaceVerifyResultListener wbCloudFaceVerifyResultListener) {
    }

    public void startWbFaceVerifySdk(Context context, WbCloudFaceVerifyResultListener wbCloudFaceVerifyResultListener) {
    }
}
