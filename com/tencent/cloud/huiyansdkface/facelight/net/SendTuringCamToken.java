package com.tencent.cloud.huiyansdkface.facelight.net;

import com.tencent.cloud.huiyansdkface.wehttp2.WeOkHttp;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SendTuringCamToken {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EnRequestParam {
        public String encryptedAESKey;
        public String requestBody;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TuringCamTokenResponse {
        public String code;
        public String msg;
    }

    public static void requestExec(WeOkHttp weOkHttp, String str, String str2, String str3, WeReq.Callback<TuringCamTokenResponse> callback) {
    }
}
