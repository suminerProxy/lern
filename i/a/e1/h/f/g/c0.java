package i.a.e1.h.f.g;

import java.util.Iterator;

/* compiled from: SingleFlatMapIterableObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c0<T, R> extends i.a.e1.c.i0<R> {
    public final i.a.e1.c.x0<T> b;
    public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> c;

    /* compiled from: SingleFlatMapIterableObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.h.e.b<R> implements i.a.e1.c.u0<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        public volatile boolean cancelled;
        public final i.a.e1.c.p0<? super R> downstream;
        public volatile Iterator<? extends R> it;
        public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper;
        public boolean outputFused;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public R poll() {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public c0(i.a.e1.c.x0<T> source, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
