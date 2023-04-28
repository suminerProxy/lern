package i.a.e1.a.d;

import android.annotation.SuppressLint;
import android.os.Handler;
import i.a.e1.c.q0;
import i.a.e1.d.f;
import java.util.concurrent.TimeUnit;

/* compiled from: HandlerScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class c extends q0 {
    private final Handler c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f26720d;

    /* compiled from: HandlerScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a extends q0.c {
        private final Handler b;
        private final boolean c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f26721d;

        public a(Handler handler, boolean z) {
        }

        @Override // i.a.e1.c.q0.c
        @SuppressLint({"NewApi"})
        public f c(Runnable runnable, long j2, TimeUnit timeUnit) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: HandlerScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b implements Runnable, f {
        private final Handler b;
        private final Runnable c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f26722d;

        public b(Handler handler, Runnable runnable) {
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

    public c(Handler handler, boolean z) {
    }

    @Override // i.a.e1.c.q0
    public q0.c c() {
    }

    @Override // i.a.e1.c.q0
    @SuppressLint({"NewApi"})
    public f f(Runnable runnable, long j2, TimeUnit timeUnit) {
    }
}
