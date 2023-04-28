package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDematerialize.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k0<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.h0<R>> f27011d;

    /* compiled from: FlowableDematerialize.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> implements i.a.e1.c.x<T>, Subscription {
        public final Subscriber<? super R> b;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.h0<R>> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27012d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f27013e;

        public a(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, ? extends i.a.e1.c.h0<R>> selector) {
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
        public void onNext(T item) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public k0(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.h0<R>> selector) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> subscriber) {
    }
}
