package i.a.e1.h.h;

import i.a.e1.c.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r extends q0 {

    /* renamed from: e  reason: collision with root package name */
    private static final String f27851e = "rx3.single-priority";

    /* renamed from: f  reason: collision with root package name */
    private static final String f27852f = "RxSingleScheduler";

    /* renamed from: g  reason: collision with root package name */
    public static final k f27853g;

    /* renamed from: h  reason: collision with root package name */
    public static final ScheduledExecutorService f27854h;
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f27855d;

    /* compiled from: SingleScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends q0.c {
        public final ScheduledExecutorService b;
        public final i.a.e1.d.d c = new i.a.e1.d.d();

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f27856d;

        public a(ScheduledExecutorService executor) {
            this.b = executor;
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f c(@i.a.e1.b.f Runnable run, long delay, @i.a.e1.b.f TimeUnit unit) {
            Future<?> schedule;
            if (this.f27856d) {
                return i.a.e1.h.a.d.INSTANCE;
            }
            n nVar = new n(i.a.e1.l.a.b0(run), this.c);
            this.c.b(nVar);
            try {
                if (delay <= 0) {
                    schedule = this.b.submit((Callable) nVar);
                } else {
                    schedule = this.b.schedule((Callable) nVar, delay, unit);
                }
                nVar.setFuture(schedule);
                return nVar;
            } catch (RejectedExecutionException e2) {
                dispose();
                i.a.e1.l.a.Y(e2);
                return i.a.e1.h.a.d.INSTANCE;
            }
        }

        @Override // i.a.e1.d.f
        public void dispose() {
            if (this.f27856d) {
                return;
            }
            this.f27856d = true;
            this.c.dispose();
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
            return this.f27856d;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f27854h = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f27853g = new k(f27852f, Math.max(1, Math.min(10, Integer.getInteger(f27851e, 5).intValue())), true);
    }

    public r() {
        this(f27853g);
    }

    public static ScheduledExecutorService k(ThreadFactory threadFactory) {
        return p.a(threadFactory);
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public q0.c c() {
        return new a(this.f27855d.get());
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f f(@i.a.e1.b.f Runnable run, long delay, TimeUnit unit) {
        Future<?> schedule;
        m mVar = new m(i.a.e1.l.a.b0(run));
        try {
            if (delay <= 0) {
                schedule = this.f27855d.get().submit(mVar);
            } else {
                schedule = this.f27855d.get().schedule(mVar, delay, unit);
            }
            mVar.setFuture(schedule);
            return mVar;
        } catch (RejectedExecutionException e2) {
            i.a.e1.l.a.Y(e2);
            return i.a.e1.h.a.d.INSTANCE;
        }
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f g(@i.a.e1.b.f Runnable run, long initialDelay, long period, TimeUnit unit) {
        Future<?> schedule;
        Runnable b0 = i.a.e1.l.a.b0(run);
        if (period <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f27855d.get();
            f fVar = new f(b0, scheduledExecutorService);
            try {
                if (initialDelay <= 0) {
                    schedule = scheduledExecutorService.submit(fVar);
                } else {
                    schedule = scheduledExecutorService.schedule(fVar, initialDelay, unit);
                }
                fVar.b(schedule);
                return fVar;
            } catch (RejectedExecutionException e2) {
                i.a.e1.l.a.Y(e2);
                return i.a.e1.h.a.d.INSTANCE;
            }
        }
        l lVar = new l(b0);
        try {
            lVar.setFuture(this.f27855d.get().scheduleAtFixedRate(lVar, initialDelay, period, unit));
            return lVar;
        } catch (RejectedExecutionException e3) {
            i.a.e1.l.a.Y(e3);
            return i.a.e1.h.a.d.INSTANCE;
        }
    }

    @Override // i.a.e1.c.q0
    public void h() {
        AtomicReference<ScheduledExecutorService> atomicReference = this.f27855d;
        ScheduledExecutorService scheduledExecutorService = f27854h;
        ScheduledExecutorService andSet = atomicReference.getAndSet(scheduledExecutorService);
        if (andSet != scheduledExecutorService) {
            andSet.shutdownNow();
        }
    }

    @Override // i.a.e1.c.q0
    public void i() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f27855d.get();
            if (scheduledExecutorService != f27854h) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = k(this.c);
            }
        } while (!this.f27855d.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    public r(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f27855d = atomicReference;
        this.c = threadFactory;
        atomicReference.lazySet(k(threadFactory));
    }
}
