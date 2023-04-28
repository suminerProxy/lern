package i.a.y0.e.g;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: SingleDelayWithPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i<T, U> extends i.a.k0<T> {
    public final i.a.q0<T> b;
    public final Publisher<U> c;

    /* compiled from: SingleDelayWithPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends AtomicReference<i.a.u0.c> implements i.a.q<U>, i.a.u0.c {
        private static final long serialVersionUID = -8565274649390031272L;
        public boolean done;
        public final i.a.n0<? super T> downstream;
        public final i.a.q0<T> source;
        public Subscription upstream;

        public a(i.a.n0<? super T> n0Var, i.a.q0<T> q0Var) {
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
        public void onNext(U u) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public i(i.a.q0<T> q0Var, Publisher<U> publisher) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super T> n0Var) {
    }
}
