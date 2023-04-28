package i.a.y0.e.b;

import i.a.j0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x3<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.j0 f28581d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28582e;

    /* compiled from: FlowableSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<Thread> implements i.a.q<T>, Subscription, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        public final Subscriber<? super T> downstream;
        public final boolean nonScheduledRequests;
        public final AtomicLong requested;
        public Publisher<T> source;
        public final AtomicReference<Subscription> upstream;
        public final j0.c worker;

        /* compiled from: FlowableSubscribeOn.java */
        /* renamed from: i.a.y0.e.b.x3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class RunnableC0546a implements Runnable {
            public final Subscription b;
            public final long c;

            public RunnableC0546a(Subscription subscription, long j2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(Subscriber<? super T> subscriber, j0.c cVar, Publisher<T> publisher, boolean z) {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        public void requestUpstream(long j2, Subscription subscription) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public x3(i.a.l<T> lVar, i.a.j0 j0Var, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
