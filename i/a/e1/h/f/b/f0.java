package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDebounce.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f0<T, U> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<U>> f26945d;

    /* compiled from: FlowableDebounce.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicLong implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = 6725975399620862591L;
        public final i.a.e1.g.o<? super T, ? extends Publisher<U>> debounceSelector;
        public final AtomicReference<i.a.e1.d.f> debouncer;
        public boolean done;
        public final Subscriber<? super T> downstream;
        public volatile long index;
        public Subscription upstream;

        /* compiled from: FlowableDebounce.java */
        /* renamed from: i.a.e1.h.f.b.f0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0445a<T, U> extends i.a.e1.p.b<U> {
            public final a<T, U> c;

            /* renamed from: d  reason: collision with root package name */
            public final long f26946d;

            /* renamed from: e  reason: collision with root package name */
            public final T f26947e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f26948f;

            /* renamed from: g  reason: collision with root package name */
            public final AtomicBoolean f26949g;

            public C0445a(a<T, U> parent, long index, T value) {
            }

            public void d() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable t) {
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(U t) {
            }
        }

        public a(Subscriber<? super T> actual, i.a.e1.g.o<? super T, ? extends Publisher<U>> debounceSelector) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void emit(long idx, T value) {
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

    public f0(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Publisher<U>> debounceSelector) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
