package com.sobot.network.http.builder;

import com.sobot.network.http.request.ProgressRequestBody;
import com.sobot.network.http.request.RequestCall;
import java.io.File;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PostMultipartFormBuilder extends OkHttpRequestBuilder implements HasParamsable {
    private List<FileInput> files;
    private ProgressRequestBody.UploadInterceptor uploadInterceptor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class FileInput {
        public File file;
        public String filename;
        public String key;

        public FileInput(String str, String str2, File file) {
        }

        public String toString() {
        }
    }

    public PostMultipartFormBuilder addFile(String str, String str2, File file) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder addHeader(String str, String str2) {
    }

    @Override // com.sobot.network.http.builder.HasParamsable
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder addParams(String str, String str2) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public RequestCall build() {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder headers(Map map) {
    }

    @Override // com.sobot.network.http.builder.HasParamsable
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder params(Map map) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder tag(Object obj) {
    }

    public PostMultipartFormBuilder uploadInterceptor(ProgressRequestBody.UploadInterceptor uploadInterceptor) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public /* bridge */ /* synthetic */ OkHttpRequestBuilder url(String str) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostMultipartFormBuilder addHeader(String str, String str2) {
    }

    @Override // com.sobot.network.http.builder.HasParamsable
    public PostMultipartFormBuilder addParams(String str, String str2) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostMultipartFormBuilder headers(Map<String, String> map) {
    }

    @Override // com.sobot.network.http.builder.HasParamsable
    public PostMultipartFormBuilder params(Map<String, String> map) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostMultipartFormBuilder tag(Object obj) {
    }

    @Override // com.sobot.network.http.builder.OkHttpRequestBuilder
    public PostMultipartFormBuilder url(String str) {
    }
}
