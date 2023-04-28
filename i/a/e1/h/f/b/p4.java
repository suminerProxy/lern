package i.a.e1.h.f.b;

import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTimeInterval.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p4<T> extends i.a.e1.h.f.b.a<T, i.a.e1.n.d<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.q0 f27095d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f27096e;

    /* compiled from: FlowableTimeInterval.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, Subscription {
        public final Subscriber<? super i.a.e1.n.d<T>> b;
        public final TimeUnit c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.c.q0 f27097d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f27098e;

        /* renamed from: f  reason: collision with root package name */
        public long f27099f;

        public a(Subscriber<? super i.a.e1.n.d<T>> actual, TimeUnit unit, i.a.e1.c.q0 scheduler) {
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

    public p4(i.a.e1.c.s<T> source, TimeUnit unit, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super i.a.e1.n.d<T>> s) {
    }
}
