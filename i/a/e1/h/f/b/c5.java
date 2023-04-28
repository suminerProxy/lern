package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWithLatestFrom.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c5<T, U, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.c<? super T, ? super U, ? extends R> f26905d;

    /* renamed from: e  reason: collision with root package name */
    public final Publisher<? extends U> f26906e;

    /* compiled from: FlowableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a implements i.a.e1.c.x<U> {
        private final b<T, U, R> b;
        public final /* synthetic */ c5 c;

        public a(final c5 this$0, b<T, U, R> wlf) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    /* compiled from: FlowableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U, R> extends AtomicReference<U> implements i.a.e1.h.c.c<T>, Subscription {
        private static final long serialVersionUID = -312246233408980075L;
        public final i.a.e1.g.c<? super T, ? super U, ? extends R> combiner;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Subscription> other;
        public final AtomicLong requested;
        public final AtomicReference<Subscription> upstream;

        public b(Subscriber<? super R> actual, i.a.e1.g.c<? super T, ? super U, ? extends R> combiner) {
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

        public void otherError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public boolean setOther(Subscription o2) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    public c5(i.a.e1.c.s<T> source, i.a.e1.g.c<? super T, ? super U, ? extends R> combiner, Publisher<? extends U> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
