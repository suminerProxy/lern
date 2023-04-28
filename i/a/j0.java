package i.a;

import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class j0 {
    public static final long b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements i.a.u0.c, Runnable, i.a.f1.a {
        @i.a.t0.f
        public final Runnable b;
        @i.a.t0.f
        public final c c;
        @i.a.t0.g

        /* renamed from: d  reason: collision with root package name */
        public Thread f28117d;

        public a(@i.a.t0.f Runnable runnable, @i.a.t0.f c cVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.f1.a
        public Runnable getWrappedRunnable() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Scheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements i.a.u0.c, Runnable, i.a.f1.a {
        @i.a.t0.f
        public final Runnable b;
        @i.a.t0.f
        public final c c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f28118d;

        public b(@i.a.t0.f Runnable runnable, @i.a.t0.f c cVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.f1.a
        public Runnable getWrappedRunnable() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: Scheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c implements i.a.u0.c {

        /* compiled from: Scheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class a implements Runnable, i.a.f1.a {
            @i.a.t0.f
            public final Runnable b;
            @i.a.t0.f
            public final i.a.y0.a.h c;

            /* renamed from: d  reason: collision with root package name */
            public final long f28119d;

            /* renamed from: e  reason: collision with root package name */
            public long f28120e;

            /* renamed from: f  reason: collision with root package name */
            public long f28121f;

            /* renamed from: g  reason: collision with root package name */
            public long f28122g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ c f28123h;

            public a(c cVar, @i.a.t0.f long j2, Runnable runnable, @i.a.t0.f long j3, i.a.y0.a.h hVar, long j4) {
            }

            @Override // i.a.f1.a
            public Runnable getWrappedRunnable() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public long a(@i.a.t0.f TimeUnit timeUnit) {
        }

        @i.a.t0.f
        public i.a.u0.c b(@i.a.t0.f Runnable runnable) {
        }

        @i.a.t0.f
        public abstract i.a.u0.c c(@i.a.t0.f Runnable runnable, long j2, @i.a.t0.f TimeUnit timeUnit);

        @i.a.t0.f
        public i.a.u0.c d(@i.a.t0.f Runnable runnable, long j2, long j3, @i.a.t0.f TimeUnit timeUnit) {
        }
    }

    public static long b() {
        return b;
    }

    @i.a.t0.f
    public abstract c c();

    public long d(@i.a.t0.f TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @i.a.t0.f
    public i.a.u0.c e(@i.a.t0.f Runnable runnable) {
        return f(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @i.a.t0.f
    public i.a.u0.c f(@i.a.t0.f Runnable runnable, long j2, @i.a.t0.f TimeUnit timeUnit) {
        c c2 = c();
        a aVar = new a(i.a.c1.a.b0(runnable), c2);
        c2.c(aVar, j2, timeUnit);
        return aVar;
    }

    @i.a.t0.f
    public i.a.u0.c g(@i.a.t0.f Runnable runnable, long j2, long j3, @i.a.t0.f TimeUnit timeUnit) {
        c c2 = c();
        b bVar = new b(i.a.c1.a.b0(runnable), c2);
        i.a.u0.c d2 = c2.d(bVar, j2, j3, timeUnit);
        return d2 == i.a.y0.a.e.INSTANCE ? d2 : bVar;
    }

    public void h() {
    }

    public void i() {
    }

    @i.a.t0.f
    public <S extends j0 & i.a.u0.c> S j(@i.a.t0.f i.a.x0.o<l<l<i.a.c>>, i.a.c> oVar) {
        return new i.a.y0.g.q(oVar, this);
    }
}
