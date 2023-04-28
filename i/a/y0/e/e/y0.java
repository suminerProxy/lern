package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class y0<T> extends i.a.c implements i.a.y0.c.d<T> {
    public final i.a.g0<T> b;
    public final i.a.x0.o<? super T, ? extends i.a.i> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28998d;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.u0.c, i.a.i0<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final i.a.f downstream;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends i.a.i> mapper;
        public final i.a.u0.b set;
        public i.a.u0.c upstream;

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: i.a.y0.e.e.y0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0583a extends AtomicReference<i.a.u0.c> implements i.a.f, i.a.u0.c {
            private static final long serialVersionUID = 8606673141535671828L;
            public final /* synthetic */ a this$0;

            public C0583a(a aVar) {
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
        }

        public a(i.a.f fVar, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void innerComplete(a<T>.C0583a c0583a) {
        }

        public void innerError(a<T>.C0583a c0583a, Throwable th) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public y0(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }

    @Override // i.a.y0.c.d
    public i.a.b0<T> a() {
    }
}
