package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableDoOnEach.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q0<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.g<? super T> f27112d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.g<? super Throwable> f27113e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.a f27114f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.g.a f27115g;

    /* compiled from: FlowableDoOnEach.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.i.a<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.g<? super T> f27116g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.e1.g.g<? super Throwable> f27117h;

        /* renamed from: i  reason: collision with root package name */
        public final i.a.e1.g.a f27118i;

        /* renamed from: j  reason: collision with root package name */
        public final i.a.e1.g.a f27119j;

        public a(i.a.e1.h.c.c<? super T> actual, i.a.e1.g.g<? super T> onNext, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete, i.a.e1.g.a onAfterTerminate) {
        }

        @Override // i.a.e1.h.i.a, org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.e1.h.i.a, org.reactivestreams.Subscriber
        public void onError(Throwable t) {
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

    /* compiled from: FlowableDoOnEach.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.h.i.b<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.g<? super T> f27120g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.e1.g.g<? super Throwable> f27121h;

        /* renamed from: i  reason: collision with root package name */
        public final i.a.e1.g.a f27122i;

        /* renamed from: j  reason: collision with root package name */
        public final i.a.e1.g.a f27123j;

        public b(Subscriber<? super T> actual, i.a.e1.g.g<? super T> onNext, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete, i.a.e1.g.a onAfterTerminate) {
        }

        @Override // i.a.e1.h.i.b, org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.e1.h.i.b, org.reactivestreams.Subscriber
        public void onError(Throwable t) {
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
    }

    public q0(i.a.e1.c.s<T> source, i.a.e1.g.g<? super T> onNext, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete, i.a.e1.g.a onAfterTerminate) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
