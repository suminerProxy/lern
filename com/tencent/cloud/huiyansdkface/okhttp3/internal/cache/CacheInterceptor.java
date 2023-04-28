package com.tencent.cloud.huiyansdkface.okhttp3.internal.cache;

import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.BufferedSink;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.Source;
import com.tencent.cloud.huiyansdkface.okio.Timeout;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private InternalCache f10835a;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.cache.CacheInterceptor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Source {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10836a;
        private /* synthetic */ BufferedSource b;
        private /* synthetic */ CacheRequest c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ BufferedSink f10837d;

        public AnonymousClass1(CacheInterceptor cacheInterceptor, BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okio.Source
        public Timeout timeout() {
        }
    }

    public CacheInterceptor(InternalCache internalCache) {
    }

    private static Response a(Response response) {
    }

    private static boolean a(String str) {
    }

    private static boolean b(String str) {
    }

    @Override // com.tencent.cloud.huiyansdkface.okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
    }
}
