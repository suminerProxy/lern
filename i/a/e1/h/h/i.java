package i.a.e1.h.h;

import i.a.e1.c.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: NewThreadWorker.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class i extends q0.c implements i.a.e1.d.f {
    private final ScheduledExecutorService b;
    public volatile boolean c;

    public i(ThreadFactory threadFactory) {
        this.b = p.a(threadFactory);
    }

    @Override // i.a.e1.c.q0.c
    @i.a.e1.b.f
    public i.a.e1.d.f b(@i.a.e1.b.f final Runnable run) {
        return c(run, 0L, null);
    }

    @Override // i.a.e1.c.q0.c
    @i.a.e1.b.f
    public i.a.e1.d.f c(@i.a.e1.b.f final Runnable action, long delayTime, @i.a.e1.b.f TimeUnit unit) {
        if (this.c) {
            return i.a.e1.h.a.d.INSTANCE;
        }
        return e(action, delayTime, unit, null);
    }

    @Override // i.a.e1.d.f
    public void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.shutdownNow();
    }

    @i.a.e1.b.f
    public n e(final Runnable run, long delayTime, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.g i.a.e1.d.g parent) {
        Future<?> schedule;
        n nVar = new n(i.a.e1.l.a.b0(run), parent);
        if (parent == null || parent.b(nVar)) {
            try {
                if (delayTime <= 0) {
                    schedule = this.b.submit((Callable) nVar);
                } else {
                    schedule = this.b.schedule((Callable) nVar, delayTime, unit);
                }
                nVar.setFuture(schedule);
            } catch (RejectedExecutionException e2) {
                if (parent != null) {
                    parent.a(nVar);
                }
                i.a.e1.l.a.Y(e2);
            }
            return nVar;
        }
        return nVar;
    }

    public i.a.e1.d.f f(final Runnable run, long delayTime, TimeUnit unit) {
        Future<?> schedule;
        m mVar = new m(i.a.e1.l.a.b0(run));
        try {
            if (delayTime <= 0) {
                schedule = this.b.submit(mVar);
            } else {
                schedule = this.b.schedule(mVar, delayTime, unit);
            }
            mVar.setFuture(schedule);
            return mVar;
        } catch (RejectedExecutionException e2) {
            i.a.e1.l.a.Y(e2);
            return i.a.e1.h.a.d.INSTANCE;
        }
    }

    public i.a.e1.d.f g(Runnable run, long initialDelay, long period, TimeUnit unit) {
        Future<?> schedule;
        Runnable b0 = i.a.e1.l.a.b0(run);
        if (period <= 0) {
            f fVar = new f(b0, this.b);
            try {
                if (initialDelay <= 0) {
                    schedule = this.b.submit(fVar);
                } else {
                    schedule = this.b.schedule(fVar, initialDelay, unit);
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
            lVar.setFuture(this.b.scheduleAtFixedRate(lVar, initialDelay, period, unit));
            return lVar;
        } catch (RejectedExecutionException e3) {
            i.a.e1.l.a.Y(e3);
            return i.a.e1.h.a.d.INSTANCE;
        }
    }

    public void h() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.shutdown();
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        return this.c;
    }
}
