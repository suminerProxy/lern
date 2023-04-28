package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class x0<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27674d;

    /* compiled from: ObservableFlatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.e.b<T> implements i.a.e1.c.p0<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper;
        public final i.a.e1.d.d set;
        public i.a.e1.d.f upstream;

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: i.a.e1.h.f.e.x0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0491a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m, i.a.e1.d.f {
            private static final long serialVersionUID = 8606673141535671828L;
            public final /* synthetic */ a this$0;

            public C0491a(final a this$0) {
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

        public a(i.a.e1.c.p0<? super T> observer, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void innerComplete(a<T>.C0491a inner) {
        }

        public void innerError(a<T>.C0491a inner, Throwable e2) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
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

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public x0(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, boolean delayErrors) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
