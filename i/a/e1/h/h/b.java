package i.a.e1.h.h;

import i.a.e1.c.q0;
import i.a.e1.h.h.o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b extends q0 implements o {

    /* renamed from: e  reason: collision with root package name */
    public static final C0505b f27793e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f27794f = "RxComputationThreadPool";

    /* renamed from: g  reason: collision with root package name */
    public static final k f27795g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f27796h = "rx3.computation-threads";

    /* renamed from: i  reason: collision with root package name */
    public static final int f27797i = k(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f27796h, 0).intValue());

    /* renamed from: j  reason: collision with root package name */
    public static final c f27798j;

    /* renamed from: k  reason: collision with root package name */
    private static final String f27799k = "rx3.computation-priority";
    public final ThreadFactory c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<C0505b> f27800d;

    /* compiled from: ComputationScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends q0.c {
        private final i.a.e1.h.a.e b;
        private final i.a.e1.d.d c;

        /* renamed from: d  reason: collision with root package name */
        private final i.a.e1.h.a.e f27801d;

        /* renamed from: e  reason: collision with root package name */
        private final c f27802e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f27803f;

        public a(c poolWorker) {
            this.f27802e = poolWorker;
            i.a.e1.h.a.e eVar = new i.a.e1.h.a.e();
            this.b = eVar;
            i.a.e1.d.d dVar = new i.a.e1.d.d();
            this.c = dVar;
            i.a.e1.h.a.e eVar2 = new i.a.e1.h.a.e();
            this.f27801d = eVar2;
            eVar2.b(eVar);
            eVar2.b(dVar);
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f b(@i.a.e1.b.f Runnable action) {
            if (this.f27803f) {
                return i.a.e1.h.a.d.INSTANCE;
            }
            return this.f27802e.e(action, 0L, TimeUnit.MILLISECONDS, this.b);
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f c(@i.a.e1.b.f Runnable action, long delayTime, @i.a.e1.b.f TimeUnit unit) {
            if (this.f27803f) {
                return i.a.e1.h.a.d.INSTANCE;
            }
            return this.f27802e.e(action, delayTime, unit, this.c);
        }

        @Override // i.a.e1.d.f
        public void dispose() {
            if (this.f27803f) {
                return;
            }
            this.f27803f = true;
            this.f27801d.dispose();
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
            return this.f27803f;
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* renamed from: i.a.e1.h.h.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0505b implements o {
        public final int b;
        public final c[] c;

        /* renamed from: d  reason: collision with root package name */
        public long f27804d;

        public C0505b(int maxThreads, ThreadFactory threadFactory) {
            this.b = maxThreads;
            this.c = new c[maxThreads];
            for (int i2 = 0; i2 < maxThreads; i2++) {
                this.c[i2] = new c(threadFactory);
            }
        }

        @Override // i.a.e1.h.h.o
        public void a(int number, o.a callback) {
            int i2 = this.b;
            if (i2 == 0) {
                for (int i3 = 0; i3 < number; i3++) {
                    callback.a(i3, b.f27798j);
                }
                return;
            }
            int i4 = ((int) this.f27804d) % i2;
            for (int i5 = 0; i5 < number; i5++) {
                callback.a(i5, new a(this.c[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.f27804d = i4;
        }

        public c b() {
            int i2 = this.b;
            if (i2 == 0) {
                return b.f27798j;
            }
            c[] cVarArr = this.c;
            long j2 = this.f27804d;
            this.f27804d = 1 + j2;
            return cVarArr[(int) (j2 % i2)];
        }

        public void c() {
            for (c cVar : this.c) {
                cVar.dispose();
            }
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends i {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new k("RxComputationShutdown"));
        f27798j = cVar;
        cVar.dispose();
        k kVar = new k(f27794f, Math.max(1, Math.min(10, Integer.getInteger(f27799k, 5).intValue())), true);
        f27795g = kVar;
        C0505b c0505b = new C0505b(0, kVar);
        f27793e = c0505b;
        c0505b.c();
    }

    public b() {
        this(f27795g);
    }

    public static int k(int cpuCount, int paramThreads) {
        return (paramThreads <= 0 || paramThreads > cpuCount) ? cpuCount : paramThreads;
    }

    @Override // i.a.e1.h.h.o
    public void a(int number, o.a callback) {
        i.a.e1.h.b.b.b(number, "number > 0 required");
        this.f27800d.get().a(number, callback);
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public q0.c c() {
        return new a(this.f27800d.get().b());
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f f(@i.a.e1.b.f Runnable run, long delay, TimeUnit unit) {
        return this.f27800d.get().b().f(run, delay, unit);
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f g(@i.a.e1.b.f Runnable run, long initialDelay, long period, TimeUnit unit) {
        return this.f27800d.get().b().g(run, initialDelay, period, unit);
    }

    @Override // i.a.e1.c.q0
    public void h() {
        AtomicReference<C0505b> atomicReference = this.f27800d;
        C0505b c0505b = f27793e;
        C0505b andSet = atomicReference.getAndSet(c0505b);
        if (andSet != c0505b) {
            andSet.c();
        }
    }

    @Override // i.a.e1.c.q0
    public void i() {
        C0505b c0505b = new C0505b(f27797i, this.c);
        if (this.f27800d.compareAndSet(f27793e, c0505b)) {
            return;
        }
        c0505b.c();
    }

    public b(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.f27800d = new AtomicReference<>(f27793e);
        i();
    }
}
