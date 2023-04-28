package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableUnsubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class q4<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.j0 f28431d;

    /* compiled from: FlowableUnsubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicBoolean implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = 1015244841293359600L;
        public final Subscriber<? super T> downstream;
        public final i.a.j0 scheduler;
        public Subscription upstream;

        /* compiled from: FlowableUnsubscribeOn.java */
        /* renamed from: i.a.y0.e.b.q4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class RunnableC0543a implements Runnable {
            public final /* synthetic */ a b;

            public RunnableC0543a(a aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(Subscriber<? super T> subscriber, i.a.j0 j0Var) {
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
    }

    public q4(i.a.l<T> lVar, i.a.j0 j0Var) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
