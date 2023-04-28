package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: MaybeDelayOtherPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m<T, U> extends i.a.e1.h.f.c.a<T, T> {
    public final Publisher<U> c;

    /* compiled from: MaybeDelayOtherPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        public final b<T> b;
        public final Publisher<U> c;

        /* renamed from: d  reason: collision with root package name */
        public i.a.e1.d.f f27314d;

        public a(i.a.e1.c.c0<? super T> actual, Publisher<U> otherSource) {
        }

        public void a() {
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
    }

    /* compiled from: MaybeDelayOtherPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<Subscription> implements i.a.e1.c.x<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        public final i.a.e1.c.c0<? super T> downstream;
        public Throwable error;
        public T value;

        public b(i.a.e1.c.c0<? super T> downstream) {
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

    public m(i.a.e1.c.f0<T> source, Publisher<U> other) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
