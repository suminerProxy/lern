package i.a.y0.g;

import i.a.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExecutorScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d extends j0 {

    /* renamed from: e  reason: collision with root package name */
    public static final j0 f29118e = null;
    public final boolean c;
    @i.a.t0.f

    /* renamed from: d  reason: collision with root package name */
    public final Executor f29119d;

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a implements Runnable {
        private final b b;
        public final /* synthetic */ d c;

        public a(d dVar, b bVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b extends AtomicReference<Runnable> implements Runnable, i.a.u0.c, i.a.f1.a {
        private static final long serialVersionUID = -4101336210206799084L;
        public final i.a.y0.a.h direct;
        public final i.a.y0.a.h timed;

        public b(Runnable runnable) {
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

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends j0.c implements Runnable {
        public final boolean b;
        public final Executor c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.y0.f.a<Runnable> f29120d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f29121e;

        /* renamed from: f  reason: collision with root package name */
        public final AtomicInteger f29122f;

        /* renamed from: g  reason: collision with root package name */
        public final i.a.u0.b f29123g;

        /* compiled from: ExecutorScheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class a extends AtomicBoolean implements Runnable, i.a.u0.c {
            private static final long serialVersionUID = -2421395018820541164L;
            public final Runnable actual;

            public a(Runnable runnable) {
            }

            @Override // i.a.u0.c
            public void dispose() {
            }

            @Override // i.a.u0.c
            public boolean isDisposed() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class b extends AtomicInteger implements Runnable, i.a.u0.c {
            public static final int FINISHED = 2;
            public static final int INTERRUPTED = 4;
            public static final int INTERRUPTING = 3;
            public static final int READY = 0;
            public static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            public final Runnable run;
            public final i.a.y0.a.c tasks;
            public volatile Thread thread;

            public b(Runnable runnable, i.a.y0.a.c cVar) {
            }

            public void cleanup() {
            }

            @Override // i.a.u0.c
            public void dispose() {
            }

            @Override // i.a.u0.c
            public boolean isDisposed() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: i.a.y0.g.d$c$c  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class RunnableC0595c implements Runnable {
            private final i.a.y0.a.h b;
            private final Runnable c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ c f29124d;

            public RunnableC0595c(c cVar, i.a.y0.a.h hVar, Runnable runnable) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(Executor executor, boolean z) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public d(@i.a.t0.f Executor executor, boolean z) {
    }

    @Override // i.a.j0
    @i.a.t0.f
    public j0.c c() {
    }

    @Override // i.a.j0
    @i.a.t0.f
    public i.a.u0.c e(@i.a.t0.f Runnable runnable) {
    }

    @Override // i.a.j0
    @i.a.t0.f
    public i.a.u0.c f(@i.a.t0.f Runnable runnable, long j2, TimeUnit timeUnit) {
    }

    @Override // i.a.j0
    @i.a.t0.f
    public i.a.u0.c g(@i.a.t0.f Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
    }
}
