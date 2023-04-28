package i.a.y0.e.g;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x0<T, U> extends i.a.k0<T> {
    public final Callable<U> b;
    public final i.a.x0.o<? super U, ? extends i.a.q0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.g<? super U> f29095d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29096e;

    /* compiled from: SingleUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends AtomicReference<Object> implements i.a.n0<T>, i.a.u0.c {
        private static final long serialVersionUID = -5331524057054083935L;
        public final i.a.x0.g<? super U> disposer;
        public final i.a.n0<? super T> downstream;
        public final boolean eager;
        public i.a.u0.c upstream;

        public a(i.a.n0<? super T> n0Var, U u, boolean z, i.a.x0.g<? super U> gVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeAfter() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.n0
        public void onError(Throwable th) {
        }

        @Override // i.a.n0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.n0
        public void onSuccess(T t) {
        }
    }

    public x0(Callable<U> callable, i.a.x0.o<? super U, ? extends i.a.q0<? extends T>> oVar, i.a.x0.g<? super U> gVar, boolean z) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super T> n0Var) {
    }
}
