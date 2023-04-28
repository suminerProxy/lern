package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowablePublish.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r2<T> extends i.a.w0.a<T> implements i.a.y0.c.h<T> {

    /* renamed from: g  reason: collision with root package name */
    public static final long f28456g = Long.MIN_VALUE;
    public final i.a.l<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<c<T>> f28457d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28458e;

    /* renamed from: f  reason: collision with root package name */
    public final Publisher<T> f28459f;

    /* compiled from: FlowablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements Publisher<T> {
        private final AtomicReference<c<T>> b;
        private final int c;

        public a(AtomicReference<c<T>> atomicReference, int i2) {
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
        }
    }

    /* compiled from: FlowablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        public final Subscriber<? super T> child;
        public long emitted;
        public volatile c<T> parent;

        public b(Subscriber<? super T> subscriber) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicInteger implements i.a.q<T>, i.a.u0.c {
        public static final b[] EMPTY = null;
        public static final b[] TERMINATED = null;
        private static final long serialVersionUID = -202316842419149694L;
        public final int bufferSize;
        public final AtomicReference<c<T>> current;
        public volatile i.a.y0.c.o<T> queue;
        public final AtomicBoolean shouldConnect;
        public int sourceMode;
        public final AtomicReference<b<T>[]> subscribers;
        public volatile Object terminalEvent;
        public final AtomicReference<Subscription> upstream;

        public c(AtomicReference<c<T>> atomicReference, int i2) {
        }

        public boolean add(b<T> bVar) {
        }

        public boolean checkTerminated(Object obj, boolean z) {
        }

        public void dispatch() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
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

        public void remove(b<T> bVar) {
        }
    }

    private r2(Publisher<T> publisher, i.a.l<T> lVar, AtomicReference<c<T>> atomicReference, int i2) {
    }

    public static <T> i.a.w0.a<T> T8(i.a.l<T> lVar, int i2) {
    }

    @Override // i.a.w0.a
    public void M8(i.a.x0.g<? super i.a.u0.c> gVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }

    @Override // i.a.y0.c.h
    public Publisher<T> source() {
    }
}
