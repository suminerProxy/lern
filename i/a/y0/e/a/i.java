package i.a.y0.e.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableDelay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i extends i.a.c {
    public final i.a.i b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f28186d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.j0 f28187e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28188f;

    /* compiled from: CompletableDelay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<i.a.u0.c> implements i.a.f, Runnable, i.a.u0.c {
        private static final long serialVersionUID = 465972761105851022L;
        public final long delay;
        public final boolean delayError;
        public final i.a.f downstream;
        public Throwable error;
        public final i.a.j0 scheduler;
        public final TimeUnit unit;

        public a(i.a.f fVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.f
        public void onComplete() {
        }

        @Override // i.a.f
        public void onError(Throwable th) {
        }

        @Override // i.a.f
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public i(i.a.i iVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var, boolean z) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }
}
