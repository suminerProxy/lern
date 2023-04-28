package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableIgnoreElements.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v1<T> extends i.a.e1.h.f.b.a<T, T> {

    /* compiled from: FlowableIgnoreElements.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, i.a.e1.h.c.n<T> {
        public final Subscriber<? super T> b;
        public Subscription c;

        public a(Subscriber<? super T> downstream) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(T e2) {
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

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(T v1, T v2) {
        }
    }

    public v1(i.a.e1.c.s<T> source) {
    }

    @Override // i.a.e1.c.s
    public void F6(final Subscriber<? super T> t) {
    }
}
