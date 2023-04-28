package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWithLatestFromMany.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d5<T, R> extends i.a.e1.h.f.b.a<T, R> {
    @i.a.e1.b.g

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<?>[] f26917d;
    @i.a.e1.b.g

    /* renamed from: e  reason: collision with root package name */
    public final Iterable<? extends Publisher<?>> f26918e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.o<? super Object[], R> f26919f;

    /* compiled from: FlowableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a implements i.a.e1.g.o<T, R> {
        public final /* synthetic */ d5 b;

        public a(final d5 this$0) {
        }

        @Override // i.a.e1.g.o
        public R apply(T t) throws Throwable {
        }
    }

    /* compiled from: FlowableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.e1.h.c.c<T>, Subscription {
        private static final long serialVersionUID = 1577321883966341961L;
        public final i.a.e1.g.o<? super Object[], R> combiner;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final i.a.e1.h.k.c error;
        public final AtomicLong requested;
        public final c[] subscribers;
        public final AtomicReference<Subscription> upstream;
        public final AtomicReferenceArray<Object> values;

        public b(Subscriber<? super R> actual, i.a.e1.g.o<? super Object[], R> combiner, int n2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAllBut(int index) {
        }

        public void innerComplete(int index, boolean nonEmpty) {
        }

        public void innerError(int index, Throwable t) {
        }

        public void innerNext(int index, Object o2) {
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public void subscribe(Publisher<?>[] others, int n2) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: FlowableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c extends AtomicReference<Subscription> implements i.a.e1.c.x<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        public boolean hasValue;
        public final int index;
        public final b<?, ?> parent;

        public c(b<?, ?> parent, int index) {
        }

        public void dispose() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public d5(@i.a.e1.b.f i.a.e1.c.s<T> source, @i.a.e1.b.f Publisher<?>[] otherArray, i.a.e1.g.o<? super Object[], R> combiner) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }

    public d5(@i.a.e1.b.f i.a.e1.c.s<T> source, @i.a.e1.b.f Iterable<? extends Publisher<?>> otherIterable, @i.a.e1.b.f i.a.e1.g.o<? super Object[], R> combiner) {
    }
}
