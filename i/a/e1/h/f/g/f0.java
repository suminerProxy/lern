package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SingleFlatMapPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f0<T, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.x0<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> f27760d;

    public f0(i.a.e1.c.x0<T> source, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> downstream) {
    }

    /* compiled from: SingleFlatMapPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<S, T> extends AtomicLong implements i.a.e1.c.u0<S>, i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = 7759721921468635667L;
        public i.a.e1.d.f disposable;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.g.o<? super S, ? extends Publisher<? extends T>> mapper;
        public final AtomicReference<Subscription> parent;

        public a(Subscriber<? super T> actual, i.a.e1.g.o<? super S, ? extends Publisher<? extends T>> mapper) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(S value) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }
}
