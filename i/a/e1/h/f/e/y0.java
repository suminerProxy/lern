package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class y0<T> extends i.a.e1.c.j implements i.a.e1.h.c.f<T> {
    public final i.a.e1.c.n0<T> b;
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27678d;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.d.f, i.a.e1.c.p0<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final i.a.e1.c.m downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper;
        public final i.a.e1.d.d set;
        public i.a.e1.d.f upstream;

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: i.a.e1.h.f.e.y0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0492a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m, i.a.e1.d.f {
            private static final long serialVersionUID = 8606673141535671828L;
            public final /* synthetic */ a this$0;

            public C0492a(final a this$0) {
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
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.m observer, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void innerComplete(a<T>.C0492a inner) {
        }

        public void innerError(a<T>.C0492a inner, Throwable e2) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T value) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public y0(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }

    @Override // i.a.e1.h.c.f
    public i.a.e1.c.i0<T> a() {
    }
}
