package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSkip.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class x3<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27237d;

    /* compiled from: FlowableSkip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, Subscription {
        public final Subscriber<? super T> b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f27238d;

        public a(Subscriber<? super T> actual, long n2) {
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

    public x3(i.a.e1.c.s<T> source, long n2) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
