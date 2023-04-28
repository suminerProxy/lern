package com.tencent.cloud.huiyansdkface.okhttp3.internal.http;

import com.tencent.cloud.huiyansdkface.okhttp3.Call;
import com.tencent.cloud.huiyansdkface.okhttp3.Connection;
import com.tencent.cloud.huiyansdkface.okhttp3.EventListener;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.RealConnection;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.connection.StreamAllocation;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a  reason: collision with root package name */
    private final List<Interceptor> f10937a;
    private final StreamAllocation b;
    private final HttpCodec c;

    /* renamed from: d  reason: collision with root package name */
    private final RealConnection f10938d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10939e;

    /* renamed from: f  reason: collision with root package name */
    private final Request f10940f;

    /* renamed from: g  reason: collision with root package name */
    private final Call f10941g;

    /* renamed from: h  reason: collision with root package name */
    private final EventListener f10942h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10943i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10944j;

    /* renamed from: k  reason: collision with root package name */
    private final int f10945k;

    /* renamed from: l  reason: collision with root package name */
    private int f10946l;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i2, Request request, Call call, EventListener eventListener, int i3, int i4, int i5) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final Call call() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final int connectTimeoutMillis() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final Connection connection() {
    }

    public final EventListener eventListener() {
    }

    public final HttpCodec httpStream() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final Response proceed(Request request) throws IOException {
    }

    public final Response proceed(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) throws IOException {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final int readTimeoutMillis() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final Request request() {
    }

    public final StreamAllocation streamAllocation() {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final Interceptor.Chain withConnectTimeout(int i2, TimeUnit timeUnit) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final Interceptor.Chain withReadTimeout(int i2, TimeUnit timeUnit) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final Interceptor.Chain withWriteTimeout(int i2, TimeUnit timeUnit) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor.Chain
    public final int writeTimeoutMillis() {
    }
}
