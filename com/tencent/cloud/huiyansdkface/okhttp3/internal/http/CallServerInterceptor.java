package com.tencent.cloud.huiyansdkface.okhttp3.internal.http;

import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.ForwardingSink;
import com.tencent.cloud.huiyansdkface.okio.Sink;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class CallServerInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10933a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class CountingSink extends ForwardingSink {

        /* renamed from: a  reason: collision with root package name */
        public long f10934a;

        public CountingSink(Sink sink) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.ForwardingSink, com.tencent.cloud.huiyansdkface.okio.Sink
        public final void write(Buffer buffer, long j2) throws IOException {
        }
    }

    public CallServerInterceptor(boolean z) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
    }
}
