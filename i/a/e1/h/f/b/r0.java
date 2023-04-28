package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDoOnLifecycle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r0<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    private final i.a.e1.g.g<? super Subscription> f27132d;

    /* renamed from: e  reason: collision with root package name */
    private final i.a.e1.g.q f27133e;

    /* renamed from: f  reason: collision with root package name */
    private final i.a.e1.g.a f27134f;

    /* compiled from: FlowableDoOnLifecycle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, Subscription {
        public final Subscriber<? super T> b;
        public final i.a.e1.g.g<? super Subscription> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.q f27135d;

        /* renamed from: e  reason: collision with root package name */
        public final i.a.e1.g.a f27136e;

        /* renamed from: f  reason: collision with root package name */
        public Subscription f27137f;

        public a(Subscriber<? super T> actual, i.a.e1.g.g<? super Subscription> onSubscribe, i.a.e1.g.q onRequest, i.a.e1.g.a onCancel) {
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

    public r0(i.a.e1.c.s<T> source, i.a.e1.g.g<? super Subscription> onSubscribe, i.a.e1.g.q onRequest, i.a.e1.g.a onCancel) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
