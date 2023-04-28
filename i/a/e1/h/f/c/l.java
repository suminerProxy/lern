package i.a.e1.h.f.c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeDelay.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l<T> extends i.a.e1.h.f.c.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27306d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27307e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27308f;

    /* compiled from: MaybeDelay.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;
        public final long delay;
        public final boolean delayError;
        public final i.a.e1.c.c0<? super T> downstream;
        public Throwable error;
        public final i.a.e1.c.q0 scheduler;
        public final TimeUnit unit;
        public T value;

        public a(i.a.e1.c.c0<? super T> actual, long delay, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean delayError) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void schedule(long delay) {
        }
    }

    public l(i.a.e1.c.f0<T> source, long delay, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean delayError) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
