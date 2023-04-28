package i.a.e1.h.f.b;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlattenIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g1<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> f26968d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26969e;

    /* compiled from: FlowableFlattenIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.h.j.c<R> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        public volatile boolean cancelled;
        public int consumed;
        public Iterator<? extends R> current;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public int fusionMode;
        public final int limit;
        public final i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper;
        public final int prefetch;
        public i.a.e1.h.c.q<T> queue;
        public final AtomicLong requested;
        public Subscription upstream;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean d2, boolean empty, Subscriber<?> a2, i.a.e1.h.c.q<?> q) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void consumedOne(boolean enabled) {
        }

        public void drain() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
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

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public R poll() throws Throwable {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int requestedMode) {
        }
    }

    public g1(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
    }

    public static <T, R> Subscriber<T> e9(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
