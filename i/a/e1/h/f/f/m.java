package i.a.e1.h.f.f;

import i.a.e1.c.x;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelPeek.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m<T> extends i.a.e1.k.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<T> f27730a;
    public final i.a.e1.g.g<? super T> b;
    public final i.a.e1.g.g<? super T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.g<? super Throwable> f27731d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.a f27732e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.a f27733f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.g.g<? super Subscription> f27734g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a.e1.g.q f27735h;

    /* renamed from: i  reason: collision with root package name */
    public final i.a.e1.g.a f27736i;

    /* compiled from: ParallelPeek.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements x<T>, Subscription {
        public final Subscriber<? super T> b;
        public final m<T> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f27737d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27738e;

        public a(Subscriber<? super T> actual, m<T> parent) {
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

    public m(i.a.e1.k.b<T> source, i.a.e1.g.g<? super T> onNext, i.a.e1.g.g<? super T> onAfterNext, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete, i.a.e1.g.a onAfterTerminated, i.a.e1.g.g<? super Subscription> onSubscribe, i.a.e1.g.q onRequest, i.a.e1.g.a onCancel) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super T>[] subscribers) {
    }
}
