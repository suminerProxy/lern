package i.a.e1.h.h;

import i.a.e1.c.q0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExecutorScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d extends q0 {

    /* renamed from: f  reason: collision with root package name */
    public static final q0 f27805f = i.a.e1.n.b.h();
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27806d;
    @i.a.e1.b.f

    /* renamed from: e  reason: collision with root package name */
    public final Executor f27807e;

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a implements Runnable {
        private final b b;
        public final /* synthetic */ d c;

        public a(final d this$0, b dr) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends AtomicReference<Runnable> implements Runnable, i.a.e1.d.f, i.a.e1.n.a {
        private static final long serialVersionUID = -4101336210206799084L;
        public final i.a.e1.h.a.f direct;
        public final i.a.e1.h.a.f timed;

        public b(Runnable run) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.n.a
        public Runnable getWrappedRunnable() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends q0.c implements Runnable {
        public final boolean b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final Executor f27808d;

        /* renamed from: e  reason: collision with root package name */
        public final i.a.e1.h.g.a<Runnable> f27809e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f27810f;

        /* renamed from: g  reason: collision with root package name */
        public final AtomicInteger f27811g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.e1.d.d f27812h;

        /* compiled from: ExecutorScheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class a extends AtomicBoolean implements Runnable, i.a.e1.d.f {
            private static final long serialVersionUID = -2421395018820541164L;
            public final Runnable actual;

            public a(Runnable actual) {
            }

            @Override // i.a.e1.d.f
            public void dispose() {
            }

            @Override // i.a.e1.d.f
            public boolean isDisposed() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class b extends AtomicInteger implements Runnable, i.a.e1.d.f {
            public static final int FINISHED = 2;
            public static final int INTERRUPTED = 4;
            public static final int INTERRUPTING = 3;
            public static final int READY = 0;
            public static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            public final Runnable run;
            public final i.a.e1.d.g tasks;
            public volatile Thread thread;

            public b(Runnable run, i.a.e1.d.g tasks) {
            }

            public void cleanup() {
            }

            @Override // i.a.e1.d.f
            public void dispose() {
            }

            @Override // i.a.e1.d.f
            public boolean isDisposed() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: i.a.e1.h.h.d$c$c  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class RunnableC0506c implements Runnable {
            private final i.a.e1.h.a.f b;
            private final Runnable c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ c f27813d;

            public RunnableC0506c(final c this$0, i.a.e1.h.a.f mar, Runnable decoratedRun) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public c(Executor executor, boolean interruptibleWorker, boolean fair) {
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f b(@i.a.e1.b.f Runnable run) {
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f c(@i.a.e1.b.f Runnable run, long delay, @i.a.e1.b.f TimeUnit unit) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void e() {
        }

        public void f() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public d(@i.a.e1.b.f Executor executor, boolean interruptibleWorker, boolean fair) {
        this.f27807e = executor;
        this.c = interruptibleWorker;
        this.f27806d = fair;
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public q0.c c() {
        return new c(this.f27807e, this.c, this.f27806d);
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f e(@i.a.e1.b.f Runnable run) {
        Runnable b0 = i.a.e1.l.a.b0(run);
        try {
            if (this.f27807e instanceof ExecutorService) {
                m mVar = new m(b0);
                mVar.setFuture(((ExecutorService) this.f27807e).submit(mVar));
                return mVar;
            } else if (this.c) {
                c.b bVar = new c.b(b0, null);
                this.f27807e.execute(bVar);
                return bVar;
            } else {
                c.a aVar = new c.a(b0);
                this.f27807e.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e2) {
            i.a.e1.l.a.Y(e2);
            return i.a.e1.h.a.d.INSTANCE;
        }
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f f(@i.a.e1.b.f Runnable run, final long delay, final TimeUnit unit) {
        Runnable b0 = i.a.e1.l.a.b0(run);
        if (this.f27807e instanceof ScheduledExecutorService) {
            try {
                m mVar = new m(b0);
                mVar.setFuture(((ScheduledExecutorService) this.f27807e).schedule(mVar, delay, unit));
                return mVar;
            } catch (RejectedExecutionException e2) {
                i.a.e1.l.a.Y(e2);
                return i.a.e1.h.a.d.INSTANCE;
            }
        }
        b bVar = new b(b0);
        bVar.timed.replace(f27805f.f(new a(this, bVar), delay, unit));
        return bVar;
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f g(@i.a.e1.b.f Runnable run, long initialDelay, long period, TimeUnit unit) {
        if (this.f27807e instanceof ScheduledExecutorService) {
            try {
                l lVar = new l(i.a.e1.l.a.b0(run));
                lVar.setFuture(((ScheduledExecutorService) this.f27807e).scheduleAtFixedRate(lVar, initialDelay, period, unit));
                return lVar;
            } catch (RejectedExecutionException e2) {
                i.a.e1.l.a.Y(e2);
                return i.a.e1.h.a.d.INSTANCE;
            }
        }
        return super.g(run, initialDelay, period, unit);
    }
}
