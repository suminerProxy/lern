package h.y.a.f;

import android.content.Context;

/* compiled from: Constants.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class k {
    public static String D = null;
    public static final String E = "fa81168e609d46ac86f1818bc65477b2";
    public static final String F = "K0HRmPk6FjPRuVHD";

    /* renamed from: a  reason: collision with root package name */
    public static final String f26070a = "FlagStr";
    public static boolean b = false;
    public static final String c = "/file/upimg";

    /* renamed from: d  reason: collision with root package name */
    public static final String f26071d = "/file/upvideo";

    /* renamed from: e  reason: collision with root package name */
    public static final String f26072e = "订单号：%1$s";

    /* renamed from: f  reason: collision with root package name */
    public static final String f26073f = "bean";

    /* renamed from: g  reason: collision with root package name */
    public static final String f26074g = "86_CN";

    /* renamed from: h  reason: collision with root package name */
    public static final String f26075h = "wx12b7d44cbee77259";

    /* renamed from: i  reason: collision with root package name */
    public static final int f26076i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f26077j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f26078k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f26079l = 5;

    /* renamed from: m  reason: collision with root package name */
    public static final int f26080m = 6;

    /* renamed from: n  reason: collision with root package name */
    public static final int f26081n = 7;

    /* renamed from: o  reason: collision with root package name */
    public static final int f26082o = 8;

    /* renamed from: p  reason: collision with root package name */
    public static final int f26083p = 100;
    public static int q = 322;
    private static Context r = null;
    public static boolean s = false;
    public static String t = null;
    public static String u = null;
    public static String v = null;
    public static String w = null;
    public static String x = null;
    public static String y = null;
    public static String z = "/appv2";
    public static String A = z + "/order/";
    public static String B = "/appnjv2/";
    public static String C = z + "/pay/";
    public static boolean G = true;
    public static a H = a.PD;

    /* compiled from: Constants.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public enum a {
        Pre,
        Dev,
        PD
    }

    public static void a(String str) {
        if (str.contains("EnvPre")) {
            G = false;
            H = a.Pre;
            t = "https://pre2-api.showstart.com";
            u = "https://pre2-uploadfile.showstart.com";
            D = "http://pre-getoken-api.showstart.com/";
            v = "https://pre2-wap.showstart.com/";
            w = "pre_ticket";
            x = "pre_user";
            y = "pre_goods";
        } else if (!str.contains("EnvDev") && !str.contains("EnvDev_64")) {
            H = a.PD;
            t = "https://pro2-api.showstart.com";
            u = "https://uploadfile.showstart.com";
            D = "http://getoken-api.showstart.com/";
            v = "https://wap.showstart.com/";
            w = "showstart_ticket";
            x = "test";
            y = "3HQCPQQA9ik4f8fK";
        } else {
            G = false;
            H = a.Dev;
            t = "https://dev2-api.showstart.com";
            u = "https://dev2-uploadfile.showstart.com";
            D = "http://dev-getoken-api.showstart.com/";
            v = "https://dev2-wap.showstart.com/";
            w = "dev_ticket";
            x = "dev_user";
            y = "dev_goods";
        }
    }

    public static Context b() {
        return r;
    }

    public static void c(Context context) {
        r = context.getApplicationContext();
    }

    public static void d(Boolean bool) {
        s = bool.booleanValue();
    }
}
