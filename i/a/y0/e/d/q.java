package i.a.y0.e.d;

import i.a.b0;
import i.a.i0;
import i.a.n0;
import i.a.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class q<T, R> extends b0<R> {
    public final b0<T> b;
    public final i.a.x0.o<? super T, ? extends q0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28697d;

    /* compiled from: ObservableSwitchMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i0<T>, i.a.u0.c {
        public static final C0567a<Object> INNER_DISPOSED = null;
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final i0<? super R> downstream;
        public final i.a.y0.j.c errors;
        public final AtomicReference<C0567a<R>> inner;
        public final i.a.x0.o<? super T, ? extends q0<? extends R>> mapper;
        public i.a.u0.c upstream;

        /* compiled from: ObservableSwitchMapSingle.java */
        /* renamed from: i.a.y0.e.d.q$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0567a<R> extends AtomicReference<i.a.u0.c> implements n0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public volatile R item;
            public final a<?, R> parent;

            public C0567a(a<?, R> aVar) {
            }

            public void dispose() {
            }

            @Override // i.a.n0
            public void onError(Throwable th) {
            }

            @Override // i.a.n0
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.n0
            public void onSuccess(R r) {
            }
        }

        public a(i0<? super R> i0Var, i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeInner() {
        }

        public void drain() {
        }

        public void innerError(C0567a<R> c0567a, Throwable th) {
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

    public q(b0<T> b0Var, i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super R> i0Var) {
    }
}
