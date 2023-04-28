package h.g.a.n;

import android.annotation.TargetApi;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: DiskLruCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class a implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final String f16494p = "journal";
    public static final String q = "journal.tmp";
    public static final String r = "journal.bkp";
    public static final String s = "libcore.io.DiskLruCache";
    public static final String t = "1";
    public static final long u = -1;
    private static final String v = "CLEAN";
    private static final String w = "DIRTY";
    private static final String x = "REMOVE";
    private static final String y = "READ";
    private final File b;
    private final File c;

    /* renamed from: d  reason: collision with root package name */
    private final File f16495d;

    /* renamed from: e  reason: collision with root package name */
    private final File f16496e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16497f;

    /* renamed from: g  reason: collision with root package name */
    private long f16498g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16499h;

    /* renamed from: i  reason: collision with root package name */
    private long f16500i;

    /* renamed from: j  reason: collision with root package name */
    private Writer f16501j;

    /* renamed from: k  reason: collision with root package name */
    private final LinkedHashMap<String, d> f16502k;

    /* renamed from: l  reason: collision with root package name */
    private int f16503l;

    /* renamed from: m  reason: collision with root package name */
    private long f16504m;

    /* renamed from: n  reason: collision with root package name */
    public final ThreadPoolExecutor f16505n;

    /* renamed from: o  reason: collision with root package name */
    private final Callable<Void> f16506o;

    /* compiled from: DiskLruCache.java */
    /* renamed from: h.g.a.n.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class CallableC0306a implements Callable<Void> {
        public final /* synthetic */ a b;

        public CallableC0306a(a aVar) {
        }

        public Void a() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() throws Exception {
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
        }

        public /* synthetic */ b(CallableC0306a callableC0306a) {
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final d f16507a;
        private final boolean[] b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f16508d;

        public /* synthetic */ c(a aVar, d dVar, CallableC0306a callableC0306a) {
        }

        public static /* synthetic */ d c(c cVar) {
        }

        public static /* synthetic */ boolean[] d(c cVar) {
        }

        private InputStream h(int i2) throws IOException {
        }

        public void a() throws IOException {
        }

        public void b() {
        }

        public void e() throws IOException {
        }

        public File f(int i2) throws IOException {
        }

        public String g(int i2) throws IOException {
        }

        public void i(int i2, String str) throws IOException {
        }

        private c(a aVar, d dVar) {
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f16509a;
        private final long[] b;
        public File[] c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f16510d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f16511e;

        /* renamed from: f  reason: collision with root package name */
        private c f16512f;

        /* renamed from: g  reason: collision with root package name */
        private long f16513g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f16514h;

        public /* synthetic */ d(a aVar, String str, CallableC0306a callableC0306a) {
        }

        public static /* synthetic */ long[] a(d dVar) {
        }

        public static /* synthetic */ String b(d dVar) {
        }

        public static /* synthetic */ long c(d dVar) {
        }

        public static /* synthetic */ long d(d dVar, long j2) {
        }

        public static /* synthetic */ boolean e(d dVar) {
        }

        public static /* synthetic */ boolean f(d dVar, boolean z) {
        }

        public static /* synthetic */ c g(d dVar) {
        }

        public static /* synthetic */ c h(d dVar, c cVar) {
        }

        public static /* synthetic */ void i(d dVar, String[] strArr) throws IOException {
        }

        private IOException m(String[] strArr) throws IOException {
        }

        private void n(String[] strArr) throws IOException {
        }

        public File j(int i2) {
        }

        public File k(int i2) {
        }

        public String l() throws IOException {
        }

        private d(a aVar, String str) {
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f16515a;
        private final long b;
        private final long[] c;

        /* renamed from: d  reason: collision with root package name */
        private final File[] f16516d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f16517e;

        public /* synthetic */ e(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0306a callableC0306a) {
        }

        public c a() throws IOException {
        }

        public File b(int i2) {
        }

        public long c(int i2) {
        }

        public String d(int i2) throws IOException {
        }

        private e(a aVar, String str, long j2, File[] fileArr, long[] jArr) {
        }
    }

    private a(File file, int i2, int i3, long j2) {
    }

    private void A(String str) throws IOException {
    }

    private synchronized void B() throws IOException {
    }

    private static void D(File file, File file2, boolean z) throws IOException {
    }

    private void G() throws IOException {
    }

    public static /* synthetic */ Writer a(a aVar) {
    }

    public static /* synthetic */ c b(a aVar, String str, long j2) throws IOException {
    }

    public static /* synthetic */ String c(InputStream inputStream) throws IOException {
    }

    public static /* synthetic */ int d(a aVar) {
    }

    public static /* synthetic */ void e(a aVar) throws IOException {
    }

    public static /* synthetic */ File f(a aVar) {
    }

    public static /* synthetic */ void g(a aVar, c cVar, boolean z) throws IOException {
    }

    public static /* synthetic */ boolean h(a aVar) {
    }

    public static /* synthetic */ void i(a aVar) throws IOException {
    }

    public static /* synthetic */ int j(a aVar, int i2) {
    }

    private void k() {
    }

    @TargetApi(26)
    private static void l(Writer writer) throws IOException {
    }

    private synchronized void m(c cVar, boolean z) throws IOException {
    }

    private static void o(File file) throws IOException {
    }

    private synchronized c q(String str, long j2) throws IOException {
    }

    @TargetApi(26)
    private static void r(Writer writer) throws IOException {
    }

    private static String v(InputStream inputStream) throws IOException {
    }

    private boolean w() {
    }

    public static a x(File file, int i2, int i3, long j2) throws IOException {
    }

    private void y() throws IOException {
    }

    private void z() throws IOException {
    }

    public synchronized boolean C(String str) throws IOException {
    }

    public synchronized void E(long j2) {
    }

    public synchronized long F() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    public synchronized void flush() throws IOException {
    }

    public synchronized boolean isClosed() {
    }

    public void n() throws IOException {
    }

    public c p(String str) throws IOException {
    }

    public synchronized e s(String str) throws IOException {
    }

    public File t() {
    }

    public synchronized long u() {
    }
}
