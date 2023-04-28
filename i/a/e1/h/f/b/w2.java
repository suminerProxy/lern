package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowablePublish.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w2<T> extends i.a.e1.f.a<T> implements i.a.e1.h.c.j<T> {
    public final Publisher<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27201d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<b<T>> f27202e;

    /* compiled from: FlowablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 2845000326761540265L;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public final b<T> parent;

        public a(Subscriber<? super T> downstream, b<T> parent) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean isCancelled() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicInteger implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public static final a[] EMPTY = null;
        public static final a[] TERMINATED = null;
        private static final long serialVersionUID = -1672047311619175801L;
        public final int bufferSize;
        public final AtomicBoolean connect;
        public int consumed;
        public final AtomicReference<b<T>> current;
        public volatile boolean done;
        public Throwable error;
        public volatile i.a.e1.h.c.q<T> queue;
        public int sourceMode;
        public final AtomicReference<a<T>[]> subscribers;
        public final AtomicReference<Subscription> upstream;

        public b(AtomicReference<b<T>> current, int bufferSize) {
        }

        public boolean add(a<T> inner) {
        }

        public boolean checkTerminated(boolean isDone, boolean isEmpty) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

        public void remove(a<T> inner) {
        }

        public void signalError(Throwable ex) {
        }
    }

    public w2(Publisher<T> source, int bufferSize) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }

    @Override // i.a.e1.f.a
    public void i9(i.a.e1.g.g<? super i.a.e1.d.f> connection) {
    }

    @Override // i.a.e1.f.a
    public void p9() {
    }

    @Override // i.a.e1.h.c.j
    public Publisher<T> source() {
    }
}
