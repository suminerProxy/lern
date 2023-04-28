package i.a.e1.h.f.b;

import java.util.Iterator;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableZipIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f5<T, U, V> extends i.a.e1.h.f.b.a<T, V> {

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<U> f26958d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.c<? super T, ? super U, ? extends V> f26959e;

    /* compiled from: FlowableZipIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U, V> implements i.a.e1.c.x<T>, Subscription {
        public final Subscriber<? super V> b;
        public final Iterator<U> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.c<? super T, ? super U, ? extends V> f26960d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f26961e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26962f;

        public a(Subscriber<? super V> actual, Iterator<U> iterator, i.a.e1.g.c<? super T, ? super U, ? extends V> zipper) {
        }

        public void a(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

    public f5(i.a.e1.c.s<T> source, Iterable<U> other, i.a.e1.g.c<? super T, ? super U, ? extends V> zipper) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super V> t) {
    }
}
