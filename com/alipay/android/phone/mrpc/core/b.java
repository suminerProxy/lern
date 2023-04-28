package com.alipay.android.phone.mrpc.core;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class b implements HttpClient {

    /* renamed from: a  reason: collision with root package name */
    public static long f500a = 160;
    private static String[] b;
    private static final HttpRequestInterceptor c = null;

    /* renamed from: d  reason: collision with root package name */
    private final HttpClient f501d;

    /* renamed from: e  reason: collision with root package name */
    private RuntimeException f502e;

    /* renamed from: f  reason: collision with root package name */
    private volatile C0018b f503f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements HttpRequestInterceptor {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f504a;

        private a(b bVar) {
        }

        public /* synthetic */ a(b bVar, byte b) {
        }

        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        }
    }

    /* renamed from: com.alipay.android.phone.mrpc.core.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class C0018b {

        /* renamed from: a  reason: collision with root package name */
        private final String f505a;
        private final int b;

        public static /* synthetic */ void a(C0018b c0018b, String str) {
        }

        public static /* synthetic */ boolean a(C0018b c0018b) {
        }
    }

    private b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
    }

    public static /* synthetic */ C0018b a(b bVar) {
    }

    public static b a(String str) {
    }

    public static InputStream a(HttpEntity httpEntity) {
    }

    public static /* synthetic */ String a(HttpUriRequest httpUriRequest) {
    }

    public static /* synthetic */ HttpRequestInterceptor a() {
    }

    public static AbstractHttpEntity a(byte[] bArr) {
    }

    public static void a(HttpRequest httpRequest) {
    }

    public static long b(String str) {
    }

    public static void b(HttpRequest httpRequest) {
    }

    private static boolean b(HttpUriRequest httpUriRequest) {
    }

    public final void a(HttpRequestRetryHandler httpRequestRetryHandler) {
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
    }

    public final ClientConnectionManager getConnectionManager() {
    }

    public final HttpParams getParams() {
    }
}
