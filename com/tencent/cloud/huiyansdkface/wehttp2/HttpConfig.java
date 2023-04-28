package com.tencent.cloud.huiyansdkface.wehttp2;

import android.content.Context;
import com.tencent.cloud.huiyansdkface.okhttp3.EventListener;
import com.tencent.cloud.huiyansdkface.okhttp3.Interceptor;
import com.tencent.cloud.huiyansdkface.wehttp2.MockInterceptor;
import com.tencent.cloud.huiyansdkface.wehttp2.RetryInterceptor;
import com.tencent.cloud.huiyansdkface.wehttp2.WeLog;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class HttpConfig implements PinProvider {

    /* renamed from: a  reason: collision with root package name */
    private volatile PinCheckMode f11230a;
    private PinManager b;
    private PinVerifyListener c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11231d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f11232e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f11233f;

    /* renamed from: g  reason: collision with root package name */
    private String f11234g;

    /* renamed from: h  reason: collision with root package name */
    private int f11235h;

    /* renamed from: i  reason: collision with root package name */
    private int f11236i;

    /* renamed from: j  reason: collision with root package name */
    private int f11237j;

    /* renamed from: k  reason: collision with root package name */
    private int f11238k;

    /* renamed from: l  reason: collision with root package name */
    private int f11239l;

    /* renamed from: m  reason: collision with root package name */
    private RetryInterceptor.RetryStrategy f11240m;

    /* renamed from: n  reason: collision with root package name */
    private WeLog.Builder f11241n;

    /* renamed from: o  reason: collision with root package name */
    private WeCookie f11242o;

    /* renamed from: p  reason: collision with root package name */
    private TypeAdapter f11243p;
    private Proxy q;
    private List<MockInterceptor.Mock> r;
    private EventListener s;
    private List<Interceptor> t;
    private List<Interceptor> u;
    private Context v;
    private String w;
    private String x;
    private String y;
    private WeDns z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ConfigInheritSwitch {
        private static ConfigInheritSwitch q;

        /* renamed from: a  reason: collision with root package name */
        public boolean f11244a;
        public boolean b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f11245d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11246e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11247f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11248g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11249h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f11250i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f11251j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f11252k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f11253l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f11254m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f11255n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f11256o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f11257p;
        private boolean r;

        public static /* synthetic */ ConfigInheritSwitch a() {
        }

        public static /* synthetic */ boolean a(ConfigInheritSwitch configInheritSwitch) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class LogConfig {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11258a;
        private boolean b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private int f11259d;

        /* renamed from: e  reason: collision with root package name */
        private WeLog.Level f11260e;

        public static /* synthetic */ int a(LogConfig logConfig, int i2) {
        }

        public static /* synthetic */ WeLog.Level a(LogConfig logConfig, WeLog.Level level) {
        }

        public static /* synthetic */ boolean a(LogConfig logConfig, boolean z) {
        }

        public static /* synthetic */ boolean b(LogConfig logConfig, boolean z) {
        }

        public static /* synthetic */ boolean c(LogConfig logConfig, boolean z) {
        }

        public WeLog.Level getLevel() {
        }

        public int getLongStrLength() {
        }

        public boolean isCutLongStr() {
        }

        public boolean isLogWithTag() {
        }

        public boolean isPrettyLog() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class PinCheckMode {

        /* renamed from: a  reason: collision with root package name */
        public static final PinCheckMode f11261a = null;
        public static final PinCheckMode b = null;
        private static PinCheckMode c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ PinCheckMode[] f11262d = null;

        private PinCheckMode(String str, int i2) {
        }

        public static PinCheckMode valueOf(String str) {
        }

        public static PinCheckMode[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface PinVerifyListener {
        void onPinVerifyFailed(String str, List<String> list);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Proxy {

        /* renamed from: a  reason: collision with root package name */
        private String f11263a;
        private int b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f11264d;

        public static /* synthetic */ String a(Proxy proxy) {
        }

        public static /* synthetic */ int b(Proxy proxy) {
        }

        public static /* synthetic */ String c(Proxy proxy) {
        }

        public static /* synthetic */ String d(Proxy proxy) {
        }

        public Proxy setIp(String str) {
        }

        public Proxy setPassword(String str) {
        }

        public Proxy setPort(int i2) {
        }

        public Proxy setUserName(String str) {
        }
    }

    private HttpConfig a(Map<String, ?> map, boolean z) {
    }

    private void a(WeConfig weConfig, String str, ConfigInheritSwitch configInheritSwitch) {
    }

    private HttpConfig b(Map<String, ?> map, boolean z) {
    }

    public HttpConfig addCommonHeaders(Map<String, ?> map) {
    }

    public HttpConfig addCommonParams(Map<String, ?> map) {
    }

    public HttpConfig addInterceptor(Interceptor... interceptorArr) {
    }

    public HttpConfig addMock(MockInterceptor.Mock... mockArr) {
    }

    public HttpConfig addNetInterceptor(Interceptor... interceptorArr) {
    }

    public HttpConfig addPins(List<byte[]> list) {
    }

    public HttpConfig clientCertPath(Context context, String str, String str2, String str3) {
    }

    public WeOkHttp create() {
    }

    public WeOkHttp create(WeOkHttp weOkHttp, String str) {
    }

    public WeOkHttp create(WeOkHttp weOkHttp, String str, ConfigInheritSwitch configInheritSwitch) {
    }

    public WeOkHttp create(String str) {
    }

    public String getBaseUrl() {
    }

    public int getCallTimeoutInSeconds() {
    }

    public Map<String, String> getCommonHeaders() {
    }

    public Map<String, String> getCommonParams() {
    }

    public int getConnectTimeoutInSeconds() {
    }

    public WeCookie getCookie() {
    }

    public String getCookieHeader() {
    }

    public String getCookieHeader(String str) {
    }

    public WeDns getDns() {
    }

    public LogConfig getLogConfig() {
    }

    public String[] getPinArray() {
    }

    public PinCheckMode getPinCheckMode() {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.PinProvider
    public Set<String> getPinSet() {
    }

    public List<String> getPins() {
    }

    public Proxy getProxy() {
    }

    public int getReadTimeOutInSeconds() {
    }

    public TypeAdapter getTypeAdaptor() {
    }

    public int getWriteTimeOutInSeconds() {
    }

    public boolean isUsePinProvider() {
    }

    @Override // com.tencent.cloud.huiyansdkface.wehttp2.PinProvider
    public void onPinVerifyFailed(String str, List<String> list) {
    }

    public PinManager pinManager() {
    }

    public HttpConfig setBaseUrl(String str) {
    }

    public HttpConfig setCallTimeoutInSeconds(int i2) {
    }

    public HttpConfig setCommonHeaders(Map<String, ?> map) {
    }

    public HttpConfig setCommonParams(Map<String, ?> map) {
    }

    public HttpConfig setCookie(WeCookie weCookie) {
    }

    public HttpConfig setDns(WeDns weDns) {
    }

    public HttpConfig setEventListener(EventListener eventListener) {
    }

    public HttpConfig setLogBuilder(WeLog.Builder builder) {
    }

    public HttpConfig setPinCheckMode(PinCheckMode pinCheckMode) {
    }

    public void setPinVerifyListener(PinVerifyListener pinVerifyListener) {
    }

    public HttpConfig setProxy(Proxy proxy) {
    }

    public HttpConfig setRetryCount(int i2) {
    }

    public HttpConfig setRetryStrategy(RetryInterceptor.RetryStrategy retryStrategy) {
    }

    public void setToWeHttp() {
    }

    public HttpConfig setTypeAdaptor(TypeAdapter typeAdapter) {
    }

    public HttpConfig timeoutInSeconds(int i2, int i3, int i4) {
    }

    public HttpConfig usePinProvider(boolean z) {
    }
}
