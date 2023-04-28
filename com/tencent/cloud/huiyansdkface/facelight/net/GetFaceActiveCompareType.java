package com.tencent.cloud.huiyansdkface.facelight.net;

import com.tencent.cloud.huiyansdkface.facelight.net.model.request.actlight.SelectData;
import com.tencent.cloud.huiyansdkface.wehttp2.BaseCallback;
import com.tencent.cloud.huiyansdkface.wehttp2.WeOkHttp;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GetFaceActiveCompareType {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EnRequestParam {
        public String encryptedAESKey;
        public String requestBody;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class GetFaceCompareTypeResponse implements Serializable {
        public String code;
        public String debugMsg;
        public String enMsg;
        public String msg;
    }

    public static void requestExec(WeOkHttp weOkHttp, String str, String str2, String str3, String str4, SelectData selectData, BaseCallback<GetFaceCompareTypeResponse> baseCallback) {
    }
}
