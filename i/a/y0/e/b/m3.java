package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSequenceEqual.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m3<T> extends i.a.l<Boolean> {
    public final Publisher<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends T> f28368d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.d<? super T, ? super T> f28369e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28370f;

    /* compiled from: FlowableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.i.f<Boolean> implements b {
        private static final long serialVersionUID = -6178010334400373240L;
        public final i.a.x0.d<? super T, ? super T> comparer;
        public final i.a.y0.j.c error;
        public final c<T> first;
        public final c<T> second;
        public T v1;
        public T v2;
        public final AtomicInteger wip;

        public a(Subscriber<? super Boolean> subscriber, int i2, i.a.x0.d<? super T, ? super T> dVar) {
        }

        @Override // i.a.y0.i.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAndClear() {
        }

        @Override // i.a.y0.e.b.m3.b
        public void drain() {
        }

        @Override // i.a.y0.e.b.m3.b
        public void innerError(Throwable th) {
        }

        public void subscribe(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        }
    }

    /* compiled from: FlowableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        void drain();

        void innerError(Throwable th);
    }

    /* compiled from: FlowableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicReference<Subscription> implements i.a.q<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        public volatile boolean done;
        public final int limit;
        public final b parent;
        public final int prefetch;
        public long produced;
        public volatile i.a.y0.c.o<T> queue;
        public int sourceMode;

        public c(b bVar, int i2) {
        }

        public void cancel() {
        }

        public void clear() {
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

        public void request() {
        }
    }

    public m3(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, i.a.x0.d<? super T, ? super T> dVar, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super Boolean> subscriber) {
    }
}
