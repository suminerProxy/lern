package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e1<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> f28263d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28264e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28265f;

    /* compiled from: FlowableFlatMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final Subscriber<? super R> downstream;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<i.a.y0.f.c<R>> queue;
        public final AtomicLong requested;
        public final i.a.u0.b set;
        public Subscription upstream;

        /* compiled from: FlowableFlatMapSingle.java */
        /* renamed from: i.a.y0.e.b.e1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0534a extends AtomicReference<i.a.u0.c> implements i.a.n0<R>, i.a.u0.c {
            private static final long serialVersionUID = -502562646270949838L;
            public final /* synthetic */ a this$0;

            public C0534a(a aVar) {
            }

            @Override // i.a.u0.c
            public void dispose() {
            }

            @Override // i.a.u0.c
            public boolean isDisposed() {
            }

            @Override // i.a.n0
            public void onError(Throwable th) {
            }

            @Override // i.a.n0
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.n0
            public void onSuccess(R r) {
            }
        }

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> oVar, boolean z, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void clear() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.y0.f.c<R> getOrCreateQueue() {
        }

        public void innerError(a<T, R>.C0534a c0534a, Throwable th) {
        }

        public void innerSuccess(a<T, R>.C0534a c0534a, R r) {
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

    public e1(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> oVar, boolean z, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
