package i.a.e1.h.f.e;

import java.util.Collection;

/* compiled from: ObservableBufferExactBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o<T, U extends Collection<? super T>, B> extends i.a.e1.h.f.e.a<T, U> {
    public final i.a.e1.c.n0<B> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.s<U> f27544d;

    /* compiled from: ObservableBufferExactBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U extends Collection<? super T>, B> extends i.a.e1.j.e<B> {
        public final b<T, U, B> c;

        public a(b<T, U, B> parent) {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(B t) {
        }
    }

    /* compiled from: ObservableBufferExactBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U extends Collection<? super T>, B> extends i.a.e1.h.e.w<T, U, U> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public final i.a.e1.g.s<U> L;
        public final i.a.e1.c.n0<B> M;
        public i.a.e1.d.f N;
        public i.a.e1.d.f O;
        public U P;

        public b(i.a.e1.c.p0<? super U> actual, i.a.e1.g.s<U> bufferSupplier, i.a.e1.c.n0<B> boundary) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.e.w, i.a.e1.h.k.r
        public /* bridge */ /* synthetic */ void f(i.a.e1.c.p0 a2, Object v) {
        }

        public void i(i.a.e1.c.p0<? super U> a2, U v) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void j() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public o(i.a.e1.c.n0<T> source, i.a.e1.c.n0<B> boundary, i.a.e1.g.s<U> bufferSupplier) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super U> t) {
    }
}
