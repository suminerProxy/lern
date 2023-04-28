package h.y.a.n;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: NetworkUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f26345a = "NONE";
    public static final String b = "WIFI";
    public static final String c = "2G";

    /* renamed from: d  reason: collision with root package name */
    public static final String f26346d = "3G";

    /* renamed from: e  reason: collision with root package name */
    public static final String f26347e = "4G";

    /* renamed from: f  reason: collision with root package name */
    public static final String f26348f = "5G";

    /* renamed from: g  reason: collision with root package name */
    public static final String f26349g = "MOBILE";

    public static String a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) h.y.a.f.k.b().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype != 20) {
                    switch (subtype) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return f26349g;
                    }
                }
                return f26348f;
            }
        }
        return f26345a;
    }

    public static boolean b() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) h.y.a.f.k.b().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }
}
