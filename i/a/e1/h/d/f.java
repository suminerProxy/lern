package i.a.e1.h.d;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMapStream.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f<T, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.s<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> f26784d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26785e;

    /* compiled from: FlowableFlatMapStream.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -5127032662980523968L;
        public volatile boolean cancelled;
        public int consumed;
        public AutoCloseable currentCloseable;
        public Iterator<? extends R> currentIterator;
        public final Subscriber<? super R> downstream;
        public long emitted;
        public final i.a.e1.h.k.c error;
        public final i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper;
        public final int prefetch;
        public i.a.e1.h.c.q<T> queue;
        public final AtomicLong requested;
        public int sourceMode;
        public Subscription upstream;
        public volatile boolean upstreamDone;

        public a(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void clearCurrentRethrowCloseError() throws Throwable {
        }

        public void clearCurrentSuppressCloseError() {
        }

        public void drain() {
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
        public void onSubscribe(@i.a.e1.b.f Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public void trySignalError(Subscriber<?> downstream, Throwable ex) {
        }
    }

    public f(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
    }

    public static <T, R> Subscriber<T> e9(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
