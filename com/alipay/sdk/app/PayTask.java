package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import com.alipay.sdk.data.a;
import com.alipay.sdk.util.H5PayResultModel;
import com.alipay.sdk.util.e;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PayTask {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f599a = null;

    /* renamed from: h  reason: collision with root package name */
    private static long f600h = 0;

    /* renamed from: i  reason: collision with root package name */
    private static final long f601i = 3000;

    /* renamed from: j  reason: collision with root package name */
    private static long f602j = -1;
    private Activity b;
    private com.alipay.sdk.widget.a c;

    /* renamed from: d  reason: collision with root package name */
    private String f603d;

    /* renamed from: e  reason: collision with root package name */
    private String f604e;

    /* renamed from: f  reason: collision with root package name */
    private String f605f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, a> f606g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PayTask f607a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f608d;

        /* renamed from: e  reason: collision with root package name */
        private String f609e;

        private a(PayTask payTask) {
        }

        public String a() {
        }

        public String b() {
        }

        public String c() {
        }

        public String d() {
        }

        public void a(String str) {
        }

        public void b(String str) {
        }

        public void c(String str) {
        }

        public void d(String str) {
        }

        public /* synthetic */ a(PayTask payTask, g gVar) {
        }
    }

    public PayTask(Activity activity) {
    }

    private static final String a(String... strArr) {
    }

    private String b(String str) {
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
    }

    public void dismissLoading() {
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
    }

    public synchronized String fetchTradeToken() {
    }

    public String getVersion() {
    }

    public synchronized H5PayResultModel h5Pay(String str, boolean z) {
    }

    public synchronized String pay(String str, boolean z) {
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
    }

    public void showLoading() {
    }

    private boolean a(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
    }

    private String a(String str, Map<String, String> map) throws UnsupportedEncodingException {
    }

    private String a(String str, String str2) {
    }

    private static boolean b() {
    }

    private e.a a() {
    }

    private String a(String str) {
    }

    private static String a(String str, List<a.C0019a> list, String str2, Activity activity) {
    }

    private void a(JSONObject jSONObject) {
    }

    private String a(com.alipay.sdk.protocol.b bVar, String str) {
    }

    private String a(com.alipay.sdk.protocol.b bVar) {
    }
}
