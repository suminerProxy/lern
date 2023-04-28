package i.a.y0.e.d;

import i.a.n0;
import i.a.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e<T, R> extends i.a.l<R> {
    public final i.a.l<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends q0<? extends R>> f28668d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.y0.j.j f28669e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28670f;

    /* compiled from: FlowableConcatMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.q<T>, Subscription {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public long emitted;
        public final i.a.y0.j.j errorMode;
        public final i.a.y0.j.c errors;
        public final C0558a<R> inner;
        public R item;
        public final i.a.x0.o<? super T, ? extends q0<? extends R>> mapper;
        public final int prefetch;
        public final i.a.y0.c.n<T> queue;
        public final AtomicLong requested;
        public volatile int state;
        public Subscription upstream;

        /* compiled from: FlowableConcatMapSingle.java */
        /* renamed from: i.a.y0.e.d.e$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0558a<R> extends AtomicReference<i.a.u0.c> implements n0<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final a<?, R> parent;

            public C0558a(a<?, R> aVar) {
            }

            public void dispose() {
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

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, int i2, i.a.y0.j.j jVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
        }

        public void innerError(Throwable th) {
        }

        public void innerSuccess(R r) {
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

    public e(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, i.a.y0.j.j jVar, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
