package com.sobot.network.http.request;

import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OtherRequest extends OkHttpRequest {
    private static MediaType MEDIA_TYPE_PLAIN;
    private String content;
    private String method;
    private RequestBody requestBody;

    public OtherRequest(RequestBody requestBody, String str, String str2, String str3, Object obj, Map<String, String> map, Map<String, String> map2) {
    }

    @Override // com.sobot.network.http.request.OkHttpRequest
    public Request buildRequest(RequestBody requestBody) {
    }

    @Override // com.sobot.network.http.request.OkHttpRequest
    public RequestBody buildRequestBody() {
    }
}
