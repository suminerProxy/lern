package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRetryBiPredicate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j3<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.d<? super Integer, ? super Throwable> f27006d;

    /* compiled from: FlowableRetryBiPredicate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.g.d<? super Integer, ? super Throwable> predicate;
        public long produced;
        public int retries;
        public final i.a.e1.h.j.i sa;
        public final Publisher<? extends T> source;

        public a(Subscriber<? super T> actual, i.a.e1.g.d<? super Integer, ? super Throwable> predicate, i.a.e1.h.j.i sa, Publisher<? extends T> source) {
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

        public void subscribeNext() {
        }
    }

    public j3(i.a.e1.c.s<T> source, i.a.e1.g.d<? super Integer, ? super Throwable> predicate) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
