package h.g.a.p.p;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import h.g.a.p.p.h;
import h.g.a.p.p.p;
import h.g.a.v.p.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class l<R> implements h.b<R>, a.f {
    private static final c A = null;
    public final e b;
    private final h.g.a.v.p.c c;

    /* renamed from: d  reason: collision with root package name */
    private final p.a f16819d;

    /* renamed from: e  reason: collision with root package name */
    private final Pools.Pool<l<?>> f16820e;

    /* renamed from: f  reason: collision with root package name */
    private final c f16821f;

    /* renamed from: g  reason: collision with root package name */
    private final m f16822g;

    /* renamed from: h  reason: collision with root package name */
    private final h.g.a.p.p.c0.a f16823h;

    /* renamed from: i  reason: collision with root package name */
    private final h.g.a.p.p.c0.a f16824i;

    /* renamed from: j  reason: collision with root package name */
    private final h.g.a.p.p.c0.a f16825j;

    /* renamed from: k  reason: collision with root package name */
    private final h.g.a.p.p.c0.a f16826k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicInteger f16827l;

    /* renamed from: m  reason: collision with root package name */
    private h.g.a.p.g f16828m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16829n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16830o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f16831p;
    private boolean q;
    private v<?> r;
    public h.g.a.p.a s;
    private boolean t;
    public q u;
    private boolean v;
    public p<?> w;
    private h<R> x;
    private volatile boolean y;
    private boolean z;

    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements Runnable {
        private final h.g.a.t.i b;
        public final /* synthetic */ l c;

        public a(l lVar, h.g.a.t.i iVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements Runnable {
        private final h.g.a.t.i b;
        public final /* synthetic */ l c;

        public b(l lVar, h.g.a.t.i iVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: EngineJob.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c {
        public <R> p<R> a(v<R> vVar, boolean z, h.g.a.p.g gVar, p.a aVar) {
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final h.g.a.t.i f16832a;
        public final Executor b;

        public d(h.g.a.t.i iVar, Executor executor) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class e implements Iterable<d> {
        private final List<d> b;

        public e() {
        }

        private static d d(h.g.a.t.i iVar) {
        }

        public void a(h.g.a.t.i iVar, Executor executor) {
        }

        public boolean b(h.g.a.t.i iVar) {
        }

        public e c() {
        }

        public void clear() {
        }

        public void e(h.g.a.t.i iVar) {
        }

        public boolean isEmpty() {
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
        }

        public int size() {
        }

        public e(List<d> list) {
        }
    }

    public l(h.g.a.p.p.c0.a aVar, h.g.a.p.p.c0.a aVar2, h.g.a.p.p.c0.a aVar3, h.g.a.p.p.c0.a aVar4, m mVar, p.a aVar5, Pools.Pool<l<?>> pool) {
    }

    private h.g.a.p.p.c0.a j() {
    }

    private boolean n() {
    }

    private synchronized void r() {
    }

    public synchronized void a(h.g.a.t.i iVar, Executor executor) {
    }

    @Override // h.g.a.p.p.h.b
    public void b(v<R> vVar, h.g.a.p.a aVar, boolean z) {
    }

    @Override // h.g.a.p.p.h.b
    public void c(q qVar) {
    }

    @Override // h.g.a.v.p.a.f
    @NonNull
    public h.g.a.v.p.c d() {
    }

    @Override // h.g.a.p.p.h.b
    public void e(h<?> hVar) {
    }

    @GuardedBy("this")
    public void f(h.g.a.t.i iVar) {
    }

    @GuardedBy("this")
    public void g(h.g.a.t.i iVar) {
    }

    public void h() {
    }

    public void i() {
    }

    public synchronized void k(int i2) {
    }

    @VisibleForTesting
    public synchronized l<R> l(h.g.a.p.g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public synchronized boolean m() {
    }

    public void o() {
    }

    public void p() {
    }

    public boolean q() {
    }

    public synchronized void s(h.g.a.t.i iVar) {
    }

    public synchronized void t(h<R> hVar) {
    }

    @VisibleForTesting
    public l(h.g.a.p.p.c0.a aVar, h.g.a.p.p.c0.a aVar2, h.g.a.p.p.c0.a aVar3, h.g.a.p.p.c0.a aVar4, m mVar, p.a aVar5, Pools.Pool<l<?>> pool, c cVar) {
    }
}
