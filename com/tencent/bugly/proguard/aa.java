package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.android.tpush.common.Constants;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class aa {
    private static final Map<String, String> W = new HashMap();
    private static aa aq = null;
    public boolean D;
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean J;
    public final SharedPreferences O;
    public final SharedPreferences P;
    private final Context X;
    private String Y;
    private String Z;
    private String aa;
    private String aj;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9652d;

    /* renamed from: e  reason: collision with root package name */
    public String f9653e;

    /* renamed from: k  reason: collision with root package name */
    public final String f9659k;

    /* renamed from: o  reason: collision with root package name */
    public String f9663o;

    /* renamed from: p  reason: collision with root package name */
    public int f9664p;
    public String q;
    public String r;
    public String s;
    public List<String> v;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9654f = true;

    /* renamed from: g  reason: collision with root package name */
    public final String f9655g = "com.tencent.bugly";

    /* renamed from: h  reason: collision with root package name */
    public String f9656h = "4.1.9.2";

    /* renamed from: i  reason: collision with root package name */
    public final String f9657i = "";
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    public final String f9658j = "";

    /* renamed from: l  reason: collision with root package name */
    public String f9660l = "unknown";
    private String ab = "unknown";
    private String ac = "";

    /* renamed from: m  reason: collision with root package name */
    public long f9661m = 0;
    private String ad = null;
    private long ae = -1;
    private long af = -1;
    private long ag = -1;
    private String ah = null;
    private String ai = null;
    private Map<String, PlugInBean> ak = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9662n = false;
    private String al = null;
    private Boolean am = null;
    private String an = null;
    public String t = null;
    public String u = null;
    private Map<String, PlugInBean> ao = null;
    private Map<String, PlugInBean> ap = null;
    public int w = -1;
    public int x = -1;
    private final Map<String, String> ar = new HashMap();
    private final Map<String, String> as = new HashMap();
    private final Map<String, String> at = new HashMap();
    public String y = "unknown";
    public long z = 0;
    public long A = 0;
    public long B = 0;
    public long C = 0;
    public boolean I = false;
    public HashMap<String, String> K = new HashMap<>();
    public List<String> L = new ArrayList();
    public boolean M = false;
    public q N = null;
    public boolean Q = true;
    public boolean R = true;
    public boolean S = false;
    private final Object au = new Object();
    public final Object T = new Object();
    private final Object av = new Object();
    private final Object aw = new Object();
    public final Object U = new Object();
    public final Object V = new Object();
    private final Object ax = new Object();
    private final List<Integer> ay = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final long f9651a = System.currentTimeMillis();
    public final byte b = 1;

    private aa(Context context) {
        this.aj = null;
        this.f9663o = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.v = null;
        this.D = false;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = "";
        this.J = false;
        this.X = ap.a(context);
        PackageInfo b = z.b(context);
        if (b != null) {
            try {
                String str = b.versionName;
                this.f9663o = str;
                this.E = str;
                this.F = Integer.toString(b.versionCode);
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        this.c = z.a(context);
        this.f9652d = z.a(Process.myPid());
        this.q = z.c(context);
        this.f9659k = "Android " + ab.b() + ",level " + ab.c();
        Map<String, String> d2 = z.d(context);
        if (d2 != null) {
            try {
                this.v = z.a(d2);
                String str2 = d2.get("BUGLY_APPID");
                if (str2 != null) {
                    this.r = str2;
                    b("APP_ID", str2);
                }
                String str3 = d2.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f9663o = str3;
                }
                String str4 = d2.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.s = str4;
                }
                String str5 = d2.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.D = str5.equalsIgnoreCase("true");
                }
                String str6 = d2.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.G = str6;
                }
                String str7 = d2.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f9664p = Integer.parseInt(str7);
                }
                String str8 = d2.get("BUGLY_AREA");
                if (str8 != null) {
                    this.H = str8;
                }
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.J = true;
                al.c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (p.c) {
                th3.printStackTrace();
            }
        }
        this.O = ap.a("BUGLY_COMMON_VALUES", context);
        this.P = ap.a("BUGLY_RESERVED_VALUES", context);
        this.aj = ab.a(context);
        E();
        al.c("com info create end", new Object[0]);
    }

    public static int B() {
        return ab.c();
    }

    @Deprecated
    public static boolean C() {
        al.a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    public static boolean D() {
        al.a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    private void E() {
        try {
            for (Map.Entry<String, ?> entry : this.P.getAll().entrySet()) {
                al.c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : W.entrySet()) {
                al.c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                a(entry2.getKey(), entry2.getValue(), true);
            }
            W.clear();
        } catch (Throwable th) {
            al.b(th);
        }
    }

    private String F() {
        if (TextUtils.isEmpty(this.ad)) {
            this.ad = ap.d("androidid", null);
        }
        return this.ad;
    }

    private static String G() {
        String uuid = UUID.randomUUID().toString();
        return !ap.b(uuid) ? uuid.replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, "") : uuid;
    }

    public static synchronized aa b() {
        aa aaVar;
        synchronized (aa.class) {
            aaVar = aq;
        }
        return aaVar;
    }

    @Deprecated
    public static String n() {
        return "";
    }

    public final synchronized Map<String, PlugInBean> A() {
        Map<String, PlugInBean> map;
        map = this.ao;
        Map<String, PlugInBean> map2 = this.ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final boolean a() {
        boolean z = this.ay.size() > 0;
        al.c("isAppForeground:%s", Boolean.valueOf(z));
        return z;
    }

    public final void c() {
        synchronized (this.au) {
            this.Y = UUID.randomUUID().toString();
        }
    }

    public final String d() {
        String str;
        synchronized (this.au) {
            if (this.Y == null) {
                c();
            }
            str = this.Y;
        }
        return str;
    }

    public final String e() {
        if (!ap.b(this.f9653e)) {
            return this.f9653e;
        }
        return this.r;
    }

    public final String f() {
        String str;
        synchronized (this.V) {
            str = this.f9660l;
        }
        return str;
    }

    public final String g() {
        String str = this.aa;
        if (str != null) {
            return str;
        }
        String d2 = ap.d(Constants.FLAG_DEVICE_ID, null);
        this.aa = d2;
        if (d2 != null) {
            return d2;
        }
        String F = F();
        this.aa = F;
        if (TextUtils.isEmpty(F)) {
            this.aa = G();
        }
        String str2 = this.aa;
        if (str2 != null) {
            ap.c(Constants.FLAG_DEVICE_ID, str2);
            return this.aa;
        }
        return "";
    }

    public final synchronized String h() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        String d2 = ap.d("deviceModel", null);
        this.Z = d2;
        if (d2 != null) {
            al.c("collect device model from sp:%s", d2);
            return this.Z;
        } else if (!this.f9662n) {
            al.c("not allow collect device model", new Object[0]);
            return "fail";
        } else {
            String a2 = ab.a();
            this.Z = a2;
            al.c("collect device model:%s", a2);
            ap.c("deviceModel", this.Z);
            return this.Z;
        }
    }

    public final synchronized String i() {
        return this.ac;
    }

    public final long j() {
        if (this.ae <= 0) {
            this.ae = ab.e();
        }
        return this.ae;
    }

    public final long k() {
        if (this.af <= 0) {
            this.af = ab.i();
        }
        return this.af;
    }

    public final long l() {
        if (this.ag <= 0) {
            this.ag = ab.k();
        }
        return this.ag;
    }

    public final String m() {
        if (!TextUtils.isEmpty(this.ai)) {
            al.c("get cpu type from so:%s", this.ai);
            return this.ai;
        } else if (TextUtils.isEmpty(this.aj)) {
            return "unknown";
        } else {
            al.c("get cpu type from lib dir:%s", this.aj);
            return this.aj;
        }
    }

    public final String o() {
        try {
            Map<String, ?> all = this.X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.T) {
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th) {
            al.a(th);
        }
        if (!this.K.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry2 : this.K.entrySet()) {
                sb.append("[");
                sb.append(entry2.getKey());
                sb.append(ChineseToPinyinResource.Field.COMMA);
                sb.append(entry2.getValue());
                sb.append("] ");
            }
            al.c("SDK_INFO = %s", sb.toString());
            b("SDK_INFO", sb.toString());
            return sb.toString();
        }
        al.c("SDK_INFO is empty", new Object[0]);
        return null;
    }

    public final synchronized Map<String, PlugInBean> p() {
        Map<String, PlugInBean> map = this.ak;
        if (map != null && map.size() > 0) {
            HashMap hashMap = new HashMap(this.ak.size());
            hashMap.putAll(this.ak);
            return hashMap;
        }
        return null;
    }

    public final String q() {
        if (this.al == null) {
            this.al = ab.m();
        }
        return this.al;
    }

    public final Boolean r() {
        if (this.am == null) {
            this.am = Boolean.valueOf(ab.q());
        }
        return this.am;
    }

    public final String s() {
        if (this.an == null) {
            String str = ab.n();
            this.an = str;
            al.a("ROM ID: %s", str);
        }
        return this.an;
    }

    public final Map<String, String> t() {
        synchronized (this.av) {
            if (this.ar.size() <= 0) {
                return null;
            }
            return new HashMap(this.ar);
        }
    }

    public final void u() {
        synchronized (this.av) {
            this.ar.clear();
        }
    }

    public final int v() {
        int size;
        synchronized (this.av) {
            size = this.ar.size();
        }
        return size;
    }

    public final Set<String> w() {
        Set<String> keySet;
        synchronized (this.av) {
            keySet = this.ar.keySet();
        }
        return keySet;
    }

    public final Map<String, String> x() {
        synchronized (this.ax) {
            if (this.as.size() <= 0) {
                return null;
            }
            return new HashMap(this.as);
        }
    }

    public final Map<String, String> y() {
        synchronized (this.aw) {
            if (this.at.size() <= 0) {
                return null;
            }
            return new HashMap(this.at);
        }
    }

    public final int z() {
        int i2;
        synchronized (this.U) {
            i2 = this.w;
        }
        return i2;
    }

    public final void b(String str) {
        al.a("change deviceModel，old:%s new:%s", this.Z, str);
        this.Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ap.c("deviceModel", str);
    }

    public final void a(int i2, boolean z) {
        al.c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i2), Boolean.valueOf(z));
        if (z) {
            this.ay.add(Integer.valueOf(i2));
        } else {
            this.ay.remove(Integer.valueOf(i2));
            this.ay.remove((Object) 0);
        }
        q qVar = this.N;
        if (qVar != null) {
            qVar.setNativeIsAppForeground(this.ay.size() > 0);
        }
    }

    public final synchronized void c(String str) {
        this.ab = String.valueOf(str);
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.ai = str.trim();
    }

    public final String f(String str) {
        String remove;
        if (ap.b(str)) {
            al.d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.av) {
            remove = this.ar.remove(str);
        }
        return remove;
    }

    public final void b(String str, String str2) {
        if (ap.b(str) || ap.b(str2)) {
            al.d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
            return;
        }
        synchronized (this.aw) {
            this.at.put(str, str2);
        }
    }

    public final synchronized void d(String str) {
        this.ac = String.valueOf(str);
    }

    public static synchronized aa a(Context context) {
        aa aaVar;
        synchronized (aa.class) {
            if (aq == null) {
                aq = new aa(context);
            }
            aaVar = aq;
        }
        return aaVar;
    }

    public final String g(String str) {
        String str2;
        if (ap.b(str)) {
            al.d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.av) {
            str2 = this.ar.get(str);
        }
        return str2;
    }

    public final void a(String str) {
        this.aa = str;
        if (!TextUtils.isEmpty(str)) {
            ap.c(Constants.FLAG_DEVICE_ID, str);
        }
        synchronized (this.ax) {
            this.as.put("E8", str);
        }
    }

    public final void a(String str, String str2) {
        if (ap.b(str) || ap.b(str2)) {
            al.d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
            return;
        }
        synchronized (this.av) {
            this.ar.put(str, str2);
        }
    }

    private void a(String str, String str2, boolean z) {
        if (ap.b(str)) {
            al.d("key should not be empty %s", str);
            return;
        }
        al.c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z));
        synchronized (this.ax) {
            if (TextUtils.isEmpty(str2)) {
                this.as.remove(str);
                this.P.edit().remove(str).apply();
            } else {
                this.as.put(str, str2);
                if (z) {
                    this.P.edit().putString(str, str2).apply();
                }
            }
        }
    }
}
