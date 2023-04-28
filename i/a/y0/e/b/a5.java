package i.a.y0.e.b;

import java.util.Iterator;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableZipIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a5<T, U, V> extends i.a.y0.e.b.a<T, V> {

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<U> f28214d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.c<? super T, ? super U, ? extends V> f28215e;

    /* compiled from: FlowableZipIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U, V> implements i.a.q<T>, Subscription {
        public final Subscriber<? super V> b;
        public final Iterator<U> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.x0.c<? super T, ? super U, ? extends V> f28216d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f28217e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f28218f;

        public a(Subscriber<? super V> subscriber, Iterator<U> it, i.a.x0.c<? super T, ? super U, ? extends V> cVar) {
        }

        public void a(Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public a5(i.a.l<T> lVar, Iterable<U> iterable, i.a.x0.c<? super T, ? super U, ? extends V> cVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super V> subscriber) {
    }
}
