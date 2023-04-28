package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> f27183d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27184e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.h.k.j f27185f;

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27186a = null;
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class b<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, f<R>, Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        public volatile boolean active;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final i.a.e1.h.k.c errors;
        public final e<R> inner;
        public final int limit;
        public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final int prefetch;
        public i.a.e1.h.c.q<T> queue;
        public int sourceMode;
        public Subscription upstream;

        public b(i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch) {
        }

        public abstract void drain();

        @Override // i.a.e1.h.f.b.v.f
        public final void innerComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public final void onSubscribe(Subscription s) {
        }

        public abstract void subscribeActual();
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        public final Subscriber<? super R> downstream;
        public final boolean veryEnd;

        public c(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, boolean veryEnd) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.f.b.v.b
        public void drain() {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerError(Throwable e2) {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerNext(R value) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.f.b.v.b
        public void subscribeActual() {
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        public final Subscriber<? super R> downstream;
        public final AtomicInteger wip;

        public d(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.f.b.v.b
        public void drain() {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerError(Throwable e2) {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerNext(R value) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.f.b.v.b
        public void subscribeActual() {
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e<R> extends i.a.e1.h.j.i implements i.a.e1.c.x<R> {
        private static final long serialVersionUID = 897683679971470653L;
        public final f<R> parent;
        public long produced;

        public e(f<R> parent) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface f<T> {
        void innerComplete();

        void innerError(Throwable e2);

        void innerNext(T value);
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class g<T> implements Subscription {
        public final Subscriber<? super T> b;
        public final T c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27187d;

        public g(T value, Subscriber<? super T> downstream) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public v(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, i.a.e1.h.k.j errorMode) {
    }

    public static <T, R> Subscriber<T> e9(Subscriber<? super R> s, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, i.a.e1.h.k.j errorMode) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
