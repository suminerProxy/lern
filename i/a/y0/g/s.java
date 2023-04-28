package i.a.y0.g;

import i.a.j0;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s extends j0 {
    private static final s c = null;

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements Runnable {
        private final Runnable b;
        private final c c;

        /* renamed from: d  reason: collision with root package name */
        private final long f29169d;

        public a(Runnable runnable, c cVar, long j2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements Comparable<b> {
        public final Runnable b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29170d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f29171e;

        public b(Runnable runnable, Long l2, int i2) {
        }

        public int a(b bVar) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends j0.c implements i.a.u0.c {
        public final PriorityBlockingQueue<b> b;
        private final AtomicInteger c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f29172d;

        /* renamed from: e  reason: collision with root package name */
        public volatile boolean f29173e;

        /* compiled from: TrampolineScheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class a implements Runnable {
            public final b b;
            public final /* synthetic */ c c;

            public a(c cVar, b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
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

        public i.a.u0.c e(Runnable runnable, long j2) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    public static s k() {
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
}
