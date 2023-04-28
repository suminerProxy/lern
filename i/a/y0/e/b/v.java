package i.a.y0.e.b;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v<T> extends i.a.l<T> {
    public final Publisher<? extends T>[] c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28539d;

    /* compiled from: FlowableConcatArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.i.i implements i.a.q<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        public final boolean delayError;
        public final Subscriber<? super T> downstream;
        public List<Throwable> errors;
        public int index;
        public long produced;
        public final Publisher<? extends T>[] sources;
        public final AtomicInteger wip;

        public a(Publisher<? extends T>[] publisherArr, boolean z, Subscriber<? super T> subscriber) {
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

    public v(Publisher<? extends T>[] publisherArr, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
