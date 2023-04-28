package com.tencent.cloud.huiyansdkface.okhttp3.internal.http;

import com.tencent.cloud.huiyansdkface.okhttp3.Challenge;
import com.tencent.cloud.huiyansdkface.okhttp3.CookieJar;
import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.Request;
import com.tencent.cloud.huiyansdkface.okhttp3.Response;
import com.tencent.cloud.huiyansdkface.okio.Buffer;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import java.util.List;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class HttpHeaders {

    /* renamed from: a  reason: collision with root package name */
    private static final ByteString f10936a = null;
    private static final ByteString b = null;

    private HttpHeaders() {
    }

    private static int a(Buffer buffer, byte b2) {
    }

    private static long a(String str) {
    }

    private static void a(List<Challenge> list, Buffer buffer) {
    }

    private static boolean a(Buffer buffer) {
    }

    private static String b(Buffer buffer) {
    }

    private static String c(Buffer buffer) {
    }

    public static long contentLength(Headers headers) {
    }

    public static long contentLength(Response response) {
    }

    public static boolean hasBody(Response response) {
    }

    public static boolean hasVaryAll(Headers headers) {
    }

    public static boolean hasVaryAll(Response response) {
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
    }

    public static int parseSeconds(String str, int i2) {
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
    }

    public static int skipUntil(String str, int i2, String str2) {
    }

    public static int skipWhitespace(String str, int i2) {
    }

    public static Set<String> varyFields(Headers headers) {
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
    }

    public static Headers varyHeaders(Response response) {
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
    }
}
