package i.a.y0.g;

import i.a.j0;
import i.a.y0.g.o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b extends j0 implements o {

    /* renamed from: e  reason: collision with root package name */
    public static final C0594b f29106e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f29107f = "RxComputationThreadPool";

    /* renamed from: g  reason: collision with root package name */
    public static final k f29108g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f29109h = "rx2.computation-threads";

    /* renamed from: i  reason: collision with root package name */
    public static final int f29110i = k(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f29109h, 0).intValue());

    /* renamed from: j  reason: collision with root package name */
    public static final c f29111j;

    /* renamed from: k  reason: collision with root package name */
    private static final String f29112k = "rx2.computation-priority";
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<C0594b> f29113d;

    /* compiled from: ComputationScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends j0.c {
        private final i.a.y0.a.f b;
        private final i.a.u0.b c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.y0.a.f f29114d;

        /* renamed from: e  reason: collision with root package name */
        private final c f29115e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f29116f;

        public a(c cVar) {
        }

        @Override // i.a.j0.c
        @i.a.t0.f
        public i.a.u0.c b(@i.a.t0.f Runnable runnable) {
        }

        @Override // i.a.j0.c
        @i.a.t0.f
        public i.a.u0.c c(@i.a.t0.f Runnable runnable, long j2, @i.a.t0.f TimeUnit timeUnit) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* renamed from: i.a.y0.g.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class C0594b implements o {
        public final int b;
        public final c[] c;

        /* renamed from: d  reason: collision with root package name */
        public long f29117d;

        public C0594b(int i2, ThreadFactory threadFactory) {
        }

        @Override // i.a.y0.g.o
        public void a(int i2, o.a aVar) {
        }

        public c b() {
        }

        public void c() {
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends i {
        public c(ThreadFactory threadFactory) {
        }
    }

    static {
        c cVar = new c(new k("RxComputationShutdown"));
        f29111j = cVar;
        cVar.dispose();
        k kVar = new k(f29107f, Math.max(1, Math.min(10, Integer.getInteger(f29112k, 5).intValue())), true);
        f29108g = kVar;
        C0594b c0594b = new C0594b(0, kVar);
        f29106e = c0594b;
        c0594b.c();
    }

    public b() {
        this(f29108g);
    }

    public static int k(int i2, int i3) {
        return (i3 <= 0 || i3 > i2) ? i2 : i3;
    }

    @Override // i.a.y0.g.o
    public void a(int i2, o.a aVar) {
        i.a.y0.b.b.h(i2, "number > 0 required");
        this.f29113d.get().a(i2, aVar);
    }

    @Override // i.a.j0
    @i.a.t0.f
    public j0.c c() {
        return new a(this.f29113d.get().b());
    }

    @Override // i.a.j0
    @i.a.t0.f
    public i.a.u0.c f(@i.a.t0.f Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f29113d.get().b().f(runnable, j2, timeUnit);
    }

    @Override // i.a.j0
    @i.a.t0.f
    public i.a.u0.c g(@i.a.t0.f Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.f29113d.get().b().g(runnable, j2, j3, timeUnit);
    }

    @Override // i.a.j0
    public void h() {
        C0594b c0594b;
        C0594b c0594b2;
        do {
            c0594b = this.f29113d.get();
            c0594b2 = f29106e;
            if (c0594b == c0594b2) {
                return;
            }
        } while (!this.f29113d.compareAndSet(c0594b, c0594b2));
        c0594b.c();
    }

    @Override // i.a.j0
    public void i() {
        C0594b c0594b = new C0594b(f29110i, this.c);
        if (this.f29113d.compareAndSet(f29106e, c0594b)) {
            return;
        }
        c0594b.c();
    }

    public b(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.f29113d = new AtomicReference<>(f29106e);
        i();
    }
}
