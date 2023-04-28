package com.tencent.cloud.huiyansdkface.analytics;

import com.tencent.cloud.huiyansdkface.wehttp2.WeOkHttp;
import com.tencent.cloud.huiyansdkface.wehttp2.WeReq;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class EventSender {
    private static final String TAG = "EventSender";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class RequestFailParam {
        public String account;
        public String appId;
        public String appVersion;
        public long createTime;
        public String deviceId;
        public String deviceInfo;
        public String errorCode;
        public String errorMsg;
        public String metricsOs;
        public String openId;
        public String subAppId;
        public String type;
        public String waVersion;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class sendEventResponse implements Serializable {
        public String code;
        public String msg;
    }

    public static void requestExec(WeOkHttp weOkHttp, WBSAParam wBSAParam, String str, List<WBSAEvent> list, WeReq.Callback<sendEventResponse> callback) {
    }

    public static void requestFailExec(WeOkHttp weOkHttp, RequestFailParam requestFailParam, String str, WeReq.Callback<sendEventResponse> callback) {
    }
}
