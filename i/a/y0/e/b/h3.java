package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSamplePublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h3<T> extends i.a.l<T> {
    public final Publisher<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<?> f28295d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28296e;

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public volatile boolean done;
        public final AtomicInteger wip;

        public a(Subscriber<? super T> subscriber, Publisher<?> publisher) {
        }

        @Override // i.a.y0.e.b.h3.c
        public void completeMain() {
        }

        @Override // i.a.y0.e.b.h3.c
        public void completeOther() {
        }

        @Override // i.a.y0.e.b.h3.c
        public void run() {
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b(Subscriber<? super T> subscriber, Publisher<?> publisher) {
        }

        @Override // i.a.y0.e.b.h3.c
        public void completeMain() {
        }

        @Override // i.a.y0.e.b.h3.c
        public void completeOther() {
        }

        @Override // i.a.y0.e.b.h3.c
        public void run() {
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -3517602651313910099L;
        public final Subscriber<? super T> downstream;
        public final AtomicReference<Subscription> other;
        public final AtomicLong requested;
        public final Publisher<?> sampler;
        public Subscription upstream;

        public c(Subscriber<? super T> subscriber, Publisher<?> publisher) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void complete() {
        }

        public abstract void completeMain();

        public abstract void completeOther();

        public void emit() {
        }

        public void error(Throwable th) {
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

        public abstract void run();

        public void setOther(Subscription subscription) {
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> implements i.a.q<Object> {
        public final c<T> b;

        public d(c<T> cVar) {
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

    public h3(Publisher<T> publisher, Publisher<?> publisher2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
