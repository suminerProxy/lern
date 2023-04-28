package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWithLatestFromMany.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class y4<T, R> extends i.a.y0.e.b.a<T, R> {
    @i.a.t0.g

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<?>[] f28598d;
    @i.a.t0.g

    /* renamed from: e  reason: collision with root package name */
    public final Iterable<? extends Publisher<?>> f28599e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.x0.o<? super Object[], R> f28600f;

    /* compiled from: FlowableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a implements i.a.x0.o<T, R> {
        public final /* synthetic */ y4 b;

        public a(y4 y4Var) {
        }

        @Override // i.a.x0.o
        public R apply(T t) throws Exception {
        }
    }

    /* compiled from: FlowableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.y0.c.a<T>, Subscription {
        private static final long serialVersionUID = 1577321883966341961L;
        public final i.a.x0.o<? super Object[], R> combiner;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final i.a.y0.j.c error;
        public final AtomicLong requested;
        public final c[] subscribers;
        public final AtomicReference<Subscription> upstream;
        public final AtomicReferenceArray<Object> values;

        public b(Subscriber<? super R> subscriber, i.a.x0.o<? super Object[], R> oVar, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAllBut(int i2) {
        }

        public void innerComplete(int i2, boolean z) {
        }

        public void innerError(int i2, Throwable th) {
        }

        public void innerNext(int i2, Object obj) {
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

        public void subscribe(Publisher<?>[] publisherArr, int i2) {
        }

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: FlowableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends AtomicReference<Subscription> implements i.a.q<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        public boolean hasValue;
        public final int index;
        public final b<?, ?> parent;

        public c(b<?, ?> bVar, int i2) {
        }

        public void dispose() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public y4(@i.a.t0.f i.a.l<T> lVar, @i.a.t0.f Publisher<?>[] publisherArr, i.a.x0.o<? super Object[], R> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }

    public y4(@i.a.t0.f i.a.l<T> lVar, @i.a.t0.f Iterable<? extends Publisher<?>> iterable, @i.a.t0.f i.a.x0.o<? super Object[], R> oVar) {
    }
}
