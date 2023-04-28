package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableFilter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class y0<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.r<? super T> f27247d;

    /* compiled from: FlowableFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.i.a<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.r<? super T> f27248g;

        public a(i.a.e1.h.c.c<? super T> actual, i.a.e1.g.r<? super T> filter) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: FlowableFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.h.i.b<T, T> implements i.a.e1.h.c.c<T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.r<? super T> f27249g;

        public b(Subscriber<? super T> actual, i.a.e1.g.r<? super T> filter) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    public y0(i.a.e1.c.s<T> source, i.a.e1.g.r<? super T> predicate) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
