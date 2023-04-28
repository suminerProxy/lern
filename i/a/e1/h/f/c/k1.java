package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: MaybeTakeUntilPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k1<T, U> extends i.a.e1.h.f.c.a<T, T> {
    public final Publisher<U> c;

    /* compiled from: MaybeTakeUntilPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -2187421758664251153L;
        public final i.a.e1.c.c0<? super T> downstream;
        public final C0462a<U> other;

        /* compiled from: MaybeTakeUntilPublisher.java */
        /* renamed from: i.a.e1.h.f.c.k1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0462a<U> extends AtomicReference<Subscription> implements i.a.e1.c.x<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            public final a<?, U> parent;

            public C0462a(a<?, U> parent) {
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable e2) {
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object value) {
            }

            @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
            public void onSubscribe(Subscription s) {
            }
        }

        public a(i.a.e1.c.c0<? super T> downstream) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        public void otherComplete() {
        }

        public void otherError(Throwable e2) {
        }
    }

    public k1(i.a.e1.c.f0<T> source, Publisher<U> other) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
