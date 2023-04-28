package i.a.y0.e.g;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SingleFlatMapPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c0<T, R> extends i.a.l<R> {
    public final i.a.q0<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> f29075d;

    public c0(i.a.q0<T> q0Var, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }

    /* compiled from: SingleFlatMapPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<S, T> extends AtomicLong implements i.a.n0<S>, i.a.q<T>, Subscription {
        private static final long serialVersionUID = 7759721921468635667L;
        public i.a.u0.c disposable;
        public final Subscriber<? super T> downstream;
        public final i.a.x0.o<? super S, ? extends Publisher<? extends T>> mapper;
        public final AtomicReference<Subscription> parent;

        public a(Subscriber<? super T> subscriber, i.a.x0.o<? super S, ? extends Publisher<? extends T>> oVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.n0
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.n0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.n0
        public void onSuccess(S s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }
}
