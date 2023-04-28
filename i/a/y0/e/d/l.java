package i.a.y0.e.d;

import i.a.b0;
import i.a.i0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l<T> extends i.a.c {
    public final b0<T> b;
    public final i.a.x0.o<? super T, ? extends i.a.i> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.y0.j.j f28683d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28684e;

    /* compiled from: ObservableConcatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 3610901111000061034L;
        public volatile boolean active;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.f downstream;
        public final i.a.y0.j.j errorMode;
        public final i.a.y0.j.c errors;
        public final C0562a inner;
        public final i.a.x0.o<? super T, ? extends i.a.i> mapper;
        public final int prefetch;
        public i.a.y0.c.o<T> queue;
        public i.a.u0.c upstream;

        /* compiled from: ObservableConcatMapCompletable.java */
        /* renamed from: i.a.y0.e.d.l$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0562a extends AtomicReference<i.a.u0.c> implements i.a.f {
            private static final long serialVersionUID = 5638352172918776687L;
            public final a<?> parent;

            public C0562a(a<?> aVar) {
            }

            public void dispose() {
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

        public a(i.a.f fVar, i.a.x0.o<? super T, ? extends i.a.i> oVar, i.a.y0.j.j jVar, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable th) {
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

    public l(b0<T> b0Var, i.a.x0.o<? super T, ? extends i.a.i> oVar, i.a.y0.j.j jVar, int i2) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }
}
