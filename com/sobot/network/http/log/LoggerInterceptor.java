package com.sobot.network.http.log;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LoggerInterceptor implements Interceptor {
    public static final String TAG = "OkHttpUtils";
    private boolean showResponse;
    private String tag;

    public LoggerInterceptor(String str, boolean z) {
    }

    private String bodyToString(Request request) {
    }

    private boolean isText(MediaType mediaType) {
    }

    private void logForRequest(Request request) {
    }

    private Response logForResponse(Response response) {
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
    }

    public LoggerInterceptor(String str) {
    }
}
