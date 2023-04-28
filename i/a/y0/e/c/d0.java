package i.a.y0.e.c;

import java.util.Iterator;

/* compiled from: MaybeFlatMapIterableObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d0<T, R> extends i.a.b0<R> {
    public final i.a.y<T> b;
    public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> c;

    /* compiled from: MaybeFlatMapIterableObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.y0.d.c<R> implements i.a.v<T> {
        public final i.a.i0<? super R> b;
        public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> c;

        /* renamed from: d  reason: collision with root package name */
        public i.a.u0.c f28632d;

        /* renamed from: e  reason: collision with root package name */
        public volatile Iterator<? extends R> f28633e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f28634f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f28635g;

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
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
        public void onSuccess(T t) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public R poll() throws Exception {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public d0(i.a.y<T> yVar, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
