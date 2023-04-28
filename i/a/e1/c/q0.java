package i.a.e1.c;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class q0 {
    public static final long b = TimeUnit.MINUTES.toNanos(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements i.a.e1.d.f, Runnable, i.a.e1.n.a {
        @i.a.e1.b.f
        public final Runnable b;
        @i.a.e1.b.f
        public final c c;
        @i.a.e1.b.g

        /* renamed from: d  reason: collision with root package name */
        public Thread f26737d;

        public a(@i.a.e1.b.f Runnable decoratedRun, @i.a.e1.b.f c w) {
            this.b = decoratedRun;
            this.c = w;
        }

        @Override // i.a.e1.d.f
        public void dispose() {
            if (this.f26737d == Thread.currentThread()) {
                c cVar = this.c;
                if (cVar instanceof i.a.e1.h.h.i) {
                    ((i.a.e1.h.h.i) cVar).h();
                    return;
                }
            }
            this.c.dispose();
        }

        @Override // i.a.e1.n.a
        public Runnable getWrappedRunnable() {
            return this.b;
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26737d = Thread.currentThread();
            try {
                this.b.run();
            } finally {
                dispose();
                this.f26737d = null;
            }
        }
    }

    /* compiled from: Scheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements i.a.e1.d.f, Runnable, i.a.e1.n.a {
        @i.a.e1.b.f
        public final Runnable b;
        @i.a.e1.b.f
        public final c c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f26738d;

        public b(@i.a.e1.b.f Runnable run, @i.a.e1.b.f c worker) {
            this.b = run;
            this.c = worker;
        }

        @Override // i.a.e1.d.f
        public void dispose() {
            this.f26738d = true;
            this.c.dispose();
        }

        @Override // i.a.e1.n.a
        public Runnable getWrappedRunnable() {
            return this.b;
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
            return this.f26738d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26738d) {
                return;
            }
            try {
                this.b.run();
            } catch (Throwable th) {
                i.a.e1.e.b.b(th);
                this.c.dispose();
                throw i.a.e1.h.k.k.i(th);
            }
        }
    }

    /* compiled from: Scheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c implements i.a.e1.d.f {

        /* compiled from: Scheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class a implements Runnable, i.a.e1.n.a {
            @i.a.e1.b.f
            public final Runnable b;
            @i.a.e1.b.f
            public final i.a.e1.h.a.f c;

            /* renamed from: d  reason: collision with root package name */
            public final long f26739d;

            /* renamed from: e  reason: collision with root package name */
            public long f26740e;

            /* renamed from: f  reason: collision with root package name */
            public long f26741f;

            /* renamed from: g  reason: collision with root package name */
            public long f26742g;

            public a(long firstStartInNanoseconds, @i.a.e1.b.f Runnable decoratedRun, long firstNowNanoseconds, @i.a.e1.b.f i.a.e1.h.a.f sd, long periodInNanoseconds) {
                this.b = decoratedRun;
                this.c = sd;
                this.f26739d = periodInNanoseconds;
                this.f26741f = firstNowNanoseconds;
                this.f26742g = firstStartInNanoseconds;
            }

            @Override // i.a.e1.n.a
            public Runnable getWrappedRunnable() {
                return this.b;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j2;
                this.b.run();
                if (this.c.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long a2 = cVar.a(timeUnit);
                long j3 = q0.b;
                long j4 = this.f26741f;
                if (a2 + j3 >= j4) {
                    long j5 = this.f26739d;
                    if (a2 < j4 + j5 + j3) {
                        long j6 = this.f26742g;
                        long j7 = this.f26740e + 1;
                        this.f26740e = j7;
                        j2 = j6 + (j7 * j5);
                        this.f26741f = a2;
                        this.c.replace(c.this.c(this, j2 - a2, timeUnit));
                    }
                }
                long j8 = this.f26739d;
                long j9 = a2 + j8;
                long j10 = this.f26740e + 1;
                this.f26740e = j10;
                this.f26742g = j9 - (j8 * j10);
                j2 = j9;
                this.f26741f = a2;
                this.c.replace(c.this.c(this, j2 - a2, timeUnit));
            }
        }

        public long a(@i.a.e1.b.f TimeUnit unit) {
            return unit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @i.a.e1.b.f
        public i.a.e1.d.f b(@i.a.e1.b.f Runnable run) {
            return c(run, 0L, TimeUnit.NANOSECONDS);
        }

        @i.a.e1.b.f
        public abstract i.a.e1.d.f c(@i.a.e1.b.f Runnable run, long delay, @i.a.e1.b.f TimeUnit unit);

        @i.a.e1.b.f
        public i.a.e1.d.f d(@i.a.e1.b.f Runnable run, final long initialDelay, final long period, @i.a.e1.b.f final TimeUnit unit) {
            i.a.e1.h.a.f fVar = new i.a.e1.h.a.f();
            i.a.e1.h.a.f fVar2 = new i.a.e1.h.a.f(fVar);
            Runnable b0 = i.a.e1.l.a.b0(run);
            long nanos = unit.toNanos(period);
            long a2 = a(TimeUnit.NANOSECONDS);
            i.a.e1.d.f c = c(new a(a2 + unit.toNanos(initialDelay), b0, a2, fVar2, nanos), initialDelay, unit);
            if (c == i.a.e1.h.a.d.INSTANCE) {
                return c;
            }
            fVar.replace(c);
            return fVar2;
        }
    }

    public static long b() {
        return b;
    }

    @i.a.e1.b.f
    public abstract c c();

    public long d(@i.a.e1.b.f TimeUnit unit) {
        return unit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @i.a.e1.b.f
    public i.a.e1.d.f e(@i.a.e1.b.f Runnable run) {
        return f(run, 0L, TimeUnit.NANOSECONDS);
    }

    @i.a.e1.b.f
    public i.a.e1.d.f f(@i.a.e1.b.f Runnable run, long delay, @i.a.e1.b.f TimeUnit unit) {
        c c2 = c();
        a aVar = new a(i.a.e1.l.a.b0(run), c2);
        c2.c(aVar, delay, unit);
        return aVar;
    }

    @i.a.e1.b.f
    public i.a.e1.d.f g(@i.a.e1.b.f Runnable run, long initialDelay, long period, @i.a.e1.b.f TimeUnit unit) {
        c c2 = c();
        b bVar = new b(i.a.e1.l.a.b0(run), c2);
        i.a.e1.d.f d2 = c2.d(bVar, initialDelay, period, unit);
        return d2 == i.a.e1.h.a.d.INSTANCE ? d2 : bVar;
    }

    public void h() {
    }

    public void i() {
    }

    @i.a.e1.b.f
    public <S extends q0 & i.a.e1.d.f> S j(@i.a.e1.b.f i.a.e1.g.o<s<s<j>>, j> combine) {
        Objects.requireNonNull(combine, "combine is null");
        return new i.a.e1.h.h.q(combine, this);
    }
}
