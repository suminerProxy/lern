package i.a.e1.h.f.e;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: ObservableFromPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i1<T> extends i.a.e1.c.i0<T> {
    public final Publisher<? extends T> b;

    /* compiled from: ObservableFromPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public final i.a.e1.c.p0<? super T> b;
        public Subscription c;

        public a(i.a.e1.c.p0<? super T> o2) {
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
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public i1(Publisher<? extends T> publisher) {
    }

    @Override // i.a.e1.c.i0
    public void c6(final i.a.e1.c.p0<? super T> o2) {
    }
}
