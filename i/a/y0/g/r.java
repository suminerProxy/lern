package i.a.y0.g;

import i.a.j0;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r extends j0 {

    /* renamed from: e  reason: collision with root package name */
    private static final String f29163e = "rx2.single-priority";

    /* renamed from: f  reason: collision with root package name */
    private static final String f29164f = "RxSingleScheduler";

    /* renamed from: g  reason: collision with root package name */
    public static final k f29165g;

    /* renamed from: h  reason: collision with root package name */
    public static final ScheduledExecutorService f29166h;
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f29167d;

    /* compiled from: SingleScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends j0.c {
        public final ScheduledExecutorService b;
        public final i.a.u0.b c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f29168d;

        public a(ScheduledExecutorService scheduledExecutorService) {
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

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f29166h = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f29165g = new k(f29164f, Math.max(1, Math.min(10, Integer.getInteger(f29163e, 5).intValue())), true);
    }

    public r() {
        this(f29165g);
    }

    public static ScheduledExecutorService k(ThreadFactory threadFactory) {
        return p.a(threadFactory);
    }

    @Override // i.a.j0
    @i.a.t0.f
    public j0.c c() {
        return new a(this.f29167d.get());
    }

    @Override // i.a.j0
    @i.a.t0.f
    public i.a.u0.c f(@i.a.t0.f Runnable runnable, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        m mVar = new m(i.a.c1.a.b0(runnable));
        try {
            if (j2 <= 0) {
                schedule = this.f29167d.get().submit(mVar);
            } else {
                schedule = this.f29167d.get().schedule(mVar, j2, timeUnit);
            }
            mVar.setFuture(schedule);
            return mVar;
        } catch (RejectedExecutionException e2) {
            i.a.c1.a.Y(e2);
            return i.a.y0.a.e.INSTANCE;
        }
    }

    @Override // i.a.j0
    @i.a.t0.f
    public i.a.u0.c g(@i.a.t0.f Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable b0 = i.a.c1.a.b0(runnable);
        if (j3 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f29167d.get();
            f fVar = new f(b0, scheduledExecutorService);
            try {
                if (j2 <= 0) {
                    schedule = scheduledExecutorService.submit(fVar);
                } else {
                    schedule = scheduledExecutorService.schedule(fVar, j2, timeUnit);
                }
                fVar.b(schedule);
                return fVar;
            } catch (RejectedExecutionException e2) {
                i.a.c1.a.Y(e2);
                return i.a.y0.a.e.INSTANCE;
            }
        }
        l lVar = new l(b0);
        try {
            lVar.setFuture(this.f29167d.get().scheduleAtFixedRate(lVar, j2, j3, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e3) {
            i.a.c1.a.Y(e3);
            return i.a.y0.a.e.INSTANCE;
        }
    }

    @Override // i.a.j0
    public void h() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.f29167d.get();
        ScheduledExecutorService scheduledExecutorService2 = f29166h;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.f29167d.getAndSet(scheduledExecutorService2)) == scheduledExecutorService2) {
            return;
        }
        andSet.shutdownNow();
    }

    @Override // i.a.j0
    public void i() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f29167d.get();
            if (scheduledExecutorService != f29166h) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = k(this.c);
            }
        } while (!this.f29167d.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    public r(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f29167d = atomicReference;
        this.c = threadFactory;
        atomicReference.lazySet(k(threadFactory));
    }
}
