package i.a.e1.h.f.c;

import java.util.Iterator;

/* compiled from: MaybeFlatMapIterableObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f0<T, R> extends i.a.e1.c.i0<R> {
    public final i.a.e1.c.f0<T> b;
    public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> c;

    /* compiled from: MaybeFlatMapIterableObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.h.e.c<R> implements i.a.e1.c.c0<T> {
        public final i.a.e1.c.p0<? super R> b;
        public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> c;

        /* renamed from: d  reason: collision with root package name */
        public i.a.e1.d.f f27293d;

        /* renamed from: e  reason: collision with root package name */
        public volatile Iterator<? extends R> f27294e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f27295f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f27296g;

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

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
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

    public f0(i.a.e1.c.f0<T> source, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
