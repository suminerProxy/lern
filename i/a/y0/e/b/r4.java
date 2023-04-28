package i.a.y0.e.b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableUsing.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r4<T, D> extends i.a.l<T> {
    public final Callable<? extends D> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super D, ? extends Publisher<? extends T>> f28463d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.g<? super D> f28464e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28465f;

    /* compiled from: FlowableUsing.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, D> extends AtomicBoolean implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = 5904473792286235046L;
        public final i.a.x0.g<? super D> disposer;
        public final Subscriber<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public Subscription upstream;

        public a(Subscriber<? super T> subscriber, D d2, i.a.x0.g<? super D> gVar, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void disposeAfter() {
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

    public r4(Callable<? extends D> callable, i.a.x0.o<? super D, ? extends Publisher<? extends T>> oVar, i.a.x0.g<? super D> gVar, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
