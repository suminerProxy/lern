package i.a.e1.h.f.f;

import i.a.e1.c.x;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k<T, R> extends i.a.e1.k.b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<T> f27717a;
    public final i.a.e1.g.o<? super T, ? extends R> b;

    /* compiled from: ParallelMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> implements i.a.e1.h.c.c<T>, Subscription {
        public final i.a.e1.h.c.c<? super R> b;
        public final i.a.e1.g.o<? super T, ? extends R> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f27718d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27719e;

        public a(i.a.e1.h.c.c<? super R> actual, i.a.e1.g.o<? super T, ? extends R> mapper) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: ParallelMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> implements x<T>, Subscription {
        public final Subscriber<? super R> b;
        public final i.a.e1.g.o<? super T, ? extends R> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f27720d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27721e;

        public b(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends R> mapper) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public k(i.a.e1.k.b<T> source, i.a.e1.g.o<? super T, ? extends R> mapper) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super R>[] subscribers) {
    }
}
