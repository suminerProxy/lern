package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Response implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Request f10787a;
    public final Protocol b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10788d;

    /* renamed from: e  reason: collision with root package name */
    public final Handshake f10789e;

    /* renamed from: f  reason: collision with root package name */
    public final Headers f10790f;

    /* renamed from: g  reason: collision with root package name */
    public final ResponseBody f10791g;

    /* renamed from: h  reason: collision with root package name */
    public final Response f10792h;

    /* renamed from: i  reason: collision with root package name */
    public final Response f10793i;

    /* renamed from: j  reason: collision with root package name */
    public final Response f10794j;

    /* renamed from: k  reason: collision with root package name */
    public final long f10795k;

    /* renamed from: l  reason: collision with root package name */
    public final long f10796l;

    /* renamed from: m  reason: collision with root package name */
    private volatile CacheControl f10797m;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Request f10798a;
        public Protocol b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public String f10799d;

        /* renamed from: e  reason: collision with root package name */
        public Handshake f10800e;

        /* renamed from: f  reason: collision with root package name */
        public Headers.Builder f10801f;

        /* renamed from: g  reason: collision with root package name */
        public ResponseBody f10802g;

        /* renamed from: h  reason: collision with root package name */
        public Response f10803h;

        /* renamed from: i  reason: collision with root package name */
        public Response f10804i;

        /* renamed from: j  reason: collision with root package name */
        public Response f10805j;

        /* renamed from: k  reason: collision with root package name */
        public long f10806k;

        /* renamed from: l  reason: collision with root package name */
        public long f10807l;

        public Builder() {
        }

        public Builder(Response response) {
        }

        private static void a(String str, Response response) {
        }

        public Builder addHeader(String str, String str2) {
        }

        public Builder body(ResponseBody responseBody) {
        }

        public Response build() {
        }

        public Builder cacheResponse(Response response) {
        }

        public Builder code(int i2) {
        }

        public Builder handshake(Handshake handshake) {
        }

        public Builder header(String str, String str2) {
        }

        public Builder headers(Headers headers) {
        }

        public Builder message(String str) {
        }

        public Builder networkResponse(Response response) {
        }

        public Builder priorResponse(Response response) {
        }

        public Builder protocol(Protocol protocol) {
        }

        public Builder receivedResponseAtMillis(long j2) {
        }

        public Builder removeHeader(String str) {
        }

        public Builder request(Request request) {
        }

        public Builder sentRequestAtMillis(long j2) {
        }
    }

    public Response(Builder builder) {
    }

    public final ResponseBody body() {
    }

    public final CacheControl cacheControl() {
    }

    public final Response cacheResponse() {
    }

    public final List<Challenge> challenges() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final int code() {
    }

    public final Handshake handshake() {
    }

    public final String header(String str) {
    }

    public final String header(String str, String str2) {
    }

    public final Headers headers() {
    }

    public final List<String> headers(String str) {
    }

    public final boolean isRedirect() {
    }

    public final boolean isSuccessful() {
    }

    public final String message() {
    }

    public final Response networkResponse() {
    }

    public final Builder newBuilder() {
    }

    public final ResponseBody peekBody(long j2) throws IOException {
    }

    public final Response priorResponse() {
    }

    public final Protocol protocol() {
    }

    public final long receivedResponseAtMillis() {
    }

    public final Request request() {
    }

    public final long sentRequestAtMillis() {
    }

    public final String toString() {
    }
}
