package i.a.e1.h.f.d;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: CompletableAndThenPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b<R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.p c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends R> f27331d;

    public b(i.a.e1.c.p source, Publisher<? extends R> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }

    /* compiled from: CompletableAndThenPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<R> extends AtomicReference<Subscription> implements i.a.e1.c.x<R>, i.a.e1.c.m, Subscription {
        private static final long serialVersionUID = -8948264376121066672L;
        public final Subscriber<? super R> downstream;
        public Publisher<? extends R> other;
        public final AtomicLong requested;
        public i.a.e1.d.f upstream;

        public a(Subscriber<? super R> downstream, Publisher<? extends R> other) {
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
        public void onNext(R t) {
        }

        @Override // i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }
}
