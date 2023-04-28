package com.tencent.cloud.huiyansdkface.okhttp3.internal.http;

import com.tencent.cloud.huiyansdkface.okhttp3.Address;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.StreamAllocation;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private final OkHttpClient f10948a;
    private volatile StreamAllocation b;
    private Object c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f10949d;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient, boolean z) {
    }

    private static int a(Response response, int i2) {
    }

    private Address a(HttpUrl httpUrl) {
    }

    private static boolean a(Response response, HttpUrl httpUrl) {
    }

    private boolean a(IOException iOException, StreamAllocation streamAllocation, boolean z, Request request) {
    }

    public final void cancel() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
    }

    public final boolean isCanceled() {
    }

    public final void setCallStackTrace(Object obj) {
    }

    public final StreamAllocation streamAllocation() {
    }
}
