package i.a.e1.h.f.b;

import java.util.Collection;
import org.reactivestreams.Subscription;

/* compiled from: FlowableToListSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class u4<T, U extends Collection<? super T>> extends i.a.e1.c.r0<U> implements i.a.e1.h.c.d<U> {
    public final i.a.e1.c.s<T> b;
    public final i.a.e1.g.s<U> c;

    /* compiled from: FlowableToListSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U extends Collection<? super T>> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public final i.a.e1.c.u0<? super U> b;
        public Subscription c;

        /* renamed from: d  reason: collision with root package name */
        public U f27182d;

        public a(i.a.e1.c.u0<? super U> actual, U collection) {
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

    public u4(i.a.e1.c.s<T> source) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super U> observer) {
    }

    @Override // i.a.e1.h.c.d
    public i.a.e1.c.s<U> c() {
    }

    public u4(i.a.e1.c.s<T> source, i.a.e1.g.s<U> collectionSupplier) {
    }
}
