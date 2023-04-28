package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w4<T, D> extends i.a.e1.c.s<T> {
    public final i.a.e1.g.s<? extends D> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super D, ? extends Publisher<? extends T>> f27206d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.g<? super D> f27207e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27208f;

    /* compiled from: FlowableUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, D> extends AtomicBoolean implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = 5904473792286235046L;
        public final i.a.e1.g.g<? super D> disposer;
        public final Subscriber<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public Subscription upstream;

        public a(Subscriber<? super T> actual, D resource, i.a.e1.g.g<? super D> disposer, boolean eager) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void disposeResource() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public w4(i.a.e1.g.s<? extends D> resourceSupplier, i.a.e1.g.o<? super D, ? extends Publisher<? extends T>> sourceSupplier, i.a.e1.g.g<? super D> disposer, boolean eager) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
