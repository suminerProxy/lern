package h.a.a.a.a.k;

import h.a.a.a.a.l.e2;
import h.a.a.a.a.l.h2;
import h.a.a.a.a.l.i2;
import h.a.a.a.a.l.m1;
import h.a.a.a.a.l.n1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: ResumableDownloadTask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class p<Requst extends h2, Result extends i2> implements Callable<Result> {
    public static final String u = ".temp";
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15787d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15788e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15789f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15790g;

    /* renamed from: h  reason: collision with root package name */
    public ThreadPoolExecutor f15791h;

    /* renamed from: i  reason: collision with root package name */
    private h2 f15792i;

    /* renamed from: j  reason: collision with root package name */
    private h.a.a.a.a.k.f f15793j;

    /* renamed from: k  reason: collision with root package name */
    private h.a.a.a.a.h.a f15794k;

    /* renamed from: l  reason: collision with root package name */
    private h.a.a.a.a.m.b f15795l;

    /* renamed from: m  reason: collision with root package name */
    private h.a.a.a.a.h.b f15796m;

    /* renamed from: n  reason: collision with root package name */
    private d f15797n;

    /* renamed from: o  reason: collision with root package name */
    public Object f15798o;

    /* renamed from: p  reason: collision with root package name */
    public Exception f15799p;
    public long q;
    public long r;
    public long s;
    public String t;

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements ThreadFactory {
        public final /* synthetic */ p b;

        public a(p pVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements Runnable {
        public final /* synthetic */ e b;
        public final /* synthetic */ f c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p f15800d;

        public b(p pVar, e eVar, f fVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements Comparator<g> {
        public final /* synthetic */ p b;

        public c(p pVar) {
        }

        public int a(g gVar, g gVar2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(g gVar, g gVar2) {
        }
    }

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d implements Serializable {
        private static final long serialVersionUID = -8470273912385636504L;
        public String bucketName;
        public String downloadFile;
        public long downloadLength;
        public h fileStat;
        public int md5;
        public String objectKey;
        public ArrayList<f> parts;

        private void assign(d dVar) {
        }

        public synchronized void dump(String str) throws IOException {
        }

        public int hashCode() {
        }

        public synchronized boolean isValid(h.a.a.a.a.k.f fVar) throws h.a.a.a.a.b, h.a.a.a.a.f {
        }

        public synchronized void load(String str) throws IOException, ClassNotFoundException {
        }

        public synchronized void update(int i2, boolean z) throws IOException {
        }
    }

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class e extends m1 {

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<g> f15801f;

        /* renamed from: g  reason: collision with root package name */
        public n1 f15802g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ p f15803h;

        public e(p pVar) {
        }
    }

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class f implements Serializable {
        private static final long serialVersionUID = -3506020776131733942L;
        public long crc;
        public long end;
        public long fileStart;
        public boolean isCompleted;
        public long length;
        public int partNumber;
        public long start;

        public int hashCode() {
        }
    }

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f15804a;
        public String b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public long f15805d;
    }

    /* compiled from: ResumableDownloadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class h implements Serializable {
        private static final long serialVersionUID = 3896323364904643963L;
        public String etag;
        public long fileLength;
        public Date lastModified;
        public String md5;
        public String requestId;
        public Long serverCRC;

        public static h getFileStat(h.a.a.a.a.k.f fVar, String str, String str2) throws h.a.a.a.a.b, h.a.a.a.a.f {
        }

        public int hashCode() {
        }
    }

    public p(h.a.a.a.a.k.f fVar, h2 h2Var, h.a.a.a.a.h.a aVar, h.a.a.a.a.m.b bVar) {
    }

    public static /* synthetic */ void a(p pVar, e eVar, f fVar) {
    }

    private static Long b(List<g> list) {
    }

    private long d(long j2) {
    }

    private void i(long j2, int[] iArr) {
    }

    private void k(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    private e2 l(e2 e2Var, long j2) {
    }

    private void m(String str, long j2) throws IOException {
    }

    private void o(p<Requst, Result>.e eVar, f fVar) {
    }

    private void p() throws h.a.a.a.a.b, h.a.a.a.a.f, IOException {
    }

    private void q(File file, File file2) throws IOException {
    }

    private ArrayList<f> v(e2 e2Var, long j2, long j3) {
    }

    public Result c() throws Exception {
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
    }

    public void e() throws h.a.a.a.a.b {
    }

    public void g() throws IOException, h.a.a.a.a.f, h.a.a.a.a.b {
    }

    public void h() throws h.a.a.a.a.b, h.a.a.a.a.f, IOException {
    }

    public boolean j(int i2) {
    }

    public i2 n() throws h.a.a.a.a.b, h.a.a.a.a.f, IOException, InterruptedException {
    }

    public void r() {
    }

    public void s(Exception exc) {
    }

    public void t() {
    }

    public boolean u(String str) {
    }
}
