package i.a.y0.e.e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d4<T, D> extends i.a.b0<T> {
    public final Callable<? extends D> b;
    public final i.a.x0.o<? super D, ? extends i.a.g0<? extends T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.g<? super D> f28731d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28732e;

    /* compiled from: ObservableUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, D> extends AtomicBoolean implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 5904473792286235046L;
        public final i.a.x0.g<? super D> disposer;
        public final i.a.i0<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public i.a.u0.c upstream;

        public a(i.a.i0<? super T> i0Var, D d2, i.a.x0.g<? super D> gVar, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeAfter() {
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

    public d4(Callable<? extends D> callable, i.a.x0.o<? super D, ? extends i.a.g0<? extends T>> oVar, i.a.x0.g<? super D> gVar, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
