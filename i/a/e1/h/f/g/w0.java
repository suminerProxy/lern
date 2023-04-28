package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: SingleTakeUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w0<T, U> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<T> b;
    public final Publisher<U> c;

    /* compiled from: SingleTakeUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -622603812305745221L;
        public final i.a.e1.c.u0<? super T> downstream;
        public final b other;

        public a(i.a.e1.c.u0<? super T> downstream) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        public void otherError(Throwable e2) {
        }
    }

    /* compiled from: SingleTakeUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b extends AtomicReference<Subscription> implements i.a.e1.c.x<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        public final a<?> parent;

        public b(a<?> parent) {
        }

        public void dispose() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public w0(i.a.e1.c.x0<T> source, Publisher<U> other) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super T> observer) {
    }
}
