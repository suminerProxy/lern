package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWithLatestFrom.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o4<T, U, R> extends i.a.e1.h.f.e.a<T, R> {
    public final i.a.e1.g.c<? super T, ? super U, ? extends R> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.n0<? extends U> f27558d;

    /* compiled from: ObservableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U, R> extends AtomicReference<U> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -312246233408980075L;
        public final i.a.e1.g.c<? super T, ? super U, ? extends R> combiner;
        public final i.a.e1.c.p0<? super R> downstream;
        public final AtomicReference<i.a.e1.d.f> other;
        public final AtomicReference<i.a.e1.d.f> upstream;

        public a(i.a.e1.c.p0<? super R> actual, i.a.e1.g.c<? super T, ? super U, ? extends R> combiner) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

        public void otherError(Throwable e2) {
        }

        public boolean setOther(i.a.e1.d.f o2) {
        }
    }

    /* compiled from: ObservableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class b implements i.a.e1.c.p0<U> {
        private final a<T, U, R> b;
        public final /* synthetic */ o4 c;

        public b(final o4 this$0, a<T, U, R> parent) {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(U t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public o4(i.a.e1.c.n0<T> source, i.a.e1.g.c<? super T, ? super U, ? extends R> combiner, i.a.e1.c.n0<? extends U> other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> t) {
    }
}
