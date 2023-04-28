package com.tencent.cloud.huiyansdkface.wehttp2;

import android.content.Context;
import com.tencent.cloud.huiyansdkface.okhttp3.CertificatePinner;
import com.tencent.cloud.huiyansdkface.okhttp3.Dns;
import com.tencent.cloud.huiyansdkface.okhttp3.HttpUrl;
import com.tencent.cloud.huiyansdkface.okhttp3.OkHttpClient;
import com.tencent.cloud.huiyansdkface.wehttp2.MockInterceptor;
import com.tencent.cloud.huiyansdkface.wehttp2.RetryInterceptor;
import com.tencent.cloud.huiyansdkface.wehttp2.WeLog;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class WeConfig {
    private static int t = -1;

    /* renamed from: a  reason: collision with root package name */
    private String f11277a;
    private OkHttpClient.Builder b;
    private WeCookie c;

    /* renamed from: d  reason: collision with root package name */
    private volatile OkHttpClient f11278d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11279e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f11280f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f11281g;

    /* renamed from: h  reason: collision with root package name */
    private String f11282h;

    /* renamed from: i  reason: collision with root package name */
    private volatile TypeAdapter f11283i;

    /* renamed from: j  reason: collision with root package name */
    private WeLog f11284j;

    /* renamed from: k  reason: collision with root package name */
    private WeCookieLog f11285k;

    /* renamed from: l  reason: collision with root package name */
    private MockInterceptor f11286l;

    /* renamed from: m  reason: collision with root package name */
    private RetryInterceptor f11287m;

    /* renamed from: n  reason: collision with root package name */
    private Context f11288n;

    /* renamed from: o  reason: collision with root package name */
    private String f11289o;

    /* renamed from: p  reason: collision with root package name */
    private String f11290p;
    private String q;
    private KeyManagerFactory r;
    private WeLog.ILogTag s;

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.WeConfig$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements WeLog.ILogTag {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ WeConfig f11291a;

        public AnonymousClass1(WeConfig weConfig) {
        }

        @Override // com.tencent.cloud.huiyansdkface.wehttp2.WeLog.ILogTag
        public String tag(HttpUrl httpUrl, Object obj) {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.WeConfig$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements Dns {
        private /* synthetic */ WeDns b;

        public AnonymousClass2(WeConfig weConfig, WeDns weDns) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.Dns
        public List<InetAddress> lookup(String str) throws UnknownHostException {
        }
    }

    /* renamed from: com.tencent.cloud.huiyansdkface.wehttp2.WeConfig$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements CertificatePinner.CertificatePinProvider {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f11292a;
        private /* synthetic */ PinProvider b;

        public AnonymousClass3(WeConfig weConfig, String str, PinProvider pinProvider) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.CertificatePinner.CertificatePinProvider
        public String getPattern() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.CertificatePinner.CertificatePinProvider
        public Set<String> getPins() {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.CertificatePinner.CertificatePinProvider
        public void onPinVerifyFailed(String str, List<String> list) {
        }
    }

    private synchronized int a() {
    }

    public static /* synthetic */ int a(WeConfig weConfig) {
    }

    private static X509TrustManager b() {
    }

    private SSLSocketFactory c() {
    }

    public TypeAdapter adapter() {
    }

    public WeConfig adapter(TypeAdapter typeAdapter) {
    }

    public WeConfig addMock(MockInterceptor.Mock... mockArr) {
    }

    @Deprecated
    public WeConfig addPin4DefHost(String... strArr) {
    }

    @Deprecated
    public WeConfig addPin4Host(String str, String... strArr) {
    }

    public WeConfig baseUrl(String str) {
    }

    public OkHttpClient client() {
    }

    public WeConfig clientCertPath(Context context, String str, String str2, String str3) {
    }

    public OkHttpClient.Builder clientConfig() {
    }

    public WeConfig clientKeyManagerFactory(KeyManagerFactory keyManagerFactory) {
    }

    public WeConfig cookie(WeCookie weCookie) {
    }

    public WeCookie cookie() {
    }

    public WeConfig cookieMemory() {
    }

    public WeConfig cookieWebView(Context context) {
    }

    public WeConfig dns(WeDns weDns) {
    }

    public Map<String, String> getHeaders() {
    }

    public Map<String, String> getParams() {
    }

    public String getUrl(String str) {
    }

    public WeConfig header(String str, String str2) {
    }

    public WeConfig header(Map<String, String> map) {
    }

    public WeLog.ILogTag iLogTag() {
    }

    public WeConfig log(WeLog.Builder builder) {
    }

    public WeConfig log(WeLog.Level level) {
    }

    public WeConfig log(WeLog.Level level, WeLog.Logger logger) {
    }

    public WeConfig log(WeLog.Level level, boolean z, boolean z2, WeLog.ILogTag iLogTag, WeLog.Logger logger) {
    }

    public MockInterceptor mockConfig() {
    }

    public WeConfig params(String str, String str2) {
    }

    public WeConfig params(Map<String, String> map) {
    }

    public WeConfig pinCheckHost(String str) {
    }

    public WeConfig pins(String str, PinProvider pinProvider) {
    }

    public WeConfig proxy(String str, int i2, String str2, String str3) {
    }

    public WeConfig retryConfig(int i2, RetryInterceptor.RetryStrategy retryStrategy) {
    }

    public WeConfig retryCount(int i2) {
    }

    @Deprecated
    public WeConfig setCertVerify(boolean z) {
    }

    public WeConfig setPin4DefHost(String... strArr) {
    }

    public WeConfig setPin4Host(String str, String... strArr) {
    }

    public WeConfig timeout(long j2, long j3, long j4) {
    }
}
