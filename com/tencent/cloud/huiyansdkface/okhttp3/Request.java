package com.tencent.cloud.huiyansdkface.okhttp3;

import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Request {

    /* renamed from: a  reason: collision with root package name */
    public final HttpUrl f10776a;
    public final String b;
    public final Headers c;

    /* renamed from: d  reason: collision with root package name */
    public final RequestBody f10777d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f10778e;

    /* renamed from: f  reason: collision with root package name */
    private volatile CacheControl f10779f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public HttpUrl f10780a;
        public String b;
        public Headers.Builder c;

        /* renamed from: d  reason: collision with root package name */
        public RequestBody f10781d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f10782e;

        public Builder() {
        }

        public Builder(Request request) {
        }

        public Builder addHeader(String str, String str2) {
        }

        public Request build() {
        }

        public Builder cacheControl(CacheControl cacheControl) {
        }

        public Builder delete() {
        }

        public Builder delete(RequestBody requestBody) {
        }

        public Builder get() {
        }

        public Builder head() {
        }

        public Builder header(String str, String str2) {
        }

        public Builder headers(Headers headers) {
        }

        public Builder method(String str, RequestBody requestBody) {
        }

        public Builder patch(RequestBody requestBody) {
        }

        public Builder post(RequestBody requestBody) {
        }

        public Builder put(RequestBody requestBody) {
        }

        public Builder removeHeader(String str) {
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
        }

        public Builder tag(Object obj) {
        }

        public Object tag() {
        }

        public Builder url(HttpUrl httpUrl) {
        }

        public Builder url(String str) {
        }

        public Builder url(URL url) {
        }
    }

    public Request(Builder builder) {
    }

    public final RequestBody body() {
    }

    public final CacheControl cacheControl() {
    }

    public final String header(String str) {
    }

    public final Headers headers() {
    }

    public final List<String> headers(String str) {
    }

    public final boolean isHttps() {
    }

    public final String method() {
    }

    public final Builder newBuilder() {
    }

    public final Object tag() {
    }

    public final <T> T tag(Class<? extends T> cls) {
    }

    public final String toString() {
    }

    public final HttpUrl url() {
    }
}
