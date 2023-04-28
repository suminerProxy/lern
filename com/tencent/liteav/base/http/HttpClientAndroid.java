package com.tencent.liteav.base.http;

import android.os.Handler;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class HttpClientAndroid {
    private static final int ERROR_CODE_INVALID_REQUEST = 0;
    private static final String HTTPS_PREFIX = "https://";
    private static final String HTTP_PREFIX = "http://";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    private static final int READ_STREAM_SIZE = 1388;
    private static final String TAG = "HttpClientAndroid";
    private HttpURLConnection mConnection;
    private final b mHttpConfig;
    private final Handler mHttpHandler;
    private volatile c mInternalState;
    private String mLastRequestURL;
    private final Object mLocker;
    private long mNativeHttpClientAndroidJni;
    private final ConcurrentHashMap<Long, d> mRunningRequestMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a extends Authenticator {

        /* renamed from: a  reason: collision with root package name */
        public String f11424a;
        public String b;

        public a(String str, String str2) {
        }

        @Override // java.net.Authenticator
        public final PasswordAuthentication getPasswordAuthentication() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11425a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f11426d;

        /* renamed from: e  reason: collision with root package name */
        public int f11427e;

        /* renamed from: f  reason: collision with root package name */
        public String f11428f;

        /* renamed from: g  reason: collision with root package name */
        public String f11429g;

        /* renamed from: h  reason: collision with root package name */
        public String f11430h;

        public b(int i2, int i3, int i4, boolean z, int i5, String str, String str2, String str3) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11431a = null;
        public static final c b = null;
        public static final c c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ c[] f11432d = null;

        private c(String str, int i2) {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public long f11433a;
        public String b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f11434d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f11435e;

        public d(String str, String str2, byte[] bArr, Map<String, String> map) {
        }

        public final boolean a() {
        }

        public final boolean b() {
        }

        public final String c() {
        }

        public final String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public g f11436a;
        public String b;
        public ByteBuffer c;

        /* renamed from: d  reason: collision with root package name */
        public int f11437d;

        /* renamed from: e  reason: collision with root package name */
        public String f11438e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f11439f;

        /* renamed from: g  reason: collision with root package name */
        public int f11440g;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f11441a = null;
        public static final f b = null;
        public static final f c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ f[] f11442d = null;
        public int nativeValue;

        private f(String str, int i2, int i3) {
        }

        public static f valueOf(String str) {
        }

        public static f[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f11443a = null;
        public static final g b = null;
        public static final g c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final g f11444d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final g f11445e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final g f11446f = null;

        /* renamed from: g  reason: collision with root package name */
        public static final g f11447g = null;

        /* renamed from: h  reason: collision with root package name */
        public static final g f11448h = null;

        /* renamed from: i  reason: collision with root package name */
        public static final g f11449i = null;

        /* renamed from: j  reason: collision with root package name */
        public static final g f11450j = null;

        /* renamed from: k  reason: collision with root package name */
        public static final g f11451k = null;

        /* renamed from: l  reason: collision with root package name */
        public static final g f11452l = null;

        /* renamed from: m  reason: collision with root package name */
        public static final g f11453m = null;

        /* renamed from: n  reason: collision with root package name */
        public static final g f11454n = null;

        /* renamed from: o  reason: collision with root package name */
        public static final g f11455o = null;

        /* renamed from: p  reason: collision with root package name */
        public static final g f11456p = null;
        public static final g q = null;
        public static final g r = null;
        private static final /* synthetic */ g[] s = null;
        public final int nativeValue;

        private g(String str, int i2, int i3) {
        }

        public static g valueOf(String str) {
        }

        public static g[] values() {
        }
    }

    @CalledByNative
    public HttpClientAndroid(int i2, int i3, int i4, boolean z, int i5, String str, String str2, String str3, long j2) {
    }

    private boolean checkNativeValid() {
    }

    private boolean checkRequestValid(long j2) {
    }

    private void closeConnectionSafely(HttpURLConnection httpURLConnection) {
    }

    private HttpURLConnection createConnection(d dVar) throws Exception {
    }

    private void doCleanById(long j2) {
    }

    private void doOnCallback(f fVar, long j2, e eVar) {
    }

    private void doReadData(long j2, e eVar) {
    }

    private void doRequest(d dVar) {
    }

    @CalledByNative
    public static HashMap getJavaHashMap(String[] strArr, String[] strArr2) {
    }

    @CalledByNative
    public static String[] getMapKeys(Map<String, String> map) {
    }

    @CalledByNative
    public static String[] getMapValue(Map<String, String> map, String[] strArr) {
    }

    private Map<String, String> getResponseHeaders(Map<String, List<String>> map) {
    }

    private g getStatusCode(int i2) {
    }

    public static /* synthetic */ void lambda$cancelAll$1(HttpClientAndroid httpClientAndroid) {
    }

    public static /* synthetic */ void lambda$destroy$2(HttpClientAndroid httpClientAndroid) {
    }

    public static /* synthetic */ void lambda$doReadData$3(HttpClientAndroid httpClientAndroid, e eVar, long j2) {
    }

    public static /* synthetic */ void lambda$send$0(HttpClientAndroid httpClientAndroid, d dVar) {
    }

    private static native void nativeOnCallback(long j2, boolean z, int i2, long j3, int i3, String str, int i4, ByteBuffer byteBuffer, String str2, Map map, int i5);

    private String parseHostAddress(String str) {
    }

    @CalledByNative
    public void cancel(long j2) {
    }

    @CalledByNative
    public void cancelAll() {
    }

    @CalledByNative
    public void destroy() {
    }

    @CalledByNative
    public long send(long j2, String str, String str2, byte[] bArr, Map<String, String> map, boolean z) {
    }

    private g getStatusCode(Exception exc) {
    }
}
