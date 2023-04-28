package com.baidu.location.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.baidu.location.BDLocation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f {
    private static String I = null;
    private static double K = 100.0d;
    private static float N = -1.0f;

    /* renamed from: a  reason: collision with root package name */
    public static int f1368a = 0;
    public static String b = "";

    /* renamed from: d  reason: collision with root package name */
    private static f f1369d;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static long v;
    private boolean A;
    private long B;
    private double C;
    private double D;
    private double E;
    private long F;
    private long G;
    private long H;
    private e J;
    private long L;
    private long M;
    private a O;
    private b P;
    private ArrayList<ArrayList<Float>> Q;
    private ArrayList<ArrayList<Float>> R;
    private ArrayList<ArrayList<Float>> S;
    private ArrayList<ArrayList<Float>> T;
    private ArrayList<ArrayList<Float>> U;
    private String V;
    private long W;
    private ArrayList<Integer> X;
    private String Y;
    private long Z;
    private long aa;
    private long ab;
    private BDLocation ac;
    private boolean ad;
    private boolean ae;
    private long af;
    private String ag;
    public long c;

    /* renamed from: e  reason: collision with root package name */
    private Context f1370e;

    /* renamed from: f  reason: collision with root package name */
    private LocationManager f1371f;

    /* renamed from: g  reason: collision with root package name */
    private Location f1372g;

    /* renamed from: h  reason: collision with root package name */
    private C0030f f1373h;

    /* renamed from: i  reason: collision with root package name */
    private h f1374i;

    /* renamed from: j  reason: collision with root package name */
    private GpsStatus f1375j;

    /* renamed from: k  reason: collision with root package name */
    private c f1376k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1377l;

    /* renamed from: m  reason: collision with root package name */
    private d f1378m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1379n;

    /* renamed from: o  reason: collision with root package name */
    private GpsStatus.NmeaListener f1380o;

    /* renamed from: p  reason: collision with root package name */
    private OnNmeaMessageListener f1381p;
    private long w;
    private boolean x;
    private boolean y;
    private String z;

    @TargetApi(24)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends GnssMeasurementsEvent.Callback {

        /* renamed from: a  reason: collision with root package name */
        public int f1382a;
        public String b;

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(int i2) {
        }
    }

    @TargetApi(24)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends GnssNavigationMessage.Callback {

        /* renamed from: a  reason: collision with root package name */
        public int f1383a;
        public final /* synthetic */ f b;

        private b(f fVar) {
        }

        public /* synthetic */ b(f fVar, com.baidu.location.c.g gVar) {
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage) {
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onStatusChanged(int i2) {
        }
    }

    @TargetApi(24)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f1384a;

        private c(f fVar) {
        }

        public /* synthetic */ c(f fVar, com.baidu.location.c.g gVar) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i2) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class d implements GpsStatus.Listener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f1385a;
        private long b;

        private d(f fVar) {
        }

        public /* synthetic */ d(f fVar, com.baidu.location.c.g gVar) {
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class e extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<f> f1386a;
        public f b;

        public e(f fVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* renamed from: com.baidu.location.c.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C0030f implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f1387a;

        private C0030f(f fVar) {
        }

        public /* synthetic */ C0030f(f fVar, com.baidu.location.c.g gVar) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class g implements GpsStatus.NmeaListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f1388a;

        private g(f fVar) {
        }

        public /* synthetic */ g(f fVar, com.baidu.location.c.g gVar) {
        }

        @Override // android.location.GpsStatus.NmeaListener
        public void onNmeaReceived(long j2, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class h implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f1389a;
        private long b;

        private h(f fVar) {
        }

        public /* synthetic */ h(f fVar, com.baidu.location.c.g gVar) {
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

    private f() {
    }

    public static /* synthetic */ int a(int i2) {
    }

    public static /* synthetic */ long a(long j2) {
    }

    public static /* synthetic */ long a(f fVar, long j2) {
    }

    public static /* synthetic */ GpsStatus a(f fVar, GpsStatus gpsStatus) {
    }

    public static /* synthetic */ e a(f fVar) {
    }

    public static synchronized f a() {
    }

    public static String a(Location location) {
    }

    private String a(ArrayList<ArrayList<Float>> arrayList) {
    }

    public static /* synthetic */ ArrayList a(f fVar, ArrayList arrayList, boolean z, float f2) {
    }

    public static /* synthetic */ ArrayList a(f fVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f2) {
    }

    private ArrayList<ArrayList<Float>> a(ArrayList<ArrayList<Float>> arrayList, boolean z, float f2) {
    }

    private ArrayList<ArrayList<Float>> a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f2) {
    }

    public static /* synthetic */ void a(f fVar, Location location) {
    }

    public static /* synthetic */ void a(f fVar, String str) {
    }

    public static /* synthetic */ void a(f fVar, String str, Location location) {
    }

    public static /* synthetic */ void a(f fVar, ArrayList arrayList) {
    }

    public static /* synthetic */ void a(f fVar, boolean z) {
    }

    private void a(String str) {
    }

    private void a(String str, int i2, int i3, int i4) {
    }

    private void a(String str, Location location) {
    }

    public static boolean a(Location location, Location location2, boolean z) {
    }

    public static /* synthetic */ int b(int i2) {
    }

    public static /* synthetic */ long b(f fVar, long j2) {
    }

    public static String b(Location location) {
    }

    public static /* synthetic */ ArrayList b(f fVar, ArrayList arrayList) {
    }

    public static /* synthetic */ void b(f fVar, Location location) {
    }

    private void b(ArrayList<ArrayList<Float>> arrayList) {
    }

    private void b(boolean z) {
    }

    public static /* synthetic */ boolean b(f fVar) {
    }

    public static /* synthetic */ boolean b(f fVar, boolean z) {
    }

    private boolean b(String str) {
    }

    public static /* synthetic */ int c(int i2) {
    }

    public static /* synthetic */ long c(f fVar) {
    }

    public static /* synthetic */ long c(f fVar, long j2) {
    }

    public static String c(Location location) {
    }

    public static /* synthetic */ String c(f fVar, ArrayList arrayList) {
    }

    public static /* synthetic */ int d(int i2) {
    }

    public static /* synthetic */ long d(f fVar) {
    }

    public static /* synthetic */ long d(f fVar, long j2) {
    }

    private void d(Location location) {
    }

    public static /* synthetic */ int e(int i2) {
    }

    private int e(Location location) {
    }

    public static /* synthetic */ long e(f fVar) {
    }

    public static /* synthetic */ long e(f fVar, long j2) {
    }

    public static /* synthetic */ long f(f fVar, long j2) {
    }

    public static /* synthetic */ LocationManager f(f fVar) {
    }

    private void f(Location location) {
    }

    public static /* synthetic */ ArrayList g(f fVar) {
    }

    public static /* synthetic */ ArrayList h(f fVar) {
    }

    public static /* synthetic */ ArrayList i(f fVar) {
    }

    public static /* synthetic */ ArrayList j(f fVar) {
    }

    public static /* synthetic */ ArrayList k(f fVar) {
    }

    public static /* synthetic */ GpsStatus l(f fVar) {
    }

    public static String l() {
    }

    public void a(boolean z) {
    }

    public synchronized void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public synchronized void e() {
    }

    public String f() {
    }

    public Location g() {
    }

    public BDLocation h() {
    }

    public boolean i() {
    }

    public boolean j() {
    }

    public void k() {
    }

    public synchronized String m() {
    }

    public void n() {
    }
}
