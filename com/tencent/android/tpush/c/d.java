package com.tencent.android.tpush.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.c.a.e;
import com.tencent.android.tpush.c.a.f;
import com.tencent.android.tpush.c.a.g;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.h;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.service.util.SharePrefsUtil;
import com.tencent.tpns.baseapi.base.util.ChannelUtils;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f8644a = "";
    public static String b = "";
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f8645d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f8646e = "";

    /* renamed from: f  reason: collision with root package name */
    public static String f8647f = "";

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f8648g = Boolean.FALSE;

    /* renamed from: h  reason: collision with root package name */
    public static String f8649h = "";

    /* renamed from: i  reason: collision with root package name */
    private static volatile d f8650i = null;

    /* renamed from: j  reason: collision with root package name */
    private static volatile c f8651j = null;

    /* renamed from: k  reason: collision with root package name */
    private static volatile c f8652k = null;

    /* renamed from: l  reason: collision with root package name */
    private static volatile c f8653l = null;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f8654m;

    /* renamed from: n  reason: collision with root package name */
    private Boolean f8655n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f8656o;

    /* renamed from: p  reason: collision with root package name */
    private Context f8657p;
    private int q = -1;

    private d(Context context) {
        this.f8657p = null;
        this.f8657p = context;
        this.f8657p = context;
        if (h.a(context).c() && XGPushConfig.isUsedFcmPush(context)) {
            f8653l = new com.tencent.android.tpush.c.a.a();
        }
        f8652k = b(this.f8657p);
        if (m()) {
            f8651j = f8652k;
        } else if (n()) {
            f8651j = f8653l;
        } else {
            f8651j = f8652k;
        }
    }

    private c b(Context context) {
        c eVar;
        try {
            String i2 = i();
            if (com.tencent.android.tpush.e.a.b(this.f8657p)) {
                TLogger.ii("OtherPushManager", "USE XgSys");
                eVar = new com.tencent.android.tpush.c.a.h(this.f8657p);
            } else {
                if (!ChannelUtils.isBrandXiaoMi() && !ChannelUtils.isBrandBlackShark()) {
                    if (!ChannelUtils.isBrandHuaWei() && !ChannelUtils.isBrandHonor() && !ChannelUtils.isEmuiOrOhosVersion()) {
                        if (ChannelUtils.isBrandMeiZu()) {
                            TLogger.ii("OtherPushManager", "USE meizu");
                            eVar = new com.tencent.android.tpush.c.a.d();
                        } else {
                            if (!"oppo".equals(i2) && !"oneplus".equals(i2) && !"realme".equals(i2)) {
                                if ("vivo".equals(i2)) {
                                    TLogger.ii("OtherPushManager", "USE vivo");
                                    eVar = new g();
                                } else {
                                    TLogger.ii("OtherPushManager", "deviceType: " + i2);
                                    return null;
                                }
                            }
                            TLogger.ii("OtherPushManager", "USE oppo");
                            eVar = new f();
                        }
                    }
                    if (ChannelUtils.isBrandHonor() && ChannelUtils.isHonorVersionOver6() && com.tencent.android.tpush.c.a.b.b() > 0) {
                        TLogger.ii("OtherPushManager", "USE honor");
                        eVar = new com.tencent.android.tpush.c.a.b();
                    } else {
                        TLogger.ii("OtherPushManager", "USE huawei");
                        eVar = new com.tencent.android.tpush.c.a.c();
                    }
                }
                TLogger.ii("OtherPushManager", "USE xiaomi");
                eVar = new e();
            }
            return eVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String i() {
        String str = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str) ? str.trim().toLowerCase() : str;
    }

    public boolean a() {
        if (f8651j == null || this.f8657p == null) {
            return false;
        }
        return f8651j.d(this.f8657p);
    }

    public void c() {
        if (f8651j == null || this.f8657p == null || !f8651j.d(this.f8657p)) {
            return;
        }
        f8651j.a(this.f8657p);
    }

    public void d() {
        if (f8651j == null || this.f8657p == null || !f8651j.d(this.f8657p)) {
            return;
        }
        f8651j.b(this.f8657p);
    }

    public String e() {
        if (f8651j == null || this.f8657p == null || !f8651j.d(this.f8657p)) {
            return null;
        }
        return f8651j.c(this.f8657p);
    }

    public String f() {
        if (f8651j == null || this.f8657p == null || !f8651j.d(this.f8657p)) {
            return null;
        }
        return f8651j.f(this.f8657p);
    }

    public String g() {
        if (f8652k == null || this.f8657p == null || !f8652k.d(this.f8657p)) {
            return null;
        }
        return f8652k.c(this.f8657p);
    }

    public String h() {
        if (f8653l == null || this.f8657p == null || !f8653l.d(this.f8657p)) {
            return null;
        }
        return f8653l.c(this.f8657p);
    }

    public String j() {
        if (f8651j != null) {
            return f8651j.a();
        }
        return null;
    }

    public boolean k() {
        if (f8651j == null || this.f8657p == null) {
            return false;
        }
        if (this.f8654m == null) {
            this.f8654m = Boolean.valueOf(f8651j.d(this.f8657p));
        }
        return this.f8654m.booleanValue();
    }

    public boolean l() {
        return m() || n();
    }

    public boolean m() {
        try {
            if (f8652k == null || this.f8657p == null) {
                return false;
            }
            if (this.f8656o == null) {
                this.f8656o = Boolean.valueOf(f8652k.d(this.f8657p));
            }
            return this.f8656o.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean n() {
        try {
            if (f8653l == null || this.f8657p == null) {
                return false;
            }
            if (this.f8655n == null) {
                this.f8655n = Boolean.valueOf(f8653l.d(this.f8657p));
            }
            return this.f8655n.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void o() {
        this.f8656o = null;
        this.f8655n = null;
    }

    public void p() {
        try {
            String h2 = h();
            String g2 = g();
            boolean z = !i.b(h2);
            boolean z2 = !i.b(g2);
            if (z && z2) {
                if (XGPushConfig.isUseFcmFirst(this.f8657p)) {
                    f8651j = f8653l;
                } else {
                    f8651j = f8652k;
                }
            } else if (z) {
                f8651j = f8653l;
            } else if (z2) {
                f8651j = f8652k;
            } else {
                TLogger.i("OtherPushManager", "don't have valid token");
            }
        } catch (Throwable unused) {
        }
    }

    public static d a(Context context) {
        if (f8650i == null) {
            synchronized (d.class) {
                if (f8650i == null) {
                    f8650i = new d(context);
                }
            }
        }
        return f8650i;
    }

    public static void c(Context context, String str) {
        c = str;
    }

    public static void d(Context context, String str) {
        f8645d = str;
    }

    public static void e(Context context, String str) {
        f8646e = str;
    }

    public static void f(Context context, String str) {
        f8647f = str;
    }

    public static void a(Context context, String str, String str2) {
        try {
            if (str2.equals(SharePrefsUtil.getString(context, Constants.OTHER_PUSH_ERROR_CODE, ""))) {
                return;
            }
            SharePrefsUtil.setString(context, Constants.OTHER_PUSH_ERROR_CODE, str2);
        }
    }

    public static void a(Context context, String str) {
        f8644a = str;
    }

    public static void a(Context context, boolean z) {
        f8648g = Boolean.valueOf(z);
    }

    public boolean b() {
        if (f8651j != null && this.f8657p != null) {
            r1 = f8651j.e(this.f8657p) == 8;
            if (r1) {
                TLogger.ii("OtherPushManager", "UseXgSysDevice!");
            }
        }
        return r1;
    }

    public static void b(Context context, String str) {
        b = str;
    }
}
