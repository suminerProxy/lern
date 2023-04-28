package i.a.s0.c;

import android.annotation.SuppressLint;
import android.os.Handler;
import i.a.j0;
import i.a.u0.c;
import java.util.concurrent.TimeUnit;

/* compiled from: HandlerScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b extends j0 {
    private final Handler c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f28127d;

    /* compiled from: HandlerScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends j0.c {
        private final Handler b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f28128d;

        public a(Handler handler, boolean z) {
        }

        @Override // i.a.j0.c
        @SuppressLint({"NewApi"})
        public c c(Runnable runnable, long j2, TimeUnit timeUnit) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: HandlerScheduler.java */
    /* renamed from: i.a.s0.c.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class RunnableC0521b implements Runnable, c {
        private final Handler b;
        private final Runnable c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f28129d;

        public RunnableC0521b(Handler handler, Runnable runnable) {
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

    public b(Handler handler, boolean z) {
    }

    @Override // i.a.j0
    public j0.c c() {
    }

    @Override // i.a.j0
    @SuppressLint({"NewApi"})
    public c f(Runnable runnable, long j2, TimeUnit timeUnit) {
    }
}
