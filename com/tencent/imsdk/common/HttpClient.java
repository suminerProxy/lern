package com.tencent.imsdk.common;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class HttpClient {
    private static final int CORE_POOL_SIZE = 0;
    private static final int CPU_COUNT = 0;
    public static final int HTTP_ACTION_REQUEST = 0;
    public static final int HTTP_ACTION_RESPONSE = 1;
    private static final long KEEP_ALIVE = 5;
    private static final int MAX_POOL_SIZE = 0;
    private static final int PROXY_TYPE_HTTP = 1;
    private static final int PROXY_TYPE_SOCKS5 = 2;
    private static final String TAG = "HttpClient";
    private static boolean mNeedRollbackHttps2Http;
    private static String mRollbackHttps2Http;
    private static final Executor mThreadPoolExecutor = null;

    /* renamed from: com.tencent.imsdk.common.HttpClient$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int val$connectTimeout;
        public final /* synthetic */ byte[] val$content;
        public final /* synthetic */ String val$downloadFile;
        public final /* synthetic */ Map val$headers;
        public final /* synthetic */ HttpRequestListener val$listener;
        public final /* synthetic */ String val$method;
        public final /* synthetic */ String val$proxyHost;
        public final /* synthetic */ String val$proxyPassword;
        public final /* synthetic */ int val$proxyPort;
        public final /* synthetic */ int val$proxyType;
        public final /* synthetic */ String val$proxyUserName;
        public final /* synthetic */ int val$recvTimeout;
        public final /* synthetic */ String val$rollbackHttps2Http;
        public final /* synthetic */ String val$uploadFile;
        public final /* synthetic */ String val$url;
        public final /* synthetic */ Boolean val$use_origin_ip;

        /* renamed from: com.tencent.imsdk.common.HttpClient$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C01791 implements HostnameVerifier {
            public final /* synthetic */ AnonymousClass1 this$0;
            public final /* synthetic */ HttpsURLConnection val$httpsConn;

            public C01791(AnonymousClass1 anonymousClass1, HttpsURLConnection httpsURLConnection) {
            }

            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
            }
        }

        public AnonymousClass1(String str, String str2, int i2, String str3, int i3, String str4, String str5, String str6, int i4, int i5, Map map, Boolean bool, byte[] bArr, String str7, HttpRequestListener httpRequestListener, String str8) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.imsdk.common.HttpClient$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass2 implements HttpRequestListener {
        public final /* synthetic */ long val$progressCallback;
        public final /* synthetic */ long val$responseCallback;

        public AnonymousClass2(long j2, long j3) {
        }

        @Override // com.tencent.imsdk.common.HttpClient.HttpRequestListener
        public void onCompleted(int i2, Map<String, String> map, byte[] bArr) {
        }

        @Override // com.tencent.imsdk.common.HttpClient.HttpRequestListener
        public void onProgress(int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class BasicAuthenticator extends Authenticator {
        private String password;
        private String userName;

        public BasicAuthenticator(String str, String str2) {
        }

        @Override // java.net.Authenticator
        public PasswordAuthentication getPasswordAuthentication() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface HttpRequestListener {
        void onCompleted(int i2, Map<String, String> map, byte[] bArr);

        void onProgress(int i2, int i3, int i4);
    }

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ String access$002(String str) {
    }

    public static /* synthetic */ boolean access$100() {
    }

    public static /* synthetic */ boolean access$102(boolean z) {
    }

    public static /* synthetic */ boolean access$200(String str) {
    }

    public static /* synthetic */ String access$300() {
    }

    public static /* synthetic */ void access$400(int i2, int i3, int i4, long j2) {
    }

    public static /* synthetic */ void access$500(int i2, String[] strArr, String[] strArr2, byte[] bArr, long j2) {
    }

    private static void httpRequest(String str, String str2, Boolean bool, Map<String, String> map, byte[] bArr, String str3, String str4, HttpRequestListener httpRequestListener, int i2, String str5, int i3, String str6, String str7, int i4, int i5, String str8) {
    }

    private static native void nativeProgressCallback(int i2, int i3, int i4, long j2);

    private static native void nativeResponseCallback(int i2, String[] strArr, String[] strArr2, byte[] bArr, long j2);

    private static boolean needRollbackHttps2Http(String str) {
    }

    private static void httpRequest(String str, String str2, boolean z, String[] strArr, String[] strArr2, byte[] bArr, String str3, String str4, long j2, long j3, int i2, String str5, int i3, String str6, String str7, int i4, int i5, String str8) {
    }
}
