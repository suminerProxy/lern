package i.a.e1.h.d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelCollector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a0<T, A, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.k.b<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Collector<T, A, R> f26760d;

    /* compiled from: ParallelCollector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, A, R> extends AtomicReference<Subscription> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        public final BiConsumer<A, T> accumulator;
        public final BinaryOperator<A> combiner;
        public A container;
        public boolean done;
        public final b<T, A, R> parent;

        public a(b<T, A, R> parent, A container, BiConsumer<A, T> accumulator, BinaryOperator<A> combiner) {
        }

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
    }

    /* compiled from: ParallelCollector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, A, R> extends i.a.e1.h.j.f<R> {
        private static final long serialVersionUID = -5370107872170712765L;
        public final AtomicReference<c<A>> current;
        public final i.a.e1.h.k.c error;
        public final Function<A, R> finisher;
        public final AtomicInteger remaining;
        public final a<T, A, R>[] subscribers;

        public b(Subscriber<? super R> subscriber, int n2, Collector<T, A, R> collector) {
        }

        public c<A> addValue(A value) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        public void innerComplete(A value, BinaryOperator<A> combiner) {
        }

        public void innerError(Throwable ex) {
        }
    }

    /* compiled from: ParallelCollector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        public T first;
        public final AtomicInteger releaseIndex;
        public T second;

        public boolean releaseSlot() {
        }

        public int tryAcquireSlot() {
        }
    }

    public a0(i.a.e1.k.b<? extends T> source, Collector<T, A, R> collector) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
