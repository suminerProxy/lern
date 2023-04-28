package com.tencent.thumbplayer.tplayer.plugins.report;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.api.report.TPDefaultReportInfo;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import com.tencent.thumbplayer.utils.f;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b implements ITPBusinessReportManager, com.tencent.thumbplayer.tplayer.plugins.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13542a = null;
    private static final String b = null;
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f13543d;

    /* renamed from: i  reason: collision with root package name */
    private static com.tencent.thumbplayer.utils.c f13544i;
    private String A;
    private String B;
    private String C;
    private String D;
    private int E;
    private int F;
    private String G;
    private int H;
    private long I;
    private Context J;
    private int K;
    private c L;
    private TPReportParams.BufferingOnceParams M;
    private TPReportParams.UserSeekOnceParams N;
    private final e O;
    private f.a P;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f13545e;

    /* renamed from: f  reason: collision with root package name */
    private HandlerC0255b f13546f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f13547g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13548h;

    /* renamed from: j  reason: collision with root package name */
    private TPDefaultReportInfo f13549j;

    /* renamed from: k  reason: collision with root package name */
    private TPReportParams f13550k;

    /* renamed from: l  reason: collision with root package name */
    private int f13551l;

    /* renamed from: m  reason: collision with root package name */
    private int f13552m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13553n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13554o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13555p;
    private boolean q;
    private long r;
    private long s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.b$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13556a;

        public AnonymousClass1(b bVar) {
        }

        @Override // com.tencent.thumbplayer.utils.f.a
        public void a(int i2, int i3, int i4, Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13557a;

        public a(b bVar) {
        }

        @Override // com.tencent.thumbplayer.tplayer.plugins.report.b.c
        public void a(int i2, @NonNull com.tencent.thumbplayer.b.a.a aVar) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class HandlerC0255b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13558a;

        public HandlerC0255b(b bVar, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface c {
        void a(int i2, @NonNull com.tencent.thumbplayer.b.a.a aVar);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13559a;

        public d(b bVar) {
        }

        @Override // com.tencent.thumbplayer.tplayer.plugins.report.b.c
        public void a(int i2, @NonNull com.tencent.thumbplayer.b.a.a aVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public long f13560a;
        public int b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public long f13561d;

        /* renamed from: e  reason: collision with root package name */
        public int f13562e;

        /* renamed from: f  reason: collision with root package name */
        public int f13563f;

        /* renamed from: g  reason: collision with root package name */
        public long f13564g;

        /* renamed from: h  reason: collision with root package name */
        public long f13565h;

        /* renamed from: i  reason: collision with root package name */
        public int f13566i;

        /* renamed from: j  reason: collision with root package name */
        public int f13567j;

        /* renamed from: k  reason: collision with root package name */
        public int f13568k;

        /* renamed from: l  reason: collision with root package name */
        public int f13569l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f13570m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f13571n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f13572o;

        /* renamed from: p  reason: collision with root package name */
        public int f13573p;
        public String q;
        public String r;
        public String s;
        public String t;
        public String u;
        public String v;
        public ArrayList<f> w;
        public final /* synthetic */ b x;

        private e(b bVar) {
        }

        public /* synthetic */ e(b bVar, AnonymousClass1 anonymousClass1) {
        }

        public void a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public String f13574a;
        public String b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f13575d;

        public f(b bVar, String str, String str2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class g implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13576a;

        public g(b bVar) {
        }

        @Override // com.tencent.thumbplayer.tplayer.plugins.report.b.c
        public void a(int i2, @NonNull com.tencent.thumbplayer.b.a.a aVar) {
        }
    }

    public b(Context context) {
    }

    public static /* synthetic */ void A(b bVar, Map map) {
    }

    private void A(Map<String, Object> map) {
    }

    public static /* synthetic */ void B(b bVar, Map map) {
    }

    private void B(Map<String, Object> map) {
    }

    public static /* synthetic */ void C(b bVar, Map map) {
    }

    private void C(Map<String, Object> map) {
    }

    public static /* synthetic */ void D(b bVar, Map map) {
    }

    private void D(Map<String, Object> map) {
    }

    private void E(Map<String, Object> map) {
    }

    private float a(Map<String, Object> map, String str, float f2) {
    }

    private int a(Map<String, Object> map, String str, int i2) {
    }

    private long a(Map<String, Object> map, String str, long j2) {
    }

    private static String a(int i2) {
    }

    private String a(Map<String, Object> map, String str, String str2) {
    }

    private static void a(com.tencent.thumbplayer.b.a.a aVar) {
    }

    private void a(com.tencent.thumbplayer.b.a.a aVar, int i2, boolean z) {
    }

    private void a(com.tencent.thumbplayer.b.a.a aVar, boolean z) {
    }

    public static /* synthetic */ void a(b bVar) {
    }

    public static /* synthetic */ void a(b bVar, com.tencent.thumbplayer.b.a.a aVar) {
    }

    public static /* synthetic */ void a(b bVar, com.tencent.thumbplayer.b.a.a aVar, int i2, boolean z) {
    }

    public static /* synthetic */ void a(b bVar, com.tencent.thumbplayer.b.a.a aVar, boolean z) {
    }

    public static /* synthetic */ void a(b bVar, String str) {
    }

    public static /* synthetic */ void a(b bVar, Map map) {
    }

    private void a(String str) {
    }

    private void a(Map<String, Object> map) {
    }

    private boolean a(Map<String, Object> map, String str, boolean z) {
    }

    private int b(int i2) {
    }

    private void b(com.tencent.thumbplayer.b.a.a aVar) {
    }

    private void b(com.tencent.thumbplayer.b.a.a aVar, boolean z) {
    }

    public static /* synthetic */ void b(b bVar) {
    }

    public static /* synthetic */ void b(b bVar, com.tencent.thumbplayer.b.a.a aVar, boolean z) {
    }

    public static /* synthetic */ void b(b bVar, Map map) {
    }

    private void b(String str) {
    }

    private void b(Map<String, Object> map) {
    }

    private void c() {
    }

    public static /* synthetic */ void c(b bVar) {
    }

    public static /* synthetic */ void c(b bVar, Map map) {
    }

    private void c(Map<String, Object> map) {
    }

    private void d() {
    }

    public static /* synthetic */ void d(b bVar) {
    }

    public static /* synthetic */ void d(b bVar, Map map) {
    }

    private void d(Map<String, Object> map) {
    }

    private void e() {
    }

    public static /* synthetic */ void e(b bVar) {
    }

    public static /* synthetic */ void e(b bVar, Map map) {
    }

    private void e(Map<String, Object> map) {
    }

    public static /* synthetic */ HandlerC0255b f(b bVar) {
    }

    private void f() {
    }

    public static /* synthetic */ void f(b bVar, Map map) {
    }

    private void f(Map<String, Object> map) {
    }

    public static /* synthetic */ TPReportParams g(b bVar) {
    }

    private void g() {
    }

    public static /* synthetic */ void g(b bVar, Map map) {
    }

    private void g(Map<String, Object> map) {
    }

    private void h() {
    }

    public static /* synthetic */ void h(b bVar, Map map) {
    }

    private void h(Map<String, Object> map) {
    }

    private void i() {
    }

    public static /* synthetic */ void i(b bVar, Map map) {
    }

    private void i(Map<String, Object> map) {
    }

    private void j() {
    }

    public static /* synthetic */ void j(b bVar, Map map) {
    }

    private void j(Map<String, Object> map) {
    }

    private void k() {
    }

    public static /* synthetic */ void k(b bVar, Map map) {
    }

    private void k(Map<String, Object> map) {
    }

    private String l() {
    }

    public static /* synthetic */ void l(b bVar, Map map) {
    }

    private void l(Map<String, Object> map) {
    }

    @SuppressLint({"MissingPermission"})
    private int m() {
    }

    public static /* synthetic */ void m(b bVar, Map map) {
    }

    private void m(Map<String, Object> map) {
    }

    private int n() {
    }

    public static /* synthetic */ void n(b bVar, Map map) {
    }

    private void n(Map<String, Object> map) {
    }

    public static /* synthetic */ void o(b bVar, Map map) {
    }

    private void o(Map<String, Object> map) {
    }

    public static /* synthetic */ void p(b bVar, Map map) {
    }

    private void p(Map<String, Object> map) {
    }

    public static /* synthetic */ void q(b bVar, Map map) {
    }

    private void q(Map<String, Object> map) {
    }

    public static /* synthetic */ void r(b bVar, Map map) {
    }

    private void r(Map<String, Object> map) {
    }

    public static /* synthetic */ void s(b bVar, Map map) {
    }

    private void s(Map<String, Object> map) {
    }

    public static /* synthetic */ void t(b bVar, Map map) {
    }

    private void t(Map<String, Object> map) {
    }

    public static /* synthetic */ void u(b bVar, Map map) {
    }

    private void u(Map<String, Object> map) {
    }

    public static /* synthetic */ void v(b bVar, Map map) {
    }

    private void v(Map<String, Object> map) {
    }

    public static /* synthetic */ void w(b bVar, Map map) {
    }

    private void w(Map<String, Object> map) {
    }

    public static /* synthetic */ void x(b bVar, Map map) {
    }

    private void x(Map<String, Object> map) {
    }

    public static /* synthetic */ void y(b bVar, Map map) {
    }

    private void y(Map<String, Object> map) {
    }

    public static /* synthetic */ void z(b bVar, Map map) {
    }

    private void z(Map<String, Object> map) {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.a
    public void a() {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.a
    public void a(int i2, int i3, int i4, String str, Object obj) {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.a
    public void b() {
    }

    @Override // com.tencent.thumbplayer.api.report.ITPBusinessReportManager
    public void reportEvent(int i2, Map<String, Object> map) {
    }

    @Override // com.tencent.thumbplayer.api.report.ITPBusinessReportManager
    public void setReportInfoGetter(TPDefaultReportInfo tPDefaultReportInfo) {
    }
}
