package com.baidu.location.b;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClientOption;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class d {
    private static char[] q;

    /* renamed from: a  reason: collision with root package name */
    public String f1172a;
    public String b;
    public b c;

    /* renamed from: d  reason: collision with root package name */
    private Context f1173d;

    /* renamed from: e  reason: collision with root package name */
    private TelephonyManager f1174e;

    /* renamed from: f  reason: collision with root package name */
    private com.baidu.location.c.a f1175f;

    /* renamed from: g  reason: collision with root package name */
    private WifiManager f1176g;

    /* renamed from: h  reason: collision with root package name */
    private C0028d f1177h;

    /* renamed from: i  reason: collision with root package name */
    private String f1178i;

    /* renamed from: j  reason: collision with root package name */
    private String f1179j;

    /* renamed from: k  reason: collision with root package name */
    private LocationClientOption f1180k;

    /* renamed from: l  reason: collision with root package name */
    private a f1181l;

    /* renamed from: m  reason: collision with root package name */
    private String f1182m;

    /* renamed from: n  reason: collision with root package name */
    private String f1183n;

    /* renamed from: o  reason: collision with root package name */
    private String f1184o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1185p;
    private boolean r;
    private long s;
    private boolean t;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a {
        void onReceiveLocation(BDLocation bDLocation);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends com.baidu.location.e.e {

        /* renamed from: a  reason: collision with root package name */
        public String f1186a;
        public LocationManager b;
        public a c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1187d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f1188e;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a implements LocationListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f1189a;

            private a(b bVar) {
            }

            public /* synthetic */ a(b bVar, e eVar) {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i2, Bundle bundle) {
            }
        }

        public b(d dVar) {
        }

        public static /* synthetic */ void a(b bVar) {
        }

        private void b() {
        }

        private void c() {
        }

        @Override // com.baidu.location.e.e
        public void a() {
        }

        public void a(String str) {
        }

        @Override // com.baidu.location.e.e
        public void a(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String f1190a;
        public int b;
        public final /* synthetic */ d c;

        public c(d dVar, String str, int i2) {
        }
    }

    /* renamed from: com.baidu.location.b.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class C0028d {

        /* renamed from: a  reason: collision with root package name */
        public List<ScanResult> f1191a;
        public String b;
        private long c;

        /* renamed from: d  reason: collision with root package name */
        private String f1192d;

        /* renamed from: e  reason: collision with root package name */
        private int f1193e;

        public C0028d(List<ScanResult> list) {
        }

        private void b() {
        }

        public int a() {
        }

        public String a(int i2, String str, boolean z, int i3) {
        }
    }

    public d(Context context, LocationClientOption locationClientOption, a aVar, String str) {
    }

    public static com.baidu.location.c.a a(CellLocation cellLocation, TelephonyManager telephonyManager, com.baidu.location.c.a aVar) {
    }

    private Object a(Object obj, String str) throws Exception {
    }

    private String a(int i2) {
    }

    public static /* synthetic */ String a(d dVar) {
    }

    private String a(List<WifiConfiguration> list) {
    }

    public static /* synthetic */ void a(d dVar, int i2) {
    }

    public static /* synthetic */ void a(d dVar, String str) {
    }

    private void a(String str) {
    }

    public static boolean a(WifiManager wifiManager) {
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
    }

    public static String b(WifiManager wifiManager) {
    }

    public static /* synthetic */ String b(d dVar) {
    }

    private void b(int i2) {
    }

    public static /* synthetic */ LocationClientOption c(d dVar) {
    }

    public static /* synthetic */ a d(d dVar) {
    }

    private boolean d() {
    }

    private void e() {
    }

    public static /* synthetic */ boolean e(d dVar) {
    }

    public static /* synthetic */ Context f(d dVar) {
    }

    private List<WifiConfiguration> f() {
    }

    public void a() {
    }

    public String b() {
    }

    public void c() {
    }
}
