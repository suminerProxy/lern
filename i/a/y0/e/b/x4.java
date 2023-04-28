package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWithLatestFrom.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x4<T, U, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.c<? super T, ? super U, ? extends R> f28583d;

    /* renamed from: e  reason: collision with root package name */
    public final Publisher<? extends U> f28584e;

    /* compiled from: FlowableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a implements i.a.q<U> {
        private final b<T, U, R> b;
        public final /* synthetic */ x4 c;

        public a(x4 x4Var, b<T, U, R> bVar) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* compiled from: FlowableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U, R> extends AtomicReference<U> implements i.a.y0.c.a<T>, Subscription {
        private static final long serialVersionUID = -312246233408980075L;
        public final i.a.x0.c<? super T, ? super U, ? extends R> combiner;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Subscription> other;
        public final AtomicLong requested;
        public final AtomicReference<Subscription> upstream;

        public b(Subscriber<? super R> subscriber, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
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
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        public void otherError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        public boolean setOther(Subscription subscription) {
        }

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    public x4(i.a.l<T> lVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar, Publisher<? extends U> publisher) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
