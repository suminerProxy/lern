package com.sobot.network.http.request;

import com.sobot.network.http.callback.Callback;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RequestCall {
    private Call call;
    private OkHttpClient clone;
    private long connTimeOut;
    private OkHttpRequest okHttpRequest;
    private long readTimeOut;
    private Request request;
    private long writeTimeOut;

    public RequestCall(OkHttpRequest okHttpRequest) {
    }

    private Request generateRequest(Callback callback) {
    }

    public Call buildCall(Callback callback) {
    }

    public void cancel() {
    }

    public RequestCall connTimeOut(long j2) {
    }

    public void execute(Callback callback) {
    }

    public Call getCall() {
    }

    public OkHttpRequest getOkHttpRequest() {
    }

    public Request getRequest() {
    }

    public RequestCall readTimeOut(long j2) {
    }

    public RequestCall writeTimeOut(long j2) {
    }

    public Response execute() throws IOException {
    }
}
