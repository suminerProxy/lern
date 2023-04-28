package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableConcatWithMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b0<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.y<? extends T> f28219d;

    /* compiled from: FlowableConcatWithMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.h.t<T, T> implements i.a.v<T> {
        private static final long serialVersionUID = -7346385463600070225L;
        public boolean inMaybe;
        public i.a.y<? extends T> other;
        public final AtomicReference<i.a.u0.c> otherDisposable;

        public a(Subscriber<? super T> subscriber, i.a.y<? extends T> yVar) {
        }

        @Override // i.a.y0.h.t, org.reactivestreams.Subscription
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

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }
    }

    public b0(i.a.l<T> lVar, i.a.y<? extends T> yVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
