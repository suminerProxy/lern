package h.y.a.m;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import h.y.a.m.r.d.a;
import h.y.a.n.i0;
import h.y.a.n.v0;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: HttpUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class m {

    /* renamed from: a */
    private static OkHttpClient f26249a;
    private static OkHttpClient.Builder b;

    /* compiled from: HttpUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements h.y.a.m.s.b {

        /* renamed from: a */
        private int f26250a = -1;
        public final /* synthetic */ h.y.a.m.s.a b;

        public a(h.y.a.m.s.a aVar) {
            this.b = aVar;
        }

        @Override // h.y.a.m.s.b
        public void a(long j2, long j3, boolean z) {
            int i2;
            if (this.b == null || j3 <= 0 || this.f26250a == (i2 = (int) ((j2 * 100) / j3))) {
                return;
            }
            this.f26250a = i2;
            i0.b("图片下载进度", String.valueOf(i2));
            this.b.onProgress(this.f26250a);
        }
    }

    /* compiled from: HttpUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b implements Callback {

        /* renamed from: a */
        public final /* synthetic */ File f26251a;
        public final /* synthetic */ h.y.a.m.s.a b;

        public b(File file, h.y.a.m.s.a aVar) {
            this.f26251a = file;
            this.b = aVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            h.y.a.m.s.a aVar = this.b;
            if (aVar != null) {
                aVar.onFailure("Fail");
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            if (response != null) {
                try {
                    if (response.body() != null) {
                        byte[] bytes = response.body().bytes();
                        if (!this.f26251a.exists()) {
                            this.f26251a.createNewFile();
                        }
                        h.x.e.e.o.n(bytes, this.f26251a);
                        h.y.a.m.s.a aVar = this.b;
                        if (aVar != null) {
                            aVar.onResponse(this.f26251a.getAbsolutePath());
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, String str, File file, h.y.a.m.s.a aVar) {
        if (TextUtils.isEmpty(str) && aVar != null) {
            aVar.onFailure("文件地址有误");
        }
        if (str.contains("file://")) {
            if (aVar != null) {
                aVar.onResponse(str);
                return;
            }
            return;
        }
        d(context);
        Request build = b(context, new Request.Builder().url(str)).build();
        final a aVar2 = new a(aVar);
        b.networkInterceptors().add(new Interceptor() { // from class: h.y.a.m.e
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return m.g(h.y.a.m.s.b.this, chain);
            }
        });
        f26249a.newCall(build).enqueue(new b(file, aVar));
    }

    private static Request.Builder b(Context context, Request.Builder builder) {
        try {
            return builder.removeHeader("User-Agent").addHeader("User-Agent", e(context));
        } catch (Exception e2) {
            e2.printStackTrace();
            return builder;
        }
    }

    public static void c(Context context, String str, k kVar) {
        d(context).newCall(b(context, new Request.Builder().url(str).get()).build()).enqueue(kVar);
    }

    public static OkHttpClient d(Context context) {
        OkHttpClient build;
        OkHttpClient okHttpClient = f26249a;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        synchronized (m.class) {
            if (b == null) {
                b = f(context);
            }
            build = b.build();
            f26249a = build;
        }
        return build;
    }

    private static String e(Context context) {
        String property;
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            property = System.getProperty("http.agent");
        }
        StringBuilder sb = new StringBuilder();
        int length = property.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = property.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private static OkHttpClient.Builder f(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (h.y.a.f.k.s) {
            builder.connectTimeout(180L, TimeUnit.SECONDS);
        } else {
            builder.connectTimeout(10L, TimeUnit.SECONDS);
        }
        if (!v0.g()) {
            builder.proxy(Proxy.NO_PROXY);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.readTimeout(10L, timeUnit);
        builder.writeTimeout(10L, timeUnit);
        builder.retryOnConnectionFailure(true);
        builder.cookieJar(new h.y.a.m.r.b(new h.y.a.m.r.c.c(), new h.y.a.m.r.e.c(context)));
        builder.hostnameVerifier(new HostnameVerifier() { // from class: h.y.a.m.f
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return m.h(str, sSLSession);
            }
        });
        builder.addInterceptor(new h.y.a.m.t.a());
        if (h.y.a.f.k.s) {
            builder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
        }
        a.b c = h.y.a.m.r.d.a.c(null, null, null);
        builder.sslSocketFactory(c.f26260a, c.b);
        return builder;
    }

    public static /* synthetic */ Response g(h.y.a.m.s.b bVar, Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        return proceed.newBuilder().body(new h.y.a.m.s.c(proceed.body(), bVar)).build();
    }

    public static /* synthetic */ boolean h(String str, SSLSession sSLSession) {
        return true;
    }

    public static void i(Context context, String str, Map<String, String> map, String str2, k kVar) {
        if (TextUtils.isEmpty(str2)) {
            if (kVar != null) {
                kVar.onFailure(null, null);
                return;
            }
            return;
        }
        Request.Builder post = new Request.Builder().url(str).post(RequestBody.Companion.create(str2, MediaType.Companion.parse("application/json;charset=UTF-8")));
        if (map != null && !map.isEmpty()) {
            for (String str3 : map.keySet()) {
                String str4 = map.get(str3);
                if (str4 != null) {
                    post.header(str3, str4);
                }
            }
        }
        try {
            d(context).newCall(b(context, post).build()).enqueue(kVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            kVar.onFailure(null, null);
        }
    }

    public static void j(Context context, String str, MultipartBody.Builder builder, k kVar) {
        try {
            d(context).newCall(b(context, new Request.Builder().url(str).post(builder.build())).build()).enqueue(kVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void k() {
        f26249a = null;
        b = null;
    }
}
