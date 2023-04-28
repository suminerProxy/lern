package i.a.e1.h.h;

import i.a.e1.c.q0;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s extends q0 {
    private static final s c = new s();

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements Runnable {
        private final Runnable b;
        private final c c;

        /* renamed from: d  reason: collision with root package name */
        private final long f27857d;

        public a(Runnable run, c worker, long execTime) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b implements Comparable<b> {
        public final Runnable b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final int f27858d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f27859e;

        public b(Runnable run, Long execTime, int count) {
        }

        public int a(b that) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(b that) {
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends q0.c implements i.a.e1.d.f {
        public final PriorityBlockingQueue<b> b = new PriorityBlockingQueue<>();
        private final AtomicInteger c = new AtomicInteger();

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f27860d = new AtomicInteger();

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f27861e;

        /* compiled from: TrampolineScheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class a implements Runnable {
            public final b b;
            public final /* synthetic */ c c;

            public a(final c this$0, b timedRunnable) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f b(@i.a.e1.b.f Runnable action) {
            return e(action, a(TimeUnit.MILLISECONDS));
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f c(@i.a.e1.b.f Runnable action, long delayTime, @i.a.e1.b.f TimeUnit unit) {
            long a2 = a(TimeUnit.MILLISECONDS) + unit.toMillis(delayTime);
            return e(new a(action, this, a2), a2);
        }

        @Override // i.a.e1.d.f
        public void dispose() {
            this.f27861e = true;
        }

        public i.a.e1.d.f e(Runnable action, long execTime) {
            if (this.f27861e) {
                return i.a.e1.h.a.d.INSTANCE;
            }
            b bVar = new b(action, Long.valueOf(execTime), this.f27860d.incrementAndGet());
            this.b.add(bVar);
            if (this.c.getAndIncrement() == 0) {
                int i2 = 1;
                while (!this.f27861e) {
                    b poll = this.b.poll();
                    if (poll == null) {
                        i2 = this.c.addAndGet(-i2);
                        if (i2 == 0) {
                            return i.a.e1.h.a.d.INSTANCE;
                        }
                    } else if (!poll.f27859e) {
                        poll.b.run();
                    }
                }
                this.b.clear();
                return i.a.e1.h.a.d.INSTANCE;
            }
            return i.a.e1.d.e.g(new a(this, bVar));
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
            return this.f27861e;
        }
    }

    public static s k() {
        return c;
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public q0.c c() {
        return new c();
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f e(@i.a.e1.b.f Runnable run) {
        i.a.e1.l.a.b0(run).run();
        return i.a.e1.h.a.d.INSTANCE;
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public i.a.e1.d.f f(@i.a.e1.b.f Runnable run, long delay, TimeUnit unit) {
        try {
            unit.sleep(delay);
            i.a.e1.l.a.b0(run).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            i.a.e1.l.a.Y(e2);
        }
        return i.a.e1.h.a.d.INSTANCE;
    }
}
