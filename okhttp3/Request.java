package okhttp3;

import androidx.exifinterface.media.ExifInterface;
import cn.sharesdk.framework.InnerShareParams;
import com.alipay.sdk.packet.e;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sobot.network.http.SobotOkHttpUtils;
import com.sobot.network.http.model.SobotProgress;
import h.a.a.a.a.i.g;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Request.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00015BC\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0019\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c\u0012\u0016\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0004\b3\u00104J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f¢\u0006\u0004\b\t\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0007\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010\u0017R\u0019\u0010\u0015\u001a\u00020\u00128\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0007@\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b\u001f\u0010\u001eR,\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00010)8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0013\u0010/\u001a\u00020.8F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100R\u0019\u0010\u0007\u001a\u00020\u00198\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010#\u001a\u00020 8G@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0019\u0010\u0018\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b\u0018\u0010\u0017¨\u00066"}, d2 = {"Lokhttp3/Request;", "", "", "name", "header", "(Ljava/lang/String;)Ljava/lang/String;", "", "headers", "(Ljava/lang/String;)Ljava/util/List;", SobotProgress.TAG, "()Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/Request$Builder;", "newBuilder", "()Lokhttp3/Request$Builder;", "Lokhttp3/HttpUrl;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "url", "-deprecated_method", "()Ljava/lang/String;", e.q, "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "-deprecated_body", "()Lokhttp3/RequestBody;", TtmlNode.TAG_BODY, "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "toString", "Lokhttp3/HttpUrl;", "lazyCacheControl", "Lokhttp3/CacheControl;", "Lokhttp3/RequestBody;", "", InnerShareParams.TAGS, "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "", "isHttps", "()Z", "Lokhttp3/Headers;", "Ljava/lang/String;", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class Request {
    @Nullable
    private final RequestBody body;
    @NotNull
    private final Headers headers;
    private CacheControl lazyCacheControl;
    @NotNull
    private final String method;
    @NotNull
    private final Map<Class<?>, Object> tags;
    @NotNull
    private final HttpUrl url;

    /* compiled from: Request.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bF\u0010GB\u0011\b\u0010\u0012\u0006\u0010H\u001a\u00020'¢\u0006\u0004\bF\u0010IJ\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0003\u0010\u0006J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0003\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b!\u0010\"J/\u0010!\u001a\u00020\u0000\"\u0004\b\u0000\u0010#2\u000e\u0010%\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000$2\b\u0010!\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b!\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u001f\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0010\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R2\u0010@\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030$\u0012\u0004\u0012\u00020\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006J"}, d2 = {"Lokhttp3/Request$Builder;", "", "Lokhttp3/HttpUrl;", "url", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", TtmlNode.TAG_HEAD, "Lokhttp3/RequestBody;", TtmlNode.TAG_BODY, "post", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", g.f15697i, "put", "patch", e.q, "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", SobotProgress.TAG, "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lokhttp3/Request;", "build", "()Lokhttp3/Request;", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "", InnerShareParams.TAGS, "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "<init>", "()V", SobotProgress.REQUEST, "(Lokhttp3/Request;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Builder {
        @Nullable
        private RequestBody body;
        @NotNull
        private Headers.Builder headers;
        @NotNull
        private String method;
        @NotNull
        private Map<Class<?>, Object> tags;
        @Nullable
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        @NotNull
        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            this.headers.add(str, str2);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", cacheControl2);
        }

        @JvmOverloads
        @NotNull
        public Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @JvmOverloads
        @NotNull
        public Builder delete(@Nullable RequestBody requestBody) {
            return method(SobotOkHttpUtils.METHOD.DELETE, requestBody);
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @NotNull
        public final String getMethod$okhttp() {
            return this.method;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @NotNull
        public Builder head() {
            return method(SobotOkHttpUtils.METHOD.HEAD, null);
        }

        @NotNull
        public Builder header(@NotNull String str, @NotNull String str2) {
            this.headers.set(str, str2);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        @NotNull
        public Builder method(@NotNull String str, @Nullable RequestBody requestBody) {
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.method = str;
                this.body = requestBody;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @NotNull
        public Builder patch(@NotNull RequestBody requestBody) {
            return method(SobotOkHttpUtils.METHOD.PATCH, requestBody);
        }

        @NotNull
        public Builder post(@NotNull RequestBody requestBody) {
            return method("POST", requestBody);
        }

        @NotNull
        public Builder put(@NotNull RequestBody requestBody) {
            return method(SobotOkHttpUtils.METHOD.PUT, requestBody);
        }

        @NotNull
        public Builder removeHeader(@NotNull String str) {
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<Class<?>, Object> map) {
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public Builder tag(@Nullable Object obj) {
            return tag(Object.class, obj);
        }

        @NotNull
        public Builder url(@NotNull HttpUrl httpUrl) {
            this.url = httpUrl;
            return this;
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> cls, @Nullable T t) {
            if (t == null) {
                this.tags.remove(cls);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T cast = cls.cast(t);
                if (cast == null) {
                    Intrinsics.throwNpe();
                }
                map.put(cls, cast);
            }
            return this;
        }

        @NotNull
        public Builder url(@NotNull String str) {
            if (StringsKt__StringsJVMKt.startsWith(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (StringsKt__StringsJVMKt.startsWith(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(@NotNull Request request) {
            Map<Class<?>, Object> mutableMap;
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt__MapsKt.toMutableMap(request.getTags$okhttp());
            }
            this.tags = mutableMap;
            this.headers = request.headers().newBuilder();
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            Intrinsics.checkExpressionValueIsNotNull(url2, "url.toString()");
            return url(companion.get(url2));
        }
    }

    public Request(@NotNull HttpUrl httpUrl, @NotNull String str, @NotNull Headers headers, @Nullable RequestBody requestBody, @NotNull Map<Class<?>, ? extends Object> map) {
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = TtmlNode.TAG_BODY, imports = {}))
    @JvmName(name = "-deprecated_body")
    @Nullable
    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m1587deprecated_body() {
        return this.body;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @JvmName(name = "-deprecated_cacheControl")
    @NotNull
    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m1588deprecated_cacheControl() {
        return cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @JvmName(name = "-deprecated_headers")
    @NotNull
    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m1589deprecated_headers() {
        return this.headers;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = e.q, imports = {}))
    @JvmName(name = "-deprecated_method")
    @NotNull
    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m1590deprecated_method() {
        return this.method;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m1591deprecated_url() {
        return this.url;
    }

    @JvmName(name = TtmlNode.TAG_BODY)
    @Nullable
    public final RequestBody body() {
        return this.body;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    @NotNull
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String str) {
        return this.headers.get(str);
    }

    @JvmName(name = "headers")
    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @JvmName(name = e.q)
    @NotNull
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return tag(Object.class);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i2 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(component1);
                sb.append(':');
                sb.append(component2);
                i2 = i3;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @JvmName(name = "url")
    @NotNull
    public final HttpUrl url() {
        return this.url;
    }

    @NotNull
    public final List<String> headers(@NotNull String str) {
        return this.headers.values(str);
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> cls) {
        return cls.cast(this.tags.get(cls));
    }
}
