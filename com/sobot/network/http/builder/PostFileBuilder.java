package com.sobot.network.http.builder;

import com.sobot.network.http.request.RequestCall;
import java.io.File;
import java.util.Map;
import okhttp3.MediaType;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PostFileBuilder extends OkHttpRequestBuilder {
    private File file;
    private MediaType mediaType;

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder addHeader(String str, String str2) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public RequestCall build() {
    }

    public OkHttpRequestBuilder file(File file) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder headers(Map map) {
    }

    public OkHttpRequestBuilder mediaType(MediaType mediaType) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder tag(Object obj) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder url(String str) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostFileBuilder addHeader(String str, String str2) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostFileBuilder headers(Map<String, String> map) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostFileBuilder tag(Object obj) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostFileBuilder url(String str) {
    }
}
