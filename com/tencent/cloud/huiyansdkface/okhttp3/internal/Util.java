package com.tencent.cloud.huiyansdkface.okhttp3.internal;

import com.tencent.cloud.huiyansdkface.okhttp3.Headers;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.RequestBody;
import com.tencent.cloud.huiyansdkface.okhttp3.ResponseBody;
import com.tencent.cloud.huiyansdkface.okhttp3.internal.http2.Header;
import com.tencent.cloud.huiyansdkface.okio.BufferedSource;
import com.tencent.cloud.huiyansdkface.okio.ByteString;
import com.tencent.cloud.huiyansdkface.okio.Source;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Util {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f10820a = null;
    public static final ResponseBody b = null;
    public static final RequestBody c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f10821d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f10822e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final TimeZone f10823f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final Comparator<String> f10824g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final ByteString f10825h = null;

    /* renamed from: i  reason: collision with root package name */
    private static final ByteString f10826i = null;

    /* renamed from: j  reason: collision with root package name */
    private static final ByteString f10827j = null;

    /* renamed from: k  reason: collision with root package name */
    private static final ByteString f10828k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final ByteString f10829l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final Charset f10830m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final Charset f10831n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final Charset f10832o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final Charset f10833p = null;
    private static final Method q = null;
    private static final Pattern r = null;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.Util$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements Comparator<String> {
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public final int compare2(String str, String str2) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.Util$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass2 implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f10834a;
        private /* synthetic */ boolean b;

        public AnonymousClass2(String str, boolean z) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
        }
    }

    private Util() {
    }

    private static InetAddress a(String str, int i2, int i3) {
    }

    private static boolean a(String str) {
    }

    public static void addSuppressedIfPossible(Throwable th, Throwable th2) {
    }

    public static AssertionError assertionError(String str, Exception exc) {
    }

    public static Charset bomAwareCharset(BufferedSource bufferedSource, Charset charset) throws IOException {
    }

    public static String canonicalizeHost(String str) {
    }

    public static int checkDuration(String str, long j2, TimeUnit timeUnit) {
    }

    public static void checkOffsetAndCount(long j2, long j3, long j4) {
    }

    public static void closeQuietly(Closeable closeable) {
    }

    public static void closeQuietly(ServerSocket serverSocket) {
    }

    public static void closeQuietly(Socket socket) {
    }

    public static String[] concat(String[] strArr, String str) {
    }

    public static int decodeHexDigit(char c2) {
    }

    public static int delimiterOffset(String str, int i2, int i3, char c2) {
    }

    public static int delimiterOffset(String str, int i2, int i3, String str2) {
    }

    public static boolean discard(Source source, int i2, TimeUnit timeUnit) {
    }

    public static boolean equal(Object obj, Object obj2) {
    }

    public static String format(String str, Object... objArr) {
    }

    public static String hostHeader(HttpUrl httpUrl, boolean z) {
    }

    public static <T> List<T> immutableList(List<T> list) {
    }

    public static <T> List<T> immutableList(T... tArr) {
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
    }

    public static int indexOf(Comparator<String> comparator, String[] strArr, String str) {
    }

    public static int indexOfControlOrNonAscii(String str) {
    }

    public static String[] intersect(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
    }

    public static boolean nonEmptyIntersection(Comparator<String> comparator, String[] strArr, String[] strArr2) {
    }

    public static X509TrustManager platformTrustManager() {
    }

    public static boolean skipAll(Source source, int i2, TimeUnit timeUnit) throws IOException {
    }

    public static int skipLeadingAsciiWhitespace(String str, int i2, int i3) {
    }

    public static int skipTrailingAsciiWhitespace(String str, int i2, int i3) {
    }

    public static ThreadFactory threadFactory(String str, boolean z) {
    }

    public static Headers toHeaders(List<Header> list) {
    }

    public static String trimSubstring(String str, int i2, int i3) {
    }

    public static boolean verifyAsIpAddress(String str) {
    }
}
