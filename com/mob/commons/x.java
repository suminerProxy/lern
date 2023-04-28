package com.mob.commons;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.a;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.SharePrefrenceHelper;
import com.umeng.analytics.pro.am;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class x {
    private static x A;
    private SharePrefrenceHelper B;
    private static final String v = com.mob.commons.a.o.a("011m*fdgdeeehfd)mmLfdelgh");

    /* renamed from: a  reason: collision with root package name */
    public static final String f3705a = com.mob.commons.a.o.a("009KekBjWejee'i_efggegWf");
    public static final String b = com.mob.commons.a.o.a("010(ekXjNejee.i*ed8fi2eh8i");
    public static final String c = com.mob.commons.a.o.a("010Jek<j)ejeeeled@f%eieh:i");

    /* renamed from: d  reason: collision with root package name */
    public static final String f3706d = com.mob.commons.a.o.a("009Sek*jNejeeeledfeegfe");

    /* renamed from: e  reason: collision with root package name */
    public static final String f3707e = com.mob.commons.a.o.a("010VekQj_ejeegheledfeegfe");

    /* renamed from: f  reason: collision with root package name */
    public static final String f3708f = com.mob.commons.a.o.a("010Pek$jEejeeeledfe?fIfe8e");

    /* renamed from: g  reason: collision with root package name */
    public static final String f3709g = com.mob.commons.a.o.a("018Lek=j6ejeeegei%e4eeelLj0emTe:ee+e_fdLeOegfe");

    /* renamed from: h  reason: collision with root package name */
    public static final String f3710h = com.mob.commons.a.o.a("0117ek,j>ejeeYff3eeelehghej");

    /* renamed from: i  reason: collision with root package name */
    public static final String f3711i = com.mob.commons.a.o.a("0114ekPj,ejee!ff;eeggeiLei");

    /* renamed from: j  reason: collision with root package name */
    public static final String f3712j = com.mob.commons.a.o.a("0317ek-j1ejeeelXjHemPe?eeed@f;fefdegGiIeeegQff)eeegeh eXefNkjYeePeIef9mj");

    /* renamed from: k  reason: collision with root package name */
    public static final String f3713k = com.mob.commons.a.o.a("012Dek-jRejeeVj2em9e[eeefelgifd");

    /* renamed from: l  reason: collision with root package name */
    public static final String f3714l = com.mob.commons.a.o.a("033:ek2j1ejeeelHj5em?eGeeRijk-eePj]em5eBeeefelgifdeeed?f?fefdegJi,eeSeAefUmj");

    /* renamed from: m  reason: collision with root package name */
    public static final String f3715m = com.mob.commons.a.o.a("032SekSj5ejeeelUj$emZeKee4ijk2eeQj'emEe^eeJk_egeieeed+f5fefdegEiMee,eKefDmj");

    /* renamed from: n  reason: collision with root package name */
    public static final String f3716n = com.mob.commons.a.o.a("0255ekOj7ejeegdedgigi8j6ei=ji^eefefdeheg^eJeffdelee+miKif");

    /* renamed from: o  reason: collision with root package name */
    public static final String f3717o = com.mob.commons.a.o.a("038 ek<jLejeeelCjSemSeZeeedUf!fefdeg_i4eegdedgigi]j]eiCji9eefefdeheg*e2effdelee$e)ef4mj");

    /* renamed from: p  reason: collision with root package name */
    public static final String f3718p = com.mob.commons.a.o.a("0228ek_jNejeeghefLmNedfeeg'eIfdeieeefelgifdeeImiPif");
    public static final String q = com.mob.commons.a.o.a("014Qgeefgiefeefeeggh-e@eeefelgifd");
    public static final String r = com.mob.commons.a.o.a("0187ek>j,ejeegeefgiefeefeefghRe*ee.d(eggh*d");
    public static final String s = com.mob.commons.a.o.a("030QekDj5ejeeel'j[emJeGeeed f4fefdegLi(eegeefgiefeefeefgh,e3eePe>ef.mj");
    public static final String t = com.mob.commons.a.o.a("012>ek<j]ejeeghgeefHeUeh$djBgh");
    public static final String u = com.mob.commons.a.o.a("022:ek+j9ejeeghgeefJe(ehZdjVghee8e'ef9mjYgh[eTeg_mf");
    private static final String w = com.mob.commons.a.o.a("019)ek8j3ejeeeg*ff;eeegehKe1efXkjPeeDeBef;mj");
    private static final String x = com.mob.commons.a.o.a("0124ek<jOejeeehPd2egelel6j'fegh");
    private static AtomicBoolean y = new AtomicBoolean(false);
    private static AtomicBoolean z = new AtomicBoolean(false);

    private x() {
        if (this.B == null) {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
            this.B = sharePrefrenceHelper;
            sharePrefrenceHelper.open(v, 1);
        }
    }

    public static synchronized x a() {
        x xVar;
        synchronized (x.class) {
            if (A == null) {
                A = new x();
            }
            xVar = A;
        }
        return xVar;
    }

    public static boolean b() {
        String str = v + h.l.a.a.c.f17369e + 1;
        if (MobSDK.getContext() != null) {
            try {
                File file = new File(new File(MobSDK.getContext().getFilesDir(), com.mob.commons.a.o.a("003Uhjfdgd")), str);
                if (file.exists()) {
                    if (file.length() > 0) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void j() {
        if (y.compareAndSet(false, true)) {
            new com.mob.tools.utils.f(com.mob.commons.a.o.a("004%gjjjijid")) { // from class: com.mob.commons.x.1
                @Override // com.mob.tools.utils.f
                public void a() {
                    Object obj = m.f3646h;
                    synchronized (obj) {
                        try {
                            obj.wait(600000L);
                            g.a().a(11);
                            ConcurrentHashMap<String, Object> e2 = b.e();
                            if (e2 != null && e2.size() > 0) {
                                g.a().a(12);
                                Object obj2 = e2.get("h");
                                Object obj3 = e2.get("k");
                                Object obj4 = e2.get(com.mob.commons.a.o.a("001Ogd"));
                                Object obj5 = e2.get(am.aB);
                                Object obj6 = e2.get(com.mob.commons.a.o.a("002Wehel"));
                                Object obj7 = e2.get(com.mob.commons.a.o.a("002Vgiel"));
                                e2.clear();
                                d.a(obj2, obj3, obj4, obj5, obj6, obj7);
                            }
                        }
                    }
                }
            }.start();
        }
        l();
    }

    private static String k() {
        return Data.MD5(DeviceHelper.getInstance(MobSDK.getContext()).getModel());
    }

    private static void l() {
        if (z.compareAndSet(false, true)) {
            new com.mob.tools.utils.f("DS-W") { // from class: com.mob.commons.x.2
                @Override // com.mob.tools.utils.f
                public void a() {
                    Object obj = m.f3647i;
                    synchronized (obj) {
                        try {
                            obj.wait();
                            ConcurrentHashMap<String, Object> f2 = b.f();
                            f2.clear();
                            d.a((ArrayList) f2.get(com.mob.commons.a.o.a("002.fe:e")), new com.mob.tools.utils.b<Void>(this) { // from class: com.mob.commons.x.2.1

                                /* renamed from: a  reason: collision with root package name */
                                public final /* synthetic */ AnonymousClass2 f3719a;

                                @Override // com.mob.tools.utils.b
                                public /* bridge */ /* synthetic */ void a(Void r1) {
                                }

                                /* renamed from: a  reason: avoid collision after fix types in other method */
                                public void a2(Void r1) {
                                }
                            });
                        }
                    }
                }
            }.start();
        }
    }

    public String c() {
        String b2 = b(t, (String) null);
        if (TextUtils.isEmpty(b2)) {
            return b2;
        }
        try {
            String k2 = k();
            return Data.AES128PaddingDecode(k2.getBytes("UTF-8"), Base64.decode(b2, 0));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return b2;
        }
    }

    public String d() {
        String b2 = b("key_gfrt", (String) null);
        if (TextUtils.isEmpty(b2)) {
            return b2;
        }
        try {
            String k2 = k();
            return Data.AES128PaddingDecode(k2.getBytes("UTF-8"), Base64.decode(b2, 0));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return b2;
        }
    }

    public void e() {
        b((String) null);
        c(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<Long, Long> f() {
        HashMap fromJson;
        String string = this.B.getString(w);
        HashMap<Long, Long> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(string) && (fromJson = HashonHelper.fromJson(string)) != null && !fromJson.isEmpty()) {
            for (Map.Entry entry : fromJson.entrySet()) {
                if (entry != null) {
                    try {
                        hashMap.put(Long.valueOf(Long.parseLong((String) entry.getKey())), entry.getValue());
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                    }
                }
            }
        }
        return hashMap;
    }

    public HashMap<String, Object> g() {
        String b2 = b(x, (String) null);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return HashonHelper.fromJson(b2);
    }

    public a.c h() {
        return a.c.a(b("key_duid_param_blacklist", (String) null));
    }

    public a.C0084a i() {
        try {
            String b2 = b("key_duid_entity", (String) null);
            if (!TextUtils.isEmpty(b2)) {
                return a.C0084a.a(Data.AES128Decode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), Base64.decode(b2, 0)));
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return null;
    }

    public void a(String str, long j2) {
        this.B.putLong(str, Long.valueOf(j2));
    }

    public void a(String str, int i2) {
        this.B.putInt(str, Integer.valueOf(i2));
    }

    public boolean a(String str, boolean z2) {
        return this.B.getBoolean(str, z2);
    }

    public long b(String str, long j2) {
        return this.B.getLong(str, j2);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.B.remove(str);
        } else {
            this.B.putString(str, str2);
        }
    }

    public int b(String str, int i2) {
        return this.B.getInt(str, i2);
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(Data.AES128Encode(k(), str), 0);
                a(u, System.currentTimeMillis());
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        a("key_gfrt", str);
    }

    public void d(String str, String str2) {
        a(com.mob.commons.a.o.a("011HekHj2ejee6i>fd:mFegefelee") + str, str2);
    }

    public String b(String str, String str2) {
        return this.B.getString(str, str2);
    }

    public void a(String str, Object obj) {
        this.B.put(str, obj);
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(Data.AES128Encode(k(), str), 0);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        a(t, str);
    }

    public Object a(String str) {
        return this.B.get(str);
    }

    public void a(HashMap<Long, Long> hashMap) {
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, Long> entry : hashMap.entrySet()) {
                    if (entry != null) {
                        hashMap2.put(String.valueOf(entry.getKey()), entry.getValue());
                    }
                }
                this.B.putString(w, HashonHelper.fromHashMap(hashMap2));
                return;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return;
            }
        }
        this.B.remove(w);
    }

    public String c(String str, String str2) {
        return b(com.mob.commons.a.o.a("0116ekNj%ejee:i_fd5m1egefelee") + str, str2);
    }

    public void b(HashMap<String, Object> hashMap) {
        a(x, HashonHelper.fromHashMap(hashMap));
    }

    public void a(a.c cVar) {
        a("key_duid_param_blacklist", cVar != null ? cVar.a() : null);
    }

    public void a(a.C0084a c0084a) {
        String str = null;
        if (c0084a != null) {
            try {
                str = c0084a.a();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
                return;
            }
        }
        a("key_duid_entity", Base64.encodeToString(Data.AES128Encode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), str), 0));
    }
}
