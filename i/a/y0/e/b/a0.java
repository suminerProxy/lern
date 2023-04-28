package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatWithCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a0<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.i f28207d;

    public a0(i.a.l<T> lVar, i.a.i iVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }

    /* compiled from: FlowableConcatWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.q<T>, i.a.f, Subscription {
        private static final long serialVersionUID = -7346385463600070225L;
        public final Subscriber<? super T> downstream;
        public boolean inCompletable;
        public i.a.i other;
        public Subscription upstream;

        public a(Subscriber<? super T> subscriber, i.a.i iVar) {
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

        @Override // i.a.f
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }
}
