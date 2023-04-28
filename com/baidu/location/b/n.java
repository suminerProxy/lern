package com.baidu.location.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class n {

    /* renamed from: j  reason: collision with root package name */
    private static long f1251j = 12000;

    /* renamed from: a  reason: collision with root package name */
    public e f1252a;
    private Context b;
    private WebView c;

    /* renamed from: d  reason: collision with root package name */
    private LocationClient f1253d;

    /* renamed from: e  reason: collision with root package name */
    private a f1254e;

    /* renamed from: f  reason: collision with root package name */
    private List<b> f1255f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1256g;

    /* renamed from: h  reason: collision with root package name */
    private long f1257h;

    /* renamed from: i  reason: collision with root package name */
    private BDLocation f1258i;

    /* renamed from: k  reason: collision with root package name */
    private f f1259k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1260l;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f1261a;

        public a(n nVar, Looper looper) {
        }

        private String a(BDLocation bDLocation) {
        }

        private void a(String str) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f1262a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private long f1263d;

        public b(n nVar, String str) {
        }

        public String a() {
        }

        public String b() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final n f1264a = null;

        public static /* synthetic */ n a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f1265a;

        private d(n nVar) {
        }

        public /* synthetic */ d(n nVar, AnonymousClass1 anonymousClass1) {
        }

        @JavascriptInterface
        public void sendMessage(String str) {
        }

        @JavascriptInterface
        public void showLog(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class e extends BDAbstractLocationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f1266a;

        public e(n nVar) {
        }

        @Override // com.baidu.location.BDAbstractLocationListener
        public void onReceiveLocation(BDLocation bDLocation) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f1267a;

        private f(n nVar) {
        }

        public /* synthetic */ f(n nVar, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private n() {
    }

    public /* synthetic */ n(AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ long a(long j2) {
    }

    public static /* synthetic */ long a(n nVar, long j2) {
    }

    public static /* synthetic */ BDLocation a(n nVar, BDLocation bDLocation) {
    }

    public static /* synthetic */ f a(n nVar, f fVar) {
    }

    public static n a() {
    }

    public static /* synthetic */ List a(n nVar, List list) {
    }

    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    private void a(WebView webView) {
    }

    public static /* synthetic */ boolean a(n nVar) {
    }

    public static /* synthetic */ boolean a(n nVar, boolean z) {
    }

    public static /* synthetic */ a b(n nVar) {
    }

    public static /* synthetic */ long c() {
    }

    public static /* synthetic */ boolean c(n nVar) {
    }

    public static /* synthetic */ f d(n nVar) {
    }

    public static /* synthetic */ List e(n nVar) {
    }

    public static /* synthetic */ WebView f(n nVar) {
    }

    public static /* synthetic */ LocationClient g(n nVar) {
    }

    public static /* synthetic */ long h(n nVar) {
    }

    public static /* synthetic */ BDLocation i(n nVar) {
    }

    public void a(Context context, WebView webView, LocationClient locationClient) {
    }

    public void b() {
    }
}
