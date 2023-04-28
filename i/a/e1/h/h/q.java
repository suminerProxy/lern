package i.a.e1.h.h;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class q extends q0 implements i.a.e1.d.f {

    /* renamed from: f  reason: collision with root package name */
    public static final i.a.e1.d.f f27846f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final i.a.e1.d.f f27847g = i.a.e1.d.e.a();
    private final q0 c;

    /* renamed from: d  reason: collision with root package name */
    private final i.a.e1.m.c<i.a.e1.c.s<i.a.e1.c.j>> f27848d;

    /* renamed from: e  reason: collision with root package name */
    private i.a.e1.d.f f27849e;

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements i.a.e1.g.o<f, i.a.e1.c.j> {
        public final q0.c b;

        /* compiled from: SchedulerWhen.java */
        /* renamed from: i.a.e1.h.h.q$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0507a extends i.a.e1.c.j {
            public final f b;
            public final /* synthetic */ a c;

            public C0507a(final a this$0, f action) {
            }

            @Override // i.a.e1.c.j
            public void Y0(i.a.e1.c.m actionCompletable) {
            }
        }

        public a(q0.c actualWorker) {
        }

        public i.a.e1.c.j a(final f action) {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ i.a.e1.c.j apply(final f action) throws Throwable {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class b extends f {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        public b(Runnable action, long delayTime, TimeUnit unit) {
        }

        @Override // i.a.e1.h.h.q.f
        public i.a.e1.d.f callActual(q0.c actualWorker, i.a.e1.c.m actionCompletable) {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class c extends f {
        private final Runnable action;

        public c(Runnable action) {
        }

        @Override // i.a.e1.h.h.q.f
        public i.a.e1.d.f callActual(q0.c actualWorker, i.a.e1.c.m actionCompletable) {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class d implements Runnable {
        public final i.a.e1.c.m b;
        public final Runnable c;

        public d(Runnable action, i.a.e1.c.m actionCompletable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e extends q0.c {
        private final AtomicBoolean b;
        private final i.a.e1.m.c<f> c;

        /* renamed from: d  reason: collision with root package name */
        private final q0.c f27850d;

        public e(i.a.e1.m.c<f> actionProcessor, q0.c actualWorker) {
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f b(@i.a.e1.b.f final Runnable action) {
        }

        @Override // i.a.e1.c.q0.c
        @i.a.e1.b.f
        public i.a.e1.d.f c(@i.a.e1.b.f final Runnable action, final long delayTime, @i.a.e1.b.f final TimeUnit unit) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class f extends AtomicReference<i.a.e1.d.f> implements i.a.e1.d.f {
        public void call(q0.c actualWorker, i.a.e1.c.m actionCompletable) {
        }

        public abstract i.a.e1.d.f callActual(q0.c actualWorker, i.a.e1.c.m actionCompletable);

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g implements i.a.e1.d.f {
        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(i.a.e1.g.o<i.a.e1.c.s<i.a.e1.c.s<i.a.e1.c.j>>, i.a.e1.c.j> combine, q0 actualScheduler) {
        this.c = actualScheduler;
        i.a.e1.m.c i9 = i.a.e1.m.h.k9().i9();
        this.f27848d = i9;
        try {
            this.f27849e = ((i.a.e1.c.j) combine.apply(i9)).V0();
        } catch (Throwable th) {
            throw i.a.e1.h.k.k.i(th);
        }
    }

    @Override // i.a.e1.c.q0
    @i.a.e1.b.f
    public q0.c c() {
        q0.c c2 = this.c.c();
        i.a.e1.m.c<T> i9 = i.a.e1.m.h.k9().i9();
        i.a.e1.c.s<i.a.e1.c.j> X3 = i9.X3(new a(c2));
        e eVar = new e(i9, c2);
        this.f27848d.onNext(X3);
        return eVar;
    }

    @Override // i.a.e1.d.f
    public void dispose() {
        this.f27849e.dispose();
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        return this.f27849e.isDisposed();
    }
}
