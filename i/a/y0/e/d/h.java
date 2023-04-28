package i.a.y0.e.d;

import i.a.n0;
import i.a.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSwitchMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h<T, R> extends i.a.l<R> {
    public final i.a.l<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends q0<? extends R>> f28680d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28681e;

    /* compiled from: FlowableSwitchMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.q<T>, Subscription {
        public static final C0561a<Object> INNER_DISPOSED = null;
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public long emitted;
        public final i.a.y0.j.c errors;
        public final AtomicReference<C0561a<R>> inner;
        public final i.a.x0.o<? super T, ? extends q0<? extends R>> mapper;
        public final AtomicLong requested;
        public Subscription upstream;

        /* compiled from: FlowableSwitchMapSingle.java */
        /* renamed from: i.a.y0.e.d.h$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0561a<R> extends AtomicReference<i.a.u0.c> implements n0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public volatile R item;
            public final a<?, R> parent;

            public C0561a(a<?, R> aVar) {
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

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void disposeInner() {
        }

        public void drain() {
        }

        public void innerError(C0561a<R> c0561a, Throwable th) {
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

    public h(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends q0<? extends R>> oVar, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
