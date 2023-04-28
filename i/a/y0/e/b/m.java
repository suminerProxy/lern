package i.a.y0.e.b;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBuffer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m<T, C extends Collection<? super T>> extends i.a.y0.e.b.a<T, C> {

    /* renamed from: d  reason: collision with root package name */
    public final int f28357d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28358e;

    /* renamed from: f  reason: collision with root package name */
    public final Callable<C> f28359f;

    /* compiled from: FlowableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, C extends Collection<? super T>> implements i.a.q<T>, Subscription {
        public final Subscriber<? super C> b;
        public final Callable<C> c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28360d;

        /* renamed from: e  reason: collision with root package name */
        public C f28361e;

        /* renamed from: f  reason: collision with root package name */
        public Subscription f28362f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f28363g;

        /* renamed from: h  reason: collision with root package name */
        public int f28364h;

        public a(Subscriber<? super C> subscriber, int i2, Callable<C> callable) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicLong implements i.a.q<T>, Subscription, i.a.x0.e {
        private static final long serialVersionUID = -7370244972039324525L;
        public final Callable<C> bufferSupplier;
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

        public b(Subscriber<? super C> subscriber, int i2, int i3, Callable<C> callable) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.x0.e
        public boolean getAsBoolean() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, C extends Collection<? super T>> extends AtomicInteger implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -5616169793639412593L;
        public C buffer;
        public final Callable<C> bufferSupplier;
        public boolean done;
        public final Subscriber<? super C> downstream;
        public int index;
        public final int size;
        public final int skip;
        public Subscription upstream;

        public c(Subscriber<? super C> subscriber, int i2, int i3, Callable<C> callable) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public m(i.a.l<T> lVar, int i2, int i3, Callable<C> callable) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super C> subscriber) {
    }
}
