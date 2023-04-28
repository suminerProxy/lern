package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRetryPredicate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f3<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.r<? super Throwable> f28274d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28275e;

    /* compiled from: FlowableRetryPredicate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.q<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final Subscriber<? super T> downstream;
        public final i.a.x0.r<? super Throwable> predicate;
        public long produced;
        public long remaining;
        public final i.a.y0.i.i sa;
        public final Publisher<? extends T> source;

        public a(Subscriber<? super T> subscriber, long j2, i.a.x0.r<? super Throwable> rVar, i.a.y0.i.i iVar, Publisher<? extends T> publisher) {
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

        public void subscribeNext() {
        }
    }

    public f3(i.a.l<T> lVar, long j2, i.a.x0.r<? super Throwable> rVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
