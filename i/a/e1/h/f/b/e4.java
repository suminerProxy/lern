package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSwitchMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e4<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> f26937d;

    /* renamed from: e  reason: collision with root package name */
    public final int f26938e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f26939f;

    /* compiled from: FlowableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicReference<Subscription> implements i.a.e1.c.x<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;
        public final long index;
        public final b<T, R> parent;
        public volatile i.a.e1.h.c.q<R> queue;

        public a(b<T, R> parent, long index, int bufferSize) {
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
        public void onNext(R t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        public void request(long n2) {
        }
    }

    /* compiled from: FlowableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        public static final a<Object, Object> CANCELLED = null;
        private static final long serialVersionUID = -3491074160481096299L;
        public final AtomicReference<a<T, R>> active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final AtomicLong requested;
        public volatile long unique;
        public Subscription upstream;

        public b(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int bufferSize, boolean delayErrors) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void disposeInner() {
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
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public e4(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int bufferSize, boolean delayErrors) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
