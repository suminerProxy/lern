package h.y.a.m;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import h.y.a.m.r.d.a;
import h.y.a.n.v0;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: HttpHotelUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static OkHttpClient f26248a;
    private static OkHttpClient.Builder b;

    private static Request.Builder a(Context context, Request.Builder builder) {
        try {
            return builder.removeHeader("User-Agent").addHeader("User-Agent", d(context));
        } catch (Exception e2) {
            e2.printStackTrace();
            return builder;
        }
    }

    public static void b(Context context, String str, Headers headers, String str2, k kVar) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "?" + str2;
        }
        c(context).newCall(a(context, new Request.Builder().url(str).headers(headers).get()).build()).enqueue(kVar);
    }

    public static OkHttpClient c(Context context) {
        OkHttpClient build;
        OkHttpClient okHttpClient = f26248a;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        synchronized (l.class) {
            if (b == null) {
                b = e(context);
            }
            build = b.build();
            f26248a = build;
        }
        return build;
    }

    private static String d(Context context) {
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

    private static OkHttpClient.Builder e(Context context) {
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
        builder.hostnameVerifier(d.f26240a);
        if (h.y.a.f.k.s) {
            builder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
        }
        a.b c = h.y.a.m.r.d.a.c(null, null, null);
        builder.sslSocketFactory(c.f26260a, c.b);
        return builder;
    }

    public static /* synthetic */ boolean f(String str, SSLSession sSLSession) {
        return true;
    }

    public static void g(Context context, String str, Headers headers, String str2, h.y.a.m.u.a aVar, k kVar) {
        MediaType parse;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (aVar == h.y.a.m.u.a.REQUEST_QUERY) {
            parse = MediaType.Companion.parse("application/x-www-form-urlencoded;charset=UTF-8");
        } else {
            parse = MediaType.Companion.parse("application/json;charset=UTF-8");
        }
        try {
            c(context).newCall(a(context, new Request.Builder().url(str).headers(headers).post(RequestBody.Companion.create(str2, parse))).build()).enqueue(kVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            kVar.onFailure(null, null);
        }
    }

    public static void h() {
        f26248a = null;
        b = null;
    }
}
