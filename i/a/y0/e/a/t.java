package i.a.y0.e.a;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: CompletableFromPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t<T> extends i.a.c {
    public final Publisher<T> b;

    /* compiled from: CompletableFromPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T>, i.a.u0.c {
        public final i.a.f b;
        public Subscription c;

        public a(i.a.f fVar) {
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

    public t(Publisher<T> publisher) {
    }

    @Override // i.a.c
    public void I0(i.a.f fVar) {
    }
}
