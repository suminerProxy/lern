package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSwitchMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z3<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> f28614d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28615e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28616f;

    /* compiled from: FlowableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicReference<Subscription> implements i.a.q<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;
        public final long index;
        public final b<T, R> parent;
        public volatile i.a.y0.c.o<R> queue;

        public a(b<T, R> bVar, long j2, int i2) {
        }

        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* compiled from: FlowableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.q<T>, Subscription {
        public static final a<Object, Object> CANCELLED = null;
        private static final long serialVersionUID = -3491074160481096299L;
        public final AtomicReference<a<T, R>> active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final i.a.y0.j.c error;
        public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final AtomicLong requested;
        public volatile long unique;
        public Subscription upstream;

        public b(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, boolean z) {
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

    public z3(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
