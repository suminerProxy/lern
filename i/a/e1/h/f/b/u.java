package i.a.e1.h.f.b;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class u<T> extends i.a.e1.c.s<T> {
    public final Publisher<? extends T>[] c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27178d;

    /* compiled from: FlowableConcatArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.i implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        public final boolean delayError;
        public final Subscriber<? super T> downstream;
        public List<Throwable> errors;
        public int index;
        public long produced;
        public final Publisher<? extends T>[] sources;
        public final AtomicInteger wip;

        public a(Publisher<? extends T>[] sources, boolean delayError, Subscriber<? super T> downstream) {
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
    }

    public u(Publisher<? extends T>[] sources, boolean delayError) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
