package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static int f9666a = 1000;
    public static long b = 259200000;

    /* renamed from: d  reason: collision with root package name */
    private static ac f9667d;

    /* renamed from: i  reason: collision with root package name */
    private static String f9668i;
    public final ak c;

    /* renamed from: e  reason: collision with root package name */
    private final List<o> f9669e;

    /* renamed from: f  reason: collision with root package name */
    private final StrategyBean f9670f;

    /* renamed from: g  reason: collision with root package name */
    private StrategyBean f9671g = null;

    /* renamed from: h  reason: collision with root package name */
    private Context f9672h;

    private ac(Context context, List<o> list) {
        this.f9672h = context;
        if (aa.a(context) != null) {
            String str = aa.a(context).H;
            if ("oversea".equals(str)) {
                StrategyBean.f9207a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f9207a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f9670f = new StrategyBean();
        this.f9669e = list;
        this.c = ak.a();
    }

    public static StrategyBean d() {
        byte[] bArr;
        List<y> a2 = w.a().a(2);
        if (a2 == null || a2.size() <= 0 || (bArr = a2.get(0).f9996g) == null) {
            return null;
        }
        return (StrategyBean) ap.a(bArr, StrategyBean.CREATOR);
    }

    public final StrategyBean c() {
        StrategyBean strategyBean = this.f9671g;
        if (strategyBean != null) {
            if (!ap.d(strategyBean.q)) {
                this.f9671g.q = StrategyBean.f9207a;
            }
            if (!ap.d(this.f9671g.r)) {
                this.f9671g.r = StrategyBean.b;
            }
            return this.f9671g;
        }
        if (!ap.b(f9668i) && ap.d(f9668i)) {
            StrategyBean strategyBean2 = this.f9670f;
            String str = f9668i;
            strategyBean2.q = str;
            strategyBean2.r = str;
        }
        return this.f9670f;
    }

    public final synchronized boolean b() {
        return this.f9671g != null;
    }

    public static synchronized ac a(Context context, List<o> list) {
        ac acVar;
        synchronized (ac.class) {
            if (f9667d == null) {
                f9667d = new ac(context, list);
            }
            acVar = f9667d;
        }
        return acVar;
    }

    public static synchronized ac a() {
        ac acVar;
        synchronized (ac.class) {
            acVar = f9667d;
        }
        return acVar;
    }

    public final void a(StrategyBean strategyBean, boolean z) {
        al.c("[Strategy] Notify %s", s.class.getName());
        s.a(strategyBean, z);
        for (o oVar : this.f9669e) {
            try {
                al.c("[Strategy] Notify %s", oVar.getClass().getName());
                oVar.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void a(String str) {
        if (!ap.b(str) && ap.d(str)) {
            f9668i = str;
        } else {
            al.d("URL user set is invalid.", new Object[0]);
        }
    }

    public final void a(bt btVar) {
        Map<String, String> map;
        if (btVar == null) {
            return;
        }
        StrategyBean strategyBean = this.f9671g;
        if (strategyBean == null || btVar.f9897h != strategyBean.f9219o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f9210f = btVar.f9892a;
            strategyBean2.f9212h = btVar.c;
            strategyBean2.f9211g = btVar.b;
            if (ap.b(f9668i) || !ap.d(f9668i)) {
                if (ap.d(btVar.f9893d)) {
                    al.c("[Strategy] Upload url changes to %s", btVar.f9893d);
                    strategyBean2.q = btVar.f9893d;
                }
                if (ap.d(btVar.f9894e)) {
                    al.c("[Strategy] Exception upload url changes to %s", btVar.f9894e);
                    strategyBean2.r = btVar.f9894e;
                }
            }
            bs bsVar = btVar.f9895f;
            if (bsVar != null && !ap.b(bsVar.f9888a)) {
                strategyBean2.s = btVar.f9895f.f9888a;
            }
            long j2 = btVar.f9897h;
            if (j2 != 0) {
                strategyBean2.f9219o = j2;
            }
            if (btVar != null && (map = btVar.f9896g) != null && map.size() > 0) {
                Map<String, String> map2 = btVar.f9896g;
                strategyBean2.t = map2;
                String str = map2.get("B11");
                strategyBean2.f9213i = str != null && str.equals("1");
                String str2 = btVar.f9896g.get("B3");
                if (str2 != null) {
                    strategyBean2.w = Long.parseLong(str2);
                }
                int i2 = btVar.f9901l;
                strategyBean2.f9220p = i2;
                strategyBean2.v = i2;
                String str3 = btVar.f9896g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt > 0) {
                            strategyBean2.u = parseInt;
                        }
                    } catch (Exception e2) {
                        if (!al.a(e2)) {
                            e2.printStackTrace();
                        }
                    }
                }
                String str4 = btVar.f9896g.get("B25");
                strategyBean2.f9215k = str4 != null && str4.equals("1");
            }
            al.a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f9210f), Boolean.valueOf(strategyBean2.f9212h), Boolean.valueOf(strategyBean2.f9211g), Boolean.valueOf(strategyBean2.f9213i), Boolean.valueOf(strategyBean2.f9214j), Boolean.valueOf(strategyBean2.f9217m), Boolean.valueOf(strategyBean2.f9218n), Long.valueOf(strategyBean2.f9220p), Boolean.valueOf(strategyBean2.f9215k), Long.valueOf(strategyBean2.f9219o));
            this.f9671g = strategyBean2;
            if (!ap.d(btVar.f9893d)) {
                al.c("[Strategy] download url is null", new Object[0]);
                this.f9671g.q = "";
            }
            if (!ap.d(btVar.f9894e)) {
                al.c("[Strategy] download crashurl is null", new Object[0]);
                this.f9671g.r = "";
            }
            w.a().b(2);
            y yVar = new y();
            yVar.b = 2;
            yVar.f9992a = strategyBean2.f9208d;
            yVar.f9994e = strategyBean2.f9209e;
            yVar.f9996g = ap.a(strategyBean2);
            w.a().a(yVar);
            a(strategyBean2, true);
        }
    }
}
