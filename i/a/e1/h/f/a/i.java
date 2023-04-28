package i.a.e1.h.f.a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableDelay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i extends i.a.e1.c.j {
    public final i.a.e1.c.p b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f26845d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f26846e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f26847f;

    /* compiled from: CompletableDelay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m, Runnable, i.a.e1.d.f {
        private static final long serialVersionUID = 465972761105851022L;
        public final long delay;
        public final boolean delayError;
        public final i.a.e1.c.m downstream;
        public Throwable error;
        public final i.a.e1.c.q0 scheduler;
        public final TimeUnit unit;

        public a(i.a.e1.c.m downstream, long delay, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean delayError) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.m
        public void onError(final Throwable e2) {
        }

        @Override // i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public i(i.a.e1.c.p source, long delay, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean delayError) {
    }

    @Override // i.a.e1.c.j
    public void Y0(final i.a.e1.c.m observer) {
    }
}
