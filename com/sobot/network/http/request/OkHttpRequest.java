package com.sobot.network.http.request;

import com.sobot.network.http.callback.Callback;
import com.sobot.network.http.request.ProgressRequestBody;
import java.util.Map;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class OkHttpRequest {
    public Request.Builder builder;
    public Map<String, String> headers;
    public Map<String, String> params;
    public Object tag;
    public transient ProgressRequestBody.UploadInterceptor uploadInterceptor;
    public String url;

    public OkHttpRequest(String str, Object obj, Map<String, String> map, Map<String, String> map2) {
    }

    private void initBuilder() {
    }

    public void addHeader(String str, String str2) {
    }

    public void appendHeaders() {
    }

    public RequestCall build() {
    }

    public abstract Request buildRequest(RequestBody requestBody);

    public abstract RequestBody buildRequestBody();

    public Request generateRequest(Callback callback) {
    }

    public String getBaseUrl() {
    }

    public OkHttpRequest uploadInterceptor(ProgressRequestBody.UploadInterceptor uploadInterceptor) {
    }

    public RequestBody wrapRequestBody(RequestBody requestBody, Callback callback) {
    }
}
