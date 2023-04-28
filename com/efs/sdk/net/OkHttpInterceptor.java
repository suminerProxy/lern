package com.efs.sdk.net;

import com.efs.sdk.net.a.a.f;
import com.efs.sdk.net.a.a.h;
import java.io.InputStream;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OkHttpInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    private final f f3189a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        private final ResponseBody f3190a;
        private final BufferedSource b;

        public a(ResponseBody responseBody, InputStream inputStream) {
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final String f3191a;
        private final Request b;
        private h c;

        public b(String str, Request request, h hVar) {
        }

        @Override // com.efs.sdk.net.a.a.f.b
        public final String a() {
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String b() {
        }

        @Override // com.efs.sdk.net.a.a.f.a
        public final String c() {
        }

        @Override // com.efs.sdk.net.a.a.f.a
        @Nullable
        public final byte[] d() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c implements f.c {

        /* renamed from: a  reason: collision with root package name */
        private final String f3192a;
        private final Request b;
        private final Response c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        private final Connection f3193d;

        public c(String str, Request request, Response response, @Nullable Connection connection) {
        }

        @Override // com.efs.sdk.net.a.a.f.d
        public final String a() {
        }

        @Override // com.efs.sdk.net.a.a.f.d
        public final int b() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
    }
}
