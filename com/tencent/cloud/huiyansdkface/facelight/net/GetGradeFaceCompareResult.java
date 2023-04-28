package com.tencent.cloud.huiyansdkface.facelight.net;

import com.tencent.cloud.huiyansdkface.facelight.net.model.request.actlight.FlashReq;
import com.tencent.cloud.huiyansdkface.wehttp2.WeOkHttp;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GetGradeFaceCompareResult {
    private static final String TAG = "com.tencent.cloud.huiyansdkface.facelight.net.GetGradeFaceCompareResult";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EnRequestParam {
        public String csrfToken;
        public String encryptedAESKey;
        public String orderNo;
        public String requestBody;
        public String version;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class GetResultReflectModeResponse implements Serializable {
        public String code;
        public String debugMsg;
        public String enMsg;
        public String msg;
    }

    public static void requestExec(WeOkHttp weOkHttp, String str, String str2, String str3, byte[] bArr, byte[] bArr2, String str4, String str5, String str6, FlashReq flashReq, int i2, WeReq.Callback<GetResultReflectModeResponse> callback) {
    }
}
