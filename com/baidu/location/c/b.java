package com.baidu.location.c;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import java.util.List;

@SuppressLint({"NewApi"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f1351a;
    public static int b;
    private static b c;

    /* renamed from: k  reason: collision with root package name */
    private static Class<?> f1352k;

    /* renamed from: d  reason: collision with root package name */
    private TelephonyManager f1353d;

    /* renamed from: e  reason: collision with root package name */
    private com.baidu.location.c.a f1354e;

    /* renamed from: f  reason: collision with root package name */
    private com.baidu.location.c.a f1355f;

    /* renamed from: g  reason: collision with root package name */
    private List<com.baidu.location.c.a> f1356g;

    /* renamed from: h  reason: collision with root package name */
    private C0029b f1357h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1358i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1359j;

    /* renamed from: l  reason: collision with root package name */
    private a f1360l;

    /* renamed from: m  reason: collision with root package name */
    private long f1361m;

    /* renamed from: n  reason: collision with root package name */
    private Handler f1362n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1363o;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends TelephonyManager.CellInfoCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1364a;

        private a(b bVar) {
        }

        public /* synthetic */ a(b bVar, AnonymousClass1 anonymousClass1) {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onError(int i2, Throwable th) {
        }
    }

    /* renamed from: com.baidu.location.c.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C0029b extends PhoneStateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1365a;

        public C0029b(b bVar) {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        }
    }

    private b() {
    }

    private static int a(int i2) {
    }

    public static int a(CellIdentityNr cellIdentityNr) {
    }

    public static int a(String str) {
    }

    @SuppressLint({"NewApi"})
    public static com.baidu.location.c.a a(CellInfo cellInfo, com.baidu.location.c.a aVar, TelephonyManager telephonyManager) {
    }

    private com.baidu.location.c.a a(CellLocation cellLocation) {
    }

    private com.baidu.location.c.a a(CellLocation cellLocation, boolean z) {
    }

    @SuppressLint({"NewApi"})
    public static com.baidu.location.c.a a(com.baidu.location.c.a aVar, TelephonyManager telephonyManager) {
    }

    public static synchronized b a() {
    }

    public static /* synthetic */ void a(b bVar) {
    }

    public static /* synthetic */ Handler b(b bVar) {
    }

    public static /* synthetic */ com.baidu.location.c.a c(b bVar) {
    }

    private void c(com.baidu.location.c.a aVar) {
    }

    @SuppressLint({"NewApi"})
    private String d(com.baidu.location.c.a aVar) {
    }

    private void i() {
    }

    private void j() {
    }

    private void k() {
    }

    public String a(com.baidu.location.c.a aVar) {
    }

    public String b(com.baidu.location.c.a aVar) {
    }

    public synchronized void b() {
    }

    public synchronized void c() {
    }

    public boolean d() {
    }

    public int e() {
    }

    public com.baidu.location.c.a f() {
    }

    public String g() {
    }

    public int h() {
    }
}
