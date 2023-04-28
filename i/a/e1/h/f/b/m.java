package i.a.e1.h.f.b;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBuffer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m<T, C extends Collection<? super T>> extends i.a.e1.h.f.b.a<T, C> {

    /* renamed from: d  reason: collision with root package name */
    public final int f27025d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27026e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.s<C> f27027f;

    /* compiled from: FlowableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, C extends Collection<? super T>> implements i.a.e1.c.x<T>, Subscription {
        public final Subscriber<? super C> b;
        public final i.a.e1.g.s<C> c;

        /* renamed from: d  reason: collision with root package name */
        public final int f27028d;

        /* renamed from: e  reason: collision with root package name */
        public C f27029e;

        /* renamed from: f  reason: collision with root package name */
        public Subscription f27030f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f27031g;

        /* renamed from: h  reason: collision with root package name */
        public int f27032h;

        public a(Subscriber<? super C> actual, int size, i.a.e1.g.s<C> bufferSupplier) {
        }

        @Override // org.reactivestreams.Subscription
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicLong implements i.a.e1.c.x<T>, Subscription, i.a.e1.g.e {
        private static final long serialVersionUID = -7370244972039324525L;
        public final i.a.e1.g.s<C> bufferSupplier;
        public final ArrayDeque<C> buffers;
        public volatile boolean cancelled;
        public boolean done;
        public final Subscriber<? super C> downstream;
        public int index;
        public final AtomicBoolean once;
        public long produced;
        public final int size;
        public final int skip;
        public Subscription upstream;

        public b(Subscriber<? super C> actual, int size, int skip, i.a.e1.g.s<C> bufferSupplier) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.g.e
        public boolean getAsBoolean() {
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

    /* compiled from: FlowableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -5616169793639412593L;
        public C buffer;
        public final i.a.e1.g.s<C> bufferSupplier;
        public boolean done;
        public final Subscriber<? super C> downstream;
        public int index;
        public final int size;
        public final int skip;
        public Subscription upstream;

        public c(Subscriber<? super C> actual, int size, int skip, i.a.e1.g.s<C> bufferSupplier) {
        }

        @Override // org.reactivestreams.Subscription
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public m(i.a.e1.c.s<T> source, int size, int skip, i.a.e1.g.s<C> bufferSupplier) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super C> s) {
    }
}
