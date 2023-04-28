package com.mob.tools.b;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.a.c;
import com.mob.tools.a.d;
import com.mob.tools.log.NLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ThreadLocal<Boolean> f4421a = new ThreadLocal<>();
    public static ThreadLocal<Boolean> b = new ThreadLocal<>();
    public static ThreadLocal<Boolean> c = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f4422d = Arrays.asList("bgmdl", "gmnft", "gbrd", "govsit", "govsnm", "golgu", "gocnty", "galgu", "gtmne", "gsnmd", "gpgnm", "gpnmmt", "gpvsnm", "gpvsme", "cinmnps", "ckpmsi", "gaplcn", "gpgif", "gpgiffist", "gbrdm", "unrgrcv", "rgrcv", "gcrtpcnm", "gscpt", "cird", "cknavbl", "ipgist", "ckua", "ubenbl", "dvenbl", "vnmt", "iwpxy", "cx", "degb", "istvdv", "gdtlnktpfs", "gpgiffcin", "gpgifstrg", "gtaif", "gtaifprm", "rsaciy", "gisi", "gsnmdfp", "gcrie", "gcriefce", "gdvk", "gdvkfc", "gssn");

    @b
    public static Object a(String str, ArrayList<Object> arrayList) {
        try {
            return b(str, arrayList);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return null;
        }
    }

    private static Object b(String str, ArrayList<Object> arrayList) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.mob.tools.a.a a2 = a(str);
        if ("cird".equals(str)) {
            return Boolean.valueOf(a2.a());
        }
        if ("cx".equals(str)) {
            return Boolean.valueOf(a2.b());
        }
        if ("ckpd".equals(str)) {
            return Boolean.valueOf(a2.c());
        }
        if ("degb".equals(str)) {
            return Boolean.valueOf(a2.d());
        }
        if ("vnmt".equals(str)) {
            return Boolean.valueOf(a2.e());
        }
        if ("ckua".equals(str)) {
            return Boolean.valueOf(a2.f());
        }
        if ("dvenbl".equals(str)) {
            return Boolean.valueOf(a2.g());
        }
        if ("ubenbl".equals(str)) {
            return Boolean.valueOf(a2.h());
        }
        if ("iwpxy".equals(str)) {
            return Boolean.valueOf(a2.i());
        }
        if ("ismlt".equals(str)) {
            return Boolean.valueOf(a2.j());
        }
        if ("ifkps".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return Boolean.valueOf(a2.a((String) arrayList.get(0)));
            }
            throw new Throwable("array illegal: " + arrayList);
        } else if ("istvdv".equals(str)) {
            return Boolean.valueOf(a2.k());
        } else {
            if ("gsrln".equals(str)) {
                return a2.l();
            }
            if ("gavti".equals(str)) {
                return a2.m();
            }
            if ("gimi".equals(str)) {
                return a2.n();
            }
            if ("gimip".equals(str)) {
                if (arrayList != null && arrayList.size() == 1) {
                    return a2.a(((Boolean) arrayList.get(0)).booleanValue());
                }
                throw new Throwable("array illegal: " + arrayList);
            } else if ("gimimem".equals(str)) {
                return a2.o();
            } else {
                if ("gisi".equals(str)) {
                    return a2.p();
                }
                if ("gisip".equals(str)) {
                    if (arrayList != null && arrayList.size() == 1) {
                        return a2.b(((Boolean) arrayList.get(0)).booleanValue());
                    }
                    throw new Throwable("array illegal: " + arrayList);
                } else if ("qryisi".equals(str)) {
                    return a2.q();
                } else {
                    if ("gsimt".equals(str)) {
                        return a2.r();
                    }
                    if ("gbsi".equals(str)) {
                        return a2.s();
                    }
                    if ("gcrie".equals(str)) {
                        return a2.t();
                    }
                    if ("gcriefce".equals(str)) {
                        if (arrayList != null && arrayList.size() == 1) {
                            return a2.c(((Boolean) arrayList.get(0)).booleanValue());
                        }
                        throw new Throwable("array illegal: " + arrayList);
                    } else if ("gcrnmfce".equals(str)) {
                        if (arrayList != null && arrayList.size() == 1) {
                            return a2.d(((Boolean) arrayList.get(0)).booleanValue());
                        }
                        throw new Throwable("array illegal: " + arrayList);
                    } else if ("gcrnm".equals(str)) {
                        return a2.u();
                    } else {
                        if ("gssn".equals(str)) {
                            return a2.v();
                        }
                        if ("gmivsn".equals(str)) {
                            return a2.w();
                        }
                        if ("godmt".equals(str)) {
                            return a2.x();
                        }
                        if ("bgmdl".equals(str)) {
                            return a2.y();
                        }
                        if ("gmnft".equals(str)) {
                            return a2.z();
                        }
                        if ("gbrd".equals(str)) {
                            return a2.A();
                        }
                        if ("gdvtp".equals(str)) {
                            return a2.B();
                        }
                        if ("qriei".equals(str)) {
                            return a2.C();
                        }
                        if ("gbhnm".equals(str)) {
                            return a2.D();
                        }
                        if ("gcld".equals(str)) {
                            return Integer.valueOf(a2.E());
                        }
                        if ("gcllc".equals(str)) {
                            return Integer.valueOf(a2.F());
                        }
                        if ("gpcmt".equals(str)) {
                            return Integer.valueOf(a2.G());
                        }
                        if ("gcmlt".equals(str)) {
                            return Integer.valueOf(a2.H());
                        }
                        if ("gcmln".equals(str)) {
                            return Integer.valueOf(a2.I());
                        }
                        if ("gcmbd".equals(str)) {
                            return Integer.valueOf(a2.J());
                        }
                        if ("gcmsd".equals(str)) {
                            return Integer.valueOf(a2.K());
                        }
                        if ("gcmnd".equals(str)) {
                            return Integer.valueOf(a2.L());
                        }
                        if ("gnbclin".equals(str)) {
                            return a2.M();
                        }
                        if ("wmcwi".equals(str)) {
                            return a2.N();
                        }
                        if ("gavlwls".equals(str)) {
                            return a2.O();
                        }
                        if ("scwls".equals(str)) {
                            return Boolean.valueOf(a2.P());
                        }
                        if ("govsit".equals(str)) {
                            return Integer.valueOf(a2.Q());
                        }
                        if ("govsnm".equals(str)) {
                            return a2.R();
                        }
                        if ("golgu".equals(str)) {
                            return a2.S();
                        }
                        if ("gocnty".equals(str)) {
                            return a2.T();
                        }
                        if ("gcuin".equals(str)) {
                            return a2.U();
                        }
                        if ("gtydvin".equals(str)) {
                            return a2.V();
                        }
                        if ("gbtrstt".equals(str)) {
                            if (arrayList != null && arrayList.size() == 1) {
                                a2.a((Handler.Callback) arrayList.get(0));
                                return null;
                            }
                            throw new Throwable("array illegal: " + arrayList);
                        } else if ("gsnbtns".equals(str)) {
                            return Integer.valueOf(a2.W());
                        } else {
                            if ("gsnbtmd".equals(str)) {
                                return Integer.valueOf(a2.X());
                            }
                            if ("gqmkn".equals(str)) {
                                return a2.Y();
                            }
                            if ("gszin".equals(str)) {
                                return a2.Z();
                            }
                            if ("gmrin".equals(str)) {
                                return a2.aa();
                            }
                            if ("gabct".equals(str)) {
                                return Integer.valueOf(a2.ab());
                            }
                            if ("galgu".equals(str)) {
                                return a2.ac();
                            }
                            if ("gscsz".equals(str)) {
                                return a2.ad();
                            }
                            if ("gneyp".equals(str)) {
                                return a2.ae();
                            }
                            if ("gneypfce".equals(str)) {
                                if (arrayList != null && arrayList.size() == 1) {
                                    return a2.e(((Boolean) arrayList.get(0)).booleanValue());
                                }
                                throw new Throwable("array illegal: " + arrayList);
                            } else if ("gnktpfs".equals(str)) {
                                return a2.af();
                            } else {
                                if ("gdtlnktpfs".equals(str)) {
                                    return a2.ag();
                                }
                                if ("cknavbl".equals(str)) {
                                    return Boolean.valueOf(a2.ah());
                                }
                                if ("gdntp".equals(str)) {
                                    return Integer.valueOf(a2.ai());
                                }
                                if ("gcrslt".equals(str)) {
                                    return a2.aj();
                                }
                                if ("gtmne".equals(str)) {
                                    return a2.ak();
                                }
                                if ("gspt".equals(str)) {
                                    return a2.al();
                                }
                                if ("gcfre".equals(str)) {
                                    return a2.am();
                                }
                                if ("gctp".equals(str)) {
                                    return a2.an();
                                }
                                if ("gflv".equals(str)) {
                                    return a2.ao();
                                }
                                if ("gtrc".equals(str)) {
                                    return a2.ap();
                                }
                                if ("gbsbd".equals(str)) {
                                    return a2.aq();
                                }
                                if ("gbfspy".equals(str)) {
                                    return a2.ar();
                                }
                                if ("gbplfo".equals(str)) {
                                    return a2.as();
                                }
                                if ("gdvmua".equals(str)) {
                                    return a2.at();
                                }
                                if ("giads".equals(str)) {
                                    return a2.au();
                                }
                                if ("gia".equals(str)) {
                                    if (arrayList != null && arrayList.size() == 1) {
                                        return a2.f(((Boolean) arrayList.get(0)).booleanValue());
                                    }
                                    throw new Throwable("array illegal: " + arrayList);
                                } else if ("gal".equals(str)) {
                                    return a2.av();
                                } else {
                                    if ("gsl".equals(str)) {
                                        return a2.aw();
                                    }
                                    if ("glctn".equals(str)) {
                                        if (arrayList != null && arrayList.size() == 3) {
                                            return a2.a(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue(), ((Boolean) arrayList.get(2)).booleanValue());
                                        }
                                        throw new Throwable("array illegal: " + arrayList);
                                    } else if ("gstmpts".equals(str)) {
                                        if (arrayList != null && arrayList.size() == 1) {
                                            return a2.b((String) arrayList.get(0));
                                        }
                                        throw new Throwable("array illegal: " + arrayList);
                                    } else if ("gdvci".equals(str)) {
                                        return a2.ax();
                                    } else {
                                        if ("gdvk".equals(str)) {
                                            return a2.ay();
                                        }
                                        if ("gdvkfc".equals(str)) {
                                            if (arrayList != null && arrayList.size() == 1) {
                                                return a2.g(((Boolean) arrayList.get(0)).booleanValue());
                                            }
                                            throw new Throwable("array illegal: " + arrayList);
                                        } else if ("gdfrspg".equals(str)) {
                                            if (arrayList != null && arrayList.size() == 1) {
                                                return a2.c((String) arrayList.get(0));
                                            }
                                            throw new Throwable("array illegal: " + arrayList);
                                        } else if ("grsvps".equals(str)) {
                                            if (arrayList != null && arrayList.size() == 1) {
                                                return a2.d((String) arrayList.get(0));
                                            }
                                            throw new Throwable("array illegal: " + arrayList);
                                        } else if ("gdltmpg".equals(str)) {
                                            return a2.az();
                                        } else {
                                            if ("gdltm".equals(str)) {
                                                return a2.aA();
                                            }
                                            if ("gmlt".equals(str)) {
                                                return a2.aB();
                                            }
                                            if ("ipgist".equals(str)) {
                                                if (arrayList != null && arrayList.size() == 1) {
                                                    return Boolean.valueOf(a2.e((String) arrayList.get(0)));
                                                }
                                                throw new Throwable("array illegal: " + arrayList);
                                            } else if ("gscpt".equals(str)) {
                                                return a2.aC();
                                            } else {
                                                if ("gsnmd".equals(str)) {
                                                    return a2.aD();
                                                }
                                                if ("gsnmdfp".equals(str)) {
                                                    if (arrayList != null && arrayList.size() == 1) {
                                                        return a2.f((String) arrayList.get(0));
                                                    }
                                                    throw new Throwable("array illegal: " + arrayList);
                                                } else if ("gpgnm".equals(str)) {
                                                    return a2.aE();
                                                } else {
                                                    if ("gpnmmt".equals(str)) {
                                                        return a2.aF();
                                                    }
                                                    if ("gpnmfp".equals(str)) {
                                                        if (arrayList != null && arrayList.size() == 1) {
                                                            return a2.g((String) arrayList.get(0));
                                                        }
                                                        throw new Throwable("array illegal: " + arrayList);
                                                    } else if ("gpvsnm".equals(str)) {
                                                        return Integer.valueOf(a2.aG());
                                                    } else {
                                                        if ("gpvsme".equals(str)) {
                                                            return a2.aH();
                                                        }
                                                        if ("cinmnps".equals(str)) {
                                                            return Boolean.valueOf(a2.aI());
                                                        }
                                                        if ("gcrtpcnm".equals(str)) {
                                                            return a2.aJ();
                                                        }
                                                        if ("ciafgd".equals(str)) {
                                                            return Boolean.valueOf(a2.aK());
                                                        }
                                                        if ("ckpmsi".equals(str)) {
                                                            if (arrayList != null && arrayList.size() == 1) {
                                                                return Boolean.valueOf(a2.h((String) arrayList.get(0)));
                                                            }
                                                            throw new Throwable("array illegal: " + arrayList);
                                                        } else if ("crtavthd".equals(str)) {
                                                            return a2.aL();
                                                        } else {
                                                            if ("gaplcn".equals(str)) {
                                                                return a2.aM();
                                                            }
                                                            if ("qritsvc".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 2) {
                                                                    return a2.a((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("rsaciy".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 2) {
                                                                    return a2.b((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("gpgif".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 2) {
                                                                    return a2.a(false, 0, (String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("gpgiffcin".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 3) {
                                                                    return a2.a(((Boolean) arrayList.get(0)).booleanValue(), 0, (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("gpgifstrg".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 3) {
                                                                    return a2.a(false, ((Integer) arrayList.get(0)).intValue(), (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("gpgiffist".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 4) {
                                                                    return a2.a(((Boolean) arrayList.get(0)).booleanValue(), ((Integer) arrayList.get(1)).intValue(), (String) arrayList.get(2), ((Integer) arrayList.get(3)).intValue());
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("hdstipu".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 1) {
                                                                    a2.a((View) arrayList.get(0));
                                                                    return null;
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("swstin".equals(str)) {
                                                                if (arrayList != null && arrayList.size() == 1) {
                                                                    a2.b((View) arrayList.get(0));
                                                                    return null;
                                                                }
                                                                throw new Throwable("array illegal: " + arrayList);
                                                            } else if ("gdvda".equals(str)) {
                                                                return a2.aN();
                                                            } else {
                                                                if ("gdvdtnas".equals(str)) {
                                                                    return a2.aO();
                                                                }
                                                                if ("bsasm".equals(str)) {
                                                                    if (arrayList != null && arrayList.size() == 2) {
                                                                        return a2.a((String) arrayList.get(0), (String) arrayList.get(1));
                                                                    }
                                                                    throw new Throwable("array illegal: " + arrayList);
                                                                } else if ("galtut".equals(str)) {
                                                                    return Long.valueOf(a2.aP());
                                                                } else {
                                                                    if ("gbrdm".equals(str)) {
                                                                        return a2.aQ();
                                                                    }
                                                                    if ("gdvme".equals(str)) {
                                                                        return a2.aR();
                                                                    }
                                                                    if ("gdpyd".equals(str)) {
                                                                        return a2.aS();
                                                                    }
                                                                    if ("gfgrnt".equals(str)) {
                                                                        return a2.aT();
                                                                    }
                                                                    if ("grivsn".equals(str)) {
                                                                        return a2.aU();
                                                                    }
                                                                    if ("gcrup".equals(str)) {
                                                                        return a2.aV();
                                                                    }
                                                                    if ("gcifm".equals(str)) {
                                                                        return a2.aW();
                                                                    }
                                                                    if ("godm".equals(str)) {
                                                                        return a2.aX();
                                                                    }
                                                                    if ("godhm".equals(str)) {
                                                                        return a2.aY();
                                                                    }
                                                                    if ("gadm".equals(str)) {
                                                                        return a2.aZ();
                                                                    }
                                                                    if ("gvdm".equals(str)) {
                                                                        return a2.ba();
                                                                    }
                                                                    if ("gudm".equals(str)) {
                                                                        return a2.bb();
                                                                    }
                                                                    if ("galdm".equals(str)) {
                                                                        return a2.bc();
                                                                    }
                                                                    if ("unrgrcv".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 1) {
                                                                            a2.a((BroadcastReceiver) arrayList.get(0));
                                                                            return null;
                                                                        }
                                                                        throw new Throwable("array illegal: " + arrayList);
                                                                    } else if ("rgrcv".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 2) {
                                                                            a2.a((BroadcastReceiver) arrayList.get(0), (IntentFilter) arrayList.get(1));
                                                                            return null;
                                                                        }
                                                                        throw new Throwable("array illegal: " + arrayList);
                                                                    } else if ("rgwsr".equals(str)) {
                                                                        if (arrayList != null && arrayList.size() == 1) {
                                                                            a2.a((BlockingQueue) arrayList.get(0));
                                                                            return null;
                                                                        }
                                                                        throw new Throwable("array illegal: " + arrayList);
                                                                    } else if ("gtaif".equals(str)) {
                                                                        return a2.bd();
                                                                    } else {
                                                                        if ("gtaifok".equals(str)) {
                                                                            return a2.be();
                                                                        }
                                                                        if ("gtaifprm".equals(str)) {
                                                                            if (arrayList != null && arrayList.size() == 2) {
                                                                                return a2.a((String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
                                                                            }
                                                                            throw new Throwable("array illegal: " + arrayList);
                                                                        } else if ("gtaifprmfce".equals(str)) {
                                                                            if (arrayList != null && arrayList.size() == 3) {
                                                                                return a2.a(((Boolean) arrayList.get(0)).booleanValue(), (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
                                                                            }
                                                                            throw new Throwable("array illegal: " + arrayList);
                                                                        } else {
                                                                            return null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static com.mob.tools.a.a a(String str) {
        CountDownLatch d2;
        CountDownLatch d3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            NLog mobLog = MobLog.getInstance();
            mobLog.w("WARNING: Call in main: key = " + str);
            b();
        }
        if (!(f4421a.get() == null ? false : f4421a.get().booleanValue())) {
            if (!f4422d.contains(str) && !d.c() && (d3 = d.a(MobSDK.getContext()).d()) != null) {
                try {
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("dhs_ivkr k: " + str + ", cdl: " + d3, new Object[0]);
                    d3.await(3500L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        } else {
            boolean booleanValue = b.get() == null ? false : b.get().booleanValue();
            boolean booleanValue2 = c.get() == null ? false : c.get().booleanValue();
            if (booleanValue) {
                MobLog.getInstance().d("isGCFThread true", new Object[0]);
            }
            if (!booleanValue && !booleanValue2 && !d.c() && (d2 = d.a(MobSDK.getContext()).d()) != null) {
                try {
                    NLog mobLog3 = MobLog.getInstance();
                    mobLog3.d("dhs_ivkr_new k: " + str + ", cdl: " + d2, new Object[0]);
                    d2.await(3500L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
        return a();
    }

    private static com.mob.tools.a.a a() {
        if (d.c()) {
            return c.a(MobSDK.getContext()).f();
        }
        return c.a(MobSDK.getContext()).a();
    }

    private static void b() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null) {
                String str = "";
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement != null) {
                        str = str + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ChineseToPinyinResource.Field.LEFT_BRACKET + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")\n";
                    }
                }
                MobLog.getInstance().d(str, new Object[0]);
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
