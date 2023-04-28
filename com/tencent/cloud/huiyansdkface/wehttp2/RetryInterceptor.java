package com.tencent.cloud.huiyansdkface.wehttp2;

import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class RetryInterceptor implements Interceptor {
    private static RetryStrategy c;

    /* renamed from: a  reason: collision with root package name */
    private int f11274a;
    private RetryStrategy b;

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.RetryInterceptor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements RetryStrategy {
        @Override // com.tencent.cloud.huiyansdkface.wehttp2.RetryInterceptor.RetryStrategy
        public final boolean needRetry(Request request, Response response, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface RetryStrategy {
        boolean needRetry(Request request, Response response, int i2);
    }

    public RetryInterceptor(int i2, RetryStrategy retryStrategy) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
    }

    public RetryInterceptor setMaxRetryCount(int i2) {
    }

    public RetryInterceptor setRetryStrategy(RetryStrategy retryStrategy) {
    }
}
