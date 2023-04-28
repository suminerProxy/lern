package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublishSelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m2<T, R> extends i.a.e1.h.f.e.a<T, R> {
    public final i.a.e1.g.o<? super i.a.e1.c.i0<T>, ? extends i.a.e1.c.n0<R>> c;

    /* compiled from: ObservablePublishSelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.p0<T> {
        public final i.a.e1.o.e<T> b;
        public final AtomicReference<i.a.e1.d.f> c;

        public a(i.a.e1.o.e<T> subject, AtomicReference<i.a.e1.d.f> target) {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T value) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: ObservablePublishSelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<R> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<R>, i.a.e1.d.f {
        private static final long serialVersionUID = 854110278590336484L;
        public final i.a.e1.c.p0<? super R> downstream;
        public i.a.e1.d.f upstream;

        public b(i.a.e1.c.p0<? super R> downstream) {
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
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(R value) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public m2(final i.a.e1.c.n0<T> source, final i.a.e1.g.o<? super i.a.e1.c.i0<T>, ? extends i.a.e1.c.n0<R>> selector) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
