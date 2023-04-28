package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMapEager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> f28573d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28574e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28575f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.y0.j.j f28576g;

    /* compiled from: FlowableConcatMapEager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.q<T>, Subscription, i.a.y0.h.l<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        public volatile boolean cancelled;
        public volatile i.a.y0.h.k<R> current;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final i.a.y0.j.j errorMode;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final int maxConcurrency;
        public final int prefetch;
        public final AtomicLong requested;
        public final i.a.y0.f.c<i.a.y0.h.k<R>> subscribers;
        public Subscription upstream;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, int i3, i.a.y0.j.j jVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        @Override // i.a.y0.h.l
        public void drain() {
        }

        public void drainAndCancel() {
        }

        @Override // i.a.y0.h.l
        public void innerComplete(i.a.y0.h.k<R> kVar) {
        }

        @Override // i.a.y0.h.l
        public void innerError(i.a.y0.h.k<R> kVar, Throwable th) {
        }

        @Override // i.a.y0.h.l
        public void innerNext(i.a.y0.h.k<R> kVar, R r) {
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

    public x(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar, int i2, int i3, i.a.y0.j.j jVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
