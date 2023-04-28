package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSequenceEqual.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r3<T> extends i.a.e1.c.s<Boolean> {
    public final Publisher<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends T> f27140d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.d<? super T, ? super T> f27141e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27142f;

    /* compiled from: FlowableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.f<Boolean> implements b {
        private static final long serialVersionUID = -6178010334400373240L;
        public final i.a.e1.g.d<? super T, ? super T> comparer;
        public final i.a.e1.h.k.c errors;
        public final c<T> first;
        public final c<T> second;
        public T v1;
        public T v2;
        public final AtomicInteger wip;

        public a(Subscriber<? super Boolean> actual, int prefetch, i.a.e1.g.d<? super T, ? super T> comparer) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAndClear() {
        }

        @Override // i.a.e1.h.f.b.r3.b
        public void drain() {
        }

        @Override // i.a.e1.h.f.b.r3.b
        public void innerError(Throwable t) {
        }

        public void subscribe(Publisher<? extends T> source1, Publisher<? extends T> source2) {
        }
    }

    /* compiled from: FlowableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface b {
        void drain();

        void innerError(Throwable ex);
    }

    /* compiled from: FlowableSequenceEqual.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicReference<Subscription> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        public volatile boolean done;
        public final int limit;
        public final b parent;
        public final int prefetch;
        public long produced;
        public volatile i.a.e1.h.c.q<T> queue;
        public int sourceMode;

        public c(b parent, int prefetch) {
        }

        public void cancel() {
        }

        public void clear() {
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

        public void request() {
        }
    }

    public r3(Publisher<? extends T> first, Publisher<? extends T> second, i.a.e1.g.d<? super T, ? super T> comparer, int prefetch) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super Boolean> s) {
    }
}
