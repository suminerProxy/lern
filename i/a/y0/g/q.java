package i.a.y0.g;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class q extends j0 implements i.a.u0.c {

    /* renamed from: f  reason: collision with root package name */
    public static final i.a.u0.c f29158f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final i.a.u0.c f29159g = null;
    private final j0 c;

    /* renamed from: d  reason: collision with root package name */
    private final i.a.d1.c<i.a.l<i.a.c>> f29160d;

    /* renamed from: e  reason: collision with root package name */
    private i.a.u0.c f29161e;

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements i.a.x0.o<f, i.a.c> {
        public final j0.c b;

        /* compiled from: SchedulerWhen.java */
        /* renamed from: i.a.y0.g.q$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0596a extends i.a.c {
            public final f b;
            public final /* synthetic */ a c;

            public C0596a(a aVar, f fVar) {
            }

            @Override // i.a.c
            public void I0(i.a.f fVar) {
            }
        }

        public a(j0.c cVar) {
        }

        public i.a.c a(f fVar) {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ i.a.c apply(f fVar) throws Exception {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b extends f {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        public b(Runnable runnable, long j2, TimeUnit timeUnit) {
        }

        @Override // i.a.y0.g.q.f
        public i.a.u0.c callActual(j0.c cVar, i.a.f fVar) {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class c extends f {
        private final Runnable action;

        public c(Runnable runnable) {
        }

        @Override // i.a.y0.g.q.f
        public i.a.u0.c callActual(j0.c cVar, i.a.f fVar) {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class d implements Runnable {
        public final i.a.f b;
        public final Runnable c;

        public d(Runnable runnable, i.a.f fVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e extends j0.c {
        private final AtomicBoolean b;
        private final i.a.d1.c<f> c;

        /* renamed from: d  reason: collision with root package name */
        private final j0.c f29162d;

        public e(i.a.d1.c<f> cVar, j0.c cVar2) {
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
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class f extends AtomicReference<i.a.u0.c> implements i.a.u0.c {
        public void call(j0.c cVar, i.a.f fVar) {
        }

        public abstract i.a.u0.c callActual(j0.c cVar, i.a.f fVar);

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: SchedulerWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class g implements i.a.u0.c {
        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    public q(i.a.x0.o<i.a.l<i.a.l<i.a.c>>, i.a.c> oVar, j0 j0Var) {
    }

    @Override // i.a.j0
    @i.a.t0.f
    public j0.c c() {
    }

    @Override // i.a.u0.c
    public void dispose() {
    }

    @Override // i.a.u0.c
    public boolean isDisposed() {
    }
}
