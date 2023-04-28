package com.sobot.network.http.builder;

import com.sobot.network.http.request.RequestCall;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class OkHttpRequestBuilder {
    public Map<String, String> headers;
    public Map<String, String> params;
    public Object tag;
    public String url;

    public abstract OkHttpRequestBuilder addHeader(String str, String str2);

    public abstract RequestCall build();

    public abstract OkHttpRequestBuilder headers(Map<String, String> map);

    public abstract OkHttpRequestBuilder tag(Object obj);

    public abstract OkHttpRequestBuilder url(String str);
}
