package i.a.e1.n;

import i.a.e1.b.f;
import i.a.e1.c.q0;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: TestScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c extends q0 {
    public final Queue<b> c;

    /* renamed from: d  reason: collision with root package name */
    public long f27990d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f27991e;

    /* compiled from: TestScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a extends q0.c {
        public volatile boolean b;
        public final /* synthetic */ c c;

        /* compiled from: TestScheduler.java */
        /* renamed from: i.a.e1.n.c$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class RunnableC0512a implements Runnable {
            public final b b;
            public final /* synthetic */ a c;

            public RunnableC0512a(final a this$1, b timedAction) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(final c this$0) {
        }

        @Override // i.a.e1.c.q0.c
        public long a(@f TimeUnit unit) {
        }

        @Override // i.a.e1.c.q0.c
        @f
        public i.a.e1.d.f b(@f Runnable run) {
        }

        @Override // i.a.e1.c.q0.c
        @f
        public i.a.e1.d.f c(@f Runnable run, long delayTime, @f TimeUnit unit) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: TestScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b implements Comparable<b> {
        public final long b;
        public final Runnable c;

        /* renamed from: d  reason: collision with root package name */
        public final a f27992d;

        /* renamed from: e  reason: collision with root package name */
        public final long f27993e;

        public b(a scheduler, long time, Runnable run, long count) {
        }

        public int a(b o2) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(b o2) {
        }

        public String toString() {
        }
    }

    public c() {
    }

    private void n(long targetTimeInNanoseconds) {
    }

    @Override // i.a.e1.c.q0
    @f
    public q0.c c() {
    }

    @Override // i.a.e1.c.q0
    public long d(@f TimeUnit unit) {
    }

    public void k(long delayTime, TimeUnit unit) {
    }

    public void l(long delayTime, TimeUnit unit) {
    }

    public void m() {
    }

    public c(long delayTime, TimeUnit unit) {
    }
}
