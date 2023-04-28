package com.baidu.mapapi.http;

import java.net.HttpURLConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class HttpClient {
    public static boolean isHttpsEnable = true;

    /* renamed from: a  reason: collision with root package name */
    public HttpURLConnection f1503a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f1504d;

    /* renamed from: e  reason: collision with root package name */
    private int f1505e;

    /* renamed from: f  reason: collision with root package name */
    private String f1506f;

    /* renamed from: g  reason: collision with root package name */
    private ProtoResultCallback f1507g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class HttpStateError {
        private static final /* synthetic */ HttpStateError[] $VALUES = null;
        public static final HttpStateError INNER_ERROR = null;
        public static final HttpStateError NETWORK_ERROR = null;
        public static final HttpStateError NO_ERROR = null;
        public static final HttpStateError REQUEST_ERROR = null;
        public static final HttpStateError SERVER_ERROR = null;

        private HttpStateError(String str, int i2) {
        }

        public static HttpStateError valueOf(String str) {
        }

        public static HttpStateError[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class ProtoResultCallback {
        public abstract void onFailed(HttpStateError httpStateError);

        public abstract void onSuccess(String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    public HttpClient(String str, ProtoResultCallback protoResultCallback) {
    }

    private HttpURLConnection a() {
    }

    public static String getAuthToken() {
    }

    public static String getPhoneInfo() {
    }

    public boolean checkNetwork() {
    }

    public void request(String str) {
    }

    public void setMaxTimeOut(int i2) {
    }

    public void setReadTimeOut(int i2) {
    }
}
