package i.a.e1.h.h;

import i.a.e1.c.q0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g extends q0 {

    /* renamed from: e  reason: collision with root package name */
    private static final String f27820e = "RxCachedThreadScheduler";

    /* renamed from: f  reason: collision with root package name */
    public static final k f27821f;

    /* renamed from: g  reason: collision with root package name */
    private static final String f27822g = "RxCachedWorkerPoolEvictor";

    /* renamed from: h  reason: collision with root package name */
    public static final k f27823h;

    /* renamed from: j  reason: collision with root package name */
    public static final long f27825j = 60;

    /* renamed from: m  reason: collision with root package name */
    public static final c f27828m;

    /* renamed from: n  reason: collision with root package name */
    private static final String f27829n = "rx3.io-priority";

    /* renamed from: o  reason: collision with root package name */
    public static final a f27830o;
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<a> f27831d;

    /* renamed from: l  reason: collision with root package name */
    private static final TimeUnit f27827l = TimeUnit.SECONDS;

    /* renamed from: i  reason: collision with root package name */
    private static final String f27824i = "rx3.io-keep-alive-time";

    /* renamed from: k  reason: collision with root package name */
    private static final long f27826k = Long.getLong(f27824i, 60).longValue();

    /* compiled from: IoScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements Runnable {
        private final long b;
        private final ConcurrentLinkedQueue<c> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.d.d f27832d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f27833e;

        /* renamed from: f  reason: collision with root package name */
        private final Future<?> f27834f;

        /* renamed from: g  reason: collision with root package name */
        private final ThreadFactory f27835g;

        public a(long keepAliveTime, TimeUnit unit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = unit != null ? unit.toNanos(keepAliveTime) : 0L;
            this.b = nanos;
            this.c = new ConcurrentLinkedQueue<>();
            this.f27832d = new i.a.e1.d.d();
            this.f27835g = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (unit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, g.f27823h);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f27833e = scheduledExecutorService;
            this.f27834f = scheduledFuture;
        }

        public static void a(ConcurrentLinkedQueue<c> expiringWorkerQueue, i.a.e1.d.d allWorkers) {
            if (expiringWorkerQueue.isEmpty()) {
                return;
            }
            long c = c();
            Iterator<c> it = expiringWorkerQueue.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.i() > c) {
                    return;
                }
                if (expiringWorkerQueue.remove(next)) {
                    allWorkers.a(next);
                }
            }
        }

        public static long c() {
            return System.nanoTime();
        }

        public c b() {
            if (this.f27832d.isDisposed()) {
                return g.f27828m;
            }
            while (!this.c.isEmpty()) {
                c poll = this.c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f27835g);
            this.f27832d.b(cVar);
            return cVar;
        }

        public void d(c threadWorker) {
            threadWorker.j(c() + this.b);
            this.c.offer(threadWorker);
        }

        public void e() {
            this.f27832d.dispose();
            Future<?> future = this.f27834f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f27833e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.c, this.f27832d);
        }
    }

    /* compiled from: IoScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends q0.c {
        private final a c;

        /* renamed from: d  reason: collision with root package name */
        private final c f27836d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicBoolean f27837e = new AtomicBoolean();
        private final i.a.e1.d.d b = new i.a.e1.d.d();

        public b(a pool) {
            this.c = pool;
            this.f27836d = pool.b();
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f c(@i.a.e1.b.f Runnable action, long delayTime, @i.a.e1.b.f TimeUnit unit) {
            if (this.b.isDisposed()) {
                return i.a.e1.h.a.d.INSTANCE;
            }
            return this.f27836d.e(action, delayTime, unit, this.b);
        }

        @Override // i.a.e1.d.f
        public void dispose() {
            if (this.f27837e.compareAndSet(false, true)) {
                this.b.dispose();
                this.c.d(this.f27836d);
            }
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
            return this.f27837e.get();
        }
    }

    /* compiled from: IoScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends i {

        /* renamed from: d  reason: collision with root package name */
        public long f27838d;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f27838d = 0L;
        }

        public long i() {
            return this.f27838d;
        }

        public void j(long expirationTime) {
            this.f27838d = expirationTime;
        }
    }

    static {
        c cVar = new c(new k("RxCachedThreadSchedulerShutdown"));
        f27828m = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger(f27829n, 5).intValue()));
        k kVar = new k(f27820e, max);
        f27821f = kVar;
        f27823h = new k(f27822g, max);
        a aVar = new a(0L, null, kVar);
        f27830o = aVar;
        aVar.e();
    }

    public g() {
        this(f27821f);
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public q0.c c() {
        return new b(this.f27831d.get());
    }

    @Override // i.a.e1.c.q0
    public void h() {
        AtomicReference<a> atomicReference = this.f27831d;
        a aVar = f27830o;
        a andSet = atomicReference.getAndSet(aVar);
        if (andSet != aVar) {
            andSet.e();
        }
    }

    @Override // i.a.e1.c.q0
    public void i() {
        a aVar = new a(f27826k, f27827l, this.c);
        if (this.f27831d.compareAndSet(f27830o, aVar)) {
            return;
        }
        aVar.e();
    }

    public int k() {
        return this.f27831d.get().f27832d.g();
    }

    public g(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.f27831d = new AtomicReference<>(f27830o);
        i();
    }
}
