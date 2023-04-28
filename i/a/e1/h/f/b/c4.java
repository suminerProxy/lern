package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c4<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.q0 f26903d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26904e;

    /* compiled from: FlowableSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<Thread> implements i.a.e1.c.x<T>, Subscription, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        public final Subscriber<? super T> downstream;
        public final boolean nonScheduledRequests;
        public final AtomicLong requested;
        public Publisher<T> source;
        public final AtomicReference<Subscription> upstream;
        public final q0.c worker;

        /* compiled from: FlowableSubscribeOn.java */
        /* renamed from: i.a.e1.h.f.b.c4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class RunnableC0442a implements Runnable {
            public final Subscription b;
            public final long c;

            public RunnableC0442a(Subscription s, long n2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(Subscriber<? super T> actual, q0.c worker, Publisher<T> source, boolean requestOn) {
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
        public void request(final long n2) {
        }

        public void requestUpstream(final long n2, final Subscription s) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public c4(i.a.e1.c.s<T> source, i.a.e1.c.q0 scheduler, boolean nonScheduledRequests) {
    }

    @Override // i.a.e1.c.s
    public void F6(final Subscriber<? super T> s) {
    }
}
