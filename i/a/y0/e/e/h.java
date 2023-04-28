package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableAmb.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h<T> extends i.a.b0<T> {
    public final i.a.g0<? extends T>[] b;
    public final Iterable<? extends i.a.g0<? extends T>> c;

    /* compiled from: ObservableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.u0.c {
        public final i.a.i0<? super T> b;
        public final b<T>[] c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f28787d;

        public a(i.a.i0<? super T> i0Var, int i2) {
        }

        public void a(i.a.g0<? extends T>[] g0VarArr) {
        }

        public boolean b(int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicReference<i.a.u0.c> implements i.a.i0<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        public final i.a.i0<? super T> downstream;
        public final int index;
        public final a<T> parent;
        public boolean won;

        public b(a<T> aVar, int i2, i.a.i0<? super T> i0Var) {
        }

        public void dispose() {
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

    public h(i.a.g0<? extends T>[] g0VarArr, Iterable<? extends i.a.g0<? extends T>> iterable) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
