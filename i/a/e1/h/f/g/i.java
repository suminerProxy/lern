package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: SingleDelayWithPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i<T, U> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<T> b;
    public final Publisher<U> c;

    /* compiled from: SingleDelayWithPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.x<U>, i.a.e1.d.f {
        private static final long serialVersionUID = -8565274649390031272L;
        public boolean done;
        public final i.a.e1.c.u0<? super T> downstream;
        public final i.a.e1.c.x0<T> source;
        public Subscription upstream;

        public a(i.a.e1.c.u0<? super T> actual, i.a.e1.c.x0<T> source) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U value) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public i(i.a.e1.c.x0<T> source, Publisher<U> other) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super T> observer) {
    }
}
