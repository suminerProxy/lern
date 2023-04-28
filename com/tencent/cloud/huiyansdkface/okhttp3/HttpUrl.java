package com.tencent.cloud.huiyansdkface.okhttp3;

import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class HttpUrl {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f10698d = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f10699a;
    public final String b;
    public final int c;

    /* renamed from: e  reason: collision with root package name */
    private final String f10700e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10701f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f10702g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f10703h;

    /* renamed from: i  reason: collision with root package name */
    private final String f10704i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10705j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f10706a;
        public String b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f10707d;

        /* renamed from: e  reason: collision with root package name */
        public int f10708e;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f10709f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f10710g;

        /* renamed from: h  reason: collision with root package name */
        public String f10711h;

        private Builder a(String str, boolean z) {
        }

        private void a(String str) {
        }

        private void a(String str, int i2, int i3) {
        }

        private void a(String str, int i2, int i3, boolean z, boolean z2) {
        }

        private static int b(String str, int i2, int i3) {
        }

        private static boolean b(String str) {
        }

        private static int c(String str, int i2, int i3) {
        }

        private static boolean c(String str) {
        }

        private static String d(String str, int i2, int i3) {
        }

        private static int e(String str, int i2, int i3) {
        }

        public final int a() {
        }

        public final Builder a(HttpUrl httpUrl, String str) {
        }

        public final Builder addEncodedPathSegment(String str) {
        }

        public final Builder addEncodedPathSegments(String str) {
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
        }

        public final Builder addPathSegment(String str) {
        }

        public final Builder addPathSegments(String str) {
        }

        public final Builder addQueryParameter(String str, String str2) {
        }

        public final HttpUrl build() {
        }

        public final Builder encodedFragment(String str) {
        }

        public final Builder encodedPassword(String str) {
        }

        public final Builder encodedPath(String str) {
        }

        public final Builder encodedQuery(String str) {
        }

        public final Builder encodedUsername(String str) {
        }

        public final Builder fragment(String str) {
        }

        public final Builder host(String str) {
        }

        public final Builder password(String str) {
        }

        public final Builder port(int i2) {
        }

        public final Builder query(String str) {
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
        }

        public final Builder removeAllQueryParameters(String str) {
        }

        public final Builder removePathSegment(int i2) {
        }

        public final Builder scheme(String str) {
        }

        public final Builder setEncodedPathSegment(int i2, String str) {
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
        }

        public final Builder setPathSegment(int i2, String str) {
        }

        public final Builder setQueryParameter(String str, String str2) {
        }

        public final String toString() {
        }

        public final Builder username(String str) {
        }
    }

    public HttpUrl(Builder builder) {
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
    }

    public static String a(String str, int i2, int i3, boolean z) {
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
    }

    public static String a(String str, boolean z) {
    }

    public static List<String> a(String str) {
    }

    private static List<String> a(List<String> list, boolean z) {
    }

    public static void a(StringBuilder sb, List<String> list) {
    }

    private static boolean a(String str, int i2, int i3) {
    }

    public static void b(StringBuilder sb, List<String> list) {
    }

    public static int defaultPort(String str) {
    }

    public static HttpUrl get(String str) {
    }

    public static HttpUrl get(URI uri) {
    }

    public static HttpUrl get(URL url) {
    }

    public static HttpUrl parse(String str) {
    }

    public final String encodedFragment() {
    }

    public final String encodedPassword() {
    }

    public final String encodedPath() {
    }

    public final List<String> encodedPathSegments() {
    }

    public final String encodedQuery() {
    }

    public final String encodedUsername() {
    }

    public final boolean equals(Object obj) {
    }

    public final String fragment() {
    }

    public final int hashCode() {
    }

    public final String host() {
    }

    public final boolean isHttps() {
    }

    public final Builder newBuilder() {
    }

    public final Builder newBuilder(String str) {
    }

    public final String password() {
    }

    public final List<String> pathSegments() {
    }

    public final int pathSize() {
    }

    public final int port() {
    }

    public final String query() {
    }

    public final String queryParameter(String str) {
    }

    public final String queryParameterName(int i2) {
    }

    public final Set<String> queryParameterNames() {
    }

    public final String queryParameterValue(int i2) {
    }

    public final List<String> queryParameterValues(String str) {
    }

    public final int querySize() {
    }

    public final String redact() {
    }

    public final HttpUrl resolve(String str) {
    }

    public final String scheme() {
    }

    public final String toString() {
    }

    public final URI uri() {
    }

    public final URL url() {
    }

    public final String username() {
    }
}
