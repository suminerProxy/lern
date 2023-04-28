package h.a.a.a.a.k;

import android.net.Uri;
import h.a.a.a.a.l.h;
import h.a.a.a.a.l.i1;
import h.a.a.a.a.l.q1;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: BaseMultipartUploadTask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class b<Request extends i1, Result extends h.a.a.a.a.l.h> implements Callable<Result> {
    public long A;
    public Uri B;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15734d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15735e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15736f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15737g;

    /* renamed from: h  reason: collision with root package name */
    public ThreadPoolExecutor f15738h;

    /* renamed from: i  reason: collision with root package name */
    public List<q1> f15739i;

    /* renamed from: j  reason: collision with root package name */
    public Object f15740j;

    /* renamed from: k  reason: collision with root package name */
    public f f15741k;

    /* renamed from: l  reason: collision with root package name */
    public h.a.a.a.a.m.b f15742l;

    /* renamed from: m  reason: collision with root package name */
    public Exception f15743m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15744n;

    /* renamed from: o  reason: collision with root package name */
    public File f15745o;

    /* renamed from: p  reason: collision with root package name */
    public String f15746p;
    public long q;
    public int r;
    public int s;
    public long t;
    public boolean u;
    public Request v;
    public h.a.a.a.a.h.a<Request, Result> w;
    public h.a.a.a.a.h.b<Request> x;
    public int[] y;
    public String z;

    /* compiled from: BaseMultipartUploadTask.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements ThreadFactory {
        public final /* synthetic */ b b;

        public a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* compiled from: BaseMultipartUploadTask.java */
    /* renamed from: h.a.a.a.a.k.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C0294b implements Comparator<q1> {
        public final /* synthetic */ b b;

        public C0294b(b bVar) {
        }

        public int a(q1 q1Var, q1 q1Var2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(q1 q1Var, q1 q1Var2) {
        }
    }

    public b(f fVar, Request request, h.a.a.a.a.h.a<Request, Result> aVar, h.a.a.a.a.m.b bVar) {
    }

    public abstract void a();

    public Result b() throws Exception {
    }

    public long c(long j2) {
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
    }

    public void d() throws h.a.a.a.a.b {
    }

    public void e() throws IOException, h.a.a.a.a.f, h.a.a.a.a.b {
    }

    public void g() throws h.a.a.a.a.b {
    }

    public void h(int[] iArr) {
    }

    public boolean i(int i2) {
    }

    public h.a.a.a.a.l.h j() throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public abstract Result k() throws IOException, h.a.a.a.a.f, h.a.a.a.a.b, InterruptedException;

    public abstract void l() throws IOException, h.a.a.a.a.b, h.a.a.a.a.f;

    public void m() {
    }

    public void n(Request request, long j2, long j3) {
    }

    public void o(int i2, int i3, int i4) throws Exception {
    }

    public abstract void p(Exception exc);

    public void q() {
    }

    public void r(int i2, int i3, int i4) {
    }

    public void s(q1 q1Var) throws Exception {
    }
}
