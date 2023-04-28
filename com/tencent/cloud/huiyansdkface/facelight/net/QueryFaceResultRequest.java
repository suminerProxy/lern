package com.tencent.cloud.huiyansdkface.facelight.net;

import com.tencent.cloud.huiyansdkface.wehttp2.WeOkHttp;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class QueryFaceResultRequest {
    private static final String TAG = "com.tencent.cloud.huiyansdkface.facelight.net.QueryFaceResultRequest";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EnRequestParam {
        public String encryptedAESKey;
        public String requestBody;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class QueryResponse implements Serializable {
        public String code;
        public String debugMsg;
        public String enMsg;
        public String msg;
    }

    public static void requestExec(WeOkHttp weOkHttp, int i2, String str, String str2, String str3, String str4, WeReq.Callback<QueryResponse> callback) {
    }
}
