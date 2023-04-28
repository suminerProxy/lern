package i.a.y0.g;

import i.a.j0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g extends j0 {

    /* renamed from: e  reason: collision with root package name */
    private static final String f29131e = "RxCachedThreadScheduler";

    /* renamed from: f  reason: collision with root package name */
    public static final k f29132f;

    /* renamed from: g  reason: collision with root package name */
    private static final String f29133g = "RxCachedWorkerPoolEvictor";

    /* renamed from: h  reason: collision with root package name */
    public static final k f29134h;

    /* renamed from: j  reason: collision with root package name */
    public static final long f29136j = 60;

    /* renamed from: m  reason: collision with root package name */
    public static final c f29139m;

    /* renamed from: n  reason: collision with root package name */
    private static final String f29140n = "rx2.io-priority";

    /* renamed from: o  reason: collision with root package name */
    public static final a f29141o;
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<a> f29142d;

    /* renamed from: l  reason: collision with root package name */
    private static final TimeUnit f29138l = TimeUnit.SECONDS;

    /* renamed from: i  reason: collision with root package name */
    private static final String f29135i = "rx2.io-keep-alive-time";

    /* renamed from: k  reason: collision with root package name */
    private static final long f29137k = Long.getLong(f29135i, 60).longValue();

    /* compiled from: IoScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements Runnable {
        private final long b;
        private final ConcurrentLinkedQueue<c> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.u0.b f29143d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f29144e;

        /* renamed from: f  reason: collision with root package name */
        private final Future<?> f29145f;

        /* renamed from: g  reason: collision with root package name */
        private final ThreadFactory f29146g;

        public a(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
        }

        public void a() {
        }

        public c b() {
        }

        public long c() {
        }

        public void d(c cVar) {
        }

        public void e() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: IoScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b extends j0.c {
        private final i.a.u0.b b;
        private final a c;

        /* renamed from: d  reason: collision with root package name */
        private final c f29147d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicBoolean f29148e;

        public b(a aVar) {
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

    /* compiled from: IoScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends i {

        /* renamed from: d  reason: collision with root package name */
        private long f29149d;

        public c(ThreadFactory threadFactory) {
        }

        public long i() {
        }

        public void j(long j2) {
        }
    }

    static {
        c cVar = new c(new k("RxCachedThreadSchedulerShutdown"));
        f29139m = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger(f29140n, 5).intValue()));
        k kVar = new k(f29131e, max);
        f29132f = kVar;
        f29134h = new k(f29133g, max);
        a aVar = new a(0L, null, kVar);
        f29141o = aVar;
        aVar.e();
    }

    public g() {
        this(f29132f);
    }

    @Override // i.a.j0
    @i.a.t0.f
    public j0.c c() {
        return new b(this.f29142d.get());
    }

    @Override // i.a.j0
    public void h() {
        a aVar;
        a aVar2;
        do {
            aVar = this.f29142d.get();
            aVar2 = f29141o;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f29142d.compareAndSet(aVar, aVar2));
        aVar.e();
    }

    @Override // i.a.j0
    public void i() {
        a aVar = new a(f29137k, f29138l, this.c);
        if (this.f29142d.compareAndSet(f29141o, aVar)) {
            return;
        }
        aVar.e();
    }

    public int k() {
        return this.f29142d.get().f29143d.g();
    }

    public g(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.f29142d = new AtomicReference<>(f29141o);
        i();
    }
}
