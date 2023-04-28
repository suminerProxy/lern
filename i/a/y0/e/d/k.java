package i.a.y0.e.d;

import i.a.v;
import i.a.y;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: MaybeFlatMapPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k<T, R> extends i.a.l<R> {
    public final y<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> f28682d;

    public k(y<T> yVar, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }

    /* compiled from: MaybeFlatMapPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicReference<Subscription> implements i.a.q<R>, v<T>, Subscription {
        private static final long serialVersionUID = -8948264376121066672L;
        public final Subscriber<? super R> downstream;
        public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final AtomicLong requested;
        public i.a.u0.c upstream;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
        }

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }
}
