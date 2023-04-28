package i.a.e1.h.f.f;

import i.a.e1.g.r;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelFilter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d<T> extends i.a.e1.k.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<T> f27698a;
    public final r<? super T> b;

    /* compiled from: ParallelFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a<T> implements i.a.e1.h.c.c<T>, Subscription {
        public final r<? super T> b;
        public Subscription c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27699d;

        public a(r<? super T> predicate) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long n2) {
        }
    }

    /* compiled from: ParallelFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends a<T> {

        /* renamed from: e  reason: collision with root package name */
        public final i.a.e1.h.c.c<? super T> f27700e;

        public b(i.a.e1.h.c.c<? super T> actual, r<? super T> predicate) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: ParallelFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends a<T> {

        /* renamed from: e  reason: collision with root package name */
        public final Subscriber<? super T> f27701e;

        public c(Subscriber<? super T> actual, r<? super T> predicate) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    public d(i.a.e1.k.b<T> source, r<? super T> predicate) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super T>[] subscribers) {
    }
}
