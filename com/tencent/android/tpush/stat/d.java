package com.tencent.android.tpush.stat;

import android.content.Context;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.service.XGVipPushService;
import com.umeng.analytics.pro.am;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static com.tencent.android.tpush.stat.b.c f9119d = com.tencent.android.tpush.stat.b.b.b();

    /* renamed from: a  reason: collision with root package name */
    public static a f9118a = new a(2);
    public static a b = new a(1);

    /* renamed from: e  reason: collision with root package name */
    private static StatReportStrategy f9120e = StatReportStrategy.APP_LAUNCH;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f9121f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f9122g = true;
    public static String c = "__HIBERNATE__";

    /* renamed from: h  reason: collision with root package name */
    private static boolean f9123h = false;

    /* renamed from: i  reason: collision with root package name */
    private static short f9124i = 6;

    /* renamed from: j  reason: collision with root package name */
    private static int f9125j = 1024;

    /* renamed from: k  reason: collision with root package name */
    private static int f9126k = 30000;

    /* renamed from: l  reason: collision with root package name */
    private static int f9127l = 0;

    /* renamed from: m  reason: collision with root package name */
    private static int f9128m = 20;

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9129a;
        public JSONObject b = new JSONObject();
        public String c = "";

        /* renamed from: d  reason: collision with root package name */
        public int f9130d = 0;

        public a(int i2) {
            this.f9129a = i2;
        }
    }

    public static StatReportStrategy a() {
        return f9120e;
    }

    public static boolean b() {
        return f9121f;
    }

    public static boolean c() {
        Context context = XGPushManager.getContext();
        if (context == null) {
            if (XGVipPushService.b() == null) {
                return false;
            }
            context = XGVipPushService.b().getApplicationContext();
        }
        if (context != null) {
            return f9122g && com.tencent.android.tpush.service.a.a.a(context.getApplicationContext()).B == 1;
        }
        return f9122g;
    }

    public static boolean d() {
        return f9123h;
    }

    public static short e() {
        return f9124i;
    }

    public static int f() {
        return f9125j;
    }

    public static void a(StatReportStrategy statReportStrategy) {
        f9120e = statReportStrategy;
        if (b()) {
            com.tencent.android.tpush.stat.b.c cVar = f9119d;
            cVar.h("Change to statSendStrategy: " + statReportStrategy);
        }
    }

    public static void b(boolean z) {
        f9122g = z;
        if (z) {
            return;
        }
        f9119d.c("!!!!!!MTA StatService has been disabled!!!!!!");
    }

    public static void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        try {
            String string = jSONObject.getString(c);
            if (b()) {
                com.tencent.android.tpush.stat.b.c cVar = f9119d;
                cVar.h("hibernateVer:" + string + ", current version:2.0.6");
            }
            long b2 = com.tencent.android.tpush.stat.b.b.b(string);
            if (com.tencent.android.tpush.stat.b.b.b("2.0.6") <= b2) {
                a(b2);
            }
        } catch (JSONException unused) {
            f9119d.h("__HIBERNATE__ not found.");
        }
    }

    public static void a(boolean z) {
        f9121f = z;
        com.tencent.android.tpush.stat.b.b.b().a(z);
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase(Integer.toString(b.f9129a))) {
                    a(context, b, jSONObject.getJSONObject(next));
                } else if (next.equalsIgnoreCase(Integer.toString(f9118a.f9129a))) {
                    a(context, f9118a, jSONObject.getJSONObject(next));
                }
            }
        } catch (JSONException e2) {
            f9119d.b((Throwable) e2);
        }
    }

    public static void c(boolean z) {
        f9123h = z;
    }

    public static void a(Context context, a aVar, JSONObject jSONObject) {
        boolean z = false;
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase(am.aE)) {
                    int i2 = jSONObject.getInt(next);
                    if (aVar.f9130d != i2) {
                        z = true;
                    }
                    aVar.f9130d = i2;
                } else if (next.equalsIgnoreCase(am.aF)) {
                    String string = jSONObject.getString(am.aF);
                    if (string.length() > 0) {
                        aVar.b = new JSONObject(string);
                    }
                } else if (next.equalsIgnoreCase("m")) {
                    aVar.c = jSONObject.getString("m");
                }
            }
            if (z && aVar.f9129a == b.f9129a) {
                a(aVar.b);
                b(aVar.b);
            }
            a(context, aVar);
        } catch (JSONException e2) {
            f9119d.b((Throwable) e2);
        } catch (Throwable th) {
            f9119d.b(th);
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt("rs"));
            if (statReportStrategy != null) {
                a(statReportStrategy);
            }
        } catch (JSONException unused) {
            if (b()) {
                f9119d.b("rs not found.");
            }
        }
    }

    public static void a(Context context, a aVar) {
        int i2 = aVar.f9129a;
        if (i2 == b.f9129a) {
            b = aVar;
            a(aVar.b);
        } else if (i2 == f9118a.f9129a) {
            f9118a = aVar;
        }
    }

    public static void a(long j2) {
        com.tencent.android.tpush.stat.b.d.b(f.a(), c, j2);
        b(false);
        f9119d.c("MTA is disable for current SDK version");
    }
}
