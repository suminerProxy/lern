package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDebounce.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g0<T, U> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<U>> f28279d;

    /* compiled from: FlowableDebounce.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends AtomicLong implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = 6725975399620862591L;
        public final i.a.x0.o<? super T, ? extends Publisher<U>> debounceSelector;
        public final AtomicReference<i.a.u0.c> debouncer;
        public boolean done;
        public final Subscriber<? super T> downstream;
        public volatile long index;
        public Subscription upstream;

        /* compiled from: FlowableDebounce.java */
        /* renamed from: i.a.y0.e.b.g0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0537a<T, U> extends i.a.h1.b<U> {
            public final a<T, U> c;

            /* renamed from: d  reason: collision with root package name */
            public final long f28280d;

            /* renamed from: e  reason: collision with root package name */
            public final T f28281e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f28282f;

            /* renamed from: g  reason: collision with root package name */
            public final AtomicBoolean f28283g;

            public C0537a(a<T, U> aVar, long j2, T t) {
            }

            public void d() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(U u) {
            }
        }

        public a(Subscriber<? super T> subscriber, i.a.x0.o<? super T, ? extends Publisher<U>> oVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void emit(long j2, T t) {
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

    public g0(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends Publisher<U>> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
