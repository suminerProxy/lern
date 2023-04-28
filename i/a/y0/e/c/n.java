package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n<T, U> extends i.a.y0.e.c.a<T, T> {
    public final Publisher<U> c;

    /* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T> {
        private static final long serialVersionUID = 706635022205076709L;
        public final i.a.v<? super T> downstream;

        public a(i.a.v<? super T> vVar) {
        }

        @Override // i.a.v
        public void onComplete() {
        }

        @Override // i.a.v
        public void onError(Throwable th) {
        }

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }
    }

    /* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> implements i.a.q<Object>, i.a.u0.c {
        public final a<T> b;
        public i.a.y<T> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f28652d;

        public b(i.a.v<? super T> vVar, i.a.y<T> yVar) {
        }

        public void a() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public n(i.a.y<T> yVar, Publisher<U> publisher) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super T> vVar) {
    }
}
