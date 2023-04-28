package i.a.e1.h.f.g;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: SingleFromPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h0<T> extends i.a.e1.c.r0<T> {
    public final Publisher<? extends T> b;

    /* compiled from: SingleFromPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public final i.a.e1.c.u0<? super T> b;
        public Subscription c;

        /* renamed from: d  reason: collision with root package name */
        public T f27761d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f27762e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f27763f;

        public a(i.a.e1.c.u0<? super T> downstream) {
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

    public h0(Publisher<? extends T> publisher) {
    }

    @Override // i.a.e1.c.r0
    public void M1(final i.a.e1.c.u0<? super T> observer) {
    }
}
