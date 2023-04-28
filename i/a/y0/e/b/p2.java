package i.a.y0.e.b;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableOnErrorNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class p2<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super Throwable, ? extends Publisher<? extends T>> f28415d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28416e;

    /* compiled from: FlowableOnErrorNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.i.i implements i.a.q<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        public final boolean allowFatal;
        public boolean done;
        public final Subscriber<? super T> downstream;
        public final i.a.x0.o<? super Throwable, ? extends Publisher<? extends T>> nextSupplier;
        public boolean once;
        public long produced;

        public a(Subscriber<? super T> subscriber, i.a.x0.o<? super Throwable, ? extends Publisher<? extends T>> oVar, boolean z) {
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

    public p2(i.a.l<T> lVar, i.a.x0.o<? super Throwable, ? extends Publisher<? extends T>> oVar, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
