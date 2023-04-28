package i.a.y0.e.d;

import i.a.b0;
import i.a.i0;
import i.a.v;
import i.a.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class p<T, R> extends b0<R> {
    public final b0<T> b;
    public final i.a.x0.o<? super T, ? extends y<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28696d;

    /* compiled from: ObservableSwitchMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i0<T>, i.a.u0.c {
        public static final C0566a<Object> INNER_DISPOSED = null;
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final i0<? super R> downstream;
        public final i.a.y0.j.c errors;
        public final AtomicReference<C0566a<R>> inner;
        public final i.a.x0.o<? super T, ? extends y<? extends R>> mapper;
        public i.a.u0.c upstream;

        /* compiled from: ObservableSwitchMapMaybe.java */
        /* renamed from: i.a.y0.e.d.p$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0566a<R> extends AtomicReference<i.a.u0.c> implements v<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public volatile R item;
            public final a<?, R> parent;

            public C0566a(a<?, R> aVar) {
            }

            public void dispose() {
            }

            @Override // i.a.v
            public void onComplete() {
            }

            @Override // i.a.v
            public void onError(Throwable th) {
            }

            @Override // i.a.v
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.v, i.a.n0
            public void onSuccess(R r) {
            }
        }

        public a(i0<? super R> i0Var, i.a.x0.o<? super T, ? extends y<? extends R>> oVar, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeInner() {
        }

        public void drain() {
        }

        public void innerComplete(C0566a<R> c0566a) {
        }

        public void innerError(C0566a<R> c0566a, Throwable th) {
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

    public p(b0<T> b0Var, i.a.x0.o<? super T, ? extends y<? extends R>> oVar, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super R> i0Var) {
    }
}
