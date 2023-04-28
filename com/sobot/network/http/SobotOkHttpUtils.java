package com.sobot.network.http;

import android.annotation.SuppressLint;
import android.os.Handler;
import com.sobot.network.http.builder.GetBuilder;
import com.sobot.network.http.builder.HeadBuilder;
import com.sobot.network.http.builder.OtherRequestBuilder;
import com.sobot.network.http.builder.PostFileBuilder;
import com.sobot.network.http.builder.PostFormBuilder;
import com.sobot.network.http.builder.PostMultipartFormBuilder;
import com.sobot.network.http.builder.PostStringBuilder;
import com.sobot.network.http.callback.FileCallBack;
import com.sobot.network.http.request.RequestCall;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotOkHttpUtils {
    public static final long DEFAULT_MILLISECONDS = 10000;
    private static SobotOkHttpUtils mInstance;
    private Handler mDelivery;
    private OkHttpClient mOkHttpClient;

    /* renamed from: com.sobot.network.http.SobotOkHttpUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements HostnameVerifier {
        public final /* synthetic */ SobotOkHttpUtils this$0;

        public AnonymousClass1(SobotOkHttpUtils sobotOkHttpUtils) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    /* renamed from: com.sobot.network.http.SobotOkHttpUtils$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Callback {
        public final /* synthetic */ SobotOkHttpUtils this$0;
        public final /* synthetic */ com.sobot.network.http.callback.Callback val$finalCallback;

        public AnonymousClass2(SobotOkHttpUtils sobotOkHttpUtils, com.sobot.network.http.callback.Callback callback) {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
        }
    }

    /* renamed from: com.sobot.network.http.SobotOkHttpUtils$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ SobotOkHttpUtils this$0;
        public final /* synthetic */ Call val$call;
        public final /* synthetic */ com.sobot.network.http.callback.Callback val$callback;
        public final /* synthetic */ Exception val$e;

        public AnonymousClass3(SobotOkHttpUtils sobotOkHttpUtils, com.sobot.network.http.callback.Callback callback, Call call, Exception exc) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.SobotOkHttpUtils$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ SobotOkHttpUtils this$0;
        public final /* synthetic */ com.sobot.network.http.callback.Callback val$callback;
        public final /* synthetic */ Object val$object;

        public AnonymousClass4(SobotOkHttpUtils sobotOkHttpUtils, com.sobot.network.http.callback.Callback callback, Object obj) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class METHOD {
        public static final String DELETE = "DELETE";
        public static final String HEAD = "HEAD";
        public static final String PATCH = "PATCH";
        public static final String PUT = "PUT";
    }

    public SobotOkHttpUtils(OkHttpClient okHttpClient) {
    }

    @SuppressLint({"TrulyRandom"})
    private static SSLSocketFactory createSSLSocketFactory(X509TrustManager x509TrustManager) {
    }

    public static OtherRequestBuilder delete() {
    }

    public static void download(String str, FileCallBack fileCallBack) {
    }

    public static GetBuilder get() {
    }

    public static SobotOkHttpUtils getInstance(OkHttpClient okHttpClient) {
    }

    public static HeadBuilder head() {
    }

    public static OtherRequestBuilder patch() {
    }

    public static PostFormBuilder post() {
    }

    public static PostFileBuilder postFile() {
    }

    public static PostMultipartFormBuilder postMultipart() {
    }

    public static PostStringBuilder postString() {
    }

    public static OtherRequestBuilder put() {
    }

    public static void runOnUiThread(Runnable runnable) {
    }

    public void cancelTag(Object obj) {
    }

    public SobotOkHttpUtils debug(String str) {
    }

    public void execute(RequestCall requestCall, com.sobot.network.http.callback.Callback callback) {
    }

    public Handler getDelivery() {
    }

    public OkHttpClient getOkHttpClient() {
    }

    public void sendFailResultCallback(Call call, Exception exc, com.sobot.network.http.callback.Callback callback) {
    }

    public void sendSuccessResultCallback(Object obj, com.sobot.network.http.callback.Callback callback) {
    }

    public void setConnectTimeout(int i2, TimeUnit timeUnit) {
    }

    public void setHostNameVerifier(HostnameVerifier hostnameVerifier) {
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
    }

    public void setReadTimeout(int i2, TimeUnit timeUnit) {
    }

    public void setWriteTimeout(int i2, TimeUnit timeUnit) {
    }

    public SobotOkHttpUtils debug(String str, boolean z) {
    }

    public static SobotOkHttpUtils getInstance() {
    }
}
