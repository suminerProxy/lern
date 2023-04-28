package i.a.y0.e.d;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: CompletableAndThenPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b<R> extends i.a.l<R> {
    public final i.a.i c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends R> f28662d;

    public b(i.a.i iVar, Publisher<? extends R> publisher) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }

    /* compiled from: CompletableAndThenPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<R> extends AtomicReference<Subscription> implements i.a.q<R>, i.a.f, Subscription {
        private static final long serialVersionUID = -8948264376121066672L;
        public final Subscriber<? super R> downstream;
        public Publisher<? extends R> other;
        public final AtomicLong requested;
        public i.a.u0.c upstream;

        public a(Subscriber<? super R> subscriber, Publisher<? extends R> publisher) {
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

        @Override // i.a.f
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }
}
