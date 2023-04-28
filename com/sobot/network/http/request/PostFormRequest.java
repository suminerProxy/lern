package com.sobot.network.http.request;

import com.sobot.network.http.builder.PostFormBuilder;
import com.sobot.network.http.callback.Callback;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PostFormRequest extends OkHttpRequest {
    private List<PostFormBuilder.FileInput> files;

    public PostFormRequest(String str, Object obj, Map<String, String> map, Map<String, String> map2, List<PostFormBuilder.FileInput> list) {
    }

    private void addParams(MultipartBody.Builder builder) {
    }

    private String guessMimeType(String str) {
    }

    @Override // com.sobot.network.http.request.OkHttpRequest
    public Request buildRequest(RequestBody requestBody) {
    }

    @Override // com.sobot.network.http.request.OkHttpRequest
    public RequestBody buildRequestBody() {
    }

    @Override // com.sobot.network.http.request.OkHttpRequest
    public RequestBody wrapRequestBody(RequestBody requestBody, Callback callback) {
    }

    private void addParams(FormBody.Builder builder) {
    }
}
