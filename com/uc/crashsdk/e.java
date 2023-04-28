package com.uc.crashsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class e implements Thread.UncaughtExceptionHandler {
    private static Map<String, Integer> A;
    private static String B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static String J;
    private static boolean K;
    private static boolean L;
    private static int M;
    private static int N;
    private static boolean O;
    private static com.uc.crashsdk.a.e P;
    private static c Q;
    private static boolean R;
    private static final com.uc.crashsdk.a.e S = null;
    private static Thread.UncaughtExceptionHandler T;
    private static Throwable U;
    private static boolean V;
    private static boolean W;
    private static Runnable X;
    private static final Object Y = null;
    private static int Z;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f14596a = false;
    private static Runnable aa;
    private static final Object ab = null;
    private static volatile boolean ac;
    private static Object ad;
    private static ParcelFileDescriptor ae;
    private static boolean af;
    private static boolean ag;
    private static long b;
    private static final AtomicBoolean c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f14597d;

    /* renamed from: f  reason: collision with root package name */
    private static long f14598f;

    /* renamed from: g  reason: collision with root package name */
    private static long f14599g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f14600h;

    /* renamed from: i  reason: collision with root package name */
    private static String f14601i;

    /* renamed from: j  reason: collision with root package name */
    private static String f14602j;

    /* renamed from: k  reason: collision with root package name */
    private static String f14603k;

    /* renamed from: l  reason: collision with root package name */
    private static String f14604l;

    /* renamed from: m  reason: collision with root package name */
    private static String f14605m;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f14606n = null;

    /* renamed from: o  reason: collision with root package name */
    private static final ConditionVariable f14607o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final Object f14608p = null;
    private static final Object q = null;
    private static final Object r = null;
    private static final ArrayList<String> s = null;
    private static int t;
    private static String u;
    private static boolean v;
    private static String w;
    private static String x;
    private static final Object y = null;
    private static final Object z = null;

    /* renamed from: e  reason: collision with root package name */
    private final List<FileInputStream> f14609e;

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b implements Comparator<File> {
        private b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
        }

        public /* synthetic */ b(byte b) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
        }

        public /* synthetic */ c(byte b) {
        }
    }

    public static void A() {
    }

    public static void B() {
    }

    public static void C() {
    }

    public static void D() {
    }

    public static ParcelFileDescriptor E() {
    }

    public static boolean F() {
    }

    public static void G() {
    }

    public static /* synthetic */ boolean H() {
    }

    public static /* synthetic */ boolean I() {
    }

    public static /* synthetic */ int J() {
    }

    public static /* synthetic */ void K() {
    }

    public static /* synthetic */ int L() {
    }

    private void M() {
    }

    private void N() {
    }

    private static boolean O() {
    }

    private static String P() {
    }

    private static String Q() {
    }

    private static byte[] R() {
    }

    private static String S() {
    }

    private static void T() {
    }

    private static String U() {
    }

    private static boolean V() {
    }

    private static void W() {
    }

    private static void X() {
    }

    private static StringBuilder Y() {
    }

    private static void Z() {
    }

    public static boolean a() {
    }

    private static boolean aa() {
    }

    private static void ab() {
    }

    public static long b() {
    }

    public static /* synthetic */ int c(int i2) {
    }

    public static /* synthetic */ int d(int i2) {
    }

    public static /* synthetic */ int e(int i2) {
    }

    public static /* synthetic */ int f(int i2) {
    }

    public static /* synthetic */ int g(int i2) {
    }

    public static /* synthetic */ int h(int i2) {
    }

    public static /* synthetic */ int i(int i2) {
    }

    private static String j(String str) {
    }

    private static String k(String str) {
    }

    private static String l(String str) {
    }

    private static String m(String str) {
    }

    private static boolean[] n(String str) {
    }

    private static boolean o(String str) {
    }

    private static boolean p(String str) {
    }

    private static Map<String, Integer> q(String str) {
    }

    private static void r(String str) {
    }

    private static String s(String str) {
    }

    public static void t() {
    }

    public static boolean u() {
    }

    public static Throwable v() {
    }

    public static int w() {
    }

    public static void x() {
    }

    public static void y() {
    }

    public static boolean z() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
    }

    public static /* synthetic */ boolean c(Context context) {
    }

    public static String d() {
    }

    public static String e() {
    }

    public static String f() {
    }

    public static /* synthetic */ String g(String str) {
    }

    private static long h(String str) {
    }

    private static String i(String str) {
    }

    public static void s() {
    }

    public static void c() {
    }

    public static /* synthetic */ boolean g(boolean z2) {
    }

    public static boolean i() {
    }

    public static boolean b(int i2, Object[] objArr) {
    }

    private static void c(OutputStream outputStream) {
    }

    public static String g() {
    }

    private static void d(OutputStream outputStream) {
    }

    private static void f(OutputStream outputStream) {
    }

    public static String k() {
    }

    public static void l() {
    }

    public static void a(int i2, Object[] objArr) {
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final long f14610a;
        private final OutputStream b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f14611d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14612e;

        public a(long j2, OutputStream outputStream) {
        }

        private int a(byte[] bArr, int i2, int i3) {
        }

        private void b(String str) {
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
        }

        public final void a() {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
        }

        public final void a(String str) {
        }
    }

    public static String h() {
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public long f14613a;
        public long b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f14614d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14615e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f14616f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f14617g;

        private d() {
        }

        public /* synthetic */ d(byte b) {
        }
    }

    public static void j() {
    }

    public static void m() {
    }

    public static void p() {
    }

    public static String q() {
    }

    public static void r() {
    }

    private static void b(OutputStream outputStream, String str, String str2) {
    }

    public static String n() {
    }

    public static boolean d(String str) {
    }

    public static void a(boolean z2) {
    }

    private static boolean d(Context context) {
    }

    public static void o() {
    }

    private static void e(OutputStream outputStream) {
    }

    public static void c(String str) {
    }

    public static void d(boolean z2) {
    }

    public static int f(boolean z2) {
    }

    public static void c(boolean z2) {
    }

    public static StringBuilder f(String str) {
    }

    public static String a(String str, String str2) {
    }

    private static BufferedReader a(InputStreamReader inputStreamReader) {
    }

    public static boolean e(String str) {
    }

    private static void a(OutputStream outputStream) {
    }

    private static String a(File file) {
    }

    public static int e(boolean z2) {
    }

    private static long a(StatFs statFs, String str, String str2) {
    }

    private static void b(OutputStream outputStream) {
    }

    private static void a(a aVar) {
    }

    public static int a(OutputStream outputStream, String str, int i2) {
    }

    public static String a(int i2) {
    }

    private static void b(a aVar) {
    }

    private static String a(Throwable th, String str, long j2, boolean z2) {
    }

    public static int b(OutputStream outputStream, String str, int i2) {
    }

    public static void b(boolean z2) {
    }

    private static boolean b(File file) {
    }

    private static String b(String str, boolean z2, boolean z3) {
    }

    public static void b(String str, String str2, boolean z2) {
    }

    public static void b(String str) {
    }

    private static void b(String str, String str2) {
    }

    public static void b(Context context) {
    }

    public static void b(int i2) {
    }

    public static String a(String str) {
    }

    public static void a(Throwable th, OutputStream outputStream) {
    }

    private static void a(String str, boolean z2, boolean z3) {
    }

    public static boolean a(boolean z2, boolean z3) {
    }

    private static boolean a(String str, com.uc.crashsdk.a.e eVar) {
    }

    private static boolean a(String str, d dVar) {
    }

    public static boolean a(StringBuffer stringBuffer, String str, long j2, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
    }

    public static boolean a(String str, String str2, boolean z2) {
    }

    private static void a(a aVar, String str, long j2) {
    }

    private static boolean a(String str, long j2, StringBuffer stringBuffer, String str2, long j3, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str3) {
    }

    private static String a(Date date) {
    }

    public static void a(OutputStream outputStream, String str, String str2, int i2, boolean z2, boolean z3) {
    }

    public static void a(OutputStream outputStream, String str, String str2) {
    }

    public static void a(Context context) {
    }

    public final void a(Thread thread, Throwable th, boolean z2) {
    }

    private static void a(Throwable th) {
    }

    private static void a(Calendar calendar) {
    }

    public static StringBuilder a(StackTraceElement[] stackTraceElementArr, String str) {
    }

    public static boolean a(ParcelFileDescriptor parcelFileDescriptor) {
    }
}
