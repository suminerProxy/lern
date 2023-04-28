package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableOnBackpressureDrop.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q2<T> extends i.a.e1.h.f.b.a<T, T> implements i.a.e1.g.g<T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.g<? super T> f27124d;

    /* compiled from: FlowableOnBackpressureDrop.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicLong implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -6246093802440953054L;
        public boolean done;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.g.g<? super T> onDrop;
        public Subscription upstream;

        public a(Subscriber<? super T> actual, i.a.e1.g.g<? super T> onDrop) {
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

    public q2(i.a.e1.c.s<T> source) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }

    @Override // i.a.e1.g.g
    public void accept(T t) {
    }

    public q2(i.a.e1.c.s<T> source, i.a.e1.g.g<? super T> onDrop) {
    }
}
