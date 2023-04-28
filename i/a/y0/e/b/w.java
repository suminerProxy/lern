package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class w<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> f28554d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28555e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.y0.j.j f28556f;

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28557a = null;
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class b<T, R> extends AtomicInteger implements i.a.q<T>, f<R>, Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        public volatile boolean active;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final i.a.y0.j.c errors;
        public final e<R> inner;
        public final int limit;
        public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final int prefetch;
        public i.a.y0.c.o<T> queue;
        public int sourceMode;
        public Subscription upstream;

        public b(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2) {
        }

        public abstract void drain();

        @Override // i.a.y0.e.b.w.f
        public final void innerComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // i.a.q
        public final void onSubscribe(Subscription subscription) {
        }

        public abstract void subscribeActual();
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        public final Subscriber<? super R> downstream;
        public final boolean veryEnd;

        public c(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.e.b.w.b
        public void drain() {
        }

        @Override // i.a.y0.e.b.w.f
        public void innerError(Throwable th) {
        }

        @Override // i.a.y0.e.b.w.f
        public void innerNext(R r) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.e.b.w.b
        public void subscribeActual() {
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        public final Subscriber<? super R> downstream;
        public final AtomicInteger wip;

        public d(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.e.b.w.b
        public void drain() {
        }

        @Override // i.a.y0.e.b.w.f
        public void innerError(Throwable th) {
        }

        @Override // i.a.y0.e.b.w.f
        public void innerNext(R r) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.e.b.w.b
        public void subscribeActual() {
        }
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e<R> extends i.a.y0.i.i implements i.a.q<R> {
        private static final long serialVersionUID = 897683679971470653L;
        public final f<R> parent;
        public long produced;

        public e(f<R> fVar) {
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

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface f<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t);
    }

    /* compiled from: FlowableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class g<T> implements Subscription {
        public final Subscriber<? super T> b;
        public final T c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28558d;

        public g(T t, Subscriber<? super T> subscriber) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public w(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, i.a.y0.j.j jVar) {
    }

    public static <T, R> Subscriber<T> I8(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, i.a.y0.j.j jVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
