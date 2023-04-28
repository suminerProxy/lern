package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.lbsapi.auth.LBSAuthManagerListener;
import java.util.Hashtable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PermissionCheck {

    /* renamed from: a  reason: collision with root package name */
    public static int f2445a = 200;
    public static int b = 202;
    public static int c = 252;

    /* renamed from: d  reason: collision with root package name */
    private static final String f2446d = "PermissionCheck";

    /* renamed from: e  reason: collision with root package name */
    private static Context f2447e = null;

    /* renamed from: f  reason: collision with root package name */
    private static String f2448f = null;

    /* renamed from: g  reason: collision with root package name */
    private static Hashtable<String, String> f2449g = null;

    /* renamed from: h  reason: collision with root package name */
    private static LBSAuthManager f2450h = null;

    /* renamed from: i  reason: collision with root package name */
    private static LBSAuthManagerListener f2451i = null;

    /* renamed from: j  reason: collision with root package name */
    private static c f2452j = null;

    /* renamed from: k  reason: collision with root package name */
    private static int f2453k = 601;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements LBSAuthManagerListener {
        private a() {
        }

        @Override // com.baidu.lbsapi.auth.LBSAuthManagerListener
        public void onAuthResult(int i2, String str) {
        }

        public /* synthetic */ a(e eVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2454a;
        public String b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f2455d;

        /* renamed from: e  reason: collision with root package name */
        public String f2456e;

        /* renamed from: f  reason: collision with root package name */
        public int f2457f;

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {
        void a(b bVar);
    }

    public static /* synthetic */ int a(int i2) {
    }

    public static /* synthetic */ c b() {
    }

    public static /* synthetic */ Context c() {
    }

    public static /* synthetic */ String d() {
    }

    public static void destory() {
    }

    public static int getPermissionResult() {
    }

    public static void init(Context context) {
    }

    public static synchronized int permissionCheck() {
    }

    public static void setApiKey(String str) {
    }

    public static void setPermissionCheckResultListener(c cVar) {
    }

    public static /* synthetic */ String a() {
    }
}
