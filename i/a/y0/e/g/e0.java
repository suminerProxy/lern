package i.a.y0.e.g;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: SingleFromPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e0<T> extends i.a.k0<T> {
    public final Publisher<? extends T> b;

    /* compiled from: SingleFromPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T>, i.a.u0.c {
        public final i.a.n0<? super T> b;
        public Subscription c;

        /* renamed from: d  reason: collision with root package name */
        public T f29076d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f29077e;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f29078f;

        public a(i.a.n0<? super T> n0Var) {
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
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public e0(Publisher<? extends T> publisher) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super T> n0Var) {
    }
}
